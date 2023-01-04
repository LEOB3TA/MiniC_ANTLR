package model

import org.antlr.v4.kotlinruntime.BaseErrorListener
import org.antlr.v4.kotlinruntime.RecognitionException
import org.antlr.v4.kotlinruntime.Recognizer
import org.antlr.v4.kotlinruntime.misc.Utils


class ErrorListener internal constructor() : BaseErrorListener() {
    private val syntaxErrors: MutableList<SyntaxErr> = ArrayList()
    fun getSyntaxErrors(): List<SyntaxErr> {
        return syntaxErrors
    }

    fun clearSyntaxErrors(){
        return syntaxErrors.clear()
    }

    override fun syntaxError(
        recognizer: Recognizer<*, *>,
        offendingSymbol: Any?,
        line: Int,
        charPositionInLine: Int,
        msg: String,
        e: RecognitionException?
    ) {
        e?.let { SyntaxErr(recognizer, offendingSymbol, line, charPositionInLine, msg, it) }
            ?.let { syntaxErrors.add(it) }
    }


    override fun toString(): String {
        return Utils.join(syntaxErrors.iterator(), "\n")
    }
}