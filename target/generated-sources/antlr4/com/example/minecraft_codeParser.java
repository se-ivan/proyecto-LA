// Generated from com\example\minecraft_code.g4 by ANTLR 4.9.2
package com.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minecraft_codeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FORTUNE=1, INFINITY=2, UNBREAKING_START=3, UNBREAKING_END=4, SHARPNESS=5, 
		MULTISHOT=6, PIERCING=7, EFFICIENCY=8, LURE=9, LUCK_OF_THE_SEA=10, APPLY=11, 
		LAPIS_LAZULI=12, KNOCKBACK=13, PUNCH=14, MENDING=15, IMPALING=16, CHANNELING=17, 
		ENT=18, FEATHER_AND_INK=19, TYPE=20, BOOL=21, STRING_LITERAL=22, BOOK=23, 
		COMMENT=24, WS=25;
	public static final int
		RULE_bookshelf = 0, RULE_enchanting = 1, RULE_redstone_logic = 2, RULE_redstone_clock = 3, 
		RULE_redstone_circuit = 4, RULE_signal_chain = 5, RULE_judgment = 6, RULE_enchant = 7, 
		RULE_crafting_recipe = 8, RULE_resource_pile = 9, RULE_inventory_slot = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"bookshelf", "enchanting", "redstone_logic", "redstone_clock", "redstone_circuit", 
			"signal_chain", "judgment", "enchant", "crafting_recipe", "resource_pile", 
			"inventory_slot"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u2393\u148D\u2237\u14A3\u268D\u30EA\u14B7'", "'\u254E\u30EA\u2393\u254E\u30EA\u254E\u2138||'", 
			"'\u268D\u30EA\u154A\u2237\u14B7\u158B\u00B7\u01C0\u00B7\u254E\u30EA\u2524\u23BD\u03DF\u14A3\u158B\u2237\u14A3'", 
			"'\u268D\u30EA\u154A\u2237\u14B7\u158B\u00B7\u01C0\u00B7\u254E\u30EA\u2524\u23BD\u14B7\u30EA\u21B8'", 
			"'\u03DE\u2351\u158B\u2237i!\u30EA\u14B7\u03DF\u03DF'", "'\u14B2\u268D|:\u14A3\u254E\u03DF\u2351\u148D\u14A3'", 
			"'I!\u254E\u14B7\u2237\u152E\u254E\u30EA\u2524'", "'\u14B7\u2393\u2393\u254E\u152E\u254E\u14B7\u30EA\u152E\u0965'", 
			"'|:\u268D\u2237\u14B7'", "'|:\u268D\u152E\u00B7\u01C0\u00B7\u23BD\u148D\u2393\u23BD\u14A3\u2351\u14B7\u23BD\u03DF\u14B7\u158B'", 
			"'\uD83C\uDF00'", "'\uD83D\uDD39'", "'\u00B7\u01C0\u00B7\u30EA\u148D\u152E\u00B7\u01C0\u00B7\u154A\u158B\u152E\u00B7\u01C0\u00B7'", 
			"'I!\u268D\u30EA\u152E\u2351'", "'\u14B2\u14B7\u30EA\u21B8\u254E\u30EA\u2524'", 
			"'\u254E\u14B2i!\u158B|:\u254E\u30EA\u2524'", "'\u152E\u2351\u158B\u30EA\u30EA\u14B7|:\u254E\u30EA\u2524'", 
			null, "'\u268D\u30EA\u152E\u2351'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FORTUNE", "INFINITY", "UNBREAKING_START", "UNBREAKING_END", "SHARPNESS", 
			"MULTISHOT", "PIERCING", "EFFICIENCY", "LURE", "LUCK_OF_THE_SEA", "APPLY", 
			"LAPIS_LAZULI", "KNOCKBACK", "PUNCH", "MENDING", "IMPALING", "CHANNELING", 
			"ENT", "FEATHER_AND_INK", "TYPE", "BOOL", "STRING_LITERAL", "BOOK", "COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "minecraft_code.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public minecraft_codeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BookshelfContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(minecraft_codeParser.EOF, 0); }
		public List<EnchantingContext> enchanting() {
			return getRuleContexts(EnchantingContext.class);
		}
		public EnchantingContext enchanting(int i) {
			return getRuleContext(EnchantingContext.class,i);
		}
		public List<TerminalNode> LAPIS_LAZULI() { return getTokens(minecraft_codeParser.LAPIS_LAZULI); }
		public TerminalNode LAPIS_LAZULI(int i) {
			return getToken(minecraft_codeParser.LAPIS_LAZULI, i);
		}
		public BookshelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bookshelf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).enterBookshelf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).exitBookshelf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minecraft_codeVisitor ) return ((minecraft_codeVisitor<? extends T>)visitor).visitBookshelf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BookshelfContext bookshelf() throws RecognitionException {
		BookshelfContext _localctx = new BookshelfContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bookshelf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				enchanting();
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LAPIS_LAZULI) {
					{
					{
					setState(23);
					match(LAPIS_LAZULI);
					}
					}
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FORTUNE) | (1L << INFINITY) | (1L << LURE) | (1L << ENT) | (1L << TYPE) | (1L << BOOL) | (1L << STRING_LITERAL) | (1L << BOOK))) != 0) );
			setState(33);
			match(EOF);
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

	public static class EnchantingContext extends ParserRuleContext {
		public EnchantContext enchant() {
			return getRuleContext(EnchantContext.class,0);
		}
		public Redstone_logicContext redstone_logic() {
			return getRuleContext(Redstone_logicContext.class,0);
		}
		public Redstone_clockContext redstone_clock() {
			return getRuleContext(Redstone_clockContext.class,0);
		}
		public Redstone_circuitContext redstone_circuit() {
			return getRuleContext(Redstone_circuitContext.class,0);
		}
		public EnchantingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enchanting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).enterEnchanting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).exitEnchanting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minecraft_codeVisitor ) return ((minecraft_codeVisitor<? extends T>)visitor).visitEnchanting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnchantingContext enchanting() throws RecognitionException {
		EnchantingContext _localctx = new EnchantingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_enchanting);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				enchant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				redstone_logic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				redstone_clock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				redstone_circuit();
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

	public static class Redstone_logicContext extends ParserRuleContext {
		public TerminalNode FORTUNE() { return getToken(minecraft_codeParser.FORTUNE, 0); }
		public TerminalNode LURE() { return getToken(minecraft_codeParser.LURE, 0); }
		public JudgmentContext judgment() {
			return getRuleContext(JudgmentContext.class,0);
		}
		public TerminalNode LUCK_OF_THE_SEA() { return getToken(minecraft_codeParser.LUCK_OF_THE_SEA, 0); }
		public TerminalNode UNBREAKING_START() { return getToken(minecraft_codeParser.UNBREAKING_START, 0); }
		public TerminalNode UNBREAKING_END() { return getToken(minecraft_codeParser.UNBREAKING_END, 0); }
		public List<EnchantingContext> enchanting() {
			return getRuleContexts(EnchantingContext.class);
		}
		public EnchantingContext enchanting(int i) {
			return getRuleContext(EnchantingContext.class,i);
		}
		public List<TerminalNode> LAPIS_LAZULI() { return getTokens(minecraft_codeParser.LAPIS_LAZULI); }
		public TerminalNode LAPIS_LAZULI(int i) {
			return getToken(minecraft_codeParser.LAPIS_LAZULI, i);
		}
		public Redstone_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redstone_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).enterRedstone_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).exitRedstone_logic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minecraft_codeVisitor ) return ((minecraft_codeVisitor<? extends T>)visitor).visitRedstone_logic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Redstone_logicContext redstone_logic() throws RecognitionException {
		Redstone_logicContext _localctx = new Redstone_logicContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_redstone_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(FORTUNE);
			setState(42);
			match(LURE);
			setState(43);
			judgment();
			setState(44);
			match(LUCK_OF_THE_SEA);
			setState(45);
			match(UNBREAKING_START);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				enchanting();
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LAPIS_LAZULI) {
					{
					{
					setState(47);
					match(LAPIS_LAZULI);
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FORTUNE) | (1L << INFINITY) | (1L << LURE) | (1L << ENT) | (1L << TYPE) | (1L << BOOL) | (1L << STRING_LITERAL) | (1L << BOOK))) != 0) );
			setState(57);
			match(UNBREAKING_END);
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

	public static class Redstone_clockContext extends ParserRuleContext {
		public TerminalNode INFINITY() { return getToken(minecraft_codeParser.INFINITY, 0); }
		public TerminalNode LURE() { return getToken(minecraft_codeParser.LURE, 0); }
		public Redstone_circuitContext redstone_circuit() {
			return getRuleContext(Redstone_circuitContext.class,0);
		}
		public TerminalNode LUCK_OF_THE_SEA() { return getToken(minecraft_codeParser.LUCK_OF_THE_SEA, 0); }
		public TerminalNode UNBREAKING_START() { return getToken(minecraft_codeParser.UNBREAKING_START, 0); }
		public TerminalNode UNBREAKING_END() { return getToken(minecraft_codeParser.UNBREAKING_END, 0); }
		public List<EnchantingContext> enchanting() {
			return getRuleContexts(EnchantingContext.class);
		}
		public EnchantingContext enchanting(int i) {
			return getRuleContext(EnchantingContext.class,i);
		}
		public List<TerminalNode> LAPIS_LAZULI() { return getTokens(minecraft_codeParser.LAPIS_LAZULI); }
		public TerminalNode LAPIS_LAZULI(int i) {
			return getToken(minecraft_codeParser.LAPIS_LAZULI, i);
		}
		public Redstone_clockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redstone_clock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).enterRedstone_clock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).exitRedstone_clock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minecraft_codeVisitor ) return ((minecraft_codeVisitor<? extends T>)visitor).visitRedstone_clock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Redstone_clockContext redstone_clock() throws RecognitionException {
		Redstone_clockContext _localctx = new Redstone_clockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_redstone_clock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(INFINITY);
			setState(60);
			match(LURE);
			setState(61);
			redstone_circuit();
			setState(62);
			match(LUCK_OF_THE_SEA);
			setState(63);
			match(UNBREAKING_START);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				enchanting();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LAPIS_LAZULI) {
					{
					{
					setState(65);
					match(LAPIS_LAZULI);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FORTUNE) | (1L << INFINITY) | (1L << LURE) | (1L << ENT) | (1L << TYPE) | (1L << BOOL) | (1L << STRING_LITERAL) | (1L << BOOK))) != 0) );
			setState(75);
			match(UNBREAKING_END);
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

	public static class Redstone_circuitContext extends ParserRuleContext {
		public List<Signal_chainContext> signal_chain() {
			return getRuleContexts(Signal_chainContext.class);
		}
		public Signal_chainContext signal_chain(int i) {
			return getRuleContext(Signal_chainContext.class,i);
		}
		public List<TerminalNode> IMPALING() { return getTokens(minecraft_codeParser.IMPALING); }
		public TerminalNode IMPALING(int i) {
			return getToken(minecraft_codeParser.IMPALING, i);
		}
		public Redstone_circuitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redstone_circuit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).enterRedstone_circuit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).exitRedstone_circuit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minecraft_codeVisitor ) return ((minecraft_codeVisitor<? extends T>)visitor).visitRedstone_circuit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Redstone_circuitContext redstone_circuit() throws RecognitionException {
		Redstone_circuitContext _localctx = new Redstone_circuitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_redstone_circuit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			signal_chain();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPALING) {
				{
				{
				setState(78);
				match(IMPALING);
				setState(79);
				signal_chain();
				}
				}
				setState(84);
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

	public static class Signal_chainContext extends ParserRuleContext {
		public List<JudgmentContext> judgment() {
			return getRuleContexts(JudgmentContext.class);
		}
		public JudgmentContext judgment(int i) {
			return getRuleContext(JudgmentContext.class,i);
		}
		public List<TerminalNode> CHANNELING() { return getTokens(minecraft_codeParser.CHANNELING); }
		public TerminalNode CHANNELING(int i) {
			return getToken(minecraft_codeParser.CHANNELING, i);
		}
		public Signal_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).enterSignal_chain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).exitSignal_chain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minecraft_codeVisitor ) return ((minecraft_codeVisitor<? extends T>)visitor).visitSignal_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_chainContext signal_chain() throws RecognitionException {
		Signal_chainContext _localctx = new Signal_chainContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_signal_chain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			judgment();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHANNELING) {
				{
				{
				setState(86);
				match(CHANNELING);
				setState(87);
				judgment();
				}
				}
				setState(92);
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

	public static class JudgmentContext extends ParserRuleContext {
		public List<Crafting_recipeContext> crafting_recipe() {
			return getRuleContexts(Crafting_recipeContext.class);
		}
		public Crafting_recipeContext crafting_recipe(int i) {
			return getRuleContext(Crafting_recipeContext.class,i);
		}
		public TerminalNode PUNCH() { return getToken(minecraft_codeParser.PUNCH, 0); }
		public TerminalNode KNOCKBACK() { return getToken(minecraft_codeParser.KNOCKBACK, 0); }
		public TerminalNode MENDING() { return getToken(minecraft_codeParser.MENDING, 0); }
		public JudgmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_judgment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).enterJudgment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).exitJudgment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minecraft_codeVisitor ) return ((minecraft_codeVisitor<? extends T>)visitor).visitJudgment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JudgmentContext judgment() throws RecognitionException {
		JudgmentContext _localctx = new JudgmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_judgment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			crafting_recipe();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KNOCKBACK) | (1L << PUNCH) | (1L << MENDING))) != 0)) {
				{
				setState(94);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KNOCKBACK) | (1L << PUNCH) | (1L << MENDING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(95);
				crafting_recipe();
				}
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

	public static class EnchantContext extends ParserRuleContext {
		public TerminalNode BOOK() { return getToken(minecraft_codeParser.BOOK, 0); }
		public TerminalNode APPLY() { return getToken(minecraft_codeParser.APPLY, 0); }
		public Crafting_recipeContext crafting_recipe() {
			return getRuleContext(Crafting_recipeContext.class,0);
		}
		public Redstone_circuitContext redstone_circuit() {
			return getRuleContext(Redstone_circuitContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(minecraft_codeParser.TYPE, 0); }
		public EnchantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enchant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).enterEnchant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).exitEnchant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minecraft_codeVisitor ) return ((minecraft_codeVisitor<? extends T>)visitor).visitEnchant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnchantContext enchant() throws RecognitionException {
		EnchantContext _localctx = new EnchantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enchant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(98);
				match(TYPE);
				}
			}

			setState(101);
			match(BOOK);
			setState(102);
			match(APPLY);
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(103);
				crafting_recipe();
				}
				break;
			case 2:
				{
				setState(104);
				redstone_circuit();
				}
				break;
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

	public static class Crafting_recipeContext extends ParserRuleContext {
		public List<Resource_pileContext> resource_pile() {
			return getRuleContexts(Resource_pileContext.class);
		}
		public Resource_pileContext resource_pile(int i) {
			return getRuleContext(Resource_pileContext.class,i);
		}
		public List<TerminalNode> EFFICIENCY() { return getTokens(minecraft_codeParser.EFFICIENCY); }
		public TerminalNode EFFICIENCY(int i) {
			return getToken(minecraft_codeParser.EFFICIENCY, i);
		}
		public List<TerminalNode> SHARPNESS() { return getTokens(minecraft_codeParser.SHARPNESS); }
		public TerminalNode SHARPNESS(int i) {
			return getToken(minecraft_codeParser.SHARPNESS, i);
		}
		public Crafting_recipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crafting_recipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).enterCrafting_recipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).exitCrafting_recipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minecraft_codeVisitor ) return ((minecraft_codeVisitor<? extends T>)visitor).visitCrafting_recipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Crafting_recipeContext crafting_recipe() throws RecognitionException {
		Crafting_recipeContext _localctx = new Crafting_recipeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_crafting_recipe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			resource_pile();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHARPNESS || _la==EFFICIENCY) {
				{
				{
				setState(108);
				_la = _input.LA(1);
				if ( !(_la==SHARPNESS || _la==EFFICIENCY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(109);
				resource_pile();
				}
				}
				setState(114);
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

	public static class Resource_pileContext extends ParserRuleContext {
		public List<Inventory_slotContext> inventory_slot() {
			return getRuleContexts(Inventory_slotContext.class);
		}
		public Inventory_slotContext inventory_slot(int i) {
			return getRuleContext(Inventory_slotContext.class,i);
		}
		public List<TerminalNode> MULTISHOT() { return getTokens(minecraft_codeParser.MULTISHOT); }
		public TerminalNode MULTISHOT(int i) {
			return getToken(minecraft_codeParser.MULTISHOT, i);
		}
		public List<TerminalNode> PIERCING() { return getTokens(minecraft_codeParser.PIERCING); }
		public TerminalNode PIERCING(int i) {
			return getToken(minecraft_codeParser.PIERCING, i);
		}
		public Resource_pileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource_pile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).enterResource_pile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).exitResource_pile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minecraft_codeVisitor ) return ((minecraft_codeVisitor<? extends T>)visitor).visitResource_pile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resource_pileContext resource_pile() throws RecognitionException {
		Resource_pileContext _localctx = new Resource_pileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_resource_pile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			inventory_slot();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTISHOT || _la==PIERCING) {
				{
				{
				setState(116);
				_la = _input.LA(1);
				if ( !(_la==MULTISHOT || _la==PIERCING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(117);
				inventory_slot();
				}
				}
				setState(122);
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

	public static class Inventory_slotContext extends ParserRuleContext {
		public TerminalNode ENT() { return getToken(minecraft_codeParser.ENT, 0); }
		public TerminalNode BOOL() { return getToken(minecraft_codeParser.BOOL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(minecraft_codeParser.STRING_LITERAL, 0); }
		public TerminalNode BOOK() { return getToken(minecraft_codeParser.BOOK, 0); }
		public TerminalNode LURE() { return getToken(minecraft_codeParser.LURE, 0); }
		public Redstone_circuitContext redstone_circuit() {
			return getRuleContext(Redstone_circuitContext.class,0);
		}
		public TerminalNode LUCK_OF_THE_SEA() { return getToken(minecraft_codeParser.LUCK_OF_THE_SEA, 0); }
		public Inventory_slotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inventory_slot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).enterInventory_slot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minecraft_codeListener ) ((minecraft_codeListener)listener).exitInventory_slot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof minecraft_codeVisitor ) return ((minecraft_codeVisitor<? extends T>)visitor).visitInventory_slot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inventory_slotContext inventory_slot() throws RecognitionException {
		Inventory_slotContext _localctx = new Inventory_slotContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inventory_slot);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(ENT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(BOOL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(STRING_LITERAL);
				}
				break;
			case BOOK:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				match(BOOK);
				}
				break;
			case LURE:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				match(LURE);
				setState(128);
				redstone_circuit();
				setState(129);
				match(LUCK_OF_THE_SEA);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\6\2 \n\2\r\2\16\2!\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4"+
		"\f\4\16\4\66\13\4\6\48\n\4\r\4\16\49\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5E\n\5\f\5\16\5H\13\5\6\5J\n\5\r\5\16\5K\3\5\3\5\3\6\3\6\3\6\7\6"+
		"S\n\6\f\6\16\6V\13\6\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\b\3\b\3\b\5"+
		"\bc\n\b\3\t\5\tf\n\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\n\7\nq\n\n\f\n"+
		"\16\nt\13\n\3\13\3\13\3\13\7\13y\n\13\f\13\16\13|\13\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0086\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26"+
		"\2\5\3\2\17\21\4\2\7\7\n\n\3\2\b\t\2\u0090\2\37\3\2\2\2\4)\3\2\2\2\6+"+
		"\3\2\2\2\b=\3\2\2\2\nO\3\2\2\2\fW\3\2\2\2\16_\3\2\2\2\20e\3\2\2\2\22m"+
		"\3\2\2\2\24u\3\2\2\2\26\u0085\3\2\2\2\30\34\5\4\3\2\31\33\7\16\2\2\32"+
		"\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35 \3\2\2\2\36\34"+
		"\3\2\2\2\37\30\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7"+
		"\2\2\3$\3\3\2\2\2%*\5\20\t\2&*\5\6\4\2\'*\5\b\5\2(*\5\n\6\2)%\3\2\2\2"+
		")&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+,\7\3\2\2,-\7\13\2\2-.\5\16"+
		"\b\2./\7\f\2\2/\67\7\5\2\2\60\64\5\4\3\2\61\63\7\16\2\2\62\61\3\2\2\2"+
		"\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\67"+
		"\60\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\6\2\2<\7\3\2"+
		"\2\2=>\7\4\2\2>?\7\13\2\2?@\5\n\6\2@A\7\f\2\2AI\7\5\2\2BF\5\4\3\2CE\7"+
		"\16\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GJ\3\2\2\2HF\3\2\2\2IB"+
		"\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\6\2\2N\t\3\2\2\2"+
		"OT\5\f\7\2PQ\7\22\2\2QS\5\f\7\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2"+
		"\2U\13\3\2\2\2VT\3\2\2\2W\\\5\16\b\2XY\7\23\2\2Y[\5\16\b\2ZX\3\2\2\2["+
		"^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\r\3\2\2\2^\\\3\2\2\2_b\5\22\n\2`a\t\2"+
		"\2\2ac\5\22\n\2b`\3\2\2\2bc\3\2\2\2c\17\3\2\2\2df\7\26\2\2ed\3\2\2\2e"+
		"f\3\2\2\2fg\3\2\2\2gh\7\31\2\2hk\7\r\2\2il\5\22\n\2jl\5\n\6\2ki\3\2\2"+
		"\2kj\3\2\2\2l\21\3\2\2\2mr\5\24\13\2no\t\3\2\2oq\5\24\13\2pn\3\2\2\2q"+
		"t\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\23\3\2\2\2tr\3\2\2\2uz\5\26\f\2vw\t\4\2"+
		"\2wy\5\26\f\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\25\3\2\2\2|z\3"+
		"\2\2\2}\u0086\7\24\2\2~\u0086\7\27\2\2\177\u0086\7\30\2\2\u0080\u0086"+
		"\7\31\2\2\u0081\u0082\7\13\2\2\u0082\u0083\5\n\6\2\u0083\u0084\7\f\2\2"+
		"\u0084\u0086\3\2\2\2\u0085}\3\2\2\2\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085"+
		"\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0086\27\3\2\2\2\21\34!)\649FKT\\b"+
		"ekrz\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}