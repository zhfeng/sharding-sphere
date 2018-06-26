package io.shardingsphere.parser.ast.expr;

public abstract class BaseNode {
	protected String input;
	protected Object value;

	public BaseNode(String input, Object value) {
		this.input = input;
		this.value = value;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
