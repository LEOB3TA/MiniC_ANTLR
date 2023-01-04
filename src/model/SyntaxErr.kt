package model

import org.antlr.v4.kotlinruntime.RecognitionException
import org.antlr.v4.kotlinruntime.Recognizer


class SyntaxErr internal constructor(
    val recognizer: Recognizer<*, *>,
    val offendingSymbol: Any?,
    val line: Int,
    val charPositionInLine: Int,
    val message: String,
    e: RecognitionException
) {
    private val e: RecognitionException

    init {
        this.e = e
    }

    val exception: RecognitionException
        get() = e
}