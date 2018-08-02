package io.shardingsphere.revert.builder.factory.mysql;

import org.antlr.v4.runtime.ParserRuleContext;

import io.shardingsphere.revert.builder.SQLPartBuilder;
import io.shardingsphere.revert.builder.factory.SQLPartInfo;

public abstract class AbstractBuilderFactory implements BuilderFactory {

	/**
	 * @param sql
	 * @return
	 */
	protected abstract ParserRuleContext getRoot(String sql);

	/**
	 * @param root
	 * @return
	 */
	protected abstract SQLPartBuilder getBuilder(ParserRuleContext root);

	/* (non-Javadoc)
	 * @see io.shardingsphere.revert.builder.factory.mysql.BuilderFactory#build(java.lang.String)
	 */
	@Override
	public final SQLPartInfo build(String sql) {
		ParserRuleContext root = getRoot(sql);

		SQLPartInfo sqlPart = new SQLPartInfo();
		sqlPart.setSql(sql);
		SQLPartBuilder builder = getBuilder(root);
		builder.build(sqlPart, root);
		return sqlPart;
	}

}
