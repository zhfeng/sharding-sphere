package io.shardingsphere.parser.ast.expr.pred;

import io.shardingsphere.parser.ast.expr.BitExpr;

public class BitExprPredict extends Predicate {
	protected BitExpr rightChild;

	public BitExprPredict(BitExpr leftChild, String conjunction, short type, BitExpr rightChild) {
		super(leftChild, conjunction, type);
		this.rightChild = rightChild;
	}

	public BitExpr getRightChild() {
		return rightChild;
	}

	public void setRightChild(BitExpr rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BitExprPredict: [").append("\n");
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

		builder.append("] ").append("\n");

		return builder.toString();
	}
}
