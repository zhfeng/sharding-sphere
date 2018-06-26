package io.shardingsphere.parser.ast.atom;

import java.util.List;

import io.shardingsphere.parser.ast.expr.BaseSimpleExpr;
import io.shardingsphere.parser.ast.expr.Expr;

public class FunctionCall implements BaseSimpleExpr {
	private String methodName;
	private List<Expr> params;
	
	public FunctionCall(String methodName, List<Expr> params) {
		this.methodName = methodName;
		this.params = params;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public List<Expr> getParams() {
		return params;
	}

	public void setParams(List<Expr> params) {
		this.params = params;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FunctionCall: [").append("\n");
		builder.append("methodName: ").append(methodName).append("\n");
		

		if (params != null) {
			builder.append("params: ").append(params).append("\n");
		}

		builder.append("] ").append("\n");

		return builder.toString();
	}
}
