// Generated from /home/federico/go/src/OLC2_Proyecto1_201901073/Analizador/Sintactico.g4 by ANTLR 4.8

    import "OLC2_PROYECTO1_201901073/Analizador/Ast/Abstract"
    import "OLC2_PROYECTO1_201901073/Analizador/Ast/Expresion"
    import arrayL "github.com/colegno/arrayList"
    import "OLC2_PROYECTO1_201901073/Analizador/Ast/Instrucciones"
    import "OLC2_PROYECTO1_201901073/Analizador/Entorno"

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Sintactico extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PARENA=1, PARENC=2, PRINTLN=3, R_INT=4, R_FLOAT=5, R_STRING=6, R_BOOL=7, 
		POW=8, CUATROPT=9, PTCOMA=10, COMA=11, MAS=12, MENOS=13, POR=14, DIVIDIDO=15, 
		MODULO=16, FLOAT=17, ENTERO=18, CADENA=19, R_TRUE=20, R_FALSE=21, ID=22, 
		WHITESPACE=23;
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_expr = 3, 
		RULE_expr_op = 4, RULE_primitivo = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "instruccion", "expr", "expr_op", "primitivo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'println!'", "'i64'", "'f64'", "'&str'", "'bool'", 
			"'pow'", "'::'", "';'", "','", "'+'", "'-'", "'*'", "'/'", "'%'", null, 
			null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PARENA", "PARENC", "PRINTLN", "R_INT", "R_FLOAT", "R_STRING", 
			"R_BOOL", "POW", "CUATROPT", "PTCOMA", "COMA", "MAS", "MENOS", "POR", 
			"DIVIDIDO", "MODULO", "FLOAT", "ENTERO", "CADENA", "R_TRUE", "R_FALSE", 
			"ID", "WHITESPACE"
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
	public String getGrammarFileName() { return "Sintactico.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Sintactico(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public *arrayL.List lista;
		public InstruccionesContext instrucciones;
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((StartContext)_localctx).instrucciones = instrucciones();
			_localctx.lista = ((StartContext)_localctx).instrucciones.l
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

	public static class InstruccionesContext extends ParserRuleContext {
		public *arrayL.List l;
		public InstruccionContext instruccion;
		public List<InstruccionContext> e = new ArrayList<InstruccionContext>();
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);

		    _localctx.l = arrayL.New()

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRINTLN) {
				{
				{
				setState(15);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			    listInt := localctx.(*InstruccionesContext).GetE()
			    for _,e := range listInt {
			        _localctx.l.Add(e.GetInstr())
			    }
			    fmt.Printf("Tipo %T", localctx.(*InstruccionesContext).GetE())

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

	public static class InstruccionContext extends ParserRuleContext {
		public abstract.Instruccion instr;
		public ExprContext expr;
		public TerminalNode PRINTLN() { return getToken(Sintactico.PRINTLN, 0); }
		public TerminalNode PARENA() { return getToken(Sintactico.PARENA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(Sintactico.PARENC, 0); }
		public TerminalNode PTCOMA() { return getToken(Sintactico.PTCOMA, 0); }
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(PRINTLN);
			setState(24);
			match(PARENA);
			setState(25);
			((InstruccionContext)_localctx).expr = expr();
			setState(26);
			match(PARENC);
			setState(27);
			match(PTCOMA);
			_localctx.instr = instrucciones.NewImprimir(((InstruccionContext)_localctx).expr.p)
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
		public abstract.Expresion p;
		public Expr_opContext expr_op;
		public Expr_opContext expr_op() {
			return getRuleContext(Expr_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((ExprContext)_localctx).expr_op = expr_op(0);
			_localctx.p = ((ExprContext)_localctx).expr_op.p
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

	public static class Expr_opContext extends ParserRuleContext {
		public abstract.Expresion p;
		public Expr_opContext hIzq;
		public PrimitivoContext primitivo;
		public ExprContext expr;
		public Token op;
		public Expr_opContext hDer;
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public TerminalNode PARENA() { return getToken(Sintactico.PARENA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(Sintactico.PARENC, 0); }
		public TerminalNode R_INT() { return getToken(Sintactico.R_INT, 0); }
		public TerminalNode CUATROPT() { return getToken(Sintactico.CUATROPT, 0); }
		public TerminalNode POW() { return getToken(Sintactico.POW, 0); }
		public List<Expr_opContext> expr_op() {
			return getRuleContexts(Expr_opContext.class);
		}
		public Expr_opContext expr_op(int i) {
			return getRuleContext(Expr_opContext.class,i);
		}
		public TerminalNode COMA() { return getToken(Sintactico.COMA, 0); }
		public TerminalNode R_FLOAT() { return getToken(Sintactico.R_FLOAT, 0); }
		public TerminalNode POR() { return getToken(Sintactico.POR, 0); }
		public TerminalNode DIVIDIDO() { return getToken(Sintactico.DIVIDIDO, 0); }
		public TerminalNode MAS() { return getToken(Sintactico.MAS, 0); }
		public TerminalNode MENOS() { return getToken(Sintactico.MENOS, 0); }
		public TerminalNode MODULO() { return getToken(Sintactico.MODULO, 0); }
		public Expr_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_op; }
	}

	public final Expr_opContext expr_op() throws RecognitionException {
		return expr_op(0);
	}

	private Expr_opContext expr_op(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_opContext _localctx = new Expr_opContext(_ctx, _parentState);
		Expr_opContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr_op, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case CADENA:
				{
				setState(34);
				((Expr_opContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_opContext)_localctx).primitivo.p
				}
				break;
			case PARENA:
				{
				setState(37);
				match(PARENA);
				setState(38);
				((Expr_opContext)_localctx).expr = expr();
				setState(39);
				match(PARENC);
				_localctx.p = ((Expr_opContext)_localctx).expr.p
				}
				break;
			case R_INT:
				{
				setState(42);
				match(R_INT);
				setState(43);
				match(CUATROPT);
				setState(44);
				match(POW);
				setState(45);
				match(PARENA);
				setState(46);
				((Expr_opContext)_localctx).hIzq = expr_op(0);
				setState(47);
				((Expr_opContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==COMA) ) {
					((Expr_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(48);
				((Expr_opContext)_localctx).hDer = expr_op(0);
				setState(49);
				match(PARENC);
				_localctx.p = expresion.NewOperacion(((Expr_opContext)_localctx).hIzq.p, "**", ((Expr_opContext)_localctx).hDer.p, false)
				}
				break;
			case R_FLOAT:
				{
				setState(52);
				match(R_FLOAT);
				setState(53);
				match(CUATROPT);
				setState(54);
				match(POW);
				setState(55);
				match(PARENA);
				setState(56);
				((Expr_opContext)_localctx).hIzq = expr_op(0);
				setState(57);
				((Expr_opContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==COMA) ) {
					((Expr_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(58);
				((Expr_opContext)_localctx).hDer = expr_op(0);
				setState(59);
				match(PARENC);
				_localctx.p = expresion.NewOperacion(((Expr_opContext)_localctx).hIzq.p, "f64**", ((Expr_opContext)_localctx).hDer.p, false)
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(79);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_opContext(_parentctx, _parentState);
						_localctx.hIzq = _prevctx;
						_localctx.hIzq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_op);
						setState(64);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(65);
						((Expr_opContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==POR || _la==DIVIDIDO) ) {
							((Expr_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(66);
						((Expr_opContext)_localctx).hDer = expr_op(8);
						_localctx.p = expresion.NewOperacion(((Expr_opContext)_localctx).hIzq.p, (((Expr_opContext)_localctx).op!=null?((Expr_opContext)_localctx).op.getText():null), ((Expr_opContext)_localctx).hDer.p, false)
						}
						break;
					case 2:
						{
						_localctx = new Expr_opContext(_parentctx, _parentState);
						_localctx.hIzq = _prevctx;
						_localctx.hIzq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_op);
						setState(69);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(70);
						((Expr_opContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
							((Expr_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(71);
						((Expr_opContext)_localctx).hDer = expr_op(7);
						_localctx.p = expresion.NewOperacion(((Expr_opContext)_localctx).hIzq.p, (((Expr_opContext)_localctx).op!=null?((Expr_opContext)_localctx).op.getText():null), ((Expr_opContext)_localctx).hDer.p, false)
						}
						break;
					case 3:
						{
						_localctx = new Expr_opContext(_parentctx, _parentState);
						_localctx.hIzq = _prevctx;
						_localctx.hIzq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_op);
						setState(74);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(75);
						((Expr_opContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MODULO) ) {
							((Expr_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(76);
						((Expr_opContext)_localctx).hDer = expr_op(6);
						_localctx.p = expresion.NewOperacion(((Expr_opContext)_localctx).hIzq.p, (((Expr_opContext)_localctx).op!=null?((Expr_opContext)_localctx).op.getText():null), ((Expr_opContext)_localctx).hDer.p, false)
						}
						break;
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class PrimitivoContext extends ParserRuleContext {
		public abstract.Expresion p;
		public Token ENTERO;
		public Token CADENA;
		public TerminalNode ENTERO() { return getToken(Sintactico.ENTERO, 0); }
		public TerminalNode CADENA() { return getToken(Sintactico.CADENA, 0); }
		public PrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivo; }
	}

	public final PrimitivoContext primitivo() throws RecognitionException {
		PrimitivoContext _localctx = new PrimitivoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_primitivo);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((PrimitivoContext)_localctx).ENTERO = match(ENTERO);

				    num, err := strconv.Atoi((((PrimitivoContext)_localctx).ENTERO!=null?((PrimitivoContext)_localctx).ENTERO.getText():null))
				    if err != nil {
				        fmt.Println(err)
				    }
				    _localctx.p = expresion.NewPrimitivo(num, abstract.INT)

				}
				break;
			case CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				((PrimitivoContext)_localctx).CADENA = match(CADENA);

				    str := (((PrimitivoContext)_localctx).CADENA!=null?((PrimitivoContext)_localctx).CADENA.getText():null)[1:len((((PrimitivoContext)_localctx).CADENA!=null?((PrimitivoContext)_localctx).CADENA.getLine():0))-1]
				    _localctx.p = expresion.NewPrimitivo(str, abstract.STRING)

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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_op_sempred((Expr_opContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_op_sempred(Expr_opContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\7\3\23\n\3\f\3\16\3"+
		"\26\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6R\n\6\f\6\16\6U\13\6\3\7\3\7\3\7\3"+
		"\7\5\7[\n\7\3\7\2\3\n\b\2\4\6\b\n\f\2\6\3\2\r\r\3\2\20\21\3\2\16\17\3"+
		"\2\22\22\2^\2\16\3\2\2\2\4\24\3\2\2\2\6\31\3\2\2\2\b \3\2\2\2\n@\3\2\2"+
		"\2\fZ\3\2\2\2\16\17\5\4\3\2\17\20\b\2\1\2\20\3\3\2\2\2\21\23\5\6\4\2\22"+
		"\21\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26"+
		"\24\3\2\2\2\27\30\b\3\1\2\30\5\3\2\2\2\31\32\7\5\2\2\32\33\7\3\2\2\33"+
		"\34\5\b\5\2\34\35\7\4\2\2\35\36\7\f\2\2\36\37\b\4\1\2\37\7\3\2\2\2 !\5"+
		"\n\6\2!\"\b\5\1\2\"\t\3\2\2\2#$\b\6\1\2$%\5\f\7\2%&\b\6\1\2&A\3\2\2\2"+
		"\'(\7\3\2\2()\5\b\5\2)*\7\4\2\2*+\b\6\1\2+A\3\2\2\2,-\7\6\2\2-.\7\13\2"+
		"\2./\7\n\2\2/\60\7\3\2\2\60\61\5\n\6\2\61\62\t\2\2\2\62\63\5\n\6\2\63"+
		"\64\7\4\2\2\64\65\b\6\1\2\65A\3\2\2\2\66\67\7\7\2\2\678\7\13\2\289\7\n"+
		"\2\29:\7\3\2\2:;\5\n\6\2;<\t\2\2\2<=\5\n\6\2=>\7\4\2\2>?\b\6\1\2?A\3\2"+
		"\2\2@#\3\2\2\2@\'\3\2\2\2@,\3\2\2\2@\66\3\2\2\2AS\3\2\2\2BC\f\t\2\2CD"+
		"\t\3\2\2DE\5\n\6\nEF\b\6\1\2FR\3\2\2\2GH\f\b\2\2HI\t\4\2\2IJ\5\n\6\tJ"+
		"K\b\6\1\2KR\3\2\2\2LM\f\7\2\2MN\t\5\2\2NO\5\n\6\bOP\b\6\1\2PR\3\2\2\2"+
		"QB\3\2\2\2QG\3\2\2\2QL\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\13\3\2\2"+
		"\2US\3\2\2\2VW\7\24\2\2W[\b\7\1\2XY\7\25\2\2Y[\b\7\1\2ZV\3\2\2\2ZX\3\2"+
		"\2\2[\r\3\2\2\2\7\24@QSZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}