package io.shardingsphere.parser.ast.expr;

import java.util.List;

public class RowListExpr implements BaseSimpleExpr {
	private List<Expr> exprs;

	public RowListExpr(List<Expr> exprs) {
		super();
		this.exprs = exprs;
	}

	public List<Expr> getExprs() {
		return exprs;
	}

	public void setExprs(List<Expr> exprs) {
		this.exprs = exprs;
	}
}
