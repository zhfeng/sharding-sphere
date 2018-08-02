package io.shardingsphere.revert.builder.factory.mysql;

import io.shardingsphere.revert.builder.factory.SQLPartInfo;

public interface BuilderFactory {
	/**build dml sql statement 
	 * @param root
	 * @return
	 */
	SQLPartInfo build(String sql);
}
