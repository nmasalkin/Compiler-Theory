package antlr;// Generated from SQL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, STRING=4, NUMBER=5, IDENT=6, SELECT=7, FROM=8, WHERE=9, 
		ORDER=10, BY=11, ASC=12, DESC=13, LIMIT=14, EQ=15, NEQ=16, LT=17, GT=18, 
		LE=19, GE=20, COMMA=21, STAR=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WS", "STRING", "NUMBER", "IDENT", "SELECT", "FROM", 
			"WHERE", "ORDER", "BY", "ASC", "DESC", "LIMIT", "EQ", "NEQ", "LT", "GT", 
			"LE", "GE", "COMMA", "STAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", null, null, null, null, "'SELECT'", "'FROM'", "'WHERE'", 
			"'ORDER'", "'BY'", "'ASC'", "'DESC'", "'LIMIT'", "'='", "'<>'", "'<'", 
			"'>'", "'<='", "'>='", "','", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS", "STRING", "NUMBER", "IDENT", "SELECT", "FROM", 
			"WHERE", "ORDER", "BY", "ASC", "DESC", "LIMIT", "EQ", "NEQ", "LT", "GT", 
			"LE", "GE", "COMMA", "STAR"
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


	public SQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

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
		"\u0004\u0000\u0016\u008a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0004\u00023\b\u0002\u000b\u0002\f\u00024\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0005\u0003;\b\u0003\n\u0003\f\u0003>\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004C\b\u0004\u000b"+
		"\u0004\f\u0004D\u0001\u0005\u0001\u0005\u0005\u0005I\b\u0005\n\u0005\f"+
		"\u0005L\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001<\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014"+
		")\u0015+\u0016\u0001\u0000\u0004\u0003\u0000\t\n\r\r  \u0001\u000009\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u008d\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001"+
		"-\u0001\u0000\u0000\u0000\u0003/\u0001\u0000\u0000\u0000\u00052\u0001"+
		"\u0000\u0000\u0000\u00078\u0001\u0000\u0000\u0000\tB\u0001\u0000\u0000"+
		"\u0000\u000bF\u0001\u0000\u0000\u0000\rM\u0001\u0000\u0000\u0000\u000f"+
		"T\u0001\u0000\u0000\u0000\u0011Y\u0001\u0000\u0000\u0000\u0013_\u0001"+
		"\u0000\u0000\u0000\u0015e\u0001\u0000\u0000\u0000\u0017h\u0001\u0000\u0000"+
		"\u0000\u0019l\u0001\u0000\u0000\u0000\u001bq\u0001\u0000\u0000\u0000\u001d"+
		"w\u0001\u0000\u0000\u0000\u001fy\u0001\u0000\u0000\u0000!|\u0001\u0000"+
		"\u0000\u0000#~\u0001\u0000\u0000\u0000%\u0080\u0001\u0000\u0000\u0000"+
		"\'\u0083\u0001\u0000\u0000\u0000)\u0086\u0001\u0000\u0000\u0000+\u0088"+
		"\u0001\u0000\u0000\u0000-.\u0005(\u0000\u0000.\u0002\u0001\u0000\u0000"+
		"\u0000/0\u0005)\u0000\u00000\u0004\u0001\u0000\u0000\u000013\u0007\u0000"+
		"\u0000\u000021\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"67\u0006\u0002\u0000\u00007\u0006\u0001\u0000\u0000\u00008<\u0005\'\u0000"+
		"\u00009;\t\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=?\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0005\'\u0000\u0000@\b\u0001"+
		"\u0000\u0000\u0000AC\u0007\u0001\u0000\u0000BA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000E\n\u0001\u0000\u0000\u0000FJ\u0007\u0002\u0000\u0000GI\u0007\u0003"+
		"\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\f\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000MN\u0005S\u0000\u0000NO\u0005E\u0000\u0000O"+
		"P\u0005L\u0000\u0000PQ\u0005E\u0000\u0000QR\u0005C\u0000\u0000RS\u0005"+
		"T\u0000\u0000S\u000e\u0001\u0000\u0000\u0000TU\u0005F\u0000\u0000UV\u0005"+
		"R\u0000\u0000VW\u0005O\u0000\u0000WX\u0005M\u0000\u0000X\u0010\u0001\u0000"+
		"\u0000\u0000YZ\u0005W\u0000\u0000Z[\u0005H\u0000\u0000[\\\u0005E\u0000"+
		"\u0000\\]\u0005R\u0000\u0000]^\u0005E\u0000\u0000^\u0012\u0001\u0000\u0000"+
		"\u0000_`\u0005O\u0000\u0000`a\u0005R\u0000\u0000ab\u0005D\u0000\u0000"+
		"bc\u0005E\u0000\u0000cd\u0005R\u0000\u0000d\u0014\u0001\u0000\u0000\u0000"+
		"ef\u0005B\u0000\u0000fg\u0005Y\u0000\u0000g\u0016\u0001\u0000\u0000\u0000"+
		"hi\u0005A\u0000\u0000ij\u0005S\u0000\u0000jk\u0005C\u0000\u0000k\u0018"+
		"\u0001\u0000\u0000\u0000lm\u0005D\u0000\u0000mn\u0005E\u0000\u0000no\u0005"+
		"S\u0000\u0000op\u0005C\u0000\u0000p\u001a\u0001\u0000\u0000\u0000qr\u0005"+
		"L\u0000\u0000rs\u0005I\u0000\u0000st\u0005M\u0000\u0000tu\u0005I\u0000"+
		"\u0000uv\u0005T\u0000\u0000v\u001c\u0001\u0000\u0000\u0000wx\u0005=\u0000"+
		"\u0000x\u001e\u0001\u0000\u0000\u0000yz\u0005<\u0000\u0000z{\u0005>\u0000"+
		"\u0000{ \u0001\u0000\u0000\u0000|}\u0005<\u0000\u0000}\"\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005>\u0000\u0000\u007f$\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005<\u0000\u0000\u0081\u0082\u0005=\u0000\u0000\u0082&\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005>\u0000\u0000\u0084\u0085\u0005=\u0000"+
		"\u0000\u0085(\u0001\u0000\u0000\u0000\u0086\u0087\u0005,\u0000\u0000\u0087"+
		"*\u0001\u0000\u0000\u0000\u0088\u0089\u0005*\u0000\u0000\u0089,\u0001"+
		"\u0000\u0000\u0000\u0005\u00004<DJ\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}