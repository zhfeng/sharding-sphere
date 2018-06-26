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
		WHERE=31, GROUP=32, BY=33, ASC=34, DESC=35, WITH=36, ROLLUP=37, HAVING=38, 
		WINDOW=39, AS=40, ORDER=41, LIMIT=42, OFFSET=43, INTO=44, SET=45, FOR=46, 
		UPDATE=47, SHARE=48, OF=49, NOWAIT=50, LOCKED=51, LOCK=52, IN=53, MODE=54, 
		INNER=55, CROSS=56, JOIN=57, ON=58, LEFT=59, RIGHT=60, OUTER=61, NATURAL=62, 
		USING=63, USE=64, INDEX=65, KEY=66, IGNORE=67, FORCE=68, UNION=69, DEFAULT=70, 
		DELETE=71, QUICK=72, INSERT=73, VALUES=74, VALUE=75, DUPLICATE=76, EXISTS=77, 
		IS=78, AND=79, OR=80, XOR=81, NOT=82, BETWEEN=83, NULL=84, TRUE=85, FALSE=86, 
		UNKNOWN=87, SOUNDS=88, LIKE=89, DIV=90, MOD=91, BINARY=92, ROW=93, ESCAPE=94, 
		REGEXP=95, DATE=96, TIME=97, TIMESTAMP=98, ID=99, AND_SYM=100, OR_SYM=101, 
		NOT_SYM=102, SAFE_EQ=103, UNARY_BIT_COMPLEMENT=104, BIT_INCLUSIVE_OR=105, 
		BIT_AND=106, SIGNED_LEFT_SHIFT=107, SIGNED_RIGHT_SHIFT=108, BIT_EXCLUSIVE_OR=109, 
		MOD_SYM=110, ADD_OP=111, SUB_OP=112, MUL_OP=113, DIV_OP=114, DOT=115, 
		EQ=116, EQ_OR_ASSIGN=117, NEQ=118, NEQ_SYM=119, GT=120, GTE=121, LT=122, 
		LTE=123, LEFT_PAREN=124, RIGHT_PAREN=125, LEFT_BRACE=126, RIGHT_BRACE=127, 
		COMMA=128, DOUBLE_QUOTA=129, SINGLE_QUOTA=130, BACK_QUOTA=131, UL_=132;
	public static final int
		RULE_selectSpec = 0, RULE_expr = 1, RULE_booleanPrimary = 2, RULE_comparisonOperator = 3, 
		RULE_predicate = 4, RULE_bitExpr = 5, RULE_simpleExpr = 6, RULE_liter = 7, 
		RULE_collateClause = 8, RULE_functionCall = 9, RULE_tableReferences = 10, 
		RULE_tableReference = 11, RULE_tableFactor = 12, RULE_alias = 13, RULE_joinTable = 14, 
		RULE_joinCondition = 15, RULE_indexHintList = 16, RULE_indexHint = 17, 
		RULE_deleteClause = 18, RULE_fromSingle = 19, RULE_fromMulti = 20, RULE_deleteSpec = 21, 
		RULE_insert = 22, RULE_insertClause = 23, RULE_insertSpec = 24, RULE_partitionClause = 25, 
		RULE_columnClause = 26, RULE_valueClause = 27, RULE_setClause = 28, RULE_onDuplicateClause = 29, 
		RULE_itemListWithEmpty = 30, RULE_assignmentList = 31, RULE_assignment = 32, 
		RULE_value = 33, RULE_valueList = 34, RULE_updateClause = 35, RULE_updateSpec = 36, 
		RULE_item = 37, RULE_select = 38, RULE_selectExpression = 39, RULE_selectClause = 40, 
		RULE_fromClause = 41, RULE_whereClause = 42, RULE_groupByClause = 43, 
		RULE_havingClause = 44, RULE_orderByClause = 45, RULE_groupByItem = 46, 
		RULE_limitClause = 47, RULE_rangeClause = 48, RULE_subquery = 49, RULE_selectExpr = 50, 
		RULE_delete = 51, RULE_update = 52, RULE_schemaName = 53, RULE_tableName = 54, 
		RULE_columnName = 55, RULE_itemList = 56;
	public static final String[] ruleNames = {
		"selectSpec", "expr", "booleanPrimary", "comparisonOperator", "predicate", 
		"bitExpr", "simpleExpr", "liter", "collateClause", "functionCall", "tableReferences", 
		"tableReference", "tableFactor", "alias", "joinTable", "joinCondition", 
		"indexHintList", "indexHint", "deleteClause", "fromSingle", "fromMulti", 
		"deleteSpec", "insert", "insertClause", "insertSpec", "partitionClause", 
		"columnClause", "valueClause", "setClause", "onDuplicateClause", "itemListWithEmpty", 
		"assignmentList", "assignment", "value", "valueList", "updateClause", 
		"updateSpec", "item", "select", "selectExpression", "selectClause", "fromClause", 
		"whereClause", "groupByClause", "havingClause", "orderByClause", "groupByItem", 
		"limitClause", "rangeClause", "subquery", "selectExpr", "delete", "update", 
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
		null, null, null, null, "'&&'", "'||'", "'!'", "'<=>'", "'~'", "'|'", 
		"'&'", "'<<'", "'>>'", "'^'", "'%'", "'+'", "'-'", "'*'", "'/'", "'.'", 
		"'=='", "'='", "'!='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'('", "')'", 
		"'{'", "'}'", "','", "'\"'", "'''", "'`'", "'_'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "DISTINCTROW", "HIGH_PRIORITY", "STRAIGHT_JOIN", "SQL_SMALL_RESULT", 
		"SQL_BIG_RESULT", "SQL_BUFFER_RESULT", "SQL_CACHE", "SQL_NO_CACHE", "SQL_CALC_FOUND_ROWS", 
		"OUTFILE", "CHARACTER", "DUMPFILE", "SKIP_", "OJ", "LOW_PRIORITY", "DELAYED", 
		"COLLATE", "STRING", "NUMBER", "EXP", "HEX_DIGIT", "BIT_NUM", "WS", "SELECT", 
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
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(114);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(117);
				match(HIGH_PRIORITY);
				}
				break;
			}
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(120);
				match(STRAIGHT_JOIN);
				}
				break;
			}
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(123);
				match(SQL_SMALL_RESULT);
				}
				break;
			}
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(126);
				match(SQL_BIG_RESULT);
				}
				break;
			}
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(129);
				match(SQL_BUFFER_RESULT);
				}
				break;
			}
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(132);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(135);
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
		public TerminalNode NOT() { return getToken(MySQLDMLParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(139);
				match(NOT);
				setState(140);
				expr(3);
				}
				break;
			case 2:
				{
				setState(141);
				match(NOT_SYM);
				setState(142);
				expr(2);
				}
				break;
			case 3:
				{
				setState(143);
				booleanPrimary(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(147);
						match(OR);
						setState(148);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(150);
						match(OR_SYM);
						setState(151);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(153);
						match(XOR);
						setState(154);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(156);
						match(AND);
						setState(157);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(159);
						match(AND_SYM);
						setState(160);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(165);
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
			setState(167);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(187);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(169);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(170);
						match(IS);
						setState(172);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(171);
							match(NOT);
							}
						}

						setState(174);
						_la = _input.LA(1);
						if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (NULL - 84)) | (1L << (TRUE - 84)) | (1L << (FALSE - 84)) | (1L << (UNKNOWN - 84)))) != 0)) ) {
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
						setState(175);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(176);
						match(SAFE_EQ);
						setState(177);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(178);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(179);
						comparisonOperator();
						setState(180);
						predicate();
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(182);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(183);
						comparisonOperator();
						setState(184);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(185);
						subquery();
						}
						break;
					}
					} 
				}
				setState(191);
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
			setState(192);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (EQ_OR_ASSIGN - 117)) | (1L << (NEQ - 117)) | (1L << (NEQ_SYM - 117)) | (1L << (GT - 117)) | (1L << (GTE - 117)) | (1L << (LT - 117)) | (1L << (LTE - 117)))) != 0)) ) {
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
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(MySQLDMLParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLDMLParser.NOT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MySQLDMLParser.LEFT_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
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
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				bitExpr(0);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(195);
					match(NOT);
					}
				}

				setState(198);
				match(IN);
				setState(199);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				bitExpr(0);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(202);
					match(NOT);
					}
				}

				setState(205);
				match(IN);
				setState(206);
				match(LEFT_PAREN);
				setState(207);
				expr(0);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(208);
					match(COMMA);
					setState(209);
					expr(0);
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				bitExpr(0);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(218);
					match(NOT);
					}
				}

				setState(221);
				match(BETWEEN);
				setState(222);
				bitExpr(0);
				setState(223);
				match(AND);
				setState(224);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				bitExpr(0);
				setState(227);
				match(SOUNDS);
				setState(228);
				match(LIKE);
				setState(229);
				bitExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
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
				match(LIKE);
				setState(236);
				simpleExpr(0);
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(237);
						match(ESCAPE);
						setState(238);
						simpleExpr(0);
						}
						} 
					}
					setState(243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				bitExpr(0);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(245);
					match(NOT);
					}
				}

				setState(248);
				match(REGEXP);
				setState(249);
				bitExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
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
		public TerminalNode ADD_OP() { return getToken(MySQLDMLParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(MySQLDMLParser.SUB_OP, 0); }
		public TerminalNode MUL_OP() { return getToken(MySQLDMLParser.MUL_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(MySQLDMLParser.DIV_OP, 0); }
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
			setState(255);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(295);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(293);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(257);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(258);
						match(BIT_INCLUSIVE_OR);
						setState(259);
						bitExpr(14);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(260);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(261);
						match(BIT_AND);
						setState(262);
						bitExpr(13);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(263);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(264);
						match(SIGNED_LEFT_SHIFT);
						setState(265);
						bitExpr(12);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(266);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(267);
						match(SIGNED_RIGHT_SHIFT);
						setState(268);
						bitExpr(11);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(269);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(270);
						match(ADD_OP);
						setState(271);
						bitExpr(10);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(272);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(273);
						match(SUB_OP);
						setState(274);
						bitExpr(9);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(275);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(276);
						match(MUL_OP);
						setState(277);
						bitExpr(8);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(278);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(279);
						match(DIV_OP);
						setState(280);
						bitExpr(7);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(281);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(282);
						match(DIV);
						setState(283);
						bitExpr(6);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(284);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(285);
						match(MOD);
						setState(286);
						bitExpr(5);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(287);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(288);
						match(MOD_SYM);
						setState(289);
						bitExpr(4);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(290);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(291);
						match(BIT_EXCLUSIVE_OR);
						setState(292);
						bitExpr(3);
						}
						break;
					}
					} 
				}
				setState(297);
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
		public TerminalNode ADD_OP() { return getToken(MySQLDMLParser.ADD_OP, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode SUB_OP() { return getToken(MySQLDMLParser.SUB_OP, 0); }
		public TerminalNode UNARY_BIT_COMPLEMENT() { return getToken(MySQLDMLParser.UNARY_BIT_COMPLEMENT, 0); }
		public TerminalNode NOT_SYM() { return getToken(MySQLDMLParser.NOT_SYM, 0); }
		public TerminalNode BINARY() { return getToken(MySQLDMLParser.BINARY, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(MySQLDMLParser.LEFT_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(299);
				functionCall();
				}
				break;
			case 3:
				{
				setState(300);
				liter();
				}
				break;
			case 4:
				{
				setState(301);
				match(ID);
				}
				break;
			case 5:
				{
				setState(302);
				match(ADD_OP);
				setState(303);
				simpleExpr(9);
				}
				break;
			case 6:
				{
				setState(304);
				match(SUB_OP);
				setState(305);
				simpleExpr(8);
				}
				break;
			case 7:
				{
				setState(306);
				match(UNARY_BIT_COMPLEMENT);
				setState(307);
				simpleExpr(7);
				}
				break;
			case 8:
				{
				setState(308);
				match(NOT_SYM);
				setState(309);
				simpleExpr(6);
				}
				break;
			case 9:
				{
				setState(310);
				match(BINARY);
				setState(311);
				simpleExpr(5);
				}
				break;
			case 10:
				{
				setState(312);
				match(LEFT_PAREN);
				setState(313);
				expr(0);
				setState(314);
				match(RIGHT_PAREN);
				}
				break;
			case 11:
				{
				setState(316);
				match(ROW);
				setState(317);
				match(LEFT_PAREN);
				setState(318);
				expr(0);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(319);
					match(COMMA);
					setState(320);
					expr(0);
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(326);
				match(RIGHT_PAREN);
				}
				break;
			case 12:
				{
				setState(328);
				subquery();
				}
				break;
			case 13:
				{
				setState(329);
				match(EXISTS);
				setState(330);
				subquery();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(338);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(333);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(334);
						match(AND_SYM);
						setState(335);
						simpleExpr(11);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(336);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(337);
						collateClause();
						}
						break;
					}
					} 
				}
				setState(342);
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
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(TRUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				match(FALSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(347);
				match(LEFT_BRACE);
				setState(348);
				match(ID);
				setState(349);
				match(STRING);
				setState(350);
				match(RIGHT_BRACE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
				match(HEX_DIGIT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(352);
					match(ID);
					}
				}

				setState(355);
				match(STRING);
				setState(357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(356);
					collateClause();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(359);
				_la = _input.LA(1);
				if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (DATE - 96)) | (1L << (TIME - 96)) | (1L << (TIMESTAMP - 96)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(360);
				match(STRING);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(361);
					match(ID);
					}
				}

				setState(364);
				match(BIT_NUM);
				setState(366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(365);
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
			setState(370);
			match(COLLATE);
			setState(371);
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
			setState(373);
			match(ID);
			setState(374);
			match(LEFT_PAREN);
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(376);
				expr(0);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(377);
					match(COMMA);
					setState(378);
					expr(0);
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(386);
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
		enterRule(_localctx, 20, RULE_tableReferences);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			tableReference();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(389);
				match(COMMA);
				setState(390);
				tableReference();
				}
				}
				setState(395);
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
		enterRule(_localctx, 22, RULE_tableReference);
		int _la;
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(396);
					tableFactor();
					setState(397);
					joinTable();
					}
					}
					setState(401); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID || _la==LEFT_PAREN );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				tableFactor();
				setState(405); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(404);
					joinTable();
					}
					}
					setState(407); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRAIGHT_JOIN) | (1L << INNER) | (1L << CROSS) | (1L << JOIN) | (1L << LEFT) | (1L << RIGHT) | (1L << NATURAL))) != 0) );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
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
		enterRule(_localctx, 24, RULE_tableFactor);
		int _la;
		try {
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				tableName();
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(413);
					match(PARTITION);
					setState(414);
					itemList();
					}
				}

				setState(421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(417);
						match(AS);
						}
					}

					setState(420);
					alias();
					}
					break;
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USE || _la==IGNORE) {
					{
					setState(423);
					indexHintList();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				subquery();
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(427);
					match(AS);
					}
				}

				setState(430);
				alias();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(LEFT_PAREN);
				setState(433);
				tableReferences();
				setState(434);
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
		enterRule(_localctx, 26, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
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
		enterRule(_localctx, 28, RULE_joinTable);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER || _la==CROSS) {
					{
					setState(440);
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

				setState(443);
				match(JOIN);
				setState(444);
				tableFactor();
				setState(446);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(445);
					joinCondition();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(STRAIGHT_JOIN);
				setState(449);
				tableFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				match(STRAIGHT_JOIN);
				setState(451);
				tableFactor();
				setState(452);
				joinCondition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(455);
					match(OUTER);
					}
				}

				setState(458);
				match(JOIN);
				setState(459);
				tableFactor();
				setState(460);
				joinCondition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(462);
				match(NATURAL);
				setState(466);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INNER:
					{
					setState(463);
					match(INNER);
					}
					break;
				case LEFT:
				case RIGHT:
					{
					setState(464);
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
					setState(465);
					match(OUTER);
					}
					}
					break;
				case JOIN:
					break;
				default:
					break;
				}
				setState(468);
				match(JOIN);
				setState(469);
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
		enterRule(_localctx, 30, RULE_joinCondition);
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(ON);
				setState(473);
				expr(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(USING);
				setState(475);
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
		enterRule(_localctx, 32, RULE_indexHintList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			indexHint();
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(479);
					match(COMMA);
					setState(480);
					indexHint();
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		enterRule(_localctx, 34, RULE_indexHint);
		int _la;
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USE:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(USE);
				setState(487);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FOR) {
					{
					{
					setState(488);
					match(FOR);
					setState(494);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case JOIN:
						{
						setState(489);
						match(JOIN);
						}
						break;
					case ORDER:
						{
						setState(490);
						match(ORDER);
						setState(491);
						match(BY);
						}
						break;
					case GROUP:
						{
						setState(492);
						match(GROUP);
						setState(493);
						match(BY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(501);
				itemList();
				}
				break;
			case IGNORE:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				match(IGNORE);
				setState(503);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FOR) {
					{
					{
					setState(504);
					match(FOR);
					setState(510);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case JOIN:
						{
						setState(505);
						match(JOIN);
						}
						break;
					case ORDER:
						{
						setState(506);
						match(ORDER);
						setState(507);
						match(BY);
						}
						break;
					case GROUP:
						{
						setState(508);
						match(GROUP);
						setState(509);
						match(BY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(517);
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
		enterRule(_localctx, 36, RULE_deleteClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(DELETE);
			setState(521);
			deleteSpec();
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(522);
				fromMulti();
				}
				break;
			case 2:
				{
				setState(523);
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
		enterRule(_localctx, 38, RULE_fromSingle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(FROM);
			setState(527);
			match(ID);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(528);
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
		enterRule(_localctx, 40, RULE_fromMulti);
		int _la;
		try {
			setState(564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(531);
				match(ID);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(532);
					match(T__0);
					}
				}

				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(535);
					match(COMMA);
					setState(536);
					match(ID);
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(537);
						match(T__0);
						}
					}

					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(545);
				match(FROM);
				setState(546);
				tableReferences();
				}
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(FROM);
				{
				setState(548);
				match(ID);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(549);
					match(T__0);
					}
				}

				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(552);
					match(COMMA);
					setState(553);
					match(ID);
					setState(555);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(554);
						match(T__0);
						}
					}

					}
					}
					setState(561);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(562);
				match(USING);
				setState(563);
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
		enterRule(_localctx, 42, RULE_deleteSpec);
		int _la;
		try {
			setState(575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOW_PRIORITY) {
					{
					setState(566);
					match(LOW_PRIORITY);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUICK) {
					{
					setState(569);
					match(QUICK);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(572);
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
		public TerminalNode INTO() { return getToken(MySQLDMLParser.INTO, 0); }
		public TerminalNode ID() { return getToken(MySQLDMLParser.ID, 0); }
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public ColumnClauseContext columnClause() {
			return getRuleContext(ColumnClauseContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			insertClause();
			setState(578);
			match(INTO);
			setState(579);
			match(ID);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(580);
				partitionClause();
				}
			}

			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(583);
				setClause();
				}
				break;
			case SELECT:
			case VALUES:
			case VALUE:
			case LEFT_PAREN:
				{
				setState(584);
				columnClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(587);
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
		enterRule(_localctx, 46, RULE_insertClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(INSERT);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HIGH_PRIORITY) | (1L << LOW_PRIORITY) | (1L << DELAYED))) != 0)) {
				{
				setState(591);
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
		enterRule(_localctx, 48, RULE_insertSpec);
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOW_PRIORITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				match(LOW_PRIORITY);
				}
				break;
			case DELAYED:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(DELAYED);
				}
				break;
			case HIGH_PRIORITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(596);
				match(HIGH_PRIORITY);
				setState(597);
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
		enterRule(_localctx, 50, RULE_partitionClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(PARTITION);
			setState(601);
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
		enterRule(_localctx, 52, RULE_columnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_PAREN) {
				{
				setState(603);
				itemListWithEmpty();
				}
			}

			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
			case VALUE:
				{
				setState(606);
				valueClause();
				}
				break;
			case SELECT:
				{
				setState(607);
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
		enterRule(_localctx, 54, RULE_valueClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_la = _input.LA(1);
			if ( !(_la==VALUES || _la==VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(611);
			valueList();
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(612);
				match(COMMA);
				setState(613);
				valueList();
				}
				}
				setState(618);
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
		enterRule(_localctx, 56, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(SET);
			setState(620);
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
		enterRule(_localctx, 58, RULE_onDuplicateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(ON);
			setState(623);
			match(DUPLICATE);
			setState(624);
			match(KEY);
			setState(625);
			match(UPDATE);
			setState(626);
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
		enterRule(_localctx, 60, RULE_itemListWithEmpty);
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(628);
				match(LEFT_PAREN);
				setState(629);
				match(RIGHT_PAREN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
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
		enterRule(_localctx, 62, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			assignment();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(634);
				match(COMMA);
				setState(635);
				assignment();
				}
				}
				setState(640);
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
		enterRule(_localctx, 64, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			columnName();
			setState(642);
			match(EQ_OR_ASSIGN);
			setState(643);
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
		enterRule(_localctx, 66, RULE_value);
		try {
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				match(DEFAULT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
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
		enterRule(_localctx, 68, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(LEFT_PAREN);
			setState(650);
			value();
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(651);
				match(COMMA);
				setState(652);
				value();
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(658);
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
		enterRule(_localctx, 70, RULE_updateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(UPDATE);
			setState(661);
			updateSpec();
			setState(662);
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
		enterRule(_localctx, 72, RULE_updateSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOW_PRIORITY) {
				{
				setState(664);
				match(LOW_PRIORITY);
				}
			}

			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(667);
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
		enterRule(_localctx, 74, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
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
		enterRule(_localctx, 76, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			selectExpression();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION) {
				{
				{
				setState(673);
				match(UNION);
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(674);
					match(ALL);
					}
				}

				setState(677);
				selectExpression();
				}
				}
				setState(682);
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
		enterRule(_localctx, 78, RULE_selectExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			selectClause();
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(684);
				fromClause();
				}
			}

			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(687);
				whereClause();
				}
			}

			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(690);
				groupByClause();
				}
			}

			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(693);
				orderByClause();
				}
			}

			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(696);
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
		public SelectExprContext selectExpr() {
			return getRuleContext(SelectExprContext.class,0);
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
		enterRule(_localctx, 80, RULE_selectClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(SELECT);
			setState(700);
			selectSpec();
			setState(701);
			selectExpr();
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
		enterRule(_localctx, 82, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(FROM);
			setState(704);
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
		enterRule(_localctx, 84, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(WHERE);
			setState(707);
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
		enterRule(_localctx, 86, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(GROUP);
			setState(710);
			match(BY);
			setState(711);
			groupByItem();
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(712);
				match(COMMA);
				setState(713);
				groupByItem();
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(719);
				match(WITH);
				setState(720);
				match(ROLLUP);
				}
			}

			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(723);
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
		enterRule(_localctx, 88, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(HAVING);
			setState(727);
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
		enterRule(_localctx, 90, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(ORDER);
			setState(730);
			match(BY);
			setState(731);
			groupByItem();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(732);
				match(COMMA);
				setState(733);
				groupByItem();
				}
				}
				setState(738);
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
		enterRule(_localctx, 92, RULE_groupByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(739);
				columnName();
				}
				break;
			case 2:
				{
				setState(740);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(741);
				expr(0);
				}
				break;
			}
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(744);
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
		enterRule(_localctx, 94, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(LIMIT);
			setState(748);
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
		enterRule(_localctx, 96, RULE_rangeClause);
		int _la;
		try {
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				match(NUMBER);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(751);
					match(COMMA);
					setState(752);
					match(NUMBER);
					}
					}
					setState(757);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(758);
				match(NUMBER);
				setState(759);
				match(OFFSET);
				setState(760);
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
		public SelectExpressionContext selectExpression() {
			return getRuleContext(SelectExpressionContext.class,0);
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
		enterRule(_localctx, 98, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(LEFT_PAREN);
			setState(764);
			selectExpression();
			setState(765);
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

	public static class SelectExprContext extends ParserRuleContext {
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
		enterRule(_localctx, 100, RULE_selectExpr);
		int _la;
		try {
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(767);
				match(MUL_OP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				expr(0);
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(769);
					match(COMMA);
					setState(770);
					expr(0);
					}
					}
					setState(775);
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
		enterRule(_localctx, 102, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			deleteClause();
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(779);
				whereClause();
				}
			}

			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(782);
				orderByClause();
				}
			}

			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(785);
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
		enterRule(_localctx, 104, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			updateClause();
			setState(789);
			setClause();
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(790);
				whereClause();
				}
			}

			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(793);
				orderByClause();
				}
			}

			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(796);
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
		enterRule(_localctx, 106, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
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
		enterRule(_localctx, 108, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
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
		enterRule(_localctx, 110, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
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
		enterRule(_localctx, 112, RULE_itemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(LEFT_PAREN);
			setState(806);
			item();
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(807);
				match(COMMA);
				setState(808);
				item();
				}
				}
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(814);
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
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0086\u0333\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\5\2v\n\2\3\2\5"+
		"\2y\n\2\3\2\5\2|\n\2\3\2\5\2\177\n\2\3\2\5\2\u0082\n\2\3\2\5\2\u0085\n"+
		"\2\3\2\5\2\u0088\n\2\3\2\5\2\u008b\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0093"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00a4"+
		"\n\3\f\3\16\3\u00a7\13\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00af\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00be\n\4\f\4\16\4\u00c1"+
		"\13\4\3\5\3\5\3\6\3\6\5\6\u00c7\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ce\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6\u00d5\n\6\f\6\16\6\u00d8\13\6\3\6\3\6\3\6\3\6"+
		"\5\6\u00de\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ec"+
		"\n\6\3\6\3\6\3\6\3\6\7\6\u00f2\n\6\f\6\16\6\u00f5\13\6\3\6\3\6\5\6\u00f9"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u00ff\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0128\n\7\f\7\16"+
		"\7\u012b\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0144\n\b\f\b\16\b\u0147\13\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u014e\n\b\3\b\3\b\3\b\3\b\3\b\7\b\u0155\n\b\f"+
		"\b\16\b\u0158\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0164\n"+
		"\t\3\t\3\t\5\t\u0168\n\t\3\t\3\t\3\t\5\t\u016d\n\t\3\t\3\t\5\t\u0171\n"+
		"\t\5\t\u0173\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u017e"+
		"\n\13\f\13\16\13\u0181\13\13\5\13\u0183\n\13\3\13\3\13\3\f\3\f\3\f\7\f"+
		"\u018a\n\f\f\f\16\f\u018d\13\f\3\r\3\r\3\r\6\r\u0192\n\r\r\r\16\r\u0193"+
		"\3\r\3\r\6\r\u0198\n\r\r\r\16\r\u0199\3\r\5\r\u019d\n\r\3\16\3\16\3\16"+
		"\5\16\u01a2\n\16\3\16\5\16\u01a5\n\16\3\16\5\16\u01a8\n\16\3\16\5\16\u01ab"+
		"\n\16\3\16\3\16\5\16\u01af\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u01b7"+
		"\n\16\3\17\3\17\3\20\5\20\u01bc\n\20\3\20\3\20\3\20\5\20\u01c1\n\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01cb\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u01d5\n\20\3\20\3\20\5\20\u01d9\n\20\3"+
		"\21\3\21\3\21\3\21\5\21\u01df\n\21\3\22\3\22\3\22\7\22\u01e4\n\22\f\22"+
		"\16\22\u01e7\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u01f1"+
		"\n\23\7\23\u01f3\n\23\f\23\16\23\u01f6\13\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0201\n\23\7\23\u0203\n\23\f\23\16\23\u0206"+
		"\13\23\3\23\5\23\u0209\n\23\3\24\3\24\3\24\3\24\5\24\u020f\n\24\3\25\3"+
		"\25\3\25\5\25\u0214\n\25\3\26\3\26\5\26\u0218\n\26\3\26\3\26\3\26\5\26"+
		"\u021d\n\26\7\26\u021f\n\26\f\26\16\26\u0222\13\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0229\n\26\3\26\3\26\3\26\5\26\u022e\n\26\7\26\u0230\n\26\f"+
		"\26\16\26\u0233\13\26\3\26\3\26\5\26\u0237\n\26\3\27\5\27\u023a\n\27\3"+
		"\27\5\27\u023d\n\27\3\27\5\27\u0240\n\27\5\27\u0242\n\27\3\30\3\30\3\30"+
		"\3\30\5\30\u0248\n\30\3\30\3\30\5\30\u024c\n\30\3\30\5\30\u024f\n\30\3"+
		"\31\3\31\5\31\u0253\n\31\3\32\3\32\3\32\3\32\5\32\u0259\n\32\3\33\3\33"+
		"\3\33\3\34\5\34\u025f\n\34\3\34\3\34\5\34\u0263\n\34\3\35\3\35\3\35\3"+
		"\35\7\35\u0269\n\35\f\35\16\35\u026c\13\35\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \5 \u027a\n \3!\3!\3!\7!\u027f\n!\f!\16!\u0282"+
		"\13!\3\"\3\"\3\"\3\"\3#\3#\5#\u028a\n#\3$\3$\3$\3$\7$\u0290\n$\f$\16$"+
		"\u0293\13$\3$\3$\3%\3%\3%\3%\3&\5&\u029c\n&\3&\5&\u029f\n&\3\'\3\'\3("+
		"\3(\3(\5(\u02a6\n(\3(\7(\u02a9\n(\f(\16(\u02ac\13(\3)\3)\5)\u02b0\n)\3"+
		")\5)\u02b3\n)\3)\5)\u02b6\n)\3)\5)\u02b9\n)\3)\5)\u02bc\n)\3*\3*\3*\3"+
		"*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\7-\u02cd\n-\f-\16-\u02d0\13-\3-\3-"+
		"\5-\u02d4\n-\3-\5-\u02d7\n-\3.\3.\3.\3/\3/\3/\3/\3/\7/\u02e1\n/\f/\16"+
		"/\u02e4\13/\3\60\3\60\3\60\5\60\u02e9\n\60\3\60\5\60\u02ec\n\60\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\7\62\u02f4\n\62\f\62\16\62\u02f7\13\62\3\62\3"+
		"\62\3\62\5\62\u02fc\n\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64"+
		"\u0306\n\64\f\64\16\64\u0309\13\64\5\64\u030b\n\64\3\65\3\65\5\65\u030f"+
		"\n\65\3\65\5\65\u0312\n\65\3\65\5\65\u0315\n\65\3\66\3\66\3\66\5\66\u031a"+
		"\n\66\3\66\5\66\u031d\n\66\3\66\5\66\u0320\n\66\3\67\3\67\38\38\39\39"+
		"\3:\3:\3:\3:\7:\u032c\n:\f:\16:\u032f\13:\3:\3:\3:\2\6\4\6\f\16;\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnpr\2\r\5\2\4\4\34\34\36\36\3\2\n\13\3\2VY\3\2\34\35\3\2"+
		"w}\3\2bd\3\29:\3\2=>\3\2CD\3\2LM\3\2$%\2\u0397\2u\3\2\2\2\4\u0092\3\2"+
		"\2\2\6\u00a8\3\2\2\2\b\u00c2\3\2\2\2\n\u00fe\3\2\2\2\f\u0100\3\2\2\2\16"+
		"\u014d\3\2\2\2\20\u0172\3\2\2\2\22\u0174\3\2\2\2\24\u0177\3\2\2\2\26\u0186"+
		"\3\2\2\2\30\u019c\3\2\2\2\32\u01b6\3\2\2\2\34\u01b8\3\2\2\2\36\u01d8\3"+
		"\2\2\2 \u01de\3\2\2\2\"\u01e0\3\2\2\2$\u0208\3\2\2\2&\u020a\3\2\2\2(\u0210"+
		"\3\2\2\2*\u0236\3\2\2\2,\u0241\3\2\2\2.\u0243\3\2\2\2\60\u0250\3\2\2\2"+
		"\62\u0258\3\2\2\2\64\u025a\3\2\2\2\66\u025e\3\2\2\28\u0264\3\2\2\2:\u026d"+
		"\3\2\2\2<\u0270\3\2\2\2>\u0279\3\2\2\2@\u027b\3\2\2\2B\u0283\3\2\2\2D"+
		"\u0289\3\2\2\2F\u028b\3\2\2\2H\u0296\3\2\2\2J\u029b\3\2\2\2L\u02a0\3\2"+
		"\2\2N\u02a2\3\2\2\2P\u02ad\3\2\2\2R\u02bd\3\2\2\2T\u02c1\3\2\2\2V\u02c4"+
		"\3\2\2\2X\u02c7\3\2\2\2Z\u02d8\3\2\2\2\\\u02db\3\2\2\2^\u02e8\3\2\2\2"+
		"`\u02ed\3\2\2\2b\u02fb\3\2\2\2d\u02fd\3\2\2\2f\u030a\3\2\2\2h\u030c\3"+
		"\2\2\2j\u0316\3\2\2\2l\u0321\3\2\2\2n\u0323\3\2\2\2p\u0325\3\2\2\2r\u0327"+
		"\3\2\2\2tv\t\2\2\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2wy\7\5\2\2xw\3\2\2\2x"+
		"y\3\2\2\2y{\3\2\2\2z|\7\6\2\2{z\3\2\2\2{|\3\2\2\2|~\3\2\2\2}\177\7\7\2"+
		"\2~}\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080\u0082\7\b\2\2\u0081"+
		"\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0085\7\t"+
		"\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0088\t\3\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2"+
		"\2\2\u0089\u008b\7\f\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\3\3\2\2\2\u008c\u008d\b\3\1\2\u008d\u008e\7T\2\2\u008e\u0093\5\4\3\5"+
		"\u008f\u0090\7h\2\2\u0090\u0093\5\4\3\4\u0091\u0093\5\6\4\2\u0092\u008c"+
		"\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0091\3\2\2\2\u0093\u00a5\3\2\2\2\u0094"+
		"\u0095\f\n\2\2\u0095\u0096\7R\2\2\u0096\u00a4\5\4\3\13\u0097\u0098\f\t"+
		"\2\2\u0098\u0099\7g\2\2\u0099\u00a4\5\4\3\n\u009a\u009b\f\b\2\2\u009b"+
		"\u009c\7S\2\2\u009c\u00a4\5\4\3\t\u009d\u009e\f\7\2\2\u009e\u009f\7Q\2"+
		"\2\u009f\u00a4\5\4\3\b\u00a0\u00a1\f\6\2\2\u00a1\u00a2\7f\2\2\u00a2\u00a4"+
		"\5\4\3\7\u00a3\u0094\3\2\2\2\u00a3\u0097\3\2\2\2\u00a3\u009a\3\2\2\2\u00a3"+
		"\u009d\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\5\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9"+
		"\b\4\1\2\u00a9\u00aa\5\n\6\2\u00aa\u00bf\3\2\2\2\u00ab\u00ac\f\7\2\2\u00ac"+
		"\u00ae\7P\2\2\u00ad\u00af\7T\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2"+
		"\2\u00af\u00b0\3\2\2\2\u00b0\u00be\t\4\2\2\u00b1\u00b2\f\6\2\2\u00b2\u00b3"+
		"\7i\2\2\u00b3\u00be\5\n\6\2\u00b4\u00b5\f\5\2\2\u00b5\u00b6\5\b\5\2\u00b6"+
		"\u00b7\5\n\6\2\u00b7\u00be\3\2\2\2\u00b8\u00b9\f\4\2\2\u00b9\u00ba\5\b"+
		"\5\2\u00ba\u00bb\t\5\2\2\u00bb\u00bc\5d\63\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00ab\3\2\2\2\u00bd\u00b1\3\2\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00b8\3\2"+
		"\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\7\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\t\6\2\2\u00c3\t\3\2\2\2\u00c4"+
		"\u00c6\5\f\7\2\u00c5\u00c7\7T\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\67\2\2\u00c9\u00ca\5d\63\2\u00ca"+
		"\u00ff\3\2\2\2\u00cb\u00cd\5\f\7\2\u00cc\u00ce\7T\2\2\u00cd\u00cc\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\67\2\2\u00d0"+
		"\u00d1\7~\2\2\u00d1\u00d6\5\4\3\2\u00d2\u00d3\7\u0082\2\2\u00d3\u00d5"+
		"\5\4\3\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\177"+
		"\2\2\u00da\u00ff\3\2\2\2\u00db\u00dd\5\f\7\2\u00dc\u00de\7T\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7U"+
		"\2\2\u00e0\u00e1\5\f\7\2\u00e1\u00e2\7Q\2\2\u00e2\u00e3\5\n\6\2\u00e3"+
		"\u00ff\3\2\2\2\u00e4\u00e5\5\f\7\2\u00e5\u00e6\7Z\2\2\u00e6\u00e7\7[\2"+
		"\2\u00e7\u00e8\5\f\7\2\u00e8\u00ff\3\2\2\2\u00e9\u00eb\5\f\7\2\u00ea\u00ec"+
		"\7T\2\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\7[\2\2\u00ee\u00f3\5\16\b\2\u00ef\u00f0\7`\2\2\u00f0\u00f2\5\16"+
		"\b\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00ff\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\5\f"+
		"\7\2\u00f7\u00f9\7T\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\7a\2\2\u00fb\u00fc\5\f\7\2\u00fc\u00ff\3\2"+
		"\2\2\u00fd\u00ff\5\f\7\2\u00fe\u00c4\3\2\2\2\u00fe\u00cb\3\2\2\2\u00fe"+
		"\u00db\3\2\2\2\u00fe\u00e4\3\2\2\2\u00fe\u00e9\3\2\2\2\u00fe\u00f6\3\2"+
		"\2\2\u00fe\u00fd\3\2\2\2\u00ff\13\3\2\2\2\u0100\u0101\b\7\1\2\u0101\u0102"+
		"\5\16\b\2\u0102\u0129\3\2\2\2\u0103\u0104\f\17\2\2\u0104\u0105\7k\2\2"+
		"\u0105\u0128\5\f\7\20\u0106\u0107\f\16\2\2\u0107\u0108\7l\2\2\u0108\u0128"+
		"\5\f\7\17\u0109\u010a\f\r\2\2\u010a\u010b\7m\2\2\u010b\u0128\5\f\7\16"+
		"\u010c\u010d\f\f\2\2\u010d\u010e\7n\2\2\u010e\u0128\5\f\7\r\u010f\u0110"+
		"\f\13\2\2\u0110\u0111\7q\2\2\u0111\u0128\5\f\7\f\u0112\u0113\f\n\2\2\u0113"+
		"\u0114\7r\2\2\u0114\u0128\5\f\7\13\u0115\u0116\f\t\2\2\u0116\u0117\7s"+
		"\2\2\u0117\u0128\5\f\7\n\u0118\u0119\f\b\2\2\u0119\u011a\7t\2\2\u011a"+
		"\u0128\5\f\7\t\u011b\u011c\f\7\2\2\u011c\u011d\7\\\2\2\u011d\u0128\5\f"+
		"\7\b\u011e\u011f\f\6\2\2\u011f\u0120\7]\2\2\u0120\u0128\5\f\7\7\u0121"+
		"\u0122\f\5\2\2\u0122\u0123\7p\2\2\u0123\u0128\5\f\7\6\u0124\u0125\f\4"+
		"\2\2\u0125\u0126\7o\2\2\u0126\u0128\5\f\7\5\u0127\u0103\3\2\2\2\u0127"+
		"\u0106\3\2\2\2\u0127\u0109\3\2\2\2\u0127\u010c\3\2\2\2\u0127\u010f\3\2"+
		"\2\2\u0127\u0112\3\2\2\2\u0127\u0115\3\2\2\2\u0127\u0118\3\2\2\2\u0127"+
		"\u011b\3\2\2\2\u0127\u011e\3\2\2\2\u0127\u0121\3\2\2\2\u0127\u0124\3\2"+
		"\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\r\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u014e\b\b\1\2\u012d\u014e\5\24\13"+
		"\2\u012e\u014e\5\20\t\2\u012f\u014e\7e\2\2\u0130\u0131\7q\2\2\u0131\u014e"+
		"\5\16\b\13\u0132\u0133\7r\2\2\u0133\u014e\5\16\b\n\u0134\u0135\7j\2\2"+
		"\u0135\u014e\5\16\b\t\u0136\u0137\7h\2\2\u0137\u014e\5\16\b\b\u0138\u0139"+
		"\7^\2\2\u0139\u014e\5\16\b\7\u013a\u013b\7~\2\2\u013b\u013c\5\4\3\2\u013c"+
		"\u013d\7\177\2\2\u013d\u014e\3\2\2\2\u013e\u013f\7_\2\2\u013f\u0140\7"+
		"~\2\2\u0140\u0145\5\4\3\2\u0141\u0142\7\u0082\2\2\u0142\u0144\5\4\3\2"+
		"\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7\177\2\2"+
		"\u0149\u014e\3\2\2\2\u014a\u014e\5d\63\2\u014b\u014c\7O\2\2\u014c\u014e"+
		"\5d\63\2\u014d\u012c\3\2\2\2\u014d\u012d\3\2\2\2\u014d\u012e\3\2\2\2\u014d"+
		"\u012f\3\2\2\2\u014d\u0130\3\2\2\2\u014d\u0132\3\2\2\2\u014d\u0134\3\2"+
		"\2\2\u014d\u0136\3\2\2\2\u014d\u0138\3\2\2\2\u014d\u013a\3\2\2\2\u014d"+
		"\u013e\3\2\2\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0156\3\2"+
		"\2\2\u014f\u0150\f\f\2\2\u0150\u0151\7f\2\2\u0151\u0155\5\16\b\r\u0152"+
		"\u0153\f\r\2\2\u0153\u0155\5\22\n\2\u0154\u014f\3\2\2\2\u0154\u0152\3"+
		"\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\17\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u0173\7\26\2\2\u015a\u0173\7W\2"+
		"\2\u015b\u0173\7X\2\2\u015c\u0173\7V\2\2\u015d\u015e\7\u0080\2\2\u015e"+
		"\u015f\7e\2\2\u015f\u0160\7\25\2\2\u0160\u0173\7\u0081\2\2\u0161\u0173"+
		"\7\30\2\2\u0162\u0164\7e\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0167\7\25\2\2\u0166\u0168\5\22\n\2\u0167\u0166\3"+
		"\2\2\2\u0167\u0168\3\2\2\2\u0168\u0173\3\2\2\2\u0169\u016a\t\7\2\2\u016a"+
		"\u0173\7\25\2\2\u016b\u016d\7e\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u0170\7\31\2\2\u016f\u0171\5\22\n\2\u0170"+
		"\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0159\3\2"+
		"\2\2\u0172\u015a\3\2\2\2\u0172\u015b\3\2\2\2\u0172\u015c\3\2\2\2\u0172"+
		"\u015d\3\2\2\2\u0172\u0161\3\2\2\2\u0172\u0163\3\2\2\2\u0172\u0169\3\2"+
		"\2\2\u0172\u016c\3\2\2\2\u0173\21\3\2\2\2\u0174\u0175\7\24\2\2\u0175\u0176"+
		"\7e\2\2\u0176\23\3\2\2\2\u0177\u0178\7e\2\2\u0178\u0182\7~\2\2\u0179\u0183"+
		"\3\2\2\2\u017a\u017f\5\4\3\2\u017b\u017c\7\u0082\2\2\u017c\u017e\5\4\3"+
		"\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0179\3\2\2\2\u0182"+
		"\u017a\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7\177\2\2\u0185\25\3\2"+
		"\2\2\u0186\u018b\5\30\r\2\u0187\u0188\7\u0082\2\2\u0188\u018a\5\30\r\2"+
		"\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c"+
		"\3\2\2\2\u018c\27\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\5\32\16\2\u018f"+
		"\u0190\5\36\20\2\u0190\u0192\3\2\2\2\u0191\u018e\3\2\2\2\u0192\u0193\3"+
		"\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u019d\3\2\2\2\u0195"+
		"\u0197\5\32\16\2\u0196\u0198\5\36\20\2\u0197\u0196\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019d\3\2\2\2\u019b"+
		"\u019d\5\32\16\2\u019c\u0191\3\2\2\2\u019c\u0195\3\2\2\2\u019c\u019b\3"+
		"\2\2\2\u019d\31\3\2\2\2\u019e\u01a1\5n8\2\u019f\u01a0\7 \2\2\u01a0\u01a2"+
		"\5r:\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a7\3\2\2\2\u01a3"+
		"\u01a5\7*\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a8\5\34\17\2\u01a7\u01a4\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01aa\3\2\2\2\u01a9\u01ab\5\"\22\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3"+
		"\2\2\2\u01ab\u01b7\3\2\2\2\u01ac\u01ae\5d\63\2\u01ad\u01af\7*\2\2\u01ae"+
		"\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\5\34"+
		"\17\2\u01b1\u01b7\3\2\2\2\u01b2\u01b3\7~\2\2\u01b3\u01b4\5\26\f\2\u01b4"+
		"\u01b5\7\177\2\2\u01b5\u01b7\3\2\2\2\u01b6\u019e\3\2\2\2\u01b6\u01ac\3"+
		"\2\2\2\u01b6\u01b2\3\2\2\2\u01b7\33\3\2\2\2\u01b8\u01b9\7e\2\2\u01b9\35"+
		"\3\2\2\2\u01ba\u01bc\t\b\2\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01be\7;\2\2\u01be\u01c0\5\32\16\2\u01bf\u01c1\5"+
		" \21\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01d9\3\2\2\2\u01c2"+
		"\u01c3\7\6\2\2\u01c3\u01d9\5\32\16\2\u01c4\u01c5\7\6\2\2\u01c5\u01c6\5"+
		"\32\16\2\u01c6\u01c7\5 \21\2\u01c7\u01d9\3\2\2\2\u01c8\u01ca\t\t\2\2\u01c9"+
		"\u01cb\7?\2\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01cd\7;\2\2\u01cd\u01ce\5\32\16\2\u01ce\u01cf\5 \21\2\u01cf"+
		"\u01d9\3\2\2\2\u01d0\u01d4\7@\2\2\u01d1\u01d5\79\2\2\u01d2\u01d3\t\t\2"+
		"\2\u01d3\u01d5\7?\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\7;\2\2\u01d7\u01d9\5\32\16\2"+
		"\u01d8\u01bb\3\2\2\2\u01d8\u01c2\3\2\2\2\u01d8\u01c4\3\2\2\2\u01d8\u01c8"+
		"\3\2\2\2\u01d8\u01d0\3\2\2\2\u01d9\37\3\2\2\2\u01da\u01db\7<\2\2\u01db"+
		"\u01df\5\4\3\2\u01dc\u01dd\7A\2\2\u01dd\u01df\5r:\2\u01de\u01da\3\2\2"+
		"\2\u01de\u01dc\3\2\2\2\u01df!\3\2\2\2\u01e0\u01e5\5$\23\2\u01e1\u01e2"+
		"\7\u0082\2\2\u01e2\u01e4\5$\23\2\u01e3\u01e1\3\2\2\2\u01e4\u01e7\3\2\2"+
		"\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6#\3\2\2\2\u01e7\u01e5"+
		"\3\2\2\2\u01e8\u01e9\7B\2\2\u01e9\u01f4\t\n\2\2\u01ea\u01f0\7\60\2\2\u01eb"+
		"\u01f1\7;\2\2\u01ec\u01ed\7+\2\2\u01ed\u01f1\7#\2\2\u01ee\u01ef\7\"\2"+
		"\2\u01ef\u01f1\7#\2\2\u01f0\u01eb\3\2\2\2\u01f0\u01ec\3\2\2\2\u01f0\u01ee"+
		"\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01ea\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f4\3\2"+
		"\2\2\u01f7\u0209\5r:\2\u01f8\u01f9\7E\2\2\u01f9\u0204\t\n\2\2\u01fa\u0200"+
		"\7\60\2\2\u01fb\u0201\7;\2\2\u01fc\u01fd\7+\2\2\u01fd\u0201\7#\2\2\u01fe"+
		"\u01ff\7\"\2\2\u01ff\u0201\7#\2\2\u0200\u01fb\3\2\2\2\u0200\u01fc\3\2"+
		"\2\2\u0200\u01fe\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u01fa\3\2\2\2\u0203"+
		"\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207\3\2"+
		"\2\2\u0206\u0204\3\2\2\2\u0207\u0209\5r:\2\u0208\u01e8\3\2\2\2\u0208\u01f8"+
		"\3\2\2\2\u0209%\3\2\2\2\u020a\u020b\7I\2\2\u020b\u020e\5,\27\2\u020c\u020f"+
		"\5*\26\2\u020d\u020f\5(\25\2\u020e\u020c\3\2\2\2\u020e\u020d\3\2\2\2\u020f"+
		"\'\3\2\2\2\u0210\u0211\7\37\2\2\u0211\u0213\7e\2\2\u0212\u0214\5\64\33"+
		"\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214)\3\2\2\2\u0215\u0217"+
		"\7e\2\2\u0216\u0218\7\3\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218"+
		"\u0220\3\2\2\2\u0219\u021a\7\u0082\2\2\u021a\u021c\7e\2\2\u021b\u021d"+
		"\7\3\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e"+
		"\u0219\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2"+
		"\2\2\u0221\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7\37\2\2\u0224"+
		"\u0237\5\26\f\2\u0225\u0226\7\37\2\2\u0226\u0228\7e\2\2\u0227\u0229\7"+
		"\3\2\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0231\3\2\2\2\u022a"+
		"\u022b\7\u0082\2\2\u022b\u022d\7e\2\2\u022c\u022e\7\3\2\2\u022d\u022c"+
		"\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u022a\3\2\2\2\u0230"+
		"\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2"+
		"\2\2\u0233\u0231\3\2\2\2\u0234\u0235\7A\2\2\u0235\u0237\5\26\f\2\u0236"+
		"\u0215\3\2\2\2\u0236\u0225\3\2\2\2\u0237+\3\2\2\2\u0238\u023a\7\22\2\2"+
		"\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u0242\3\2\2\2\u023b\u023d"+
		"\7J\2\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u0242\3\2\2\2\u023e"+
		"\u0240\7E\2\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2"+
		"\2\2\u0241\u0239\3\2\2\2\u0241\u023c\3\2\2\2\u0241\u023f\3\2\2\2\u0242"+
		"-\3\2\2\2\u0243\u0244\5\60\31\2\u0244\u0245\7.\2\2\u0245\u0247\7e\2\2"+
		"\u0246\u0248\5\64\33\2\u0247\u0246\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024b"+
		"\3\2\2\2\u0249\u024c\5:\36\2\u024a\u024c\5\66\34\2\u024b\u0249\3\2\2\2"+
		"\u024b\u024a\3\2\2\2\u024c\u024e\3\2\2\2\u024d\u024f\5<\37\2\u024e\u024d"+
		"\3\2\2\2\u024e\u024f\3\2\2\2\u024f/\3\2\2\2\u0250\u0252\7K\2\2\u0251\u0253"+
		"\5\62\32\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\61\3\2\2\2\u0254"+
		"\u0259\7\22\2\2\u0255\u0259\7\23\2\2\u0256\u0257\7\5\2\2\u0257\u0259\7"+
		"E\2\2\u0258\u0254\3\2\2\2\u0258\u0255\3\2\2\2\u0258\u0256\3\2\2\2\u0259"+
		"\63\3\2\2\2\u025a\u025b\7 \2\2\u025b\u025c\5r:\2\u025c\65\3\2\2\2\u025d"+
		"\u025f\5> \2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0262\3\2\2"+
		"\2\u0260\u0263\58\35\2\u0261\u0263\5N(\2\u0262\u0260\3\2\2\2\u0262\u0261"+
		"\3\2\2\2\u0263\67\3\2\2\2\u0264\u0265\t\13\2\2\u0265\u026a\5F$\2\u0266"+
		"\u0267\7\u0082\2\2\u0267\u0269\5F$\2\u0268\u0266\3\2\2\2\u0269\u026c\3"+
		"\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b\3\2\2\2\u026b9\3\2\2\2\u026c\u026a"+
		"\3\2\2\2\u026d\u026e\7/\2\2\u026e\u026f\5@!\2\u026f;\3\2\2\2\u0270\u0271"+
		"\7<\2\2\u0271\u0272\7N\2\2\u0272\u0273\7D\2\2\u0273\u0274\7\61\2\2\u0274"+
		"\u0275\5@!\2\u0275=\3\2\2\2\u0276\u0277\7~\2\2\u0277\u027a\7\177\2\2\u0278"+
		"\u027a\5r:\2\u0279\u0276\3\2\2\2\u0279\u0278\3\2\2\2\u027a?\3\2\2\2\u027b"+
		"\u0280\5B\"\2\u027c\u027d\7\u0082\2\2\u027d\u027f\5B\"\2\u027e\u027c\3"+
		"\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"A\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0284\5p9\2\u0284\u0285\7w\2\2\u0285"+
		"\u0286\5D#\2\u0286C\3\2\2\2\u0287\u028a\7H\2\2\u0288\u028a\5\4\3\2\u0289"+
		"\u0287\3\2\2\2\u0289\u0288\3\2\2\2\u028aE\3\2\2\2\u028b\u028c\7~\2\2\u028c"+
		"\u0291\5D#\2\u028d\u028e\7\u0082\2\2\u028e\u0290\5D#\2\u028f\u028d\3\2"+
		"\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0294\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0295\7\177\2\2\u0295G\3\2\2"+
		"\2\u0296\u0297\7\61\2\2\u0297\u0298\5J&\2\u0298\u0299\5\26\f\2\u0299I"+
		"\3\2\2\2\u029a\u029c\7\22\2\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2"+
		"\u029c\u029e\3\2\2\2\u029d\u029f\7E\2\2\u029e\u029d\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029fK\3\2\2\2\u02a0\u02a1\7e\2\2\u02a1M\3\2\2\2\u02a2\u02aa"+
		"\5P)\2\u02a3\u02a5\7G\2\2\u02a4\u02a6\7\34\2\2\u02a5\u02a4\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\5P)\2\u02a8\u02a3\3\2\2"+
		"\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02abO"+
		"\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02af\5R*\2\u02ae\u02b0\5T+\2\u02af"+
		"\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02b3\5V"+
		",\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4"+
		"\u02b6\5X-\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8\3\2\2"+
		"\2\u02b7\u02b9\5\\/\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bb"+
		"\3\2\2\2\u02ba\u02bc\5`\61\2\u02bb\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc"+
		"Q\3\2\2\2\u02bd\u02be\7\33\2\2\u02be\u02bf\5\2\2\2\u02bf\u02c0\5f\64\2"+
		"\u02c0S\3\2\2\2\u02c1\u02c2\7\37\2\2\u02c2\u02c3\5\26\f\2\u02c3U\3\2\2"+
		"\2\u02c4\u02c5\7!\2\2\u02c5\u02c6\5\4\3\2\u02c6W\3\2\2\2\u02c7\u02c8\7"+
		"\"\2\2\u02c8\u02c9\7#\2\2\u02c9\u02ce\5^\60\2\u02ca\u02cb\7\u0082\2\2"+
		"\u02cb\u02cd\5^\60\2\u02cc\u02ca\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc"+
		"\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d3\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1"+
		"\u02d2\7&\2\2\u02d2\u02d4\7\'\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2"+
		"\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02d7\5Z.\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7"+
		"\3\2\2\2\u02d7Y\3\2\2\2\u02d8\u02d9\7(\2\2\u02d9\u02da\5\4\3\2\u02da["+
		"\3\2\2\2\u02db\u02dc\7+\2\2\u02dc\u02dd\7#\2\2\u02dd\u02e2\5^\60\2\u02de"+
		"\u02df\7\u0082\2\2\u02df\u02e1\5^\60\2\u02e0\u02de\3\2\2\2\u02e1\u02e4"+
		"\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3]\3\2\2\2\u02e4"+
		"\u02e2\3\2\2\2\u02e5\u02e9\5p9\2\u02e6\u02e9\7\26\2\2\u02e7\u02e9\5\4"+
		"\3\2\u02e8\u02e5\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e7\3\2\2\2\u02e9"+
		"\u02eb\3\2\2\2\u02ea\u02ec\t\f\2\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2"+
		"\2\2\u02ec_\3\2\2\2\u02ed\u02ee\7,\2\2\u02ee\u02ef\5b\62\2\u02efa\3\2"+
		"\2\2\u02f0\u02f5\7\26\2\2\u02f1\u02f2\7\u0082\2\2\u02f2\u02f4\7\26\2\2"+
		"\u02f3\u02f1\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6"+
		"\3\2\2\2\u02f6\u02fc\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02f9\7\26\2\2"+
		"\u02f9\u02fa\7-\2\2\u02fa\u02fc\7\26\2\2\u02fb\u02f0\3\2\2\2\u02fb\u02f8"+
		"\3\2\2\2\u02fcc\3\2\2\2\u02fd\u02fe\7~\2\2\u02fe\u02ff\5P)\2\u02ff\u0300"+
		"\7\177\2\2\u0300e\3\2\2\2\u0301\u030b\7s\2\2\u0302\u0307\5\4\3\2\u0303"+
		"\u0304\7\u0082\2\2\u0304\u0306\5\4\3\2\u0305\u0303\3\2\2\2\u0306\u0309"+
		"\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030b\3\2\2\2\u0309"+
		"\u0307\3\2\2\2\u030a\u0301\3\2\2\2\u030a\u0302\3\2\2\2\u030bg\3\2\2\2"+
		"\u030c\u030e\5&\24\2\u030d\u030f\5V,\2\u030e\u030d\3\2\2\2\u030e\u030f"+
		"\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u0312\5\\/\2\u0311\u0310\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0314\3\2\2\2\u0313\u0315\5`\61\2\u0314\u0313\3\2"+
		"\2\2\u0314\u0315\3\2\2\2\u0315i\3\2\2\2\u0316\u0317\5H%\2\u0317\u0319"+
		"\5:\36\2\u0318\u031a\5V,\2\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u031c\3\2\2\2\u031b\u031d\5\\/\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2"+
		"\2\2\u031d\u031f\3\2\2\2\u031e\u0320\5`\61\2\u031f\u031e\3\2\2\2\u031f"+
		"\u0320\3\2\2\2\u0320k\3\2\2\2\u0321\u0322\7e\2\2\u0322m\3\2\2\2\u0323"+
		"\u0324\7e\2\2\u0324o\3\2\2\2\u0325\u0326\7e\2\2\u0326q\3\2\2\2\u0327\u0328"+
		"\7~\2\2\u0328\u032d\5L\'\2\u0329\u032a\7\u0082\2\2\u032a\u032c\5L\'\2"+
		"\u032b\u0329\3\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e"+
		"\3\2\2\2\u032e\u0330\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0331\7\177\2\2"+
		"\u0331s\3\2\2\2nux{~\u0081\u0084\u0087\u008a\u0092\u00a3\u00a5\u00ae\u00bd"+
		"\u00bf\u00c6\u00cd\u00d6\u00dd\u00eb\u00f3\u00f8\u00fe\u0127\u0129\u0145"+
		"\u014d\u0154\u0156\u0163\u0167\u016c\u0170\u0172\u017f\u0182\u018b\u0193"+
		"\u0199\u019c\u01a1\u01a4\u01a7\u01aa\u01ae\u01b6\u01bb\u01c0\u01ca\u01d4"+
		"\u01d8\u01de\u01e5\u01f0\u01f4\u0200\u0204\u0208\u020e\u0213\u0217\u021c"+
		"\u0220\u0228\u022d\u0231\u0236\u0239\u023c\u023f\u0241\u0247\u024b\u024e"+
		"\u0252\u0258\u025e\u0262\u026a\u0279\u0280\u0289\u0291\u029b\u029e\u02a5"+
		"\u02aa\u02af\u02b2\u02b5\u02b8\u02bb\u02ce\u02d3\u02d6\u02e2\u02e8\u02eb"+
		"\u02f5\u02fb\u0307\u030a\u030e\u0311\u0314\u0319\u031c\u031f\u032d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}