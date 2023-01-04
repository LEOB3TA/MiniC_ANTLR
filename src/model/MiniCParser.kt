package model// Generated from java-escape by ANTLR 4.7.1
import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.toCharArray
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATN.Companion.INVALID_ALT_NUMBER
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.ParserATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.DFA
import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor
import org.antlr.v4.kotlinruntime.tree.TerminalNode
import kotlin.reflect.KClass

@Suppress("all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue")
class MiniCParser(input: TokenStream) : Parser(input) {

    object solver : TypeDeclarator {
        override val classesByName : List<KClass<*>> = listOf(
            ProgramContext::class,
                                                              DeclarationContext::class,
                                                              AssignContext::class,
                                                              StatementContext::class,
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
                                                           null, null, "' '", 
                                                           null, null, null, 
                                                           "'*'", "'/'", 
                                                           "'%'", "'+'", 
                                                           "'-'", "'<'", 
                                                           "'<='", "'>'", 
                                                           "'>='", "'=='", 
                                                           "'!='", "'||'", 
                                                           "'&&'", "'!'", 
                                                           "'='", "';'", 
                                                           null, null, null, 
                                                           "'_'", "'('", 
                                                           "')'", "'{'", 
                                                           "'}'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "BOOL", 
                                                            "IF", "ELSE", 
                                                            "WHILE", "TYPE", 
                                                            "WS", "WORD_END", 
                                                            "COMMENT", "LINE_COMMENT", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0024\u009c\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0003\u0002\u0007\u0002\u0020\u000a\u0002\u000c\u0002\u000e\u0002\u0023\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u002b\u000a\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u0031\u000a\u0004\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u0037\u000a\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0003\u0005\u0005\u0005\u003e\u000a\u0005\u0003\u0006\u0003\u0006\u0007\u0006\u0042\u000a\u0006\u000c\u0006\u000e\u0006\u0045\u000b\u0006\u0003\u0006\u0007\u0006\u0048\u000a\u0006\u000c\u0006\u000e\u0006\u004b\u000b\u0006\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u0053\u000a\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u0059\u000a\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0005\u0008\u005f\u000a\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0007\u0009\u0067\u000a\u0009\u000c\u0009\u000e\u0009\u006a\u000b\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0007\u000a\u006f\u000a\u000a\u000c\u000a\u000e\u000a\u0072\u000b\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0007\u000b\u0077\u000a\u000b\u000c\u000b\u000e\u000b\u007a\u000b\u000b\u0003\u000c\u0005\u000c\u007d\u000a\u000c\u0003\u000c\u0003\u000c\u0007\u000c\u0081\u000a\u000c\u000c\u000c\u000e\u000c\u0084\u000b\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0007\u000d\u0089\u000a\u000d\u000c\u000d\u000e\u000d\u008c\u000b\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000e\u0091\u000a\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0005\u000f\u009a\u000a\u000f\u0003\u000f\u0002\u0002\u0010\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0002\u0005\u0003\u0002\u0012\u0017\u0003\u0002\u0010\u0011\u0003\u0002\u000d\u000f\u0002\u00a5\u0002\u0021\u0003\u0002\u0002\u0002\u0004\u002a\u0003\u0002\u0002\u0002\u0006\u002c\u0003\u0002\u0002\u0002\u0008\u003d\u0003\u0002\u0002\u0002\u000a\u003f\u0003\u0002\u0002\u0002\u000c\u004e\u0003\u0002\u0002\u0002\u000e\u005a\u0003\u0002\u0002\u0002\u0010\u0063\u0003\u0002\u0002\u0002\u0012\u006b\u0003\u0002\u0002\u0002\u0014\u0073\u0003\u0002\u0002\u0002\u0016\u007c\u0003\u0002\u0002\u0002\u0018\u0085\u0003\u0002\u0002\u0002\u001a\u0090\u0003\u0002\u0002\u0002\u001c\u0099\u0003\u0002\u0002\u0002\u001e\u0020\u0005\u0008\u0005\u0002\u001f\u001e\u0003\u0002\u0002\u0002\u0020\u0023\u0003\u0002\u0002\u0002\u0021\u001f\u0003\u0002\u0002\u0002\u0021\u0022\u0003\u0002\u0002\u0002\u0022\u0003\u0003\u0002\u0002\u0002\u0023\u0021\u0003\u0002\u0002\u0002\u0024\u0025\u0007\u0007\u0002\u0002\u0025\u002b\u0007\u000c\u0002\u0002\u0026\u0027\u0007\u0007\u0002\u0002\u0027\u0028\u0007\u000c\u0002\u0002\u0028\u0029\u0007\u001b\u0002\u0002\u0029\u002b\u0005\u0010\u0009\u0002\u002a\u0024\u0003\u0002\u0002\u0002\u002a\u0026\u0003\u0002\u0002\u0002\u002b\u0005\u0003\u0002\u0002\u0002\u002c\u002d\u0007\u000c\u0002\u0002\u002d\u0030\u0007\u001b\u0002\u0002\u002e\u0031\u0005\u0006\u0004\u0002\u002f\u0031\u0005\u0010\u0009\u0002\u0030\u002e\u0003\u0002\u0002\u0002\u0030\u002f\u0003\u0002\u0002\u0002\u0031\u0007\u0003\u0002\u0002\u0002\u0032\u003e\u0007\u001c\u0002\u0002\u0033\u0037\u0005\u0006\u0004\u0002\u0034\u0037\u0005\u0010\u0009\u0002\u0035\u0037\u0005\u0004\u0003\u0002\u0036\u0033\u0003\u0002\u0002\u0002\u0036\u0034\u0003\u0002\u0002\u0002\u0036\u0035\u0003\u0002\u0002\u0002\u0037\u0038\u0003\u0002\u0002\u0002\u0038\u0039\u0007\u001c\u0002\u0002\u0039\u003e\u0003\u0002\u0002\u0002\u003a\u003e\u0005\u000a\u0006\u0002\u003b\u003e\u0005\u000c\u0007\u0002\u003c\u003e\u0005\u000e\u0008\u0002\u003d\u0032\u0003\u0002\u0002\u0002\u003d\u0036\u0003\u0002\u0002\u0002\u003d\u003a\u0003\u0002\u0002\u0002\u003d\u003b\u0003\u0002\u0002\u0002\u003d\u003c\u0003\u0002\u0002\u0002\u003e\u0009\u0003\u0002\u0002\u0002\u003f\u0043\u0007\u0023\u0002\u0002\u0040\u0042\u0005\u0004\u0003\u0002\u0041\u0040\u0003\u0002\u0002\u0002\u0042\u0045\u0003\u0002\u0002\u0002\u0043\u0041\u0003\u0002\u0002\u0002\u0043\u0044\u0003\u0002\u0002\u0002\u0044\u0049\u0003\u0002\u0002\u0002\u0045\u0043\u0003\u0002\u0002\u0002\u0046\u0048\u0005\u0008\u0005\u0002\u0047\u0046\u0003\u0002\u0002\u0002\u0048\u004b\u0003\u0002\u0002\u0002\u0049\u0047\u0003\u0002\u0002\u0002\u0049\u004a\u0003\u0002\u0002\u0002\u004a\u004c\u0003\u0002\u0002\u0002\u004b\u0049\u0003\u0002\u0002\u0002\u004c\u004d\u0007\u0024\u0002\u0002\u004d\u000b\u0003\u0002\u0002\u0002\u004e\u004f\u0007\u0004\u0002\u0002\u004f\u0052\u0007\u0021\u0002\u0002\u0050\u0053\u0005\u0006\u0004\u0002\u0051\u0053\u0005\u0010\u0009\u0002\u0052\u0050\u0003\u0002\u0002\u0002\u0052\u0051\u0003\u0002\u0002\u0002\u0053\u0054\u0003\u0002\u0002\u0002\u0054\u0055\u0007\u0022\u0002\u0002\u0055\u0058\u0005\u0008\u0005\u0002\u0056\u0057\u0007\u0005\u0002\u0002\u0057\u0059\u0005\u0008\u0005\u0002\u0058\u0056\u0003\u0002\u0002\u0002\u0058\u0059\u0003\u0002\u0002\u0002\u0059\u000d\u0003\u0002\u0002\u0002\u005a\u005b\u0007\u0006\u0002\u0002\u005b\u005e\u0007\u0021\u0002\u0002\u005c\u005f\u0005\u0006\u0004\u0002\u005d\u005f\u0005\u0010\u0009\u0002\u005e\u005c\u0003\u0002\u0002\u0002\u005e\u005d\u0003\u0002\u0002\u0002\u005f\u0060\u0003\u0002\u0002\u0002\u0060\u0061\u0007\u0022\u0002\u0002\u0061\u0062\u0005\u0008\u0005\u0002\u0062\u000f\u0003\u0002\u0002\u0002\u0063\u0068\u0005\u0012\u000a\u0002\u0064\u0065\u0007\u0018\u0002\u0002\u0065\u0067\u0005\u0012\u000a\u0002\u0066\u0064\u0003\u0002\u0002\u0002\u0067\u006a\u0003\u0002\u0002\u0002\u0068\u0066\u0003\u0002\u0002\u0002\u0068\u0069\u0003\u0002\u0002\u0002\u0069\u0011\u0003\u0002\u0002\u0002\u006a\u0068\u0003\u0002\u0002\u0002\u006b\u0070\u0005\u0014\u000b\u0002\u006c\u006d\u0007\u0019\u0002\u0002\u006d\u006f\u0005\u0014\u000b\u0002\u006e\u006c\u0003\u0002\u0002\u0002\u006f\u0072\u0003\u0002\u0002\u0002\u0070\u006e\u0003\u0002\u0002\u0002\u0070\u0071\u0003\u0002\u0002\u0002\u0071\u0013\u0003\u0002\u0002\u0002\u0072\u0070\u0003\u0002\u0002\u0002\u0073\u0078\u0005\u0016\u000c\u0002\u0074\u0075\u0009\u0002\u0002\u0002\u0075\u0077\u0005\u0016\u000c\u0002\u0076\u0074\u0003\u0002\u0002\u0002\u0077\u007a\u0003\u0002\u0002\u0002\u0078\u0076\u0003\u0002\u0002\u0002\u0078\u0079\u0003\u0002\u0002\u0002\u0079\u0015\u0003\u0002\u0002\u0002\u007a\u0078\u0003\u0002\u0002\u0002\u007b\u007d\u0005\u0018\u000d\u0002\u007c\u007b\u0003\u0002\u0002\u0002\u007c\u007d\u0003\u0002\u0002\u0002\u007d\u0082\u0003\u0002\u0002\u0002\u007e\u007f\u0009\u0003\u0002\u0002\u007f\u0081\u0005\u0018\u000d\u0002\u0080\u007e\u0003\u0002\u0002\u0002\u0081\u0084\u0003\u0002\u0002\u0002\u0082\u0080\u0003\u0002\u0002\u0002\u0082\u0083\u0003\u0002\u0002\u0002\u0083\u0017\u0003\u0002\u0002\u0002\u0084\u0082\u0003\u0002\u0002\u0002\u0085\u008a\u0005\u001a\u000e\u0002\u0086\u0087\u0009\u0004\u0002\u0002\u0087\u0089\u0005\u001a\u000e\u0002\u0088\u0086\u0003\u0002\u0002\u0002\u0089\u008c\u0003\u0002\u0002\u0002\u008a\u0088\u0003\u0002\u0002\u0002\u008a\u008b\u0003\u0002\u0002\u0002\u008b\u0019\u0003\u0002\u0002\u0002\u008c\u008a\u0003\u0002\u0002\u0002\u008d\u0091\u0005\u001c\u000f\u0002\u008e\u008f\u0007\u001a\u0002\u0002\u008f\u0091\u0005\u001a\u000e\u0002\u0090\u008d\u0003\u0002\u0002\u0002\u0090\u008e\u0003\u0002\u0002\u0002\u0091\u001b\u0003\u0002\u0002\u0002\u0092\u009a\u0007\u0003\u0002\u0002\u0093\u009a\u0007\u001d\u0002\u0002\u0094\u009a\u0007\u000c\u0002\u0002\u0095\u0096\u0007\u0021\u0002\u0002\u0096\u0097\u0005\u0010\u0009\u0002\u0097\u0098\u0007\u0022\u0002\u0002\u0098\u009a\u0003\u0002\u0002\u0002\u0099\u0092\u0003\u0002\u0002\u0002\u0099\u0093\u0003\u0002\u0002\u0002\u0099\u0094\u0003\u0002\u0002\u0002\u0099\u0095\u0003\u0002\u0002\u0002\u009a\u001d\u0003\u0002\u0002\u0002\u0014\u0021\u002a\u0030\u0036\u003d\u0043\u0049\u0052\u0058\u005e\u0068\u0070\u0078\u007c\u0082\u008a\u0090\u0099"

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
			this.state = 31
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl BOOL) or (1L shl IF) or (1L shl WHILE) or (1L shl TYPE) or (1L shl ID) or (1L shl PLUS) or (1L shl MINUS) or (1L shl MINOR) or (1L shl MINOREQUAL) or (1L shl MAJOR) or (1L shl MAJOREQUAL) or (1L shl ISEQUAL) or (1L shl ISNOTEQUAL) or (1L shl OR) or (1L shl AND) or (1L shl NOT) or (1L shl ENDOFINSTRUCTION) or (1L shl NUMBER) or (1L shl RBRACKETOPEN) or (1L shl CBRACKETOPEN))) != 0L)) {
				if (true){
				if (true){
				this.state = 28
				statement()
				}
				}
				this.state = 33
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
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
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
			this.state = 40
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,1,context) ) {
			1 -> {_localctx = SimpleDeclarationContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 34
			match(TYPE) as Token
			this.state = 35
			match(ID) as Token
			}}
			2 -> {_localctx = AssignDeclarationContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 36
			match(TYPE) as Token
			this.state = 37
			match(ID) as Token
			this.state = 38
			match(EQUAL) as Token
			this.state = 39
			expression()
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
			this.state = 42
			match(ID) as Token
			this.state = 43
			match(EQUAL) as Token
			this.state = 46
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,2,context) ) {
			1 -> {if (true){
			this.state = 44
			assign()
			}}
			2 -> {if (true){
			this.state = 45
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
		fun ENDOFINSTRUCTION() : TerminalNode? = getToken(Tokens.ENDOFINSTRUCTION.id, 0)
		fun findAssign() : AssignContext? = getRuleContext(solver.getType("AssignContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findDeclaration() : DeclarationContext? = getRuleContext(solver.getType("DeclarationContext"),0)
		fun findBlockStatement() : BlockStatementContext? = getRuleContext(solver.getType("BlockStatementContext"),0)
		fun findIfStatement() : IfStatementContext? = getRuleContext(solver.getType("IfStatementContext"),0)
		fun findWhileStatement() : WhileStatementContext? = getRuleContext(solver.getType("WhileStatementContext"),0)
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
			this.state = 59
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,4,context) ) {
			1 -> {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 48
			match(ENDOFINSTRUCTION) as Token
			}}
			2 -> {
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 52
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,3,context) ) {
			1 -> {if (true){
			this.state = 49
			assign()
			}}
			2 -> {if (true){
			this.state = 50
			expression()
			}}
			3 -> {if (true){
			this.state = 51
			declaration()
			}}
			}
			this.state = 54
			match(ENDOFINSTRUCTION) as Token
			}}
			3 -> {
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 56
			blockStatement()
			}}
			4 -> {
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 57
			ifStatement()
			}}
			5 -> {
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 58
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
		enterRule(_localctx, 8, Rules.RULE_blockStatement.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 61
			match(CBRACKETOPEN) as Token
			this.state = 65
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,5,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 62
					declaration()
					}
					} 
				}
				this.state = 67
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,5,context)
			}
			this.state = 71
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl BOOL) or (1L shl IF) or (1L shl WHILE) or (1L shl TYPE) or (1L shl ID) or (1L shl PLUS) or (1L shl MINUS) or (1L shl MINOR) or (1L shl MINOREQUAL) or (1L shl MAJOR) or (1L shl MAJOREQUAL) or (1L shl ISEQUAL) or (1L shl ISNOTEQUAL) or (1L shl OR) or (1L shl AND) or (1L shl NOT) or (1L shl ENDOFINSTRUCTION) or (1L shl NUMBER) or (1L shl RBRACKETOPEN) or (1L shl CBRACKETOPEN))) != 0L)) {
				if (true){
				if (true){
				this.state = 68
				statement()
				}
				}
				this.state = 73
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 74
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
		enterRule(_localctx, 10, Rules.RULE_ifStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 76
			match(IF) as Token
			this.state = 77
			match(RBRACKETOPEN) as Token
			this.state = 80
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,7,context) ) {
			1 -> {if (true){
			this.state = 78
			assign()
			}}
			2 -> {if (true){
			this.state = 79
			expression()
			}}
			}
			this.state = 82
			match(RBRACKETCLOSE) as Token
			this.state = 83
			statement()
			this.state = 86
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,8,context) ) {
			1   -> if (true){
			this.state = 84
			match(ELSE) as Token
			this.state = 85
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor) return (visitor as MiniCVisitor<out T>).visitWhileStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  whileStatement() : WhileStatementContext {
		var _localctx : WhileStatementContext = WhileStatementContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_whileStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 88
			match(WHILE) as Token
			this.state = 89
			match(RBRACKETOPEN) as Token
			this.state = 92
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,9,context) ) {
			1 -> {if (true){
			this.state = 90
			assign()
			}}
			2 -> {if (true){
			this.state = 91
			expression()
			}}
			}
			this.state = 94
			match(RBRACKETCLOSE) as Token
			this.state = 95
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
		enterRule(_localctx, 14, Rules.RULE_expression.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 97
			e1()
			this.state = 102
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,10,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 98
					match(OR) as Token
					this.state = 99
					e1()
					}
					} 
				}
				this.state = 104
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,10,context)
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
		enterRule(_localctx, 16, Rules.RULE_e1.id)
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 105
			e2()
			this.state = 110
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,11,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 106
					match(AND) as Token
					this.state = 107
					e2()
					}
					} 
				}
				this.state = 112
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,11,context)
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
		enterRule(_localctx, 18, Rules.RULE_e2.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 113
			e3()
			this.state = 118
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,12,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 114
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
					this.state = 115
					e3()
					}
					} 
				}
				this.state = 120
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,12,context)
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
		enterRule(_localctx, 20, Rules.RULE_e3.id)
		var _la: Int
		try {
			var _alt: Int
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 122
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,13,context) ) {
			1   -> if (true){
			this.state = 121
			e4()
			}
			}
			this.state = 128
			errorHandler.sync(this)
			_alt = interpreter!!.adaptivePredict(_input!!,14,context)
			while ( _alt!=2 && _alt!=INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if (true){
					if (true){
					this.state = 124
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
					this.state = 125
					e4()
					}
					} 
				}
				this.state = 130
				errorHandler.sync(this)
				_alt = interpreter!!.adaptivePredict(_input!!,14,context)
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
		enterRule(_localctx, 22, Rules.RULE_e4.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 131
			e5()
			this.state = 136
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl TIMES) or (1L shl DIVIDED) or (1L shl MODULE))) != 0L)) {
				if (true){
				if (true){
				this.state = 132
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
				this.state = 133
				e5()
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
		enterRule(_localctx, 24, Rules.RULE_e5.id)
		try {
			this.state = 142
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			BOOL , ID , NUMBER , RBRACKETOPEN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 139
			e6()
			}}
			NOT  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 140
			match(NOT) as Token
			this.state = 141
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
		enterRule(_localctx, 26, Rules.RULE_e6.id)
		try {
			this.state = 151
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			BOOL  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 144
			match(BOOL) as Token
			}}
			NUMBER  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 145
			match(NUMBER) as Token
			}}
			ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 146
			match(ID) as Token
			}}
			RBRACKETOPEN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 147
			match(RBRACKETOPEN) as Token
			this.state = 148
			expression()
			this.state = 149
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