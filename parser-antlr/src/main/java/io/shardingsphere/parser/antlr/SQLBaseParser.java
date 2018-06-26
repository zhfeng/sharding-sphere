// Generated from SQLBase.g4 by ANTLR 4.7.1
package io.shardingsphere.parser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, NUMBER=2, EXP=3, HEX_DIGIT=4, BIT_NUM=5, WS=6, SELECT=7, ALL=8, 
		ANY=9, DISTINCT=10, FROM=11, PARTITION=12, WHERE=13, GROUP=14, BY=15, 
		ASC=16, DESC=17, WITH=18, ROLLUP=19, HAVING=20, WINDOW=21, AS=22, ORDER=23, 
		LIMIT=24, OFFSET=25, INTO=26, SET=27, FOR=28, UPDATE=29, SHARE=30, OF=31, 
		NOWAIT=32, LOCKED=33, LOCK=34, IN=35, MODE=36, INNER=37, CROSS=38, JOIN=39, 
		ON=40, LEFT=41, RIGHT=42, OUTER=43, NATURAL=44, USING=45, USE=46, INDEX=47, 
		KEY=48, IGNORE=49, FORCE=50, UNION=51, DEFAULT=52, DELETE=53, QUICK=54, 
		INSERT=55, VALUES=56, VALUE=57, DUPLICATE=58, EXISTS=59, IS=60, AND=61, 
		OR=62, XOR=63, NOT=64, BETWEEN=65, NULL=66, TRUE=67, FALSE=68, UNKNOWN=69, 
		SOUNDS=70, LIKE=71, DIV=72, MOD=73, BINARY=74, ROW=75, ESCAPE=76, REGEXP=77, 
		DATE=78, TIME=79, TIMESTAMP=80, ID=81, AND_SYM=82, OR_SYM=83, NOT_SYM=84, 
		SAFE_EQ=85, UNARY_BIT_COMPLEMENT=86, BIT_INCLUSIVE_OR=87, BIT_AND=88, 
		SIGNED_LEFT_SHIFT=89, SIGNED_RIGHT_SHIFT=90, BIT_EXCLUSIVE_OR=91, MOD_SYM=92, 
		ADD_OP=93, SUB_OP=94, MUL_OP=95, DIV_OP=96, DOT=97, EQ=98, EQ_OR_ASSIGN=99, 
		NEQ=100, NEQ_SYM=101, GT=102, GTE=103, LT=104, LTE=105, LEFT_PAREN=106, 
		RIGHT_PAREN=107, LEFT_BRACE=108, RIGHT_BRACE=109, COMMA=110, DOUBLE_QUOTA=111, 
		SINGLE_QUOTA=112, BACK_QUOTA=113, UL_=114;
	public static final int
		RULE_itemList = 0, RULE_item = 1;
	public static final String[] ruleNames = {
		"itemList", "item"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "'&&'", "'||'", 
		"'!'", "'<=>'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", "'+'", 
		"'-'", "'*'", "'/'", "'.'", "'=='", "'='", "'!='", "'<>'", "'>'", "'>='", 
		"'<'", "'<='", "'('", "')'", "'{'", "'}'", "','", "'\"'", "'''", "'`'", 
		"'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "NUMBER", "EXP", "HEX_DIGIT", "BIT_NUM", "WS", "SELECT", 
		"ALL", "ANY", "DISTINCT", "FROM", "PARTITION", "WHERE", "GROUP", "BY", 
		"ASC", "DESC", "WITH", "ROLLUP", "HAVING", "WINDOW", "AS", "ORDER", "LIMIT", 
		"OFFSET", "INTO", "SET", "FOR", "UPDATE", "SHARE", "OF", "NOWAIT", "LOCKED", 
		"LOCK", "IN", "MODE", "INNER", "CROSS", "JOIN", "ON", "LEFT", "RIGHT", 
		"OUTER", "NATURAL", "USING", "USE", "INDEX", "KEY", "IGNORE", "FORCE", 
		"UNION", "DEFAULT", "DELETE", "QUICK", "INSERT", "VALUES", "VALUE", "DUPLICATE", 
		"EXISTS", "IS", "AND", "OR", "XOR", "NOT", "BETWEEN", "NULL", "TRUE", 
		"FALSE", "UNKNOWN", "SOUNDS", "LIKE", "DIV", "MOD", "BINARY", "ROW", "ESCAPE", 
		"REGEXP", "DATE", "TIME", "TIMESTAMP", "ID", "AND_SYM", "OR_SYM", "NOT_SYM", 
		"SAFE_EQ", "UNARY_BIT_COMPLEMENT", "BIT_INCLUSIVE_OR", "BIT_AND", "SIGNED_LEFT_SHIFT", 
		"SIGNED_RIGHT_SHIFT", "BIT_EXCLUSIVE_OR", "MOD_SYM", "ADD_OP", "SUB_OP", 
		"MUL_OP", "DIV_OP", "DOT", "EQ", "EQ_OR_ASSIGN", "NEQ", "NEQ_SYM", "GT", 
		"GTE", "LT", "LTE", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", 
		"COMMA", "DOUBLE_QUOTA", "SINGLE_QUOTA", "BACK_QUOTA", "UL_"
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
	public String getGrammarFileName() { return "SQLBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ItemListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SQLBaseParser.LEFT_PAREN, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SQLBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLBaseParser.COMMA, i);
		}
		public ItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLBaseVisitor ) return ((SQLBaseVisitor<? extends T>)visitor).visitItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemListContext itemList() throws RecognitionException {
		ItemListContext _localctx = new ItemListContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_itemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(LEFT_PAREN);
			setState(5);
			item();
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(6);
				match(COMMA);
				setState(7);
				item();
				}
				}
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(13);
			match(RIGHT_PAREN);
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

	public static class ItemContext extends ParserRuleContext {
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLBaseVisitor ) return ((SQLBaseVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3t\24\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\2\3\2\3\3\3\3\3\3\2\2"+
		"\4\2\4\2\2\2\22\2\6\3\2\2\2\4\21\3\2\2\2\6\7\7l\2\2\7\f\5\4\3\2\b\t\7"+
		"p\2\2\t\13\5\4\3\2\n\b\3\2\2\2\13\16\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r"+
		"\17\3\2\2\2\16\f\3\2\2\2\17\20\7m\2\2\20\3\3\2\2\2\21\22\3\2\2\2\22\5"+
		"\3\2\2\2\3\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}