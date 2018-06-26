package io.shardingsphere.parser.ast.expr;

public class SimpleExpr extends BaseNode implements BaseSimpleExpr {
	private BaseSimpleExpr leftChild;
	private Object rightChild;
	private String conjunction;

	public SimpleExpr(String input, Object value) {
		super(input, value);
	}

	public SimpleExpr(BaseSimpleExpr leftChild, BaseSimpleExpr rightChild, String conjunction) {
		super(null, null);
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.conjunction = conjunction;
	}

	public BaseSimpleExpr getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BaseSimpleExpr leftChild) {
		this.leftChild = leftChild;
	}

	public Object getRightChild() {
		return rightChild;
	}

	public void setRightChild(BaseSimpleExpr rightChild) {
		this.rightChild = rightChild;
	}

	public String getConjunction() {
		return conjunction;
	}

	public void setConjunction(String conjunction) {
		this.conjunction = conjunction;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SimpleExpr: [").append("\n");
		if (leftChild != null) {
			builder.append("leftChild: ").append(leftChild).append("\n");
		}

		if (conjunction != null) {
			builder.append("conjunction: ").append(conjunction).append("\n");
		}

		if (rightChild != null) {
			builder.append("rightChild: ").append(rightChild).append("\n");
		}

		if (input != null) {
			builder.append("input: ").append(input).append("\n");
		}

		if (value != null) {
			builder.append("value: ").append(value).append("\n");
		}

		builder.append("] ").append("\n");

		return builder.toString();
	}
}
