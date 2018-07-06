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
		ASC=16, DESC=17, WITH=18, RECURSIVE=19, ROLLUP=20, HAVING=21, WINDOW=22, 
		AS=23, ORDER=24, LIMIT=25, OFFSET=26, INTO=27, SET=28, FOR=29, UPDATE=30, 
		SHARE=31, OF=32, NOWAIT=33, LOCKED=34, LOCK=35, IN=36, MODE=37, INNER=38, 
		CROSS=39, JOIN=40, ON=41, LEFT=42, RIGHT=43, OUTER=44, NATURAL=45, USING=46, 
		USE=47, INDEX=48, KEY=49, IGNORE=50, FORCE=51, UNION=52, DEFAULT=53, DELETE=54, 
		QUICK=55, INSERT=56, VALUES=57, VALUE=58, DUPLICATE=59, EXISTS=60, IS=61, 
		AND=62, OR=63, XOR=64, NOT=65, BETWEEN=66, NULL=67, TRUE=68, FALSE=69, 
		UNKNOWN=70, SOUNDS=71, LIKE=72, DIV=73, MOD=74, BINARY=75, ROW=76, ESCAPE=77, 
		REGEXP=78, DATE=79, TIME=80, TIMESTAMP=81, CASE=82, WHEN=83, THEN=84, 
		IF=85, ELSE=86, END=87, ID=88, AND_SYM=89, OR_SYM=90, NOT_SYM=91, UNARY_BIT_COMPLEMENT=92, 
		BIT_INCLUSIVE_OR=93, BIT_AND=94, SIGNED_LEFT_SHIFT=95, SIGNED_RIGHT_SHIFT=96, 
		BIT_EXCLUSIVE_OR=97, MOD_SYM=98, PLUS=99, MINUS=100, ASTERISK=101, SLASH=102, 
		DOT=103, SAFE_EQ=104, EQ=105, EQ_OR_ASSIGN=106, NEQ=107, NEQ_SYM=108, 
		GT=109, GTE=110, LT=111, LTE=112, LEFT_PAREN=113, RIGHT_PAREN=114, LEFT_BRACE=115, 
		RIGHT_BRACE=116, COMMA=117, DOUBLE_QUOTA=118, SINGLE_QUOTA=119, BACK_QUOTA=120, 
		UL_=121, QUESTION=122;
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", 
		"'<<'", "'>>'", "'^'", "'%'", "'+'", "'-'", "'*'", "'/'", "'.'", "'<=>'", 
		"'=='", "'='", "'!='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'('", "')'", 
		"'{'", "'}'", "','", "'\"'", "'''", "'`'", "'_'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "STRING", "NUMBER", "EXP", "HEX_DIGIT", "BIT_NUM", "WS", "SELECT", 
		"ALL", "ANY", "DISTINCT", "FROM", "PARTITION", "WHERE", "GROUP", "BY", 
		"ASC", "DESC", "WITH", "RECURSIVE", "ROLLUP", "HAVING", "WINDOW", "AS", 
		"ORDER", "LIMIT", "OFFSET", "INTO", "SET", "FOR", "UPDATE", "SHARE", "OF", 
		"NOWAIT", "LOCKED", "LOCK", "IN", "MODE", "INNER", "CROSS", "JOIN", "ON", 
		"LEFT", "RIGHT", "OUTER", "NATURAL", "USING", "USE", "INDEX", "KEY", "IGNORE", 
		"FORCE", "UNION", "DEFAULT", "DELETE", "QUICK", "INSERT", "VALUES", "VALUE", 
		"DUPLICATE", "EXISTS", "IS", "AND", "OR", "XOR", "NOT", "BETWEEN", "NULL", 
		"TRUE", "FALSE", "UNKNOWN", "SOUNDS", "LIKE", "DIV", "MOD", "BINARY", 
		"ROW", "ESCAPE", "REGEXP", "DATE", "TIME", "TIMESTAMP", "CASE", "WHEN", 
		"THEN", "IF", "ELSE", "END", "ID", "AND_SYM", "OR_SYM", "NOT_SYM", "UNARY_BIT_COMPLEMENT", 
		"BIT_INCLUSIVE_OR", "BIT_AND", "SIGNED_LEFT_SHIFT", "SIGNED_RIGHT_SHIFT", 
		"BIT_EXCLUSIVE_OR", "MOD_SYM", "PLUS", "MINUS", "ASTERISK", "SLASH", "DOT", 
		"SAFE_EQ", "EQ", "EQ_OR_ASSIGN", "NEQ", "NEQ_SYM", "GT", "GTE", "LT", 
		"LTE", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACE", "RIGHT_BRACE", "COMMA", 
		"DOUBLE_QUOTA", "SINGLE_QUOTA", "BACK_QUOTA", "UL_", "QUESTION"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3|\24\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\2\3\2\3\3\3\3\3\3\2\2"+
		"\4\2\4\2\2\2\22\2\6\3\2\2\2\4\21\3\2\2\2\6\7\7s\2\2\7\f\5\4\3\2\b\t\7"+
		"w\2\2\t\13\5\4\3\2\n\b\3\2\2\2\13\16\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r"+
		"\17\3\2\2\2\16\f\3\2\2\2\17\20\7t\2\2\20\3\3\2\2\2\21\22\3\2\2\2\22\5"+
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