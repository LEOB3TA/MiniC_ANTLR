// Generated from java-escape by ANTLR 4.7.1
import com.strumenta.kotlinmultiplatform.Arrays
import com.strumenta.kotlinmultiplatform.TypeDeclarator
import com.strumenta.kotlinmultiplatform.getType
import com.strumenta.kotlinmultiplatform.toCharArray
import org.antlr.v4.kotlinruntime.*
import org.antlr.v4.kotlinruntime.atn.ATN
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
        override val classesByName : List<KClass<*>> = listOf(MiniCParser.ProgramContext::class,
                                                              MiniCParser.DeclarationContext::class,
                                                              MiniCParser.StatementContext::class,
                                                              MiniCParser.BlockStatementContext::class,
                                                              MiniCParser.IfStatementContext::class,
                                                              MiniCParser.WhileStatementContext::class,
                                                              MiniCParser.ExpressionContext::class,
                                                              MiniCParser.BracketExpressionContext::class,
                                                              MiniCParser.ConditionContext::class,
                                                              MiniCParser.AssignmentContext::class)
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
        WS(1),
        COMMENT(2),
        LINE_COMMENT(3),
        TYPE(4),
        NEGATIVENUMBER(5),
        NUMBER(6),
        DOUBLENUMBER(7),
        DIGIT(8),
        LETTER(9),
        NONZERODIGIT(10),
        ZERODIGIT(11),
        OPERATOR(12),
        NOT(13),
        EQUAL(14),
        BOOL(15),
        IF(16),
        ELSE(17),
        WHILE(18),
        ENDOFISTRUCTION(19),
        UNDERSCORE(20),
        RBRACKETOPEN(21),
        RBRACKETCLOSE(22),
        CBRACKETOPEN(23),
        CBRACKETCLOSE(24),
        ID(25)
    }

    enum class Rules(val id: Int) {
        RULE_program(0),
        RULE_declaration(1),
        RULE_statement(2),
        RULE_blockStatement(3),
        RULE_ifStatement(4),
        RULE_whileStatement(5),
        RULE_expression(6),
        RULE_bracketExpression(7),
        RULE_condition(8),
        RULE_assignment(9)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("program", "declaration", "statement", "blockStatement", 
                                "ifStatement", "whileStatement", "expression", 
                                "bracketExpression", "condition", "assignment")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, "'0'", 
                                                           null, "'!'", 
                                                           "'='", null, 
                                                           "'if'", "'else'", 
                                                           "'while'", "';'", 
                                                           "'_'", "'('", 
                                                           "')'", "'{'", 
                                                           "'}'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "WS", 
                                                            "COMMENT", "LINE_COMMENT", 
                                                            "TYPE", "NEGATIVENUMBER", 
                                                            "NUMBER", "DOUBLENUMBER", 
                                                            "DIGIT", "LETTER", 
                                                            "NONZERODIGIT", 
                                                            "ZERODIGIT", 
                                                            "OPERATOR", 
                                                            "NOT", "EQUAL", 
                                                            "BOOL", "IF", 
                                                            "ELSE", "WHILE", 
                                                            "ENDOFISTRUCTION", 
                                                            "UNDERSCORE", 
                                                            "RBRACKETOPEN", 
                                                            "RBRACKETCLOSE", 
                                                            "CBRACKETOPEN", 
                                                            "CBRACKETCLOSE", 
                                                            "ID")

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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u001b\u0081\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0003\u0002\u0007\u0002\u0018\u000a\u0002\u000c\u0002\u000e\u0002\u001b\u000b\u0002\u0003\u0002\u0007\u0002\u001e\u000a\u0002\u000c\u0002\u000e\u0002\u0021\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u002a\u000a\u0003\u0005\u0003\u002c\u000a\u0003\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u0035\u000a\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u003c\u000a\u0004\u0003\u0005\u0003\u0005\u0007\u0005\u0040\u000a\u0005\u000c\u0005\u000e\u0005\u0043\u000b\u0005\u0003\u0005\u0007\u0005\u0046\u000a\u0005\u000c\u0005\u000e\u0005\u0049\u000b\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u0053\u000a\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u0059\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u0061\u000a\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0005\u000a\u006d\u000a\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u0071\u000a\u000a\u0003\u000a\u0003\u000a\u0003\u000a\u0005\u000a\u0076\u000a\u000a\u0005\u000a\u0078\u000a\u000a\u0003\u000b\u0003\u000b\u0003\u000b\u0006\u000b\u007d\u000a\u000b\u000d\u000b\u000e\u000b\u007e\u0003\u000b\u0002\u0002\u000c\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0012\u0014\u0002\u0003\u0004\u0002\u0007\u0009\u0011\u0011\u0002\u0091\u0002\u0019\u0003\u0002\u0002\u0002\u0004\u0022\u0003\u0002\u0002\u0002\u0006\u003b\u0003\u0002\u0002\u0002\u0008\u003d\u0003\u0002\u0002\u0002\u000a\u004c\u0003\u0002\u0002\u0002\u000c\u005a\u0003\u0002\u0002\u0002\u000e\u0065\u0003\u0002\u0002\u0002\u0010\u0067\u0003\u0002\u0002\u0002\u0012\u006c\u0003\u0002\u0002\u0002\u0014\u0079\u0003\u0002\u0002\u0002\u0016\u0018\u0005\u0004\u0003\u0002\u0017\u0016\u0003\u0002\u0002\u0002\u0018\u001b\u0003\u0002\u0002\u0002\u0019\u0017\u0003\u0002\u0002\u0002\u0019\u001a\u0003\u0002\u0002\u0002\u001a\u001f\u0003\u0002\u0002\u0002\u001b\u0019\u0003\u0002\u0002\u0002\u001c\u001e\u0005\u0006\u0004\u0002\u001d\u001c\u0003\u0002\u0002\u0002\u001e\u0021\u0003\u0002\u0002\u0002\u001f\u001d\u0003\u0002\u0002\u0002\u001f\u0020\u0003\u0002\u0002\u0002\u0020\u0003\u0003\u0002\u0002\u0002\u0021\u001f\u0003\u0002\u0002\u0002\u0022\u0023\u0007\u0006\u0002\u0002\u0023\u002b\u0007\u001b\u0002\u0002\u0024\u0029\u0007\u0010\u0002\u0002\u0025\u002a\u0005\u000e\u0008\u0002\u0026\u002a\u0005\u0010\u0009\u0002\u0027\u002a\u0005\u0012\u000a\u0002\u0028\u002a\u0005\u0014\u000b\u0002\u0029\u0025\u0003\u0002\u0002\u0002\u0029\u0026\u0003\u0002\u0002\u0002\u0029\u0027\u0003\u0002\u0002\u0002\u0029\u0028\u0003\u0002\u0002\u0002\u002a\u002c\u0003\u0002\u0002\u0002\u002b\u0024\u0003\u0002\u0002\u0002\u002b\u002c\u0003\u0002\u0002\u0002\u002c\u002d\u0003\u0002\u0002\u0002\u002d\u002e\u0007\u0015\u0002\u0002\u002e\u0005\u0003\u0002\u0002\u0002\u002f\u003c\u0007\u0015\u0002\u0002\u0030\u0035\u0005\u000e\u0008\u0002\u0031\u0035\u0005\u0010\u0009\u0002\u0032\u0035\u0005\u0012\u000a\u0002\u0033\u0035\u0005\u0014\u000b\u0002\u0034\u0030\u0003\u0002\u0002\u0002\u0034\u0031\u0003\u0002\u0002\u0002\u0034\u0032\u0003\u0002\u0002\u0002\u0034\u0033\u0003\u0002\u0002\u0002\u0035\u0036\u0003\u0002\u0002\u0002\u0036\u0037\u0007\u0015\u0002\u0002\u0037\u003c\u0003\u0002\u0002\u0002\u0038\u003c\u0005\u0008\u0005\u0002\u0039\u003c\u0005\u000a\u0006\u0002\u003a\u003c\u0005\u000c\u0007\u0002\u003b\u002f\u0003\u0002\u0002\u0002\u003b\u0034\u0003\u0002\u0002\u0002\u003b\u0038\u0003\u0002\u0002\u0002\u003b\u0039\u0003\u0002\u0002\u0002\u003b\u003a\u0003\u0002\u0002\u0002\u003c\u0007\u0003\u0002\u0002\u0002\u003d\u0041\u0007\u0019\u0002\u0002\u003e\u0040\u0005\u0004\u0003\u0002\u003f\u003e\u0003\u0002\u0002\u0002\u0040\u0043\u0003\u0002\u0002\u0002\u0041\u003f\u0003\u0002\u0002\u0002\u0041\u0042\u0003\u0002\u0002\u0002\u0042\u0047\u0003\u0002\u0002\u0002\u0043\u0041\u0003\u0002\u0002\u0002\u0044\u0046\u0005\u0006\u0004\u0002\u0045\u0044\u0003\u0002\u0002\u0002\u0046\u0049\u0003\u0002\u0002\u0002\u0047\u0045\u0003\u0002\u0002\u0002\u0047\u0048\u0003\u0002\u0002\u0002\u0048\u004a\u0003\u0002\u0002\u0002\u0049\u0047\u0003\u0002\u0002\u0002\u004a\u004b\u0007\u001a\u0002\u0002\u004b\u0009\u0003\u0002\u0002\u0002\u004c\u004d\u0007\u0012\u0002\u0002\u004d\u0052\u0007\u0017\u0002\u0002\u004e\u0053\u0005\u000e\u0008\u0002\u004f\u0053\u0005\u0010\u0009\u0002\u0050\u0053\u0005\u0012\u000a\u0002\u0051\u0053\u0005\u0014\u000b\u0002\u0052\u004e\u0003\u0002\u0002\u0002\u0052\u004f\u0003\u0002\u0002\u0002\u0052\u0050\u0003\u0002\u0002\u0002\u0052\u0051\u0003\u0002\u0002\u0002\u0053\u0054\u0003\u0002\u0002\u0002\u0054\u0055\u0007\u0018\u0002\u0002\u0055\u0058\u0005\u0006\u0004\u0002\u0056\u0057\u0007\u0013\u0002\u0002\u0057\u0059\u0005\u0006\u0004\u0002\u0058\u0056\u0003\u0002\u0002\u0002\u0058\u0059\u0003\u0002\u0002\u0002\u0059\u000b\u0003\u0002\u0002\u0002\u005a\u005b\u0007\u0014\u0002\u0002\u005b\u0060\u0007\u0017\u0002\u0002\u005c\u0061\u0005\u000e\u0008\u0002\u005d\u0061\u0005\u0010\u0009\u0002\u005e\u0061\u0005\u0012\u000a\u0002\u005f\u0061\u0005\u0014\u000b\u0002\u0060\u005c\u0003\u0002\u0002\u0002\u0060\u005d\u0003\u0002\u0002\u0002\u0060\u005e\u0003\u0002\u0002\u0002\u0060\u005f\u0003\u0002\u0002\u0002\u0061\u0062\u0003\u0002\u0002\u0002\u0062\u0063\u0007\u0018\u0002\u0002\u0063\u0064\u0005\u0006\u0004\u0002\u0064\u000d\u0003\u0002\u0002\u0002\u0065\u0066\u0009\u0002\u0002\u0002\u0066\u000f\u0003\u0002\u0002\u0002\u0067\u0068\u0007\u0017\u0002\u0002\u0068\u0069\u0005\u000e\u0008\u0002\u0069\u006a\u0007\u0018\u0002\u0002\u006a\u0011\u0003\u0002\u0002\u0002\u006b\u006d\u0007\u000f\u0002\u0002\u006c\u006b\u0003\u0002\u0002\u0002\u006c\u006d\u0003\u0002\u0002\u0002\u006d\u0070\u0003\u0002\u0002\u0002\u006e\u0071\u0005\u000e\u0008\u0002\u006f\u0071\u0007\u001b\u0002\u0002\u0070\u006e\u0003\u0002\u0002\u0002\u0070\u006f\u0003\u0002\u0002\u0002\u0071\u0077\u0003\u0002\u0002\u0002\u0072\u0075\u0007\u000e\u0002\u0002\u0073\u0076\u0005\u000e\u0008\u0002\u0074\u0076\u0007\u001b\u0002\u0002\u0075\u0073\u0003\u0002\u0002\u0002\u0075\u0074\u0003\u0002\u0002\u0002\u0076\u0078\u0003\u0002\u0002\u0002\u0077\u0072\u0003\u0002\u0002\u0002\u0077\u0078\u0003\u0002\u0002\u0002\u0078\u0013\u0003\u0002\u0002\u0002\u0079\u007c\u0007\u001b\u0002\u0002\u007a\u007b\u0007\u0010\u0002\u0002\u007b\u007d\u0005\u000e\u0008\u0002\u007c\u007a\u0003\u0002\u0002\u0002\u007d\u007e\u0003\u0002\u0002\u0002\u007e\u007c\u0003\u0002\u0002\u0002\u007e\u007f\u0003\u0002\u0002\u0002\u007f\u0015\u0003\u0002\u0002\u0002\u0012\u0019\u001f\u0029\u002b\u0034\u003b\u0041\u0047\u0052\u0058\u0060\u006c\u0070\u0075\u0077\u007e"

        val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
        init {
        	decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
        		DFA(ATN.getDecisionState(it)!!, it)
        	})


        }
	}

    private val WS = Tokens.WS.id
    private val COMMENT = Tokens.COMMENT.id
    private val LINE_COMMENT = Tokens.LINE_COMMENT.id
    private val TYPE = Tokens.TYPE.id
    private val NEGATIVENUMBER = Tokens.NEGATIVENUMBER.id
    private val NUMBER = Tokens.NUMBER.id
    private val DOUBLENUMBER = Tokens.DOUBLENUMBER.id
    private val DIGIT = Tokens.DIGIT.id
    private val LETTER = Tokens.LETTER.id
    private val NONZERODIGIT = Tokens.NONZERODIGIT.id
    private val ZERODIGIT = Tokens.ZERODIGIT.id
    private val OPERATOR = Tokens.OPERATOR.id
    private val NOT = Tokens.NOT.id
    private val EQUAL = Tokens.EQUAL.id
    private val BOOL = Tokens.BOOL.id
    private val IF = Tokens.IF.id
    private val ELSE = Tokens.ELSE.id
    private val WHILE = Tokens.WHILE.id
    private val ENDOFISTRUCTION = Tokens.ENDOFISTRUCTION.id
    private val UNDERSCORE = Tokens.UNDERSCORE.id
    private val RBRACKETOPEN = Tokens.RBRACKETOPEN.id
    private val RBRACKETCLOSE = Tokens.RBRACKETCLOSE.id
    private val CBRACKETOPEN = Tokens.CBRACKETOPEN.id
    private val CBRACKETCLOSE = Tokens.CBRACKETCLOSE.id
    private val ID = Tokens.ID.id

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
			this.state = 23
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TYPE) {
				if (true){
				if (true){
				this.state = 20
				declaration()
				}
				}
				this.state = 25
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 29
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl NEGATIVENUMBER) or (1L shl NUMBER) or (1L shl DOUBLENUMBER) or (1L shl NOT) or (1L shl BOOL) or (1L shl IF) or (1L shl WHILE) or (1L shl ENDOFISTRUCTION) or (1L shl RBRACKETOPEN) or (1L shl CBRACKETOPEN) or (1L shl ID))) != 0L)) {
				if (true){
				if (true){
				this.state = 26
				statement()
				}
				}
				this.state = 31
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
		fun TYPE() : TerminalNode? = getToken(MiniCParser.Tokens.TYPE.id, 0)
		fun ID() : TerminalNode? = getToken(MiniCParser.Tokens.ID.id, 0)
		fun ENDOFISTRUCTION() : TerminalNode? = getToken(MiniCParser.Tokens.ENDOFISTRUCTION.id, 0)
		fun EQUAL() : TerminalNode? = getToken(MiniCParser.Tokens.EQUAL.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findBracketExpression() : BracketExpressionContext? = getRuleContext(solver.getType("BracketExpressionContext"),0)
		fun findCondition() : ConditionContext? = getRuleContext(solver.getType("ConditionContext"),0)
		fun findAssignment() : AssignmentContext? = getRuleContext(solver.getType("AssignmentContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitDeclaration(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  declaration() : DeclarationContext {
		var _localctx : DeclarationContext = DeclarationContext(context, state)
		enterRule(_localctx, 2, Rules.RULE_declaration.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 32
			match(TYPE) as Token
			this.state = 33
			match(ID) as Token
			this.state = 41
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==EQUAL) {
				if (true){
				this.state = 34
				match(EQUAL) as Token
				this.state = 39
				errorHandler.sync(this)
				when ( interpreter!!.adaptivePredict(_input!!,2,context) ) {
				1 -> {if (true){
				this.state = 35
				expression()
				}}
				2 -> {if (true){
				this.state = 36
				bracketExpression()
				}}
				3 -> {if (true){
				this.state = 37
				condition()
				}}
				4 -> {if (true){
				this.state = 38
				assignment()
				}}
				}
				}
			}

			this.state = 43
			match(ENDOFISTRUCTION) as Token
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
		fun ENDOFISTRUCTION() : TerminalNode? = getToken(MiniCParser.Tokens.ENDOFISTRUCTION.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findBracketExpression() : BracketExpressionContext? = getRuleContext(solver.getType("BracketExpressionContext"),0)
		fun findCondition() : ConditionContext? = getRuleContext(solver.getType("ConditionContext"),0)
		fun findAssignment() : AssignmentContext? = getRuleContext(solver.getType("AssignmentContext"),0)
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
		enterRule(_localctx, 4, Rules.RULE_statement.id)
		try {
			this.state = 57
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ENDOFISTRUCTION  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 45
			match(ENDOFISTRUCTION) as Token
			}}
			NEGATIVENUMBER , NUMBER , DOUBLENUMBER , NOT , BOOL , RBRACKETOPEN , ID  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 50
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,4,context) ) {
			1 -> {if (true){
			this.state = 46
			expression()
			}}
			2 -> {if (true){
			this.state = 47
			bracketExpression()
			}}
			3 -> {if (true){
			this.state = 48
			condition()
			}}
			4 -> {if (true){
			this.state = 49
			assignment()
			}}
			}
			this.state = 52
			match(ENDOFISTRUCTION) as Token
			}}
			CBRACKETOPEN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 54
			blockStatement()
			}}
			IF  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 55
			ifStatement()
			}}
			WHILE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 56
			whileStatement()
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
		enterRule(_localctx, 6, Rules.RULE_blockStatement.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 59
			match(CBRACKETOPEN) as Token
			this.state = 63
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TYPE) {
				if (true){
				if (true){
				this.state = 60
				declaration()
				}
				}
				this.state = 65
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 69
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl NEGATIVENUMBER) or (1L shl NUMBER) or (1L shl DOUBLENUMBER) or (1L shl NOT) or (1L shl BOOL) or (1L shl IF) or (1L shl WHILE) or (1L shl ENDOFISTRUCTION) or (1L shl RBRACKETOPEN) or (1L shl CBRACKETOPEN) or (1L shl ID))) != 0L)) {
				if (true){
				if (true){
				this.state = 66
				statement()
				}
				}
				this.state = 71
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 72
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
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findBracketExpression() : BracketExpressionContext? = getRuleContext(solver.getType("BracketExpressionContext"),0)
		fun findCondition() : ConditionContext? = getRuleContext(solver.getType("ConditionContext"),0)
		fun findAssignment() : AssignmentContext? = getRuleContext(solver.getType("AssignmentContext"),0)
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
		enterRule(_localctx, 8, Rules.RULE_ifStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 74
			match(IF) as Token
			this.state = 75
			match(RBRACKETOPEN) as Token
			this.state = 80
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,8,context) ) {
			1 -> {if (true){
			this.state = 76
			expression()
			}}
			2 -> {if (true){
			this.state = 77
			bracketExpression()
			}}
			3 -> {if (true){
			this.state = 78
			condition()
			}}
			4 -> {if (true){
			this.state = 79
			assignment()
			}}
			}
			this.state = 82
			match(RBRACKETCLOSE) as Token
			this.state = 83
			statement()
			this.state = 86
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,9,context) ) {
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
		fun WHILE() : TerminalNode? = getToken(MiniCParser.Tokens.WHILE.id, 0)
		fun RBRACKETOPEN() : TerminalNode? = getToken(MiniCParser.Tokens.RBRACKETOPEN.id, 0)
		fun RBRACKETCLOSE() : TerminalNode? = getToken(MiniCParser.Tokens.RBRACKETCLOSE.id, 0)
		fun findStatement() : StatementContext? = getRuleContext(solver.getType("StatementContext"),0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findBracketExpression() : BracketExpressionContext? = getRuleContext(solver.getType("BracketExpressionContext"),0)
		fun findCondition() : ConditionContext? = getRuleContext(solver.getType("ConditionContext"),0)
		fun findAssignment() : AssignmentContext? = getRuleContext(solver.getType("AssignmentContext"),0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitWhileStatement(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  whileStatement() : WhileStatementContext {
		var _localctx : WhileStatementContext = WhileStatementContext(context, state)
		enterRule(_localctx, 10, Rules.RULE_whileStatement.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 88
			match(WHILE) as Token
			this.state = 89
			match(RBRACKETOPEN) as Token
			this.state = 94
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,10,context) ) {
			1 -> {if (true){
			this.state = 90
			expression()
			}}
			2 -> {if (true){
			this.state = 91
			bracketExpression()
			}}
			3 -> {if (true){
			this.state = 92
			condition()
			}}
			4 -> {if (true){
			this.state = 93
			assignment()
			}}
			}
			this.state = 96
			match(RBRACKETCLOSE) as Token
			this.state = 97
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
		fun BOOL() : TerminalNode? = getToken(MiniCParser.Tokens.BOOL.id, 0)
		fun NUMBER() : TerminalNode? = getToken(MiniCParser.Tokens.NUMBER.id, 0)
		fun NEGATIVENUMBER() : TerminalNode? = getToken(MiniCParser.Tokens.NEGATIVENUMBER.id, 0)
		fun DOUBLENUMBER() : TerminalNode? = getToken(MiniCParser.Tokens.DOUBLENUMBER.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expression() : ExpressionContext {
		var _localctx : ExpressionContext = ExpressionContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_expression.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 99
			_la = _input!!.LA(1)
			if ( !((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl NEGATIVENUMBER) or (1L shl NUMBER) or (1L shl DOUBLENUMBER) or (1L shl BOOL))) != 0L)) ) {
				errorHandler.recoverInline(this)
			}
			else {
				if ( _input!!.LA(1)==Tokens.EOF.id ) isMatchedEOF = true
				errorHandler.reportMatch(this)
				consume()
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

	open class BracketExpressionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_bracketExpression.id
	        set(value) { throw RuntimeException() }
		fun RBRACKETOPEN() : TerminalNode? = getToken(MiniCParser.Tokens.RBRACKETOPEN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RBRACKETCLOSE() : TerminalNode? = getToken(MiniCParser.Tokens.RBRACKETCLOSE.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitBracketExpression(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  bracketExpression() : BracketExpressionContext {
		var _localctx : BracketExpressionContext = BracketExpressionContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_bracketExpression.id)
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 101
			match(RBRACKETOPEN) as Token
			this.state = 102
			expression()
			this.state = 103
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

	open class ConditionContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_condition.id
	        set(value) { throw RuntimeException() }
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		fun ID() : List<TerminalNode> = getTokens(MiniCParser.Tokens.ID.id)
		fun ID(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.ID.id, i) as TerminalNode
		fun NOT() : TerminalNode? = getToken(MiniCParser.Tokens.NOT.id, 0)
		fun OPERATOR() : TerminalNode? = getToken(MiniCParser.Tokens.OPERATOR.id, 0)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitCondition(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  condition() : ConditionContext {
		var _localctx : ConditionContext = ConditionContext(context, state)
		enterRule(_localctx, 16, Rules.RULE_condition.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 106
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NOT) {
				if (true){
				this.state = 105
				match(NOT) as Token
				}
			}

			this.state = 110
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			NEGATIVENUMBER , NUMBER , DOUBLENUMBER , BOOL  ->  /*LL1AltBlock*/{if (true){
			this.state = 108
			expression()
			}}
			ID  ->  /*LL1AltBlock*/{if (true){
			this.state = 109
			match(ID) as Token
			}}
			else -> throw NoViableAltException(this)
			}
			this.state = 117
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==OPERATOR) {
				if (true){
				this.state = 112
				match(OPERATOR) as Token
				this.state = 115
				errorHandler.sync(this)
				when (_input!!.LA(1)) {
				NEGATIVENUMBER , NUMBER , DOUBLENUMBER , BOOL  ->  /*LL1AltBlock*/{if (true){
				this.state = 113
				expression()
				}}
				ID  ->  /*LL1AltBlock*/{if (true){
				this.state = 114
				match(ID) as Token
				}}
				else -> throw NoViableAltException(this)
				}
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

	open class AssignmentContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_assignment.id
	        set(value) { throw RuntimeException() }
		fun ID() : TerminalNode? = getToken(MiniCParser.Tokens.ID.id, 0)
		fun EQUAL() : List<TerminalNode> = getTokens(MiniCParser.Tokens.EQUAL.id)
		fun EQUAL(i: Int) : TerminalNode = getToken(MiniCParser.Tokens.EQUAL.id, i) as TerminalNode
		fun findExpression() : List<ExpressionContext> = getRuleContexts(solver.getType("ExpressionContext"))
		fun findExpression(i: Int) : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),i)
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitAssignment(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  assignment() : AssignmentContext {
		var _localctx : AssignmentContext = AssignmentContext(context, state)
		enterRule(_localctx, 18, Rules.RULE_assignment.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 119
			match(ID) as Token
			this.state = 122 
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			do {
				if (true){
				if (true){
				this.state = 120
				match(EQUAL) as Token
				this.state = 121
				expression()
				}
				}
				this.state = 124 
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			} while ( _la==EQUAL )
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