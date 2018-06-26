package io.shardingsphere.parser.ast.atom;

import io.shardingsphere.parser.ast.expr.BaseSimpleExpr;

public class LiterWithCharset extends Liter implements BaseSimpleExpr {
	private String charsetName;
	private String string;
	private String suffix;

	public LiterWithCharset(String charsetName, String string, String suffix, short type) {
		super(null, null, type);
		this.charsetName = charsetName;
		this.string = string;
		this.suffix = suffix;
	}

	public String getCharsetName() {
		return charsetName;
	}

	public void setCharsetName(String charsetName) {
		this.charsetName = charsetName;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
}
