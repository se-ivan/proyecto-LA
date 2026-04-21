// Generated from com\example\minecraft_code.g4 by ANTLR 4.9.2
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
public class minecraft_codeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FORTUNE=1, INFINITY=2, UNBREAKING_START=3, UNBREAKING_END=4, SHARPNESS=5, 
		MULTISHOT=6, PIERCING=7, EFFICIENCY=8, LURE=9, LUCK_OF_THE_SEA=10, APPLY=11, 
		LAPIS_LAZULI=12, KNOCKBACK=13, PUNCH=14, MENDING=15, IMPALING=16, CHANNELING=17, 
		ENT=18, BOOK=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FORTUNE", "INFINITY", "UNBREAKING_START", "UNBREAKING_END", "SHARPNESS", 
			"MULTISHOT", "PIERCING", "EFFICIENCY", "LURE", "LUCK_OF_THE_SEA", "APPLY", 
			"LAPIS_LAZULI", "KNOCKBACK", "PUNCH", "MENDING", "IMPALING", "CHANNELING", 
			"ENT", "BOOK", "WS"
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
			"'\u254E\u14B2i!\u158B|:\u254E\u30EA\u2524'", "'\u152E\u2351\u158B\u30EA\u30EA\u14B7|:\u254E\u30EA\u2524'"
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


	public minecraft_codeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "minecraft_code.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00f2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\6\23"+
		"\u00e1\n\23\r\23\16\23\u00e2\3\24\3\24\7\24\u00e7\n\24\f\24\16\24\u00ea"+
		"\13\24\3\25\6\25\u00ed\n\25\r\25\16\25\u00ee\3\25\3\25\2\2\26\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26\3\2\6\3\2\62;!\2##\61\61C\\aac|~~\u00a3\u00a3\u0298"+
		"\u0298\u0309\u0309\u0325\u0325\u05d5\u05d5\u1453\u1453\u14b4\u14b4\u14b9"+
		"\u14b9\u14ef\u14ef\u14f7\u14f7\u1513\u1513\u21ba\u21ba\u2236\u2236\u2239"+
		"\u2239\u22a5\u22a5\u22f0\u22f0\u234c\u234c\u2353\u2353\u2395\u2395\u2550"+
		"\u2550\u268f\u268f\u2a07\u2a07\u30ec\u30ec\ua58e\ua58e\ua590\ua590!\2"+
		"##\61;C\\aac|~~\u00a3\u00a3\u0298\u0298\u0309\u0309\u0325\u0325\u05d5"+
		"\u05d5\u1453\u1453\u14b4\u14b4\u14b9\u14b9\u14ef\u14ef\u14f7\u14f7\u1513"+
		"\u1513\u21ba\u21ba\u2236\u2236\u2239\u2239\u22a5\u22a5\u22f0\u22f0\u234c"+
		"\u234c\u2353\u2353\u2395\u2395\u2550\u2550\u268f\u268f\u2a07\u2a07\u30ec"+
		"\u30ec\ua58e\ua58e\ua590\ua590\5\2\13\f\16\17\"\"\4\3\2\uf302\3\uf302"+
		"\3\3\2\uf53b\3\uf53b\3\u00f4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3"+
		"\2\2\2\5\63\3\2\2\2\7=\3\2\2\2\tP\3\2\2\2\13a\3\2\2\2\rl\3\2\2\2\17w\3"+
		"\2\2\2\21\u0081\3\2\2\2\23\u008c\3\2\2\2\25\u0092\3\2\2\2\27\u00a5\3\2"+
		"\2\2\31\u00a7\3\2\2\2\33\u00a9\3\2\2\2\35\u00b9\3\2\2\2\37\u00c0\3\2\2"+
		"\2!\u00c8\3\2\2\2#\u00d3\3\2\2\2%\u00e0\3\2\2\2\'\u00e4\3\2\2\2)\u00ec"+
		"\3\2\2\2+,\7\u2395\2\2,-\7\u148f\2\2-.\7\u2239\2\2./\7\u14a5\2\2/\60\7"+
		"\u268f\2\2\60\61\7\u30ec\2\2\61\62\7\u14b9\2\2\62\4\3\2\2\2\63\64\7\u2550"+
		"\2\2\64\65\7\u30ec\2\2\65\66\7\u2395\2\2\66\67\7\u2550\2\2\678\7\u30ec"+
		"\2\289\7\u2550\2\29:\7\u213a\2\2:;\7~\2\2;<\7~\2\2<\6\3\2\2\2=>\7\u268f"+
		"\2\2>?\7\u30ec\2\2?@\7\u154c\2\2@A\7\u2239\2\2AB\7\u14b9\2\2BC\7\u158d"+
		"\2\2CD\7\u00b9\2\2DE\7\u01c2\2\2EF\7\u00b9\2\2FG\7\u2550\2\2GH\7\u30ec"+
		"\2\2HI\7\u2526\2\2IJ\7\u23bf\2\2JK\7\u03e1\2\2KL\7\u14a5\2\2LM\7\u158d"+
		"\2\2MN\7\u2239\2\2NO\7\u14a5\2\2O\b\3\2\2\2PQ\7\u268f\2\2QR\7\u30ec\2"+
		"\2RS\7\u154c\2\2ST\7\u2239\2\2TU\7\u14b9\2\2UV\7\u158d\2\2VW\7\u00b9\2"+
		"\2WX\7\u01c2\2\2XY\7\u00b9\2\2YZ\7\u2550\2\2Z[\7\u30ec\2\2[\\\7\u2526"+
		"\2\2\\]\7\u23bf\2\2]^\7\u14b9\2\2^_\7\u30ec\2\2_`\7\u21ba\2\2`\n\3\2\2"+
		"\2ab\7\u03e0\2\2bc\7\u2353\2\2cd\7\u158d\2\2de\7\u2239\2\2ef\7k\2\2fg"+
		"\7#\2\2gh\7\u30ec\2\2hi\7\u14b9\2\2ij\7\u03e1\2\2jk\7\u03e1\2\2k\f\3\2"+
		"\2\2lm\7\u14b4\2\2mn\7\u268f\2\2no\7~\2\2op\7<\2\2pq\7\u14a5\2\2qr\7\u2550"+
		"\2\2rs\7\u03e1\2\2st\7\u2353\2\2tu\7\u148f\2\2uv\7\u14a5\2\2v\16\3\2\2"+
		"\2wx\7K\2\2xy\7#\2\2yz\7\u2550\2\2z{\7\u14b9\2\2{|\7\u2239\2\2|}\7\u1530"+
		"\2\2}~\7\u2550\2\2~\177\7\u30ec\2\2\177\u0080\7\u2526\2\2\u0080\20\3\2"+
		"\2\2\u0081\u0082\7\u14b9\2\2\u0082\u0083\7\u2395\2\2\u0083\u0084\7\u2395"+
		"\2\2\u0084\u0085\7\u2550\2\2\u0085\u0086\7\u1530\2\2\u0086\u0087\7\u2550"+
		"\2\2\u0087\u0088\7\u14b9\2\2\u0088\u0089\7\u30ec\2\2\u0089\u008a\7\u1530"+
		"\2\2\u008a\u008b\7\u0967\2\2\u008b\22\3\2\2\2\u008c\u008d\7~\2\2\u008d"+
		"\u008e\7<\2\2\u008e\u008f\7\u268f\2\2\u008f\u0090\7\u2239\2\2\u0090\u0091"+
		"\7\u14b9\2\2\u0091\24\3\2\2\2\u0092\u0093\7~\2\2\u0093\u0094\7<\2\2\u0094"+
		"\u0095\7\u268f\2\2\u0095\u0096\7\u1530\2\2\u0096\u0097\7\u00b9\2\2\u0097"+
		"\u0098\7\u01c2\2\2\u0098\u0099\7\u00b9\2\2\u0099\u009a\7\u23bf\2\2\u009a"+
		"\u009b\7\u148f\2\2\u009b\u009c\7\u2395\2\2\u009c\u009d\7\u23bf\2\2\u009d"+
		"\u009e\7\u14a5\2\2\u009e\u009f\7\u2353\2\2\u009f\u00a0\7\u14b9\2\2\u00a0"+
		"\u00a1\7\u23bf\2\2\u00a1\u00a2\7\u03e1\2\2\u00a2\u00a3\7\u14b9\2\2\u00a3"+
		"\u00a4\7\u158d\2\2\u00a4\26\3\2\2\2\u00a5\u00a6\t\6\2\2\u00a6\30\3\2\2"+
		"\2\u00a7\u00a8\t\7\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\7\u00b9\2\2\u00aa"+
		"\u00ab\7\u01c2\2\2\u00ab\u00ac\7\u00b9\2\2\u00ac\u00ad\7\u30ec\2\2\u00ad"+
		"\u00ae\7\u148f\2\2\u00ae\u00af\7\u1530\2\2\u00af\u00b0\7\u00b9\2\2\u00b0"+
		"\u00b1\7\u01c2\2\2\u00b1\u00b2\7\u00b9\2\2\u00b2\u00b3\7\u154c\2\2\u00b3"+
		"\u00b4\7\u158d\2\2\u00b4\u00b5\7\u1530\2\2\u00b5\u00b6\7\u00b9\2\2\u00b6"+
		"\u00b7\7\u01c2\2\2\u00b7\u00b8\7\u00b9\2\2\u00b8\34\3\2\2\2\u00b9\u00ba"+
		"\7K\2\2\u00ba\u00bb\7#\2\2\u00bb\u00bc\7\u268f\2\2\u00bc\u00bd\7\u30ec"+
		"\2\2\u00bd\u00be\7\u1530\2\2\u00be\u00bf\7\u2353\2\2\u00bf\36\3\2\2\2"+
		"\u00c0\u00c1\7\u14b4\2\2\u00c1\u00c2\7\u14b9\2\2\u00c2\u00c3\7\u30ec\2"+
		"\2\u00c3\u00c4\7\u21ba\2\2\u00c4\u00c5\7\u2550\2\2\u00c5\u00c6\7\u30ec"+
		"\2\2\u00c6\u00c7\7\u2526\2\2\u00c7 \3\2\2\2\u00c8\u00c9\7\u2550\2\2\u00c9"+
		"\u00ca\7\u14b4\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7#\2\2\u00cc\u00cd\7"+
		"\u158d\2\2\u00cd\u00ce\7~\2\2\u00ce\u00cf\7<\2\2\u00cf\u00d0\7\u2550\2"+
		"\2\u00d0\u00d1\7\u30ec\2\2\u00d1\u00d2\7\u2526\2\2\u00d2\"\3\2\2\2\u00d3"+
		"\u00d4\7\u1530\2\2\u00d4\u00d5\7\u2353\2\2\u00d5\u00d6\7\u158d\2\2\u00d6"+
		"\u00d7\7\u30ec\2\2\u00d7\u00d8\7\u30ec\2\2\u00d8\u00d9\7\u14b9\2\2\u00d9"+
		"\u00da\7~\2\2\u00da\u00db\7<\2\2\u00db\u00dc\7\u2550\2\2\u00dc\u00dd\7"+
		"\u30ec\2\2\u00dd\u00de\7\u2526\2\2\u00de$\3\2\2\2\u00df\u00e1\t\2\2\2"+
		"\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3&\3\2\2\2\u00e4\u00e8\t\3\2\2\u00e5\u00e7\t\4\2\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9(\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\t\5\2\2\u00ec\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f1\b\25\2\2\u00f1*\3\2\2\2\6\2\u00e2\u00e8\u00ee"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}