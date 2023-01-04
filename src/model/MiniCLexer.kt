package model// Generated from java-escape by ANTLR 4.7.1
import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.toCharArray
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.DFA

@Suppress("all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue")

class MiniCLexer(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "MiniC.g4"

    override val atn: ATN
		get() = ATN

	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES = Arrays.asList<String?>(null, null, "'if'", 
		                                                   "'else'", "'while'", 
		                                                   null, null, "' '", 
		                                                   null, null, null, "'*'", 
		                                                   "'/'", "'%'", "'+'", 
		                                                   "'-'", "'<'", "'<='", 
		                                                   "'>'", "'>='", "'=='", 
		                                                   "'!='", "'||'", "'&&'", 
		                                                   "'!'", "'='", "';'", 
		                                                   null, null, null, "'_'", 
		                                                   "'('", "')'", "'{'", 
		                                                   "'}'")
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "BOOL", "IF", 
		                                                    "ELSE", "WHILE", "TYPE", 
		                                                    "WS", "WORD_END", 
		                                                    "COMMENT", "LINE_COMMENT", 
		                                                    "ID", "TIMES", "DIVIDED", 
		                                                    "MODULE", "PLUS", 
		                                                    "MINUS", "MINOR", 
		                                                    "MINOREQUAL", "MAJOR", 
		                                                    "MAJOREQUAL", "ISEQUAL", 
		                                                    "ISNOTEQUAL", "OR", 
		                                                    "AND", "NOT", "EQUAL", 
		                                                    "ENDOFINSTRUCTION", 
		                                                    "NUMBER", "LETTER", 
		                                                    "DIGIT", "UNDERSCORE", 
		                                                    "RBRACKETOPEN", "RBRACKETCLOSE", 
		                                                    "CBRACKETOPEN", "CBRACKETCLOSE")

		val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u0024\u00db\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0005\u0002\u0051\u000a\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u006a\u000a\u0006\u0003\u0007\u0006\u0007\u006d\u000a\u0007\u000d\u0007\u000e\u0007\u006e\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0007\u0009\u0079\u000a\u0009\u000c\u0009\u000e\u0009\u007c\u000b\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0007\u000a\u0087\u000a\u000a\u000c\u000a\u000e\u000a\u008a\u000b\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0006\u000b\u0090\u000a\u000b\u000d\u000b\u000e\u000b\u0091\u0003\u000b\u0003\u000b\u0007\u000b\u0096\u000a\u000b\u000c\u000b\u000e\u000b\u0099\u000b\u000b\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001c\u0006\u001c\u00c2\u000a\u001c\u000d\u001c\u000e\u001c\u00c3\u0003\u001c\u0003\u001c\u0006\u001c\u00c8\u000a\u001c\u000d\u001c\u000e\u001c\u00c9\u0005\u001c\u00cc\u000a\u001c\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0021\u0003\u0021\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u007a\u0002\u0024\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u000d\u0008\u000f\u0009\u0011\u000a\u0013\u000b\u0015\u000c\u0017\u000d\u0019\u000e\u001b\u000f\u001d\u0010\u001f\u0011\u0021\u0012\u0023\u0013\u0025\u0014\u0027\u0015\u0029\u0016\u002b\u0017\u002d\u0018\u002f\u0019\u0031\u001a\u0033\u001b\u0035\u001c\u0037\u001d\u0039\u001e\u003b\u001f\u003d\u0020\u003f\u0021\u0041\u0022\u0043\u0023\u0045\u0024\u0003\u0002\u0006\u0005\u0002\u000b\u000c\u000f\u000f\u0022\u0022\u0004\u0002\u000c\u000c\u000f\u000f\u0004\u0002\u0043\u005c\u0063\u007c\u0003\u0002\u0032\u003b\u0002\u00e6\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\u000d\u0003\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0002\u0011\u0003\u0002\u0002\u0002\u0002\u0013\u0003\u0002\u0002\u0002\u0002\u0015\u0003\u0002\u0002\u0002\u0002\u0017\u0003\u0002\u0002\u0002\u0002\u0019\u0003\u0002\u0002\u0002\u0002\u001b\u0003\u0002\u0002\u0002\u0002\u001d\u0003\u0002\u0002\u0002\u0002\u001f\u0003\u0002\u0002\u0002\u0002\u0021\u0003\u0002\u0002\u0002\u0002\u0023\u0003\u0002\u0002\u0002\u0002\u0025\u0003\u0002\u0002\u0002\u0002\u0027\u0003\u0002\u0002\u0002\u0002\u0029\u0003\u0002\u0002\u0002\u0002\u002b\u0003\u0002\u0002\u0002\u0002\u002d\u0003\u0002\u0002\u0002\u0002\u002f\u0003\u0002\u0002\u0002\u0002\u0031\u0003\u0002\u0002\u0002\u0002\u0033\u0003\u0002\u0002\u0002\u0002\u0035\u0003\u0002\u0002\u0002\u0002\u0037\u0003\u0002\u0002\u0002\u0002\u0039\u0003\u0002\u0002\u0002\u0002\u003b\u0003\u0002\u0002\u0002\u0002\u003d\u0003\u0002\u0002\u0002\u0002\u003f\u0003\u0002\u0002\u0002\u0002\u0041\u0003\u0002\u0002\u0002\u0002\u0043\u0003\u0002\u0002\u0002\u0002\u0045\u0003\u0002\u0002\u0002\u0003\u0050\u0003\u0002\u0002\u0002\u0005\u0052\u0003\u0002\u0002\u0002\u0007\u0055\u0003\u0002\u0002\u0002\u0009\u005a\u0003\u0002\u0002\u0002\u000b\u0069\u0003\u0002\u0002\u0002\u000d\u006c\u0003\u0002\u0002\u0002\u000f\u0072\u0003\u0002\u0002\u0002\u0011\u0074\u0003\u0002\u0002\u0002\u0013\u0082\u0003\u0002\u0002\u0002\u0015\u008f\u0003\u0002\u0002\u0002\u0017\u009a\u0003\u0002\u0002\u0002\u0019\u009c\u0003\u0002\u0002\u0002\u001b\u009e\u0003\u0002\u0002\u0002\u001d\u00a0\u0003\u0002\u0002\u0002\u001f\u00a2\u0003\u0002\u0002\u0002\u0021\u00a4\u0003\u0002\u0002\u0002\u0023\u00a6\u0003\u0002\u0002\u0002\u0025\u00a9\u0003\u0002\u0002\u0002\u0027\u00ab\u0003\u0002\u0002\u0002\u0029\u00ae\u0003\u0002\u0002\u0002\u002b\u00b1\u0003\u0002\u0002\u0002\u002d\u00b4\u0003\u0002\u0002\u0002\u002f\u00b7\u0003\u0002\u0002\u0002\u0031\u00ba\u0003\u0002\u0002\u0002\u0033\u00bc\u0003\u0002\u0002\u0002\u0035\u00be\u0003\u0002\u0002\u0002\u0037\u00c1\u0003\u0002\u0002\u0002\u0039\u00cd\u0003\u0002\u0002\u0002\u003b\u00cf\u0003\u0002\u0002\u0002\u003d\u00d1\u0003\u0002\u0002\u0002\u003f\u00d3\u0003\u0002\u0002\u0002\u0041\u00d5\u0003\u0002\u0002\u0002\u0043\u00d7\u0003\u0002\u0002\u0002\u0045\u00d9\u0003\u0002\u0002\u0002\u0047\u0048\u0007\u0076\u0002\u0002\u0048\u0049\u0007\u0074\u0002\u0002\u0049\u004a\u0007\u0077\u0002\u0002\u004a\u0051\u0007\u0067\u0002\u0002\u004b\u004c\u0007\u0068\u0002\u0002\u004c\u004d\u0007\u0063\u0002\u0002\u004d\u004e\u0007\u006e\u0002\u0002\u004e\u004f\u0007\u0075\u0002\u0002\u004f\u0051\u0007\u0067\u0002\u0002\u0050\u0047\u0003\u0002\u0002\u0002\u0050\u004b\u0003\u0002\u0002\u0002\u0051\u0004\u0003\u0002\u0002\u0002\u0052\u0053\u0007\u006b\u0002\u0002\u0053\u0054\u0007\u0068\u0002\u0002\u0054\u0006\u0003\u0002\u0002\u0002\u0055\u0056\u0007\u0067\u0002\u0002\u0056\u0057\u0007\u006e\u0002\u0002\u0057\u0058\u0007\u0075\u0002\u0002\u0058\u0059\u0007\u0067\u0002\u0002\u0059\u0008\u0003\u0002\u0002\u0002\u005a\u005b\u0007\u0079\u0002\u0002\u005b\u005c\u0007\u006a\u0002\u0002\u005c\u005d\u0007\u006b\u0002\u0002\u005d\u005e\u0007\u006e\u0002\u0002\u005e\u005f\u0007\u0067\u0002\u0002\u005f\u000a\u0003\u0002\u0002\u0002\u0060\u0061\u0007\u006b\u0002\u0002\u0061\u0062\u0007\u0070\u0002\u0002\u0062\u006a\u0007\u0076\u0002\u0002\u0063\u0064\u0007\u0066\u0002\u0002\u0064\u0065\u0007\u0071\u0002\u0002\u0065\u0066\u0007\u0077\u0002\u0002\u0066\u0067\u0007\u0064\u0002\u0002\u0067\u0068\u0007\u006e\u0002\u0002\u0068\u006a\u0007\u0067\u0002\u0002\u0069\u0060\u0003\u0002\u0002\u0002\u0069\u0063\u0003\u0002\u0002\u0002\u006a\u000c\u0003\u0002\u0002\u0002\u006b\u006d\u0009\u0002\u0002\u0002\u006c\u006b\u0003\u0002\u0002\u0002\u006d\u006e\u0003\u0002\u0002\u0002\u006e\u006c\u0003\u0002\u0002\u0002\u006e\u006f\u0003\u0002\u0002\u0002\u006f\u0070\u0003\u0002\u0002\u0002\u0070\u0071\u0008\u0007\u0002\u0002\u0071\u000e\u0003\u0002\u0002\u0002\u0072\u0073\u0007\u0022\u0002\u0002\u0073\u0010\u0003\u0002\u0002\u0002\u0074\u0075\u0007\u0031\u0002\u0002\u0075\u0076\u0007\u002c\u0002\u0002\u0076\u007a\u0003\u0002\u0002\u0002\u0077\u0079\u000b\u0002\u0002\u0002\u0078\u0077\u0003\u0002\u0002\u0002\u0079\u007c\u0003\u0002\u0002\u0002\u007a\u007b\u0003\u0002\u0002\u0002\u007a\u0078\u0003\u0002\u0002\u0002\u007b\u007d\u0003\u0002\u0002\u0002\u007c\u007a\u0003\u0002\u0002\u0002\u007d\u007e\u0007\u002c\u0002\u0002\u007e\u007f\u0007\u0031\u0002\u0002\u007f\u0080\u0003\u0002\u0002\u0002\u0080\u0081\u0008\u0009\u0002\u0002\u0081\u0012\u0003\u0002\u0002\u0002\u0082\u0083\u0007\u0031\u0002\u0002\u0083\u0084\u0007\u0031\u0002\u0002\u0084\u0088\u0003\u0002\u0002\u0002\u0085\u0087\u000a\u0003\u0002\u0002\u0086\u0085\u0003\u0002\u0002\u0002\u0087\u008a\u0003\u0002\u0002\u0002\u0088\u0086\u0003\u0002\u0002\u0002\u0088\u0089\u0003\u0002\u0002\u0002\u0089\u008b\u0003\u0002\u0002\u0002\u008a\u0088\u0003\u0002\u0002\u0002\u008b\u008c\u0008\u000a\u0002\u0002\u008c\u0014\u0003\u0002\u0002\u0002\u008d\u0090\u0005\u0039\u001d\u0002\u008e\u0090\u0005\u003d\u001f\u0002\u008f\u008d\u0003\u0002\u0002\u0002\u008f\u008e\u0003\u0002\u0002\u0002\u0090\u0091\u0003\u0002\u0002\u0002\u0091\u008f\u0003\u0002\u0002\u0002\u0091\u0092\u0003\u0002\u0002\u0002\u0092\u0097\u0003\u0002\u0002\u0002\u0093\u0096\u0005\u003d\u001f\u0002\u0094\u0096\u0005\u003b\u001e\u0002\u0095\u0093\u0003\u0002\u0002\u0002\u0095\u0094\u0003\u0002\u0002\u0002\u0096\u0099\u0003\u0002\u0002\u0002\u0097\u0095\u0003\u0002\u0002\u0002\u0097\u0098\u0003\u0002\u0002\u0002\u0098\u0016\u0003\u0002\u0002\u0002\u0099\u0097\u0003\u0002\u0002\u0002\u009a\u009b\u0007\u002c\u0002\u0002\u009b\u0018\u0003\u0002\u0002\u0002\u009c\u009d\u0007\u0031\u0002\u0002\u009d\u001a\u0003\u0002\u0002\u0002\u009e\u009f\u0007\u0027\u0002\u0002\u009f\u001c\u0003\u0002\u0002\u0002\u00a0\u00a1\u0007\u002d\u0002\u0002\u00a1\u001e\u0003\u0002\u0002\u0002\u00a2\u00a3\u0007\u002f\u0002\u0002\u00a3\u0020\u0003\u0002\u0002\u0002\u00a4\u00a5\u0007\u003e\u0002\u0002\u00a5\u0022\u0003\u0002\u0002\u0002\u00a6\u00a7\u0007\u003e\u0002\u0002\u00a7\u00a8\u0007\u003f\u0002\u0002\u00a8\u0024\u0003\u0002\u0002\u0002\u00a9\u00aa\u0007\u0040\u0002\u0002\u00aa\u0026\u0003\u0002\u0002\u0002\u00ab\u00ac\u0007\u0040\u0002\u0002\u00ac\u00ad\u0007\u003f\u0002\u0002\u00ad\u0028\u0003\u0002\u0002\u0002\u00ae\u00af\u0007\u003f\u0002\u0002\u00af\u00b0\u0007\u003f\u0002\u0002\u00b0\u002a\u0003\u0002\u0002\u0002\u00b1\u00b2\u0007\u0023\u0002\u0002\u00b2\u00b3\u0007\u003f\u0002\u0002\u00b3\u002c\u0003\u0002\u0002\u0002\u00b4\u00b5\u0007\u007e\u0002\u0002\u00b5\u00b6\u0007\u007e\u0002\u0002\u00b6\u002e\u0003\u0002\u0002\u0002\u00b7\u00b8\u0007\u0028\u0002\u0002\u00b8\u00b9\u0007\u0028\u0002\u0002\u00b9\u0030\u0003\u0002\u0002\u0002\u00ba\u00bb\u0007\u0023\u0002\u0002\u00bb\u0032\u0003\u0002\u0002\u0002\u00bc\u00bd\u0007\u003f\u0002\u0002\u00bd\u0034\u0003\u0002\u0002\u0002\u00be\u00bf\u0007\u003d\u0002\u0002\u00bf\u0036\u0003\u0002\u0002\u0002\u00c0\u00c2\u0005\u003b\u001e\u0002\u00c1\u00c0\u0003\u0002\u0002\u0002\u00c2\u00c3\u0003\u0002\u0002\u0002\u00c3\u00c1\u0003\u0002\u0002\u0002\u00c3\u00c4\u0003\u0002\u0002\u0002\u00c4\u00cb\u0003\u0002\u0002\u0002\u00c5\u00c7\u0007\u0030\u0002\u0002\u00c6\u00c8\u0005\u003b\u001e\u0002\u00c7\u00c6\u0003\u0002\u0002\u0002\u00c8\u00c9\u0003\u0002\u0002\u0002\u00c9\u00c7\u0003\u0002\u0002\u0002\u00c9\u00ca\u0003\u0002\u0002\u0002\u00ca\u00cc\u0003\u0002\u0002\u0002\u00cb\u00c5\u0003\u0002\u0002\u0002\u00cb\u00cc\u0003\u0002\u0002\u0002\u00cc\u0038\u0003\u0002\u0002\u0002\u00cd\u00ce\u0009\u0004\u0002\u0002\u00ce\u003a\u0003\u0002\u0002\u0002\u00cf\u00d0\u0009\u0005\u0002\u0002\u00d0\u003c\u0003\u0002\u0002\u0002\u00d1\u00d2\u0007\u0061\u0002\u0002\u00d2\u003e\u0003\u0002\u0002\u0002\u00d3\u00d4\u0007\u002a\u0002\u0002\u00d4\u0040\u0003\u0002\u0002\u0002\u00d5\u00d6\u0007\u002b\u0002\u0002\u00d6\u0042\u0003\u0002\u0002\u0002\u00d7\u00d8\u0007\u007d\u0002\u0002\u00d8\u0044\u0003\u0002\u0002\u0002\u00d9\u00da\u0007\u007f\u0002\u0002\u00da\u0046\u0003\u0002\u0002\u0002\u000f\u0002\u0050\u0069\u006e\u007a\u0088\u008f\u0091\u0095\u0097\u00c3\u00c9\u00cb\u0003\u0008\u0002\u0002"

		val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
		init {
			decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
				DFA(ATN.getDecisionState(it)!!, it)
			})


		}
	}

    enum class Tokens(val id: Int) {
	    BOOL(1),
	    IF(2),
	    ELSE(3),
	    WHILE(4),
	    TYPE(5),
	    WS(6),
	    WORD_END(7),
	    COMMENT(8),
	    LINE_COMMENT(9),
	    ID(10),
	    TIMES(11),
	    DIVIDED(12),
	    MODULE(13),
	    PLUS(14),
	    MINUS(15),
	    MINOR(16),
	    MINOREQUAL(17),
	    MAJOR(18),
	    MAJOREQUAL(19),
	    ISEQUAL(20),
	    ISNOTEQUAL(21),
	    OR(22),
	    AND(23),
	    NOT(24),
	    EQUAL(25),
	    ENDOFINSTRUCTION(26),
	    NUMBER(27),
	    LETTER(28),
	    DIGIT(29),
	    UNDERSCORE(30),
	    RBRACKETOPEN(31),
	    RBRACKETCLOSE(32),
	    CBRACKETOPEN(33),
	    CBRACKETCLOSE(34)
    }

	enum class Channels(val id: Int) {
		DEFAULT_TOKEN_CHANNEL(0),
		HIDDEN(1),
	}

	enum class Modes(val id: Int) {
		DEFAULT_MODE(0),
	}

	enum class Rules {
	    BOOL,
	    IF,
	    ELSE,
	    WHILE,
	    TYPE,
	    WS,
	    WORD_END,
	    COMMENT,
	    LINE_COMMENT,
	    ID,
	    TIMES,
	    DIVIDED,
	    MODULE,
	    PLUS,
	    MINUS,
	    MINOR,
	    MINOREQUAL,
	    MAJOR,
	    MAJOREQUAL,
	    ISEQUAL,
	    ISNOTEQUAL,
	    OR,
	    AND,
	    NOT,
	    EQUAL,
	    ENDOFINSTRUCTION,
	    NUMBER,
	    LETTER,
	    DIGIT,
	    UNDERSCORE,
	    RBRACKETOPEN,
	    RBRACKETCLOSE,
	    CBRACKETOPEN,
	    CBRACKETCLOSE
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}