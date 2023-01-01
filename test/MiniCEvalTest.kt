import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import java.util.Vector

class MiniCEvalTest {

    private val eval = MiniCEval()
    private lateinit var parser : MiniCParser

    @AfterEach
    fun tearDown() {
        eval.purgeAllMemory()
    }

    @Test
    fun visitSimpleDeclaration() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("int a; double b;"))))
        eval.visit(parser.program())
        val test = Vector<HashMap<String,String>>()
        test.add(HashMap())
        test[0]["a"] = "int"
        test[0]["b"] = "double"
        assertEquals(eval.getUndefinedVarBlock(),test)
    }

    @Test
    fun visitAssignDeclaration() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("int a=9.7; double b=9.7;"))))
        eval.visit(parser.program())
        val test = Vector<HashMap<String,Number>>()
        test.add(HashMap())
        test[0]["a"] = 9
        test[0]["b"] = 9.7
        assertEquals(eval.getMemoryBlock(),test)
    }

    @Test
    fun visitBlockStatement() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("int a; {int b=7; a=b}"))))
        val test = Vector<HashMap<String,Number>>()
        test.add(HashMap())
        test[0]["a"] = 7
        eval.visit(parser.program())
        assertEquals(eval.getMemoryBlock(),test)
    }

    @Test
    fun visitIfStatement() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("int a; int b; int c;if(true){a=1;} if(false){b=7;c=8;} else{b=3;c=5;}"))))
        val test = Vector<HashMap<String,Number>>()
        test.add(HashMap())
        test[0]["a"] = 1
        test[0]["b"] = 3
        test[0]["c"] = 5
        eval.visit(parser.program())
        assertEquals(eval.getMemoryBlock(),test)
    }

    @Test
    fun visitWhileStatement() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("int a=10; while(a!=0){a=a-1}"))))
        val test = Vector<HashMap<String,Number>>()
        test.add(HashMap())
        test[0]["a"] = 0
        eval.visit(parser.program())
        assertEquals(eval.getMemoryBlock(),test)
    }

    fun getMemoryBlock() {
        eval.insertInMemoryAtCurrentLevel("a",1)
        eval.insertInMemoryAtCurrentLevel("b",2.0)
        eval.insertInMemoryAtNextLevel("c",3)
        eval.insertInMemoryAtNextLevel("d",5.8)
        val test = Vector<HashMap<String,Number>>()
        test.add(HashMap())
        test[0]["a"] = 1
        test[0]["b"] = 2.0
        test.add(HashMap())
        test[1]["c"] = 3
        test[1]["d"] = 5.8
        assertEquals(eval.getMemoryBlock(),test)
    }

    @Test
    fun getUndefinedVarBlock() {
        eval.insertInUndefinedAtCurrentLevel("a","int")
        eval.insertInUndefinedAtCurrentLevel("b","float")
        eval.insertInUndefinedAtNextLevel("c","int")
        eval.insertInUndefinedAtNextLevel("d","float")
        var test = Vector<HashMap<String,String>>()
        test.add(HashMap())
        test[0]["a"] = "int"
        test[0]["b"] = "float"
        test.add(HashMap())
        test[1]["c"] = "int"
        test[1]["d"] = "float"
        test.add(HashMap())
        assertEquals(eval.getUndefinedVarBlock(),test)
    }

    @Test
    fun visitAssign() {
        eval.insertInUndefinedAtCurrentLevel("a","int")
        eval.insertInUndefinedAtCurrentLevel("b","float")
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a=0"))))
        assertEquals(eval.visitAssign(parser.assign()),0.0)
        assertEquals(eval.getMemoryBlock()[0]["a"],0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a=33.6"))))
        assertEquals(eval.visitAssign(parser.assign()),33.6)
        assertEquals(eval.getMemoryBlock()[0]["a"],33)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("b=33.6"))))
        assertEquals(eval.visitAssign(parser.assign()),33.6)
        assertEquals(eval.getMemoryBlock()[0]["b"],33.6)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a=-1"))))
        assertEquals(eval.visitAssign(parser.assign()),-1.0)
        assertEquals(eval.getMemoryBlock()[0]["a"],-1)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a=-33.6"))))
        assertEquals(eval.visitAssign(parser.assign()),-33.6)
        assertEquals(eval.getMemoryBlock()[0]["a"],-33)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("b=-33.6"))))
        assertEquals(eval.visitAssign(parser.assign()),-33.6)
        assertEquals(eval.getMemoryBlock()[0]["b"],-33.6)
    }

    @Test
    fun visitExpression() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("0 || 5"))))
        assertEquals(eval.visitExpression(parser.expression()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("0 || 0"))))
        assertEquals(eval.visitExpression(parser.expression()),0.0)
        eval.insertInMemoryAtCurrentLevel("a",5)
        eval.insertInMemoryAtCurrentLevel("b",1)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a || b"))))
        assertEquals(eval.visitExpression(parser.expression()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("0 || a"))))
        assertEquals(eval.visitExpression(parser.expression()),1.0)

    }

    @Test
    fun visitE1() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("1 && 5"))))
        assertEquals(eval.visitE1(parser.e1()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("0 && 5"))))
        assertEquals(eval.visitE1(parser.e1()),0.0)
        eval.insertInMemoryAtCurrentLevel("a",5)
        eval.insertInMemoryAtCurrentLevel("b",1)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a && b"))))
        assertEquals(eval.visitE1(parser.e1()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("0 && a"))))
        assertEquals(eval.visitE1(parser.e1()),0.0)

    }

    @Test
    fun visitE2() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("1<5"))))
        assertEquals(eval.visitE2(parser.e2()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5<=5"))))
        assertEquals(eval.visitE2(parser.e2()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5<1"))))
        assertEquals(eval.visitE2(parser.e2()),0.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5<=1"))))
        assertEquals(eval.visitE2(parser.e2()),0.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("1>5"))))
        assertEquals(eval.visitE2(parser.e2()),0.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5>=5"))))
        assertEquals(eval.visitE2(parser.e2()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5>1"))))
        assertEquals(eval.visitE2(parser.e2()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5>=1"))))
        assertEquals(eval.visitE2(parser.e2()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("1==5"))))
        assertEquals(eval.visitE2(parser.e2()),0.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5==5"))))
        assertEquals(eval.visitE2(parser.e2()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5!=1"))))
        assertEquals(eval.visitE2(parser.e2()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5!=5"))))
        assertEquals(eval.visitE2(parser.e2()),0.0)
        eval.insertInMemoryAtCurrentLevel("a",5)
        eval.insertInMemoryAtCurrentLevel("b",1)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("b<a"))))
        assertEquals(eval.visitE2(parser.e2()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a<=a"))))
        assertEquals(eval.visitE2(parser.e2()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a<b"))))
        assertEquals(eval.visitE2(parser.e2()),0.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a<=b"))))
        assertEquals(eval.visitE2(parser.e2()),0.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("b>a"))))
        assertEquals(eval.visitE2(parser.e2()),0.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a>=a"))))
        assertEquals(eval.visitE2(parser.e2()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a>b"))))
        assertEquals(eval.visitE2(parser.e2()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a>=b"))))
        assertEquals(eval.visitE2(parser.e2()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("b==a"))))
        assertEquals(eval.visitE2(parser.e2()),0.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a==a"))))
        assertEquals(eval.visitE2(parser.e2()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a!=b"))))
        assertEquals(eval.visitE2(parser.e2()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a!=a"))))
        assertEquals(eval.visitE2(parser.e2()),0.0)

    }

    @Test
    fun visitE3() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5+5"))))
        assertEquals(eval.visitE3(parser.e3()),10.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5-5"))))
        assertEquals(eval.visitE3(parser.e3()),0.0)
        eval.insertInMemoryAtCurrentLevel("a",5)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a+a"))))
        assertEquals(eval.visitE3(parser.e3()),10.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a-a"))))
        assertEquals(eval.visitE3(parser.e3()),0.0)

    }

    @Test
    fun visitE4() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5*5"))))
        assertEquals(eval.visitE4(parser.e4()),25.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5/5"))))
        assertEquals(eval.visitE4(parser.e4()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("5%5"))))
        assertEquals(eval.visitE4(parser.e4()),0.0)
        eval.insertInMemoryAtCurrentLevel("a",5)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a*a"))))
        assertEquals(eval.visitE4(parser.e4()),25.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a/a"))))
        assertEquals(eval.visitE4(parser.e4()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a%a"))))
        assertEquals(eval.visitE4(parser.e4()),0.0)


    }

    @Test
    fun visitE5() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("1"))))
        assertEquals(eval.visitE5(parser.e5()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("!1"))))
        assertEquals(eval.visitE5(parser.e5()),0.0)
        eval.insertInMemoryAtCurrentLevel("a",1)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a"))))
        assertEquals(eval.visitE5(parser.e5()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("!a"))))
        assertEquals(eval.visitE5(parser.e5()),0.0)

    }

    @Test
    fun visitE6() {
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("1"))))
        assertEquals(eval.visitE6(parser.e6()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("true"))))
        assertEquals(eval.visitE6(parser.e6()),1.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("false"))))
        assertEquals(eval.visitE6(parser.e6()),0.0)
        eval.insertInMemoryAtCurrentLevel("a",33)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("a"))))
        assertEquals(eval.visitE6(parser.e6()),33.0)
        parser = MiniCParser(CommonTokenStream(MiniCLexer(CharStreams.fromString("(a)"))))
        assertEquals(eval.visitE6(parser.e6()),33.0)

    }
}