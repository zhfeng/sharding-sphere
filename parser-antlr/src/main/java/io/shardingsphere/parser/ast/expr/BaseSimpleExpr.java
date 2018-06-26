package io.shardingsphere.parser.ast.expr;

public interface BaseSimpleExpr{
	public static final short NONE = -1;
	public static final short FUNCTION = 1;
	public static final short LITER = 2;
	public static final short ID = 3;
	public static final short SIMPLE_EXPR = 4;

	public static final short EXPR_WITH_CONJUNCTION = 7;
	public static final short EXPR_WITH_BRACKET = 8;
	public static final short SUBQUERY = 10;
	public static final short SUBQUERY_WITHCONJUNCTION = 11;
}
