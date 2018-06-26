package io.shardingsphere.parser.ast.expr.pred;

import io.shardingsphere.parser.ast.expr.BitExpr;

public class BetweenPredicate extends Predicate {
	private BitExpr betweenChild;
	private String andConjunction;
	private Predicate andChild;

	public BetweenPredicate(BitExpr leftChild, String conjunction, short type, BitExpr betweenChild,
			String andConjunction, Predicate andChild) {
		super(leftChild, conjunction, type);
		this.betweenChild = betweenChild;
		this.andConjunction = andConjunction;
		this.andChild = andChild;
	}

	public BitExpr getBetweenChild() {
		return betweenChild;
	}

	public void setBetweenChild(BitExpr betweenChild) {
		this.betweenChild = betweenChild;
	}

	public String getAndConjunction() {
		return andConjunction;
	}

	public void setAndConjunction(String andConjunction) {
		this.andConjunction = andConjunction;
	}

	public Predicate getAndChild() {
		return andChild;
	}

	public void setAndChild(Predicate andChild) {
		this.andChild = andChild;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BetweenPredicate: [").append("\n");
		builder.append("type:").append(type).append("\n");
		if (leftChild != null) {
			builder.append("leftChild: ").append(leftChild).append("\n");
		}

		if (conjunction != null) {
			builder.append("conjunction: ").append(conjunction).append("\n");
		}
		if (betweenChild != null) {
			builder.append("betweenChild: ").append(betweenChild).append("\n");
		}

		if (andConjunction != null) {
			builder.append("andConjunction: ").append(andConjunction).append("\n");
		}

		if (andChild != null) {
			builder.append("andChild: ").append(andChild).append("\n");
		}

		builder.append("] ").append("\n");

		return builder.toString();
	}
}
