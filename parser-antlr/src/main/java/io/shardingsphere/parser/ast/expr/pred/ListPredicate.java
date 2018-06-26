package io.shardingsphere.parser.ast.expr.pred;

import java.util.List;

import io.shardingsphere.parser.ast.expr.BitExpr;
import io.shardingsphere.parser.ast.expr.Expr;

public class ListPredicate extends Predicate {
	private List<Expr> exprs;

	public ListPredicate(BitExpr leftChild, String conjunction, short type, List<Expr> exprs) {
		super(leftChild, conjunction, type);
		this.exprs = exprs;
	}

	public List<Expr> getExprs() {
		return exprs;
	}

	public void setExprs(List<Expr> exprs) {
		this.exprs = exprs;
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

		if (exprs != null) {
			builder.append("exprs: ").append(exprs).append("\n");
		}

		builder.append("] ").append("\n");

		return builder.toString();
	}
}
