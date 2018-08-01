// Generated from DMLBase.g4 by ANTLR 4.7.1
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
public class DMLBaseParser extends Parser {
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
		RULE_execute = 0, RULE_insert = 1, RULE_select = 2, RULE_withClause = 3, 
		RULE_cteClause = 4, RULE_cteName = 5, RULE_unionSelect = 6, RULE_selectExpression = 7, 
		RULE_selectClause = 8, RULE_selectSpec = 9, RULE_fromClause = 10, RULE_tableReferences = 11, 
		RULE_whereClause = 12, RULE_groupByClause = 13, RULE_havingClause = 14, 
		RULE_orderByClause = 15, RULE_groupByItem = 16, RULE_limitClause = 17, 
		RULE_rangeClause = 18, RULE_subquery = 19, RULE_selectExprs = 20, RULE_selectExpr = 21, 
		RULE_bitExpr = 22, RULE_alias = 23, RULE_delete = 24, RULE_deleteClause = 25, 
		RULE_partitionClause = 26, RULE_update = 27, RULE_updateClause = 28, RULE_updateSpec = 29, 
		RULE_setClause = 30, RULE_assignmentList = 31, RULE_assignment = 32, RULE_value = 33, 
		RULE_schemaName = 34, RULE_tableName = 35, RULE_columnName = 36, RULE_expr = 37, 
		RULE_itemList = 38, RULE_item = 39;
	public static final String[] ruleNames = {
		"execute", "insert", "select", "withClause", "cteClause", "cteName", "unionSelect", 
		"selectExpression", "selectClause", "selectSpec", "fromClause", "tableReferences", 
		"whereClause", "groupByClause", "havingClause", "orderByClause", "groupByItem", 
		"limitClause", "rangeClause", "subquery", "selectExprs", "selectExpr", 
		"bitExpr", "alias", "delete", "deleteClause", "partitionClause", "update", 
		"updateClause", "updateSpec", "setClause", "assignmentList", "assignment", 
		"value", "schemaName", "tableName", "columnName", "expr", "itemList", 
		"item"
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
	public String getGrammarFileName() { return "DMLBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DMLBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExecuteContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public ExecuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_execute);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				select();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				insert();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				update();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				delete();
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

	public static class InsertContext extends ParserRuleContext {
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_insert);
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

	public static class SelectContext extends ParserRuleContext {
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				withClause();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				unionSelect();
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

	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(DMLBaseParser.WITH, 0); }
		public List<CteClauseContext> cteClause() {
			return getRuleContexts(CteClauseContext.class);
		}
		public CteClauseContext cteClause(int i) {
			return getRuleContext(CteClauseContext.class,i);
		}
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public TerminalNode RECURSIVE() { return getToken(DMLBaseParser.RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DMLBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DMLBaseParser.COMMA, i);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_withClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(WITH);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(93);
				match(RECURSIVE);
				}
			}

			setState(96);
			cteClause();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(97);
				match(COMMA);
				setState(98);
				cteClause();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			unionSelect();
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

	public static class CteClauseContext extends ParserRuleContext {
		public CteNameContext cteName() {
			return getRuleContext(CteNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(DMLBaseParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ItemListContext itemList() {
			return getRuleContext(ItemListContext.class,0);
		}
		public CteClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitCteClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteClauseContext cteClause() throws RecognitionException {
		CteClauseContext _localctx = new CteClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cteClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			cteName();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(107);
				itemList();
				}
			}

			setState(110);
			match(AS);
			setState(111);
			subquery();
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

	public static class CteNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DMLBaseParser.ID, 0); }
		public CteNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitCteName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteNameContext cteName() throws RecognitionException {
		CteNameContext _localctx = new CteNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cteName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ID);
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

	public static class UnionSelectContext extends ParserRuleContext {
		public List<SelectExpressionContext> selectExpression() {
			return getRuleContexts(SelectExpressionContext.class);
		}
		public SelectExpressionContext selectExpression(int i) {
			return getRuleContext(SelectExpressionContext.class,i);
		}
		public List<TerminalNode> UNION() { return getTokens(DMLBaseParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(DMLBaseParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(DMLBaseParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(DMLBaseParser.ALL, i);
		}
		public UnionSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionSelect; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitUnionSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionSelectContext unionSelect() throws RecognitionException {
		UnionSelectContext _localctx = new UnionSelectContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unionSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			selectExpression();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(116);
				match(UNION);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(117);
					match(ALL);
					}
				}

				setState(120);
				selectExpression();
				}
				}
				setState(125);
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

	public static class SelectExpressionContext extends ParserRuleContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public SelectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitSelectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExpressionContext selectExpression() throws RecognitionException {
		SelectExpressionContext _localctx = new SelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_selectExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			selectClause();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(127);
				fromClause();
				}
			}

			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(130);
				whereClause();
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(133);
				groupByClause();
				}
			}

			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(136);
				orderByClause();
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(139);
				limitClause();
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

