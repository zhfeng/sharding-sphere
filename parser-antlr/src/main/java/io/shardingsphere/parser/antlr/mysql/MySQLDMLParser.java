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
		RULE_item = 44, RULE_select = 45, RULE_withClause = 46, RULE_cteClause = 47, 
		RULE_cteName = 48, RULE_unionSelect = 49, RULE_selectExpression = 50, 
		RULE_selectClause = 51, RULE_fromClause = 52, RULE_whereClause = 53, RULE_groupByClause = 54, 
		RULE_havingClause = 55, RULE_orderByClause = 56, RULE_groupByItem = 57, 
		RULE_limitClause = 58, RULE_rangeClause = 59, RULE_subquery = 60, RULE_selectExprs = 61, 
		RULE_alias = 62, RULE_delete = 63, RULE_update = 64, RULE_schemaName = 65, 
		RULE_tableName = 66, RULE_columnName = 67, RULE_itemList = 68;
	public static final String[] ruleNames = {
		"selectSpec", "expr", "booleanPrimary", "comparisonOperator", "predicate", 
		"bitExpr", "simpleExpr", "liter", "collateClause", "functionCall", "caseExpress", 
		"caseComp", "caseWhenComp", "caseCond", "whenResult", "elseResult", "caseResult", 
		"selectExpr", "tableReferences", "tableReference", "tableFactor", "joinTable", 
		"joinCondition", "indexHintList", "indexHint", "deleteClause", "fromSingle", 
		"fromMulti", "deleteSpec", "insert", "insertClause", "insertSpec", "partitionClause", 
		"columnClause", "valueClause", "setClause", "onDuplicateClause", "itemListWithEmpty", 
		"assignmentList", "assignment", "value", "valueList", "updateClause", 
		"updateSpec", "item", "select", "withClause", "cteClause", "cteName", 
		"unionSelect", "selectExpression", "selectClause", "fromClause", "whereClause", 
		"groupByClause", "havingClause", "orderByClause", "groupByItem", "limitClause", 
		"rangeClause", "subquery", "selectExprs", "alias", "delete", "update", 
		"schemaName", "tableName", "columnName", "itemList"
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(138);
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(141);
				match(HIGH_PRIORITY);
				}
				break;
			}
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(144);
				match(STRAIGHT_JOIN);
				}
				break;
			}
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(147);
				match(SQL_SMALL_RESULT);
				}
				break;
			}
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(150);
				match(SQL_BIG_RESULT);
				}
				break;
			}
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(153);
				match(SQL_BUFFER_RESULT);
				}
				break;
			}
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(156);
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
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(159);
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
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(163);
				match(LEFT_PAREN);
				setState(164);
				expr(0);
				setState(165);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				{
				setState(167);
				match(NOT);
				setState(168);
				expr(3);
				}
				break;
			case 3:
				{
				setState(169);
				match(NOT_SYM);
				setState(170);
				expr(2);
				}
				break;
			case 4:
				{
				setState(171);
				booleanPrimary(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(175);
						match(OR);
						setState(176);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(178);
						match(OR_SYM);
						setState(179);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(181);
						match(XOR);
						setState(182);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(184);
						match(AND);
						setState(185);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(187);
						match(AND_SYM);
						setState(188);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(193);
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
			setState(195);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(197);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(198);
						match(IS);
						setState(200);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(199);
							match(NOT);
							}
						}

						setState(202);
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
						setState(203);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(204);
						match(SAFE_EQ);
						setState(205);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(206);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(207);
						comparisonOperator();
						setState(208);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(211);
						comparisonOperator();
						setState(212);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(213);
						subquery();
						}
						break;
					}
					} 
				}
				setState(219);
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
			setState(220);
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
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				bitExpr(0);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(223);
					match(NOT);
					}
				}

				setState(226);
				match(IN);
				setState(227);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				bitExpr(0);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(230);
					match(NOT);
					}
				}

				setState(233);
				match(IN);
				setState(234);
				match(LEFT_PAREN);
				setState(235);
				simpleExpr(0);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(236);
					match(COMMA);
					setState(237);
					simpleExpr(0);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(245);
				bitExpr(0);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(246);
					match(NOT);
					}
				}

				setState(249);
				match(BETWEEN);
				setState(250);
				simpleExpr(0);
				setState(251);
				match(AND);
				setState(252);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				bitExpr(0);
				setState(255);
				match(SOUNDS);
				setState(256);
				match(LIKE);
				setState(257);
				simpleExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(259);
				bitExpr(0);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(260);
					match(NOT);
					}
				}

				setState(263);
				match(LIKE);
				setState(264);
				simpleExpr(0);
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(265);
						match(ESCAPE);
						setState(266);
						simpleExpr(0);
						}
						} 
					}
					setState(271);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
				bitExpr(0);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(273);
					match(NOT);
					}
				}

				setState(276);
				match(REGEXP);
				setState(277);
				simpleExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(279);
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
			setState(283);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(285);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(286);
						match(BIT_INCLUSIVE_OR);
						setState(287);
						bitExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(288);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(289);
						match(BIT_AND);
						setState(290);
						bitExpr(13);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(291);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(292);
						match(SIGNED_LEFT_SHIFT);
						setState(293);
						bitExpr(12);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(294);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(295);
						match(SIGNED_RIGHT_SHIFT);
						setState(296);
						bitExpr(11);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(297);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(298);
						match(PLUS);
						setState(299);
						bitExpr(10);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(300);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(301);
						match(MINUS);
						setState(302);
						bitExpr(9);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(303);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(304);
						match(ASTERISK);
						setState(305);
						bitExpr(8);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(306);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(307);
						match(SLASH);
						setState(308);
						bitExpr(7);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(309);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(310);
						match(DIV);
						setState(311);
						bitExpr(6);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(312);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(313);
						match(MOD);
						setState(314);
						bitExpr(5);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(315);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(316);
						match(MOD_SYM);
						setState(317);
						bitExpr(4);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(318);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(319);
						match(BIT_EXCLUSIVE_OR);
						setState(320);
						bitExpr(3);
						}
						break;
					}
					} 
				}
				setState(325);
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
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(327);
				functionCall();
				}
				break;
			case 3:
				{
				setState(328);
				liter();
				}
				break;
			case 4:
				{
				setState(329);
				match(ID);
				}
				break;
			case 5:
				{
				setState(330);
				match(PLUS);
				setState(331);
				simpleExpr(9);
				}
				break;
			case 6:
				{
				setState(332);
				match(MINUS);
				setState(333);
				simpleExpr(8);
				}
				break;
			case 7:
				{
				setState(334);
				match(UNARY_BIT_COMPLEMENT);
				setState(335);
				simpleExpr(7);
				}
				break;
			case 8:
				{
				setState(336);
				match(NOT_SYM);
				setState(337);
				simpleExpr(6);
				}
				break;
			case 9:
				{
				setState(338);
				match(BINARY);
				setState(339);
				simpleExpr(5);
				}
				break;
			case 10:
				{
				setState(340);
				match(LEFT_PAREN);
				setState(341);
				expr(0);
				setState(342);
				match(RIGHT_PAREN);
				}
				break;
			case 11:
				{
				setState(344);
				match(ROW);
				setState(345);
				match(LEFT_PAREN);
				setState(346);
				simpleExpr(0);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(347);
					match(COMMA);
					setState(348);
					simpleExpr(0);
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354);
				match(RIGHT_PAREN);
				}
				break;
			case 12:
				{
				setState(356);
				subquery();
				}
				break;
			case 13:
				{
				setState(357);
				match(EXISTS);
				setState(358);
				subquery();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(361);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(362);
						match(AND_SYM);
						setState(363);
						simpleExpr(11);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(364);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(365);
						collateClause();
						}
						break;
					}
					} 
				}
				setState(370);
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
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(QUESTION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(374);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(375);
				match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(376);
				match(LEFT_BRACE);
				setState(377);
				match(ID);
				setState(378);
				match(STRING);
				setState(379);
				match(RIGHT_BRACE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(380);
				match(HEX_DIGIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(381);
					match(ID);
					}
				}

				setState(384);
				match(STRING);
				setState(386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(385);
					collateClause();
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(388);
				_la = _input.LA(1);
				if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (DATE - 97)) | (1L << (TIME - 97)) | (1L << (TIMESTAMP - 97)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(389);
				match(STRING);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(390);
					match(ID);
					}
				}

				setState(393);
				match(BIT_NUM);
				setState(395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(394);
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
			setState(399);
			match(COLLATE);
			setState(400);
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
			setState(402);
			match(ID);
			setState(403);
			match(LEFT_PAREN);
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(405);
				expr(0);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(406);
					match(COMMA);
					setState(407);
					expr(0);
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(415);
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
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				caseCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
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
			setState(421);
			match(CASE);
			setState(422);
			simpleExpr(0);
			setState(424); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(423);
				caseWhenComp();
				}
				}
				setState(426); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(428);
				elseResult();
				}
			}

			setState(431);
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
			setState(433);
			match(WHEN);
			setState(434);
			simpleExpr(0);
			setState(435);
			match(THEN);
			setState(436);
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
			setState(438);
			match(CASE);
			setState(440); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(439);
				whenResult();
				}
				}
				setState(442); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(444);
				elseResult();
				}
			}

			setState(447);
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
			setState(449);
			match(WHEN);
			setState(450);
			booleanPrimary(0);
			setState(451);
			match(THEN);
			setState(452);
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
			setState(454);
			match(ELSE);
			setState(455);
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
			setState(457);
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
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(459);
				bitExpr(0);
				}
				break;
			case 2:
				{
				setState(460);
				caseExpress();
				}
				break;
			}
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(463);
				match(AS);
				}
			}

			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(466);
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
			setState(469);
			tableReference();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(470);
				match(COMMA);
				setState(471);
				tableReference();
				}
				}
				setState(476);
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
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(480); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(477);
					tableFactor();
					setState(478);
					joinTable();
					}
					}
					setState(482); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==LEFT_PAREN );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				tableFactor();
				setState(486); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(485);
					joinTable();
					}
					}
					setState(488); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRAIGHT_JOIN) | (1L << INNER) | (1L << CROSS) | (1L << JOIN) | (1L << LEFT) | (1L << RIGHT) | (1L << NATURAL))) != 0) );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
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
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				tableName();
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(494);
					match(PARTITION);
					setState(495);
					itemList();
					}
				}

				setState(502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(499);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(498);
						match(AS);
						}
					}

					setState(501);
					alias();
					}
					break;
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USE || _la==IGNORE) {
					{
					setState(504);
					indexHintList();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				subquery();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(508);
					match(AS);
					}
				}

				setState(511);
				alias();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(513);
				match(LEFT_PAREN);
				setState(514);
				tableReferences();
				setState(515);
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
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(519);
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

				setState(522);
				match(JOIN);
				setState(523);
				tableFactor();
				setState(525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(524);
					joinCondition();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				match(STRAIGHT_JOIN);
				setState(528);
				tableFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				match(STRAIGHT_JOIN);
				setState(530);
				tableFactor();
				setState(531);
				joinCondition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(533);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(534);
					match(OUTER);
					}
				}

				setState(537);
				match(JOIN);
				setState(538);
				tableFactor();
				setState(539);
				joinCondition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(541);
				match(NATURAL);
				setState(545);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INNER:
					{
					setState(542);
					match(INNER);
					}
					break;
				case LEFT:
				case RIGHT:
					{
					setState(543);
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
					setState(544);
					match(OUTER);
					}
					}
					break;
				case JOIN:
					break;
				default:
					break;
				}
				setState(547);
				match(JOIN);
				setState(548);
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
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				match(ON);
				setState(552);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(USING);
				setState(554);
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
			setState(557);
			indexHint();
			setState(562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(558);
					match(COMMA);
					setState(559);
					indexHint();
					}
					} 
				}
				setState(564);
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
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				match(USE);
				setState(566);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FOR) {
					{
					{
					setState(567);
					match(FOR);
					setState(573);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case JOIN:
						{
						setState(568);
						match(JOIN);
						}
						break;
					case ORDER:
						{
						setState(569);
						match(ORDER);
						setState(570);
						match(BY);
						}
						break;
					case GROUP:
						{
						setState(571);
						match(GROUP);
						setState(572);
						match(BY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(579);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(580);
				itemList();
				}
				break;
			case IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				match(IGNORE);
				setState(582);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FOR) {
					{
					{
					setState(583);
					match(FOR);
					setState(589);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case JOIN:
						{
						setState(584);
						match(JOIN);
						}
						break;
					case ORDER:
						{
						setState(585);
						match(ORDER);
						setState(586);
						match(BY);
						}
						break;
					case GROUP:
						{
						setState(587);
						match(GROUP);
						setState(588);
						match(BY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(595);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(596);
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
			setState(599);
			match(DELETE);
			setState(600);
			deleteSpec();
			setState(603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(601);
				fromMulti();
				}
				break;
			case 2:
				{
				setState(602);
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
			setState(605);
			match(FROM);
			setState(606);
			match(ID);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(607);
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
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(610);
				match(ID);
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(611);
					match(T__0);
					}
				}

				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(614);
					match(COMMA);
					setState(615);
					match(ID);
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(616);
						match(T__0);
						}
					}

					}
					}
					setState(623);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(624);
				match(FROM);
				setState(625);
				tableReferences();
				}
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				match(FROM);
				{
				setState(627);
				match(ID);
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(628);
					match(T__0);
					}
				}

				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(631);
					match(COMMA);
					setState(632);
					match(ID);
					setState(634);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(633);
						match(T__0);
						}
					}

					}
					}
					setState(640);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(641);
				match(USING);
				setState(642);
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
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOW_PRIORITY) {
					{
					setState(645);
					match(LOW_PRIORITY);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUICK) {
					{
					setState(648);
					match(QUICK);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(651);
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
			setState(656);
			insertClause();
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(657);
				match(INTO);
				}
			}

			setState(660);
			match(ID);
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(661);
				partitionClause();
				}
			}

			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(664);
				setClause();
				}
				break;
			case SELECT:
			case WITH:
			case VALUES:
			case VALUE:
			case LEFT_PAREN:
				{
				setState(665);
				columnClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(668);
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
			setState(671);
			match(INSERT);
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HIGH_PRIORITY) | (1L << LOW_PRIORITY) | (1L << DELAYED))) != 0)) {
				{
				setState(672);
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
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOW_PRIORITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				match(LOW_PRIORITY);
				}
				break;
			case DELAYED:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				match(DELAYED);
				}
				break;
			case HIGH_PRIORITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(677);
				match(HIGH_PRIORITY);
				setState(678);
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
			setState(681);
			match(PARTITION);
			setState(682);
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
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(684);
				itemListWithEmpty();
				}
			}

			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
			case VALUE:
				{
				setState(687);
				valueClause();
				}
				break;
			case SELECT:
			case WITH:
				{
				setState(688);
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
			setState(691);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(692);
			valueList();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(693);
				match(COMMA);
				setState(694);
				valueList();
				}
				}
				setState(699);
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
			setState(700);
			match(SET);
			setState(701);
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
			setState(703);
			match(ON);
			setState(704);
			match(DUPLICATE);
			setState(705);
			match(KEY);
			setState(706);
			match(UPDATE);
			setState(707);
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
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(709);
				match(LEFT_PAREN);
				setState(710);
				match(RIGHT_PAREN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711);
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
			setState(714);
			assignment();
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(715);
				match(COMMA);
				setState(716);
				assignment();
				}
				}
				setState(721);
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
			setState(722);
			columnName();
			setState(723);
			match(EQ_OR_ASSIGN);
			setState(724);
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
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				match(DEFAULT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
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
			setState(730);
			match(LEFT_PAREN);
			setState(731);
			value();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(732);
				match(COMMA);
				setState(733);
				value();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(739);
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
			setState(741);
			match(UPDATE);
			setState(742);
			updateSpec();
			setState(743);
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
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY) {
				{
				setState(745);
				match(LOW_PRIORITY);
				}
			}

			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(748);
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
			setState(751);
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
		enterRule(_localctx, 90, RULE_select);
		try {
			setState(755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				withClause();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
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
		enterRule(_localctx, 92, RULE_withClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(WITH);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(758);
				match(RECURSIVE);
				}
			}

			setState(761);
			cteClause();
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(762);
				match(COMMA);
				setState(763);
				cteClause();
				}
				}
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(769);
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
		enterRule(_localctx, 94, RULE_cteClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			cteName();
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(772);
				itemList();
				}
			}

			setState(775);
			match(AS);
			setState(776);
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
		enterRule(_localctx, 96, RULE_cteName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
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
		enterRule(_localctx, 98, RULE_unionSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			selectExpression();
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(781);
				match(UNION);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(782);
					match(ALL);
					}
				}

				setState(785);
				selectExpression();
				}
				}
				setState(790);
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
		enterRule(_localctx, 100, RULE_selectExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			selectClause();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(792);
				fromClause();
				}
			}

			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(795);
				whereClause();
				}
			}

			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(798);
				groupByClause();
				}
			}

			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(801);
				orderByClause();
				}
			}

			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(804);
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
		enterRule(_localctx, 102, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(SELECT);
			setState(808);
			selectSpec();
			setState(809);
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
		enterRule(_localctx, 104, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			match(FROM);
			setState(812);
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
		enterRule(_localctx, 106, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(WHERE);
			setState(815);
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
		enterRule(_localctx, 108, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			match(GROUP);
			setState(818);
			match(BY);
			setState(819);
			groupByItem();
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(820);
				match(COMMA);
				setState(821);
				groupByItem();
				}
				}
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(827);
				match(WITH);
				setState(828);
				match(ROLLUP);
				}
			}

			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(831);
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
		enterRule(_localctx, 110, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(HAVING);
			setState(835);
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
		enterRule(_localctx, 112, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(ORDER);
			setState(838);
			match(BY);
			setState(839);
			groupByItem();
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(840);
				match(COMMA);
				setState(841);
				groupByItem();
				}
				}
				setState(846);
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
		enterRule(_localctx, 114, RULE_groupByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(847);
				columnName();
				}
				break;
			case 2:
				{
				setState(848);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(849);
				expr(0);
				}
				break;
			}
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(852);
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
		enterRule(_localctx, 116, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(LIMIT);
			setState(856);
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
		enterRule(_localctx, 118, RULE_rangeClause);
		int _la;
		try {
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(858);
				match(NUMBER);
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(859);
					match(COMMA);
					setState(860);
					match(NUMBER);
					}
					}
					setState(865);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				match(NUMBER);
				setState(867);
				match(OFFSET);
				setState(868);
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
		enterRule(_localctx, 120, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(LEFT_PAREN);
			setState(872);
			unionSelect();
			setState(873);
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
		enterRule(_localctx, 122, RULE_selectExprs);
		int _la;
		try {
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(875);
				match(ASTERISK);
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(876);
					match(COMMA);
					setState(877);
					selectExpr();
					}
					}
					setState(882);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				selectExpr();
				setState(886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(884);
					match(COMMA);
					setState(885);
					match(ASTERISK);
					}
					break;
				}
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(888);
					match(COMMA);
					setState(889);
					selectExpr();
					}
					}
					setState(894);
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
		enterRule(_localctx, 124, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
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
		enterRule(_localctx, 126, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			deleteClause();
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(900);
				whereClause();
				}
			}

			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(903);
				orderByClause();
				}
			}

			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(906);
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
		enterRule(_localctx, 128, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			updateClause();
			setState(910);
			setClause();
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(911);
				whereClause();
				}
			}

			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(914);
				orderByClause();
				}
			}

			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(917);
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
		enterRule(_localctx, 130, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
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
		enterRule(_localctx, 132, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
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
		enterRule(_localctx, 134, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
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
		enterRule(_localctx, 136, RULE_itemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(LEFT_PAREN);
			setState(927);
			item();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(928);
				match(COMMA);
				setState(929);
				item();
				}
				}
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(935);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008e\u03ac\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\5\2\u008e\n"+
		"\2\3\2\5\2\u0091\n\2\3\2\5\2\u0094\n\2\3\2\5\2\u0097\n\2\3\2\5\2\u009a"+
		"\n\2\3\2\5\2\u009d\n\2\3\2\5\2\u00a0\n\2\3\2\5\2\u00a3\n\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00af\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00c0\n\3\f\3\16\3\u00c3\13\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\u00cb\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4\u00da\n\4\f\4\16\4\u00dd\13\4\3\5\3\5\3\6\3\6\5\6"+
		"\u00e3\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ea\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u00f1"+
		"\n\6\f\6\16\6\u00f4\13\6\3\6\3\6\3\6\3\6\5\6\u00fa\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0108\n\6\3\6\3\6\3\6\3\6\7\6\u010e"+
		"\n\6\f\6\16\6\u0111\13\6\3\6\3\6\5\6\u0115\n\6\3\6\3\6\3\6\3\6\5\6\u011b"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7\u0144\n\7\f\7\16\7\u0147\13\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\b\u0160\n\b\f\b\16\b\u0163\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u016a"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\7\b\u0171\n\b\f\b\16\b\u0174\13\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0181\n\t\3\t\3\t\5\t\u0185\n\t\3"+
		"\t\3\t\3\t\5\t\u018a\n\t\3\t\3\t\5\t\u018e\n\t\5\t\u0190\n\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u019b\n\13\f\13\16\13\u019e\13\13"+
		"\5\13\u01a0\n\13\3\13\3\13\3\f\3\f\5\f\u01a6\n\f\3\r\3\r\3\r\6\r\u01ab"+
		"\n\r\r\r\16\r\u01ac\3\r\5\r\u01b0\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\6\17\u01bb\n\17\r\17\16\17\u01bc\3\17\5\17\u01c0\n\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\5\23"+
		"\u01d0\n\23\3\23\5\23\u01d3\n\23\3\23\5\23\u01d6\n\23\3\24\3\24\3\24\7"+
		"\24\u01db\n\24\f\24\16\24\u01de\13\24\3\25\3\25\3\25\6\25\u01e3\n\25\r"+
		"\25\16\25\u01e4\3\25\3\25\6\25\u01e9\n\25\r\25\16\25\u01ea\3\25\5\25\u01ee"+
		"\n\25\3\26\3\26\3\26\5\26\u01f3\n\26\3\26\5\26\u01f6\n\26\3\26\5\26\u01f9"+
		"\n\26\3\26\5\26\u01fc\n\26\3\26\3\26\5\26\u0200\n\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u0208\n\26\3\27\5\27\u020b\n\27\3\27\3\27\3\27\5\27"+
		"\u0210\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u021a\n\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0224\n\27\3\27\3\27\5\27"+
		"\u0228\n\27\3\30\3\30\3\30\3\30\5\30\u022e\n\30\3\31\3\31\3\31\7\31\u0233"+
		"\n\31\f\31\16\31\u0236\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u0240\n\32\7\32\u0242\n\32\f\32\16\32\u0245\13\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u0250\n\32\7\32\u0252\n\32\f\32\16\32"+
		"\u0255\13\32\3\32\5\32\u0258\n\32\3\33\3\33\3\33\3\33\5\33\u025e\n\33"+
		"\3\34\3\34\3\34\5\34\u0263\n\34\3\35\3\35\5\35\u0267\n\35\3\35\3\35\3"+
		"\35\5\35\u026c\n\35\7\35\u026e\n\35\f\35\16\35\u0271\13\35\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u0278\n\35\3\35\3\35\3\35\5\35\u027d\n\35\7\35\u027f"+
		"\n\35\f\35\16\35\u0282\13\35\3\35\3\35\5\35\u0286\n\35\3\36\5\36\u0289"+
		"\n\36\3\36\5\36\u028c\n\36\3\36\5\36\u028f\n\36\5\36\u0291\n\36\3\37\3"+
		"\37\5\37\u0295\n\37\3\37\3\37\5\37\u0299\n\37\3\37\3\37\5\37\u029d\n\37"+
		"\3\37\5\37\u02a0\n\37\3 \3 \5 \u02a4\n \3!\3!\3!\3!\5!\u02aa\n!\3\"\3"+
		"\"\3\"\3#\5#\u02b0\n#\3#\3#\5#\u02b4\n#\3$\3$\3$\3$\7$\u02ba\n$\f$\16"+
		"$\u02bd\13$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\5\'\u02cb\n\'\3(\3"+
		"(\3(\7(\u02d0\n(\f(\16(\u02d3\13(\3)\3)\3)\3)\3*\3*\5*\u02db\n*\3+\3+"+
		"\3+\3+\7+\u02e1\n+\f+\16+\u02e4\13+\3+\3+\3,\3,\3,\3,\3-\5-\u02ed\n-\3"+
		"-\5-\u02f0\n-\3.\3.\3/\3/\5/\u02f6\n/\3\60\3\60\5\60\u02fa\n\60\3\60\3"+
		"\60\3\60\7\60\u02ff\n\60\f\60\16\60\u0302\13\60\3\60\3\60\3\61\3\61\5"+
		"\61\u0308\n\61\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\5\63\u0312\n\63"+
		"\3\63\7\63\u0315\n\63\f\63\16\63\u0318\13\63\3\64\3\64\5\64\u031c\n\64"+
		"\3\64\5\64\u031f\n\64\3\64\5\64\u0322\n\64\3\64\5\64\u0325\n\64\3\64\5"+
		"\64\u0328\n\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\3"+
		"8\38\38\38\78\u0339\n8\f8\168\u033c\138\38\38\58\u0340\n8\38\58\u0343"+
		"\n8\39\39\39\3:\3:\3:\3:\3:\7:\u034d\n:\f:\16:\u0350\13:\3;\3;\3;\5;\u0355"+
		"\n;\3;\5;\u0358\n;\3<\3<\3<\3=\3=\3=\7=\u0360\n=\f=\16=\u0363\13=\3=\3"+
		"=\3=\5=\u0368\n=\3>\3>\3>\3>\3?\3?\3?\7?\u0371\n?\f?\16?\u0374\13?\3?"+
		"\3?\3?\5?\u0379\n?\3?\3?\7?\u037d\n?\f?\16?\u0380\13?\5?\u0382\n?\3@\3"+
		"@\3A\3A\5A\u0388\nA\3A\5A\u038b\nA\3A\5A\u038e\nA\3B\3B\3B\5B\u0393\n"+
		"B\3B\5B\u0396\nB\3B\5B\u0399\nB\3C\3C\3D\3D\3E\3E\3F\3F\3F\3F\7F\u03a5"+
		"\nF\fF\16F\u03a8\13F\3F\3F\3F\2\6\4\6\f\16G\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\2\r\5\2\4\4\34\34\36\36\3\2\n\13"+
		"\3\2WZ\3\2\34\35\3\2~\u0084\3\2ce\3\2:;\3\2>?\3\2DE\3\2MN\3\2$%\2\u0415"+
		"\2\u008d\3\2\2\2\4\u00ae\3\2\2\2\6\u00c4\3\2\2\2\b\u00de\3\2\2\2\n\u011a"+
		"\3\2\2\2\f\u011c\3\2\2\2\16\u0169\3\2\2\2\20\u018f\3\2\2\2\22\u0191\3"+
		"\2\2\2\24\u0194\3\2\2\2\26\u01a5\3\2\2\2\30\u01a7\3\2\2\2\32\u01b3\3\2"+
		"\2\2\34\u01b8\3\2\2\2\36\u01c3\3\2\2\2 \u01c8\3\2\2\2\"\u01cb\3\2\2\2"+
		"$\u01cf\3\2\2\2&\u01d7\3\2\2\2(\u01ed\3\2\2\2*\u0207\3\2\2\2,\u0227\3"+
		"\2\2\2.\u022d\3\2\2\2\60\u022f\3\2\2\2\62\u0257\3\2\2\2\64\u0259\3\2\2"+
		"\2\66\u025f\3\2\2\28\u0285\3\2\2\2:\u0290\3\2\2\2<\u0292\3\2\2\2>\u02a1"+
		"\3\2\2\2@\u02a9\3\2\2\2B\u02ab\3\2\2\2D\u02af\3\2\2\2F\u02b5\3\2\2\2H"+
		"\u02be\3\2\2\2J\u02c1\3\2\2\2L\u02ca\3\2\2\2N\u02cc\3\2\2\2P\u02d4\3\2"+
		"\2\2R\u02da\3\2\2\2T\u02dc\3\2\2\2V\u02e7\3\2\2\2X\u02ec\3\2\2\2Z\u02f1"+
		"\3\2\2\2\\\u02f5\3\2\2\2^\u02f7\3\2\2\2`\u0305\3\2\2\2b\u030c\3\2\2\2"+
		"d\u030e\3\2\2\2f\u0319\3\2\2\2h\u0329\3\2\2\2j\u032d\3\2\2\2l\u0330\3"+
		"\2\2\2n\u0333\3\2\2\2p\u0344\3\2\2\2r\u0347\3\2\2\2t\u0354\3\2\2\2v\u0359"+
		"\3\2\2\2x\u0367\3\2\2\2z\u0369\3\2\2\2|\u0381\3\2\2\2~\u0383\3\2\2\2\u0080"+
		"\u0385\3\2\2\2\u0082\u038f\3\2\2\2\u0084\u039a\3\2\2\2\u0086\u039c\3\2"+
		"\2\2\u0088\u039e\3\2\2\2\u008a\u03a0\3\2\2\2\u008c\u008e\t\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0091\7\5"+
		"\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0094\7\6\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2"+
		"\2\2\u0095\u0097\7\7\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u009a\7\b\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u009d\7\t\2\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\t\3\2\2\u009f\u009e\3\2"+
		"\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u00a3\7\f\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\3\3\2\2\2\u00a4\u00a5\b\3\1\2"+
		"\u00a5\u00a6\7\u0085\2\2\u00a6\u00a7\5\4\3\2\u00a7\u00a8\7\u0086\2\2\u00a8"+
		"\u00af\3\2\2\2\u00a9\u00aa\7U\2\2\u00aa\u00af\5\4\3\5\u00ab\u00ac\7o\2"+
		"\2\u00ac\u00af\5\4\3\4\u00ad\u00af\5\6\4\2\u00ae\u00a4\3\2\2\2\u00ae\u00a9"+
		"\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00c1\3\2\2\2\u00b0"+
		"\u00b1\f\13\2\2\u00b1\u00b2\7S\2\2\u00b2\u00c0\5\4\3\f\u00b3\u00b4\f\n"+
		"\2\2\u00b4\u00b5\7n\2\2\u00b5\u00c0\5\4\3\13\u00b6\u00b7\f\t\2\2\u00b7"+
		"\u00b8\7T\2\2\u00b8\u00c0\5\4\3\n\u00b9\u00ba\f\b\2\2\u00ba\u00bb\7R\2"+
		"\2\u00bb\u00c0\5\4\3\t\u00bc\u00bd\f\7\2\2\u00bd\u00be\7m\2\2\u00be\u00c0"+
		"\5\4\3\b\u00bf\u00b0\3\2\2\2\u00bf\u00b3\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf"+
		"\u00b9\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5"+
		"\b\4\1\2\u00c5\u00c6\5\n\6\2\u00c6\u00db\3\2\2\2\u00c7\u00c8\f\7\2\2\u00c8"+
		"\u00ca\7Q\2\2\u00c9\u00cb\7U\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2"+
		"\2\u00cb\u00cc\3\2\2\2\u00cc\u00da\t\4\2\2\u00cd\u00ce\f\6\2\2\u00ce\u00cf"+
		"\7|\2\2\u00cf\u00da\5\n\6\2\u00d0\u00d1\f\5\2\2\u00d1\u00d2\5\b\5\2\u00d2"+
		"\u00d3\5\n\6\2\u00d3\u00da\3\2\2\2\u00d4\u00d5\f\4\2\2\u00d5\u00d6\5\b"+
		"\5\2\u00d6\u00d7\t\5\2\2\u00d7\u00d8\5z>\2\u00d8\u00da\3\2\2\2\u00d9\u00c7"+
		"\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d4\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\7\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00de\u00df\t\6\2\2\u00df\t\3\2\2\2\u00e0\u00e2\5"+
		"\f\7\2\u00e1\u00e3\7U\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e5\78\2\2\u00e5\u00e6\5z>\2\u00e6\u011b\3\2\2"+
		"\2\u00e7\u00e9\5\f\7\2\u00e8\u00ea\7U\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\78\2\2\u00ec\u00ed\7\u0085\2"+
		"\2\u00ed\u00f2\5\16\b\2\u00ee\u00ef\7\u0089\2\2\u00ef\u00f1\5\16\b\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\u0086\2\2\u00f6"+
		"\u011b\3\2\2\2\u00f7\u00f9\5\f\7\2\u00f8\u00fa\7U\2\2\u00f9\u00f8\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7V\2\2\u00fc"+
		"\u00fd\5\16\b\2\u00fd\u00fe\7R\2\2\u00fe\u00ff\5\n\6\2\u00ff\u011b\3\2"+
		"\2\2\u0100\u0101\5\f\7\2\u0101\u0102\7[\2\2\u0102\u0103\7\\\2\2\u0103"+
		"\u0104\5\16\b\2\u0104\u011b\3\2\2\2\u0105\u0107\5\f\7\2\u0106\u0108\7"+
		"U\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\7\\\2\2\u010a\u010f\5\16\b\2\u010b\u010c\7a\2\2\u010c\u010e\5\16"+
		"\b\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u011b\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0114\5\f"+
		"\7\2\u0113\u0115\7U\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\7b\2\2\u0117\u0118\5\16\b\2\u0118\u011b\3\2"+
		"\2\2\u0119\u011b\5\f\7\2\u011a\u00e0\3\2\2\2\u011a\u00e7\3\2\2\2\u011a"+
		"\u00f7\3\2\2\2\u011a\u0100\3\2\2\2\u011a\u0105\3\2\2\2\u011a\u0112\3\2"+
		"\2\2\u011a\u0119\3\2\2\2\u011b\13\3\2\2\2\u011c\u011d\b\7\1\2\u011d\u011e"+
		"\5\16\b\2\u011e\u0145\3\2\2\2\u011f\u0120\f\17\2\2\u0120\u0121\7q\2\2"+
		"\u0121\u0144\5\f\7\20\u0122\u0123\f\16\2\2\u0123\u0124\7r\2\2\u0124\u0144"+
		"\5\f\7\17\u0125\u0126\f\r\2\2\u0126\u0127\7s\2\2\u0127\u0144\5\f\7\16"+
		"\u0128\u0129\f\f\2\2\u0129\u012a\7t\2\2\u012a\u0144\5\f\7\r\u012b\u012c"+
		"\f\13\2\2\u012c\u012d\7w\2\2\u012d\u0144\5\f\7\f\u012e\u012f\f\n\2\2\u012f"+
		"\u0130\7x\2\2\u0130\u0144\5\f\7\13\u0131\u0132\f\t\2\2\u0132\u0133\7y"+
		"\2\2\u0133\u0144\5\f\7\n\u0134\u0135\f\b\2\2\u0135\u0136\7z\2\2\u0136"+
		"\u0144\5\f\7\t\u0137\u0138\f\7\2\2\u0138\u0139\7]\2\2\u0139\u0144\5\f"+
		"\7\b\u013a\u013b\f\6\2\2\u013b\u013c\7^\2\2\u013c\u0144\5\f\7\7\u013d"+
		"\u013e\f\5\2\2\u013e\u013f\7v\2\2\u013f\u0144\5\f\7\6\u0140\u0141\f\4"+
		"\2\2\u0141\u0142\7u\2\2\u0142\u0144\5\f\7\5\u0143\u011f\3\2\2\2\u0143"+
		"\u0122\3\2\2\2\u0143\u0125\3\2\2\2\u0143\u0128\3\2\2\2\u0143\u012b\3\2"+
		"\2\2\u0143\u012e\3\2\2\2\u0143\u0131\3\2\2\2\u0143\u0134\3\2\2\2\u0143"+
		"\u0137\3\2\2\2\u0143\u013a\3\2\2\2\u0143\u013d\3\2\2\2\u0143\u0140\3\2"+
		"\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\r\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u016a\b\b\1\2\u0149\u016a\5\24\13"+
		"\2\u014a\u016a\5\20\t\2\u014b\u016a\7l\2\2\u014c\u014d\7w\2\2\u014d\u016a"+
		"\5\16\b\13\u014e\u014f\7x\2\2\u014f\u016a\5\16\b\n\u0150\u0151\7p\2\2"+
		"\u0151\u016a\5\16\b\t\u0152\u0153\7o\2\2\u0153\u016a\5\16\b\b\u0154\u0155"+
		"\7_\2\2\u0155\u016a\5\16\b\7\u0156\u0157\7\u0085\2\2\u0157\u0158\5\4\3"+
		"\2\u0158\u0159\7\u0086\2\2\u0159\u016a\3\2\2\2\u015a\u015b\7`\2\2\u015b"+
		"\u015c\7\u0085\2\2\u015c\u0161\5\16\b\2\u015d\u015e\7\u0089\2\2\u015e"+
		"\u0160\5\16\b\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3"+
		"\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0165\7\u0086\2\2\u0165\u016a\3\2\2\2\u0166\u016a\5z>\2\u0167\u0168\7"+
		"P\2\2\u0168\u016a\5z>\2\u0169\u0148\3\2\2\2\u0169\u0149\3\2\2\2\u0169"+
		"\u014a\3\2\2\2\u0169\u014b\3\2\2\2\u0169\u014c\3\2\2\2\u0169\u014e\3\2"+
		"\2\2\u0169\u0150\3\2\2\2\u0169\u0152\3\2\2\2\u0169\u0154\3\2\2\2\u0169"+
		"\u0156\3\2\2\2\u0169\u015a\3\2\2\2\u0169\u0166\3\2\2\2\u0169\u0167\3\2"+
		"\2\2\u016a\u0172\3\2\2\2\u016b\u016c\f\f\2\2\u016c\u016d\7m\2\2\u016d"+
		"\u0171\5\16\b\r\u016e\u016f\f\r\2\2\u016f\u0171\5\22\n\2\u0170\u016b\3"+
		"\2\2\2\u0170\u016e\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\17\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0190\7\u008e"+
		"\2\2\u0176\u0190\7\26\2\2\u0177\u0190\7X\2\2\u0178\u0190\7Y\2\2\u0179"+
		"\u0190\7W\2\2\u017a\u017b\7\u0087\2\2\u017b\u017c\7l\2\2\u017c\u017d\7"+
		"\25\2\2\u017d\u0190\7\u0088\2\2\u017e\u0190\7\30\2\2\u017f\u0181\7l\2"+
		"\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184"+
		"\7\25\2\2\u0183\u0185\5\22\n\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2"+
		"\u0185\u0190\3\2\2\2\u0186\u0187\t\7\2\2\u0187\u0190\7\25\2\2\u0188\u018a"+
		"\7l\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018d\7\31\2\2\u018c\u018e\5\22\n\2\u018d\u018c\3\2\2\2\u018d\u018e\3"+
		"\2\2\2\u018e\u0190\3\2\2\2\u018f\u0175\3\2\2\2\u018f\u0176\3\2\2\2\u018f"+
		"\u0177\3\2\2\2\u018f\u0178\3\2\2\2\u018f\u0179\3\2\2\2\u018f\u017a\3\2"+
		"\2\2\u018f\u017e\3\2\2\2\u018f\u0180\3\2\2\2\u018f\u0186\3\2\2\2\u018f"+
		"\u0189\3\2\2\2\u0190\21\3\2\2\2\u0191\u0192\7\24\2\2\u0192\u0193\7l\2"+
		"\2\u0193\23\3\2\2\2\u0194\u0195\7l\2\2\u0195\u019f\7\u0085\2\2\u0196\u01a0"+
		"\3\2\2\2\u0197\u019c\5\4\3\2\u0198\u0199\7\u0089\2\2\u0199\u019b\5\4\3"+
		"\2\u019a\u0198\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d"+
		"\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u0196\3\2\2\2\u019f"+
		"\u0197\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\7\u0086\2\2\u01a2\25\3"+
		"\2\2\2\u01a3\u01a6\5\34\17\2\u01a4\u01a6\5\30\r\2\u01a5\u01a3\3\2\2\2"+
		"\u01a5\u01a4\3\2\2\2\u01a6\27\3\2\2\2\u01a7\u01a8\7f\2\2\u01a8\u01aa\5"+
		"\16\b\2\u01a9\u01ab\5\32\16\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2"+
		"\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01b0"+
		"\5 \21\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b2\7k\2\2\u01b2\31\3\2\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5\5\16\b\2"+
		"\u01b5\u01b6\7h\2\2\u01b6\u01b7\5\"\22\2\u01b7\33\3\2\2\2\u01b8\u01ba"+
		"\7f\2\2\u01b9\u01bb\5\36\20\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2"+
		"\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u01c0"+
		"\5 \21\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c2\7k\2\2\u01c2\35\3\2\2\2\u01c3\u01c4\7g\2\2\u01c4\u01c5\5\6\4\2"+
		"\u01c5\u01c6\7h\2\2\u01c6\u01c7\5\"\22\2\u01c7\37\3\2\2\2\u01c8\u01c9"+
		"\7j\2\2\u01c9\u01ca\5\"\22\2\u01ca!\3\2\2\2\u01cb\u01cc\5\4\3\2\u01cc"+
		"#\3\2\2\2\u01cd\u01d0\5\f\7\2\u01ce\u01d0\5\26\f\2\u01cf\u01cd\3\2\2\2"+
		"\u01cf\u01ce\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01d3\7+\2\2\u01d2\u01d1"+
		"\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d6\5~@\2\u01d5"+
		"\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6%\3\2\2\2\u01d7\u01dc\5(\25\2"+
		"\u01d8\u01d9\7\u0089\2\2\u01d9\u01db\5(\25\2\u01da\u01d8\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\'\3\2\2\2"+
		"\u01de\u01dc\3\2\2\2\u01df\u01e0\5*\26\2\u01e0\u01e1\5,\27\2\u01e1\u01e3"+
		"\3\2\2\2\u01e2\u01df\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01ee\3\2\2\2\u01e6\u01e8\5*\26\2\u01e7\u01e9\5,"+
		"\27\2\u01e8\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ee\5*\26\2\u01ed\u01e2\3\2"+
		"\2\2\u01ed\u01e6\3\2\2\2\u01ed\u01ec\3\2\2\2\u01ee)\3\2\2\2\u01ef\u01f2"+
		"\5\u0086D\2\u01f0\u01f1\7 \2\2\u01f1\u01f3\5\u008aF\2\u01f2\u01f0\3\2"+
		"\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f8\3\2\2\2\u01f4\u01f6\7+\2\2\u01f5"+
		"\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\5~"+
		"@\2\u01f8\u01f5\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa"+
		"\u01fc\5\60\31\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0208\3"+
		"\2\2\2\u01fd\u01ff\5z>\2\u01fe\u0200\7+\2\2\u01ff\u01fe\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\5~@\2\u0202\u0208\3\2\2"+
		"\2\u0203\u0204\7\u0085\2\2\u0204\u0205\5&\24\2\u0205\u0206\7\u0086\2\2"+
		"\u0206\u0208\3\2\2\2\u0207\u01ef\3\2\2\2\u0207\u01fd\3\2\2\2\u0207\u0203"+
		"\3\2\2\2\u0208+\3\2\2\2\u0209\u020b\t\b\2\2\u020a\u0209\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\7<\2\2\u020d\u020f\5*\26"+
		"\2\u020e\u0210\5.\30\2\u020f\u020e\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0228"+
		"\3\2\2\2\u0211\u0212\7\6\2\2\u0212\u0228\5*\26\2\u0213\u0214\7\6\2\2\u0214"+
		"\u0215\5*\26\2\u0215\u0216\5.\30\2\u0216\u0228\3\2\2\2\u0217\u0219\t\t"+
		"\2\2\u0218\u021a\7@\2\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021b\u021c\7<\2\2\u021c\u021d\5*\26\2\u021d\u021e\5.\30"+
		"\2\u021e\u0228\3\2\2\2\u021f\u0223\7A\2\2\u0220\u0224\7:\2\2\u0221\u0222"+
		"\t\t\2\2\u0222\u0224\7@\2\2\u0223\u0220\3\2\2\2\u0223\u0221\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\7<\2\2\u0226\u0228\5*\26"+
		"\2\u0227\u020a\3\2\2\2\u0227\u0211\3\2\2\2\u0227\u0213\3\2\2\2\u0227\u0217"+
		"\3\2\2\2\u0227\u021f\3\2\2\2\u0228-\3\2\2\2\u0229\u022a\7=\2\2\u022a\u022e"+
		"\5\4\3\2\u022b\u022c\7B\2\2\u022c\u022e\5\u008aF\2\u022d\u0229\3\2\2\2"+
		"\u022d\u022b\3\2\2\2\u022e/\3\2\2\2\u022f\u0234\5\62\32\2\u0230\u0231"+
		"\7\u0089\2\2\u0231\u0233\5\62\32\2\u0232\u0230\3\2\2\2\u0233\u0236\3\2"+
		"\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\61\3\2\2\2\u0236\u0234"+
		"\3\2\2\2\u0237\u0238\7C\2\2\u0238\u0243\t\n\2\2\u0239\u023f\7\61\2\2\u023a"+
		"\u0240\7<\2\2\u023b\u023c\7,\2\2\u023c\u0240\7#\2\2\u023d\u023e\7\"\2"+
		"\2\u023e\u0240\7#\2\2\u023f\u023a\3\2\2\2\u023f\u023b\3\2\2\2\u023f\u023d"+
		"\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u0239\3\2\2\2\u0242\u0245\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u0243\3\2"+
		"\2\2\u0246\u0258\5\u008aF\2\u0247\u0248\7F\2\2\u0248\u0253\t\n\2\2\u0249"+
		"\u024f\7\61\2\2\u024a\u0250\7<\2\2\u024b\u024c\7,\2\2\u024c\u0250\7#\2"+
		"\2\u024d\u024e\7\"\2\2\u024e\u0250\7#\2\2\u024f\u024a\3\2\2\2\u024f\u024b"+
		"\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u0249\3\2\2\2\u0252"+
		"\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2"+
		"\2\2\u0255\u0253\3\2\2\2\u0256\u0258\5\u008aF\2\u0257\u0237\3\2\2\2\u0257"+
		"\u0247\3\2\2\2\u0258\63\3\2\2\2\u0259\u025a\7J\2\2\u025a\u025d\5:\36\2"+
		"\u025b\u025e\58\35\2\u025c\u025e\5\66\34\2\u025d\u025b\3\2\2\2\u025d\u025c"+
		"\3\2\2\2\u025e\65\3\2\2\2\u025f\u0260\7\37\2\2\u0260\u0262\7l\2\2\u0261"+
		"\u0263\5B\"\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263\67\3\2\2\2"+
		"\u0264\u0266\7l\2\2\u0265\u0267\7\3\2\2\u0266\u0265\3\2\2\2\u0266\u0267"+
		"\3\2\2\2\u0267\u026f\3\2\2\2\u0268\u0269\7\u0089\2\2\u0269\u026b\7l\2"+
		"\2\u026a\u026c\7\3\2\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e"+
		"\3\2\2\2\u026d\u0268\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0272\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0273\7\37"+
		"\2\2\u0273\u0286\5&\24\2\u0274\u0275\7\37\2\2\u0275\u0277\7l\2\2\u0276"+
		"\u0278\7\3\2\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0280\3\2"+
		"\2\2\u0279\u027a\7\u0089\2\2\u027a\u027c\7l\2\2\u027b\u027d\7\3\2\2\u027c"+
		"\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u0279\3\2"+
		"\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0283\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0284\7B\2\2\u0284\u0286\5&\24"+
		"\2\u0285\u0264\3\2\2\2\u0285\u0274\3\2\2\2\u02869\3\2\2\2\u0287\u0289"+
		"\7\22\2\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u0291\3\2\2\2"+
		"\u028a\u028c\7K\2\2\u028b\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u0291"+
		"\3\2\2\2\u028d\u028f\7F\2\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0291\3\2\2\2\u0290\u0288\3\2\2\2\u0290\u028b\3\2\2\2\u0290\u028e\3\2"+
		"\2\2\u0291;\3\2\2\2\u0292\u0294\5> \2\u0293\u0295\7/\2\2\u0294\u0293\3"+
		"\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0298\7l\2\2\u0297"+
		"\u0299\5B\"\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029c\3\2"+
		"\2\2\u029a\u029d\5H%\2\u029b\u029d\5D#\2\u029c\u029a\3\2\2\2\u029c\u029b"+
		"\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u02a0\5J&\2\u029f\u029e\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0=\3\2\2\2\u02a1\u02a3\7L\2\2\u02a2\u02a4\5@!\2\u02a3"+
		"\u02a2\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4?\3\2\2\2\u02a5\u02aa\7\22\2\2"+
		"\u02a6\u02aa\7\23\2\2\u02a7\u02a8\7\5\2\2\u02a8\u02aa\7F\2\2\u02a9\u02a5"+
		"\3\2\2\2\u02a9\u02a6\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aaA\3\2\2\2\u02ab"+
		"\u02ac\7 \2\2\u02ac\u02ad\5\u008aF\2\u02adC\3\2\2\2\u02ae\u02b0\5L\'\2"+
		"\u02af\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02b4"+
		"\5F$\2\u02b2\u02b4\5\\/\2\u02b3\u02b1\3\2\2\2\u02b3\u02b2\3\2\2\2\u02b4"+
		"E\3\2\2\2\u02b5\u02b6\t\13\2\2\u02b6\u02bb\5T+\2\u02b7\u02b8\7\u0089\2"+
		"\2\u02b8\u02ba\5T+\2\u02b9\u02b7\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9"+
		"\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bcG\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be"+
		"\u02bf\7\60\2\2\u02bf\u02c0\5N(\2\u02c0I\3\2\2\2\u02c1\u02c2\7=\2\2\u02c2"+
		"\u02c3\7O\2\2\u02c3\u02c4\7E\2\2\u02c4\u02c5\7\62\2\2\u02c5\u02c6\5N("+
		"\2\u02c6K\3\2\2\2\u02c7\u02c8\7\u0085\2\2\u02c8\u02cb\7\u0086\2\2\u02c9"+
		"\u02cb\5\u008aF\2\u02ca\u02c7\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cbM\3\2\2"+
		"\2\u02cc\u02d1\5P)\2\u02cd\u02ce\7\u0089\2\2\u02ce\u02d0\5P)\2\u02cf\u02cd"+
		"\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"O\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d5\5\u0088E\2\u02d5\u02d6\7~\2"+
		"\2\u02d6\u02d7\5R*\2\u02d7Q\3\2\2\2\u02d8\u02db\7I\2\2\u02d9\u02db\5\4"+
		"\3\2\u02da\u02d8\3\2\2\2\u02da\u02d9\3\2\2\2\u02dbS\3\2\2\2\u02dc\u02dd"+
		"\7\u0085\2\2\u02dd\u02e2\5R*\2\u02de\u02df\7\u0089\2\2\u02df\u02e1\5R"+
		"*\2\u02e0\u02de\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5\u02e6\7\u0086"+
		"\2\2\u02e6U\3\2\2\2\u02e7\u02e8\7\62\2\2\u02e8\u02e9\5X-\2\u02e9\u02ea"+
		"\5&\24\2\u02eaW\3\2\2\2\u02eb\u02ed\7\22\2\2\u02ec\u02eb\3\2\2\2\u02ec"+
		"\u02ed\3\2\2\2\u02ed\u02ef\3\2\2\2\u02ee\u02f0\7F\2\2\u02ef\u02ee\3\2"+
		"\2\2\u02ef\u02f0\3\2\2\2\u02f0Y\3\2\2\2\u02f1\u02f2\7l\2\2\u02f2[\3\2"+
		"\2\2\u02f3\u02f6\5^\60\2\u02f4\u02f6\5d\63\2\u02f5\u02f3\3\2\2\2\u02f5"+
		"\u02f4\3\2\2\2\u02f6]\3\2\2\2\u02f7\u02f9\7&\2\2\u02f8\u02fa\7\'\2\2\u02f9"+
		"\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u0300\5`"+
		"\61\2\u02fc\u02fd\7\u0089\2\2\u02fd\u02ff\5`\61\2\u02fe\u02fc\3\2\2\2"+
		"\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303"+
		"\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0304\5d\63\2\u0304_\3\2\2\2\u0305"+
		"\u0307\5b\62\2\u0306\u0308\5\u008aF\2\u0307\u0306\3\2\2\2\u0307\u0308"+
		"\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\7+\2\2\u030a\u030b\5z>\2\u030b"+
		"a\3\2\2\2\u030c\u030d\7l\2\2\u030dc\3\2\2\2\u030e\u0316\5f\64\2\u030f"+
		"\u0311\7H\2\2\u0310\u0312\7\34\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2"+
		"\2\2\u0312\u0313\3\2\2\2\u0313\u0315\5f\64\2\u0314\u030f\3\2\2\2\u0315"+
		"\u0318\3\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317e\3\2\2\2"+
		"\u0318\u0316\3\2\2\2\u0319\u031b\5h\65\2\u031a\u031c\5j\66\2\u031b\u031a"+
		"\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031e\3\2\2\2\u031d\u031f\5l\67\2\u031e"+
		"\u031d\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0321\3\2\2\2\u0320\u0322\5n"+
		"8\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0324\3\2\2\2\u0323"+
		"\u0325\5r:\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0327\3\2\2"+
		"\2\u0326\u0328\5v<\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328g\3"+
		"\2\2\2\u0329\u032a\7\33\2\2\u032a\u032b\5\2\2\2\u032b\u032c\5|?\2\u032c"+
		"i\3\2\2\2\u032d\u032e\7\37\2\2\u032e\u032f\5&\24\2\u032fk\3\2\2\2\u0330"+
		"\u0331\7!\2\2\u0331\u0332\5\4\3\2\u0332m\3\2\2\2\u0333\u0334\7\"\2\2\u0334"+
		"\u0335\7#\2\2\u0335\u033a\5t;\2\u0336\u0337\7\u0089\2\2\u0337\u0339\5"+
		"t;\2\u0338\u0336\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2\2\2\u033a"+
		"\u033b\3\2\2\2\u033b\u033f\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u033e\7&"+
		"\2\2\u033e\u0340\7(\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340"+
		"\u0342\3\2\2\2\u0341\u0343\5p9\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2\2"+
		"\2\u0343o\3\2\2\2\u0344\u0345\7)\2\2\u0345\u0346\5\4\3\2\u0346q\3\2\2"+
		"\2\u0347\u0348\7,\2\2\u0348\u0349\7#\2\2\u0349\u034e\5t;\2\u034a\u034b"+
		"\7\u0089\2\2\u034b\u034d\5t;\2\u034c\u034a\3\2\2\2\u034d\u0350\3\2\2\2"+
		"\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034fs\3\2\2\2\u0350\u034e\3"+
		"\2\2\2\u0351\u0355\5\u0088E\2\u0352\u0355\7\26\2\2\u0353\u0355\5\4\3\2"+
		"\u0354\u0351\3\2\2\2\u0354\u0352\3\2\2\2\u0354\u0353\3\2\2\2\u0355\u0357"+
		"\3\2\2\2\u0356\u0358\t\f\2\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2\2\2\u0358"+
		"u\3\2\2\2\u0359\u035a\7-\2\2\u035a\u035b\5x=\2\u035bw\3\2\2\2\u035c\u0361"+
		"\7\26\2\2\u035d\u035e\7\u0089\2\2\u035e\u0360\7\26\2\2\u035f\u035d\3\2"+
		"\2\2\u0360\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362"+
		"\u0368\3\2\2\2\u0363\u0361\3\2\2\2\u0364\u0365\7\26\2\2\u0365\u0366\7"+
		".\2\2\u0366\u0368\7\26\2\2\u0367\u035c\3\2\2\2\u0367\u0364\3\2\2\2\u0368"+
		"y\3\2\2\2\u0369\u036a\7\u0085\2\2\u036a\u036b\5d\63\2\u036b\u036c\7\u0086"+
		"\2\2\u036c{\3\2\2\2\u036d\u0372\7y\2\2\u036e\u036f\7\u0089\2\2\u036f\u0371"+
		"\5$\23\2\u0370\u036e\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372"+
		"\u0373\3\2\2\2\u0373\u0382\3\2\2\2\u0374\u0372\3\2\2\2\u0375\u0378\5$"+
		"\23\2\u0376\u0377\7\u0089\2\2\u0377\u0379\7y\2\2\u0378\u0376\3\2\2\2\u0378"+
		"\u0379\3\2\2\2\u0379\u037e\3\2\2\2\u037a\u037b\7\u0089\2\2\u037b\u037d"+
		"\5$\23\2\u037c\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e"+
		"\u037f\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u036d\3\2"+
		"\2\2\u0381\u0375\3\2\2\2\u0382}\3\2\2\2\u0383\u0384\7l\2\2\u0384\177\3"+
		"\2\2\2\u0385\u0387\5\64\33\2\u0386\u0388\5l\67\2\u0387\u0386\3\2\2\2\u0387"+
		"\u0388\3\2\2\2\u0388\u038a\3\2\2\2\u0389\u038b\5r:\2\u038a\u0389\3\2\2"+
		"\2\u038a\u038b\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u038e\5v<\2\u038d\u038c"+
		"\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0081\3\2\2\2\u038f\u0390\5V,\2\u0390"+
		"\u0392\5H%\2\u0391\u0393\5l\67\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2"+
		"\2\u0393\u0395\3\2\2\2\u0394\u0396\5r:\2\u0395\u0394\3\2\2\2\u0395\u0396"+
		"\3\2\2\2\u0396\u0398\3\2\2\2\u0397\u0399\5v<\2\u0398\u0397\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399\u0083\3\2\2\2\u039a\u039b\7l\2\2\u039b\u0085\3\2"+
		"\2\2\u039c\u039d\7l\2\2\u039d\u0087\3\2\2\2\u039e\u039f\7l\2\2\u039f\u0089"+
		"\3\2\2\2\u03a0\u03a1\7\u0085\2\2\u03a1\u03a6\5Z.\2\u03a2\u03a3\7\u0089"+
		"\2\2\u03a3\u03a5\5Z.\2\u03a4\u03a2\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4"+
		"\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9"+
		"\u03aa\7\u0086\2\2\u03aa\u008b\3\2\2\2}\u008d\u0090\u0093\u0096\u0099"+
		"\u009c\u009f\u00a2\u00ae\u00bf\u00c1\u00ca\u00d9\u00db\u00e2\u00e9\u00f2"+
		"\u00f9\u0107\u010f\u0114\u011a\u0143\u0145\u0161\u0169\u0170\u0172\u0180"+
		"\u0184\u0189\u018d\u018f\u019c\u019f\u01a5\u01ac\u01af\u01bc\u01bf\u01cf"+
		"\u01d2\u01d5\u01dc\u01e4\u01ea\u01ed\u01f2\u01f5\u01f8\u01fb\u01ff\u0207"+
		"\u020a\u020f\u0219\u0223\u0227\u022d\u0234\u023f\u0243\u024f\u0253\u0257"+
		"\u025d\u0262\u0266\u026b\u026f\u0277\u027c\u0280\u0285\u0288\u028b\u028e"+
		"\u0290\u0294\u0298\u029c\u029f\u02a3\u02a9\u02af\u02b3\u02bb\u02ca\u02d1"+
		"\u02da\u02e2\u02ec\u02ef\u02f5\u02f9\u0300\u0307\u0311\u0316\u031b\u031e"+
		"\u0321\u0324\u0327\u033a\u033f\u0342\u034e\u0354\u0357\u0361\u0367\u0372"+
		"\u0378\u037e\u0381\u0387\u038a\u038d\u0392\u0395\u0398\u03a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}