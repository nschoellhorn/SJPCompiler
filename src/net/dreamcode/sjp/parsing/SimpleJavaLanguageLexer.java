// Generated from E:/IntelliJ Projects/SJPCompiler/grammar\SimpleJavaLanguage.g4 by ANTLR 4.4.1-dev
package net.dreamcode.sjp.parsing;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleJavaLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4.1-dev", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, LINE_COMMENT=11, COMMENT=12, NUMBER=13, WHITESPACE=14, IDENTIFIER=15, 
		STRING=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "LINE_COMMENT", "COMMENT", "NUMBER", "WHITESPACE", "IDENTIFIER", 
		"STRING"
	};


	public SimpleJavaLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleJavaLanguage.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fx\n\f"+
		"\f\f\16\f{\13\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u0085\n\r\f\r\16\r"+
		"\u0088\13\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16\u0090\n\16\r\16\16\16\u0091"+
		"\3\17\6\17\u0095\n\17\r\17\16\17\u0096\3\17\3\17\3\20\3\20\7\20\u009d"+
		"\n\20\f\20\16\20\u00a0\13\20\3\21\3\21\7\21\u00a4\n\21\f\21\16\21\u00a7"+
		"\13\21\3\21\3\21\4\u0086\u00a5\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\7\3\2\f\f\3\2\62;\5\2"+
		"\13\f\17\17\"\"\4\2C\\c|\5\2\62;C\\c|\u00af\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5*\3\2\2\2\7-\3\2\2\2"+
		"\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23f\3\2"+
		"\2\2\25h\3\2\2\2\27s\3\2\2\2\31\u0080\3\2\2\2\33\u008f\3\2\2\2\35\u0094"+
		"\3\2\2\2\37\u009a\3\2\2\2!\u00a1\3\2\2\2#$\7c\2\2$%\7u\2\2%&\7u\2\2&\'"+
		"\7k\2\2\'(\7i\2\2()\7p\2\2)\4\3\2\2\2*+\7v\2\2+,\7q\2\2,\6\3\2\2\2-.\7"+
		"-\2\2.\b\3\2\2\2/\60\7,\2\2\60\n\3\2\2\2\61\62\7/\2\2\62\f\3\2\2\2\63"+
		"\64\7c\2\2\64\65\7n\2\2\65\66\7n\2\2\66\67\7q\2\2\678\7e\2\289\7c\2\2"+
		"9:\7v\2\2:;\7g\2\2;<\7\"\2\2<=\7v\2\2=>\7g\2\2>?\7z\2\2?@\7v\2\2@A\7\""+
		"\2\2AB\7y\2\2BC\7k\2\2CD\7v\2\2DE\7j\2\2EF\7\"\2\2FG\7p\2\2GH\7c\2\2H"+
		"I\7o\2\2IJ\7g\2\2JK\7\"\2\2K\16\3\2\2\2LM\7\61\2\2M\20\3\2\2\2NO\7c\2"+
		"\2OP\7n\2\2PQ\7n\2\2QR\7q\2\2RS\7e\2\2ST\7c\2\2TU\7v\2\2UV\7g\2\2VW\7"+
		"\"\2\2WX\7k\2\2XY\7p\2\2YZ\7v\2\2Z[\7\"\2\2[\\\7y\2\2\\]\7k\2\2]^\7v\2"+
		"\2^_\7j\2\2_`\7\"\2\2`a\7p\2\2ab\7c\2\2bc\7o\2\2cd\7g\2\2de\7\"\2\2e\22"+
		"\3\2\2\2fg\7=\2\2g\24\3\2\2\2hi\7r\2\2ij\7t\2\2jk\7k\2\2kl\7p\2\2lm\7"+
		"v\2\2mn\7n\2\2no\7k\2\2op\7p\2\2pq\7g\2\2qr\7\"\2\2r\26\3\2\2\2st\7\61"+
		"\2\2tu\7\61\2\2uy\3\2\2\2vx\n\2\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3"+
		"\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\f\2\2}~\3\2\2\2~\177\b\f\2\2\177\30\3\2"+
		"\2\2\u0080\u0081\7\61\2\2\u0081\u0082\7,\2\2\u0082\u0086\3\2\2\2\u0083"+
		"\u0085\13\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\7,\2\2\u008a\u008b\7\61\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\r"+
		"\2\2\u008d\32\3\2\2\2\u008e\u0090\t\3\2\2\u008f\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\34\3\2\2\2\u0093"+
		"\u0095\t\4\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\17\3\2\u0099"+
		"\36\3\2\2\2\u009a\u009e\t\5\2\2\u009b\u009d\t\6\2\2\u009c\u009b\3\2\2"+
		"\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f "+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a5\7$\2\2\u00a2\u00a4\13\2\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7$\2\2\u00a9"+
		"\"\3\2\2\2\t\2y\u0086\u0091\u0096\u009e\u00a5\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}