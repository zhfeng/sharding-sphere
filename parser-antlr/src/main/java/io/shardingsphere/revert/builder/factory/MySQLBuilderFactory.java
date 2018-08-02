
package io.shardingsphere.revert.builder.factory;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import io.shardingsphere.parser.antlr.mysql.MySQLDMLLexer;
import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser;
import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser.DeleteContext;
import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser.InsertContext;
import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser.UpdateContext;
import io.shardingsphere.revert.builder.SQLPartBuilder;
import io.shardingsphere.revert.builder.factory.mysql.AbstractBuilderFactory;
import io.shardingsphere.revert.builder.mysql.DeleteBuilder;
import io.shardingsphere.revert.builder.mysql.InsertBuilder;
import io.shardingsphere.revert.builder.mysql.UpdateBuilder;

public class MySQLBuilderFactory extends AbstractBuilderFactory {

	@Override
	protected ParserRuleContext getRoot(String sql) {
		CharStream input = CharStreams.fromString(sql);
		MySQLDMLLexer lexer = new MySQLDMLLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		MySQLDMLParser parser = new MySQLDMLParser(tokens);
		ParseTree tree = parser.execute();
		if (tree != null) {
			if (tree instanceof ParserRuleContext) {
				return (ParserRuleContext) tree.getChild(0);
			}
		}

		return null;
	}

	public SQLPartBuilder getBuilder(ParserRuleContext root) {
		if (root instanceof InsertContext) {
			return new InsertBuilder();
		} else if (root instanceof UpdateContext) {
			return new UpdateBuilder();
		} else if (root instanceof DeleteContext) {
			return new DeleteBuilder();
		} else {
			throw new RuntimeException("sql revert does not support the sql");
		}
	}
}
