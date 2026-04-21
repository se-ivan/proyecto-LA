// Generated from c:/Users/sresm/Documents/Lenguajes y automatas 2/demo/src/main/antlr4/com/example/minecraft_code.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class minecraft_codeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FORTUNE=1, INFINITY=2, UNBREAKING_START=3, UNBREAKING_END=4, SHARPNESS=5, 
		MULTISHOT=6, PIERCING=7, EFFICIENCY=8, LURE=9, LUCK_OF_THE_SEA=10, APPLY=11, 
		LAPIS_LAZULI=12, KNOCKBACK=13, PUNCH=14, MENDING=15, IMPALING=16, CHANNELING=17, 
		ENT=18, BOOK=19, WS=20;
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
			null, "'\\u2393\\u148D\\u2237\\u14A3\\u268D\\u30EA\\u14B7'", "'\\u254E\\u30EA\\u2393\\u254E\\u30EA\\u254E\\u2138||'", 
			"'\\u268D\\u30EA\\u154A\\u2237\\u14B7\\u158B\\u00B7\\u01C0\\u00B7\\u254E\\u30EA\\u2524\\u23BD\\u03DF\\u14A3\\u158B\\u2237\\u14A3'", 
			"'\\u268D\\u30EA\\u154A\\u2237\\u14B7\\u158B\\u00B7\\u01C0\\u00B7\\u254E\\u30EA\\u2524\\u23BD\\u14B7\\u30EA\\u21B8'", 
			"'\\u03DE\\u2351\\u158B\\u2237i!\\u30EA\\u14B7\\u03DF\\u03DF'", "'\\u14B2\\u268D|:\\u14A3\\u254E\\u03DF\\u2351\\u148D\\u14A3'", 
			"'I!\\u254E\\u14B7\\u2237\\u152E\\u254E\\u30EA\\u2524'", "'\\u14B7\\u2393\\u2393\\u254E\\u152E\\u254E\\u14B7\\u30EA\\u152E\\u0965'", 
			"'|:\\u268D\\u2237\\u14B7'", "'|:\\u268D\\u152E\\u00B7\\u01C0\\u00B7\\u23BD\\u148D\\u2393\\u23BD\\u14A3\\u2351\\u14B7\\u23BD\\u03DF\\u14B7\\u158B'", 
			"'\\uD83C\uDF00'", "'\\uD83D\uDD39'", "'\\u00B7\\u01C0\\u00B7\\u30EA\\u148D\\u152E\\u00B7\\u01C0\\u00B7\\u154A\\u158B\\u152E\\u00B7\\u01C0\\u00B7'", 
			"'I!\\u268D\\u30EA\\u152E\\u2351'", "'\\u14B2\\u14B7\\u30EA\\u21B8\\u254E\\u30EA\\u2524'", 
			"'\\u254E\\u14B2i!\\u158B|:\\u254E\\u30EA\\u2524'", "'\\u152E\\u2351\\u158B\\u30EA\\u30EA\\u14B7|:\\u254E\\u30EA\\u2524'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FORTUNE", "INFINITY", "UNBREAKING_START", "UNBREAKING_END", "SHARPNESS", 
			"MULTISHOT", "PIERCING", "EFFICIENCY", "LURE", "LUCK_OF_THE_SEA", "APPLY", 
			"LAPIS_LAZULI", "KNOCKBACK", "PUNCH", "MENDING", "IMPALING", "CHANNELING", 
			"ENT", "BOOK", "WS"
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

	@SuppressWarnings("CheckReturnValue")
	public static class BookshelfContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(minecraft_codeParser.EOF, 0); }
		public List<EnchantingContext> enchanting() {
			return getRuleContexts(EnchantingContext.class);
		}
		public EnchantingContext enchanting(int i) {
			return getRuleContext(EnchantingContext.class,i);
		}
		public List<TerminalNode> APPLY() { return getTokens(minecraft_codeParser.APPLY); }
		public TerminalNode APPLY(int i) {
			return getToken(minecraft_codeParser.APPLY, i);
		}
		public BookshelfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bookshelf; }
	}

	public final BookshelfContext bookshelf() throws RecognitionException {
		BookshelfContext _localctx = new BookshelfContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bookshelf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				enchanting();
				setState(23);
				match(APPLY);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 786950L) != 0) );
			setState(29);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final EnchantingContext enchanting() throws RecognitionException {
		EnchantingContext _localctx = new EnchantingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_enchanting);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				enchant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				redstone_logic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				redstone_clock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final Redstone_logicContext redstone_logic() throws RecognitionException {
		Redstone_logicContext _localctx = new Redstone_logicContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_redstone_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(FORTUNE);
			setState(38);
			match(LURE);
			setState(39);
			judgment();
			setState(40);
			match(LUCK_OF_THE_SEA);
			setState(41);
			match(UNBREAKING_START);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				enchanting();
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LAPIS_LAZULI) {
					{
					{
					setState(43);
					match(LAPIS_LAZULI);
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 786950L) != 0) );
			setState(53);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final Redstone_clockContext redstone_clock() throws RecognitionException {
		Redstone_clockContext _localctx = new Redstone_clockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_redstone_clock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(INFINITY);
			setState(56);
			match(LURE);
			setState(57);
			redstone_circuit();
			setState(58);
			match(LUCK_OF_THE_SEA);
			setState(59);
			match(UNBREAKING_START);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				enchanting();
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LAPIS_LAZULI) {
					{
					{
					setState(61);
					match(LAPIS_LAZULI);
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 786950L) != 0) );
			setState(71);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final Redstone_circuitContext redstone_circuit() throws RecognitionException {
		Redstone_circuitContext _localctx = new Redstone_circuitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_redstone_circuit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			signal_chain();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPALING) {
				{
				{
				setState(74);
				match(IMPALING);
				setState(75);
				signal_chain();
				}
				}
				setState(80);
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
	}

	public final Signal_chainContext signal_chain() throws RecognitionException {
		Signal_chainContext _localctx = new Signal_chainContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_signal_chain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			judgment();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHANNELING) {
				{
				{
				setState(82);
				match(CHANNELING);
				setState(83);
				judgment();
				}
				}
				setState(88);
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
	}

	public final JudgmentContext judgment() throws RecognitionException {
		JudgmentContext _localctx = new JudgmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_judgment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			crafting_recipe();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) {
				{
				setState(90);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(91);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnchantContext extends ParserRuleContext {
		public TerminalNode BOOK() { return getToken(minecraft_codeParser.BOOK, 0); }
		public TerminalNode APPLY() { return getToken(minecraft_codeParser.APPLY, 0); }
		public Crafting_recipeContext crafting_recipe() {
			return getRuleContext(Crafting_recipeContext.class,0);
		}
		public Redstone_circuitContext redstone_circuit() {
			return getRuleContext(Redstone_circuitContext.class,0);
		}
		public EnchantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enchant; }
	}

	public final EnchantContext enchant() throws RecognitionException {
		EnchantContext _localctx = new EnchantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_enchant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(BOOK);
			setState(95);
			match(APPLY);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(96);
				crafting_recipe();
				}
				break;
			case 2:
				{
				setState(97);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final Crafting_recipeContext crafting_recipe() throws RecognitionException {
		Crafting_recipeContext _localctx = new Crafting_recipeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_crafting_recipe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			resource_pile();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SHARPNESS || _la==EFFICIENCY) {
				{
				{
				setState(101);
				_la = _input.LA(1);
				if ( !(_la==SHARPNESS || _la==EFFICIENCY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(102);
				resource_pile();
				}
				}
				setState(107);
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
	}

	public final Resource_pileContext resource_pile() throws RecognitionException {
		Resource_pileContext _localctx = new Resource_pileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_resource_pile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			inventory_slot();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTISHOT || _la==PIERCING) {
				{
				{
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==MULTISHOT || _la==PIERCING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(110);
				inventory_slot();
				}
				}
				setState(115);
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
	public static class Inventory_slotContext extends ParserRuleContext {
		public TerminalNode ENT() { return getToken(minecraft_codeParser.ENT, 0); }
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
	}

	public final Inventory_slotContext inventory_slot() throws RecognitionException {
		Inventory_slotContext _localctx = new Inventory_slotContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inventory_slot);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(ENT);
				}
				break;
			case BOOK:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(BOOK);
				}
				break;
			case LURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(LURE);
				setState(119);
				redstone_circuit();
				setState(120);
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
		"\u0004\u0001\u0014}\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0004\u0000\u001a\b\u0000\u000b\u0000\f\u0000\u001b\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"$\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002-\b\u0002\n\u0002\f\u00020\t\u0002"+
		"\u0004\u00022\b\u0002\u000b\u0002\f\u00023\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003?\b\u0003\n\u0003\f\u0003B\t\u0003\u0004\u0003D\b\u0003"+
		"\u000b\u0003\f\u0003E\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004M\b\u0004\n\u0004\f\u0004P\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005U\b\u0005\n\u0005\f\u0005X\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006]\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007c\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0005\bh\b\b\n\b\f\bk\t\b\u0001\t\u0001\t\u0001\t\u0005\tp"+
		"\b\t\n\t\f\ts\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n{\b\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u0003\u0001\u0000\r\u000f\u0002\u0000\u0005\u0005"+
		"\b\b\u0001\u0000\u0006\u0007\u0081\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0002#\u0001\u0000\u0000\u0000\u0004%\u0001\u0000\u0000\u0000\u00067"+
		"\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nQ\u0001\u0000\u0000"+
		"\u0000\fY\u0001\u0000\u0000\u0000\u000e^\u0001\u0000\u0000\u0000\u0010"+
		"d\u0001\u0000\u0000\u0000\u0012l\u0001\u0000\u0000\u0000\u0014z\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018\u0005"+
		"\u000b\u0000\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0016\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005\u0000\u0000\u0001\u001e\u0001\u0001"+
		"\u0000\u0000\u0000\u001f$\u0003\u000e\u0007\u0000 $\u0003\u0004\u0002"+
		"\u0000!$\u0003\u0006\u0003\u0000\"$\u0003\b\u0004\u0000#\u001f\u0001\u0000"+
		"\u0000\u0000# \u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#\"\u0001"+
		"\u0000\u0000\u0000$\u0003\u0001\u0000\u0000\u0000%&\u0005\u0001\u0000"+
		"\u0000&\'\u0005\t\u0000\u0000\'(\u0003\f\u0006\u0000()\u0005\n\u0000\u0000"+
		")1\u0005\u0003\u0000\u0000*.\u0003\u0002\u0001\u0000+-\u0005\f\u0000\u0000"+
		",+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u00001*\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"56\u0005\u0004\u0000\u00006\u0005\u0001\u0000\u0000\u000078\u0005\u0002"+
		"\u0000\u000089\u0005\t\u0000\u00009:\u0003\b\u0004\u0000:;\u0005\n\u0000"+
		"\u0000;C\u0005\u0003\u0000\u0000<@\u0003\u0002\u0001\u0000=?\u0005\f\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000C<\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000GH\u0005\u0004\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IN\u0003"+
		"\n\u0005\u0000JK\u0005\u0010\u0000\u0000KM\u0003\n\u0005\u0000LJ\u0001"+
		"\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000O\t\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000QV\u0003\f\u0006\u0000RS\u0005\u0011\u0000\u0000SU\u0003\f\u0006"+
		"\u0000TR\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000W\u000b\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000Y\\\u0003\u0010\b\u0000Z[\u0007\u0000\u0000"+
		"\u0000[]\u0003\u0010\b\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]\r\u0001\u0000\u0000\u0000^_\u0005\u0013\u0000\u0000_b\u0005"+
		"\u000b\u0000\u0000`c\u0003\u0010\b\u0000ac\u0003\b\u0004\u0000b`\u0001"+
		"\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000c\u000f\u0001\u0000\u0000"+
		"\u0000di\u0003\u0012\t\u0000ef\u0007\u0001\u0000\u0000fh\u0003\u0012\t"+
		"\u0000ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0011\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000lq\u0003\u0014\n\u0000mn\u0007\u0002\u0000\u0000"+
		"np\u0003\u0014\n\u0000om\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0013\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000t{\u0005\u0012\u0000\u0000u{\u0005"+
		"\u0013\u0000\u0000vw\u0005\t\u0000\u0000wx\u0003\b\u0004\u0000xy\u0005"+
		"\n\u0000\u0000y{\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000\u0000zu\u0001"+
		"\u0000\u0000\u0000zv\u0001\u0000\u0000\u0000{\u0015\u0001\u0000\u0000"+
		"\u0000\r\u001b#.3@ENV\\biqz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}