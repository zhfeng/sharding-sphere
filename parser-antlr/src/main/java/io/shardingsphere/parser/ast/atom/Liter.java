package io.shardingsphere.parser.ast.atom;

import io.shardingsphere.parser.ast.expr.BaseNode;
import io.shardingsphere.parser.ast.expr.BaseSimpleExpr;

public class Liter extends BaseNode implements BaseSimpleExpr {
	public static final short NUMBER = 1;
	public static final short TRUE = 2;
	public static final short FALSE = 3;
	public static final short NULL = 4;

	public static final short ODBC_TIME = 5;
	public static final short MYSQL_TIME = 6;
	public static final short HEX = 7;
	public static final short STRING_WITH_CHARSET = 8;
	public static final short BIT_WITH_CHARSET = 9;

	private short type = NONE;

	public Liter(String input, Object value, short type) {
		super(input, value);
		this.type = type;
	}

	public short getType() {
		return type;
	}

	public void setType(short type) {
		this.type = type;
	}
}
