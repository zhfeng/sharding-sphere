
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import io.shardingsphere.parser.antlr.mysql.MySQLDMLLexer;
import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser;
import io.shardingsphere.parser.visitor.ExprVisit;

public class MySQLDMLTest {
	public static long parse(String str) throws Exception {

		long beforStart = System.currentTimeMillis();

		CharStream input = CharStreams.fromString(str);
		MySQLDMLLexer lexer = new MySQLDMLLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		MySQLDMLParser parser = new MySQLDMLParser(tokens);
		ParseTree tree = parser.expr();
		ExprVisit visit = new ExprVisit();
		visit.visit(tree);

		System.out.println(tree.toStringTree(parser));

		long span = System.currentTimeMillis() - beforStart;
		return span;
	}

	public static void main(String[] args) throws Exception {
		parse("id+1");
	}

}
