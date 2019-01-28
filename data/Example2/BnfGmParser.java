// Generated from BnfGm.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BnfGmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PLUS=7, MINUS=8, MULT=9, 
		DIV=10, INT=11, REAL=12, ID=13, NEWLINE=14, WHITESPACE=15;
	public static final int
		RULE_prog = 0, RULE_declar = 1, RULE_assign = 2, RULE_expr = 3, RULE_term = 4, 
		RULE_factor = 5, RULE_variable = 6, RULE_datatype = 7, RULE_number = 8;
	public static final String[] ruleNames = {
		"prog", "declar", "assign", "expr", "term", "factor", "variable", "datatype", 
		"number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "';'", "':='", "'('", "')'", "','", "'+'", "'-'", "'*'", 
		"'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "PLUS", "MINUS", "MULT", "DIV", 
		"INT", "REAL", "ID", "NEWLINE", "WHITESPACE"
	};
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
	public String getGrammarFileName() { return "BnfGm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BnfGmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<DeclarContext> declar() {
			return getRuleContexts(DeclarContext.class);
		}
		public DeclarContext declar(int i) {
			return getRuleContext(DeclarContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(BnfGmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BnfGmParser.NEWLINE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			int _alt;
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(18);
						declar();
						setState(20);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NEWLINE) {
							{
							setState(19);
							match(NEWLINE);
							}
						}

						}
						} 
					}
					setState(26);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(27);
					assign();
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NEWLINE) {
						{
						setState(28);
						match(NEWLINE);
						}
					}

					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				expr(0);
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

	public static class DeclarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BnfGmParser.ID, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public DeclarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).enterDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).exitDeclar(this);
		}
	}

	public final DeclarContext declar() throws RecognitionException {
		DeclarContext _localctx = new DeclarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ID);
			setState(40);
			variable();
			setState(41);
			match(T__0);
			setState(42);
			datatype();
			setState(43);
			match(T__1);
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

	public static class AssignContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			variable();
			setState(46);
			match(T__2);
			setState(47);
			expr(0);
			setState(48);
			match(T__1);
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

	public static class ExprContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(BnfGmParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(BnfGmParser.MINUS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(51);
				number();
				}
				break;
			case 2:
				{
				setState(52);
				variable();
				}
				break;
			case 3:
				{
				setState(53);
				term(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(56);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(57);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(58);
					term(0);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MULT() { return getToken(BnfGmParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(BnfGmParser.DIV, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL:
				{
				setState(65);
				number();
				}
				break;
			case ID:
				{
				setState(66);
				variable();
				}
				break;
			case T__3:
				{
				setState(67);
				match(T__3);
				setState(68);
				expr(0);
				setState(69);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(73);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(74);
					_la = _input.LA(1);
					if ( !(_la==MULT || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(75);
					factor();
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factor);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				variable();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(T__3);
				setState(84);
				expr(0);
				setState(85);
				match(T__4);
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(BnfGmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BnfGmParser.ID, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ID);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(T__5);
					setState(91);
					match(ID);
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BnfGmParser.ID, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_datatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ID);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(BnfGmParser.INT, 0); }
		public TerminalNode REAL() { return getToken(BnfGmParser.REAL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BnfGmListener ) ((BnfGmListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 4:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\5\2"+
		"\27\n\2\7\2\31\n\2\f\2\16\2\34\13\2\3\2\3\2\5\2 \n\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\5\2(\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\5\59\n\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6J\n\6\3\6\3\6\3\6\7\6O\n\6\f\6\16\6R\13\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\7\b_\n\b\f\b\16\bb\13\b\3\t\3\t"+
		"\3\n\3\n\3\n\2\4\b\n\13\2\4\6\b\n\f\16\20\22\2\5\3\2\t\n\3\2\13\f\3\2"+
		"\r\16\2l\2\'\3\2\2\2\4)\3\2\2\2\6/\3\2\2\2\b8\3\2\2\2\nI\3\2\2\2\fY\3"+
		"\2\2\2\16[\3\2\2\2\20c\3\2\2\2\22e\3\2\2\2\24\26\5\4\3\2\25\27\7\20\2"+
		"\2\26\25\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\24\3\2\2\2\31\34\3\2\2"+
		"\2\32\30\3\2\2\2\32\33\3\2\2\2\33#\3\2\2\2\34\32\3\2\2\2\35\37\5\6\4\2"+
		"\36 \7\20\2\2\37\36\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\35\3\2\2\2\"%\3\2"+
		"\2\2#!\3\2\2\2#$\3\2\2\2$(\3\2\2\2%#\3\2\2\2&(\5\b\5\2\'\32\3\2\2\2\'"+
		"&\3\2\2\2(\3\3\2\2\2)*\7\17\2\2*+\5\16\b\2+,\7\3\2\2,-\5\20\t\2-.\7\4"+
		"\2\2.\5\3\2\2\2/\60\5\16\b\2\60\61\7\5\2\2\61\62\5\b\5\2\62\63\7\4\2\2"+
		"\63\7\3\2\2\2\64\65\b\5\1\2\659\5\22\n\2\669\5\16\b\2\679\5\n\6\28\64"+
		"\3\2\2\28\66\3\2\2\28\67\3\2\2\29?\3\2\2\2:;\f\6\2\2;<\t\2\2\2<>\5\n\6"+
		"\2=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\t\3\2\2\2A?\3\2\2\2BC\b\6"+
		"\1\2CJ\5\22\n\2DJ\5\16\b\2EF\7\6\2\2FG\5\b\5\2GH\7\7\2\2HJ\3\2\2\2IB\3"+
		"\2\2\2ID\3\2\2\2IE\3\2\2\2JP\3\2\2\2KL\f\6\2\2LM\t\3\2\2MO\5\f\7\2NK\3"+
		"\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\13\3\2\2\2RP\3\2\2\2SZ\5\22\n\2"+
		"TZ\5\16\b\2UV\7\6\2\2VW\5\b\5\2WX\7\7\2\2XZ\3\2\2\2YS\3\2\2\2YT\3\2\2"+
		"\2YU\3\2\2\2Z\r\3\2\2\2[`\7\17\2\2\\]\7\b\2\2]_\7\17\2\2^\\\3\2\2\2_b"+
		"\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\17\3\2\2\2b`\3\2\2\2cd\7\17\2\2d\21\3\2"+
		"\2\2ef\t\4\2\2f\23\3\2\2\2\r\26\32\37#\'8?IPY`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}