	public static class SelectClauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(DMLBaseParser.SELECT, 0); }
		public SelectSpecContext selectSpec() {
			return getRuleContext(SelectSpecContext.class,0);
		}
		public SelectExprsContext selectExprs() {
			return getRuleContext(SelectExprsContext.class,0);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(SELECT);
			setState(143);
			selectSpec();
			setState(144);
			selectExprs();
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

	public static class SelectSpecContext extends ParserRuleContext {
		public SelectSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitSelectSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectSpecContext selectSpec() throws RecognitionException {
		SelectSpecContext _localctx = new SelectSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectSpec);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(DMLBaseParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(FROM);
			setState(149);
			tableReferences();
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

	public static class TableReferencesContext extends ParserRuleContext {
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitTableReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tableReferences);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(DMLBaseParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(WHERE);
			setState(154);
			expr();
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

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(DMLBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(DMLBaseParser.BY, 0); }
		public List<GroupByItemContext> groupByItem() {
			return getRuleContexts(GroupByItemContext.class);
		}
		public GroupByItemContext groupByItem(int i) {
			return getRuleContext(GroupByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DMLBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DMLBaseParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(DMLBaseParser.WITH, 0); }
		public TerminalNode ROLLUP() { return getToken(DMLBaseParser.ROLLUP, 0); }
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(GROUP);
			setState(157);
			match(BY);
			setState(158);
			groupByItem();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(159);
				match(COMMA);
				setState(160);
				groupByItem();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(166);
				match(WITH);
				setState(167);
				match(ROLLUP);
				}
			}

			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(170);
				havingClause();
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(DMLBaseParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(HAVING);
			setState(174);
			expr();
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

	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(DMLBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(DMLBaseParser.BY, 0); }
		public List<GroupByItemContext> groupByItem() {
			return getRuleContexts(GroupByItemContext.class);
		}
		public GroupByItemContext groupByItem(int i) {
			return getRuleContext(GroupByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DMLBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DMLBaseParser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ORDER);
			setState(177);
			match(BY);
			setState(178);
			groupByItem();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(179);
				match(COMMA);
				setState(180);
				groupByItem();
				}
				}
				setState(185);
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

	public static class GroupByItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(DMLBaseParser.NUMBER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(DMLBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(DMLBaseParser.DESC, 0); }
		public GroupByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitGroupByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByItemContext groupByItem() throws RecognitionException {
		GroupByItemContext _localctx = new GroupByItemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_groupByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(186);
				columnName();
				}
				break;
			case NUMBER:
				{
				setState(187);
				match(NUMBER);
				}
				break;
			case EOF:
			case ASC:
			case DESC:
			case WITH:
			case HAVING:
			case ORDER:
			case LIMIT:
			case UNION:
			case RIGHT_PAREN:
			case COMMA:
				{
				setState(188);
				expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(191);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(DMLBaseParser.LIMIT, 0); }
		public RangeClauseContext rangeClause() {
			return getRuleContext(RangeClauseContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(LIMIT);
			setState(195);
			rangeClause();
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

	public static class RangeClauseContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(DMLBaseParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DMLBaseParser.NUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DMLBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DMLBaseParser.COMMA, i);
		}
		public TerminalNode OFFSET() { return getToken(DMLBaseParser.OFFSET, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rangeClause);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(NUMBER);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(198);
					match(COMMA);
					setState(199);
					match(NUMBER);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(NUMBER);
				setState(206);
				match(OFFSET);
				setState(207);
				match(NUMBER);
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

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DMLBaseParser.LEFT_PAREN, 0); }
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DMLBaseParser.RIGHT_PAREN, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LEFT_PAREN);
			setState(211);
			unionSelect();
			setState(212);
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

	public static class SelectExprsContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(DMLBaseParser.ASTERISK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DMLBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DMLBaseParser.COMMA, i);
		}
		public List<SelectExprContext> selectExpr() {
			return getRuleContexts(SelectExprContext.class);
		}
		public SelectExprContext selectExpr(int i) {
			return getRuleContext(SelectExprContext.class,i);
		}
		public SelectExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExprs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitSelectExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExprsContext selectExprs() throws RecognitionException {
		SelectExprsContext _localctx = new SelectExprsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_selectExprs);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISK:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(214);
				match(ASTERISK);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(215);
					match(COMMA);
					setState(216);
					selectExpr();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case EOF:
			case FROM:
			case WHERE:
			case GROUP:
			case AS:
			case ORDER:
			case LIMIT:
			case UNION:
			case ID:
			case RIGHT_PAREN:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				selectExpr();
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(223);
					match(COMMA);
					setState(224);
					match(ASTERISK);
					}
					break;
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(227);
					match(COMMA);
					setState(228);
					selectExpr();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class SelectExprContext extends ParserRuleContext {
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public TerminalNode AS() { return getToken(DMLBaseParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SelectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitSelectExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_selectExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			bitExpr();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(237);
				match(AS);
				}
			}

			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(240);
				alias();
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

	public static class BitExprContext extends ParserRuleContext {
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitBitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		BitExprContext _localctx = new BitExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bitExpr);
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DMLBaseParser.ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ID);
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

	public static class DeleteContext extends ParserRuleContext {
		public DeleteClauseContext deleteClause() {
			return getRuleContext(DeleteClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			deleteClause();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(248);
				whereClause();
				}
			}

			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(251);
				orderByClause();
				}
			}

			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(254);
				limitClause();
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

	public static class DeleteClauseContext extends ParserRuleContext {
		public DeleteClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitDeleteClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteClauseContext deleteClause() throws RecognitionException {
		DeleteClauseContext _localctx = new DeleteClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_deleteClause);
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

	public static class PartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(DMLBaseParser.PARTITION, 0); }
		public ItemListContext itemList() {
			return getRuleContext(ItemListContext.class,0);
		}
		public PartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitPartitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionClauseContext partitionClause() throws RecognitionException {
		PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_partitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(PARTITION);
			setState(260);
			itemList();
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

	public static class UpdateContext extends ParserRuleContext {
		public UpdateClauseContext updateClause() {
			return getRuleContext(UpdateClauseContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			updateClause();
			setState(263);
			setClause();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(264);
				whereClause();
				}
			}

			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(267);
				orderByClause();
				}
			}

			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(270);
				limitClause();
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

	public static class UpdateClauseContext extends ParserRuleContext {
		public UpdateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitUpdateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateClauseContext updateClause() throws RecognitionException {
		UpdateClauseContext _localctx = new UpdateClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_updateClause);
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

	public static class UpdateSpecContext extends ParserRuleContext {
		public UpdateSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitUpdateSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateSpecContext updateSpec() throws RecognitionException {
		UpdateSpecContext _localctx = new UpdateSpecContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_updateSpec);
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

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(DMLBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(SET);
			setState(278);
			assignmentList();
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

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DMLBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DMLBaseParser.COMMA, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			assignment();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(281);
				match(COMMA);
				setState(282);
				assignment();
				}
				}
				setState(287);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public TerminalNode EQ_OR_ASSIGN() { return getToken(DMLBaseParser.EQ_OR_ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			columnName();
			setState(289);
			match(EQ_OR_ASSIGN);
			setState(290);
			value();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(DMLBaseParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_value);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(DEFAULT);
				}
				break;
			case EOF:
			case WHERE:
			case ORDER:
			case LIMIT:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				expr();
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

	public static class SchemaNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DMLBaseParser.ID, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ID);
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

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DMLBaseParser.ID, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(ID);
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

	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DMLBaseParser.ID, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(ID);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expr);
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

	public static class ItemListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(DMLBaseParser.LEFT_PAREN, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(DMLBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DMLBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DMLBaseParser.COMMA, i);
		}
		public ItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemListContext itemList() throws RecognitionException {
		ItemListContext _localctx = new ItemListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_itemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(LEFT_PAREN);
			setState(305);
			item();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(306);
				match(COMMA);
				setState(307);
				item();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
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
			if ( visitor instanceof DMLBaseVisitor ) return ((DMLBaseVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_item);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3|\u0140\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\5\2W\n\2\3\3\3\3\3\4\3\4\5\4]\n\4\3\5\3\5\5\5a\n\5\3\5\3\5\3\5\7\5"+
		"f\n\5\f\5\16\5i\13\5\3\5\3\5\3\6\3\6\5\6o\n\6\3\6\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\5\by\n\b\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\t\3\t\5\t\u0083\n\t"+
		"\3\t\5\t\u0086\n\t\3\t\5\t\u0089\n\t\3\t\5\t\u008c\n\t\3\t\5\t\u008f\n"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\7\17\u00a4\n\17\f\17\16\17\u00a7\13\17\3\17\3\17\5"+
		"\17\u00ab\n\17\3\17\5\17\u00ae\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u00b8\n\21\f\21\16\21\u00bb\13\21\3\22\3\22\3\22\5\22\u00c0"+
		"\n\22\3\22\5\22\u00c3\n\22\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00cb\n"+
		"\24\f\24\16\24\u00ce\13\24\3\24\3\24\3\24\5\24\u00d3\n\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\7\26\u00dc\n\26\f\26\16\26\u00df\13\26\3\26\3"+
		"\26\3\26\5\26\u00e4\n\26\3\26\3\26\7\26\u00e8\n\26\f\26\16\26\u00eb\13"+
		"\26\5\26\u00ed\n\26\3\27\3\27\5\27\u00f1\n\27\3\27\5\27\u00f4\n\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\5\32\u00fc\n\32\3\32\5\32\u00ff\n\32\3\32\5"+
		"\32\u0102\n\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u010c\n\35"+
		"\3\35\5\35\u010f\n\35\3\35\5\35\u0112\n\35\3\36\3\36\3\37\3\37\3 \3 \3"+
		" \3!\3!\3!\7!\u011e\n!\f!\16!\u0121\13!\3\"\3\"\3\"\3\"\3#\3#\5#\u0129"+
		"\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\7(\u0137\n(\f(\16(\u013a\13"+
		"(\3(\3(\3)\3)\3)\2\2*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNP\2\3\3\2\22\23\2\u013d\2V\3\2\2\2\4X\3\2\2\2"+
		"\6\\\3\2\2\2\b^\3\2\2\2\nl\3\2\2\2\fs\3\2\2\2\16u\3\2\2\2\20\u0080\3\2"+
		"\2\2\22\u0090\3\2\2\2\24\u0094\3\2\2\2\26\u0096\3\2\2\2\30\u0099\3\2\2"+
		"\2\32\u009b\3\2\2\2\34\u009e\3\2\2\2\36\u00af\3\2\2\2 \u00b2\3\2\2\2\""+
		"\u00bf\3\2\2\2$\u00c4\3\2\2\2&\u00d2\3\2\2\2(\u00d4\3\2\2\2*\u00ec\3\2"+
		"\2\2,\u00ee\3\2\2\2.\u00f5\3\2\2\2\60\u00f7\3\2\2\2\62\u00f9\3\2\2\2\64"+
		"\u0103\3\2\2\2\66\u0105\3\2\2\28\u0108\3\2\2\2:\u0113\3\2\2\2<\u0115\3"+
		"\2\2\2>\u0117\3\2\2\2@\u011a\3\2\2\2B\u0122\3\2\2\2D\u0128\3\2\2\2F\u012a"+
		"\3\2\2\2H\u012c\3\2\2\2J\u012e\3\2\2\2L\u0130\3\2\2\2N\u0132\3\2\2\2P"+
		"\u013d\3\2\2\2RW\5\6\4\2SW\5\4\3\2TW\58\35\2UW\5\62\32\2VR\3\2\2\2VS\3"+
		"\2\2\2VT\3\2\2\2VU\3\2\2\2W\3\3\2\2\2XY\3\2\2\2Y\5\3\2\2\2Z]\5\b\5\2["+
		"]\5\16\b\2\\Z\3\2\2\2\\[\3\2\2\2]\7\3\2\2\2^`\7\24\2\2_a\7\25\2\2`_\3"+
		"\2\2\2`a\3\2\2\2ab\3\2\2\2bg\5\n\6\2cd\7w\2\2df\5\n\6\2ec\3\2\2\2fi\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\5\16\b\2k\t\3\2\2\2l"+
		"n\5\f\7\2mo\5N(\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\31\2\2qr\5(\25\2r"+
		"\13\3\2\2\2st\7Z\2\2t\r\3\2\2\2u}\5\20\t\2vx\7\66\2\2wy\7\n\2\2xw\3\2"+
		"\2\2xy\3\2\2\2yz\3\2\2\2z|\5\20\t\2{v\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}"+
		"~\3\2\2\2~\17\3\2\2\2\177}\3\2\2\2\u0080\u0082\5\22\n\2\u0081\u0083\5"+
		"\26\f\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0086\5\32\16\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3"+
		"\2\2\2\u0087\u0089\5\34\17\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\3\2\2\2\u008a\u008c\5 \21\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008e\3\2\2\2\u008d\u008f\5$\23\2\u008e\u008d\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\21\3\2\2\2\u0090\u0091\7\t\2\2\u0091\u0092\5\24\13"+
		"\2\u0092\u0093\5*\26\2\u0093\23\3\2\2\2\u0094\u0095\3\2\2\2\u0095\25\3"+
		"\2\2\2\u0096\u0097\7\r\2\2\u0097\u0098\5\30\r\2\u0098\27\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\31\3\2\2\2\u009b\u009c\7\17\2\2\u009c\u009d\5L\'"+
		"\2\u009d\33\3\2\2\2\u009e\u009f\7\20\2\2\u009f\u00a0\7\21\2\2\u00a0\u00a5"+
		"\5\"\22\2\u00a1\u00a2\7w\2\2\u00a2\u00a4\5\"\22\2\u00a3\u00a1\3\2\2\2"+
		"\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00aa"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\24\2\2\u00a9\u00ab\7\26\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00ae"+
		"\5\36\20\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\35\3\2\2\2\u00af"+
		"\u00b0\7\27\2\2\u00b0\u00b1\5L\'\2\u00b1\37\3\2\2\2\u00b2\u00b3\7\32\2"+
		"\2\u00b3\u00b4\7\21\2\2\u00b4\u00b9\5\"\22\2\u00b5\u00b6\7w\2\2\u00b6"+
		"\u00b8\5\"\22\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba!\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c0"+
		"\5J&\2\u00bd\u00c0\7\4\2\2\u00be\u00c0\5L\'\2\u00bf\u00bc\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00c3\t\2"+
		"\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3#\3\2\2\2\u00c4\u00c5"+
		"\7\33\2\2\u00c5\u00c6\5&\24\2\u00c6%\3\2\2\2\u00c7\u00cc\7\4\2\2\u00c8"+
		"\u00c9\7w\2\2\u00c9\u00cb\7\4\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d3\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d0\7\4\2\2\u00d0\u00d1\7\34\2\2\u00d1\u00d3\7"+
		"\4\2\2\u00d2\u00c7\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\'\3\2\2\2\u00d4\u00d5"+
		"\7s\2\2\u00d5\u00d6\5\16\b\2\u00d6\u00d7\7t\2\2\u00d7)\3\2\2\2\u00d8\u00dd"+
		"\7g\2\2\u00d9\u00da\7w\2\2\u00da\u00dc\5,\27\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00ed\3\2"+
		"\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\5,\27\2\u00e1\u00e2\7w\2\2\u00e2"+
		"\u00e4\7g\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e9\3\2"+
		"\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e8\5,\27\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00d8\3\2\2\2\u00ec\u00e0\3\2\2\2\u00ed"+
		"+\3\2\2\2\u00ee\u00f0\5.\30\2\u00ef\u00f1\7\31\2\2\u00f0\u00ef\3\2\2\2"+
		"\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4\5\60\31\2\u00f3\u00f2"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4-\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"/\3\2\2\2\u00f7\u00f8\7Z\2\2\u00f8\61\3\2\2\2\u00f9\u00fb\5\64\33\2\u00fa"+
		"\u00fc\5\32\16\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3"+
		"\2\2\2\u00fd\u00ff\5 \21\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0101\3\2\2\2\u0100\u0102\5$\23\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\63\3\2\2\2\u0103\u0104\3\2\2\2\u0104\65\3\2\2\2\u0105\u0106"+
		"\7\16\2\2\u0106\u0107\5N(\2\u0107\67\3\2\2\2\u0108\u0109\5:\36\2\u0109"+
		"\u010b\5> \2\u010a\u010c\5\32\16\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010e\3\2\2\2\u010d\u010f\5 \21\2\u010e\u010d\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u0112\5$\23\2\u0111\u0110\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u01129\3\2\2\2\u0113\u0114\3\2\2\2\u0114;\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116=\3\2\2\2\u0117\u0118\7\36\2\2\u0118\u0119"+
		"\5@!\2\u0119?\3\2\2\2\u011a\u011f\5B\"\2\u011b\u011c\7w\2\2\u011c\u011e"+
		"\5B\"\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120A\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\5J&\2\u0123"+
		"\u0124\7l\2\2\u0124\u0125\5D#\2\u0125C\3\2\2\2\u0126\u0129\7\67\2\2\u0127"+
		"\u0129\5L\'\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129E\3\2\2\2\u012a"+
		"\u012b\7Z\2\2\u012bG\3\2\2\2\u012c\u012d\7Z\2\2\u012dI\3\2\2\2\u012e\u012f"+
		"\7Z\2\2\u012fK\3\2\2\2\u0130\u0131\3\2\2\2\u0131M\3\2\2\2\u0132\u0133"+
		"\7s\2\2\u0133\u0138\5P)\2\u0134\u0135\7w\2\2\u0135\u0137\5P)\2\u0136\u0134"+
		"\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7t\2\2\u013cO\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013eQ\3\2\2\2%V\\`gnx}\u0082\u0085\u0088\u008b\u008e\u00a5"+
		"\u00aa\u00ad\u00b9\u00bf\u00c2\u00cc\u00d2\u00dd\u00e3\u00e9\u00ec\u00f0"+
		"\u00f3\u00fb\u00fe\u0101\u010b\u010e\u0111\u011f\u0128\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}