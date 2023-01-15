package controller

import javafx.beans.property.SimpleStringProperty
import model.*
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.antlr.v4.kotlinruntime.tree.Trees
import org.antlr.v4.kotlinruntime.tree.*
import java.io.File

class MiniCController  {

    var inputText = SimpleStringProperty("")
    var outputText = SimpleStringProperty("")

    private val parserListener = ErrorListener()
    private val lexerListener = ErrorListener()

     fun evaluate() {
         if(check()) {
             val charStream = CharStreams.fromString(inputText.value)
             val miniCLexer = MiniCLexer(charStream)
             val miniCParser = MiniCParser(CommonTokenStream(miniCLexer))
             val miniCEval = MiniCEval(System.out,System.`in`)
             try {
                 miniCEval.visit(miniCParser.program())
             } catch (e : DoubleDeclarationException){
                 outputText.value=e.message
                 return
             } catch (e: UndefinedVariableException){
                 outputText.value=e.message
                 return
             }catch (e : ArithmeticException){
                 outputText.value=e.message
                 return
             }
          //   outputText.value = miniCEval.getResult()
         }
    }

     fun check() : Boolean{
         val result : Boolean
         val charStream = CharStreams.fromString(inputText.value)
         val miniCLexer = MiniCLexer(charStream)
         val miniCParser = MiniCParser(CommonTokenStream(miniCLexer))
         miniCLexer.addErrorListener(lexerListener)
         miniCParser.addErrorListener(parserListener)
         miniCParser.program()
         if(lexerListener.getSyntaxErrors().isNotEmpty()){
             result=false
             var errorString = "Lexer errors:\n"
             lexerListener.getSyntaxErrors().forEach{errorString+=(it.message + " line: "+ it.line + " position: "+ it.charPositionInLine + "\n") }
             outputText.value+=errorString
         }
         else if(parserListener.getSyntaxErrors().isNotEmpty()){
             result=false
             var errorString = "Parser errors:\n"
             parserListener.getSyntaxErrors().forEach{ errorString+=(it.message + " line: "+ it.line + " position: "+ it.charPositionInLine + "\n") }
             outputText.value+=errorString
         }
         else{
             outputText.value="ready for evaluation..."
             result=true
         }
         lexerListener.clearSyntaxErrors()
         parserListener.clearSyntaxErrors()
         return result
    }


    fun printParseTree(){
        if(check()){
            val charStream = CharStreams.fromString(inputText.value)
            val miniCLexer = MiniCLexer(charStream)
            val miniCTokenStream = CommonTokenStream(miniCLexer)
            val miniCParser = MiniCParser(miniCTokenStream)
            outputText.value= format(miniCParser,1,miniCParser.program())
        }

    }

    private fun format(parser: MiniCParser, indent: Int = 0, tree: ParseTree): String = buildString {
        if(tree.text == ";" || tree.text == "(" || tree.text == ")" || tree.text == "{" || tree.text == "}"){
            return@buildString
        }
        var prefix = "     ".repeat(indent)
        if(Trees.getNodeText(tree, parser).matches("e[1-6]".toRegex())){
            for (i in 0 until tree.childCount) {
                append(format(parser, indent, tree.getChild(i)!!))
            }
        }
        else {
            append(Trees.getNodeText(tree, parser))
            if(Trees.getNodeText(tree, parser) == "expression"){
                prefix= "$prefix          "
            }
            if (tree.childCount != 0) {
                prefix=prefix.repeat(2)
                append("\n$prefix|\n$prefix|\n$prefix|\n$prefix|__")
                for (i in 0 until tree.childCount) {
                    append(format(parser, indent + 1, tree.getChild(i)!!))
                    append(" ")
                }
                append("\n")
            }
        }
    }
}