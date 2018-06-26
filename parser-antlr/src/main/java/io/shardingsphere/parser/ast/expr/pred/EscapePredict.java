package io.shardingsphere.parser.ast.expr.pred;

import io.shardingsphere.parser.ast.expr.BaseSimpleExpr;
import io.shardingsphere.parser.ast.expr.BitExpr;

public class EscapePredict extends BitExprPredict {
	private BaseSimpleExpr escapeChild;
	private String escapeConjunction;

	public EscapePredict(BitExpr leftChild, String conjunction, short type, BitExpr rightChild) {
		super(leftChild, conjunction, type, rightChild);
	}

	public EscapePredict(BitExpr leftChild, String conjunction, short type, BitExpr rightChild,
			BaseSimpleExpr escapeChild, String escapeConjunction) {
		super(leftChild, conjunction, type, rightChild);
		this.escapeChild = escapeChild;
		this.escapeConjunction = escapeConjunction;
	}

	public BaseSimpleExpr getEscapeChild() {
		return escapeChild;
	}

	public void setEscapeChild(BaseSimpleExpr escapeChild) {
		this.escapeChild = escapeChild;
	}

	public String getEscapeConjunction() {
		return escapeConjunction;
	}

	public void setEscapeConjunction(String escapeConjunction) {
		this.escapeConjunction = escapeConjunction;
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
		
		if (escapeChild != null) {
			builder.append("escapeChild: ").append(escapeChild).append("\n");
		}

		if (escapeConjunction != null) {
			builder.append("escapeConjunction: ").append(escapeConjunction).append("\n");
		}

		builder.append("] ").append("\n");

		return builder.toString();
	}
}
