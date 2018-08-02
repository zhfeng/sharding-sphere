package io.shardingsphere.revert.builder.mysql;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser.AliasContext;
import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser.ColumnNameContext;
import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser.SetClauseContext;
import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser.TableFactorContext;
import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser.TableNameContext;
import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser.TableReferencesContext;
import io.shardingsphere.revert.DMLType;
import io.shardingsphere.revert.builder.AbstractSQLPartBuilder;
import io.shardingsphere.revert.builder.factory.SQLPartInfo;
import io.shardingsphere.utils.TreeUtils;

public class UpdateBuilder extends AbstractSQLPartBuilder {
	public UpdateBuilder() {
		this.type = DMLType.UPDATE;
	}

	@Override
	public void buildUpdateColumns(SQLPartInfo sqlPart, ParserRuleContext root) {
		SetClauseContext setCtx = (SetClauseContext) TreeUtils.getFirstDescendant(root, SetClauseContext.class, false);
		if (null != setCtx) {
			List<ParseTree> columns = TreeUtils.getAllDescendantByClass(setCtx, ColumnNameContext.class);
			for (ParseTree each : columns) {
				sqlPart.getUpdateColumns().add(each.getText());
			}
		}
	}

	@Override
	public void buildTableAlias(SQLPartInfo sqlPart, ParserRuleContext root) {
		TableReferencesContext tableReferencesCtx = (TableReferencesContext) TreeUtils.getFirstDescendant(root,
				TableReferencesContext.class, false);
		if (tableReferencesCtx != null) {
			List<ParseTree> tableFactorCtxs = TreeUtils.getAllDescendantByClass(tableReferencesCtx,
					TableFactorContext.class);
			for (ParseTree each : tableFactorCtxs) {
				TableNameContext tableNameCtx = (TableNameContext) TreeUtils.getFirstDescendant(each,
						TableNameContext.class, false);

				AliasContext aliasCtx = (AliasContext) TreeUtils.getFirstDescendant(each, AliasContext.class, false);
				String tableName = tableNameCtx.getText();
				String alias = tableName;
				if (aliasCtx != null) {
					alias = aliasCtx.getText();
				}

				if (null == tableName || "".equals(tableName)) {
					if (null != alias && !"".equals(alias)) {
						tableName = alias;
					}
				}

				if (null != tableName && !"".equals(tableName)) {
					sqlPart.getTableAlias().put(alias, tableName);
					sqlPart.getUpdateTables().add(tableName);
				}
			}
		}
	}

}
