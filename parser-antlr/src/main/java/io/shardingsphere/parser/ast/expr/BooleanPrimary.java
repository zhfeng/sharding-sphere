package io.shardingsphere.parser.ast.expr;

import io.shardingsphere.parser.ast.expr.pred.Predicate;

public class BooleanPrimary {
	public static final short NONE = -1;
	public static final short ISBOOL = 1;
	public static final short SAFE_EQ = 2;
	public static final short COMPARE = 3;
	public static final short COMPARE_SUBQUERY = 4;

	public static final short COMPARE_SUBQUERY_ALL = 1;
	public static final short COMPARE_SUBQUERY_ANY = 1;

	private BooleanPrimary primary;
	private Predicate predicate;
	private String conjunction;
	private Subquery subquery;
	private short subqueryCompareType = NONE;
	private short type;

	public BooleanPrimary() {
	}

	public BooleanPrimary(BooleanPrimary primary, Predicate predicate, String conjunction, Subquery subquery,
			short subqueryCompareType, short type) {
		this.primary = primary;
		this.predicate = predicate;
		this.conjunction = conjunction;
		this.subquery = subquery;
		this.subqueryCompareType = subqueryCompareType;
		this.type = type;
	}

	public BooleanPrimary getPrimary() {
		return primary;
	}

	public void setPrimary(BooleanPrimary primary) {
		this.primary = primary;
	}

	public Predicate getPredicate() {
		return predicate;
	}

	public void setPredicate(Predicate predicate) {
		this.predicate = predicate;
	}

	public String getConjunction() {
		return conjunction;
	}

	public void setConjunction(String conjunction) {
		this.conjunction = conjunction;
	}

	public Subquery getSubquery() {
		return subquery;
	}

	public void setSubquery(Subquery subquery) {
		this.subquery = subquery;
	}

	public short getSubqueryCompareType() {
		return subqueryCompareType;
	}

	public void setSubqueryCompareType(short subqueryCompareType) {
		this.subqueryCompareType = subqueryCompareType;
	}

	public short getType() {
		return type;
	}

	public void setType(short type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BooleanPrimary: [").append("\n");
		builder.append("type: ").append(type).append("\n");
		if (subqueryCompareType != NONE) {
			builder.append("subqueryCompareType: ").append(subqueryCompareType).append("\n");
		}

		if (primary != null) {
			builder.append("primary: ").append(primary).append("\n");
		}

		if (conjunction != null) {
			builder.append("conjunction: ").append(conjunction).append("\n");
		}

		if (subquery != null) {
			builder.append("subquery: ").append(subquery).append("\n");
		}

		builder.append("] ").append("\n");

		return builder.toString();
	}
}
