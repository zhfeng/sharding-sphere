package io.shardingsphere.revert;

import io.shardingsphere.revert.builder.factory.MySQLBuilderFactory;
import io.shardingsphere.revert.builder.factory.mysql.BuilderFactory;

public class BuilderFactoryProducer {
	public static BuilderFactory getBuilderFactory(int dbType) {
		//TODO judge by dbtype
		return new MySQLBuilderFactory();
	}
}
