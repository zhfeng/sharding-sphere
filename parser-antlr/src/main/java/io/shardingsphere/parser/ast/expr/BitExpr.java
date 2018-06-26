package io.shardingsphere.parser.ast.expr;

public class BitExpr {
	private BitExpr leftChild;
	private BitExpr rightChild;
	private String conjunction;
	private BaseSimpleExpr simpleExpr;

	public BitExpr(BitExpr leftChild, BitExpr rightChild, String conjunction, BaseSimpleExpr simpleExpr) {
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.conjunction = conjunction;
		this.simpleExpr = simpleExpr;
	}

	public BitExpr getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BitExpr leftChild) {
		this.leftChild = leftChild;
	}

	public BitExpr getRightChild() {
		return rightChild;
	}

	public void setRightChild(BitExpr rightChild) {
		this.rightChild = rightChild;
	}

	public String getConjunction() {
		return conjunction;
	}

	public void setConjunction(String conjunction) {
		this.conjunction = conjunction;
	}

	public BaseSimpleExpr getSimpleExpr() {
		return simpleExpr;
	}

	public void setSimpleExpr(BaseSimpleExpr simpleExpr) {
		this.simpleExpr = simpleExpr;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BitExpr: [").append("\n");
		if (leftChild != null) {
			builder.append("leftChild: ").append(leftChild).append("\n");
		}

		if (conjunction != null) {
			builder.append("conjunction: ").append(conjunction).append("\n");
		}

		if (rightChild != null) {
			builder.append("rightChild: ").append(rightChild).append("\n");
		}

		if (simpleExpr != null) {
			builder.append("simpleExpr: ").append(simpleExpr).append("\n");
		}

		builder.append("] ").append("\n");

		return builder.toString();
	}

}
