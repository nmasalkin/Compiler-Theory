package antlr;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SELECT=9, 
		FROM=10, WHERE=11, ORDER=12, BY=13, LIMIT=14, ASC=15, DESC=16, IDENTIFIER=17, 
		NUMBER=18, STRING=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "SELECT", 
			"FROM", "WHERE", "ORDER", "BY", "LIMIT", "ASC", "DESC", "IDENTIFIER", 
			"NUMBER", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "','", "'='", "'>'", "'<'", "'>='", "'<='", "'<>'", "'SELECT'", 
			"'FROM'", "'WHERE'", "'ORDER'", "'BY'", "'LIMIT'", "'ASC'", "'DESC'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "SELECT", "FROM", 
			"WHERE", "ORDER", "BY", "LIMIT", "ASC", "DESC", "IDENTIFIER", "NUMBER", 
			"STRING", "WS"
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
		"\u0004\u0000\u0014\u0082\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0005\u0010i\b\u0010"+
		"\n\u0010\f\u0010l\t\u0010\u0001\u0011\u0004\u0011o\b\u0011\u000b\u0011"+
		"\f\u0011p\u0001\u0012\u0001\u0012\u0005\u0012u\b\u0012\n\u0012\f\u0012"+
		"x\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013}\b\u0013\u000b"+
		"\u0013\f\u0013~\u0001\u0013\u0001\u0013\u0001v\u0000\u0014\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0004\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u0085\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000"+
		"\u0003+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000\u0007/"+
		"\u0001\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b3\u0001\u0000"+
		"\u0000\u0000\r6\u0001\u0000\u0000\u0000\u000f9\u0001\u0000\u0000\u0000"+
		"\u0011<\u0001\u0000\u0000\u0000\u0013C\u0001\u0000\u0000\u0000\u0015H"+
		"\u0001\u0000\u0000\u0000\u0017N\u0001\u0000\u0000\u0000\u0019T\u0001\u0000"+
		"\u0000\u0000\u001bW\u0001\u0000\u0000\u0000\u001d]\u0001\u0000\u0000\u0000"+
		"\u001fa\u0001\u0000\u0000\u0000!f\u0001\u0000\u0000\u0000#n\u0001\u0000"+
		"\u0000\u0000%r\u0001\u0000\u0000\u0000\'|\u0001\u0000\u0000\u0000)*\u0005"+
		"*\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005,\u0000\u0000,\u0004"+
		"\u0001\u0000\u0000\u0000-.\u0005=\u0000\u0000.\u0006\u0001\u0000\u0000"+
		"\u0000/0\u0005>\u0000\u00000\b\u0001\u0000\u0000\u000012\u0005<\u0000"+
		"\u00002\n\u0001\u0000\u0000\u000034\u0005>\u0000\u000045\u0005=\u0000"+
		"\u00005\f\u0001\u0000\u0000\u000067\u0005<\u0000\u000078\u0005=\u0000"+
		"\u00008\u000e\u0001\u0000\u0000\u00009:\u0005<\u0000\u0000:;\u0005>\u0000"+
		"\u0000;\u0010\u0001\u0000\u0000\u0000<=\u0005S\u0000\u0000=>\u0005E\u0000"+
		"\u0000>?\u0005L\u0000\u0000?@\u0005E\u0000\u0000@A\u0005C\u0000\u0000"+
		"AB\u0005T\u0000\u0000B\u0012\u0001\u0000\u0000\u0000CD\u0005F\u0000\u0000"+
		"DE\u0005R\u0000\u0000EF\u0005O\u0000\u0000FG\u0005M\u0000\u0000G\u0014"+
		"\u0001\u0000\u0000\u0000HI\u0005W\u0000\u0000IJ\u0005H\u0000\u0000JK\u0005"+
		"E\u0000\u0000KL\u0005R\u0000\u0000LM\u0005E\u0000\u0000M\u0016\u0001\u0000"+
		"\u0000\u0000NO\u0005O\u0000\u0000OP\u0005R\u0000\u0000PQ\u0005D\u0000"+
		"\u0000QR\u0005E\u0000\u0000RS\u0005R\u0000\u0000S\u0018\u0001\u0000\u0000"+
		"\u0000TU\u0005B\u0000\u0000UV\u0005Y\u0000\u0000V\u001a\u0001\u0000\u0000"+
		"\u0000WX\u0005L\u0000\u0000XY\u0005I\u0000\u0000YZ\u0005M\u0000\u0000"+
		"Z[\u0005I\u0000\u0000[\\\u0005T\u0000\u0000\\\u001c\u0001\u0000\u0000"+
		"\u0000]^\u0005A\u0000\u0000^_\u0005S\u0000\u0000_`\u0005C\u0000\u0000"+
		"`\u001e\u0001\u0000\u0000\u0000ab\u0005D\u0000\u0000bc\u0005E\u0000\u0000"+
		"cd\u0005S\u0000\u0000de\u0005C\u0000\u0000e \u0001\u0000\u0000\u0000f"+
		"j\u0007\u0000\u0000\u0000gi\u0007\u0001\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000k\"\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mo\u0007"+
		"\u0002\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q$\u0001\u0000\u0000"+
		"\u0000rv\u0005\'\u0000\u0000su\t\u0000\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000ux\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005"+
		"\'\u0000\u0000z&\u0001\u0000\u0000\u0000{}\u0007\u0003\u0000\u0000|{\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0006\u0013\u0000\u0000\u0081(\u0001\u0000\u0000\u0000\u0005\u0000"+
		"jpv~\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}