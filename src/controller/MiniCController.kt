package controller

import javafx.beans.property.SimpleStringProperty
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import model.*
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.antlr.v4.kotlinruntime.tree.*
import kotlin.system.exitProcess

class MiniCController {

    var inputText = SimpleStringProperty("")

    val channel = Channel<Int>()

    private val parserListener: ErrorListener
    private val lexerListener: ErrorListener

    init {
        parserListener = ErrorListener()
        lexerListener = ErrorListener()
    }

    fun start() = GlobalScope.launch {
        while (true) {
            var choice = channel.receive()
            if (choice == 0) {
                this@MiniCController.eval()
            } else if (choice == 1) {
                if(this@MiniCController.chk()){
                    println("ready for evalutation...")
                }
            } else if (choice == 2) {
                this@MiniCController.print()
            } else if(choice ==3){
                this@MiniCController.dbg()
            } else {
                System.err.print("wrong identifier of a function")
                exitProcess(1)
            }
        }
    }

    fun debug(){
        GlobalScope.launch { channel.send(3) }
    }

    fun evaluate() {
        GlobalScope.launch { channel.send(0) }
    }

    fun check() {
        GlobalScope.launch { channel.send(1) }
    }

    fun printParseTree() {
        GlobalScope.launch { channel.send(2) }
    }

    private fun eval() {
        if (chk()) {
            val charStream = CharStreams.fromString(inputText.value)
            val miniCLexer = MiniCLexer(charStream)
            val miniCParser = MiniCParser(CommonTokenStream(miniCLexer))
            val miniCEval = MiniCEval(System.out, System.`in`)
            try {
                miniCEval.visit(miniCParser.program())
            } catch (e: DoubleDeclarationException) {
                println(e.message)
            } catch (e: UndefinedVariableException) {
                println(e.message)
            } catch (e: ArithmeticException) {
                println(e.message)
            } catch (e: MismatchedTypeException) {
                println(e.message)
            } catch (e: BadFormatException) {
                println(e.message)
            }
        }
    }

    private fun chk(): Boolean {
        val result: Boolean
        val charStream = CharStreams.fromString(inputText.value)
        val miniCLexer = MiniCLexer(charStream)
        val miniCParser = MiniCParser(CommonTokenStream(miniCLexer))
        miniCLexer.addErrorListener(lexerListener)
        miniCParser.addErrorListener(parserListener)
        miniCParser.program()
        if (lexerListener.getSyntaxErrors().isNotEmpty()) {
            result = false
            var errorString = "Lexer errors:\n"
            lexerListener.getSyntaxErrors()
                .forEach { errorString += (it.message + " line: " + it.line + " position: " + it.charPositionInLine + "\n") }
            println(errorString)
        } else if (parserListener.getSyntaxErrors().isNotEmpty()) {
            result = false
            var errorString = "Parser errors:\n"
            parserListener.getSyntaxErrors()
                .forEach { errorString += (it.message + " line: " + it.line + " position: " + it.charPositionInLine + "\n") }
            println(errorString)
        } else {
            result = true
        }
        lexerListener.clearSyntaxErrors()
        parserListener.clearSyntaxErrors()
        return result
    }


    private fun print() {
        if (chk()) {
            val charStream = CharStreams.fromString(inputText.value)
            val miniCLexer = MiniCLexer(charStream)
            val miniCTokenStream = CommonTokenStream(miniCLexer)
            val miniCParser = MiniCParser(miniCTokenStream)
            println(format(miniCParser, 1, miniCParser.program()))
        }

    }

    private fun format(parser: MiniCParser, indent: Int = 0, tree: ParseTree): String = buildString {
        if (tree.text == ";" || tree.text == "(" || tree.text == ")" || tree.text == "{" || tree.text == "}") {
            return@buildString
        }
        var prefix = "   ".repeat(indent)
        if (Trees.getNodeText(tree, parser).matches("e[1-6]".toRegex())) {
            for (i in 0 until tree.childCount) {
                append(format(parser, indent, tree.getChild(i)!!))
            }
        } else {
            append(Trees.getNodeText(tree, parser))
            if (Trees.getNodeText(tree, parser) == "expression") {
                prefix = "$prefix     "
            }
            if (tree.childCount != 0) {
                prefix = prefix.repeat(2)
                append("\n$prefix|\n$prefix|\n$prefix|\n$prefix|__")
                for (i in 0 until tree.childCount) {
                    append(format(parser, indent + 1, tree.getChild(i)!!))
                    append(" ")
                }
                append("\n")
            }
        }
    }

    private fun dbg() {
        if (chk()) {
            val charStream = CharStreams.fromString(inputText.value)
            val miniCLexer = MiniCLexer(charStream)
            val miniCParser = MiniCParser(CommonTokenStream(miniCLexer))
            val miniCEval = MiniCDebugEval(System.out, System.`in`)
            try {
                miniCEval.visit(miniCParser.program())
                println(miniCEval.getResult())
            } catch (e: DoubleDeclarationException) {
                println(e.message)
            } catch (e: UndefinedVariableException) {
                println(e.message)
            } catch (e: ArithmeticException) {
                println(e.message)
            } catch (e: MismatchedTypeException) {
                println(e.message)
            } catch (e: BadFormatException) {
                println(e.message)
            }
        }
    }
}