// Generated from com\example\Language.g4 by ANTLR 4.9.2
package com.example;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, LLAVE_IZQ=2, LLAVE_DER=3, OP_SUMA=4, OP_RESTA=5, OP_MULT=6, OP_DIV=7, 
		PAR_IZQ=8, PAR_DER=9, ASIG=10, PUNTO_COMA=11, MENOR_QUE=12, MAYOR_QUE=13, 
		IGUAL_QUE=14, OP_OR=15, OP_AND=16, ENT=17, ID=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "LLAVE_IZQ", "LLAVE_DER", "OP_SUMA", "OP_RESTA", "OP_MULT", "OP_DIV", 
			"PAR_IZQ", "PAR_DER", "ASIG", "PUNTO_COMA", "MENOR_QUE", "MAYOR_QUE", 
			"IGUAL_QUE", "OP_OR", "OP_AND", "ENT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", 
			"'='", "';'", "'<'", "'>'", "'=='", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "LLAVE_IZQ", "LLAVE_DER", "OP_SUMA", "OP_RESTA", "OP_MULT", 
			"OP_DIV", "PAR_IZQ", "PAR_DER", "ASIG", "PUNTO_COMA", "MENOR_QUE", "MAYOR_QUE", 
			"IGUAL_QUE", "OP_OR", "OP_AND", "ENT", "ID", "WS"
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


	public LanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\6\22O\n\22\r\22\16\22P\3\23"+
		"\3\23\7\23U\n\23\f\23\16\23X\13\23\3\24\6\24[\n\24\r\24\16\24\\\3\24\3"+
		"\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\5\2\13\f\16\17\"\"\2b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5,\3\2"+
		"\2\2\7.\3\2\2\2\t\60\3\2\2\2\13\62\3\2\2\2\r\64\3\2\2\2\17\66\3\2\2\2"+
		"\218\3\2\2\2\23:\3\2\2\2\25<\3\2\2\2\27>\3\2\2\2\31@\3\2\2\2\33B\3\2\2"+
		"\2\35D\3\2\2\2\37G\3\2\2\2!J\3\2\2\2#N\3\2\2\2%R\3\2\2\2\'Z\3\2\2\2)*"+
		"\7k\2\2*+\7h\2\2+\4\3\2\2\2,-\7}\2\2-\6\3\2\2\2./\7\177\2\2/\b\3\2\2\2"+
		"\60\61\7-\2\2\61\n\3\2\2\2\62\63\7/\2\2\63\f\3\2\2\2\64\65\7,\2\2\65\16"+
		"\3\2\2\2\66\67\7\61\2\2\67\20\3\2\2\289\7*\2\29\22\3\2\2\2:;\7+\2\2;\24"+
		"\3\2\2\2<=\7?\2\2=\26\3\2\2\2>?\7=\2\2?\30\3\2\2\2@A\7>\2\2A\32\3\2\2"+
		"\2BC\7@\2\2C\34\3\2\2\2DE\7?\2\2EF\7?\2\2F\36\3\2\2\2GH\7~\2\2HI\7~\2"+
		"\2I \3\2\2\2JK\7(\2\2KL\7(\2\2L\"\3\2\2\2MO\t\2\2\2NM\3\2\2\2OP\3\2\2"+
		"\2PN\3\2\2\2PQ\3\2\2\2Q$\3\2\2\2RV\t\3\2\2SU\t\4\2\2TS\3\2\2\2UX\3\2\2"+
		"\2VT\3\2\2\2VW\3\2\2\2W&\3\2\2\2XV\3\2\2\2Y[\t\5\2\2ZY\3\2\2\2[\\\3\2"+
		"\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\b\24\2\2_(\3\2\2\2\6\2PV\\\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}