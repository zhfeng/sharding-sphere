package io.shardingsphere.revert.builder.mysql;

import org.antlr.v4.runtime.ParserRuleContext;

import io.shardingsphere.revert.DMLType;
import io.shardingsphere.revert.builder.AbstractSQLPartBuilder;
import io.shardingsphere.revert.builder.factory.SQLPartInfo;

public class InsertBuilder extends AbstractSQLPartBuilder {
	public InsertBuilder() {
		this.type = DMLType.INSERT;
	}

	@Override
	public void buildTableAlias(SQLPartInfo sqlPart, ParserRuleContext root) {
		if (root.getChildCount() > 0) {
			String tableName = root.getChild(1).getText();
			if (tableName.equalsIgnoreCase("into")) {
				tableName = root.getChild(2).getText();
			}
			sqlPart.getTableAlias().put(tableName, tableName);
			sqlPart.getUpdateTables().add(tableName);
		}
	}
	
	protected void buildUpdateConditionString(SQLPartInfo sqlPart, ParserRuleContext root) {
		
	}
}
