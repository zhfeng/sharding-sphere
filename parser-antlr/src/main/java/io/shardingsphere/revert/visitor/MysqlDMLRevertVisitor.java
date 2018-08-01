
package io.shardingsphere.revert.visitor;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import io.shardingsphere.parser.antlr.mysql.MySQLDMLLexer;
import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser;
import io.shardingsphere.revert.visitor.mysql.DMLRevertVisitor;

public class MysqlDMLRevertVisitor implements DMLRevertVisitor {

	@Override
	public ParserRuleContext getRoot(String sql) {
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

	@Override
	public SQLPartInfo visit(ParserRuleContext root) {
		// TODO Auto-generated method stub
		return null;
	}

}
