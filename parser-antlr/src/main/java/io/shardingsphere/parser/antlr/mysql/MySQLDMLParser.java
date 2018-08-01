// Generated from MySQLDML.g4 by ANTLR 4.7.1

	package io.shardingsphere.parser.antlr.mysql;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLDMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DISTINCTROW=2, HIGH_PRIORITY=3, STRAIGHT_JOIN=4, SQL_SMALL_RESULT=5, 
		SQL_BIG_RESULT=6, SQL_BUFFER_RESULT=7, SQL_CACHE=8, SQL_NO_CACHE=9, SQL_CALC_FOUND_ROWS=10, 
		OUTFILE=11, CHARACTER=12, DUMPFILE=13, SKIP_=14, OJ=15, LOW_PRIORITY=16, 
		DELAYED=17, COLLATE=18, STRING=19, NUMBER=20, EXP=21, HEX_DIGIT=22, BIT_NUM=23, 
		WS=24, SELECT=25, ALL=26, ANY=27, DISTINCT=28, FROM=29, PARTITION=30, 
		WHERE=31, GROUP=32, BY=33, ASC=34, DESC=35, WITH=36, RECURSIVE=37, ROLLUP=38, 
		HAVING=39, WINDOW=40, AS=41, ORDER=42, LIMIT=43, OFFSET=44, INTO=45, SET=46, 
		FOR=47, UPDATE=48, SHARE=49, OF=50, NOWAIT=51, LOCKED=52, LOCK=53, IN=54, 
		MODE=55, INNER=56, CROSS=57, JOIN=58, ON=59, LEFT=60, RIGHT=61, OUTER=62, 
		NATURAL=63, USING=64, USE=65, INDEX=66, KEY=67, IGNORE=68, FORCE=69, UNION=70, 
		DEFAULT=71, DELETE=72, QUICK=73, INSERT=74, VALUES=75, VALUE=76, DUPLICATE=77, 
		EXISTS=78, IS=79, AND=80, OR=81, XOR=82, NOT=83, BETWEEN=84, NULL=85, 
		TRUE=86, FALSE=87, UNKNOWN=88, SOUNDS=89, LIKE=90, DIV=91, MOD=92, BINARY=93, 
		ROW=94, ESCAPE=95, REGEXP=96, DATE=97, TIME=98, TIMESTAMP=99, CASE=100, 
		WHEN=101, THEN=102, IF=103, ELSE=104, END=105, ID=106, AND_SYM=107, OR_SYM=108, 
		NOT_SYM=109, UNARY_BIT_COMPLEMENT=110, BIT_INCLUSIVE_OR=111, BIT_AND=112, 
		SIGNED_LEFT_SHIFT=113, SIGNED_RIGHT_SHIFT=114, BIT_EXCLUSIVE_OR=115, MOD_SYM=116, 
		PLUS=117, MINUS=118, ASTERISK=119, SLASH=120, DOT=121, SAFE_EQ=122, EQ=123, 
		EQ_OR_ASSIGN=124, NEQ=125, NEQ_SYM=126, GT=127, GTE=128, LT=129, LTE=130, 
		LEFT_PAREN=131, RIGHT_PAREN=132, LEFT_BRACE=133, RIGHT_BRACE=134, COMMA=135, 
		DOUBLE_QUOTA=136, SINGLE_QUOTA=137, BACK_QUOTA=138, UL_=139, QUESTION=140;
	public static final int
		RULE_selectSpec = 0, RULE_expr = 1, RULE_booleanPrimary = 2, RULE_comparisonOperator = 3, 
		RULE_predicate = 4, RULE_bitExpr = 5, RULE_simpleExpr = 6, RULE_liter = 7, 
		RULE_collateClause = 8, RULE_functionCall = 9, RULE_caseExpress = 10, 
		RULE_caseComp = 11, RULE_caseWhenComp = 12, RULE_caseCond = 13, RULE_whenResult = 14, 
		RULE_elseResult = 15, RULE_caseResult = 16, RULE_selectExpr = 17, RULE_tableReferences = 18, 
		RULE_tableReference = 19, RULE_tableFactor = 20, RULE_joinTable = 21, 
		RULE_joinCondition = 22, RULE_indexHintList = 23, RULE_indexHint = 24, 
		RULE_deleteClause = 25, RULE_fromSingle = 26, RULE_fromMulti = 27, RULE_deleteSpec = 28, 
		RULE_insert = 29, RULE_insertClause = 30, RULE_insertSpec = 31, RULE_partitionClause = 32, 
		RULE_columnClause = 33, RULE_valueClause = 34, RULE_setClause = 35, RULE_onDuplicateClause = 36, 
		RULE_itemListWithEmpty = 37, RULE_assignmentList = 38, RULE_assignment = 39, 
		RULE_value = 40, RULE_valueList = 41, RULE_updateClause = 42, RULE_updateSpec = 43, 
		RULE_item = 44, RULE_execute = 45, RULE_select = 46, RULE_withClause = 47, 
		RULE_cteClause = 48, RULE_cteName = 49, RULE_unionSelect = 50, RULE_selectExpression = 51, 
		RULE_selectClause = 52, RULE_fromClause = 53, RULE_whereClause = 54, RULE_groupByClause = 55, 
		RULE_havingClause = 56, RULE_orderByClause = 57, RULE_groupByItem = 58, 
		RULE_limitClause = 59, RULE_rangeClause = 60, RULE_subquery = 61, RULE_selectExprs = 62, 
		RULE_alias = 63, RULE_delete = 64, RULE_update = 65, RULE_schemaName = 66, 
		RULE_tableName = 67, RULE_columnName = 68, RULE_itemList = 69;
	public static final String[] ruleNames = {
		"selectSpec", "expr", "booleanPrimary", "comparisonOperator", "predicate", 
		"bitExpr", "simpleExpr", "liter", "collateClause", "functionCall", "caseExpress", 
		"caseComp", "caseWhenComp", "caseCond", "whenResult", "elseResult", "caseResult", 
		"selectExpr", "tableReferences", "tableReference", "tableFactor", "joinTable", 
		"joinCondition", "indexHintList", "indexHint", "deleteClause", "fromSingle", 
		"fromMulti", "deleteSpec", "insert", "insertClause", "insertSpec", "partitionClause", 
		"columnClause", "valueClause", "setClause", "onDuplicateClause", "itemListWithEmpty", 
		"assignmentList", "assignment", "value", "valueList", "updateClause", 
		"updateSpec", "item", "execute", "select", "withClause", "cteClause", 
		"cteName", "unionSelect", "selectExpression", "selectClause", "fromClause", 
		"whereClause", "groupByClause", "havingClause", "orderByClause", "groupByItem", 
		"limitClause", "rangeClause", "subquery", "selectExprs", "alias", "delete", 
		"update", "schemaName", "tableName", "columnName", "itemList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.*'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'&&'", 
		"'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", "'+'", 
		"'-'", "'*'", "'/'", "'.'", "'<=>'", "'=='", "'='", "'!='", "'<>'", "'>'", 
		"'>='", "'<'", "'<='", "'('", "')'", "'{'", "'}'", "','", "'\"'", "'''", 
		"'`'", "'_'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "DISTINCTROW", "HIGH_PRIORITY", "STRAIGHT_JOIN", "SQL_SMALL_RESULT", 
		"SQL_BIG_RESULT", "SQL_BUFFER_RESULT", "SQL_CACHE", "SQL_NO_CACHE", "SQL_CALC_FOUND_ROWS", 
		"OUTFILE", "CHARACTER", "DUMPFILE", "SKIP_", "OJ", "LOW_PRIORITY", "DELAYED", 
		"COLLATE", "STRING", "NUMBER", "EXP", "HEX_DIGIT", "BIT_NUM", "WS", "SELECT", 
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
	public String getGrammarFileName() { return "MySQLDML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySQLDMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SelectSpecContext extends ParserRuleContext {
		public TerminalNode HIGH_PRIORITY() { return getToken(MySQLDMLParser.HIGH_PRIORITY, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLDMLParser.STRAIGHT_JOIN, 0); }
		public TerminalNode SQL_SMALL_RESULT() { return getToken(MySQLDMLParser.SQL_SMALL_RESULT, 0); }
		public TerminalNode SQL_BIG_RESULT() { return getToken(MySQLDMLParser.SQL_BIG_RESULT, 0); }
		public TerminalNode SQL_BUFFER_RESULT() { return getToken(MySQLDMLParser.SQL_BUFFER_RESULT, 0); }
		public TerminalNode SQL_CALC_FOUND_ROWS() { return getToken(MySQLDMLParser.SQL_CALC_FOUND_ROWS, 0); }
		public TerminalNode ALL() { return getToken(MySQLDMLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(MySQLDMLParser.DISTINCT, 0); }
		public TerminalNode DISTINCTROW() { return getToken(MySQLDMLParser.DISTINCTROW, 0); }
		public TerminalNode SQL_CACHE() { return getToken(MySQLDMLParser.SQL_CACHE, 0); }
		public TerminalNode SQL_NO_CACHE() { return getToken(MySQLDMLParser.SQL_NO_CACHE, 0); }
		public SelectSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitSelectSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectSpecContext selectSpec() throws RecognitionException {
		SelectSpecContext _localctx = new SelectSpecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_selectSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(140);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DISTINCTROW) | (1L << ALL) | (1L << DISTINCT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(143);
				match(HIGH_PRIORITY);
				}
				break;
			}
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(146);
				match(STRAIGHT_JOIN);
				}
				break;
			}
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(149);
				match(SQL_SMALL_RESULT);
				}
				break;
			}
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(152);
				match(SQL_BIG_RESULT);
				}
				break;
			}
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(155);
				match(SQL_BUFFER_RESULT);
				}
				break;
			}
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(158);
				_la = _input.LA(1);
				if ( !(_la==SQL_CACHE || _la==SQL_NO_CACHE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(161);
				match(SQL_CALC_FOUND_ROWS);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(MySQLDMLParser.LEFT_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MySQLDMLParser.RIGHT_PAREN, 0); }
		public TerminalNode NOT() { return getToken(MySQLDMLParser.NOT, 0); }
		public TerminalNode NOT_SYM() { return getToken(MySQLDMLParser.NOT_SYM, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode OR() { return getToken(MySQLDMLParser.OR, 0); }
		public TerminalNode OR_SYM() { return getToken(MySQLDMLParser.OR_SYM, 0); }
		public TerminalNode XOR() { return getToken(MySQLDMLParser.XOR, 0); }
		public TerminalNode AND() { return getToken(MySQLDMLParser.AND, 0); }
		public TerminalNode AND_SYM() { return getToken(MySQLDMLParser.AND_SYM, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(165);
				match(LEFT_PAREN);
				setState(166);
				expr(0);
				setState(167);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				setState(169);
				match(NOT);
				setState(170);
				expr(3);
				}
				break;
			case 3:
				{
				setState(171);
				match(NOT_SYM);
				setState(172);
				expr(2);
				}
				break;
			case 4:
				{
				setState(173);
				booleanPrimary(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(177);
						match(OR);
						setState(178);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(180);
						match(OR_SYM);
						setState(181);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(183);
						match(XOR);
						setState(184);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(186);
						match(AND);
						setState(187);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(189);
						match(AND_SYM);
						setState(190);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BooleanPrimaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(MySQLDMLParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(MySQLDMLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLDMLParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(MySQLDMLParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(MySQLDMLParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(MySQLDMLParser.NOT, 0); }
		public TerminalNode SAFE_EQ() { return getToken(MySQLDMLParser.SAFE_EQ, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(MySQLDMLParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(MySQLDMLParser.ANY, 0); }
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitBooleanPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanPrimaryContext booleanPrimary() throws RecognitionException {
		return booleanPrimary(0);
	}

	private BooleanPrimaryContext booleanPrimary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanPrimaryContext _localctx = new BooleanPrimaryContext(_ctx, _parentState);
		BooleanPrimaryContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(197);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(199);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(200);
						match(IS);
						setState(202);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(201);
							match(NOT);
							}
						}

						setState(204);
						_la = _input.LA(1);
						if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (NULL - 85)) | (1L << (TRUE - 85)) | (1L << (FALSE - 85)) | (1L << (UNKNOWN - 85)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(205);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(206);
						match(SAFE_EQ);
						setState(207);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(208);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(209);
						comparisonOperator();
						setState(210);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(212);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(213);
						comparisonOperator();
						setState(214);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(215);
						subquery();
						}
						break;
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_OR_ASSIGN() { return getToken(MySQLDMLParser.EQ_OR_ASSIGN, 0); }
		public TerminalNode GTE() { return getToken(MySQLDMLParser.GTE, 0); }
		public TerminalNode GT() { return getToken(MySQLDMLParser.GT, 0); }
		public TerminalNode LTE() { return getToken(MySQLDMLParser.LTE, 0); }
		public TerminalNode LT() { return getToken(MySQLDMLParser.LT, 0); }
		public TerminalNode NEQ_SYM() { return getToken(MySQLDMLParser.NEQ_SYM, 0); }
		public TerminalNode NEQ() { return getToken(MySQLDMLParser.NEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !(((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (EQ_OR_ASSIGN - 124)) | (1L << (NEQ - 124)) | (1L << (NEQ_SYM - 124)) | (1L << (GT - 124)) | (1L << (GTE - 124)) | (1L << (LT - 124)) | (1L << (LTE - 124)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PredicateContext extends ParserRuleContext {
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLDMLParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLDMLParser.NOT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MySQLDMLParser.LEFT_PAREN, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MySQLDMLParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
		}
		public TerminalNode BETWEEN() { return getToken(MySQLDMLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(MySQLDMLParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(MySQLDMLParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(MySQLDMLParser.LIKE, 0); }
		public List<TerminalNode> ESCAPE() { return getTokens(MySQLDMLParser.ESCAPE); }
		public TerminalNode ESCAPE(int i) {
			return getToken(MySQLDMLParser.ESCAPE, i);
		}
		public TerminalNode REGEXP() { return getToken(MySQLDMLParser.REGEXP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_predicate);
		int _la;
		try {
			int _alt;
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				bitExpr(0);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(225);
					match(NOT);
					}
				}

				setState(228);
				match(IN);
				setState(229);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				bitExpr(0);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(232);
					match(NOT);
					}
				}

				setState(235);
				match(IN);
				setState(236);
				match(LEFT_PAREN);
				setState(237);
				simpleExpr(0);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(238);
					match(COMMA);
					setState(239);
					simpleExpr(0);
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				bitExpr(0);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(248);
					match(NOT);
					}
				}

				setState(251);
				match(BETWEEN);
				setState(252);
				simpleExpr(0);
				setState(253);
				match(AND);
				setState(254);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				bitExpr(0);
				setState(257);
				match(SOUNDS);
				setState(258);
				match(LIKE);
				setState(259);
				simpleExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				bitExpr(0);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(262);
					match(NOT);
					}
				}

				setState(265);
				match(LIKE);
				setState(266);
				simpleExpr(0);
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(267);
						match(ESCAPE);
						setState(268);
						simpleExpr(0);
						}
						} 
					}
					setState(273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				bitExpr(0);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(275);
					match(NOT);
					}
				}

				setState(278);
				match(REGEXP);
				setState(279);
				simpleExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(281);
				bitExpr(0);
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

	public static class BitExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode BIT_INCLUSIVE_OR() { return getToken(MySQLDMLParser.BIT_INCLUSIVE_OR, 0); }
		public TerminalNode BIT_AND() { return getToken(MySQLDMLParser.BIT_AND, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT() { return getToken(MySQLDMLParser.SIGNED_LEFT_SHIFT, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT() { return getToken(MySQLDMLParser.SIGNED_RIGHT_SHIFT, 0); }
		public TerminalNode PLUS() { return getToken(MySQLDMLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MySQLDMLParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(MySQLDMLParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(MySQLDMLParser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(MySQLDMLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MySQLDMLParser.MOD, 0); }
		public TerminalNode MOD_SYM() { return getToken(MySQLDMLParser.MOD_SYM, 0); }
		public TerminalNode BIT_EXCLUSIVE_OR() { return getToken(MySQLDMLParser.BIT_EXCLUSIVE_OR, 0); }
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitBitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(285);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(287);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(288);
						match(BIT_INCLUSIVE_OR);
						setState(289);
						bitExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(290);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(291);
						match(BIT_AND);
						setState(292);
						bitExpr(13);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(293);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(294);
						match(SIGNED_LEFT_SHIFT);
						setState(295);
						bitExpr(12);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(296);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(297);
						match(SIGNED_RIGHT_SHIFT);
						setState(298);
						bitExpr(11);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(299);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(300);
						match(PLUS);
						setState(301);
						bitExpr(10);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(302);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(303);
						match(MINUS);
						setState(304);
						bitExpr(9);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(305);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(306);
						match(ASTERISK);
						setState(307);
						bitExpr(8);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(308);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(309);
						match(SLASH);
						setState(310);
						bitExpr(7);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(311);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(312);
						match(DIV);
						setState(313);
						bitExpr(6);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(314);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(315);
						match(MOD);
						setState(316);
						bitExpr(5);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(317);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(318);
						match(MOD_SYM);
						setState(319);
						bitExpr(4);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(320);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(321);
						match(BIT_EXCLUSIVE_OR);
						setState(322);
						bitExpr(3);
						}
						break;
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LiterContext liter() {
			return getRuleContext(LiterContext.class,0);
		}
		public TerminalNode ID() { return getToken(MySQLDMLParser.ID, 0); }
		public TerminalNode PLUS() { return getToken(MySQLDMLParser.PLUS, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(MySQLDMLParser.MINUS, 0); }
		public TerminalNode UNARY_BIT_COMPLEMENT() { return getToken(MySQLDMLParser.UNARY_BIT_COMPLEMENT, 0); }
		public TerminalNode NOT_SYM() { return getToken(MySQLDMLParser.NOT_SYM, 0); }
		public TerminalNode BINARY() { return getToken(MySQLDMLParser.BINARY, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MySQLDMLParser.LEFT_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MySQLDMLParser.RIGHT_PAREN, 0); }
		public TerminalNode ROW() { return getToken(MySQLDMLParser.ROW, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(MySQLDMLParser.EXISTS, 0); }
		public TerminalNode AND_SYM() { return getToken(MySQLDMLParser.AND_SYM, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(329);
				functionCall();
				}
				break;
			case 3:
				{
				setState(330);
				liter();
				}
				break;
			case 4:
				{
				setState(331);
				match(ID);
				}
				break;
			case 5:
				{
				setState(332);
				match(PLUS);
				setState(333);
				simpleExpr(9);
				}
				break;
			case 6:
				{
				setState(334);
				match(MINUS);
				setState(335);
				simpleExpr(8);
				}
				break;
			case 7:
				{
				setState(336);
				match(UNARY_BIT_COMPLEMENT);
				setState(337);
				simpleExpr(7);
				}
				break;
			case 8:
				{
				setState(338);
				match(NOT_SYM);
				setState(339);
				simpleExpr(6);
				}
				break;
			case 9:
				{
				setState(340);
				match(BINARY);
				setState(341);
				simpleExpr(5);
				}
				break;
			case 10:
				{
				setState(342);
				match(LEFT_PAREN);
				setState(343);
				expr(0);
				setState(344);
				match(RIGHT_PAREN);
				}
				break;
			case 11:
				{
				setState(346);
				match(ROW);
				setState(347);
				match(LEFT_PAREN);
				setState(348);
				simpleExpr(0);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(349);
					match(COMMA);
					setState(350);
					simpleExpr(0);
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(356);
				match(RIGHT_PAREN);
				}
				break;
			case 12:
				{
				setState(358);
				subquery();
				}
				break;
			case 13:
				{
				setState(359);
				match(EXISTS);
				setState(360);
				subquery();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(368);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(363);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(364);
						match(AND_SYM);
						setState(365);
						simpleExpr(11);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(366);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(367);
						collateClause();
						}
						break;
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiterContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(MySQLDMLParser.QUESTION, 0); }
		public TerminalNode NUMBER() { return getToken(MySQLDMLParser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(MySQLDMLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLDMLParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(MySQLDMLParser.NULL, 0); }
		public TerminalNode LEFT_BRACE() { return getToken(MySQLDMLParser.LEFT_BRACE, 0); }
		public TerminalNode ID() { return getToken(MySQLDMLParser.ID, 0); }
		public TerminalNode STRING() { return getToken(MySQLDMLParser.STRING, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(MySQLDMLParser.RIGHT_BRACE, 0); }
		public TerminalNode HEX_DIGIT() { return getToken(MySQLDMLParser.HEX_DIGIT, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public TerminalNode DATE() { return getToken(MySQLDMLParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(MySQLDMLParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(MySQLDMLParser.TIMESTAMP, 0); }
		public TerminalNode BIT_NUM() { return getToken(MySQLDMLParser.BIT_NUM, 0); }
		public LiterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitLiter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiterContext liter() throws RecognitionException {
		LiterContext _localctx = new LiterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_liter);
		int _la;
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(QUESTION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(377);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(378);
				match(LEFT_BRACE);
				setState(379);
				match(ID);
				setState(380);
				match(STRING);
				setState(381);
				match(RIGHT_BRACE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(382);
				match(HEX_DIGIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(383);
					match(ID);
					}
				}

				setState(386);
				match(STRING);
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(387);
					collateClause();
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(390);
				_la = _input.LA(1);
				if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (DATE - 97)) | (1L << (TIME - 97)) | (1L << (TIMESTAMP - 97)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(391);
				match(STRING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(392);
					match(ID);
					}
				}

				setState(395);
				match(BIT_NUM);
				setState(397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(396);
					collateClause();
					}
					break;
				}
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

	public static class CollateClauseContext extends ParserRuleContext {
		public TerminalNode COLLATE() { return getToken(MySQLDMLParser.COLLATE, 0); }
		public TerminalNode ID() { return getToken(MySQLDMLParser.ID, 0); }
		public CollateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitCollateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollateClauseContext collateClause() throws RecognitionException {
		CollateClauseContext _localctx = new CollateClauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_collateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(COLLATE);
			setState(402);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLDMLParser.ID, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MySQLDMLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(MySQLDMLParser.RIGHT_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(ID);
			setState(405);
			match(LEFT_PAREN);
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(407);
				expr(0);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(408);
					match(COMMA);
					setState(409);
					expr(0);
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(417);
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

	public static class CaseExpressContext extends ParserRuleContext {
		public CaseCondContext caseCond() {
			return getRuleContext(CaseCondContext.class,0);
		}
		public CaseCompContext caseComp() {
			return getRuleContext(CaseCompContext.class,0);
		}
		public CaseExpressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpress; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitCaseExpress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressContext caseExpress() throws RecognitionException {
		CaseExpressContext _localctx = new CaseExpressContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_caseExpress);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				caseCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				caseComp();
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

	public static class CaseCompContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MySQLDMLParser.CASE, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode END() { return getToken(MySQLDMLParser.END, 0); }
		public List<CaseWhenCompContext> caseWhenComp() {
			return getRuleContexts(CaseWhenCompContext.class);
		}
		public CaseWhenCompContext caseWhenComp(int i) {
			return getRuleContext(CaseWhenCompContext.class,i);
		}
		public ElseResultContext elseResult() {
			return getRuleContext(ElseResultContext.class,0);
		}
		public CaseCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseComp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitCaseComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseCompContext caseComp() throws RecognitionException {
		CaseCompContext _localctx = new CaseCompContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_caseComp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(CASE);
			setState(424);
			simpleExpr(0);
			setState(426); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(425);
				caseWhenComp();
				}
				}
				setState(428); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(430);
				elseResult();
				}
			}

			setState(433);
			match(END);
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

	public static class CaseWhenCompContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(MySQLDMLParser.WHEN, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MySQLDMLParser.THEN, 0); }
		public CaseResultContext caseResult() {
			return getRuleContext(CaseResultContext.class,0);
		}
		public CaseWhenCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhenComp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitCaseWhenComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhenCompContext caseWhenComp() throws RecognitionException {
		CaseWhenCompContext _localctx = new CaseWhenCompContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_caseWhenComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(WHEN);
			setState(436);
			simpleExpr(0);
			setState(437);
			match(THEN);
			setState(438);
			caseResult();
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

	public static class CaseCondContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(MySQLDMLParser.CASE, 0); }
		public TerminalNode END() { return getToken(MySQLDMLParser.END, 0); }
		public List<WhenResultContext> whenResult() {
			return getRuleContexts(WhenResultContext.class);
		}
		public WhenResultContext whenResult(int i) {
			return getRuleContext(WhenResultContext.class,i);
		}
		public ElseResultContext elseResult() {
			return getRuleContext(ElseResultContext.class,0);
		}
		public CaseCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseCond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitCaseCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseCondContext caseCond() throws RecognitionException {
		CaseCondContext _localctx = new CaseCondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_caseCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(CASE);
			setState(442); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(441);
				whenResult();
				}
				}
				setState(444); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(446);
				elseResult();
				}
			}

			setState(449);
			match(END);
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

	public static class WhenResultContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(MySQLDMLParser.WHEN, 0); }
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode THEN() { return getToken(MySQLDMLParser.THEN, 0); }
		public CaseResultContext caseResult() {
			return getRuleContext(CaseResultContext.class,0);
		}
		public WhenResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenResult; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitWhenResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenResultContext whenResult() throws RecognitionException {
		WhenResultContext _localctx = new WhenResultContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whenResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(WHEN);
			setState(452);
			booleanPrimary(0);
			setState(453);
			match(THEN);
			setState(454);
			caseResult();
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

	public static class ElseResultContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MySQLDMLParser.ELSE, 0); }
		public CaseResultContext caseResult() {
			return getRuleContext(CaseResultContext.class,0);
		}
		public ElseResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseResult; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitElseResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseResultContext elseResult() throws RecognitionException {
		ElseResultContext _localctx = new ElseResultContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(ELSE);
			setState(457);
			caseResult();
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

	public static class CaseResultContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseResult; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitCaseResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseResultContext caseResult() throws RecognitionException {
		CaseResultContext _localctx = new CaseResultContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_caseResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			expr(0);
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
		public CaseExpressContext caseExpress() {
			return getRuleContext(CaseExpressContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLDMLParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public SelectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitSelectExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_selectExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(461);
				bitExpr(0);
				}
				break;
			case 2:
				{
				setState(462);
				caseExpress();
				}
				break;
			}
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(465);
				match(AS);
				}
			}

			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(468);
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

	public static class TableReferencesContext extends ParserRuleContext {
		public List<TableReferenceContext> tableReference() {
			return getRuleContexts(TableReferenceContext.class);
		}
		public TableReferenceContext tableReference(int i) {
			return getRuleContext(TableReferenceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
		}
		public TableReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferences; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitTableReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferencesContext tableReferences() throws RecognitionException {
		TableReferencesContext _localctx = new TableReferencesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			tableReference();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(472);
				match(COMMA);
				setState(473);
				tableReference();
				}
				}
				setState(478);
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

	public static class TableReferenceContext extends ParserRuleContext {
		public List<TableFactorContext> tableFactor() {
			return getRuleContexts(TableFactorContext.class);
		}
		public TableFactorContext tableFactor(int i) {
			return getRuleContext(TableFactorContext.class,i);
		}
		public List<JoinTableContext> joinTable() {
			return getRuleContexts(JoinTableContext.class);
		}
		public JoinTableContext joinTable(int i) {
			return getRuleContext(JoinTableContext.class,i);
		}
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitTableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableReference);
		int _la;
		try {
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(479);
					tableFactor();
					setState(480);
					joinTable();
					}
					}
					setState(484); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==LEFT_PAREN );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				tableFactor();
				setState(488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(487);
					joinTable();
					}
					}
					setState(490); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRAIGHT_JOIN) | (1L << INNER) | (1L << CROSS) | (1L << JOIN) | (1L << LEFT) | (1L << RIGHT) | (1L << NATURAL))) != 0) );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				tableFactor();
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

	public static class TableFactorContext extends ParserRuleContext {
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(MySQLDMLParser.PARTITION, 0); }
		public ItemListContext itemList() {
			return getRuleContext(ItemListContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public IndexHintListContext indexHintList() {
			return getRuleContext(IndexHintListContext.class,0);
		}
		public TerminalNode AS() { return getToken(MySQLDMLParser.AS, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(MySQLDMLParser.LEFT_PAREN, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MySQLDMLParser.RIGHT_PAREN, 0); }
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitTableFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableFactor);
		int _la;
		try {
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				tableName();
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(496);
					match(PARTITION);
					setState(497);
					itemList();
					}
				}

				setState(504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(500);
						match(AS);
						}
					}

					setState(503);
					alias();
					}
					break;
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USE || _la==IGNORE) {
					{
					setState(506);
					indexHintList();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				subquery();
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(510);
					match(AS);
					}
				}

				setState(513);
				alias();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(515);
				match(LEFT_PAREN);
				setState(516);
				tableReferences();
				setState(517);
				match(RIGHT_PAREN);
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

	public static class JoinTableContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(MySQLDMLParser.JOIN, 0); }
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public JoinConditionContext joinCondition() {
			return getRuleContext(JoinConditionContext.class,0);
		}
		public TerminalNode INNER() { return getToken(MySQLDMLParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(MySQLDMLParser.CROSS, 0); }
		public TerminalNode STRAIGHT_JOIN() { return getToken(MySQLDMLParser.STRAIGHT_JOIN, 0); }
		public TerminalNode LEFT() { return getToken(MySQLDMLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLDMLParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLDMLParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(MySQLDMLParser.NATURAL, 0); }
		public JoinTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinTable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitJoinTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTableContext joinTable() throws RecognitionException {
		JoinTableContext _localctx = new JoinTableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_joinTable);
		int _la;
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(521);
					_la = _input.LA(1);
					if ( !(_la==INNER || _la==CROSS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(524);
				match(JOIN);
				setState(525);
				tableFactor();
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(526);
					joinCondition();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				match(STRAIGHT_JOIN);
				setState(530);
				tableFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(531);
				match(STRAIGHT_JOIN);
				setState(532);
				tableFactor();
				setState(533);
				joinCondition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(536);
					match(OUTER);
					}
				}

				setState(539);
				match(JOIN);
				setState(540);
				tableFactor();
				setState(541);
				joinCondition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(543);
				match(NATURAL);
				setState(547);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INNER:
					{
					setState(544);
					match(INNER);
					}
					break;
				case LEFT:
				case RIGHT:
					{
					setState(545);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					{
					setState(546);
					match(OUTER);
					}
					}
					break;
				case JOIN:
					break;
				default:
					break;
				}
				setState(549);
				match(JOIN);
				setState(550);
				tableFactor();
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

	public static class JoinConditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLDMLParser.ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING() { return getToken(MySQLDMLParser.USING, 0); }
		public ItemListContext itemList() {
			return getRuleContext(ItemListContext.class,0);
		}
		public JoinConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitJoinCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConditionContext joinCondition() throws RecognitionException {
		JoinConditionContext _localctx = new JoinConditionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_joinCondition);
		try {
			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				match(ON);
				setState(554);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(USING);
				setState(556);
				itemList();
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

	public static class IndexHintListContext extends ParserRuleContext {
		public List<IndexHintContext> indexHint() {
			return getRuleContexts(IndexHintContext.class);
		}
		public IndexHintContext indexHint(int i) {
			return getRuleContext(IndexHintContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
		}
		public IndexHintListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHintList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitIndexHintList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexHintListContext indexHintList() throws RecognitionException {
		IndexHintListContext _localctx = new IndexHintListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_indexHintList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			indexHint();
			setState(564);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(560);
					match(COMMA);
					setState(561);
					indexHint();
					}
					} 
				}
				setState(566);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class IndexHintContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(MySQLDMLParser.USE, 0); }
		public ItemListContext itemList() {
			return getRuleContext(ItemListContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(MySQLDMLParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(MySQLDMLParser.KEY, 0); }
		public List<TerminalNode> FOR() { return getTokens(MySQLDMLParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(MySQLDMLParser.FOR, i);
		}
		public List<TerminalNode> JOIN() { return getTokens(MySQLDMLParser.JOIN); }
		public TerminalNode JOIN(int i) {
			return getToken(MySQLDMLParser.JOIN, i);
		}
		public List<TerminalNode> ORDER() { return getTokens(MySQLDMLParser.ORDER); }
		public TerminalNode ORDER(int i) {
			return getToken(MySQLDMLParser.ORDER, i);
		}
		public List<TerminalNode> BY() { return getTokens(MySQLDMLParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(MySQLDMLParser.BY, i);
		}
		public List<TerminalNode> GROUP() { return getTokens(MySQLDMLParser.GROUP); }
		public TerminalNode GROUP(int i) {
			return getToken(MySQLDMLParser.GROUP, i);
		}
		public TerminalNode IGNORE() { return getToken(MySQLDMLParser.IGNORE, 0); }
		public IndexHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitIndexHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexHintContext indexHint() throws RecognitionException {
		IndexHintContext _localctx = new IndexHintContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_indexHint);
		int _la;
		try {
			setState(599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(USE);
				setState(568);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FOR) {
					{
					{
					setState(569);
					match(FOR);
					setState(575);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case JOIN:
						{
						setState(570);
						match(JOIN);
						}
						break;
					case ORDER:
						{
						setState(571);
						match(ORDER);
						setState(572);
						match(BY);
						}
						break;
					case GROUP:
						{
						setState(573);
						match(GROUP);
						setState(574);
						match(BY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(581);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(582);
				itemList();
				}
				break;
			case IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(IGNORE);
				setState(584);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FOR) {
					{
					{
					setState(585);
					match(FOR);
					setState(591);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case JOIN:
						{
						setState(586);
						match(JOIN);
						}
						break;
					case ORDER:
						{
						setState(587);
						match(ORDER);
						setState(588);
						match(BY);
						}
						break;
					case GROUP:
						{
						setState(589);
						match(GROUP);
						setState(590);
						match(BY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(597);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(598);
				itemList();
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

	public static class DeleteClauseContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(MySQLDMLParser.DELETE, 0); }
		public DeleteSpecContext deleteSpec() {
			return getRuleContext(DeleteSpecContext.class,0);
		}
		public FromMultiContext fromMulti() {
			return getRuleContext(FromMultiContext.class,0);
		}
		public FromSingleContext fromSingle() {
			return getRuleContext(FromSingleContext.class,0);
		}
		public DeleteClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitDeleteClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteClauseContext deleteClause() throws RecognitionException {
		DeleteClauseContext _localctx = new DeleteClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_deleteClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(DELETE);
			setState(602);
			deleteSpec();
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(603);
				fromMulti();
				}
				break;
			case 2:
				{
				setState(604);
				fromSingle();
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

	public static class FromSingleContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MySQLDMLParser.FROM, 0); }
		public TerminalNode ID() { return getToken(MySQLDMLParser.ID, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public FromSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromSingle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitFromSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromSingleContext fromSingle() throws RecognitionException {
		FromSingleContext _localctx = new FromSingleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fromSingle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(FROM);
			setState(608);
			match(ID);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(609);
				partitionClause();
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

	public static class FromMultiContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MySQLDMLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MySQLDMLParser.ID, i);
		}
		public TerminalNode FROM() { return getToken(MySQLDMLParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
		}
		public TerminalNode USING() { return getToken(MySQLDMLParser.USING, 0); }
		public FromMultiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromMulti; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitFromMulti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromMultiContext fromMulti() throws RecognitionException {
		FromMultiContext _localctx = new FromMultiContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fromMulti);
		int _la;
		try {
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(612);
				match(ID);
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(613);
					match(T__0);
					}
				}

				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(616);
					match(COMMA);
					setState(617);
					match(ID);
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(618);
						match(T__0);
						}
					}

					}
					}
					setState(625);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(626);
				match(FROM);
				setState(627);
				tableReferences();
				}
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				match(FROM);
				{
				setState(629);
				match(ID);
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(630);
					match(T__0);
					}
				}

				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(633);
					match(COMMA);
					setState(634);
					match(ID);
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(635);
						match(T__0);
						}
					}

					}
					}
					setState(642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(643);
				match(USING);
				setState(644);
				tableReferences();
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

	public static class DeleteSpecContext extends ParserRuleContext {
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLDMLParser.LOW_PRIORITY, 0); }
		public TerminalNode QUICK() { return getToken(MySQLDMLParser.QUICK, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLDMLParser.IGNORE, 0); }
		public DeleteSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitDeleteSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteSpecContext deleteSpec() throws RecognitionException {
		DeleteSpecContext _localctx = new DeleteSpecContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_deleteSpec);
		int _la;
		try {
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOW_PRIORITY) {
					{
					setState(647);
					match(LOW_PRIORITY);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUICK) {
					{
					setState(650);
					match(QUICK);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(653);
					match(IGNORE);
					}
				}

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
		public InsertClauseContext insertClause() {
			return getRuleContext(InsertClauseContext.class,0);
		}
		public TerminalNode ID() { return getToken(MySQLDMLParser.ID, 0); }
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public ColumnClauseContext columnClause() {
			return getRuleContext(ColumnClauseContext.class,0);
		}
		public TerminalNode INTO() { return getToken(MySQLDMLParser.INTO, 0); }
		public PartitionClauseContext partitionClause() {
			return getRuleContext(PartitionClauseContext.class,0);
		}
		public OnDuplicateClauseContext onDuplicateClause() {
			return getRuleContext(OnDuplicateClauseContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			insertClause();
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(659);
				match(INTO);
				}
			}

			setState(662);
			match(ID);
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(663);
				partitionClause();
				}
			}

			setState(668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(666);
				setClause();
				}
				break;
			case SELECT:
			case WITH:
			case VALUES:
			case VALUE:
			case LEFT_PAREN:
				{
				setState(667);
				columnClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(670);
				onDuplicateClause();
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

	public static class InsertClauseContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(MySQLDMLParser.INSERT, 0); }
		public InsertSpecContext insertSpec() {
			return getRuleContext(InsertSpecContext.class,0);
		}
		public InsertClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitInsertClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertClauseContext insertClause() throws RecognitionException {
		InsertClauseContext _localctx = new InsertClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_insertClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(INSERT);
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HIGH_PRIORITY) | (1L << LOW_PRIORITY) | (1L << DELAYED))) != 0)) {
				{
				setState(674);
				insertSpec();
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

	public static class InsertSpecContext extends ParserRuleContext {
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLDMLParser.LOW_PRIORITY, 0); }
		public TerminalNode DELAYED() { return getToken(MySQLDMLParser.DELAYED, 0); }
		public TerminalNode HIGH_PRIORITY() { return getToken(MySQLDMLParser.HIGH_PRIORITY, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLDMLParser.IGNORE, 0); }
		public InsertSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitInsertSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertSpecContext insertSpec() throws RecognitionException {
		InsertSpecContext _localctx = new InsertSpecContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_insertSpec);
		try {
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOW_PRIORITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				match(LOW_PRIORITY);
				}
				break;
			case DELAYED:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				match(DELAYED);
				}
				break;
			case HIGH_PRIORITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(679);
				match(HIGH_PRIORITY);
				setState(680);
				match(IGNORE);
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

	public static class PartitionClauseContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(MySQLDMLParser.PARTITION, 0); }
		public ItemListContext itemList() {
			return getRuleContext(ItemListContext.class,0);
		}
		public PartitionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitPartitionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionClauseContext partitionClause() throws RecognitionException {
		PartitionClauseContext _localctx = new PartitionClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_partitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(PARTITION);
			setState(684);
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

	public static class ColumnClauseContext extends ParserRuleContext {
		public ValueClauseContext valueClause() {
			return getRuleContext(ValueClauseContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public ItemListWithEmptyContext itemListWithEmpty() {
			return getRuleContext(ItemListWithEmptyContext.class,0);
		}
		public ColumnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitColumnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnClauseContext columnClause() throws RecognitionException {
		ColumnClauseContext _localctx = new ColumnClauseContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_columnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(686);
				itemListWithEmpty();
				}
			}

			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
			case VALUE:
				{
				setState(689);
				valueClause();
				}
				break;
			case SELECT:
			case WITH:
				{
				setState(690);
				select();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ValueClauseContext extends ParserRuleContext {
		public List<ValueListContext> valueList() {
			return getRuleContexts(ValueListContext.class);
		}
		public ValueListContext valueList(int i) {
			return getRuleContext(ValueListContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(MySQLDMLParser.VALUES, 0); }
		public TerminalNode VALUE() { return getToken(MySQLDMLParser.VALUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
		}
		public ValueClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitValueClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueClauseContext valueClause() throws RecognitionException {
		ValueClauseContext _localctx = new ValueClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_valueClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(694);
			valueList();
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(695);
				match(COMMA);
				setState(696);
				valueList();
				}
				}
				setState(701);
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

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(MySQLDMLParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(SET);
			setState(703);
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

	public static class OnDuplicateClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLDMLParser.ON, 0); }
		public TerminalNode DUPLICATE() { return getToken(MySQLDMLParser.DUPLICATE, 0); }
		public TerminalNode KEY() { return getToken(MySQLDMLParser.KEY, 0); }
		public TerminalNode UPDATE() { return getToken(MySQLDMLParser.UPDATE, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public OnDuplicateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDuplicateClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitOnDuplicateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnDuplicateClauseContext onDuplicateClause() throws RecognitionException {
		OnDuplicateClauseContext _localctx = new OnDuplicateClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_onDuplicateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(ON);
			setState(706);
			match(DUPLICATE);
			setState(707);
			match(KEY);
			setState(708);
			match(UPDATE);
			setState(709);
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

	public static class ItemListWithEmptyContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(MySQLDMLParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(MySQLDMLParser.RIGHT_PAREN, 0); }
		public ItemListContext itemList() {
			return getRuleContext(ItemListContext.class,0);
		}
		public ItemListWithEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemListWithEmpty; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitItemListWithEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemListWithEmptyContext itemListWithEmpty() throws RecognitionException {
		ItemListWithEmptyContext _localctx = new ItemListWithEmptyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_itemListWithEmpty);
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(711);
				match(LEFT_PAREN);
				setState(712);
				match(RIGHT_PAREN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(713);
				itemList();
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

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			assignment();
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(717);
				match(COMMA);
				setState(718);
				assignment();
				}
				}
				setState(723);
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
		public TerminalNode EQ_OR_ASSIGN() { return getToken(MySQLDMLParser.EQ_OR_ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			columnName();
			setState(725);
			match(EQ_OR_ASSIGN);
			setState(726);
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
		public TerminalNode DEFAULT() { return getToken(MySQLDMLParser.DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_value);
		try {
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				match(DEFAULT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(729);
				expr(0);
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

	public static class ValueListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(MySQLDMLParser.LEFT_PAREN, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MySQLDMLParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(LEFT_PAREN);
			setState(733);
			value();
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(734);
				match(COMMA);
				setState(735);
				value();
				}
				}
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(741);
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

	public static class UpdateClauseContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(MySQLDMLParser.UPDATE, 0); }
		public UpdateSpecContext updateSpec() {
			return getRuleContext(UpdateSpecContext.class,0);
		}
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public UpdateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitUpdateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateClauseContext updateClause() throws RecognitionException {
		UpdateClauseContext _localctx = new UpdateClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_updateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(UPDATE);
			setState(744);
			updateSpec();
			setState(745);
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

	public static class UpdateSpecContext extends ParserRuleContext {
		public TerminalNode LOW_PRIORITY() { return getToken(MySQLDMLParser.LOW_PRIORITY, 0); }
		public TerminalNode IGNORE() { return getToken(MySQLDMLParser.IGNORE, 0); }
		public UpdateSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitUpdateSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateSpecContext updateSpec() throws RecognitionException {
		UpdateSpecContext _localctx = new UpdateSpecContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_updateSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY) {
				{
				setState(747);
				match(LOW_PRIORITY);
				}
			}

			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(750);
				match(IGNORE);
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

	public static class ItemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLDMLParser.ID, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
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
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteContext execute() throws RecognitionException {
		ExecuteContext _localctx = new ExecuteContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_execute);
		try {
			setState(759);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(755);
				select();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(756);
				insert();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(757);
				update();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(758);
				delete();
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
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_select);
		try {
			setState(763);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				withClause();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
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
		public TerminalNode WITH() { return getToken(MySQLDMLParser.WITH, 0); }
		public List<CteClauseContext> cteClause() {
			return getRuleContexts(CteClauseContext.class);
		}
		public CteClauseContext cteClause(int i) {
			return getRuleContext(CteClauseContext.class,i);
		}
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public TerminalNode RECURSIVE() { return getToken(MySQLDMLParser.RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_withClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(WITH);
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(766);
				match(RECURSIVE);
				}
			}

			setState(769);
			cteClause();
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(770);
				match(COMMA);
				setState(771);
				cteClause();
				}
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(777);
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
		public TerminalNode AS() { return getToken(MySQLDMLParser.AS, 0); }
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
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitCteClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteClauseContext cteClause() throws RecognitionException {
		CteClauseContext _localctx = new CteClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_cteClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			cteName();
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(780);
				itemList();
				}
			}

			setState(783);
			match(AS);
			setState(784);
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
		public TerminalNode ID() { return getToken(MySQLDMLParser.ID, 0); }
		public CteNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitCteName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteNameContext cteName() throws RecognitionException {
		CteNameContext _localctx = new CteNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_cteName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
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
		public List<TerminalNode> UNION() { return getTokens(MySQLDMLParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(MySQLDMLParser.UNION, i);
		}
		public List<TerminalNode> ALL() { return getTokens(MySQLDMLParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(MySQLDMLParser.ALL, i);
		}
		public UnionSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionSelect; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitUnionSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionSelectContext unionSelect() throws RecognitionException {
		UnionSelectContext _localctx = new UnionSelectContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_unionSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			selectExpression();
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(789);
				match(UNION);
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(790);
					match(ALL);
					}
				}

				setState(793);
				selectExpression();
				}
				}
				setState(798);
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
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitSelectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExpressionContext selectExpression() throws RecognitionException {
		SelectExpressionContext _localctx = new SelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selectExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			selectClause();
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(800);
				fromClause();
				}
			}

			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(803);
				whereClause();
				}
			}

			setState(807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(806);
				groupByClause();
				}
			}

			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(809);
				orderByClause();
				}
			}

			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(812);
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
		public TerminalNode SELECT() { return getToken(MySQLDMLParser.SELECT, 0); }
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
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(SELECT);
			setState(816);
			selectSpec();
			setState(817);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(MySQLDMLParser.FROM, 0); }
		public TableReferencesContext tableReferences() {
			return getRuleContext(TableReferencesContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(FROM);
			setState(820);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(MySQLDMLParser.WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			match(WHERE);
			setState(823);
			expr(0);
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
		public TerminalNode GROUP() { return getToken(MySQLDMLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(MySQLDMLParser.BY, 0); }
		public List<GroupByItemContext> groupByItem() {
			return getRuleContexts(GroupByItemContext.class);
		}
		public GroupByItemContext groupByItem(int i) {
			return getRuleContext(GroupByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(MySQLDMLParser.WITH, 0); }
		public TerminalNode ROLLUP() { return getToken(MySQLDMLParser.ROLLUP, 0); }
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			match(GROUP);
			setState(826);
			match(BY);
			setState(827);
			groupByItem();
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(828);
				match(COMMA);
				setState(829);
				groupByItem();
				}
				}
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(835);
				match(WITH);
				setState(836);
				match(ROLLUP);
				}
			}

			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(839);
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
		public TerminalNode HAVING() { return getToken(MySQLDMLParser.HAVING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(HAVING);
			setState(843);
			expr(0);
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
		public TerminalNode ORDER() { return getToken(MySQLDMLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLDMLParser.BY, 0); }
		public List<GroupByItemContext> groupByItem() {
			return getRuleContexts(GroupByItemContext.class);
		}
		public GroupByItemContext groupByItem(int i) {
			return getRuleContext(GroupByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(ORDER);
			setState(846);
			match(BY);
			setState(847);
			groupByItem();
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(848);
				match(COMMA);
				setState(849);
				groupByItem();
				}
				}
				setState(854);
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
		public TerminalNode NUMBER() { return getToken(MySQLDMLParser.NUMBER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MySQLDMLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLDMLParser.DESC, 0); }
		public GroupByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitGroupByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByItemContext groupByItem() throws RecognitionException {
		GroupByItemContext _localctx = new GroupByItemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_groupByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(855);
				columnName();
				}
				break;
			case 2:
				{
				setState(856);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(857);
				expr(0);
				}
				break;
			}
			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(860);
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
		public TerminalNode LIMIT() { return getToken(MySQLDMLParser.LIMIT, 0); }
		public RangeClauseContext rangeClause() {
			return getRuleContext(RangeClauseContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(LIMIT);
			setState(864);
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
		public List<TerminalNode> NUMBER() { return getTokens(MySQLDMLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MySQLDMLParser.NUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
		}
		public TerminalNode OFFSET() { return getToken(MySQLDMLParser.OFFSET, 0); }
		public RangeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitRangeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeClauseContext rangeClause() throws RecognitionException {
		RangeClauseContext _localctx = new RangeClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_rangeClause);
		int _la;
		try {
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				match(NUMBER);
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(867);
					match(COMMA);
					setState(868);
					match(NUMBER);
					}
					}
					setState(873);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				match(NUMBER);
				setState(875);
				match(OFFSET);
				setState(876);
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
		public TerminalNode LEFT_PAREN() { return getToken(MySQLDMLParser.LEFT_PAREN, 0); }
		public UnionSelectContext unionSelect() {
			return getRuleContext(UnionSelectContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MySQLDMLParser.RIGHT_PAREN, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(LEFT_PAREN);
			setState(880);
			unionSelect();
			setState(881);
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
		public TerminalNode ASTERISK() { return getToken(MySQLDMLParser.ASTERISK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
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
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitSelectExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExprsContext selectExprs() throws RecognitionException {
		SelectExprsContext _localctx = new SelectExprsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_selectExprs);
		int _la;
		try {
			setState(903);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(883);
				match(ASTERISK);
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(884);
					match(COMMA);
					setState(885);
					selectExpr();
					}
					}
					setState(890);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(891);
				selectExpr();
				setState(894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(892);
					match(COMMA);
					setState(893);
					match(ASTERISK);
					}
					break;
				}
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(896);
					match(COMMA);
					setState(897);
					selectExpr();
					}
					}
					setState(902);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLDMLParser.ID, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
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
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			deleteClause();
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(908);
				whereClause();
				}
			}

			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(911);
				orderByClause();
				}
			}

			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(914);
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
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			updateClause();
			setState(918);
			setClause();
			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(919);
				whereClause();
				}
			}

			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(922);
				orderByClause();
				}
			}

			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(925);
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

	public static class SchemaNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MySQLDMLParser.ID, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
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
		public TerminalNode ID() { return getToken(MySQLDMLParser.ID, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
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
		public TerminalNode ID() { return getToken(MySQLDMLParser.ID, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
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

	public static class ItemListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(MySQLDMLParser.LEFT_PAREN, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(MySQLDMLParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MySQLDMLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MySQLDMLParser.COMMA, i);
		}
		public ItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLDMLVisitor ) return ((MySQLDMLVisitor<? extends T>)visitor).visitItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemListContext itemList() throws RecognitionException {
		ItemListContext _localctx = new ItemListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_itemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			match(LEFT_PAREN);
			setState(935);
			item();
			setState(940);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(936);
				match(COMMA);
				setState(937);
				item();
				}
				}
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(943);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 2:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 5:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 6:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean booleanPrimary_sempred(BooleanPrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 11);
		case 12:
			return precpred(_ctx, 10);
		case 13:
			return precpred(_ctx, 9);
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 7);
		case 16:
			return precpred(_ctx, 6);
		case 17:
			return precpred(_ctx, 5);
		case 18:
			return precpred(_ctx, 4);
		case 19:
			return precpred(_ctx, 3);
		case 20:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 10);
		case 22:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008e\u03b4\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\5\2\u0090"+
		"\n\2\3\2\5\2\u0093\n\2\3\2\5\2\u0096\n\2\3\2\5\2\u0099\n\2\3\2\5\2\u009c"+
		"\n\2\3\2\5\2\u009f\n\2\3\2\5\2\u00a2\n\2\3\2\5\2\u00a5\n\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00b1\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00c2\n\3\f\3\16\3\u00c5\13\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\u00cd\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4\u00dc\n\4\f\4\16\4\u00df\13\4\3\5\3\5\3\6\3\6\5\6"+
		"\u00e5\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ec\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u00f3"+
		"\n\6\f\6\16\6\u00f6\13\6\3\6\3\6\3\6\3\6\5\6\u00fc\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u010a\n\6\3\6\3\6\3\6\3\6\7\6\u0110"+
		"\n\6\f\6\16\6\u0113\13\6\3\6\3\6\5\6\u0117\n\6\3\6\3\6\3\6\3\6\5\6\u011d"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7\u0146\n\7\f\7\16\7\u0149\13\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\b\u0162\n\b\f\b\16\b\u0165\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u016c"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\7\b\u0173\n\b\f\b\16\b\u0176\13\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0183\n\t\3\t\3\t\5\t\u0187\n\t\3"+
		"\t\3\t\3\t\5\t\u018c\n\t\3\t\3\t\5\t\u0190\n\t\5\t\u0192\n\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u019d\n\13\f\13\16\13\u01a0\13\13"+
		"\5\13\u01a2\n\13\3\13\3\13\3\f\3\f\5\f\u01a8\n\f\3\r\3\r\3\r\6\r\u01ad"+
		"\n\r\r\r\16\r\u01ae\3\r\5\r\u01b2\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\6\17\u01bd\n\17\r\17\16\17\u01be\3\17\5\17\u01c2\n\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\5\23"+
		"\u01d2\n\23\3\23\5\23\u01d5\n\23\3\23\5\23\u01d8\n\23\3\24\3\24\3\24\7"+
		"\24\u01dd\n\24\f\24\16\24\u01e0\13\24\3\25\3\25\3\25\6\25\u01e5\n\25\r"+
		"\25\16\25\u01e6\3\25\3\25\6\25\u01eb\n\25\r\25\16\25\u01ec\3\25\5\25\u01f0"+
		"\n\25\3\26\3\26\3\26\5\26\u01f5\n\26\3\26\5\26\u01f8\n\26\3\26\5\26\u01fb"+
		"\n\26\3\26\5\26\u01fe\n\26\3\26\3\26\5\26\u0202\n\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u020a\n\26\3\27\5\27\u020d\n\27\3\27\3\27\3\27\5\27"+
		"\u0212\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u021c\n\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0226\n\27\3\27\3\27\5\27"+
		"\u022a\n\27\3\30\3\30\3\30\3\30\5\30\u0230\n\30\3\31\3\31\3\31\7\31\u0235"+
		"\n\31\f\31\16\31\u0238\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u0242\n\32\7\32\u0244\n\32\f\32\16\32\u0247\13\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u0252\n\32\7\32\u0254\n\32\f\32\16\32"+
		"\u0257\13\32\3\32\5\32\u025a\n\32\3\33\3\33\3\33\3\33\5\33\u0260\n\33"+
		"\3\34\3\34\3\34\5\34\u0265\n\34\3\35\3\35\5\35\u0269\n\35\3\35\3\35\3"+
		"\35\5\35\u026e\n\35\7\35\u0270\n\35\f\35\16\35\u0273\13\35\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u027a\n\35\3\35\3\35\3\35\5\35\u027f\n\35\7\35\u0281"+
		"\n\35\f\35\16\35\u0284\13\35\3\35\3\35\5\35\u0288\n\35\3\36\5\36\u028b"+
		"\n\36\3\36\5\36\u028e\n\36\3\36\5\36\u0291\n\36\5\36\u0293\n\36\3\37\3"+
		"\37\5\37\u0297\n\37\3\37\3\37\5\37\u029b\n\37\3\37\3\37\5\37\u029f\n\37"+
		"\3\37\5\37\u02a2\n\37\3 \3 \5 \u02a6\n \3!\3!\3!\3!\5!\u02ac\n!\3\"\3"+
		"\"\3\"\3#\5#\u02b2\n#\3#\3#\5#\u02b6\n#\3$\3$\3$\3$\7$\u02bc\n$\f$\16"+
		"$\u02bf\13$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\5\'\u02cd\n\'\3(\3"+
		"(\3(\7(\u02d2\n(\f(\16(\u02d5\13(\3)\3)\3)\3)\3*\3*\5*\u02dd\n*\3+\3+"+
		"\3+\3+\7+\u02e3\n+\f+\16+\u02e6\13+\3+\3+\3,\3,\3,\3,\3-\5-\u02ef\n-\3"+
		"-\5-\u02f2\n-\3.\3.\3/\3/\3/\3/\5/\u02fa\n/\3\60\3\60\5\60\u02fe\n\60"+
		"\3\61\3\61\5\61\u0302\n\61\3\61\3\61\3\61\7\61\u0307\n\61\f\61\16\61\u030a"+
		"\13\61\3\61\3\61\3\62\3\62\5\62\u0310\n\62\3\62\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\64\5\64\u031a\n\64\3\64\7\64\u031d\n\64\f\64\16\64\u0320\13"+
		"\64\3\65\3\65\5\65\u0324\n\65\3\65\5\65\u0327\n\65\3\65\5\65\u032a\n\65"+
		"\3\65\5\65\u032d\n\65\3\65\5\65\u0330\n\65\3\66\3\66\3\66\3\66\3\67\3"+
		"\67\3\67\38\38\38\39\39\39\39\39\79\u0341\n9\f9\169\u0344\139\39\39\5"+
		"9\u0348\n9\39\59\u034b\n9\3:\3:\3:\3;\3;\3;\3;\3;\7;\u0355\n;\f;\16;\u0358"+
		"\13;\3<\3<\3<\5<\u035d\n<\3<\5<\u0360\n<\3=\3=\3=\3>\3>\3>\7>\u0368\n"+
		">\f>\16>\u036b\13>\3>\3>\3>\5>\u0370\n>\3?\3?\3?\3?\3@\3@\3@\7@\u0379"+
		"\n@\f@\16@\u037c\13@\3@\3@\3@\5@\u0381\n@\3@\3@\7@\u0385\n@\f@\16@\u0388"+
		"\13@\5@\u038a\n@\3A\3A\3B\3B\5B\u0390\nB\3B\5B\u0393\nB\3B\5B\u0396\n"+
		"B\3C\3C\3C\5C\u039b\nC\3C\5C\u039e\nC\3C\5C\u03a1\nC\3D\3D\3E\3E\3F\3"+
		"F\3G\3G\3G\3G\7G\u03ad\nG\fG\16G\u03b0\13G\3G\3G\3G\2\6\4\6\f\16H\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\2\r"+
		"\5\2\4\4\34\34\36\36\3\2\n\13\3\2WZ\3\2\34\35\3\2~\u0084\3\2ce\3\2:;\3"+
		"\2>?\3\2DE\3\2MN\3\2$%\2\u041f\2\u008f\3\2\2\2\4\u00b0\3\2\2\2\6\u00c6"+
		"\3\2\2\2\b\u00e0\3\2\2\2\n\u011c\3\2\2\2\f\u011e\3\2\2\2\16\u016b\3\2"+
		"\2\2\20\u0191\3\2\2\2\22\u0193\3\2\2\2\24\u0196\3\2\2\2\26\u01a7\3\2\2"+
		"\2\30\u01a9\3\2\2\2\32\u01b5\3\2\2\2\34\u01ba\3\2\2\2\36\u01c5\3\2\2\2"+
		" \u01ca\3\2\2\2\"\u01cd\3\2\2\2$\u01d1\3\2\2\2&\u01d9\3\2\2\2(\u01ef\3"+
		"\2\2\2*\u0209\3\2\2\2,\u0229\3\2\2\2.\u022f\3\2\2\2\60\u0231\3\2\2\2\62"+
		"\u0259\3\2\2\2\64\u025b\3\2\2\2\66\u0261\3\2\2\28\u0287\3\2\2\2:\u0292"+
		"\3\2\2\2<\u0294\3\2\2\2>\u02a3\3\2\2\2@\u02ab\3\2\2\2B\u02ad\3\2\2\2D"+
		"\u02b1\3\2\2\2F\u02b7\3\2\2\2H\u02c0\3\2\2\2J\u02c3\3\2\2\2L\u02cc\3\2"+
		"\2\2N\u02ce\3\2\2\2P\u02d6\3\2\2\2R\u02dc\3\2\2\2T\u02de\3\2\2\2V\u02e9"+
		"\3\2\2\2X\u02ee\3\2\2\2Z\u02f3\3\2\2\2\\\u02f9\3\2\2\2^\u02fd\3\2\2\2"+
		"`\u02ff\3\2\2\2b\u030d\3\2\2\2d\u0314\3\2\2\2f\u0316\3\2\2\2h\u0321\3"+
		"\2\2\2j\u0331\3\2\2\2l\u0335\3\2\2\2n\u0338\3\2\2\2p\u033b\3\2\2\2r\u034c"+
		"\3\2\2\2t\u034f\3\2\2\2v\u035c\3\2\2\2x\u0361\3\2\2\2z\u036f\3\2\2\2|"+
		"\u0371\3\2\2\2~\u0389\3\2\2\2\u0080\u038b\3\2\2\2\u0082\u038d\3\2\2\2"+
		"\u0084\u0397\3\2\2\2\u0086\u03a2\3\2\2\2\u0088\u03a4\3\2\2\2\u008a\u03a6"+
		"\3\2\2\2\u008c\u03a8\3\2\2\2\u008e\u0090\t\2\2\2\u008f\u008e\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0093\7\5\2\2\u0092\u0091\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0096\7\6\2\2\u0095"+
		"\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0099\7\7"+
		"\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u009c\7\b\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2"+
		"\2\2\u009d\u009f\7\t\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u00a2\t\3\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5\7\f\2\2\u00a4\u00a3\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\3\3\2\2\2\u00a6\u00a7\b\3\1\2\u00a7\u00a8\7\u0085"+
		"\2\2\u00a8\u00a9\5\4\3\2\u00a9\u00aa\7\u0086\2\2\u00aa\u00b1\3\2\2\2\u00ab"+
		"\u00ac\7U\2\2\u00ac\u00b1\5\4\3\5\u00ad\u00ae\7o\2\2\u00ae\u00b1\5\4\3"+
		"\4\u00af\u00b1\5\6\4\2\u00b0\u00a6\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ad"+
		"\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00c3\3\2\2\2\u00b2\u00b3\f\13\2\2"+
		"\u00b3\u00b4\7S\2\2\u00b4\u00c2\5\4\3\f\u00b5\u00b6\f\n\2\2\u00b6\u00b7"+
		"\7n\2\2\u00b7\u00c2\5\4\3\13\u00b8\u00b9\f\t\2\2\u00b9\u00ba\7T\2\2\u00ba"+
		"\u00c2\5\4\3\n\u00bb\u00bc\f\b\2\2\u00bc\u00bd\7R\2\2\u00bd\u00c2\5\4"+
		"\3\t\u00be\u00bf\f\7\2\2\u00bf\u00c0\7m\2\2\u00c0\u00c2\5\4\3\b\u00c1"+
		"\u00b2\3\2\2\2\u00c1\u00b5\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00bb\3\2"+
		"\2\2\u00c1\u00be\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\b\4\1\2"+
		"\u00c7\u00c8\5\n\6\2\u00c8\u00dd\3\2\2\2\u00c9\u00ca\f\7\2\2\u00ca\u00cc"+
		"\7Q\2\2\u00cb\u00cd\7U\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00dc\t\4\2\2\u00cf\u00d0\f\6\2\2\u00d0\u00d1\7|"+
		"\2\2\u00d1\u00dc\5\n\6\2\u00d2\u00d3\f\5\2\2\u00d3\u00d4\5\b\5\2\u00d4"+
		"\u00d5\5\n\6\2\u00d5\u00dc\3\2\2\2\u00d6\u00d7\f\4\2\2\u00d7\u00d8\5\b"+
		"\5\2\u00d8\u00d9\t\5\2\2\u00d9\u00da\5|?\2\u00da\u00dc\3\2\2\2\u00db\u00c9"+
		"\3\2\2\2\u00db\u00cf\3\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d6\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\7\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00e0\u00e1\t\6\2\2\u00e1\t\3\2\2\2\u00e2\u00e4\5"+
		"\f\7\2\u00e3\u00e5\7U\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\78\2\2\u00e7\u00e8\5|?\2\u00e8\u011d\3\2\2"+
		"\2\u00e9\u00eb\5\f\7\2\u00ea\u00ec\7U\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\78\2\2\u00ee\u00ef\7\u0085\2"+
		"\2\u00ef\u00f4\5\16\b\2\u00f0\u00f1\7\u0089\2\2\u00f1\u00f3\5\16\b\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\u0086\2\2\u00f8"+
		"\u011d\3\2\2\2\u00f9\u00fb\5\f\7\2\u00fa\u00fc\7U\2\2\u00fb\u00fa\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7V\2\2\u00fe"+
		"\u00ff\5\16\b\2\u00ff\u0100\7R\2\2\u0100\u0101\5\n\6\2\u0101\u011d\3\2"+
		"\2\2\u0102\u0103\5\f\7\2\u0103\u0104\7[\2\2\u0104\u0105\7\\\2\2\u0105"+
		"\u0106\5\16\b\2\u0106\u011d\3\2\2\2\u0107\u0109\5\f\7\2\u0108\u010a\7"+
		"U\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\7\\\2\2\u010c\u0111\5\16\b\2\u010d\u010e\7a\2\2\u010e\u0110\5\16"+
		"\b\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u011d\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0116\5\f"+
		"\7\2\u0115\u0117\7U\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\7b\2\2\u0119\u011a\5\16\b\2\u011a\u011d\3\2"+
		"\2\2\u011b\u011d\5\f\7\2\u011c\u00e2\3\2\2\2\u011c\u00e9\3\2\2\2\u011c"+
		"\u00f9\3\2\2\2\u011c\u0102\3\2\2\2\u011c\u0107\3\2\2\2\u011c\u0114\3\2"+
		"\2\2\u011c\u011b\3\2\2\2\u011d\13\3\2\2\2\u011e\u011f\b\7\1\2\u011f\u0120"+
		"\5\16\b\2\u0120\u0147\3\2\2\2\u0121\u0122\f\17\2\2\u0122\u0123\7q\2\2"+
		"\u0123\u0146\5\f\7\20\u0124\u0125\f\16\2\2\u0125\u0126\7r\2\2\u0126\u0146"+
		"\5\f\7\17\u0127\u0128\f\r\2\2\u0128\u0129\7s\2\2\u0129\u0146\5\f\7\16"+
		"\u012a\u012b\f\f\2\2\u012b\u012c\7t\2\2\u012c\u0146\5\f\7\r\u012d\u012e"+
		"\f\13\2\2\u012e\u012f\7w\2\2\u012f\u0146\5\f\7\f\u0130\u0131\f\n\2\2\u0131"+
		"\u0132\7x\2\2\u0132\u0146\5\f\7\13\u0133\u0134\f\t\2\2\u0134\u0135\7y"+
		"\2\2\u0135\u0146\5\f\7\n\u0136\u0137\f\b\2\2\u0137\u0138\7z\2\2\u0138"+
		"\u0146\5\f\7\t\u0139\u013a\f\7\2\2\u013a\u013b\7]\2\2\u013b\u0146\5\f"+
		"\7\b\u013c\u013d\f\6\2\2\u013d\u013e\7^\2\2\u013e\u0146\5\f\7\7\u013f"+
		"\u0140\f\5\2\2\u0140\u0141\7v\2\2\u0141\u0146\5\f\7\6\u0142\u0143\f\4"+
		"\2\2\u0143\u0144\7u\2\2\u0144\u0146\5\f\7\5\u0145\u0121\3\2\2\2\u0145"+
		"\u0124\3\2\2\2\u0145\u0127\3\2\2\2\u0145\u012a\3\2\2\2\u0145\u012d\3\2"+
		"\2\2\u0145\u0130\3\2\2\2\u0145\u0133\3\2\2\2\u0145\u0136\3\2\2\2\u0145"+
		"\u0139\3\2\2\2\u0145\u013c\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0142\3\2"+
		"\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\r\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u016c\b\b\1\2\u014b\u016c\5\24\13"+
		"\2\u014c\u016c\5\20\t\2\u014d\u016c\7l\2\2\u014e\u014f\7w\2\2\u014f\u016c"+
		"\5\16\b\13\u0150\u0151\7x\2\2\u0151\u016c\5\16\b\n\u0152\u0153\7p\2\2"+
		"\u0153\u016c\5\16\b\t\u0154\u0155\7o\2\2\u0155\u016c\5\16\b\b\u0156\u0157"+
		"\7_\2\2\u0157\u016c\5\16\b\7\u0158\u0159\7\u0085\2\2\u0159\u015a\5\4\3"+
		"\2\u015a\u015b\7\u0086\2\2\u015b\u016c\3\2\2\2\u015c\u015d\7`\2\2\u015d"+
		"\u015e\7\u0085\2\2\u015e\u0163\5\16\b\2\u015f\u0160\7\u0089\2\2\u0160"+
		"\u0162\5\16\b\2\u0161\u015f\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3"+
		"\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2\2\2\u0166"+
		"\u0167\7\u0086\2\2\u0167\u016c\3\2\2\2\u0168\u016c\5|?\2\u0169\u016a\7"+
		"P\2\2\u016a\u016c\5|?\2\u016b\u014a\3\2\2\2\u016b\u014b\3\2\2\2\u016b"+
		"\u014c\3\2\2\2\u016b\u014d\3\2\2\2\u016b\u014e\3\2\2\2\u016b\u0150\3\2"+
		"\2\2\u016b\u0152\3\2\2\2\u016b\u0154\3\2\2\2\u016b\u0156\3\2\2\2\u016b"+
		"\u0158\3\2\2\2\u016b\u015c\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2"+
		"\2\2\u016c\u0174\3\2\2\2\u016d\u016e\f\f\2\2\u016e\u016f\7m\2\2\u016f"+
		"\u0173\5\16\b\r\u0170\u0171\f\r\2\2\u0171\u0173\5\22\n\2\u0172\u016d\3"+
		"\2\2\2\u0172\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\17\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u0192\7\u008e"+
		"\2\2\u0178\u0192\7\26\2\2\u0179\u0192\7X\2\2\u017a\u0192\7Y\2\2\u017b"+
		"\u0192\7W\2\2\u017c\u017d\7\u0087\2\2\u017d\u017e\7l\2\2\u017e\u017f\7"+
		"\25\2\2\u017f\u0192\7\u0088\2\2\u0180\u0192\7\30\2\2\u0181\u0183\7l\2"+
		"\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186"+
		"\7\25\2\2\u0185\u0187\5\22\n\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2"+
		"\u0187\u0192\3\2\2\2\u0188\u0189\t\7\2\2\u0189\u0192\7\25\2\2\u018a\u018c"+
		"\7l\2\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018f\7\31\2\2\u018e\u0190\5\22\n\2\u018f\u018e\3\2\2\2\u018f\u0190\3"+
		"\2\2\2\u0190\u0192\3\2\2\2\u0191\u0177\3\2\2\2\u0191\u0178\3\2\2\2\u0191"+
		"\u0179\3\2\2\2\u0191\u017a\3\2\2\2\u0191\u017b\3\2\2\2\u0191\u017c\3\2"+
		"\2\2\u0191\u0180\3\2\2\2\u0191\u0182\3\2\2\2\u0191\u0188\3\2\2\2\u0191"+
		"\u018b\3\2\2\2\u0192\21\3\2\2\2\u0193\u0194\7\24\2\2\u0194\u0195\7l\2"+
		"\2\u0195\23\3\2\2\2\u0196\u0197\7l\2\2\u0197\u01a1\7\u0085\2\2\u0198\u01a2"+
		"\3\2\2\2\u0199\u019e\5\4\3\2\u019a\u019b\7\u0089\2\2\u019b\u019d\5\4\3"+
		"\2\u019c\u019a\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u0198\3\2\2\2\u01a1"+
		"\u0199\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\7\u0086\2\2\u01a4\25\3"+
		"\2\2\2\u01a5\u01a8\5\34\17\2\u01a6\u01a8\5\30\r\2\u01a7\u01a5\3\2\2\2"+
		"\u01a7\u01a6\3\2\2\2\u01a8\27\3\2\2\2\u01a9\u01aa\7f\2\2\u01aa\u01ac\5"+
		"\16\b\2\u01ab\u01ad\5\32\16\2\u01ac\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2"+
		"\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01b2"+
		"\5 \21\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01b4\7k\2\2\u01b4\31\3\2\2\2\u01b5\u01b6\7g\2\2\u01b6\u01b7\5\16\b\2"+
		"\u01b7\u01b8\7h\2\2\u01b8\u01b9\5\"\22\2\u01b9\33\3\2\2\2\u01ba\u01bc"+
		"\7f\2\2\u01bb\u01bd\5\36\20\2\u01bc\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2"+
		"\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01c2"+
		"\5 \21\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c4\7k\2\2\u01c4\35\3\2\2\2\u01c5\u01c6\7g\2\2\u01c6\u01c7\5\6\4\2"+
		"\u01c7\u01c8\7h\2\2\u01c8\u01c9\5\"\22\2\u01c9\37\3\2\2\2\u01ca\u01cb"+
		"\7j\2\2\u01cb\u01cc\5\"\22\2\u01cc!\3\2\2\2\u01cd\u01ce\5\4\3\2\u01ce"+
		"#\3\2\2\2\u01cf\u01d2\5\f\7\2\u01d0\u01d2\5\26\f\2\u01d1\u01cf\3\2\2\2"+
		"\u01d1\u01d0\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d5\7+\2\2\u01d4\u01d3"+
		"\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d8\5\u0080A"+
		"\2\u01d7\u01d6\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8%\3\2\2\2\u01d9\u01de"+
		"\5(\25\2\u01da\u01db\7\u0089\2\2\u01db\u01dd\5(\25\2\u01dc\u01da\3\2\2"+
		"\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\'"+
		"\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\5*\26\2\u01e2\u01e3\5,\27\2\u01e3"+
		"\u01e5\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01f0\3\2\2\2\u01e8\u01ea\5*\26\2\u01e9"+
		"\u01eb\5,\27\2\u01ea\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01f0\5*\26\2\u01ef"+
		"\u01e4\3\2\2\2\u01ef\u01e8\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0)\3\2\2\2"+
		"\u01f1\u01f4\5\u0088E\2\u01f2\u01f3\7 \2\2\u01f3\u01f5\5\u008cG\2\u01f4"+
		"\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01fa\3\2\2\2\u01f6\u01f8\7+"+
		"\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fb\5\u0080A\2\u01fa\u01f7\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd"+
		"\3\2\2\2\u01fc\u01fe\5\60\31\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2"+
		"\u01fe\u020a\3\2\2\2\u01ff\u0201\5|?\2\u0200\u0202\7+\2\2\u0201\u0200"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\5\u0080A"+
		"\2\u0204\u020a\3\2\2\2\u0205\u0206\7\u0085\2\2\u0206\u0207\5&\24\2\u0207"+
		"\u0208\7\u0086\2\2\u0208\u020a\3\2\2\2\u0209\u01f1\3\2\2\2\u0209\u01ff"+
		"\3\2\2\2\u0209\u0205\3\2\2\2\u020a+\3\2\2\2\u020b\u020d\t\b\2\2\u020c"+
		"\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\7<"+
		"\2\2\u020f\u0211\5*\26\2\u0210\u0212\5.\30\2\u0211\u0210\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u022a\3\2\2\2\u0213\u0214\7\6\2\2\u0214\u022a\5*"+
		"\26\2\u0215\u0216\7\6\2\2\u0216\u0217\5*\26\2\u0217\u0218\5.\30\2\u0218"+
		"\u022a\3\2\2\2\u0219\u021b\t\t\2\2\u021a\u021c\7@\2\2\u021b\u021a\3\2"+
		"\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\7<\2\2\u021e"+
		"\u021f\5*\26\2\u021f\u0220\5.\30\2\u0220\u022a\3\2\2\2\u0221\u0225\7A"+
		"\2\2\u0222\u0226\7:\2\2\u0223\u0224\t\t\2\2\u0224\u0226\7@\2\2\u0225\u0222"+
		"\3\2\2\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0228\7<\2\2\u0228\u022a\5*\26\2\u0229\u020c\3\2\2\2\u0229\u0213\3\2"+
		"\2\2\u0229\u0215\3\2\2\2\u0229\u0219\3\2\2\2\u0229\u0221\3\2\2\2\u022a"+
		"-\3\2\2\2\u022b\u022c\7=\2\2\u022c\u0230\5\4\3\2\u022d\u022e\7B\2\2\u022e"+
		"\u0230\5\u008cG\2\u022f\u022b\3\2\2\2\u022f\u022d\3\2\2\2\u0230/\3\2\2"+
		"\2\u0231\u0236\5\62\32\2\u0232\u0233\7\u0089\2\2\u0233\u0235\5\62\32\2"+
		"\u0234\u0232\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237"+
		"\3\2\2\2\u0237\61\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\7C\2\2\u023a"+
		"\u0245\t\n\2\2\u023b\u0241\7\61\2\2\u023c\u0242\7<\2\2\u023d\u023e\7,"+
		"\2\2\u023e\u0242\7#\2\2\u023f\u0240\7\"\2\2\u0240\u0242\7#\2\2\u0241\u023c"+
		"\3\2\2\2\u0241\u023d\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0244\3\2\2\2\u0243"+
		"\u023b\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2"+
		"\2\2\u0246\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u025a\5\u008cG\2\u0249"+
		"\u024a\7F\2\2\u024a\u0255\t\n\2\2\u024b\u0251\7\61\2\2\u024c\u0252\7<"+
		"\2\2\u024d\u024e\7,\2\2\u024e\u0252\7#\2\2\u024f\u0250\7\"\2\2\u0250\u0252"+
		"\7#\2\2\u0251\u024c\3\2\2\2\u0251\u024d\3\2\2\2\u0251\u024f\3\2\2\2\u0252"+
		"\u0254\3\2\2\2\u0253\u024b\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2"+
		"\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0255\3\2\2\2\u0258"+
		"\u025a\5\u008cG\2\u0259\u0239\3\2\2\2\u0259\u0249\3\2\2\2\u025a\63\3\2"+
		"\2\2\u025b\u025c\7J\2\2\u025c\u025f\5:\36\2\u025d\u0260\58\35\2\u025e"+
		"\u0260\5\66\34\2\u025f\u025d\3\2\2\2\u025f\u025e\3\2\2\2\u0260\65\3\2"+
		"\2\2\u0261\u0262\7\37\2\2\u0262\u0264\7l\2\2\u0263\u0265\5B\"\2\u0264"+
		"\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\67\3\2\2\2\u0266\u0268\7l\2\2"+
		"\u0267\u0269\7\3\2\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u0271"+
		"\3\2\2\2\u026a\u026b\7\u0089\2\2\u026b\u026d\7l\2\2\u026c\u026e\7\3\2"+
		"\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u026a"+
		"\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274\u0275\7\37\2\2\u0275\u0288\5"+
		"&\24\2\u0276\u0277\7\37\2\2\u0277\u0279\7l\2\2\u0278\u027a\7\3\2\2\u0279"+
		"\u0278\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0282\3\2\2\2\u027b\u027c\7\u0089"+
		"\2\2\u027c\u027e\7l\2\2\u027d\u027f\7\3\2\2\u027e\u027d\3\2\2\2\u027e"+
		"\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u027b\3\2\2\2\u0281\u0284\3\2"+
		"\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2\2\2\u0284"+
		"\u0282\3\2\2\2\u0285\u0286\7B\2\2\u0286\u0288\5&\24\2\u0287\u0266\3\2"+
		"\2\2\u0287\u0276\3\2\2\2\u02889\3\2\2\2\u0289\u028b\7\22\2\2\u028a\u0289"+
		"\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u0293\3\2\2\2\u028c\u028e\7K\2\2\u028d"+
		"\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0293\3\2\2\2\u028f\u0291\7F"+
		"\2\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0293\3\2\2\2\u0292"+
		"\u028a\3\2\2\2\u0292\u028d\3\2\2\2\u0292\u0290\3\2\2\2\u0293;\3\2\2\2"+
		"\u0294\u0296\5> \2\u0295\u0297\7/\2\2\u0296\u0295\3\2\2\2\u0296\u0297"+
		"\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029a\7l\2\2\u0299\u029b\5B\"\2\u029a"+
		"\u0299\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029f\5H"+
		"%\2\u029d\u029f\5D#\2\u029e\u029c\3\2\2\2\u029e\u029d\3\2\2\2\u029f\u02a1"+
		"\3\2\2\2\u02a0\u02a2\5J&\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"=\3\2\2\2\u02a3\u02a5\7L\2\2\u02a4\u02a6\5@!\2\u02a5\u02a4\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6?\3\2\2\2\u02a7\u02ac\7\22\2\2\u02a8\u02ac\7\23\2"+
		"\2\u02a9\u02aa\7\5\2\2\u02aa\u02ac\7F\2\2\u02ab\u02a7\3\2\2\2\u02ab\u02a8"+
		"\3\2\2\2\u02ab\u02a9\3\2\2\2\u02acA\3\2\2\2\u02ad\u02ae\7 \2\2\u02ae\u02af"+
		"\5\u008cG\2\u02afC\3\2\2\2\u02b0\u02b2\5L\'\2\u02b1\u02b0\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b6\5F$\2\u02b4\u02b6\5^\60"+
		"\2\u02b5\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6E\3\2\2\2\u02b7\u02b8"+
		"\t\13\2\2\u02b8\u02bd\5T+\2\u02b9\u02ba\7\u0089\2\2\u02ba\u02bc\5T+\2"+
		"\u02bb\u02b9\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be"+
		"\3\2\2\2\u02beG\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c1\7\60\2\2\u02c1"+
		"\u02c2\5N(\2\u02c2I\3\2\2\2\u02c3\u02c4\7=\2\2\u02c4\u02c5\7O\2\2\u02c5"+
		"\u02c6\7E\2\2\u02c6\u02c7\7\62\2\2\u02c7\u02c8\5N(\2\u02c8K\3\2\2\2\u02c9"+
		"\u02ca\7\u0085\2\2\u02ca\u02cd\7\u0086\2\2\u02cb\u02cd\5\u008cG\2\u02cc"+
		"\u02c9\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cdM\3\2\2\2\u02ce\u02d3\5P)\2\u02cf"+
		"\u02d0\7\u0089\2\2\u02d0\u02d2\5P)\2\u02d1\u02cf\3\2\2\2\u02d2\u02d5\3"+
		"\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4O\3\2\2\2\u02d5\u02d3"+
		"\3\2\2\2\u02d6\u02d7\5\u008aF\2\u02d7\u02d8\7~\2\2\u02d8\u02d9\5R*\2\u02d9"+
		"Q\3\2\2\2\u02da\u02dd\7I\2\2\u02db\u02dd\5\4\3\2\u02dc\u02da\3\2\2\2\u02dc"+
		"\u02db\3\2\2\2\u02ddS\3\2\2\2\u02de\u02df\7\u0085\2\2\u02df\u02e4\5R*"+
		"\2\u02e0\u02e1\7\u0089\2\2\u02e1\u02e3\5R*\2\u02e2\u02e0\3\2\2\2\u02e3"+
		"\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e7\3\2"+
		"\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02e8\7\u0086\2\2\u02e8U\3\2\2\2\u02e9"+
		"\u02ea\7\62\2\2\u02ea\u02eb\5X-\2\u02eb\u02ec\5&\24\2\u02ecW\3\2\2\2\u02ed"+
		"\u02ef\7\22\2\2\u02ee\u02ed\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\3"+
		"\2\2\2\u02f0\u02f2\7F\2\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2"+
		"Y\3\2\2\2\u02f3\u02f4\7l\2\2\u02f4[\3\2\2\2\u02f5\u02fa\5^\60\2\u02f6"+
		"\u02fa\5<\37\2\u02f7\u02fa\5\u0084C\2\u02f8\u02fa\5\u0082B\2\u02f9\u02f5"+
		"\3\2\2\2\u02f9\u02f6\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02f8\3\2\2\2\u02fa"+
		"]\3\2\2\2\u02fb\u02fe\5`\61\2\u02fc\u02fe\5f\64\2\u02fd\u02fb\3\2\2\2"+
		"\u02fd\u02fc\3\2\2\2\u02fe_\3\2\2\2\u02ff\u0301\7&\2\2\u0300\u0302\7\'"+
		"\2\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303"+
		"\u0308\5b\62\2\u0304\u0305\7\u0089\2\2\u0305\u0307\5b\62\2\u0306\u0304"+
		"\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309"+
		"\u030b\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u030c\5f\64\2\u030ca\3\2\2\2"+
		"\u030d\u030f\5d\63\2\u030e\u0310\5\u008cG\2\u030f\u030e\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\7+\2\2\u0312\u0313\5|?"+
		"\2\u0313c\3\2\2\2\u0314\u0315\7l\2\2\u0315e\3\2\2\2\u0316\u031e\5h\65"+
		"\2\u0317\u0319\7H\2\2\u0318\u031a\7\34\2\2\u0319\u0318\3\2\2\2\u0319\u031a"+
		"\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031d\5h\65\2\u031c\u0317\3\2\2\2\u031d"+
		"\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031fg\3\2\2\2"+
		"\u0320\u031e\3\2\2\2\u0321\u0323\5j\66\2\u0322\u0324\5l\67\2\u0323\u0322"+
		"\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\3\2\2\2\u0325\u0327\5n8\2\u0326"+
		"\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0329\3\2\2\2\u0328\u032a\5p"+
		"9\2\u0329\u0328\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032c\3\2\2\2\u032b"+
		"\u032d\5t;\2\u032c\u032b\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032f\3\2\2"+
		"\2\u032e\u0330\5x=\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330i\3"+
		"\2\2\2\u0331\u0332\7\33\2\2\u0332\u0333\5\2\2\2\u0333\u0334\5~@\2\u0334"+
		"k\3\2\2\2\u0335\u0336\7\37\2\2\u0336\u0337\5&\24\2\u0337m\3\2\2\2\u0338"+
		"\u0339\7!\2\2\u0339\u033a\5\4\3\2\u033ao\3\2\2\2\u033b\u033c\7\"\2\2\u033c"+
		"\u033d\7#\2\2\u033d\u0342\5v<\2\u033e\u033f\7\u0089\2\2\u033f\u0341\5"+
		"v<\2\u0340\u033e\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2\2\u0342"+
		"\u0343\3\2\2\2\u0343\u0347\3\2\2\2\u0344\u0342\3\2\2\2\u0345\u0346\7&"+
		"\2\2\u0346\u0348\7(\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348"+
		"\u034a\3\2\2\2\u0349\u034b\5r:\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2\2"+
		"\2\u034bq\3\2\2\2\u034c\u034d\7)\2\2\u034d\u034e\5\4\3\2\u034es\3\2\2"+
		"\2\u034f\u0350\7,\2\2\u0350\u0351\7#\2\2\u0351\u0356\5v<\2\u0352\u0353"+
		"\7\u0089\2\2\u0353\u0355\5v<\2\u0354\u0352\3\2\2\2\u0355\u0358\3\2\2\2"+
		"\u0356\u0354\3\2\2\2\u0356\u0357\3\2\2\2\u0357u\3\2\2\2\u0358\u0356\3"+
		"\2\2\2\u0359\u035d\5\u008aF\2\u035a\u035d\7\26\2\2\u035b\u035d\5\4\3\2"+
		"\u035c\u0359\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035b\3\2\2\2\u035d\u035f"+
		"\3\2\2\2\u035e\u0360\t\f\2\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"w\3\2\2\2\u0361\u0362\7-\2\2\u0362\u0363\5z>\2\u0363y\3\2\2\2\u0364\u0369"+
		"\7\26\2\2\u0365\u0366\7\u0089\2\2\u0366\u0368\7\26\2\2\u0367\u0365\3\2"+
		"\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a"+
		"\u0370\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u036d\7\26\2\2\u036d\u036e\7"+
		".\2\2\u036e\u0370\7\26\2\2\u036f\u0364\3\2\2\2\u036f\u036c\3\2\2\2\u0370"+
		"{\3\2\2\2\u0371\u0372\7\u0085\2\2\u0372\u0373\5f\64\2\u0373\u0374\7\u0086"+
		"\2\2\u0374}\3\2\2\2\u0375\u037a\7y\2\2\u0376\u0377\7\u0089\2\2\u0377\u0379"+
		"\5$\23\2\u0378\u0376\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037b\u038a\3\2\2\2\u037c\u037a\3\2\2\2\u037d\u0380\5$"+
		"\23\2\u037e\u037f\7\u0089\2\2\u037f\u0381\7y\2\2\u0380\u037e\3\2\2\2\u0380"+
		"\u0381\3\2\2\2\u0381\u0386\3\2\2\2\u0382\u0383\7\u0089\2\2\u0383\u0385"+
		"\5$\23\2\u0384\u0382\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0384\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0389\u0375\3\2"+
		"\2\2\u0389\u037d\3\2\2\2\u038a\177\3\2\2\2\u038b\u038c\7l\2\2\u038c\u0081"+
		"\3\2\2\2\u038d\u038f\5\64\33\2\u038e\u0390\5n8\2\u038f\u038e\3\2\2\2\u038f"+
		"\u0390\3\2\2\2\u0390\u0392\3\2\2\2\u0391\u0393\5t;\2\u0392\u0391\3\2\2"+
		"\2\u0392\u0393\3\2\2\2\u0393\u0395\3\2\2\2\u0394\u0396\5x=\2\u0395\u0394"+
		"\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0083\3\2\2\2\u0397\u0398\5V,\2\u0398"+
		"\u039a\5H%\2\u0399\u039b\5n8\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2"+
		"\u039b\u039d\3\2\2\2\u039c\u039e\5t;\2\u039d\u039c\3\2\2\2\u039d\u039e"+
		"\3\2\2\2\u039e\u03a0\3\2\2\2\u039f\u03a1\5x=\2\u03a0\u039f\3\2\2\2\u03a0"+
		"\u03a1\3\2\2\2\u03a1\u0085\3\2\2\2\u03a2\u03a3\7l\2\2\u03a3\u0087\3\2"+
		"\2\2\u03a4\u03a5\7l\2\2\u03a5\u0089\3\2\2\2\u03a6\u03a7\7l\2\2\u03a7\u008b"+
		"\3\2\2\2\u03a8\u03a9\7\u0085\2\2\u03a9\u03ae\5Z.\2\u03aa\u03ab\7\u0089"+
		"\2\2\u03ab\u03ad\5Z.\2\u03ac\u03aa\3\2\2\2\u03ad\u03b0\3\2\2\2\u03ae\u03ac"+
		"\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b1"+
		"\u03b2\7\u0086\2\2\u03b2\u008d\3\2\2\2~\u008f\u0092\u0095\u0098\u009b"+
		"\u009e\u00a1\u00a4\u00b0\u00c1\u00c3\u00cc\u00db\u00dd\u00e4\u00eb\u00f4"+
		"\u00fb\u0109\u0111\u0116\u011c\u0145\u0147\u0163\u016b\u0172\u0174\u0182"+
		"\u0186\u018b\u018f\u0191\u019e\u01a1\u01a7\u01ae\u01b1\u01be\u01c1\u01d1"+
		"\u01d4\u01d7\u01de\u01e6\u01ec\u01ef\u01f4\u01f7\u01fa\u01fd\u0201\u0209"+
		"\u020c\u0211\u021b\u0225\u0229\u022f\u0236\u0241\u0245\u0251\u0255\u0259"+
		"\u025f\u0264\u0268\u026d\u0271\u0279\u027e\u0282\u0287\u028a\u028d\u0290"+
		"\u0292\u0296\u029a\u029e\u02a1\u02a5\u02ab\u02b1\u02b5\u02bd\u02cc\u02d3"+
		"\u02dc\u02e4\u02ee\u02f1\u02f9\u02fd\u0301\u0308\u030f\u0319\u031e\u0323"+
		"\u0326\u0329\u032c\u032f\u0342\u0347\u034a\u0356\u035c\u035f\u0369\u036f"+
		"\u037a\u0380\u0386\u0389\u038f\u0392\u0395\u039a\u039d\u03a0\u03ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}