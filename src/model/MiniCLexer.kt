package model// Generated from java-escape by ANTLR 4.7.1
import com.strumenta.kotlinmultiplatform.Arrays
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.DFA
import com.strumenta.kotlinmultiplatform.toCharArray
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
		                                                   null, null, "'printf'", 
		                                                   "'scanf'", null, null, 
		                                                   null, "'*'", "'/'", 
		                                                   "'%'", "'+'", "'-'", 
		                                                   "'<'", "'<='", "'>'", 
		                                                   "'>='", "'=='", "'!='", 
		                                                   "'||'", "'&'", "'&&'", 
		                                                   "'!'", "'='", "';'", 
		                                                   null, null, null, "','", 
		                                                   "'_'", "'('", "')'", 
		                                                   "'{'", "'}'")
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "BOOL", "IF", 
		                                                    "ELSE", "WHILE", "TYPE", 
		                                                    "WS", "WORD_END", 
		                                                    "COMMENT", "LINE_COMMENT", 
		                                                    "PRINTF", "SCANF", 
		                                                    "STRING_CHAR", "PLACEHOLDER", 
		                                                    "ID", "TIMES", "DIVIDED", 
		                                                    "MODULE", "PLUS", 
		                                                    "MINUS", "MINOR", 
		                                                    "MINOREQUAL", "MAJOR", 
		                                                    "MAJOREQUAL", "ISEQUAL", 
		                                                    "ISNOTEQUAL", "OR", 
		                                                    "AMPERSAND", "AND", 
		                                                    "NOT", "EQUAL", "ENDOFINSTRUCTION", 
		                                                    "NUMBER", "LETTER", 
		                                                    "DIGIT", "COMMA", 
		                                                    "UNDERSCORE", "RBRACKETOPEN", 
		                                                    "RBRACKETCLOSE", "CBRACKETOPEN", 
		                                                    "CBRACKETCLOSE")

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

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u002a\u010d\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0004\u001d\u0009\u001d\u0004\u001e\u0009\u001e\u0004\u001f\u0009\u001f\u0004\u0020\u0009\u0020\u0004\u0021\u0009\u0021\u0004\u0022\u0009\u0022\u0004\u0023\u0009\u0023\u0004\u0024\u0009\u0024\u0004\u0025\u0009\u0025\u0004\u0026\u0009\u0026\u0004\u0027\u0009\u0027\u0004\u0028\u0009\u0028\u0004\u0029\u0009\u0029\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0003\u0002\u0005\u0002\u005d\u000a\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u0076\u000a\u0006\u0003\u0007\u0006\u0007\u0079\u000a\u0007\u000d\u0007\u000e\u0007\u007a\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0007\u0009\u0085\u000a\u0009\u000c\u0009\u000e\u0009\u0088\u000b\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0007\u000a\u0093\u000a\u000a\u000c\u000a\u000e\u000a\u0096\u000b\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0007\u000d\u00a9\u000a\u000d\u000c\u000d\u000e\u000d\u00ac\u000b\u000d\u0003\u000d\u0007\u000d\u00af\u000a\u000d\u000c\u000d\u000e\u000d\u00b2\u000b\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u00ba\u000a\u000e\u0003\u000f\u0003\u000f\u0006\u000f\u00be\u000a\u000f\u000d\u000f\u000e\u000f\u00bf\u0003\u000f\u0003\u000f\u0007\u000f\u00c4\u000a\u000f\u000c\u000f\u000e\u000f\u00c7\u000b\u000f\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0012\u0003\u0012\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0016\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0003\u001c\u0003\u001d\u0003\u001d\u0003\u001d\u0003\u001e\u0003\u001e\u0003\u001f\u0003\u001f\u0003\u0020\u0003\u0020\u0003\u0021\u0006\u0021\u00f2\u000a\u0021\u000d\u0021\u000e\u0021\u00f3\u0003\u0021\u0003\u0021\u0006\u0021\u00f8\u000a\u0021\u000d\u0021\u000e\u0021\u00f9\u0005\u0021\u00fc\u000a\u0021\u0003\u0022\u0003\u0022\u0003\u0023\u0003\u0023\u0003\u0024\u0003\u0024\u0003\u0025\u0003\u0025\u0003\u0026\u0003\u0026\u0003\u0027\u0003\u0027\u0003\u0028\u0003\u0028\u0003\u0029\u0003\u0029\u0003\u0086\u0002\u002a\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u000d\u0008\u000f\u0009\u0011\u000a\u0013\u000b\u0015\u000c\u0017\u000d\u0019\u000e\u001b\u000f\u001d\u0010\u001f\u0011\u0021\u0012\u0023\u0013\u0025\u0014\u0027\u0015\u0029\u0016\u002b\u0017\u002d\u0018\u002f\u0019\u0031\u001a\u0033\u001b\u0035\u001c\u0037\u001d\u0039\u001e\u003b\u001f\u003d\u0020\u003f\u0021\u0041\u0022\u0043\u0023\u0045\u0024\u0047\u0025\u0049\u0026\u004b\u0027\u004d\u0028\u004f\u0029\u0051\u002a\u0003\u0002\u0007\u0005\u0002\u000b\u000c\u000f\u000f\u0022\u0022\u0004\u0002\u000c\u000c\u000f\u000f\u0005\u0002\u000c\u000c\u000f\u000f\u0024\u0024\u0004\u0002\u0043\u005c\u0063\u007c\u0003\u0002\u0032\u003b\u0002\u011b\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\u000d\u0003\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0002\u0011\u0003\u0002\u0002\u0002\u0002\u0013\u0003\u0002\u0002\u0002\u0002\u0015\u0003\u0002\u0002\u0002\u0002\u0017\u0003\u0002\u0002\u0002\u0002\u0019\u0003\u0002\u0002\u0002\u0002\u001b\u0003\u0002\u0002\u0002\u0002\u001d\u0003\u0002\u0002\u0002\u0002\u001f\u0003\u0002\u0002\u0002\u0002\u0021\u0003\u0002\u0002\u0002\u0002\u0023\u0003\u0002\u0002\u0002\u0002\u0025\u0003\u0002\u0002\u0002\u0002\u0027\u0003\u0002\u0002\u0002\u0002\u0029\u0003\u0002\u0002\u0002\u0002\u002b\u0003\u0002\u0002\u0002\u0002\u002d\u0003\u0002\u0002\u0002\u0002\u002f\u0003\u0002\u0002\u0002\u0002\u0031\u0003\u0002\u0002\u0002\u0002\u0033\u0003\u0002\u0002\u0002\u0002\u0035\u0003\u0002\u0002\u0002\u0002\u0037\u0003\u0002\u0002\u0002\u0002\u0039\u0003\u0002\u0002\u0002\u0002\u003b\u0003\u0002\u0002\u0002\u0002\u003d\u0003\u0002\u0002\u0002\u0002\u003f\u0003\u0002\u0002\u0002\u0002\u0041\u0003\u0002\u0002\u0002\u0002\u0043\u0003\u0002\u0002\u0002\u0002\u0045\u0003\u0002\u0002\u0002\u0002\u0047\u0003\u0002\u0002\u0002\u0002\u0049\u0003\u0002\u0002\u0002\u0002\u004b\u0003\u0002\u0002\u0002\u0002\u004d\u0003\u0002\u0002\u0002\u0002\u004f\u0003\u0002\u0002\u0002\u0002\u0051\u0003\u0002\u0002\u0002\u0003\u005c\u0003\u0002\u0002\u0002\u0005\u005e\u0003\u0002\u0002\u0002\u0007\u0061\u0003\u0002\u0002\u0002\u0009\u0066\u0003\u0002\u0002\u0002\u000b\u0075\u0003\u0002\u0002\u0002\u000d\u0078\u0003\u0002\u0002\u0002\u000f\u007e\u0003\u0002\u0002\u0002\u0011\u0080\u0003\u0002\u0002\u0002\u0013\u008e\u0003\u0002\u0002\u0002\u0015\u0099\u0003\u0002\u0002\u0002\u0017\u00a0\u0003\u0002\u0002\u0002\u0019\u00a6\u0003\u0002\u0002\u0002\u001b\u00b9\u0003\u0002\u0002\u0002\u001d\u00bd\u0003\u0002\u0002\u0002\u001f\u00c8\u0003\u0002\u0002\u0002\u0021\u00ca\u0003\u0002\u0002\u0002\u0023\u00cc\u0003\u0002\u0002\u0002\u0025\u00ce\u0003\u0002\u0002\u0002\u0027\u00d0\u0003\u0002\u0002\u0002\u0029\u00d2\u0003\u0002\u0002\u0002\u002b\u00d4\u0003\u0002\u0002\u0002\u002d\u00d7\u0003\u0002\u0002\u0002\u002f\u00d9\u0003\u0002\u0002\u0002\u0031\u00dc\u0003\u0002\u0002\u0002\u0033\u00df\u0003\u0002\u0002\u0002\u0035\u00e2\u0003\u0002\u0002\u0002\u0037\u00e5\u0003\u0002\u0002\u0002\u0039\u00e7\u0003\u0002\u0002\u0002\u003b\u00ea\u0003\u0002\u0002\u0002\u003d\u00ec\u0003\u0002\u0002\u0002\u003f\u00ee\u0003\u0002\u0002\u0002\u0041\u00f1\u0003\u0002\u0002\u0002\u0043\u00fd\u0003\u0002\u0002\u0002\u0045\u00ff\u0003\u0002\u0002\u0002\u0047\u0101\u0003\u0002\u0002\u0002\u0049\u0103\u0003\u0002\u0002\u0002\u004b\u0105\u0003\u0002\u0002\u0002\u004d\u0107\u0003\u0002\u0002\u0002\u004f\u0109\u0003\u0002\u0002\u0002\u0051\u010b\u0003\u0002\u0002\u0002\u0053\u0054\u0007\u0076\u0002\u0002\u0054\u0055\u0007\u0074\u0002\u0002\u0055\u0056\u0007\u0077\u0002\u0002\u0056\u005d\u0007\u0067\u0002\u0002\u0057\u0058\u0007\u0068\u0002\u0002\u0058\u0059\u0007\u0063\u0002\u0002\u0059\u005a\u0007\u006e\u0002\u0002\u005a\u005b\u0007\u0075\u0002\u0002\u005b\u005d\u0007\u0067\u0002\u0002\u005c\u0053\u0003\u0002\u0002\u0002\u005c\u0057\u0003\u0002\u0002\u0002\u005d\u0004\u0003\u0002\u0002\u0002\u005e\u005f\u0007\u006b\u0002\u0002\u005f\u0060\u0007\u0068\u0002\u0002\u0060\u0006\u0003\u0002\u0002\u0002\u0061\u0062\u0007\u0067\u0002\u0002\u0062\u0063\u0007\u006e\u0002\u0002\u0063\u0064\u0007\u0075\u0002\u0002\u0064\u0065\u0007\u0067\u0002\u0002\u0065\u0008\u0003\u0002\u0002\u0002\u0066\u0067\u0007\u0079\u0002\u0002\u0067\u0068\u0007\u006a\u0002\u0002\u0068\u0069\u0007\u006b\u0002\u0002\u0069\u006a\u0007\u006e\u0002\u0002\u006a\u006b\u0007\u0067\u0002\u0002\u006b\u000a\u0003\u0002\u0002\u0002\u006c\u006d\u0007\u006b\u0002\u0002\u006d\u006e\u0007\u0070\u0002\u0002\u006e\u0076\u0007\u0076\u0002\u0002\u006f\u0070\u0007\u0066\u0002\u0002\u0070\u0071\u0007\u0071\u0002\u0002\u0071\u0072\u0007\u0077\u0002\u0002\u0072\u0073\u0007\u0064\u0002\u0002\u0073\u0074\u0007\u006e\u0002\u0002\u0074\u0076\u0007\u0067\u0002\u0002\u0075\u006c\u0003\u0002\u0002\u0002\u0075\u006f\u0003\u0002\u0002\u0002\u0076\u000c\u0003\u0002\u0002\u0002\u0077\u0079\u0009\u0002\u0002\u0002\u0078\u0077\u0003\u0002\u0002\u0002\u0079\u007a\u0003\u0002\u0002\u0002\u007a\u0078\u0003\u0002\u0002\u0002\u007a\u007b\u0003\u0002\u0002\u0002\u007b\u007c\u0003\u0002\u0002\u0002\u007c\u007d\u0008\u0007\u0002\u0002\u007d\u000e\u0003\u0002\u0002\u0002\u007e\u007f\u0007\u0022\u0002\u0002\u007f\u0010\u0003\u0002\u0002\u0002\u0080\u0081\u0007\u0031\u0002\u0002\u0081\u0082\u0007\u002c\u0002\u0002\u0082\u0086\u0003\u0002\u0002\u0002\u0083\u0085\u000b\u0002\u0002\u0002\u0084\u0083\u0003\u0002\u0002\u0002\u0085\u0088\u0003\u0002\u0002\u0002\u0086\u0087\u0003\u0002\u0002\u0002\u0086\u0084\u0003\u0002\u0002\u0002\u0087\u0089\u0003\u0002\u0002\u0002\u0088\u0086\u0003\u0002\u0002\u0002\u0089\u008a\u0007\u002c\u0002\u0002\u008a\u008b\u0007\u0031\u0002\u0002\u008b\u008c\u0003\u0002\u0002\u0002\u008c\u008d\u0008\u0009\u0002\u0002\u008d\u0012\u0003\u0002\u0002\u0002\u008e\u008f\u0007\u0031\u0002\u0002\u008f\u0090\u0007\u0031\u0002\u0002\u0090\u0094\u0003\u0002\u0002\u0002\u0091\u0093\u000a\u0003\u0002\u0002\u0092\u0091\u0003\u0002\u0002\u0002\u0093\u0096\u0003\u0002\u0002\u0002\u0094\u0092\u0003\u0002\u0002\u0002\u0094\u0095\u0003\u0002\u0002\u0002\u0095\u0097\u0003\u0002\u0002\u0002\u0096\u0094\u0003\u0002\u0002\u0002\u0097\u0098\u0008\u000a\u0002\u0002\u0098\u0014\u0003\u0002\u0002\u0002\u0099\u009a\u0007\u0072\u0002\u0002\u009a\u009b\u0007\u0074\u0002\u0002\u009b\u009c\u0007\u006b\u0002\u0002\u009c\u009d\u0007\u0070\u0002\u0002\u009d\u009e\u0007\u0076\u0002\u0002\u009e\u009f\u0007\u0068\u0002\u0002\u009f\u0016\u0003\u0002\u0002\u0002\u00a0\u00a1\u0007\u0075\u0002\u0002\u00a1\u00a2\u0007\u0065\u0002\u0002\u00a2\u00a3\u0007\u0063\u0002\u0002\u00a3\u00a4\u0007\u0070\u0002\u0002\u00a4\u00a5\u0007\u0068\u0002\u0002\u00a5\u0018\u0003\u0002\u0002\u0002\u00a6\u00aa\u0007\u0024\u0002\u0002\u00a7\u00a9\u000a\u0004\u0002\u0002\u00a8\u00a7\u0003\u0002\u0002\u0002\u00a9\u00ac\u0003\u0002\u0002\u0002\u00aa\u00a8\u0003\u0002\u0002\u0002\u00aa\u00ab\u0003\u0002\u0002\u0002\u00ab\u00b0\u0003\u0002\u0002\u0002\u00ac\u00aa\u0003\u0002\u0002\u0002\u00ad\u00af\u0005\u001b\u000e\u0002\u00ae\u00ad\u0003\u0002\u0002\u0002\u00af\u00b2\u0003\u0002\u0002\u0002\u00b0\u00ae\u0003\u0002\u0002\u0002\u00b0\u00b1\u0003\u0002\u0002\u0002\u00b1\u00b3\u0003\u0002\u0002\u0002\u00b2\u00b0\u0003\u0002\u0002\u0002\u00b3\u00b4\u0007\u0024\u0002\u0002\u00b4\u001a\u0003\u0002\u0002\u0002\u00b5\u00b6\u0007\u0027\u0002\u0002\u00b6\u00ba\u0007\u0066\u0002\u0002\u00b7\u00b8\u0007\u0027\u0002\u0002\u00b8\u00ba\u0007\u0068\u0002\u0002\u00b9\u00b5\u0003\u0002\u0002\u0002\u00b9\u00b7\u0003\u0002\u0002\u0002\u00ba\u001c\u0003\u0002\u0002\u0002\u00bb\u00be\u0005\u0043\u0022\u0002\u00bc\u00be\u0005\u0049\u0025\u0002\u00bd\u00bb\u0003\u0002\u0002\u0002\u00bd\u00bc\u0003\u0002\u0002\u0002\u00be\u00bf\u0003\u0002\u0002\u0002\u00bf\u00bd\u0003\u0002\u0002\u0002\u00bf\u00c0\u0003\u0002\u0002\u0002\u00c0\u00c5\u0003\u0002\u0002\u0002\u00c1\u00c4\u0005\u0049\u0025\u0002\u00c2\u00c4\u0005\u0045\u0023\u0002\u00c3\u00c1\u0003\u0002\u0002\u0002\u00c3\u00c2\u0003\u0002\u0002\u0002\u00c4\u00c7\u0003\u0002\u0002\u0002\u00c5\u00c3\u0003\u0002\u0002\u0002\u00c5\u00c6\u0003\u0002\u0002\u0002\u00c6\u001e\u0003\u0002\u0002\u0002\u00c7\u00c5\u0003\u0002\u0002\u0002\u00c8\u00c9\u0007\u002c\u0002\u0002\u00c9\u0020\u0003\u0002\u0002\u0002\u00ca\u00cb\u0007\u0031\u0002\u0002\u00cb\u0022\u0003\u0002\u0002\u0002\u00cc\u00cd\u0007\u0027\u0002\u0002\u00cd\u0024\u0003\u0002\u0002\u0002\u00ce\u00cf\u0007\u002d\u0002\u0002\u00cf\u0026\u0003\u0002\u0002\u0002\u00d0\u00d1\u0007\u002f\u0002\u0002\u00d1\u0028\u0003\u0002\u0002\u0002\u00d2\u00d3\u0007\u003e\u0002\u0002\u00d3\u002a\u0003\u0002\u0002\u0002\u00d4\u00d5\u0007\u003e\u0002\u0002\u00d5\u00d6\u0007\u003f\u0002\u0002\u00d6\u002c\u0003\u0002\u0002\u0002\u00d7\u00d8\u0007\u0040\u0002\u0002\u00d8\u002e\u0003\u0002\u0002\u0002\u00d9\u00da\u0007\u0040\u0002\u0002\u00da\u00db\u0007\u003f\u0002\u0002\u00db\u0030\u0003\u0002\u0002\u0002\u00dc\u00dd\u0007\u003f\u0002\u0002\u00dd\u00de\u0007\u003f\u0002\u0002\u00de\u0032\u0003\u0002\u0002\u0002\u00df\u00e0\u0007\u0023\u0002\u0002\u00e0\u00e1\u0007\u003f\u0002\u0002\u00e1\u0034\u0003\u0002\u0002\u0002\u00e2\u00e3\u0007\u007e\u0002\u0002\u00e3\u00e4\u0007\u007e\u0002\u0002\u00e4\u0036\u0003\u0002\u0002\u0002\u00e5\u00e6\u0007\u0028\u0002\u0002\u00e6\u0038\u0003\u0002\u0002\u0002\u00e7\u00e8\u0007\u0028\u0002\u0002\u00e8\u00e9\u0007\u0028\u0002\u0002\u00e9\u003a\u0003\u0002\u0002\u0002\u00ea\u00eb\u0007\u0023\u0002\u0002\u00eb\u003c\u0003\u0002\u0002\u0002\u00ec\u00ed\u0007\u003f\u0002\u0002\u00ed\u003e\u0003\u0002\u0002\u0002\u00ee\u00ef\u0007\u003d\u0002\u0002\u00ef\u0040\u0003\u0002\u0002\u0002\u00f0\u00f2\u0005\u0045\u0023\u0002\u00f1\u00f0\u0003\u0002\u0002\u0002\u00f2\u00f3\u0003\u0002\u0002\u0002\u00f3\u00f1\u0003\u0002\u0002\u0002\u00f3\u00f4\u0003\u0002\u0002\u0002\u00f4\u00fb\u0003\u0002\u0002\u0002\u00f5\u00f7\u0007\u0030\u0002\u0002\u00f6\u00f8\u0005\u0045\u0023\u0002\u00f7\u00f6\u0003\u0002\u0002\u0002\u00f8\u00f9\u0003\u0002\u0002\u0002\u00f9\u00f7\u0003\u0002\u0002\u0002\u00f9\u00fa\u0003\u0002\u0002\u0002\u00fa\u00fc\u0003\u0002\u0002\u0002\u00fb\u00f5\u0003\u0002\u0002\u0002\u00fb\u00fc\u0003\u0002\u0002\u0002\u00fc\u0042\u0003\u0002\u0002\u0002\u00fd\u00fe\u0009\u0005\u0002\u0002\u00fe\u0044\u0003\u0002\u0002\u0002\u00ff\u0100\u0009\u0006\u0002\u0002\u0100\u0046\u0003\u0002\u0002\u0002\u0101\u0102\u0007\u002e\u0002\u0002\u0102\u0048\u0003\u0002\u0002\u0002\u0103\u0104\u0007\u0061\u0002\u0002\u0104\u004a\u0003\u0002\u0002\u0002\u0105\u0106\u0007\u002a\u0002\u0002\u0106\u004c\u0003\u0002\u0002\u0002\u0107\u0108\u0007\u002b\u0002\u0002\u0108\u004e\u0003\u0002\u0002\u0002\u0109\u010a\u0007\u007d\u0002\u0002\u010a\u0050\u0003\u0002\u0002\u0002\u010b\u010c\u0007\u007f\u0002\u0002\u010c\u0052\u0003\u0002\u0002\u0002\u0012\u0002\u005c\u0075\u007a\u0086\u0094\u00aa\u00b0\u00b9\u00bd\u00bf\u00c3\u00c5\u00f3\u00f9\u00fb\u0003\u0008\u0002\u0002"

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
	    PRINTF(10),
	    SCANF(11),
	    STRING_CHAR(12),
	    PLACEHOLDER(13),
	    ID(14),
	    TIMES(15),
	    DIVIDED(16),
	    MODULE(17),
	    PLUS(18),
	    MINUS(19),
	    MINOR(20),
	    MINOREQUAL(21),
	    MAJOR(22),
	    MAJOREQUAL(23),
	    ISEQUAL(24),
	    ISNOTEQUAL(25),
	    OR(26),
	    AMPERSAND(27),
	    AND(28),
	    NOT(29),
	    EQUAL(30),
	    ENDOFINSTRUCTION(31),
	    NUMBER(32),
	    LETTER(33),
	    DIGIT(34),
	    COMMA(35),
	    UNDERSCORE(36),
	    RBRACKETOPEN(37),
	    RBRACKETCLOSE(38),
	    CBRACKETOPEN(39),
	    CBRACKETCLOSE(40)
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
	    PRINTF,
	    SCANF,
	    STRING_CHAR,
	    PLACEHOLDER,
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
	    AMPERSAND,
	    AND,
	    NOT,
	    EQUAL,
	    ENDOFINSTRUCTION,
	    NUMBER,
	    LETTER,
	    DIGIT,
	    COMMA,
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