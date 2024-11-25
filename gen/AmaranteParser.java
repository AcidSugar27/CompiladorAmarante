// Generated from C:/Users/SAMUL/IdeaProjects/AnalizadorSemanticoANTLR/src/Amarante.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AmaranteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, COMMENT=2, Comillas=3, T_dato=4, Cadena=5, If=6, Else=7, Do=8, 
		While=9, For=10, Igual=11, Suma=12, Resta=13, Multiplicacion=14, Division=15, 
		Op_logico=16, Op_relacional=17, Op_atribucion=18, Op_incremento=19, Op_booleano=20, 
		Parentesis_a=21, Parentesis_c=22, Llave_a=23, Llave_c=24, Corchete_a=25, 
		Corchete_c=26, Main=27, P_coma=28, PRINT=29, Identificador=30, Numero=31, 
		ERROR=32;
	public static final int
		RULE_programa = 0, RULE_sentencias = 1, RULE_sentencia = 2, RULE_print_stmt = 3, 
		RULE_declaracion = 4, RULE_if_stmt = 5, RULE_if_else_stmt = 6, RULE_while_stmt = 7, 
		RULE_do_while_stmt = 8, RULE_for_stmt = 9, RULE_expr_for = 10, RULE_declaracion_for = 11, 
		RULE_expr_boleana = 12, RULE_expr_stmt = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencias", "sentencia", "print_stmt", "declaracion", "if_stmt", 
			"if_else_stmt", "while_stmt", "do_while_stmt", "for_stmt", "expr_for", 
			"declaracion_for", "expr_boleana", "expr_stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'\"'", null, null, "'if'", "'else'", "'do'", "'while'", 
			"'for'", "'='", "'+'", "'-'", "'*'", "'/'", null, null, null, null, null, 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'main'", "';'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "COMMENT", "Comillas", "T_dato", "Cadena", "If", "Else", 
			"Do", "While", "For", "Igual", "Suma", "Resta", "Multiplicacion", "Division", 
			"Op_logico", "Op_relacional", "Op_atribucion", "Op_incremento", "Op_booleano", 
			"Parentesis_a", "Parentesis_c", "Llave_a", "Llave_c", "Corchete_a", "Corchete_c", 
			"Main", "P_coma", "PRINT", "Identificador", "Numero", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Amarante.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AmaranteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode Main() { return getToken(AmaranteParser.Main, 0); }
		public TerminalNode Parentesis_a() { return getToken(AmaranteParser.Parentesis_a, 0); }
		public TerminalNode Parentesis_c() { return getToken(AmaranteParser.Parentesis_c, 0); }
		public TerminalNode Llave_a() { return getToken(AmaranteParser.Llave_a, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode Llave_c() { return getToken(AmaranteParser.Llave_c, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmaranteVisitor ) return ((AmaranteVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(Main);
			setState(29);
			match(Parentesis_a);
			setState(30);
			match(Parentesis_c);
			setState(31);
			match(Llave_a);
			setState(32);
			sentencias();
			setState(33);
			match(Llave_c);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciasContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).exitSentencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmaranteVisitor ) return ((AmaranteVisitor<? extends T>)visitor).visitSentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1610614608L) != 0)) {
				{
				{
				setState(35);
				sentencia();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public If_else_stmtContext if_else_stmt() {
			return getRuleContext(If_else_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Do_while_stmtContext do_while_stmt() {
			return getRuleContext(Do_while_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmaranteVisitor ) return ((AmaranteVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				if_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				if_else_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				while_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				do_while_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				for_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				expr_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(48);
				print_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(AmaranteParser.PRINT, 0); }
		public TerminalNode Parentesis_a() { return getToken(AmaranteParser.Parentesis_a, 0); }
		public Expr_boleanaContext expr_boleana() {
			return getRuleContext(Expr_boleanaContext.class,0);
		}
		public TerminalNode Parentesis_c() { return getToken(AmaranteParser.Parentesis_c, 0); }
		public TerminalNode P_coma() { return getToken(AmaranteParser.P_coma, 0); }
		public TerminalNode Cadena() { return getToken(AmaranteParser.Cadena, 0); }
		public TerminalNode Identificador() { return getToken(AmaranteParser.Identificador, 0); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).enterPrint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).exitPrint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmaranteVisitor ) return ((AmaranteVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print_stmt);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(PRINT);
				setState(52);
				match(Parentesis_a);
				setState(53);
				expr_boleana();
				setState(54);
				match(Parentesis_c);
				setState(55);
				match(P_coma);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(PRINT);
				setState(58);
				match(Parentesis_a);
				setState(59);
				match(Cadena);
				setState(60);
				match(Parentesis_c);
				setState(61);
				match(P_coma);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(PRINT);
				setState(63);
				match(Parentesis_a);
				setState(64);
				match(Identificador);
				setState(65);
				match(Parentesis_c);
				setState(66);
				match(P_coma);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode T_dato() { return getToken(AmaranteParser.T_dato, 0); }
		public TerminalNode Identificador() { return getToken(AmaranteParser.Identificador, 0); }
		public TerminalNode P_coma() { return getToken(AmaranteParser.P_coma, 0); }
		public TerminalNode Igual() { return getToken(AmaranteParser.Igual, 0); }
		public TerminalNode Numero() { return getToken(AmaranteParser.Numero, 0); }
		public TerminalNode Cadena() { return getToken(AmaranteParser.Cadena, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmaranteVisitor ) return ((AmaranteVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(69);
				match(T_dato);
				setState(70);
				match(Identificador);
				setState(71);
				match(P_coma);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(72);
				match(T_dato);
				setState(73);
				match(Identificador);
				setState(74);
				match(Igual);
				setState(75);
				match(Numero);
				setState(76);
				match(P_coma);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(77);
				match(T_dato);
				setState(78);
				match(Identificador);
				setState(79);
				match(Igual);
				setState(80);
				match(Cadena);
				setState(81);
				match(P_coma);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(AmaranteParser.If, 0); }
		public TerminalNode Parentesis_a() { return getToken(AmaranteParser.Parentesis_a, 0); }
		public Expr_boleanaContext expr_boleana() {
			return getRuleContext(Expr_boleanaContext.class,0);
		}
		public TerminalNode Parentesis_c() { return getToken(AmaranteParser.Parentesis_c, 0); }
		public TerminalNode Llave_a() { return getToken(AmaranteParser.Llave_a, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode Llave_c() { return getToken(AmaranteParser.Llave_c, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmaranteVisitor ) return ((AmaranteVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(If);
			setState(85);
			match(Parentesis_a);
			setState(86);
			expr_boleana();
			setState(87);
			match(Parentesis_c);
			setState(88);
			match(Llave_a);
			setState(89);
			sentencias();
			setState(90);
			match(Llave_c);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_else_stmtContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(AmaranteParser.If, 0); }
		public TerminalNode Parentesis_a() { return getToken(AmaranteParser.Parentesis_a, 0); }
		public Expr_boleanaContext expr_boleana() {
			return getRuleContext(Expr_boleanaContext.class,0);
		}
		public TerminalNode Parentesis_c() { return getToken(AmaranteParser.Parentesis_c, 0); }
		public List<TerminalNode> Llave_a() { return getTokens(AmaranteParser.Llave_a); }
		public TerminalNode Llave_a(int i) {
			return getToken(AmaranteParser.Llave_a, i);
		}
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public List<TerminalNode> Llave_c() { return getTokens(AmaranteParser.Llave_c); }
		public TerminalNode Llave_c(int i) {
			return getToken(AmaranteParser.Llave_c, i);
		}
		public TerminalNode Else() { return getToken(AmaranteParser.Else, 0); }
		public If_else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).enterIf_else_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).exitIf_else_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmaranteVisitor ) return ((AmaranteVisitor<? extends T>)visitor).visitIf_else_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_else_stmtContext if_else_stmt() throws RecognitionException {
		If_else_stmtContext _localctx = new If_else_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(If);
			setState(93);
			match(Parentesis_a);
			setState(94);
			expr_boleana();
			setState(95);
			match(Parentesis_c);
			setState(96);
			match(Llave_a);
			setState(97);
			sentencias();
			setState(98);
			match(Llave_c);
			setState(99);
			match(Else);
			setState(100);
			match(Llave_a);
			setState(101);
			sentencias();
			setState(102);
			match(Llave_c);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(AmaranteParser.While, 0); }
		public TerminalNode Parentesis_a() { return getToken(AmaranteParser.Parentesis_a, 0); }
		public Expr_boleanaContext expr_boleana() {
			return getRuleContext(Expr_boleanaContext.class,0);
		}
		public TerminalNode Parentesis_c() { return getToken(AmaranteParser.Parentesis_c, 0); }
		public TerminalNode Llave_a() { return getToken(AmaranteParser.Llave_a, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode Llave_c() { return getToken(AmaranteParser.Llave_c, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmaranteVisitor ) return ((AmaranteVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(While);
			setState(105);
			match(Parentesis_a);
			setState(106);
			expr_boleana();
			setState(107);
			match(Parentesis_c);
			setState(108);
			match(Llave_a);
			setState(109);
			sentencias();
			setState(110);
			match(Llave_c);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_while_stmtContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(AmaranteParser.Do, 0); }
		public TerminalNode Llave_a() { return getToken(AmaranteParser.Llave_a, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode Llave_c() { return getToken(AmaranteParser.Llave_c, 0); }
		public TerminalNode While() { return getToken(AmaranteParser.While, 0); }
		public TerminalNode Parentesis_a() { return getToken(AmaranteParser.Parentesis_a, 0); }
		public Expr_boleanaContext expr_boleana() {
			return getRuleContext(Expr_boleanaContext.class,0);
		}
		public TerminalNode Parentesis_c() { return getToken(AmaranteParser.Parentesis_c, 0); }
		public TerminalNode P_coma() { return getToken(AmaranteParser.P_coma, 0); }
		public Do_while_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).enterDo_while_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).exitDo_while_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmaranteVisitor ) return ((AmaranteVisitor<? extends T>)visitor).visitDo_while_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_stmtContext do_while_stmt() throws RecognitionException {
		Do_while_stmtContext _localctx = new Do_while_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_do_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(Do);
			setState(113);
			match(Llave_a);
			setState(114);
			sentencias();
			setState(115);
			match(Llave_c);
			setState(116);
			match(While);
			setState(117);
			match(Parentesis_a);
			setState(118);
			expr_boleana();
			setState(119);
			match(Parentesis_c);
			setState(120);
			match(P_coma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(AmaranteParser.For, 0); }
		public TerminalNode Parentesis_a() { return getToken(AmaranteParser.Parentesis_a, 0); }
		public Expr_forContext expr_for() {
			return getRuleContext(Expr_forContext.class,0);
		}
		public TerminalNode Parentesis_c() { return getToken(AmaranteParser.Parentesis_c, 0); }
		public TerminalNode Llave_a() { return getToken(AmaranteParser.Llave_a, 0); }
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public TerminalNode Llave_c() { return getToken(AmaranteParser.Llave_c, 0); }
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmaranteVisitor ) return ((AmaranteVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(For);
			setState(123);
			match(Parentesis_a);
			setState(124);
			expr_for();
			setState(125);
			match(Parentesis_c);
			setState(126);
			match(Llave_a);
			setState(127);
			sentencias();
			setState(128);
			match(Llave_c);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_forContext extends ParserRuleContext {
		public TerminalNode T_dato() { return getToken(AmaranteParser.T_dato, 0); }
		public TerminalNode Identificador() { return getToken(AmaranteParser.Identificador, 0); }
		public TerminalNode Igual() { return getToken(AmaranteParser.Igual, 0); }
		public TerminalNode Numero() { return getToken(AmaranteParser.Numero, 0); }
		public List<TerminalNode> P_coma() { return getTokens(AmaranteParser.P_coma); }
		public TerminalNode P_coma(int i) {
			return getToken(AmaranteParser.P_coma, i);
		}
		public Expr_boleanaContext expr_boleana() {
			return getRuleContext(Expr_boleanaContext.class,0);
		}
		public Declaracion_forContext declaracion_for() {
			return getRuleContext(Declaracion_forContext.class,0);
		}
		public Expr_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).enterExpr_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).exitExpr_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmaranteVisitor ) return ((AmaranteVisitor<? extends T>)visitor).visitExpr_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_forContext expr_for() throws RecognitionException {
		Expr_forContext _localctx = new Expr_forContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr_for);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_dato:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(130);
				match(T_dato);
				setState(131);
				match(Identificador);
				setState(132);
				match(Igual);
				setState(133);
				match(Numero);
				setState(134);
				match(P_coma);
				setState(135);
				expr_boleana();
				setState(136);
				match(P_coma);
				setState(137);
				declaracion_for();
				}
				}
				break;
			case Identificador:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(139);
				match(Identificador);
				setState(140);
				match(Igual);
				setState(141);
				match(Numero);
				setState(142);
				match(P_coma);
				setState(143);
				expr_boleana();
				setState(144);
				match(P_coma);
				setState(145);
				declaracion_for();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion_forContext extends ParserRuleContext {
		public TerminalNode Identificador() { return getToken(AmaranteParser.Identificador, 0); }
		public TerminalNode Op_atribucion() { return getToken(AmaranteParser.Op_atribucion, 0); }
		public TerminalNode Numero() { return getToken(AmaranteParser.Numero, 0); }
		public TerminalNode Op_incremento() { return getToken(AmaranteParser.Op_incremento, 0); }
		public Declaracion_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).enterDeclaracion_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).exitDeclaracion_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmaranteVisitor ) return ((AmaranteVisitor<? extends T>)visitor).visitDeclaracion_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_forContext declaracion_for() throws RecognitionException {
		Declaracion_forContext _localctx = new Declaracion_forContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracion_for);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(149);
				match(Identificador);
				setState(150);
				match(Op_atribucion);
				setState(151);
				match(Numero);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(152);
				match(Identificador);
				setState(153);
				match(Op_incremento);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(154);
				match(Op_incremento);
				setState(155);
				match(Identificador);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_boleanaContext extends ParserRuleContext {
		public TerminalNode Identificador() { return getToken(AmaranteParser.Identificador, 0); }
		public TerminalNode Op_relacional() { return getToken(AmaranteParser.Op_relacional, 0); }
		public TerminalNode Numero() { return getToken(AmaranteParser.Numero, 0); }
		public TerminalNode Op_booleano() { return getToken(AmaranteParser.Op_booleano, 0); }
		public Expr_boleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_boleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).enterExpr_boleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).exitExpr_boleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmaranteVisitor ) return ((AmaranteVisitor<? extends T>)visitor).visitExpr_boleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_boleanaContext expr_boleana() throws RecognitionException {
		Expr_boleanaContext _localctx = new Expr_boleanaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr_boleana);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identificador:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(Identificador);
				setState(159);
				match(Op_relacional);
				setState(160);
				match(Numero);
				}
				break;
			case Op_booleano:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(Op_booleano);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_stmtContext extends ParserRuleContext {
		public TerminalNode Identificador() { return getToken(AmaranteParser.Identificador, 0); }
		public TerminalNode Op_atribucion() { return getToken(AmaranteParser.Op_atribucion, 0); }
		public TerminalNode Numero() { return getToken(AmaranteParser.Numero, 0); }
		public TerminalNode P_coma() { return getToken(AmaranteParser.P_coma, 0); }
		public TerminalNode Cadena() { return getToken(AmaranteParser.Cadena, 0); }
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AmaranteListener ) ((AmaranteListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AmaranteVisitor ) return ((AmaranteVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr_stmt);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(Identificador);
				setState(165);
				match(Op_atribucion);
				setState(166);
				match(Numero);
				setState(167);
				match(P_coma);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(Identificador);
				setState(169);
				match(Op_atribucion);
				setState(170);
				match(Cadena);
				setState(171);
				match(P_coma);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u00af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001%\b\u0001"+
		"\n\u0001\f\u0001(\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00022\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003D\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004S\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0094\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009d\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00a3\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ad\b\r\u0001\r\u0000\u0000\u000e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u0000\u0000\u00b1\u0000\u001c\u0001\u0000\u0000\u0000\u0002&\u0001\u0000"+
		"\u0000\u0000\u00041\u0001\u0000\u0000\u0000\u0006C\u0001\u0000\u0000\u0000"+
		"\bR\u0001\u0000\u0000\u0000\nT\u0001\u0000\u0000\u0000\f\\\u0001\u0000"+
		"\u0000\u0000\u000eh\u0001\u0000\u0000\u0000\u0010p\u0001\u0000\u0000\u0000"+
		"\u0012z\u0001\u0000\u0000\u0000\u0014\u0093\u0001\u0000\u0000\u0000\u0016"+
		"\u009c\u0001\u0000\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000\u001a"+
		"\u00ac\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u001b\u0000\u0000\u001d"+
		"\u001e\u0005\u0015\u0000\u0000\u001e\u001f\u0005\u0016\u0000\u0000\u001f"+
		" \u0005\u0017\u0000\u0000 !\u0003\u0002\u0001\u0000!\"\u0005\u0018\u0000"+
		"\u0000\"\u0001\u0001\u0000\u0000\u0000#%\u0003\u0004\u0002\u0000$#\u0001"+
		"\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000)2\u0003\b\u0004\u0000*2\u0003\n\u0005\u0000+2\u0003\f\u0006"+
		"\u0000,2\u0003\u000e\u0007\u0000-2\u0003\u0010\b\u0000.2\u0003\u0012\t"+
		"\u0000/2\u0003\u001a\r\u000002\u0003\u0006\u0003\u00001)\u0001\u0000\u0000"+
		"\u00001*\u0001\u0000\u0000\u00001+\u0001\u0000\u0000\u00001,\u0001\u0000"+
		"\u0000\u00001-\u0001\u0000\u0000\u00001.\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0005\u0001\u0000\u0000"+
		"\u000034\u0005\u001d\u0000\u000045\u0005\u0015\u0000\u000056\u0003\u0018"+
		"\f\u000067\u0005\u0016\u0000\u000078\u0005\u001c\u0000\u00008D\u0001\u0000"+
		"\u0000\u00009:\u0005\u001d\u0000\u0000:;\u0005\u0015\u0000\u0000;<\u0005"+
		"\u0005\u0000\u0000<=\u0005\u0016\u0000\u0000=D\u0005\u001c\u0000\u0000"+
		">?\u0005\u001d\u0000\u0000?@\u0005\u0015\u0000\u0000@A\u0005\u001e\u0000"+
		"\u0000AB\u0005\u0016\u0000\u0000BD\u0005\u001c\u0000\u0000C3\u0001\u0000"+
		"\u0000\u0000C9\u0001\u0000\u0000\u0000C>\u0001\u0000\u0000\u0000D\u0007"+
		"\u0001\u0000\u0000\u0000EF\u0005\u0004\u0000\u0000FG\u0005\u001e\u0000"+
		"\u0000GS\u0005\u001c\u0000\u0000HI\u0005\u0004\u0000\u0000IJ\u0005\u001e"+
		"\u0000\u0000JK\u0005\u000b\u0000\u0000KL\u0005\u001f\u0000\u0000LS\u0005"+
		"\u001c\u0000\u0000MN\u0005\u0004\u0000\u0000NO\u0005\u001e\u0000\u0000"+
		"OP\u0005\u000b\u0000\u0000PQ\u0005\u0005\u0000\u0000QS\u0005\u001c\u0000"+
		"\u0000RE\u0001\u0000\u0000\u0000RH\u0001\u0000\u0000\u0000RM\u0001\u0000"+
		"\u0000\u0000S\t\u0001\u0000\u0000\u0000TU\u0005\u0006\u0000\u0000UV\u0005"+
		"\u0015\u0000\u0000VW\u0003\u0018\f\u0000WX\u0005\u0016\u0000\u0000XY\u0005"+
		"\u0017\u0000\u0000YZ\u0003\u0002\u0001\u0000Z[\u0005\u0018\u0000\u0000"+
		"[\u000b\u0001\u0000\u0000\u0000\\]\u0005\u0006\u0000\u0000]^\u0005\u0015"+
		"\u0000\u0000^_\u0003\u0018\f\u0000_`\u0005\u0016\u0000\u0000`a\u0005\u0017"+
		"\u0000\u0000ab\u0003\u0002\u0001\u0000bc\u0005\u0018\u0000\u0000cd\u0005"+
		"\u0007\u0000\u0000de\u0005\u0017\u0000\u0000ef\u0003\u0002\u0001\u0000"+
		"fg\u0005\u0018\u0000\u0000g\r\u0001\u0000\u0000\u0000hi\u0005\t\u0000"+
		"\u0000ij\u0005\u0015\u0000\u0000jk\u0003\u0018\f\u0000kl\u0005\u0016\u0000"+
		"\u0000lm\u0005\u0017\u0000\u0000mn\u0003\u0002\u0001\u0000no\u0005\u0018"+
		"\u0000\u0000o\u000f\u0001\u0000\u0000\u0000pq\u0005\b\u0000\u0000qr\u0005"+
		"\u0017\u0000\u0000rs\u0003\u0002\u0001\u0000st\u0005\u0018\u0000\u0000"+
		"tu\u0005\t\u0000\u0000uv\u0005\u0015\u0000\u0000vw\u0003\u0018\f\u0000"+
		"wx\u0005\u0016\u0000\u0000xy\u0005\u001c\u0000\u0000y\u0011\u0001\u0000"+
		"\u0000\u0000z{\u0005\n\u0000\u0000{|\u0005\u0015\u0000\u0000|}\u0003\u0014"+
		"\n\u0000}~\u0005\u0016\u0000\u0000~\u007f\u0005\u0017\u0000\u0000\u007f"+
		"\u0080\u0003\u0002\u0001\u0000\u0080\u0081\u0005\u0018\u0000\u0000\u0081"+
		"\u0013\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0004\u0000\u0000\u0083"+
		"\u0084\u0005\u001e\u0000\u0000\u0084\u0085\u0005\u000b\u0000\u0000\u0085"+
		"\u0086\u0005\u001f\u0000\u0000\u0086\u0087\u0005\u001c\u0000\u0000\u0087"+
		"\u0088\u0003\u0018\f\u0000\u0088\u0089\u0005\u001c\u0000\u0000\u0089\u008a"+
		"\u0003\u0016\u000b\u0000\u008a\u0094\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005\u001e\u0000\u0000\u008c\u008d\u0005\u000b\u0000\u0000\u008d\u008e"+
		"\u0005\u001f\u0000\u0000\u008e\u008f\u0005\u001c\u0000\u0000\u008f\u0090"+
		"\u0003\u0018\f\u0000\u0090\u0091\u0005\u001c\u0000\u0000\u0091\u0092\u0003"+
		"\u0016\u000b\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0082\u0001"+
		"\u0000\u0000\u0000\u0093\u008b\u0001\u0000\u0000\u0000\u0094\u0015\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0005\u001e\u0000\u0000\u0096\u0097\u0005"+
		"\u0012\u0000\u0000\u0097\u009d\u0005\u001f\u0000\u0000\u0098\u0099\u0005"+
		"\u001e\u0000\u0000\u0099\u009d\u0005\u0013\u0000\u0000\u009a\u009b\u0005"+
		"\u0013\u0000\u0000\u009b\u009d\u0005\u001e\u0000\u0000\u009c\u0095\u0001"+
		"\u0000\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009d\u0017\u0001\u0000\u0000\u0000\u009e\u009f\u0005"+
		"\u001e\u0000\u0000\u009f\u00a0\u0005\u0011\u0000\u0000\u00a0\u00a3\u0005"+
		"\u001f\u0000\u0000\u00a1\u00a3\u0005\u0014\u0000\u0000\u00a2\u009e\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u0019\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0005\u001e\u0000\u0000\u00a5\u00a6\u0005"+
		"\u0012\u0000\u0000\u00a6\u00a7\u0005\u001f\u0000\u0000\u00a7\u00ad\u0005"+
		"\u001c\u0000\u0000\u00a8\u00a9\u0005\u001e\u0000\u0000\u00a9\u00aa\u0005"+
		"\u0012\u0000\u0000\u00aa\u00ab\u0005\u0005\u0000\u0000\u00ab\u00ad\u0005"+
		"\u001c\u0000\u0000\u00ac\u00a4\u0001\u0000\u0000\u0000\u00ac\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ad\u001b\u0001\u0000\u0000\u0000\b&1CR\u0093\u009c"+
		"\u00a2\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}