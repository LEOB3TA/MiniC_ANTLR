package model// Generated from java-escape by ANTLR 4.7.1
import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.ParserATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor
import com.strumenta.kotlinmultiplatform.toCharArray
import kotlin.reflect.KClass

class MiniCParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(
            ProgramContext::class,
                                                              DeclarationContext::class,
                                                              AssignContext::class,
                                                              StatementContext::class,
                                                              PrintfStatementContext::class,
                                                              ScanfStatementContext::class,
                                                              BlockStatementContext::class,
                                                              IfStatementContext::class,
                                                              WhileStatementContext::class,
                                                              ExpressionContext::class,
                                                              E1Context::class,
                                                              E2Context::class,
                                                              E3Context::class,
                                                              E4Context::class,
                                                              E5Context::class,
                                                              E6Context::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "MiniC.g4"

    override val tokenNames: Array<String?>?
        get() = Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = Companion.ruleNames
    override val atn: ATN
        get() = ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
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
        AND(27),
        NOT(28),
        EQUAL(29),
        ENDOFINSTRUCTION(30),
        NUMBER(31),
        LETTER(32),
        DIGIT(33),
        COMMA(34),
        UNDERSCORE(35),
        RBRACKETOPEN(36),
        RBRACKETCLOSE(37),
        CBRACKETOPEN(38),
        CBRACKETCLOSE(39)
    }

    enum class Rules(val id: Int) {
        RULE_program(0),
        RULE_declaration(1),
        RULE_assign(2),
        RULE_statement(3),
        RULE_printfStatement(4),
        RULE_scanfStatement(5),
        RULE_blockStatement(6),
        RULE_ifStatement(7),
        RULE_whileStatement(8),
        RULE_expression(9),
        RULE_e1(10),
        RULE_e2(11),
        RULE_e3(12),
        RULE_e4(13),
        RULE_e5(14),
        RULE_e6(15)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("program", "declaration", "assign", "statement", 
                                "printfStatement", "scanfStatement", "blockStatement", 
                                "ifStatement", "whileStatement", "expression", 
                                "e1", "e2", "e3", "e4", "e5", "e6")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, null, "'if'", 
                                                           "'else'", "'while'", 
                                                           null, null, "' '", 
                                                           null, null, "'printf'", 
                                                           "'scanf'", null, 
                                                           null, null, "'*'", 
                                                           "'/'", "'%'", 
                                                           "'+'", "'-'", 
                                                           "'<'", "'<='", 
                                                           "'>'", "'>='", 
                                                           "'=='", "'!='", 
                                                           "'||'", "'&&'", 
                                                           "'!'", "'='", 
                                                           "';'", null, 
                                                           null, null, "','", 
                                                           "'_'", "'('", 
                                                           "')'", "'{'", 
                                                           "'}'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "BOOL", 
                                                            "IF", "ELSE", 
                                                            "WHILE", "TYPE", 
                                                            "WS", "WORD_END", 
                                                            "COMMENT", "LINE_COMMENT", 
                                                            "PRINTF", "SCANF", 
                                                            "STRING_CHAR", 
                                                            "PLACEHOLDER", 
                                                            "ID", "TIMES", 
                                                            "DIVIDED", "MODULE", 
                                                            "PLUS", "MINUS", 
                                                            "MINOR", "MINOREQUAL", 
                                                            "MAJOR", "MAJOREQUAL", 
                                                            "ISEQUAL", "ISNOTEQUAL", 
                                                            "OR", "AND", 
                                                            "NOT", "EQUAL", 
                                                            "ENDOFINSTRUCTION", 
                                                            "NUMBER", "LETTER", 
                                                            "DIGIT", "COMMA", 
                                                            "UNDERSCORE", 
                                                            "RBRACKETOPEN", 
                                                            "RBRACKETCLOSE", 
                                                            "CBRACKETOPEN", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0029\u00c7\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0003\u0002\u0007\u0002\u0024\u000a\u0002\u000c\u0002\u000e\u0002\u0027\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0033\u000a\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0037\u000a\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u003f\u000a\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0046\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u004e\u000a\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0007\u0006\u0055\u000a\u0006\u000c\u0006\u000e\u0006\u0058\u000b\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0006\u0007\u0061\u000a\u0007\u000d\u0007\u000e\u0007\u0062\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0007\u0008\u0069\u000a\u0008\u000c\u0008\u000e\u0008\u006c\u000b\u0008\u0003\u0008\u0007\u0008\u006f\u000a\u0008\u000c\u0008\u000e\u0008\u0072\u000b\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0005\u0009\u007c\u000a\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0005\u0009\u0082\u000a\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u008a\u000a\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0007\u000b\u0092\u000a\u000b\u000c\u000b\u000e\u000b\u0095\u000b\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u009a\u000a\u000c\u000c\u000c\u000e\u000c\u009d\u000b\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0007\u000d\u00a2\u000a\u000d\u000c\u000d\u000e\u000d\u00a5\u000b\u000d\u0003\u000e\u0005\u000e\u00a8\u000a\u000e\u0003\u000e\u0003\u000e\u0007\u000e\u00ac\u000a\u000e\u000c\u000e\u000e\u000e\u00af\u000b\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0007\u000f\u00b4\u000a\u000f\u000c\u000f\u000e\u000f\u00b7\u000b\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0005\u0010\u00bc\u000a\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0005\u0011\u00c5\u000a\u0011\u0003\u0011\u0002\u0002\u0012\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0020\u0002\u0005\u0003\u0002\u0016\u001b\u0003\u0002\u0014\u0015\u0003\u0002\u0011\u0013\u0002\u00db\u0002\u0025\u0003\u0002\u0002\u0002\u0004\u0036\u0003\u0002\u0002\u0002\u0006\u0038\u0003\u0002\u0002\u0002\u0008\u004d\u0003\u0002\u0002\u0002\u000a\u004f\u0003\u0002\u0002\u0002\u000c\u005b\u0003\u0002\u0002\u0002\u000e\u0066\u0003\u0002\u0002\u0002\u0010\u0075\u0003\u0002\u0002\u0002\u0012\u0083\u0003\u0002\u0002\u0002\u0014\u008e\u0003\u0002\u0002\u0002\u0016\u0096\u0003\u0002\u0002\u0002\u0018\u009e\u0003\u0002\u0002\u0002\u001a\u00a7\u0003\u0002\u0002\u0002\u001c\u00b0\u0003\u0002\u0002\u0002\u001e\u00bb\u0003\u0002\u0002\u0002\u0020\u00c4\u0003\u0002\u0002\u0002\u0022\u0024\u0005\u0008\u0005\u0002\u0023\u0022\u0003\u0002\u0002\u0002\u0024\u0027\u0003\u0002\u0002\u0002\u0025\u0023\u0003\u0002\u0002\u0002\u0025\u0026\u0003\u0002\u0002\u0002\u0026\u0003\u0003\u0002\u0002\u0002\u0027\u0025\u0003\u0002\u0002\u0002\u0028\u0029\u0007\u0007\u0002\u0002\u0029\u002a\u0007\u0010\u0002\u0002\u002a\u0037\u0007\u0020\u0002\u0002\u002b\u002c\u0007\u0007\u0002\u0002\u002c\u002d\u0007\u0010\u0002\u0002\u002d\u0032\u0007\u001f\u0002\u0002\u002e\u0033\u0005\u0006\u0004\u0002\u002f\u0033\u0005\u0014\u000b\u0002\u0030\u0033\u0005\u000a\u0006\u0002\u0031\u0033\u0005\u000c\u0007\u0002\u0032\u002e\u0003\u0002\u0002\u0002\u0032\u002f\u0003\u0002\u0002\u0002\u0032\u0030\u0003\u0002\u0002\u0002\u0032\u0031\u0003\u0002\u0002\u0002\u0033\u0034\u0003\u0002\u0002\u0002\u0034\u0035\u0007\u0020\u0002\u0002\u0035\u0037\u0003\u0002\u0002\u0002\u0036\u0028\u0003\u0002\u0002\u0002\u0036\u002b\u0003\u0002\u0002\u0002\u0037\u0005\u0003\u0002\u0002\u0002\u0038\u0039\u0007\u0010\u0002\u0002\u0039\u003e\u0007\u001f\u0002\u0002\u003a\u003f\u0005\u0006\u0004\u0002\u003b\u003f\u0005\u0014\u000b\u0002\u003c\u003f\u0005\u000a\u0006\u0002\u003d\u003f\u0005\u000c\u0007\u0002\u003e\u003a\u0003\u0002\u0002\u0002\u003e\u003b\u0003\u0002\u0002\u0002\u003e\u003c\u0003\u0002\u0002\u0002\u003e\u003d\u0003\u0002\u0002\u0002\u003f\u0007\u0003\u0002\u0002\u0002\u0040\u004e\u0007\u0020\u0002\u0002\u0041\u0046\u0005\u0006\u0004\u0002\u0042\u0046\u0005\u0014\u000b\u0002\u0043\u0046\u0005\u000a\u0006\u0002\u0044\u0046\u0005\u000c\u0007\u0002\u0045\u0041\u0003\u0002\u0002\u0002\u0045\u0042\u0003\u0002\u0002\u0002\u0045\u0043\u0003\u0002\u0002\u0002\u0045\u0044\u0003\u0002\u0002\u0002\u0046\u0047\u0003\u0002\u0002\u0002\u0047\u0048\u0007\u0020\u0002\u0002\u0048\u004e\u0003\u0002\u0002\u0002\u0049\u004e\u0005\u000e\u0008\u0002\u004a\u004e\u0005\u0010\u0009\u0002\u004b\u004e\u0005\u0012\u000a\u0002\u004c\u004e\u0005\u0004\u0003\u0002\u004d\u0040\u0003\u0002\u0002\u0002\u004d\u0045\u0003\u0002\u0002\u0002\u004d\u0049\u0003\u0002\u0002\u0002\u004d\u004a\u0003\u0002\u0002\u0002\u004d\u004b\u0003\u0002\u0002\u0002\u004d\u004c\u0003\u0002\u0002\u0002\u004e\u0009\u0003\u0002\u0002\u0002\u004f\u0050\u0007\u000c\u0002\u0002\u0050\u0051\u0007\u0026\u0002\u0002\u0051\u0056\u0007\u000e\u0002\u0002\u0052\u0053\u0007\u0024\u0002\u0002\u0053\u0055\u0005\u0014\u000b\u0002\u0054\u0052\u0003\u0002\u0002\u0002\u0055\u0058\u0003\u0002\u0002\u0002\u0056\u0054\u0003\u0002\u0002\u0002\u0056\u0057\u0003\u0002\u0002\u0002\u0057\u0059\u0003\u0002\u0002\u0002\u0058\u0056\u0003\u0002\u0002\u0002\u0059\u005a\u0007\u0027\u0002\u0002\u005a\u000b\u0003\u0002\u0002\u0002\u005b\u005c\u0007\u000d\u0002\u0002\u005c\u005d\u0007\u0026\u0002\u0002\u005d\u0060\u0007\u000e\u0002\u0002\u005e\u005f\u0007\u0024\u0002\u0002\u005f\u0061\u0007\u0010\u0002\u0002\u0060\u005e\u0003\u0002\u0002\u0002\u0061\u0062\u0003\u0002\u0002\u0002\u0062\u0060\u0003\u0002\u0002\u0002\u0062\u0063\u0003\u0002\u0002\u0002\u0063\u0064\u0003\u0002\u0002\u0002\u0064\u0065\u0007\u0027\u0002\u0002\u0065\u000d\u0003\u0002\u0002\u0002\u0066\u006a\u0007\u0028\u0002\u0002\u0067\u0069\u0005\u0004\u0003\u0002\u0068\u0067\u0003\u0002\u0002\u0002\u0069\u006c\u0003\u0002\u0002\u0002\u006a\u0068\u0003\u0002\u0002\u0002\u006a\u006b\u0003\u0002\u0002\u0002\u006b\u0070\u0003\u0002\u0002\u0002\u006c\u006a\u0003\u0002\u0002\u0002\u006d\u006f\u0005\u0008\u0005\u0002\u006e\u006d\u0003\u0002\u0002\u0002\u006f\u0072\u0003\u0002\u0002\u0002\u0070\u006e\u0003\u0002\u0002\u0002\u0070\u0071\u0003\u0002\u0002\u0002\u0071\u0073\u0003\u0002\u0002\u0002\u0072\u0070\u0003\u0002\u0002\u0002\u0073\u0074\u0007\u0029\u0002\u0002\u0074\u000f\u0003\u0002\u0002\u0002\u0075\u0076\u0007\u0004\u0002\u0002\u0076\u007b\u0007\u0026\u0002\u0002\u0077\u007c\u0005\u0006\u0004\u0002\u0078\u007c\u0005\u0014\u000b\u0002\u0079\u007c\u0005\u000a\u0006\u0002\u007a\u007c\u0005\u000c\u0007\u0002\u007b\u0077\u0003\u0002\u0002\u0002\u007b\u0078\u0003\u0002\u0002\u0002\u007b\u0079\u0003\u0002\u0002\u0002\u007b\u007a\u0003\u0002\u0002\u0002\u007c\u007d\u0003\u0002\u0002\u0002\u007d\u007e\u0007\u0027\u0002\u0002\u007e\u0081\u0005\u0008\u0005\u0002\u007f\u0080\u0007\u0005\u0002\u0002\u0080\u0082\u0005\u0008\u0005\u0002\u0081\u007f\u0003\u0002\u0002\u0002\u0081\u0082\u0003\u0002\u0002\u0002\u0082\u0011\u0003\u0002\u0002\u0002\u0083\u0084\u0007\u0006\u0002\u0002\u0084\u0089\u0007\u0026\u0002\u0002\u0085\u008a\u0005\u0006\u0004\u0002\u0086\u008a\u0005\u0014\u000b\u0002\u0087\u008a\u0005\u000a\u0006\u0002\u0088\u008a\u0005\u000c\u0007\u0002\u0089\u0085\u0003\u0002\u0002\u0002\u0089\u0086\u0003\u0002\u0002\u0002\u0089\u0087\u0003\u0002\u0002\u0002\u0089\u0088\u0003\u0002\u0002\u0002\u008a\u008b\u0003\u0002\u0002\u0002\u008b\u008c\u0007\u0027\u0002\u0002\u008c\u008d\u0005\u0008\u0005\u0002\u008d\u0013\u0003\u0002\u0002\u0002\u008e\u0093\u0005\u0016\u000c\u0002\u008f\u0090\u0007\u001c\u0002\u0002\u0090\u0092\u0005\u0016\u000c\u0002\u0091\u008f\u0003\u0002\u0002\u0002\u0092\u0095\u0003\u0002\u0002\u0002\u0093\u0091\u0003\u0002\u0002\u0002\u0093\u0094\u0003\u0002\u0002\u0002\u0094\u0015\u0003\u0002\u0002\u0002\u0095\u0093\u0003\u0002\u0002\u0002\u0096\u009b\u0005\u0018\u000d\u0002\u0097\u0098\u0007\u001d\u0002\u0002\u0098\u009a\u0005\u0018\u000d\u0002\u0099\u0097\u0003\u0002\u0002\u0002\u009a\u009d\u0003\u0002\u0002\u0002\u009b\u0099\u0003\u0002\u0002\u0002\u009b\u009c\u0003\u0002\u0002\u0002\u009c\u0017\u0003\u0002\u0002\u0002\u009d\u009b\u0003\u0002\u0002\u0002\u009e\u00a3\u0005\u001a\u000e\u0002\u009f\u00a0\u0009\u0002\u0002\u0002\u00a0\u00a2\u0005\u001a\u000e\u0002\u00a1\u009f\u0003\u0002\u0002\u0002\u00a2\u00a5\u0003\u0002\u0002\u0002\u00a3\u00a1\u0003\u0002\u0002\u0002\u00a3\u00a4\u0003\u0002\u0002\u0002\u00a4\u0019\u0003\u0002\u0002\u0002\u00a5\u00a3\u0003\u0002\u0002\u0002\u00a6\u00a8\u0005\u001c\u000f\u0002\u00a7\u00a6\u0003\u0002\u0002\u0002\u00a7\u00a8\u0003\u0002\u0002\u0002\u00a8\u00ad\u0003\u0002\u0002\u0002\u00a9\u00aa\u0009\u0003\u0002\u0002\u00aa\u00ac\u0005\u001c\u000f\u0002\u00ab\u00a9\u0003\u0002\u0002\u0002\u00ac\u00af\u0003\u0002\u0002\u0002\u00ad\u00ab\u0003\u0002\u0002\u0002\u00ad\u00ae\u0003\u0002\u0002\u0002\u00ae\u001b\u0003\u0002\u0002\u0002\u00af\u00ad\u0003\u0002\u0002\u0002\u00b0\u00b5\u0005\u001e\u0010\u0002\u00b1\u00b2\u0009\u0004\u0002\u0002\u00b2\u00b4\u0005\u001e\u0010\u0002\u00b3\u00b1\u0003\u0002\u0002\u0002\u00b4\u00b7\u0003\u0002\u0002\u0002\u00b5\u00b3\u0003\u0002\u0002\u0002\u00b5\u00b6\u0003\u0002\u0002\u0002\u00b6\u001d\u0003\u0002\u0002\u0002\u00b7\u00b5\u0003\u0002\u0002\u0002\u00b8\u00bc\u0005\u0020\u0011\u0002\u00b9\u00ba\u0007\u001e\u0002\u0002\u00ba\u00bc\u0005\u001e\u0010\u0002\u00bb\u00b8\u0003\u0002\u0002\u0002\u00bb\u00b9\u0003\u0002\u0002\u0002\u00bc\u001f\u0003\u0002\u0002\u0002\u00bd\u00c5\u0007\u0003\u0002\u0002\u00be\u00c5\u0007\u0021\u0002\u0002\u00bf\u00c5\u0007\u0010\u0002\u0002\u00c0\u00c1\u0007\u0026\u0002\u0002\u00c1\u00c2\u0005\u0014\u000b\u0002\u00c2\u00c3\u0007\u0027\u0002\u0002\u00c3\u00c5\u0003\u0002\u0002\u0002\u00c4\u00bd\u0003\u0002\u0002\u0002\u00c4\u00be\u0003\u0002\u0002\u0002\u00c4\u00bf\u0003\u0002\u0002\u0002\u00c4\u00c0\u0003\u0002\u0002\u0002\u00c5\u0021\u0003\u0002\u0002\u0002\u0017\u0025\u0032\u0036\u003e\u0045\u004d\u0056\u0062\u006a\u0070\u007b\u0081\u0089\u0093\u009b\u00a3\u00a7\u00ad\u00b5\u00bb\u00c4"

        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val BOOL = Tokens.BOOL.id
    private val IF = Tokens.IF.id
    private val ELSE = Tokens.ELSE.id
    private val WHILE = Tokens.WHILE.id
    private val TYPE = Tokens.TYPE.id
    private val WS = Tokens.WS.id
    private val WORD_END = Tokens.WORD_END.id
    private val COMMENT = Tokens.COMMENT.id
    private val LINE_COMMENT = Tokens.LINE_COMMENT.id
    private val PRINTF = Tokens.PRINTF.id
    private val SCANF = Tokens.SCANF.id
    private val STRING_CHAR = Tokens.STRING_CHAR.id
    private val PLACEHOLDER = Tokens.PLACEHOLDER.id
    private val ID = Tokens.ID.id
    private val TIMES = Tokens.TIMES.id
    private val DIVIDED = Tokens.DIVIDED.id
    private val MODULE = Tokens.MODULE.id
    private val PLUS = Tokens.PLUS.id
    private val MINUS = Tokens.MINUS.id
    private val MINOR = Tokens.MINOR.id
    private val MINOREQUAL = Tokens.MINOREQUAL.id
    private val MAJOR = Tokens.MAJOR.id
    private val MAJOREQUAL = Tokens.MAJOREQUAL.id
    private val ISEQUAL = Tokens.ISEQUAL.id
    private val ISNOTEQUAL = Tokens.ISNOTEQUAL.id
    private val OR = Tokens.OR.id
    private val AND = Tokens.AND.id
    private val NOT = Tokens.NOT.id
    private val EQUAL = Tokens.EQUAL.id
    private val ENDOFINSTRUCTION = Tokens.ENDOFINSTRUCTION.id
    private val NUMBER = Tokens.NUMBER.id
    private val LETTER = Tokens.LETTER.id
    private val DIGIT = Tokens.DIGIT.id
    private val COMMA = Tokens.COMMA.id
    private val UNDERSCORE = Tokens.UNDERSCORE.id
    private val RBRACKETOPEN = Tokens.RBRACKETOPEN.id
    private val RBRACKETCLOSE = Tokens.RBRACKETCLOSE.id
    private val CBRACKETOPEN = Tokens.CBRACKETOPEN.id
    private val CBRACKETCLOSE = Tokens.CBRACKETCLOSE.id

    /* Named actions */
	init {
		interpreter = ParserATNSimulator(this, ATN, decisionToDFA, sharedContextCache)
	}
	/* Funcs */
	open class ProgramContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_program.id
	        set(value) { throw RuntimeException() }
		fun findStatement() : List<StatementContext> = getRuleContexts(solver.getType("StatementContext"))
		fun findStatement(i: Int) : StatementContext? = getRuleContext(solver.getType("StatementContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitProgram(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  program() : ProgramContext {
		var _localctx : ProgramContext = ProgramContext(context, state)
		enterRule(_localctx, 0, Rules.RULE_program.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 35
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl BOOL) or (1L shl IF) or (1L shl WHILE) or (1L shl TYPE) or (1L shl PRINTF) or (1L shl SCANF) or (1L shl ID) or (1L shl PLUS) or (1L shl MINUS) or (1L shl MINOR) or (1L shl MINOREQUAL) or (1L shl MAJOR) or (1L shl MAJOREQUAL) or (1L shl ISEQUAL) or (1L shl ISNOTEQUAL) or (1L shl OR) or (1L shl AND) or (1L shl NOT) or (1L shl ENDOFINSTRUCTION) or (1L shl NUMBER) or (1L shl RBRACKETOPEN) or (1L shl CBRACKETOPEN))) != 0L)) {
				if (true){
				if (true){
				this.state = 32
				statement()
				}
				}
				this.state = 37
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class DeclarationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_declaration.id
	        set(value) { throw RuntimeException() }
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: DeclarationContext) {
			super.copyFrom(ctx)
		}
	}
	open class SimpleDeclarationContext : DeclarationContext {
		fun TYPE() : TerminalNode? = getToken(Tokens.TYPE.id, 0)
		fun ID() : TerminalNode? = getToken(Tokens.ID.id, 0)
		fun ENDOFINSTRUCTION() : TerminalNode? = getToken(Tokens.ENDOFINSTRUCTION.id, 0)
		constructor(ctx: DeclarationContext) { copyFrom(ctx) }
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitSimpleDeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class AssignDeclarationContext : DeclarationContext {
		fun TYPE() : TerminalNode? = getToken(Tokens.TYPE.id, 0)
		fun ID() : TerminalNode? = getToken(Tokens.ID.id, 0)
		fun EQUAL() : TerminalNode? = getToken(Tokens.EQUAL.id, 0)
		fun ENDOFINSTRUCTION() : TerminalNode? = getToken(Tokens.ENDOFINSTRUCTION.id, 0)
		fun findAssign() : AssignContext? = getRuleContext(solver.getType("AssignContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findPrintfStatement() : PrintfStatementContext? = getRuleContext(solver.getType("PrintfStatementContext"),0)
		fun findScanfStatement() : ScanfStatementContext? = getRuleContext(solver.getType("ScanfStatementContext"),0)
		constructor(ctx: DeclarationContext) { copyFrom(ctx) }
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitAssignDeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  declaration() : DeclarationContext {
		var _localctx : DeclarationContext = DeclarationContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_declaration.id)
		try {
			this.state = 52
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,2,context) ) {
			1 -> {_localctx = SimpleDeclarationContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 38
			match(TYPE) as Token
			this.state = 39
			match(ID) as Token
			this.state = 40
			match(ENDOFINSTRUCTION) as Token
			}}
			2 -> {_localctx = AssignDeclarationContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 41
			match(TYPE) as Token
			this.state = 42
			match(ID) as Token
			this.state = 43
			match(EQUAL) as Token
			this.state = 48
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,1,context) ) {
			1 -> {if (true){
			this.state = 44
			assign()
			}}
			2 -> {if (true){
			this.state = 45
			expression()
			}}
			3 -> {if (true){
			this.state = 46
			printfStatement()
			}}
			4 -> {if (true){
			this.state = 47
			scanfStatement()
			}}
			}
			this.state = 50
			match(ENDOFINSTRUCTION) as Token
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class AssignContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_assign.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(Tokens.ID.id, 0)
		fun EQUAL() : TerminalNode? = getToken(Tokens.EQUAL.id, 0)
		fun findAssign() : AssignContext? = getRuleContext(solver.getType("AssignContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findPrintfStatement() : PrintfStatementContext? = getRuleContext(solver.getType("PrintfStatementContext"),0)
		fun findScanfStatement() : ScanfStatementContext? = getRuleContext(solver.getType("ScanfStatementContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitAssign(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  assign() : AssignContext {
		var _localctx : AssignContext = AssignContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_assign.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 54
			match(ID) as Token
			this.state = 55
			match(EQUAL) as Token
			this.state = 60
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,3,context) ) {
			1 -> {if (true){
			this.state = 56
			assign()
			}}
			2 -> {if (true){
			this.state = 57
			expression()
			}}
			3 -> {if (true){
			this.state = 58
			printfStatement()
			}}
			4 -> {if (true){
			this.state = 59
			scanfStatement()
			}}
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class StatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_statement.id
	        set(value) { throw RuntimeException() }
		fun ENDOFINSTRUCTION() : TerminalNode? = getToken(Tokens.ENDOFINSTRUCTION.id, 0)
		fun findAssign() : AssignContext? = getRuleContext(solver.getType("AssignContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findPrintfStatement() : PrintfStatementContext? = getRuleContext(solver.getType("PrintfStatementContext"),0)
		fun findScanfStatement() : ScanfStatementContext? = getRuleContext(solver.getType("ScanfStatementContext"),0)
		fun findBlockStatement() : BlockStatementContext? = getRuleContext(solver.getType("BlockStatementContext"),0)
		fun findIfStatement() : IfStatementContext? = getRuleContext(solver.getType("IfStatementContext"),0)
		fun findWhileStatement() : WhileStatementContext? = getRuleContext(solver.getType("WhileStatementContext"),0)
		fun findDeclaration() : DeclarationContext? = getRuleContext(solver.getType("DeclarationContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  statement() : StatementContext {
		var _localctx : StatementContext = StatementContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_statement.id)
		try {
			this.state = 75
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,5,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 62
			match(ENDOFINSTRUCTION) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 67
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,4,context) ) {
			1 -> {if (true){
			this.state = 63
			assign()
			}}
			2 -> {if (true){
			this.state = 64
			expression()
			}}
			3 -> {if (true){
			this.state = 65
			printfStatement()
			}}
			4 -> {if (true){
			this.state = 66
			scanfStatement()
			}}
			}
			this.state = 69
			match(ENDOFINSTRUCTION) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 71
			blockStatement()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 72
			ifStatement()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 73
			whileStatement()
			}}
			6 -> {
			enterOuterAlt(_localctx, 6)
			if (true){
			this.state = 74
			declaration()
			}}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class PrintfStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_printfStatement.id
	        set(value) { throw RuntimeException() }
		fun PRINTF() : TerminalNode? = getToken(Tokens.PRINTF.id, 0)
		fun RBRACKETOPEN() : TerminalNode? = getToken(Tokens.RBRACKETOPEN.id, 0)
		fun STRING_CHAR() : TerminalNode? = getToken(Tokens.STRING_CHAR.id, 0)
		fun RBRACKETCLOSE() : TerminalNode? = getToken(Tokens.RBRACKETCLOSE.id, 0)
		fun COMMA() : List<TerminalNode> = getTokens(Tokens.COMMA.id)
		fun COMMA(i: Int) : TerminalNode = getToken(Tokens.COMMA.id, i) as TerminalNode
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitPrintfStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  printfStatement() : PrintfStatementContext {
		var _localctx : PrintfStatementContext = PrintfStatementContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_printfStatement.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 77
			match(PRINTF) as Token
			this.state = 78
			match(RBRACKETOPEN) as Token
			this.state = 79
			match(STRING_CHAR) as Token
			this.state = 84
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==COMMA) {
				if (true){
				if (true){
				this.state = 80
				match(COMMA) as Token
				if (true){
				this.state = 81
				expression()
				}
				}
				}
				this.state = 86
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 87
			match(RBRACKETCLOSE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ScanfStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_scanfStatement.id
	        set(value) { throw RuntimeException() }
		fun SCANF() : TerminalNode? = getToken(Tokens.SCANF.id, 0)
		fun RBRACKETOPEN() : TerminalNode? = getToken(Tokens.RBRACKETOPEN.id, 0)
		fun STRING_CHAR() : TerminalNode? = getToken(Tokens.STRING_CHAR.id, 0)
		fun RBRACKETCLOSE() : TerminalNode? = getToken(Tokens.RBRACKETCLOSE.id, 0)
		fun COMMA() : List<TerminalNode> = getTokens(Tokens.COMMA.id)
		fun COMMA(i: Int) : TerminalNode = getToken(Tokens.COMMA.id, i) as TerminalNode
		fun ID() : List<TerminalNode> = getTokens(Tokens.ID.id)
		fun ID(i: Int) : TerminalNode = getToken(Tokens.ID.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitScanfStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  scanfStatement() : ScanfStatementContext {
		var _localctx : ScanfStatementContext = ScanfStatementContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_scanfStatement.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 89
			match(SCANF) as Token
			this.state = 90
			match(RBRACKETOPEN) as Token
			this.state = 91
			match(STRING_CHAR) as Token
			this.state = 94 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 92
				match(COMMA) as Token
				if (true){
				this.state = 93
				match(ID) as Token
				}
				}
				}
				this.state = 96 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==COMMA )
			this.state = 98
			match(RBRACKETCLOSE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class BlockStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_blockStatement.id
	        set(value) { throw RuntimeException() }
		fun CBRACKETOPEN() : TerminalNode? = getToken(Tokens.CBRACKETOPEN.id, 0)
		fun CBRACKETCLOSE() : TerminalNode? = getToken(Tokens.CBRACKETCLOSE.id, 0)
		fun findDeclaration() : List<DeclarationContext> = getRuleContexts(solver.getType("DeclarationContext"))
		fun findDeclaration(i: Int) : DeclarationContext? = getRuleContext(solver.getType("DeclarationContext"),i)
		fun findStatement() : List<StatementContext> = getRuleContexts(solver.getType("StatementContext"))
		fun findStatement(i: Int) : StatementContext? = getRuleContext(solver.getType("StatementContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitBlockStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  blockStatement() : BlockStatementContext {
		var _localctx : BlockStatementContext = BlockStatementContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_blockStatement.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 100
			match(CBRACKETOPEN) as Token
			this.state = 104
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,8,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 101
					declaration()
					}
					} 
				}
				this.state = 106
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,8,context)
			}
			this.state = 110
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl BOOL) or (1L shl IF) or (1L shl WHILE) or (1L shl TYPE) or (1L shl PRINTF) or (1L shl SCANF) or (1L shl ID) or (1L shl PLUS) or (1L shl MINUS) or (1L shl MINOR) or (1L shl MINOREQUAL) or (1L shl MAJOR) or (1L shl MAJOREQUAL) or (1L shl ISEQUAL) or (1L shl ISNOTEQUAL) or (1L shl OR) or (1L shl AND) or (1L shl NOT) or (1L shl ENDOFINSTRUCTION) or (1L shl NUMBER) or (1L shl RBRACKETOPEN) or (1L shl CBRACKETOPEN))) != 0L)) {
				if (true){
				if (true){
				this.state = 107
				statement()
				}
				}
				this.state = 112
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 113
			match(CBRACKETCLOSE) as Token
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class IfStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_ifStatement.id
	        set(value) { throw RuntimeException() }
		fun IF() : TerminalNode? = getToken(Tokens.IF.id, 0)
		fun RBRACKETOPEN() : TerminalNode? = getToken(Tokens.RBRACKETOPEN.id, 0)
		fun RBRACKETCLOSE() : TerminalNode? = getToken(Tokens.RBRACKETCLOSE.id, 0)
		fun findStatement() : List<StatementContext> = getRuleContexts(solver.getType("StatementContext"))
		fun findStatement(i: Int) : StatementContext? = getRuleContext(solver.getType("StatementContext"),i)
		fun findAssign() : AssignContext? = getRuleContext(solver.getType("AssignContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findPrintfStatement() : PrintfStatementContext? = getRuleContext(solver.getType("PrintfStatementContext"),0)
		fun findScanfStatement() : ScanfStatementContext? = getRuleContext(solver.getType("ScanfStatementContext"),0)
		fun ELSE() : TerminalNode? = getToken(Tokens.ELSE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitIfStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ifStatement() : IfStatementContext {
		var _localctx : IfStatementContext = IfStatementContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_ifStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 115
			match(IF) as Token
			this.state = 116
			match(RBRACKETOPEN) as Token
			this.state = 121
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,10,context) ) {
			1 -> {if (true){
			this.state = 117
			assign()
			}}
			2 -> {if (true){
			this.state = 118
			expression()
			}}
			3 -> {if (true){
			this.state = 119
			printfStatement()
			}}
			4 -> {if (true){
			this.state = 120
			scanfStatement()
			}}
			}
			this.state = 123
			match(RBRACKETCLOSE) as Token
			this.state = 124
			statement()
			this.state = 127
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,11,context) ) {
			1   -> if (true){
			this.state = 125
			match(ELSE) as Token
			this.state = 126
			statement()
			}
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class WhileStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_whileStatement.id
	        set(value) { throw RuntimeException() }
		fun WHILE() : TerminalNode? = getToken(Tokens.WHILE.id, 0)
		fun RBRACKETOPEN() : TerminalNode? = getToken(Tokens.RBRACKETOPEN.id, 0)
		fun RBRACKETCLOSE() : TerminalNode? = getToken(Tokens.RBRACKETCLOSE.id, 0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		fun findAssign() : AssignContext? = getRuleContext(solver.getType("AssignContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findPrintfStatement() : PrintfStatementContext? = getRuleContext(solver.getType("PrintfStatementContext"),0)
		fun findScanfStatement() : ScanfStatementContext? = getRuleContext(solver.getType("ScanfStatementContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitWhileStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  whileStatement() : WhileStatementContext {
		var _localctx : WhileStatementContext = WhileStatementContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_whileStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 129
			match(WHILE) as Token
			this.state = 130
			match(RBRACKETOPEN) as Token
			this.state = 135
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,12,context) ) {
			1 -> {if (true){
			this.state = 131
			assign()
			}}
			2 -> {if (true){
			this.state = 132
			expression()
			}}
			3 -> {if (true){
			this.state = 133
			printfStatement()
			}}
			4 -> {if (true){
			this.state = 134
			scanfStatement()
			}}
			}
			this.state = 137
			match(RBRACKETCLOSE) as Token
			this.state = 138
			statement()
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class ExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_expression.id
	        set(value) { throw RuntimeException() }
		fun findE1() : List<E1Context> = getRuleContexts(solver.getType("E1Context"))
		fun findE1(i: Int) : E1Context? = getRuleContext(solver.getType("E1Context"),i)
		fun OR() : List<TerminalNode> = getTokens(Tokens.OR.id)
		fun OR(i: Int) : TerminalNode = getToken(Tokens.OR.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expression() : ExpressionContext {
		var _localctx : ExpressionContext = ExpressionContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_expression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 140
			e1()
			this.state = 145
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==OR) {
				if (true){
				if (true){
				this.state = 141
				match(OR) as Token
				this.state = 142
				e1()
				}
				}
				this.state = 147
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class E1Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_e1.id
	        set(value) { throw RuntimeException() }
		fun findE2() : List<E2Context> = getRuleContexts(solver.getType("E2Context"))
		fun findE2(i: Int) : E2Context? = getRuleContext(solver.getType("E2Context"),i)
		fun AND() : List<TerminalNode> = getTokens(Tokens.AND.id)
		fun AND(i: Int) : TerminalNode = getToken(Tokens.AND.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitE1(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  e1() : E1Context {
		var _localctx : E1Context = E1Context(context, state)
		enterRule(_localctx, 20, Rules.RULE_e1.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 148
			e2()
			this.state = 153
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==AND) {
				if (true){
				if (true){
				this.state = 149
				match(AND) as Token
				this.state = 150
				e2()
				}
				}
				this.state = 155
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class E2Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_e2.id
	        set(value) { throw RuntimeException() }
		var op: Token? = null
		fun findE3() : List<E3Context> = getRuleContexts(solver.getType("E3Context"))
		fun findE3(i: Int) : E3Context? = getRuleContext(solver.getType("E3Context"),i)
		fun MINOR() : List<TerminalNode> = getTokens(Tokens.MINOR.id)
		fun MINOR(i: Int) : TerminalNode = getToken(Tokens.MINOR.id, i) as TerminalNode
		fun MINOREQUAL() : List<TerminalNode> = getTokens(Tokens.MINOREQUAL.id)
		fun MINOREQUAL(i: Int) : TerminalNode = getToken(Tokens.MINOREQUAL.id, i) as TerminalNode
		fun MAJOR() : List<TerminalNode> = getTokens(Tokens.MAJOR.id)
		fun MAJOR(i: Int) : TerminalNode = getToken(Tokens.MAJOR.id, i) as TerminalNode
		fun MAJOREQUAL() : List<TerminalNode> = getTokens(Tokens.MAJOREQUAL.id)
		fun MAJOREQUAL(i: Int) : TerminalNode = getToken(Tokens.MAJOREQUAL.id, i) as TerminalNode
		fun ISEQUAL() : List<TerminalNode> = getTokens(Tokens.ISEQUAL.id)
		fun ISEQUAL(i: Int) : TerminalNode = getToken(Tokens.ISEQUAL.id, i) as TerminalNode
		fun ISNOTEQUAL() : List<TerminalNode> = getTokens(Tokens.ISNOTEQUAL.id)
		fun ISNOTEQUAL(i: Int) : TerminalNode = getToken(Tokens.ISNOTEQUAL.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitE2(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  e2() : E2Context {
		var _localctx : E2Context = E2Context(context, state)
		enterRule(_localctx, 22, Rules.RULE_e2.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 156
			e3()
			this.state = 161
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl MINOR) or (1L shl MINOREQUAL) or (1L shl MAJOR) or (1L shl MAJOREQUAL) or (1L shl ISEQUAL) or (1L shl ISNOTEQUAL))) != 0L)) {
				if (true){
				if (true){
				this.state = 157
				(_localctx as E2Context).op = _input!!.LT(1)
				_la = _input!!.LA(1)
				if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl MINOR) or (1L shl MINOREQUAL) or (1L shl MAJOR) or (1L shl MAJOREQUAL) or (1L shl ISEQUAL) or (1L shl ISNOTEQUAL))) != 0L)) ) {
					(_localctx as E2Context).op = errorHandler.recoverInline(this) as Token
				}
				else {
					if ( _input!!.LA(1)== Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 158
				e3()
				}
				}
				this.state = 163
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class E3Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_e3.id
	        set(value) { throw RuntimeException() }
		var op: Token? = null
		fun findE4() : List<E4Context> = getRuleContexts(solver.getType("E4Context"))
		fun findE4(i: Int) : E4Context? = getRuleContext(solver.getType("E4Context"),i)
		fun PLUS() : List<TerminalNode> = getTokens(Tokens.PLUS.id)
		fun PLUS(i: Int) : TerminalNode = getToken(Tokens.PLUS.id, i) as TerminalNode
		fun MINUS() : List<TerminalNode> = getTokens(Tokens.MINUS.id)
		fun MINUS(i: Int) : TerminalNode = getToken(Tokens.MINUS.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitE3(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  e3() : E3Context {
		var _localctx : E3Context = E3Context(context, state)
		enterRule(_localctx, 24, Rules.RULE_e3.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 165
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl BOOL) or (1L shl ID) or (1L shl NOT) or (1L shl NUMBER) or (1L shl RBRACKETOPEN))) != 0L)) {
				if (true){
				this.state = 164
				e4()
				}
			}

			this.state = 171
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==PLUS || _la==MINUS) {
				if (true){
				if (true){
				this.state = 167
				(_localctx as E3Context).op = _input!!.LT(1)
				_la = _input!!.LA(1)
				if ( !(_la==PLUS || _la==MINUS) ) {
					(_localctx as E3Context).op = errorHandler.recoverInline(this) as Token
				}
				else {
					if ( _input!!.LA(1)== Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 168
				e4()
				}
				}
				this.state = 173
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class E4Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_e4.id
	        set(value) { throw RuntimeException() }
		var op: Token? = null
		fun findE5() : List<E5Context> = getRuleContexts(solver.getType("E5Context"))
		fun findE5(i: Int) : E5Context? = getRuleContext(solver.getType("E5Context"),i)
		fun TIMES() : List<TerminalNode> = getTokens(Tokens.TIMES.id)
		fun TIMES(i: Int) : TerminalNode = getToken(Tokens.TIMES.id, i) as TerminalNode
		fun DIVIDED() : List<TerminalNode> = getTokens(Tokens.DIVIDED.id)
		fun DIVIDED(i: Int) : TerminalNode = getToken(Tokens.DIVIDED.id, i) as TerminalNode
		fun MODULE() : List<TerminalNode> = getTokens(Tokens.MODULE.id)
		fun MODULE(i: Int) : TerminalNode = getToken(Tokens.MODULE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitE4(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  e4() : E4Context {
		var _localctx : E4Context = E4Context(context, state)
		enterRule(_localctx, 26, Rules.RULE_e4.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 174
			e5()
			this.state = 179
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl TIMES) or (1L shl DIVIDED) or (1L shl MODULE))) != 0L)) {
				if (true){
				if (true){
				this.state = 175
				(_localctx as E4Context).op = _input!!.LT(1)
				_la = _input!!.LA(1)
				if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl TIMES) or (1L shl DIVIDED) or (1L shl MODULE))) != 0L)) ) {
					(_localctx as E4Context).op = errorHandler.recoverInline(this) as Token
				}
				else {
					if ( _input!!.LA(1)== Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 176
				e5()
				}
				}
				this.state = 181
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class E5Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_e5.id
	        set(value) { throw RuntimeException() }
		fun findE6() : E6Context? = getRuleContext(solver.getType("E6Context"),0)
		fun NOT() : TerminalNode? = getToken(Tokens.NOT.id, 0)
		fun findE5() : E5Context? = getRuleContext(solver.getType("E5Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitE5(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  e5() : E5Context {
		var _localctx : E5Context = E5Context(context, state)
		enterRule(_localctx, 28, Rules.RULE_e5.id)
		try {
			this.state = 185
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			BOOL , ID , NUMBER , RBRACKETOPEN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 182
			e6()
			}}
			NOT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 183
			match(NOT) as Token
			this.state = 184
			e5()
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

	open class E6Context : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_e6.id
	        set(value) { throw RuntimeException() }
		fun BOOL() : TerminalNode? = getToken(Tokens.BOOL.id, 0)
		fun NUMBER() : TerminalNode? = getToken(Tokens.NUMBER.id, 0)
		fun ID() : TerminalNode? = getToken(Tokens.ID.id, 0)
		fun RBRACKETOPEN() : TerminalNode? = getToken(Tokens.RBRACKETOPEN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RBRACKETCLOSE() : TerminalNode? = getToken(Tokens.RBRACKETCLOSE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitE6(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  e6() : E6Context {
		var _localctx : E6Context = E6Context(context, state)
		enterRule(_localctx, 30, Rules.RULE_e6.id)
		try {
			this.state = 194
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			BOOL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 187
			match(BOOL) as Token
			}}
			NUMBER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 188
			match(NUMBER) as Token
			}}
			ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 189
			match(ID) as Token
			}}
			RBRACKETOPEN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 190
			match(RBRACKETOPEN) as Token
			this.state = 191
			expression()
			this.state = 192
			match(RBRACKETCLOSE) as Token
			}}
			else -> throw NoViableAltException(this)
			}
		}
		catch (re: RecognitionException) {
			_localctx.exception = re
			errorHandler.reportError(this, re)
			errorHandler.recover(this, re)
		}
		finally {
			exitRule()
		}
		return _localctx
	}

}