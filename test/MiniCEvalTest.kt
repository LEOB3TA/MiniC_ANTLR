

import model.*
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.io.OutputStream
import java.util.*

class MiniCEvalTest {

    private val eval = MiniCEval(System.out,System.`in`)
    private lateinit var parser: MiniCParser

    @AfterEach
    fun tearDown() {
        eval.purgeAllMemory()
    }

    @Test
    fun testExceptions() {
        assertThrows<UndefinedVariableException> {
            parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a=1;"))))
            eval.visit(parser.program())
        }
        assertThrows<DoubleDeclarationException> {
            parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("int a; double a;"))))
            eval.visit(parser.program())
        }
        assertThrows<ArithmeticException> {
            parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("int c=1/0;"))))
            eval.visit(parser.program())
        }
    }

    @Test
    fun visitSimpleDeclaration() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("int a; double b;"))))
        eval.visit(parser.program())
        val test = Vector<HashMap<String, String>>()
        test.add(HashMap())
        test[0]["a"] = "int"
        test[0]["b"] = "double"
        assertEquals(test, eval.getUndefinedVarBlock())
    }

    @Test
    fun visitAssignDeclaration() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("int a=9.7; double b=9.7;"))))
        eval.visit(parser.program())
        val test = Vector<HashMap<String, Number>>()
        test.add(HashMap())
        test[0]["a"] = 9
        test[0]["b"] = 9.7
        assertEquals(test, eval.getMemoryBlock())
    }

    @Test
    fun visitBlockStatement() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("int a; {int b=7; a=b;} int c=8;"))))
        val test = Vector<HashMap<String, Number>>()
        test.add(HashMap())
        test[0]["a"] = 7
        test[0]["c"] = 8
        eval.visit(parser.program())
        assertEquals(test, eval.getMemoryBlock())
        test.add(HashMap())
        test[1]["b"] = 7
        assertNotEquals(test, eval.getMemoryBlock())
    }

    @Test
    fun visitPrintfStatement(){
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("int a=printf(\"prova\");"))))
        val test = Vector<HashMap<String, Number>>()
        test.add(HashMap())
        test[0]["a"] = 5
        eval.visit(parser.program())
        assertEquals(test, eval.getMemoryBlock())
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a=printf(\"prova %d\",7);"))))
        test[0]["a"] = 7
        eval.visit(parser.program())
        assertEquals(test, eval.getMemoryBlock())
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a=printf(\"prova %f\",7);"))))
        test[0]["a"] = 7
        eval.visit(parser.program())
        assertEquals(test, eval.getMemoryBlock())
    }

    @Test
    fun visitIfStatement() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("int a; int b; int c;if(true){a=1;} if(false){b=7;c=8;} else{b=3;c=5;}"))))
        val test = Vector<HashMap<String, Number>>()
        test.add(HashMap())
        test[0]["a"] = 1
        test[0]["b"] = 3
        test[0]["c"] = 5
        eval.visit(parser.program())
        assertEquals(test, eval.getMemoryBlock())
    }

    @Test
    fun visitWhileStatement() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("int a=10; while(a!=0){a=a-1}"))))
        val test = Vector<HashMap<String, Number>>()
        test.add(HashMap())
        test[0]["a"] = 0
        eval.visit(parser.program())
        assertEquals(test, eval.getMemoryBlock())
    }

    @Test
    fun getMemoryBlock() {
        eval.insertInMemoryAtCurrentLevel("a", 1)
        eval.insertInMemoryAtCurrentLevel("b", 2.0)
        eval.insertInMemoryAtNextLevel("c", 3)
        eval.insertInMemoryAtNextLevel("d", 5.8)
        val test = Vector<HashMap<String, Number>>()
        test.add(HashMap())
        test[0]["a"] = 1
        test[0]["b"] = 2.0
        test.add(HashMap())
        test[1]["c"] = 3
        test[1]["d"] = 5.8
        assertEquals(test, eval.getMemoryBlock())
    }

    @Test
    fun getUndefinedVarBlock() {
        eval.insertInUndefinedAtCurrentLevel("a", "int")
        eval.insertInUndefinedAtCurrentLevel("b", "float")
        eval.insertInUndefinedAtNextLevel("c", "int")
        eval.insertInUndefinedAtNextLevel("d", "float")
        val test = Vector<HashMap<String, String>>()
        test.add(HashMap())
        test[0]["a"] = "int"
        test[0]["b"] = "float"
        test.add(HashMap())
        test[1]["c"] = "int"
        test[1]["d"] = "float"
        test.add(HashMap())
        assertEquals(test, eval.getUndefinedVarBlock())
    }

    @Test
    fun visitAssign() {
        eval.insertInUndefinedAtCurrentLevel("a", "int")
        eval.insertInUndefinedAtCurrentLevel("b", "float")
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a=0"))))
        assertEquals(0.0, eval.visitAssign(parser.assign()))
        assertEquals(0, eval.getMemoryBlock()[0]["a"])
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a=33.6"))))
        assertEquals(33.6, eval.visitAssign(parser.assign()))
        assertEquals(33, eval.getMemoryBlock()[0]["a"])
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("b=33.6"))))
        assertEquals(33.6, eval.visitAssign(parser.assign()))
        assertEquals(33.6, eval.getMemoryBlock()[0]["b"])
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a=-1"))))
        assertEquals(-1.0, eval.visitAssign(parser.assign()))
        assertEquals(-1, eval.getMemoryBlock()[0]["a"])
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a=-33.6"))))
        assertEquals(-33.6, eval.visitAssign(parser.assign()))
        assertEquals(-33, eval.getMemoryBlock()[0]["a"])
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("b=-33.6"))))
        assertEquals(-33.6, eval.visitAssign(parser.assign()))
        assertEquals(-33.6, eval.getMemoryBlock()[0]["b"])
    }

    @Test
    fun visitExpression() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("0 || 5"))))
        assertEquals(1.0, eval.visitExpression(parser.expression()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("0 || 0"))))
        assertEquals(0.0, eval.visitExpression(parser.expression()))
        eval.insertInMemoryAtCurrentLevel("a", 5)
        eval.insertInMemoryAtCurrentLevel("b", 1)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a || b"))))
        assertEquals(1.0, eval.visitExpression(parser.expression()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("0 || a"))))
        assertEquals(1.0, eval.visitExpression(parser.expression()))

    }

    @Test
    fun visitE1() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("1 && 5"))))
        assertEquals(1.0, eval.visitE1(parser.e1()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("0 && 5"))))
        assertEquals(0.0, eval.visitE1(parser.e1()))
        eval.insertInMemoryAtCurrentLevel("a", 5)
        eval.insertInMemoryAtCurrentLevel("b", 1)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a && b"))))
        assertEquals(1.0, eval.visitE1(parser.e1()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("0 && a"))))
        assertEquals(0.0, eval.visitE1(parser.e1()))

    }

    @Test
    fun visitE2() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("1<5"))))
        assertEquals(1.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5<=5"))))
        assertEquals(1.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5<1"))))
        assertEquals(0.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5<=1"))))
        assertEquals(0.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("1>5"))))
        assertEquals(0.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5>=5"))))
        assertEquals(1.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5>1"))))
        assertEquals(1.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5>=1"))))
        assertEquals(1.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("1==5"))))
        assertEquals(0.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5==5"))))
        assertEquals(1.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5!=1"))))
        assertEquals(1.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5!=5"))))
        assertEquals(0.0, eval.visitE2(parser.e2()))
        eval.insertInMemoryAtCurrentLevel("a", 5)
        eval.insertInMemoryAtCurrentLevel("b", 1)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("b<a"))))
        assertEquals(1.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a<=a"))))
        assertEquals(1.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a<b"))))
        assertEquals(0.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a<=b"))))
        assertEquals(0.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("b>a"))))
        assertEquals(0.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a>=a"))))
        assertEquals(1.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a>b"))))
        assertEquals(1.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a>=b"))))
        assertEquals(1.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("b==a"))))
        assertEquals(0.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a==a"))))
        assertEquals(1.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a!=b"))))
        assertEquals(1.0, eval.visitE2(parser.e2()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a!=a"))))
        assertEquals(0.0, eval.visitE2(parser.e2()))

    }

    @Test
    fun visitE3() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5+5"))))
        assertEquals(10.0, eval.visitE3(parser.e3()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5-5"))))
        assertEquals(0.0, eval.visitE3(parser.e3()))
        eval.insertInMemoryAtCurrentLevel("a", 5)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a+a"))))
        assertEquals(10.0, eval.visitE3(parser.e3()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a-a"))))
        assertEquals(0.0, eval.visitE3(parser.e3()))

    }

    @Test
    fun visitE4() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5*5"))))
        assertEquals(25.0, eval.visitE4(parser.e4()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5/5"))))
        assertEquals(1.0, eval.visitE4(parser.e4()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5%5"))))
        assertEquals(0.0, eval.visitE4(parser.e4()))
        eval.insertInMemoryAtCurrentLevel("a", 5)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a*a"))))
        assertEquals(25.0, eval.visitE4(parser.e4()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a/a"))))
        assertEquals(1.0, eval.visitE4(parser.e4()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a%a"))))
        assertEquals(0.0, eval.visitE4(parser.e4()))


    }

    @Test
    fun visitE5() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("1"))))
        assertEquals(1.0, eval.visitE5(parser.e5()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("!1"))))
        assertEquals(0.0, eval.visitE5(parser.e5()))
        eval.insertInMemoryAtCurrentLevel("a", 1)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a"))))
        assertEquals(1.0, eval.visitE5(parser.e5()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("!a"))))
        assertEquals(0.0, eval.visitE5(parser.e5()))

    }

    @Test
    fun visitE6() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("1"))))
        assertEquals(1.0, eval.visitE6(parser.e6()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("true"))))
        assertEquals(1.0, eval.visitE6(parser.e6()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("false"))))
        assertEquals(0.0, eval.visitE6(parser.e6()))
        eval.insertInMemoryAtCurrentLevel("a", 33)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a"))))
        assertEquals(33.0, eval.visitE6(parser.e6()))
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("(a)"))))
        assertEquals(33.0, eval.visitE6(parser.e6()))

    }
}