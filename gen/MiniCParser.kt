// Generated from java-escape by ANTLR 4.7.1
import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import org.antlr.v4.kotlinruntime.misc.Utils;
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.*
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.ParserATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.*
import org.antlr.v4.kotlinruntime.tree.ParseTreeListener
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor
import com.strumenta.kotlinmultiplatform.toCharArray
import kotlin.reflect.KClass

class MiniCParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(MiniCParser.ProgramContext::class,
                                                              MiniCParser.DeclarationContext::class,
                                                              MiniCParser.AssignContext::class,
                                                              MiniCParser.StatementContext::class,
                                                              MiniCParser.BlockStatementContext::class,
                                                              MiniCParser.IfStatementContext::class,
                                                              MiniCParser.WhileStatementContext::class,
                                                              MiniCParser.ExpressionContext::class,
                                                              MiniCParser.E1Context::class,
                                                              MiniCParser.E2Context::class,
                                                              MiniCParser.E3Context::class,
                                                              MiniCParser.E4Context::class,
                                                              MiniCParser.E5Context::class,
                                                              MiniCParser.E6Context::class)
    }

	// TODO verify version of runtime is compatible

    override val grammarFileName: String
        get() = "MiniC.g4"

    override val tokenNames: Array<String?>?
        get() = MiniCParser.Companion.tokenNames
    override val ruleNames: Array<String>?
        get() = MiniCParser.Companion.ruleNames
    override val atn: ATN
        get() = MiniCParser.Companion.ATN

    enum class Tokens(val id: Int) {
        EOF(-1),
        BOOL(1),
        IF(2),
        ELSE(3),
        WHILE(4),
        TYPE(5),
        WS(6),
        COMMENT(7),
        LINE_COMMENT(8),
        ID(9),
        TIMES(10),
        DIVIDED(11),
        MODULE(12),
        PLUS(13),
        MINUS(14),
        MINOR(15),
        MINOREQUAL(16),
        MAJOR(17),
        MAJOREQUAL(18),
        ISEQUAL(19),
        ISNOTEQUAL(20),
        OR(21),
        AND(22),
        NOT(23),
        EQUAL(24),
        ENDOFINSTRUCTION(25),
        NUMBER(26),
        LETTER(27),
        DIGIT(28),
        UNDERSCORE(29),
        RBRACKETOPEN(30),
        RBRACKETCLOSE(31),
        CBRACKETOPEN(32),
        CBRACKETCLOSE(33)
    }

    enum class Rules(val id: Int) {
        RULE_program(0),
        RULE_declaration(1),
        RULE_assign(2),
        RULE_statement(3),
        RULE_blockStatement(4),
        RULE_ifStatement(5),
        RULE_whileStatement(6),
        RULE_expression(7),
        RULE_e1(8),
        RULE_e2(9),
        RULE_e3(10),
        RULE_e4(11),
        RULE_e5(12),
        RULE_e6(13)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("program", "declaration", "assign", "statement", 
                                "blockStatement", "ifStatement", "whileStatement", 
                                "expression", "e1", "e2", "e3", "e4", "e5", 
                                "e6")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, null, "'if'", 
                                                           "'else'", "'while'", 
                                                           null, null, null, 
                                                           null, null, "'*'", 
                                                           "'/'", "'%'", 
                                                           "'+'", "'-'", 
                                                           "'<'", "'<='", 
                                                           "'>'", "'>='", 
                                                           "'=='", "'!='", 
                                                           "'||'", "'&&'", 
                                                           "'!'", "'='", 
                                                           "';'", null, 
                                                           null, null, "'_'", 
                                                           "'('", "')'", 
                                                           "'{'", "'}'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "BOOL", 
                                                            "IF", "ELSE", 
                                                            "WHILE", "TYPE", 
                                                            "WS", "COMMENT", 
                                                            "LINE_COMMENT", 
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
                                                            "DIGIT", "UNDERSCORE", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0023\u00a4\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0003\u0002\u0007\u0002\u0020\u000a\u0002\u000c\u0002\u000e\u0002\u0023\u000b\u0002\u0003\u0002\u0007\u0002\u0026\u000a\u0002\u000c\u0002\u000e\u0002\u0029\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0034\u000a\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u003a\u000a\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u003f\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0046\u000a\u0005\u0003\u0006\u0003\u0006\u0007\u0006\u004a\u000a\u0006\u000c\u0006\u000e\u0006\u004d\u000b\u0006\u0003\u0006\u0007\u0006\u0050\u000a\u0006\u000c\u0006\u000e\u0006\u0053\u000b\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u005b\u000a\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u0061\u000a\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0005\u0008\u0067\u000a\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0007\u0009\u006f\u000a\u0009\u000c\u0009\u000e\u0009\u0072\u000b\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0007\u000a\u0077\u000a\u000a\u000c\u000a\u000e\u000a\u007a\u000b\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0007\u000b\u007f\u000a\u000b\u000c\u000b\u000e\u000b\u0082\u000b\u000b\u0003\u000c\u0005\u000c\u0085\u000a\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u0089\u000a\u000c\u000c\u000c\u000e\u000c\u008c\u000b\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0007\u000d\u0091\u000a\u000d\u000c\u000d\u000e\u000d\u0094\u000b\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u0099\u000a\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u00a2\u000a\u000f\u0003\u000f\u0002\u0002\u0010\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0002\u0005\u0003\u0002\u0011\u0016\u0003\u0002\u000f\u0010\u0003\u0002\u000c\u000e\u0002\u00ad\u0002\u0021\u0003\u0002\u0002\u0002\u0004\u0033\u0003\u0002\u0002\u0002\u0006\u0035\u0003\u0002\u0002\u0002\u0008\u0045\u0003\u0002\u0002\u0002\u000a\u0047\u0003\u0002\u0002\u0002\u000c\u0056\u0003\u0002\u0002\u0002\u000e\u0062\u0003\u0002\u0002\u0002\u0010\u006b\u0003\u0002\u0002\u0002\u0012\u0073\u0003\u0002\u0002\u0002\u0014\u007b\u0003\u0002\u0002\u0002\u0016\u0084\u0003\u0002\u0002\u0002\u0018\u008d\u0003\u0002\u0002\u0002\u001a\u0098\u0003\u0002\u0002\u0002\u001c\u00a1\u0003\u0002\u0002\u0002\u001e\u0020\u0005\u0004\u0003\u0002\u001f\u001e\u0003\u0002\u0002\u0002\u0020\u0023\u0003\u0002\u0002\u0002\u0021\u001f\u0003\u0002\u0002\u0002\u0021\u0022\u0003\u0002\u0002\u0002\u0022\u0027\u0003\u0002\u0002\u0002\u0023\u0021\u0003\u0002\u0002\u0002\u0024\u0026\u0005\u0008\u0005\u0002\u0025\u0024\u0003\u0002\u0002\u0002\u0026\u0029\u0003\u0002\u0002\u0002\u0027\u0025\u0003\u0002\u0002\u0002\u0027\u0028\u0003\u0002\u0002\u0002\u0028\u0003\u0003\u0002\u0002\u0002\u0029\u0027\u0003\u0002\u0002\u0002\u002a\u002b\u0007\u0007\u0002\u0002\u002b\u002c\u0007\u000b\u0002\u0002\u002c\u0034\u0007\u001b\u0002\u0002\u002d\u002e\u0007\u0007\u0002\u0002\u002e\u002f\u0007\u000b\u0002\u0002\u002f\u0030\u0007\u001a\u0002\u0002\u0030\u0031\u0005\u0010\u0009\u0002\u0031\u0032\u0007\u001b\u0002\u0002\u0032\u0034\u0003\u0002\u0002\u0002\u0033\u002a\u0003\u0002\u0002\u0002\u0033\u002d\u0003\u0002\u0002\u0002\u0034\u0005\u0003\u0002\u0002\u0002\u0035\u0036\u0007\u000b\u0002\u0002\u0036\u0039\u0007\u001a\u0002\u0002\u0037\u003a\u0005\u0006\u0004\u0002\u0038\u003a\u0005\u0010\u0009\u0002\u0039\u0037\u0003\u0002\u0002\u0002\u0039\u0038\u0003\u0002\u0002\u0002\u003a\u0007\u0003\u0002\u0002\u0002\u003b\u0046\u0007\u001b\u0002\u0002\u003c\u003f\u0005\u0006\u0004\u0002\u003d\u003f\u0005\u0010\u0009\u0002\u003e\u003c\u0003\u0002\u0002\u0002\u003e\u003d\u0003\u0002\u0002\u0002\u003f\u0040\u0003\u0002\u0002\u0002\u0040\u0041\u0007\u001b\u0002\u0002\u0041\u0046\u0003\u0002\u0002\u0002\u0042\u0046\u0005\u000a\u0006\u0002\u0043\u0046\u0005\u000c\u0007\u0002\u0044\u0046\u0005\u000e\u0008\u0002\u0045\u003b\u0003\u0002\u0002\u0002\u0045\u003e\u0003\u0002\u0002\u0002\u0045\u0042\u0003\u0002\u0002\u0002\u0045\u0043\u0003\u0002\u0002\u0002\u0045\u0044\u0003\u0002\u0002\u0002\u0046\u0009\u0003\u0002\u0002\u0002\u0047\u004b\u0007\u0022\u0002\u0002\u0048\u004a\u0005\u0004\u0003\u0002\u0049\u0048\u0003\u0002\u0002\u0002\u004a\u004d\u0003\u0002\u0002\u0002\u004b\u0049\u0003\u0002\u0002\u0002\u004b\u004c\u0003\u0002\u0002\u0002\u004c\u0051\u0003\u0002\u0002\u0002\u004d\u004b\u0003\u0002\u0002\u0002\u004e\u0050\u0005\u0008\u0005\u0002\u004f\u004e\u0003\u0002\u0002\u0002\u0050\u0053\u0003\u0002\u0002\u0002\u0051\u004f\u0003\u0002\u0002\u0002\u0051\u0052\u0003\u0002\u0002\u0002\u0052\u0054\u0003\u0002\u0002\u0002\u0053\u0051\u0003\u0002\u0002\u0002\u0054\u0055\u0007\u0023\u0002\u0002\u0055\u000b\u0003\u0002\u0002\u0002\u0056\u0057\u0007\u0004\u0002\u0002\u0057\u005a\u0007\u0020\u0002\u0002\u0058\u005b\u0005\u0006\u0004\u0002\u0059\u005b\u0005\u0010\u0009\u0002\u005a\u0058\u0003\u0002\u0002\u0002\u005a\u0059\u0003\u0002\u0002\u0002\u005b\u005c\u0003\u0002\u0002\u0002\u005c\u005d\u0007\u0021\u0002\u0002\u005d\u0060\u0005\u0008\u0005\u0002\u005e\u005f\u0007\u0005\u0002\u0002\u005f\u0061\u0005\u0008\u0005\u0002\u0060\u005e\u0003\u0002\u0002\u0002\u0060\u0061\u0003\u0002\u0002\u0002\u0061\u000d\u0003\u0002\u0002\u0002\u0062\u0063\u0007\u0006\u0002\u0002\u0063\u0066\u0007\u0020\u0002\u0002\u0064\u0067\u0005\u0006\u0004\u0002\u0065\u0067\u0005\u0010\u0009\u0002\u0066\u0064\u0003\u0002\u0002\u0002\u0066\u0065\u0003\u0002\u0002\u0002\u0067\u0068\u0003\u0002\u0002\u0002\u0068\u0069\u0007\u0021\u0002\u0002\u0069\u006a\u0005\u0008\u0005\u0002\u006a\u000f\u0003\u0002\u0002\u0002\u006b\u0070\u0005\u0012\u000a\u0002\u006c\u006d\u0007\u0017\u0002\u0002\u006d\u006f\u0005\u0012\u000a\u0002\u006e\u006c\u0003\u0002\u0002\u0002\u006f\u0072\u0003\u0002\u0002\u0002\u0070\u006e\u0003\u0002\u0002\u0002\u0070\u0071\u0003\u0002\u0002\u0002\u0071\u0011\u0003\u0002\u0002\u0002\u0072\u0070\u0003\u0002\u0002\u0002\u0073\u0078\u0005\u0014\u000b\u0002\u0074\u0075\u0007\u0018\u0002\u0002\u0075\u0077\u0005\u0014\u000b\u0002\u0076\u0074\u0003\u0002\u0002\u0002\u0077\u007a\u0003\u0002\u0002\u0002\u0078\u0076\u0003\u0002\u0002\u0002\u0078\u0079\u0003\u0002\u0002\u0002\u0079\u0013\u0003\u0002\u0002\u0002\u007a\u0078\u0003\u0002\u0002\u0002\u007b\u0080\u0005\u0016\u000c\u0002\u007c\u007d\u0009\u0002\u0002\u0002\u007d\u007f\u0005\u0016\u000c\u0002\u007e\u007c\u0003\u0002\u0002\u0002\u007f\u0082\u0003\u0002\u0002\u0002\u0080\u007e\u0003\u0002\u0002\u0002\u0080\u0081\u0003\u0002\u0002\u0002\u0081\u0015\u0003\u0002\u0002\u0002\u0082\u0080\u0003\u0002\u0002\u0002\u0083\u0085\u0005\u0018\u000d\u0002\u0084\u0083\u0003\u0002\u0002\u0002\u0084\u0085\u0003\u0002\u0002\u0002\u0085\u008a\u0003\u0002\u0002\u0002\u0086\u0087\u0009\u0003\u0002\u0002\u0087\u0089\u0005\u0018\u000d\u0002\u0088\u0086\u0003\u0002\u0002\u0002\u0089\u008c\u0003\u0002\u0002\u0002\u008a\u0088\u0003\u0002\u0002\u0002\u008a\u008b\u0003\u0002\u0002\u0002\u008b\u0017\u0003\u0002\u0002\u0002\u008c\u008a\u0003\u0002\u0002\u0002\u008d\u0092\u0005\u001a\u000e\u0002\u008e\u008f\u0009\u0004\u0002\u0002\u008f\u0091\u0005\u001a\u000e\u0002\u0090\u008e\u0003\u0002\u0002\u0002\u0091\u0094\u0003\u0002\u0002\u0002\u0092\u0090\u0003\u0002\u0002\u0002\u0092\u0093\u0003\u0002\u0002\u0002\u0093\u0019\u0003\u0002\u0002\u0002\u0094\u0092\u0003\u0002\u0002\u0002\u0095\u0099\u0005\u001c\u000f\u0002\u0096\u0097\u0007\u0019\u0002\u0002\u0097\u0099\u0005\u001a\u000e\u0002\u0098\u0095\u0003\u0002\u0002\u0002\u0098\u0096\u0003\u0002\u0002\u0002\u0099\u001b\u0003\u0002\u0002\u0002\u009a\u00a2\u0007\u0003\u0002\u0002\u009b\u00a2\u0007\u001c\u0002\u0002\u009c\u00a2\u0007\u000b\u0002\u0002\u009d\u009e\u0007\u0020\u0002\u0002\u009e\u009f\u0005\u0010\u0009\u0002\u009f\u00a0\u0007\u0021\u0002\u0002\u00a0\u00a2\u0003\u0002\u0002\u0002\u00a1\u009a\u0003\u0002\u0002\u0002\u00a1\u009b\u0003\u0002\u0002\u0002\u00a1\u009c\u0003\u0002\u0002\u0002\u00a1\u009d\u0003\u0002\u0002\u0002\u00a2\u001d\u0003\u0002\u0002\u0002\u0015\u0021\u0027\u0033\u0039\u003e\u0045\u004b\u0051\u005a\u0060\u0066\u0070\u0078\u0080\u0084\u008a\u0092\u0098\u00a1"

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
    private val COMMENT = Tokens.COMMENT.id
    private val LINE_COMMENT = Tokens.LINE_COMMENT.id
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
		fun findDeclaration() : List<DeclarationContext> = getRuleContexts(solver.getType("DeclarationContext"))
		fun findDeclaration(i: Int) : DeclarationContext? = getRuleContext(solver.getType("DeclarationContext"),i)
		fun findStatement() : List<StatementContext> = getRuleContexts(solver.getType("StatementContext"))
		fun findStatement(i: Int) : StatementContext? = getRuleContext(solver.getType("StatementContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitProgram(this)
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
			this.state = 31
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TYPE) {
				if (true){
				if (true){
				this.state = 28
				declaration()
				}
				}
				this.state = 33
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 37
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl BOOL) or (1L shl IF) or (1L shl WHILE) or (1L shl ID) or (1L shl PLUS) or (1L shl MINUS) or (1L shl MINOR) or (1L shl MINOREQUAL) or (1L shl MAJOR) or (1L shl MAJOREQUAL) or (1L shl ISEQUAL) or (1L shl ISNOTEQUAL) or (1L shl OR) or (1L shl AND) or (1L shl NOT) or (1L shl ENDOFINSTRUCTION) or (1L shl NUMBER) or (1L shl RBRACKETOPEN) or (1L shl CBRACKETOPEN))) != 0L)) {
				if (true){
				if (true){
				this.state = 34
				statement()
				}
				}
				this.state = 39
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
		fun TYPE() : TerminalNode? = getToken(MiniCParser.Tokens.TYPE.id, 0)
		fun ID() : TerminalNode? = getToken(MiniCParser.Tokens.ID.id, 0)
		fun ENDOFINSTRUCTION() : TerminalNode? = getToken(MiniCParser.Tokens.ENDOFINSTRUCTION.id, 0)
		constructor(ctx: DeclarationContext) { copyFrom(ctx) }
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitSimpleDeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class AssignDeclarationContext : DeclarationContext {
		fun TYPE() : TerminalNode? = getToken(MiniCParser.Tokens.TYPE.id, 0)
		fun ID() : TerminalNode? = getToken(MiniCParser.Tokens.ID.id, 0)
		fun EQUAL() : TerminalNode? = getToken(MiniCParser.Tokens.EQUAL.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun ENDOFINSTRUCTION() : TerminalNode? = getToken(MiniCParser.Tokens.ENDOFINSTRUCTION.id, 0)
		constructor(ctx: DeclarationContext) { copyFrom(ctx) }
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitAssignDeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  declaration() : DeclarationContext {
		var _localctx : DeclarationContext = DeclarationContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_declaration.id)
		try {
			this.state = 49
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,2,context) ) {
			1 -> {_localctx = SimpleDeclarationContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 40
			match(TYPE) as Token
			this.state = 41
			match(ID) as Token
			this.state = 42
			match(ENDOFINSTRUCTION) as Token
			}}
			2 -> {_localctx = AssignDeclarationContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 43
			match(TYPE) as Token
			this.state = 44
			match(ID) as Token
			this.state = 45
			match(EQUAL) as Token
			this.state = 46
			expression()
			this.state = 47
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
		fun ID() : TerminalNode? = getToken(MiniCParser.Tokens.ID.id, 0)
		fun EQUAL() : TerminalNode? = getToken(MiniCParser.Tokens.EQUAL.id, 0)
		fun findAssign() : AssignContext? = getRuleContext(solver.getType("AssignContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitAssign(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  assign() : AssignContext {
		var _localctx : AssignContext = AssignContext(context, state)
		enterRule(_localctx, 4, Rules.RULE_assign.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 51
			match(ID) as Token
			this.state = 52
			match(EQUAL) as Token
			this.state = 55
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,3,context) ) {
			1 -> {if (true){
			this.state = 53
			assign()
			}}
			2 -> {if (true){
			this.state = 54
			expression()
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
		fun ENDOFINSTRUCTION() : TerminalNode? = getToken(MiniCParser.Tokens.ENDOFINSTRUCTION.id, 0)
		fun findAssign() : AssignContext? = getRuleContext(solver.getType("AssignContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findBlockStatement() : BlockStatementContext? = getRuleContext(solver.getType("BlockStatementContext"),0)
		fun findIfStatement() : IfStatementContext? = getRuleContext(solver.getType("IfStatementContext"),0)
		fun findWhileStatement() : WhileStatementContext? = getRuleContext(solver.getType("WhileStatementContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  statement() : StatementContext {
		var _localctx : StatementContext = StatementContext(context, state)
		enterRule(_localctx, 6, Rules.RULE_statement.id)
		try {
			this.state = 67
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,5,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 57
			match(ENDOFINSTRUCTION) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 60
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,4,context) ) {
			1 -> {if (true){
			this.state = 58
			assign()
			}}
			2 -> {if (true){
			this.state = 59
			expression()
			}}
			}
			this.state = 62
			match(ENDOFINSTRUCTION) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 64
			blockStatement()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 65
			ifStatement()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 66
			whileStatement()
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

	open class BlockStatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_blockStatement.id
	        set(value) { throw RuntimeException() }
		fun CBRACKETOPEN() : TerminalNode? = getToken(MiniCParser.Tokens.CBRACKETOPEN.id, 0)
		fun CBRACKETCLOSE() : TerminalNode? = getToken(MiniCParser.Tokens.CBRACKETCLOSE.id, 0)
		fun findDeclaration() : List<DeclarationContext> = getRuleContexts(solver.getType("DeclarationContext"))
		fun findDeclaration(i: Int) : DeclarationContext? = getRuleContext(solver.getType("DeclarationContext"),i)
		fun findStatement() : List<StatementContext> = getRuleContexts(solver.getType("StatementContext"))
		fun findStatement(i: Int) : StatementContext? = getRuleContext(solver.getType("StatementContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitBlockStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  blockStatement() : BlockStatementContext {
		var _localctx : BlockStatementContext = BlockStatementContext(context, state)
		enterRule(_localctx, 8, Rules.RULE_blockStatement.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 69
			match(CBRACKETOPEN) as Token
			this.state = 73
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TYPE) {
				if (true){
				if (true){
				this.state = 70
				declaration()
				}
				}
				this.state = 75
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 79
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl BOOL) or (1L shl IF) or (1L shl WHILE) or (1L shl ID) or (1L shl PLUS) or (1L shl MINUS) or (1L shl MINOR) or (1L shl MINOREQUAL) or (1L shl MAJOR) or (1L shl MAJOREQUAL) or (1L shl ISEQUAL) or (1L shl ISNOTEQUAL) or (1L shl OR) or (1L shl AND) or (1L shl NOT) or (1L shl ENDOFINSTRUCTION) or (1L shl NUMBER) or (1L shl RBRACKETOPEN) or (1L shl CBRACKETOPEN))) != 0L)) {
				if (true){
				if (true){
				this.state = 76
				statement()
				}
				}
				this.state = 81
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 82
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
		fun IF() : TerminalNode? = getToken(MiniCParser.Tokens.IF.id, 0)
		fun RBRACKETOPEN() : TerminalNode? = getToken(MiniCParser.Tokens.RBRACKETOPEN.id, 0)
		fun RBRACKETCLOSE() : TerminalNode? = getToken(MiniCParser.Tokens.RBRACKETCLOSE.id, 0)
		fun findStatement() : List<StatementContext> = getRuleContexts(solver.getType("StatementContext"))
		fun findStatement(i: Int) : StatementContext? = getRuleContext(solver.getType("StatementContext"),i)
		fun findAssign() : AssignContext? = getRuleContext(solver.getType("AssignContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun ELSE() : TerminalNode? = getToken(MiniCParser.Tokens.ELSE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitIfStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  ifStatement() : IfStatementContext {
		var _localctx : IfStatementContext = IfStatementContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_ifStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 84
			match(IF) as Token
			this.state = 85
			match(RBRACKETOPEN) as Token
			this.state = 88
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,8,context) ) {
			1 -> {if (true){
			this.state = 86
			assign()
			}}
			2 -> {if (true){
			this.state = 87
			expression()
			}}
			}
			this.state = 90
			match(RBRACKETCLOSE) as Token
			this.state = 91
			statement()
			this.state = 94
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,9,context) ) {
			1   -> if (true){
			this.state = 92
			match(ELSE) as Token
			this.state = 93
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
		fun WHILE() : TerminalNode? = getToken(MiniCParser.Tokens.WHILE.id, 0)
		fun RBRACKETOPEN() : TerminalNode? = getToken(MiniCParser.Tokens.RBRACKETOPEN.id, 0)
		fun RBRACKETCLOSE() : TerminalNode? = getToken(MiniCParser.Tokens.RBRACKETCLOSE.id, 0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		fun findAssign() : AssignContext? = getRuleContext(solver.getType("AssignContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitWhileStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  whileStatement() : WhileStatementContext {
		var _localctx : WhileStatementContext = WhileStatementContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_whileStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 96
			match(WHILE) as Token
			this.state = 97
			match(RBRACKETOPEN) as Token
			this.state = 100
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,10,context) ) {
			1 -> {if (true){
			this.state = 98
			assign()
			}}
			2 -> {if (true){
			this.state = 99
			expression()
			}}
			}
			this.state = 102
			match(RBRACKETCLOSE) as Token
			this.state = 103
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
		fun OR() : List<TerminalNode> = getTokens(MiniCParser.Tokens.OR.id)
		fun OR(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.OR.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expression() : ExpressionContext {
		var _localctx : ExpressionContext = ExpressionContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_expression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 105
			e1()
			this.state = 110
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==OR) {
				if (true){
				if (true){
				this.state = 106
				match(OR) as Token
				this.state = 107
				e1()
				}
				}
				this.state = 112
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
		fun AND() : List<TerminalNode> = getTokens(MiniCParser.Tokens.AND.id)
		fun AND(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.AND.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitE1(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  e1() : E1Context {
		var _localctx : E1Context = E1Context(context, state)
		enterRule(_localctx, 16, Rules.RULE_e1.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 113
			e2()
			this.state = 118
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==AND) {
				if (true){
				if (true){
				this.state = 114
				match(AND) as Token
				this.state = 115
				e2()
				}
				}
				this.state = 120
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
		fun MINOR() : List<TerminalNode> = getTokens(MiniCParser.Tokens.MINOR.id)
		fun MINOR(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.MINOR.id, i) as TerminalNode
		fun MINOREQUAL() : List<TerminalNode> = getTokens(MiniCParser.Tokens.MINOREQUAL.id)
		fun MINOREQUAL(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.MINOREQUAL.id, i) as TerminalNode
		fun MAJOR() : List<TerminalNode> = getTokens(MiniCParser.Tokens.MAJOR.id)
		fun MAJOR(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.MAJOR.id, i) as TerminalNode
		fun MAJOREQUAL() : List<TerminalNode> = getTokens(MiniCParser.Tokens.MAJOREQUAL.id)
		fun MAJOREQUAL(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.MAJOREQUAL.id, i) as TerminalNode
		fun ISEQUAL() : List<TerminalNode> = getTokens(MiniCParser.Tokens.ISEQUAL.id)
		fun ISEQUAL(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.ISEQUAL.id, i) as TerminalNode
		fun ISNOTEQUAL() : List<TerminalNode> = getTokens(MiniCParser.Tokens.ISNOTEQUAL.id)
		fun ISNOTEQUAL(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.ISNOTEQUAL.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitE2(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  e2() : E2Context {
		var _localctx : E2Context = E2Context(context, state)
		enterRule(_localctx, 18, Rules.RULE_e2.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 121
			e3()
			this.state = 126
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl MINOR) or (1L shl MINOREQUAL) or (1L shl MAJOR) or (1L shl MAJOREQUAL) or (1L shl ISEQUAL) or (1L shl ISNOTEQUAL))) != 0L)) {
				if (true){
				if (true){
				this.state = 122
				(_localctx as E2Context).op = _input!!.LT(1)
				_la = _input!!.LA(1)
				if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl MINOR) or (1L shl MINOREQUAL) or (1L shl MAJOR) or (1L shl MAJOREQUAL) or (1L shl ISEQUAL) or (1L shl ISNOTEQUAL))) != 0L)) ) {
					(_localctx as E2Context).op = errorHandler.recoverInline(this) as Token
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 123
				e3()
				}
				}
				this.state = 128
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
		fun PLUS() : List<TerminalNode> = getTokens(MiniCParser.Tokens.PLUS.id)
		fun PLUS(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.PLUS.id, i) as TerminalNode
		fun MINUS() : List<TerminalNode> = getTokens(MiniCParser.Tokens.MINUS.id)
		fun MINUS(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.MINUS.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitE3(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  e3() : E3Context {
		var _localctx : E3Context = E3Context(context, state)
		enterRule(_localctx, 20, Rules.RULE_e3.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 130
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl BOOL) or (1L shl ID) or (1L shl NOT) or (1L shl NUMBER) or (1L shl RBRACKETOPEN))) != 0L)) {
				if (true){
				this.state = 129
				e4()
				}
			}

			this.state = 136
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==PLUS || _la==MINUS) {
				if (true){
				if (true){
				this.state = 132
				(_localctx as E3Context).op = _input!!.LT(1)
				_la = _input!!.LA(1)
				if ( !(_la==PLUS || _la==MINUS) ) {
					(_localctx as E3Context).op = errorHandler.recoverInline(this) as Token
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 133
				e4()
				}
				}
				this.state = 138
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
		fun TIMES() : List<TerminalNode> = getTokens(MiniCParser.Tokens.TIMES.id)
		fun TIMES(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.TIMES.id, i) as TerminalNode
		fun DIVIDED() : List<TerminalNode> = getTokens(MiniCParser.Tokens.DIVIDED.id)
		fun DIVIDED(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.DIVIDED.id, i) as TerminalNode
		fun MODULE() : List<TerminalNode> = getTokens(MiniCParser.Tokens.MODULE.id)
		fun MODULE(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.MODULE.id, i) as TerminalNode
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitE4(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  e4() : E4Context {
		var _localctx : E4Context = E4Context(context, state)
		enterRule(_localctx, 22, Rules.RULE_e4.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 139
			e5()
			this.state = 144
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl TIMES) or (1L shl DIVIDED) or (1L shl MODULE))) != 0L)) {
				if (true){
				if (true){
				this.state = 140
				(_localctx as E4Context).op = _input!!.LT(1)
				_la = _input!!.LA(1)
				if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl TIMES) or (1L shl DIVIDED) or (1L shl MODULE))) != 0L)) ) {
					(_localctx as E4Context).op = errorHandler.recoverInline(this) as Token
				}
				else {
					if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
					errorHandler.reportMatch(this)
					consume()
				}
				this.state = 141
				e5()
				}
				}
				this.state = 146
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
		fun NOT() : TerminalNode? = getToken(MiniCParser.Tokens.NOT.id, 0)
		fun findE5() : E5Context? = getRuleContext(solver.getType("E5Context"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitE5(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  e5() : E5Context {
		var _localctx : E5Context = E5Context(context, state)
		enterRule(_localctx, 24, Rules.RULE_e5.id)
		try {
			this.state = 150
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			BOOL , ID , NUMBER , RBRACKETOPEN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 147
			e6()
			}}
			NOT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 148
			match(NOT) as Token
			this.state = 149
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
		fun BOOL() : TerminalNode? = getToken(MiniCParser.Tokens.BOOL.id, 0)
		fun NUMBER() : TerminalNode? = getToken(MiniCParser.Tokens.NUMBER.id, 0)
		fun ID() : TerminalNode? = getToken(MiniCParser.Tokens.ID.id, 0)
		fun RBRACKETOPEN() : TerminalNode? = getToken(MiniCParser.Tokens.RBRACKETOPEN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RBRACKETCLOSE() : TerminalNode? = getToken(MiniCParser.Tokens.RBRACKETCLOSE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitE6(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  e6() : E6Context {
		var _localctx : E6Context = E6Context(context, state)
		enterRule(_localctx, 26, Rules.RULE_e6.id)
		try {
			this.state = 159
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			BOOL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 152
			match(BOOL) as Token
			}}
			NUMBER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 153
			match(NUMBER) as Token
			}}
			ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 154
			match(ID) as Token
			}}
			RBRACKETOPEN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 155
			match(RBRACKETOPEN) as Token
			this.state = 156
			expression()
			this.state = 157
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