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
                                                              MiniCParser.StatementContext::class,
                                                              MiniCParser.BlockStatementContext::class,
                                                              MiniCParser.IfStatementContext::class,
                                                              MiniCParser.WhileStatementContext::class,
                                                              MiniCParser.ExpressionContext::class,
                                                              MiniCParser.OperationContext::class)
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
        NUMBER(9),
        ID(10),
        LETTER(11),
        DIGIT(12),
        OPERATOR(13),
        NOT(14),
        EQUAL(15),
        ENDOFINSTRUCTION(16),
        UNDERSCORE(17),
        RBRACKETOPEN(18),
        RBRACKETCLOSE(19),
        CBRACKETOPEN(20),
        CBRACKETCLOSE(21)
    }

    enum class Rules(val id: Int) {
        RULE_program(0),
        RULE_declaration(1),
        RULE_statement(2),
        RULE_blockStatement(3),
        RULE_ifStatement(4),
        RULE_whileStatement(5),
        RULE_expression(6),
        RULE_operation(7)
    }

	companion object {
	    protected val decisionToDFA : Array<DFA>
    	protected val sharedContextCache = PredictionContextCache()

        val ruleNames = arrayOf("program", "declaration", "statement", "blockStatement", 
                                "ifStatement", "whileStatement", "expression", 
                                "operation")

        private val LITERAL_NAMES = Arrays.asList<String?>(null, null, "'if'", 
                                                           "'else'", "'while'", 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           null, null, null, 
                                                           "'!'", "'='", 
                                                           "';'", "'_'", 
                                                           "'('", "')'", 
                                                           "'{'", "'}'")
        private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, "BOOL", 
                                                            "IF", "ELSE", 
                                                            "WHILE", "TYPE", 
                                                            "WS", "COMMENT", 
                                                            "LINE_COMMENT", 
                                                            "NUMBER", "ID", 
                                                            "LETTER", "DIGIT", 
                                                            "OPERATOR", 
                                                            "NOT", "EQUAL", 
                                                            "ENDOFINSTRUCTION", 
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

        private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0003\u0017\u0078\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0003\u0002\u0007\u0002\u0014\u000a\u0002\u000c\u0002\u000e\u0002\u0017\u000b\u0002\u0003\u0002\u0007\u0002\u001a\u000a\u0002\u000c\u0002\u000e\u0002\u001d\u000b\u0002\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u0026\u000a\u0003\u0003\u0003\u0003\u0003\u0005\u0003\u002a\u000a\u0003\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u002f\u000a\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0003\u0004\u0005\u0004\u0036\u000a\u0004\u0003\u0005\u0003\u0005\u0007\u0005\u003a\u000a\u0005\u000c\u0005\u000e\u0005\u003d\u000b\u0005\u0003\u0005\u0007\u0005\u0040\u000a\u0005\u000c\u0005\u000e\u0005\u0043\u000b\u0005\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u004b\u000a\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006\u0051\u000a\u0006\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0005\u0007\u0057\u000a\u0007\u0003\u0007\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0003\u0008\u0005\u0008\u0066\u000a\u0008\u0005\u0008\u0068\u000a\u0008\u0003\u0009\u0005\u0009\u006b\u000a\u0009\u0003\u0009\u0003\u0009\u0005\u0009\u006f\u000a\u0009\u0003\u0009\u0003\u0009\u0003\u0009\u0005\u0009\u0074\u000a\u0009\u0005\u0009\u0076\u000a\u0009\u0003\u0009\u0002\u0002\u000a\u0002\u0004\u0006\u0008\u000a\u000c\u000e\u0010\u0002\u0002\u0002\u0085\u0002\u0015\u0003\u0002\u0002\u0002\u0004\u0029\u0003\u0002\u0002\u0002\u0006\u0035\u0003\u0002\u0002\u0002\u0008\u0037\u0003\u0002\u0002\u0002\u000a\u0046\u0003\u0002\u0002\u0002\u000c\u0052\u0003\u0002\u0002\u0002\u000e\u0067\u0003\u0002\u0002\u0002\u0010\u006a\u0003\u0002\u0002\u0002\u0012\u0014\u0005\u0004\u0003\u0002\u0013\u0012\u0003\u0002\u0002\u0002\u0014\u0017\u0003\u0002\u0002\u0002\u0015\u0013\u0003\u0002\u0002\u0002\u0015\u0016\u0003\u0002\u0002\u0002\u0016\u001b\u0003\u0002\u0002\u0002\u0017\u0015\u0003\u0002\u0002\u0002\u0018\u001a\u0005\u0006\u0004\u0002\u0019\u0018\u0003\u0002\u0002\u0002\u001a\u001d\u0003\u0002\u0002\u0002\u001b\u0019\u0003\u0002\u0002\u0002\u001b\u001c\u0003\u0002\u0002\u0002\u001c\u0003\u0003\u0002\u0002\u0002\u001d\u001b\u0003\u0002\u0002\u0002\u001e\u001f\u0007\u0007\u0002\u0002\u001f\u002a\u0007\u000c\u0002\u0002\u0020\u0021\u0007\u0007\u0002\u0002\u0021\u0022\u0007\u000c\u0002\u0002\u0022\u0025\u0007\u0011\u0002\u0002\u0023\u0026\u0005\u000e\u0008\u0002\u0024\u0026\u0005\u0010\u0009\u0002\u0025\u0023\u0003\u0002\u0002\u0002\u0025\u0024\u0003\u0002\u0002\u0002\u0026\u0027\u0003\u0002\u0002\u0002\u0027\u0028\u0007\u0012\u0002\u0002\u0028\u002a\u0003\u0002\u0002\u0002\u0029\u001e\u0003\u0002\u0002\u0002\u0029\u0020\u0003\u0002\u0002\u0002\u002a\u0005\u0003\u0002\u0002\u0002\u002b\u0036\u0007\u0012\u0002\u0002\u002c\u002f\u0005\u000e\u0008\u0002\u002d\u002f\u0005\u0010\u0009\u0002\u002e\u002c\u0003\u0002\u0002\u0002\u002e\u002d\u0003\u0002\u0002\u0002\u002f\u0030\u0003\u0002\u0002\u0002\u0030\u0031\u0007\u0012\u0002\u0002\u0031\u0036\u0003\u0002\u0002\u0002\u0032\u0036\u0005\u0008\u0005\u0002\u0033\u0036\u0005\u000a\u0006\u0002\u0034\u0036\u0005\u000c\u0007\u0002\u0035\u002b\u0003\u0002\u0002\u0002\u0035\u002e\u0003\u0002\u0002\u0002\u0035\u0032\u0003\u0002\u0002\u0002\u0035\u0033\u0003\u0002\u0002\u0002\u0035\u0034\u0003\u0002\u0002\u0002\u0036\u0007\u0003\u0002\u0002\u0002\u0037\u003b\u0007\u0016\u0002\u0002\u0038\u003a\u0005\u0004\u0003\u0002\u0039\u0038\u0003\u0002\u0002\u0002\u003a\u003d\u0003\u0002\u0002\u0002\u003b\u0039\u0003\u0002\u0002\u0002\u003b\u003c\u0003\u0002\u0002\u0002\u003c\u0041\u0003\u0002\u0002\u0002\u003d\u003b\u0003\u0002\u0002\u0002\u003e\u0040\u0005\u0006\u0004\u0002\u003f\u003e\u0003\u0002\u0002\u0002\u0040\u0043\u0003\u0002\u0002\u0002\u0041\u003f\u0003\u0002\u0002\u0002\u0041\u0042\u0003\u0002\u0002\u0002\u0042\u0044\u0003\u0002\u0002\u0002\u0043\u0041\u0003\u0002\u0002\u0002\u0044\u0045\u0007\u0017\u0002\u0002\u0045\u0009\u0003\u0002\u0002\u0002\u0046\u0047\u0007\u0004\u0002\u0002\u0047\u004a\u0007\u0014\u0002\u0002\u0048\u004b\u0005\u000e\u0008\u0002\u0049\u004b\u0005\u0010\u0009\u0002\u004a\u0048\u0003\u0002\u0002\u0002\u004a\u0049\u0003\u0002\u0002\u0002\u004b\u004c\u0003\u0002\u0002\u0002\u004c\u004d\u0007\u0015\u0002\u0002\u004d\u0050\u0005\u0006\u0004\u0002\u004e\u004f\u0007\u0005\u0002\u0002\u004f\u0051\u0005\u0006\u0004\u0002\u0050\u004e\u0003\u0002\u0002\u0002\u0050\u0051\u0003\u0002\u0002\u0002\u0051\u000b\u0003\u0002\u0002\u0002\u0052\u0053\u0007\u0006\u0002\u0002\u0053\u0056\u0007\u0014\u0002\u0002\u0054\u0057\u0005\u000e\u0008\u0002\u0055\u0057\u0005\u0010\u0009\u0002\u0056\u0054\u0003\u0002\u0002\u0002\u0056\u0055\u0003\u0002\u0002\u0002\u0057\u0058\u0003\u0002\u0002\u0002\u0058\u0059\u0007\u0015\u0002\u0002\u0059\u005a\u0005\u0006\u0004\u0002\u005a\u000d\u0003\u0002\u0002\u0002\u005b\u0068\u0007\u0003\u0002\u0002\u005c\u0068\u0007\u000b\u0002\u0002\u005d\u005e\u0007\u0014\u0002\u0002\u005e\u005f\u0005\u000e\u0008\u0002\u005f\u0060\u0007\u0015\u0002\u0002\u0060\u0068\u0003\u0002\u0002\u0002\u0061\u0062\u0007\u000c\u0002\u0002\u0062\u0065\u0007\u0011\u0002\u0002\u0063\u0066\u0005\u000e\u0008\u0002\u0064\u0066\u0005\u0010\u0009\u0002\u0065\u0063\u0003\u0002\u0002\u0002\u0065\u0064\u0003\u0002\u0002\u0002\u0066\u0068\u0003\u0002\u0002\u0002\u0067\u005b\u0003\u0002\u0002\u0002\u0067\u005c\u0003\u0002\u0002\u0002\u0067\u005d\u0003\u0002\u0002\u0002\u0067\u0061\u0003\u0002\u0002\u0002\u0068\u000f\u0003\u0002\u0002\u0002\u0069\u006b\u0007\u0010\u0002\u0002\u006a\u0069\u0003\u0002\u0002\u0002\u006a\u006b\u0003\u0002\u0002\u0002\u006b\u006e\u0003\u0002\u0002\u0002\u006c\u006f\u0005\u000e\u0008\u0002\u006d\u006f\u0007\u000c\u0002\u0002\u006e\u006c\u0003\u0002\u0002\u0002\u006e\u006d\u0003\u0002\u0002\u0002\u006f\u0075\u0003\u0002\u0002\u0002\u0070\u0073\u0007\u000f\u0002\u0002\u0071\u0074\u0005\u000e\u0008\u0002\u0072\u0074\u0007\u000c\u0002\u0002\u0073\u0071\u0003\u0002\u0002\u0002\u0073\u0072\u0003\u0002\u0002\u0002\u0074\u0076\u0003\u0002\u0002\u0002\u0075\u0070\u0003\u0002\u0002\u0002\u0075\u0076\u0003\u0002\u0002\u0002\u0076\u0011\u0003\u0002\u0002\u0002\u0013\u0015\u001b\u0025\u0029\u002e\u0035\u003b\u0041\u004a\u0050\u0056\u0065\u0067\u006a\u006e\u0073\u0075"

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
    private val NUMBER = Tokens.NUMBER.id
    private val ID = Tokens.ID.id
    private val LETTER = Tokens.LETTER.id
    private val DIGIT = Tokens.DIGIT.id
    private val OPERATOR = Tokens.OPERATOR.id
    private val NOT = Tokens.NOT.id
    private val EQUAL = Tokens.EQUAL.id
    private val ENDOFINSTRUCTION = Tokens.ENDOFINSTRUCTION.id
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
			this.state = 19
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TYPE) {
				if (true){
				if (true){
				this.state = 16
				declaration()
				}
				}
				this.state = 21
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 25
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl BOOL) or (1L shl IF) or (1L shl WHILE) or (1L shl NUMBER) or (1L shl ID) or (1L shl NOT) or (1L shl ENDOFINSTRUCTION) or (1L shl RBRACKETOPEN) or (1L shl CBRACKETOPEN))) != 0L)) {
				if (true){
				if (true){
				this.state = 22
				statement()
				}
				}
				this.state = 27
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
		fun ENDOFINSTRUCTION() : TerminalNode? = getToken(MiniCParser.Tokens.ENDOFINSTRUCTION.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findOperation() : OperationContext? = getRuleContext(solver.getType("OperationContext"),0)
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
			this.state = 39
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,3,context) ) {
			1 -> {_localctx = SimpleDeclarationContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 28
			match(TYPE) as Token
			this.state = 29
			match(ID) as Token
			}}
			2 -> {_localctx = AssignDeclarationContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 30
			match(TYPE) as Token
			this.state = 31
			match(ID) as Token
			this.state = 32
			match(EQUAL) as Token
			this.state = 35
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,2,context) ) {
			1 -> {if (true){
			this.state = 33
			expression()
			}}
			2 -> {if (true){
			this.state = 34
			operation()
			}}
			}
			this.state = 37
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

	open class StatementContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_statement.id
	        set(value) { throw RuntimeException() }
		fun ENDOFINSTRUCTION() : TerminalNode? = getToken(MiniCParser.Tokens.ENDOFINSTRUCTION.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findOperation() : OperationContext? = getRuleContext(solver.getType("OperationContext"),0)
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
			this.state = 51
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			ENDOFINSTRUCTION  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 41
			match(ENDOFINSTRUCTION) as Token
			}}
			BOOL , NUMBER , ID , NOT , RBRACKETOPEN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 44
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,4,context) ) {
			1 -> {if (true){
			this.state = 42
			expression()
			}}
			2 -> {if (true){
			this.state = 43
			operation()
			}}
			}
			this.state = 46
			match(ENDOFINSTRUCTION) as Token
			}}
			CBRACKETOPEN  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 48
			blockStatement()
			}}
			IF  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 49
			ifStatement()
			}}
			WHILE  ->  /*LL1AltBlock*/{
			enterOuterAlt(_localctx, 5)
			if (true){
			this.state = 50
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
			this.state = 53
			match(CBRACKETOPEN) as Token
			this.state = 57
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while (_la==TYPE) {
				if (true){
				if (true){
				this.state = 54
				declaration()
				}
				}
				this.state = 59
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 63
			errorHandler.sync(this);
			_la = _input!!.LA(1)
			while ((((_la) and 0x3f.inv()) == 0 && ((1L shl _la) and ((1L shl BOOL) or (1L shl IF) or (1L shl WHILE) or (1L shl NUMBER) or (1L shl ID) or (1L shl NOT) or (1L shl ENDOFINSTRUCTION) or (1L shl RBRACKETOPEN) or (1L shl CBRACKETOPEN))) != 0L)) {
				if (true){
				if (true){
				this.state = 60
				statement()
				}
				}
				this.state = 65
				errorHandler.sync(this)
				_la = _input!!.LA(1)
			}
			this.state = 66
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
		fun findOperation() : OperationContext? = getRuleContext(solver.getType("OperationContext"),0)
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
			this.state = 68
			match(IF) as Token
			this.state = 69
			match(RBRACKETOPEN) as Token
			this.state = 72
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,8,context) ) {
			1 -> {if (true){
			this.state = 70
			expression()
			}}
			2 -> {if (true){
			this.state = 71
			operation()
			}}
			}
			this.state = 74
			match(RBRACKETCLOSE) as Token
			this.state = 75
			statement()
			this.state = 78
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,9,context) ) {
			1   -> if (true){
			this.state = 76
			match(ELSE) as Token
			this.state = 77
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
		fun findOperation() : OperationContext? = getRuleContext(solver.getType("OperationContext"),0)
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
			this.state = 80
			match(WHILE) as Token
			this.state = 81
			match(RBRACKETOPEN) as Token
			this.state = 84
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,10,context) ) {
			1 -> {if (true){
			this.state = 82
			expression()
			}}
			2 -> {if (true){
			this.state = 83
			operation()
			}}
			}
			this.state = 86
			match(RBRACKETCLOSE) as Token
			this.state = 87
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
		constructor(parent: ParserRuleContext?, invokingState: Int) : super(parent, invokingState){
		}
	 
		constructor() : super() { }
		fun copyFrom(ctx: ExpressionContext) {
			super.copyFrom(ctx)
		}
	}
	open class BoolExprContext : ExpressionContext {
		fun BOOL() : TerminalNode? = getToken(MiniCParser.Tokens.BOOL.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitBoolExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class NumberExprContext : ExpressionContext {
		fun NUMBER() : TerminalNode? = getToken(MiniCParser.Tokens.NUMBER.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitNumberExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class BracketExprContext : ExpressionContext {
		fun RBRACKETOPEN() : TerminalNode? = getToken(MiniCParser.Tokens.RBRACKETOPEN.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun RBRACKETCLOSE() : TerminalNode? = getToken(MiniCParser.Tokens.RBRACKETCLOSE.id, 0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitBracketExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}
	open class AssignExprContext : ExpressionContext {
		fun ID() : TerminalNode? = getToken(MiniCParser.Tokens.ID.id, 0)
		fun EQUAL() : TerminalNode? = getToken(MiniCParser.Tokens.EQUAL.id, 0)
		fun findExpression() : ExpressionContext? = getRuleContext(solver.getType("ExpressionContext"),0)
		fun findOperation() : OperationContext? = getRuleContext(solver.getType("OperationContext"),0)
		constructor(ctx: ExpressionContext) { copyFrom(ctx) }
		override fun <T> accept(visitor : ParseTreeVisitor<out T>) : T {
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitAssignExpr(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  expression() : ExpressionContext {
		var _localctx : ExpressionContext = ExpressionContext(context, state)
		enterRule(_localctx, 12, Rules.RULE_expression.id)
		try {
			this.state = 101
			errorHandler.sync(this)
			when (_input!!.LA(1)) {
			BOOL  ->  /*LL1AltBlock*/{_localctx = BoolExprContext(_localctx)
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 89
			match(BOOL) as Token
			}}
			NUMBER  ->  /*LL1AltBlock*/{_localctx = NumberExprContext(_localctx)
			enterOuterAlt(_localctx, 2)
			if (true){
			this.state = 90
			match(NUMBER) as Token
			}}
			RBRACKETOPEN  ->  /*LL1AltBlock*/{_localctx = BracketExprContext(_localctx)
			enterOuterAlt(_localctx, 3)
			if (true){
			this.state = 91
			match(RBRACKETOPEN) as Token
			this.state = 92
			expression()
			this.state = 93
			match(RBRACKETCLOSE) as Token
			}}
			ID  ->  /*LL1AltBlock*/{_localctx = AssignExprContext(_localctx)
			enterOuterAlt(_localctx, 4)
			if (true){
			this.state = 95
			match(ID) as Token
			this.state = 96
			match(EQUAL) as Token
			this.state = 99
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,11,context) ) {
			1 -> {if (true){
			this.state = 97
			expression()
			}}
			2 -> {if (true){
			this.state = 98
			operation()
			}}
			}
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

	open class OperationContext : ParserRuleContext {
	    override var ruleIndex: Int
	        get() = Rules.RULE_operation.id
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
			if ( visitor is MiniCVisitor ) return (visitor as MiniCVisitor<out T>).visitOperation(this)
			else return visitor.visitChildren(this)!!
		}
	}

	fun  operation() : OperationContext {
		var _localctx : OperationContext = OperationContext(context, state)
		enterRule(_localctx, 14, Rules.RULE_operation.id)
		var _la: Int
		try {
			enterOuterAlt(_localctx, 1)
			if (true){
			this.state = 104
			errorHandler.sync(this)
			_la = _input!!.LA(1)
			if (_la==NOT) {
				if (true){
				this.state = 103
				match(NOT) as Token
				}
			}

			this.state = 108
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,14,context) ) {
			1 -> {if (true){
			this.state = 106
			expression()
			}}
			2 -> {if (true){
			this.state = 107
			match(ID) as Token
			}}
			}
			this.state = 115
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,16,context) ) {
			1   -> if (true){
			this.state = 110
			match(OPERATOR) as Token
			this.state = 113
			errorHandler.sync(this)
			when ( interpreter!!.adaptivePredict(_input!!,15,context) ) {
			1 -> {if (true){
			this.state = 111
			expression()
			}}
			2 -> {if (true){
			this.state = 112
			match(ID) as Token
			}}
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

}