import org.antlr.v4.kotlinruntime.CharStreams.fromStream
import org.antlr.v4.kotlinruntime.CommonTokenStream

fun main(){
    val inputStream = System.`in`
    val inputCharStream = fromStream(inputStream)
    val lexer = MiniCLexer(inputCharStream)
    val tokens = CommonTokenStream(lexer)
    val parser = MiniCParser(tokens)
    val tree = parser.program()
    val eval = MiniCEval()
    eval.visit(tree)
   println("memory ${eval.memory}")
    println("undefined var ${eval.undefinedVar}")
}