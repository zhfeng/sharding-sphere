package io.shardingsphere.parser.ast.expr;

public class ExprWithBracket implements BaseSimpleExpr {
	private String leftBracket;
	private Expr expr;
	private String rightBracket;

	public String getLeftBracket() {
		return leftBracket;
	}

	public void setLeftBracket(String leftBracket) {
		this.leftBracket = leftBracket;
	}

	public Expr getExpr() {
		return expr;
	}

	public void setExpr(Expr expr) {
		this.expr = expr;
	}

	public String getRightBracket() {
		return rightBracket;
	}

	public void setRightBracket(String rightBracket) {
		this.rightBracket = rightBracket;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExprWithBracket: [").append("\n");
		if (leftBracket != null) {
			builder.append("leftBracket: ").append(leftBracket).append("\n");
		}

		if (expr != null) {
			builder.append("expr: ").append(expr).append("\n");
		}

		if (rightBracket != null) {
			builder.append("rightBracket: ").append(rightBracket).append("\n");
		}

		builder.append("] ").append("\n");

		return builder.toString();
	}

}
