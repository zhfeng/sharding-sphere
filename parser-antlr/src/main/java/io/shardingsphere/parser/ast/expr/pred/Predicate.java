package io.shardingsphere.parser.ast.expr.pred;

import io.shardingsphere.parser.ast.expr.BitExpr;

public class Predicate {
	public static final short NONE = -1;
	public static final short SUBQUERY = 1;
	public static final short ARRAY = 2;
	public static final short BETWEEN = 3;
	public static final short SOUNDS = 4;
	public static final short LIKE = 5;
	public static final short REGEXP = 6;

	protected BitExpr leftChild;
	protected String conjunction;
	protected short type = NONE;

	public Predicate(BitExpr leftChild, String conjunction, short type) {
		this.leftChild = leftChild;
		this.conjunction = conjunction;
		this.type = type;
	}

	public BitExpr getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BitExpr leftChild) {
		this.leftChild = leftChild;
	}

	public String getConjunction() {
		return conjunction;
	}

	public void setConjunction(String conjunction) {
		this.conjunction = conjunction;
	}

	public short getType() {
		return type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Predicate: [").append("\n");
		builder.append("type:").append(type).append("\n");
		if (leftChild != null) {
			builder.append("leftChild: ").append(leftChild).append("\n");
		}

		if (conjunction != null) {
			builder.append("conjunction: ").append(conjunction).append("\n");
		}

		builder.append("] ").append("\n");

		return builder.toString();
	}
}
