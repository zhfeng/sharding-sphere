package io.shardingsphere.revert.builder.mysql;

import org.antlr.v4.runtime.ParserRuleContext;

import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser.FromSingleContext;
import io.shardingsphere.revert.DMLType;
import io.shardingsphere.revert.builder.AbstractSQLPartBuilder;
import io.shardingsphere.revert.builder.factory.SQLPartInfo;
import io.shardingsphere.utils.TreeUtils;

public class DeleteBuilder extends AbstractSQLPartBuilder {
	public DeleteBuilder() {
		this.type = DMLType.DELETE;
	}

	@Override
	public void buildTableAlias(SQLPartInfo sqlPart, ParserRuleContext root) {
		String tableName = getTableFromSingle(root);
		sqlPart.getTableAlias().put(tableName, tableName);
		sqlPart.getUpdateTables().add(tableName);
	}

	private String getTableFromSingle(ParserRuleContext root) {
		FromSingleContext singleCtx = (FromSingleContext) TreeUtils.getFirstDescendant(root, FromSingleContext.class,
				false);
		if (singleCtx != null) {
			if (singleCtx.getChildCount() > 1) {
				return singleCtx.getChild(1).getText();
			}
		}

		return null;
	}
}
