package io.shardingsphere.revert.builder;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser;
import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser.WhereClauseContext;
import io.shardingsphere.revert.DMLType;
import io.shardingsphere.revert.builder.factory.SQLPartInfo;
import io.shardingsphere.utils.TreeUtils;

public class AbstractSQLPartBuilder implements SQLPartBuilder {
	protected DMLType type;

	@Override
	public void build(SQLPartInfo sqlPart, ParserRuleContext root) {
		sqlPart.setType(type);
		buildUpdateColumns(sqlPart, root);
		buildUpdateTables(sqlPart, root);
		buildTableAlias(sqlPart, root);
		buildUpdateConditionString(sqlPart, root);
	}

	/**
	 * @param sqlPart
	 * @param root
	 */
	protected void buildUpdateColumns(SQLPartInfo sqlPart, ParserRuleContext root) {

	}

	/**
	 * @param sqlPart
	 * @param root
	 */
	protected void buildUpdateTables(SQLPartInfo sqlPart, ParserRuleContext root) {

	}

	/**
	 * @param sqlPart
	 * @param root
	 */
	protected void buildTableAlias(SQLPartInfo sqlPart, ParserRuleContext root) {

	}

	/**
	 * @param sqlPart
	 * @param root
	 */
	protected void buildUpdateConditionString(SQLPartInfo sqlPart, ParserRuleContext root) {
		WhereClauseContext where = (WhereClauseContext) TreeUtils.getFirstDescendant(root, WhereClauseContext.class,
				false);
		
		
		if (where != null) {
			ParserRuleContext exprCtx = (ParserRuleContext)where.getChild(1);
			String expr = sqlPart.getSql().substring(exprCtx.getStart().getStartIndex(), exprCtx.getStop().getStartIndex());
			sqlPart.setUpdateConditionString(expr);
		}
		
		List<TerminalNode> allParams = TreeUtils.getAllTerminalByType(where, MySQLDMLParser.QUESTION);
		int paramCount = allParams.size();
		if(allParams.size() > 0) {
			List<TerminalNode> whereParams = TreeUtils.getAllTerminalByType(where, MySQLDMLParser.QUESTION);
			int whereParamCount = 0;
			if (where != null) {
				whereParamCount = whereParams.size();
			}
			
			sqlPart.getWhereParamIndexRange().add(paramCount - whereParamCount);
			sqlPart.getWhereParamIndexRange().add(paramCount - 1);
			
		}
	}

}
