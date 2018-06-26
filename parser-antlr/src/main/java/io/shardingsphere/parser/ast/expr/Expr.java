package io.shardingsphere.parser.ast.expr;

public class Expr {
	private Expr leftChild;
	private Expr rightChild;
	private String conjunction;
	private BooleanPrimary primary;
	private int type;

	public Expr() {

	}

	public Expr(Expr leftChild, Expr rightChild, String conjunction, BooleanPrimary primary, int type) {
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.conjunction = conjunction;
		this.primary = primary;
		this.type = type;
	}

	public Expr getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Expr leftChild) {
		this.leftChild = leftChild;
	}

	public Expr getRightChild() {
		return rightChild;
	}

	public void setRightChild(Expr rightChild) {
		this.rightChild = rightChild;
	}

	public String getConjunction() {
		return conjunction;
	}

	public void setConjunction(String conjunction) {
		this.conjunction = conjunction;
	}

	public BooleanPrimary getPrimary() {
		return primary;
	}

	public void setPrimary(BooleanPrimary primary) {
		this.primary = primary;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Expr: [").append("\n");
		builder.append("type:").append(type).append("\n");
		if (leftChild != null) {
			builder.append("leftChild: ").append(leftChild).append("\n");
		}

		if (conjunction != null) {
			builder.append("conjunction: ").append(conjunction).append("\n");
		}

		if (rightChild != null) {
			builder.append("rightChild: ").append(rightChild).append("\n");
		}

		if (primary != null) {
			builder.append("primary: ").append(primary).append("\n");
		}

		builder.append("] ").append("\n");

		return builder.toString();
	}

}
