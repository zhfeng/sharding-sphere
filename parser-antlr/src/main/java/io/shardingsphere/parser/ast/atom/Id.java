package io.shardingsphere.parser.ast.atom;

import io.shardingsphere.parser.ast.expr.BaseNode;
import io.shardingsphere.parser.ast.expr.BaseSimpleExpr;

public class Id extends BaseNode implements BaseSimpleExpr{

	public Id(String input, Object value) {
		super(input, value);
	}

}
