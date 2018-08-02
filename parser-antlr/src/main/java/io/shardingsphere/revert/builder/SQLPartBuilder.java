package io.shardingsphere.revert.builder;

import org.antlr.v4.runtime.ParserRuleContext;

import io.shardingsphere.revert.builder.factory.SQLPartInfo;

public interface SQLPartBuilder {
	/**
	 * @param sqlPart
	 * @param root
	 */
	void build(SQLPartInfo sqlPart, ParserRuleContext root);
	
}
