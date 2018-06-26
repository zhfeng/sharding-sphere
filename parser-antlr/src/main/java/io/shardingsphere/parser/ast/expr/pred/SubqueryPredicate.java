package io.shardingsphere.parser.ast.expr.pred;

import io.shardingsphere.parser.ast.expr.BitExpr;
import io.shardingsphere.parser.ast.expr.Subquery;

public class SubqueryPredicate extends Predicate{
	private Subquery rightChild;
	
	public SubqueryPredicate(BitExpr leftChild, String conjunction, short type,Subquery rightChild) {
		super(leftChild,conjunction,type);
		this.rightChild = rightChild;
	}

	public Subquery getRightChild() {
		return rightChild;
	}

	public void setRightChild(Subquery rightChild) {
		this.rightChild = rightChild;
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
		
		if (rightChild != null) {
			builder.append("rightChild: ").append(rightChild).append("\n");
		}

		builder.append("] ").append("\n");

		return builder.toString();
	}
}
