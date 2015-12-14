// Generated from funk.g4 by ANTLR 4.5.1
package funk.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class funkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, WS=21, NUMBER=22, CORPORAL=23, STRING=24, 
		BOOLEAN=25, ID=26, OP=27, COMMENT=28, LOCAL=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "WS", "NUMBER", "CORPORAL", "STRING", "BOOLEAN", 
		"ID", "OP", "COMMENT", "LOCAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'!'", "'.'", "'['", "']'", "'='", "','", "';'", "'return'", 
		"'if'", "'else'", "'for'", "'{'", "'}'", "'aggregate'", "':'", "'|'", 
		"'function'", "'?'", null, null, null, null, null, null, null, null, "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "WS", "NUMBER", 
		"CORPORAL", "STRING", "BOOLEAN", "ID", "OP", "COMMENT", "LOCAL"
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


	public funkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "funk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00c6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\6\27\u0085\n\27\r\27\16\27\u0086\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\7\31\u008f\n\31\f\31\16\31\u0092\13\31\3"+
		"\31\3\31\3\31\7\31\u0097\n\31\f\31\16\31\u009a\13\31\3\31\5\31\u009d\n"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00a8\n\32\3\33"+
		"\3\33\7\33\u00ac\n\33\f\33\16\33\u00af\13\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u00b7\n\34\3\35\3\35\3\35\3\35\7\35\u00bd\n\35\f\35\16\35\u00c0"+
		"\13\35\3\35\3\35\3\35\3\36\3\36\3\u00be\2\37\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\n\5\2\13\f\17\17\"\""+
		"\3\2\62;\3\2))\3\2$$\5\2C\\aac|\5\2\62;C\\c|\5\2,-//\61\61\4\2>>@@\u00cf"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rG\3\2"+
		"\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27V\3\2\2\2\31Y\3"+
		"\2\2\2\33^\3\2\2\2\35b\3\2\2\2\37d\3\2\2\2!f\3\2\2\2#p\3\2\2\2%r\3\2\2"+
		"\2\'t\3\2\2\2)}\3\2\2\2+\177\3\2\2\2-\u0084\3\2\2\2/\u0088\3\2\2\2\61"+
		"\u009c\3\2\2\2\63\u00a7\3\2\2\2\65\u00a9\3\2\2\2\67\u00b6\3\2\2\29\u00b8"+
		"\3\2\2\2;\u00c4\3\2\2\2=>\7*\2\2>\4\3\2\2\2?@\7+\2\2@\6\3\2\2\2AB\7#\2"+
		"\2B\b\3\2\2\2CD\7\60\2\2D\n\3\2\2\2EF\7]\2\2F\f\3\2\2\2GH\7_\2\2H\16\3"+
		"\2\2\2IJ\7?\2\2J\20\3\2\2\2KL\7.\2\2L\22\3\2\2\2MN\7=\2\2N\24\3\2\2\2"+
		"OP\7t\2\2PQ\7g\2\2QR\7v\2\2RS\7w\2\2ST\7t\2\2TU\7p\2\2U\26\3\2\2\2VW\7"+
		"k\2\2WX\7h\2\2X\30\3\2\2\2YZ\7g\2\2Z[\7n\2\2[\\\7u\2\2\\]\7g\2\2]\32\3"+
		"\2\2\2^_\7h\2\2_`\7q\2\2`a\7t\2\2a\34\3\2\2\2bc\7}\2\2c\36\3\2\2\2de\7"+
		"\177\2\2e \3\2\2\2fg\7c\2\2gh\7i\2\2hi\7i\2\2ij\7t\2\2jk\7g\2\2kl\7i\2"+
		"\2lm\7c\2\2mn\7v\2\2no\7g\2\2o\"\3\2\2\2pq\7<\2\2q$\3\2\2\2rs\7~\2\2s"+
		"&\3\2\2\2tu\7h\2\2uv\7w\2\2vw\7p\2\2wx\7e\2\2xy\7v\2\2yz\7k\2\2z{\7q\2"+
		"\2{|\7p\2\2|(\3\2\2\2}~\7A\2\2~*\3\2\2\2\177\u0080\t\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\b\26\2\2\u0082,\3\2\2\2\u0083\u0085\t\3\2\2\u0084"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087.\3\2\2\2\u0088\u0089\5-\27\2\u0089\u008a\7\60\2\2\u008a\u008b"+
		"\5-\27\2\u008b\60\3\2\2\2\u008c\u0090\7)\2\2\u008d\u008f\n\4\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u009d\7)\2\2\u0094"+
		"\u0098\7$\2\2\u0095\u0097\n\5\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009d\7$\2\2\u009c\u008c\3\2\2\2\u009c\u0094\3\2"+
		"\2\2\u009d\62\3\2\2\2\u009e\u009f\7V\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1"+
		"\7w\2\2\u00a1\u00a8\7g\2\2\u00a2\u00a3\7H\2\2\u00a3\u00a4\7c\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a8\7g\2\2\u00a7\u009e\3\2\2"+
		"\2\u00a7\u00a2\3\2\2\2\u00a8\64\3\2\2\2\u00a9\u00ad\t\6\2\2\u00aa\u00ac"+
		"\t\7\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\66\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b7\t\b\2"+
		"\2\u00b1\u00b2\7?\2\2\u00b2\u00b7\7?\2\2\u00b3\u00b4\7#\2\2\u00b4\u00b7"+
		"\7?\2\2\u00b5\u00b7\t\t\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b6"+
		"\u00b3\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b78\3\2\2\2\u00b8\u00b9\7\61\2\2"+
		"\u00b9\u00ba\7,\2\2\u00ba\u00be\3\2\2\2\u00bb\u00bd\13\2\2\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7,\2\2\u00c2\u00c3\7\61"+
		"\2\2\u00c3:\3\2\2\2\u00c4\u00c5\7&\2\2\u00c5<\3\2\2\2\13\2\u0086\u0090"+
		"\u0098\u009c\u00a7\u00ad\u00b6\u00be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}