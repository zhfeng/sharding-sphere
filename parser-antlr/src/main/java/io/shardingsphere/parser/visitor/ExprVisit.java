package io.shardingsphere.parser.visitor;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import io.shardingsphere.parser.antlr.mysql.MySQLDMLBaseVisitor;
import io.shardingsphere.parser.antlr.mysql.MySQLDMLParser;
import io.shardingsphere.parser.ast.atom.FunctionCall;
import io.shardingsphere.parser.ast.atom.Id;
import io.shardingsphere.parser.ast.atom.Liter;
import io.shardingsphere.parser.ast.atom.LiterWithCharset;
import io.shardingsphere.parser.ast.expr.BaseSimpleExpr;
import io.shardingsphere.parser.ast.expr.BitExpr;
import io.shardingsphere.parser.ast.expr.BooleanPrimary;
import io.shardingsphere.parser.ast.expr.Expr;
import io.shardingsphere.parser.ast.expr.RowListExpr;
import io.shardingsphere.parser.ast.expr.SimpleExpr;
import io.shardingsphere.parser.ast.expr.Subquery;
import io.shardingsphere.parser.ast.expr.pred.BetweenPredicate;
import io.shardingsphere.parser.ast.expr.pred.BitExprPredict;
import io.shardingsphere.parser.ast.expr.pred.EscapePredict;
import io.shardingsphere.parser.ast.expr.pred.ListPredicate;
import io.shardingsphere.parser.ast.expr.pred.Predicate;
import io.shardingsphere.parser.ast.expr.pred.SubqueryPredicate;

public class ExprVisit extends MySQLDMLBaseVisitor<Object> {
	public Expr visitExpr(MySQLDMLParser.ExprContext ctx) {
		System.out.println(ctx.getText());
		int count = ctx.getChildCount();
		if (count == 1) {
			Expr expr = new Expr();
			BooleanPrimary primary = this
					.visitBooleanPrimary((MySQLDMLParser.BooleanPrimaryContext) ctx.getChild(0));
			expr.setPrimary(primary);
			return expr;
		} else {
			Expr leftChild = null;
			Expr rightChild = null;
			TerminalNode node = null;
			if (count == 2) {
				node = (TerminalNode) ctx.getChild(0);
				rightChild = this.visitExpr((MySQLDMLParser.ExprContext) ctx.getChild(1));
			} else {
				leftChild = this.visitExpr((MySQLDMLParser.ExprContext) ctx.getChild(0));
				node = (TerminalNode) ctx.getChild(1);
				rightChild = this.visitExpr((MySQLDMLParser.ExprContext) ctx.getChild(2));
			}

			return new Expr(leftChild, rightChild, node.getSymbol().getText(), null, node.getSymbol().getType());
		}
	}

	/*
	 * 
	 * 
	 */
	public BooleanPrimary visitBooleanPrimary(MySQLDMLParser.BooleanPrimaryContext ctx) {
		BooleanPrimary primary = new BooleanPrimary();
		int count = ctx.getChildCount();
		if (count == 1) {
			Predicate predicate = visitPredicate((MySQLDMLParser.PredicateContext) ctx.getChild(0));
			primary.setPredicate(predicate);
			return primary;
		}

		BooleanPrimary primaryChild = visitBooleanPrimary((MySQLDMLParser.BooleanPrimaryContext) ctx.getChild(0));
		ParseTree tree = ctx.getChild(1);
		short type = BooleanPrimary.NONE;
		Predicate predicate = null;
		String conjunction = null;
		Subquery subquery = null;
		short subqueryCompareType = BooleanPrimary.NONE;

		if (tree instanceof TerminalNode) {
			TerminalNode termNode = (TerminalNode) tree;
			conjunction = termNode.getSymbol().getText();
			if (termNode.getSymbol().getType() == MySQLDMLParser.IS) {
				type = BooleanPrimary.ISBOOL;
				for (int i = 2; i < count; i++) {
					TerminalNode node = (TerminalNode) ctx.getChild(i);
					conjunction = conjunction + " " + node.getSymbol().getText();
				}
			} else {
				type = BooleanPrimary.SAFE_EQ;
				predicate = visitPredicate((MySQLDMLParser.PredicateContext) ctx.getChild(2));
			}
		} else {
			ParseTree compareOpTree = ctx.getChild(1);
			conjunction = compareOpTree.getText();
			if (count == 4) {
				type = BooleanPrimary.COMPARE_SUBQUERY;
				TerminalNode termNode = (TerminalNode) ctx.getChild(2);
				conjunction = conjunction + " " + termNode.getText();
				if (termNode.getSymbol().getType() == MySQLDMLParser.ALL) {
					subqueryCompareType = BooleanPrimary.COMPARE_SUBQUERY_ALL;
				} else {
					subqueryCompareType = BooleanPrimary.COMPARE_SUBQUERY_ANY;
				}
				subquery = visitSubquery((MySQLDMLParser.SubqueryContext) ctx.getChild(3));
			} else {
				type = BooleanPrimary.COMPARE;
				predicate = visitPredicate((MySQLDMLParser.PredicateContext) ctx.getChild(2));
			}
		}

		return new BooleanPrimary(primaryChild, predicate, conjunction, subquery, subqueryCompareType, type);
	}

	// bitExpr NOT? IN subquery
	// | bitExpr NOT? IN '('expr (',' expr)*')'
	// | bitExpr NOT? BETWEEN bitExpr AND predicate
	// | bitExpr SOUNDS LIKE bitExpr
	// | bitExpr NOT? LIKE simpleExpr (ESCAPE simpleExpr)*
	// | bitExpr NOT? REGEXP bitExpr
	// | bitExpr
	@Override
	public Predicate visitPredicate(MySQLDMLParser.PredicateContext ctx) {
		String conjunction = null;
		BitExpr bitExpr = visitBitExpr((MySQLDMLParser.BitExprContext) ctx.getChild(0));
		int count = ctx.getChildCount();
		if (count == 1) {
			return new Predicate(bitExpr, null, Predicate.NONE);
		}

		TerminalNode connNode1 = (TerminalNode) ctx.getChild(1);
		TerminalNode connNode = connNode1;
		conjunction = connNode1.getText();
		int startPos = 2;
		if (connNode1.getSymbol().getType() == MySQLDMLParser.NOT) {
			connNode = (TerminalNode) ctx.getChild(2);
			conjunction = conjunction + " " + connNode.getText();
			startPos = 3;
		}

		if (connNode.getSymbol().getType() == MySQLDMLParser.BETWEEN) {
			BitExpr betweenChild = visitBitExpr((MySQLDMLParser.BitExprContext) ctx.getChild(startPos));
			String andConjunction = ctx.getChild(startPos + 1).getText();
			Predicate andChild = visitPredicate((MySQLDMLParser.PredicateContext) ctx.getChild(startPos + 2));
			return new BetweenPredicate(bitExpr, conjunction, Predicate.BETWEEN, betweenChild, andConjunction,
					andChild);
		} else if (connNode.getSymbol().getType() == MySQLDMLParser.SOUNDS) {
			BitExpr rightChild = visitBitExpr((MySQLDMLParser.BitExprContext) ctx.getChild(startPos));
			return new BitExprPredict(bitExpr, conjunction, Predicate.SOUNDS, rightChild);
		} else if (connNode.getSymbol().getType() == MySQLDMLParser.LIKE) {
			BitExpr rightChild = visitBitExpr((MySQLDMLParser.BitExprContext) ctx.getChild(startPos));
			String escapeConjunction = ctx.getChild(startPos + 1).getText();
			BaseSimpleExpr escapeChild = visitSimpleExpr(
					(MySQLDMLParser.SimpleExprContext) ctx.getChild(startPos + 2));
			return new EscapePredict(bitExpr, conjunction, Predicate.LIKE, rightChild, escapeChild, escapeConjunction);
		} else if (connNode.getSymbol().getType() == MySQLDMLParser.REGEXP) {
			BitExpr rightChild = visitBitExpr((MySQLDMLParser.BitExprContext) ctx.getChild(startPos));
			return new BitExprPredict(bitExpr, conjunction, Predicate.REGEXP, rightChild);
		}

		ParseTree tree = ctx.getChild(startPos);
		if (tree instanceof MySQLDMLParser.SubqueryContext) {
			Subquery subquery = visitSubquery((MySQLDMLParser.SubqueryContext) tree);
			return new SubqueryPredicate(bitExpr, conjunction, Predicate.SUBQUERY, subquery);
		}

		List<Expr> exprs = getExprsFromParseTree(ctx, startPos);
		if (!exprs.isEmpty()) {
			return new ListPredicate(bitExpr, conjunction, Predicate.ARRAY, exprs);
		}

		return null;
	}

	private List<Expr> getExprsFromParseTree(ParseTree ctx, int startPos) {
		List<Expr> exprs = new ArrayList<Expr>();
		for (int i = startPos; i < ctx.getChildCount(); i++) {
			ParseTree temp = ctx.getChild(i);
			if (temp instanceof MySQLDMLParser.ExprContext) {
				exprs.add(visitExpr((MySQLDMLParser.ExprContext) temp));
			}
		}

		return exprs;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public BitExpr visitBitExpr(MySQLDMLParser.BitExprContext ctx) {
		int count = ctx.getChildCount();
		int pos = 0;
		if (count == 1) {
			BaseSimpleExpr simpleExpr = visitSimpleExpr((MySQLDMLParser.SimpleExprContext) ctx.getChild(pos++));
			return new BitExpr(null, null, "", simpleExpr);
		} else {
			BitExpr leftChild = visitBitExpr((MySQLDMLParser.BitExprContext) ctx.getChild(pos++));
			String conjunction = ctx.getChild(pos++).getText();
			BitExpr rigthChild = visitBitExpr((MySQLDMLParser.BitExprContext) ctx.getChild(pos++));
			return new BitExpr(leftChild, rigthChild, conjunction, null);
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * 
	 * | functionCall | liter | ID | simpleExpr collateClause //| param_marker
	 * 
	 * //| variable | simpleExpr '||' simpleExpr | '+' simpleExpr | '-' simpleExpr |
	 * '~' simpleExpr | '!' simpleExpr | BINARY simpleExpr |'(' expr ')' | ROW
	 * '('expr(',' expr)*')' | subquery | EXISTS subquery // | (identifier expr) //|
	 * match_expr //| case_expr // | interval_expr
	 * </p>
	 */
	@Override
	public BaseSimpleExpr visitSimpleExpr(MySQLDMLParser.SimpleExprContext ctx) {
		int count = ctx.getChildCount();
		int pos = 0;
		ParseTree tree = ctx.getChild(pos);

		if (tree instanceof MySQLDMLParser.SubqueryContext) {
			Subquery rightChild = visitSubquery((MySQLDMLParser.SubqueryContext) tree);
			return new SimpleExpr(null, rightChild, null);
		}

		if (tree instanceof TerminalNode) {
			TerminalNode node = (TerminalNode) tree;
			if (node.getSymbol().getType() == MySQLDMLParser.ID) {
				return new Id(node.getText(), node.getText());
			}

			if (node.getSymbol().getType() == MySQLDMLParser.ROW) {
				List<Expr> exprs = getExprsFromParseTree(ctx, pos + 1);
				return new RowListExpr(exprs);
			}
		}

		if (tree instanceof MySQLDMLParser.FunctionCallContext) {
			return visitFunctionCall((MySQLDMLParser.FunctionCallContext) tree);
		} else if (tree instanceof MySQLDMLParser.LiterContext) {
			return visitLiter((MySQLDMLParser.LiterContext) tree);
		}

		if (count == 2) {
			ParseTree secondNode = ctx.getChild(pos + 1);
			if (tree instanceof MySQLDMLParser.SimpleExprContext) {
				if (secondNode instanceof TerminalNode) {
					TerminalNode termNode = (TerminalNode) secondNode;
					BaseSimpleExpr leftChild = visitSimpleExpr((MySQLDMLParser.SimpleExprContext) ctx);
					return new SimpleExpr(leftChild, null, termNode.getText());
				}
			}

			if (tree instanceof TerminalNode) {
				if (secondNode instanceof MySQLDMLParser.SimpleExprContext) {
					BaseSimpleExpr rightChild = visitSimpleExpr((MySQLDMLParser.SimpleExprContext) secondNode);
					return new SimpleExpr(null, rightChild, tree.getText());
				}

				TerminalNode fisrtNode = (TerminalNode) tree;
				if (fisrtNode.getSymbol().getType() == MySQLDMLParser.EXISTS) {
					if (secondNode instanceof MySQLDMLParser.SubqueryContext) {
						Subquery rightChild = visitSubquery((MySQLDMLParser.SubqueryContext) secondNode);
						return new SimpleExpr(null, rightChild, tree.getText());
					}
				}
			}

		}
		return null;
	}

	@Override
	public Liter visitLiter(MySQLDMLParser.LiterContext ctx) {
		TerminalNode node = (TerminalNode) ctx.getChild(0);
		short type = Liter.NONE;
		int nodeType = node.getSymbol().getType();
		if (nodeType == MySQLDMLParser.NUMBER) {
			type = Liter.NUMBER;
			return new Liter(node.getText(), new BigDecimal(node.getText()), type);
		} else if (nodeType == MySQLDMLParser.TRUE) {
			return new Liter(node.getText(), Boolean.TRUE, Liter.TRUE);
		} else if (nodeType == MySQLDMLParser.FALSE) {
			return new Liter(node.getText(), Boolean.FALSE, Liter.FALSE);
		} else if (nodeType == MySQLDMLParser.NULL) {
			return new Liter(node.getText(), null, Liter.NULL);
		} else if (nodeType == MySQLDMLParser.LEFT_BRACE) {
			String dateString = ctx.getChild(2).getText();
			if(dateString != null && dateString.length() > 2) {
				dateString = dateString.substring(1, dateString.length() - 1 );
				// TODO Date convert
				String input = "";
				for (int i = 0; i < ctx.getChildCount(); i++) {
					input = " " + ctx.getChild(i);
				}
				return new Liter(input, Date.valueOf(dateString), Liter.ODBC_TIME);
			}
		} else if (nodeType == MySQLDMLParser.DATE || nodeType == MySQLDMLParser.TIME
				|| nodeType == MySQLDMLParser.TIMESTAMP) {
			String dateString = ctx.getChild(1).getText();
			if(dateString != null && dateString.length() > 2) {
				dateString = dateString.substring(1, dateString.length() - 1 );
				// TODO Date convert
				String input = "";
				for (int i = 0; i < ctx.getChildCount(); i++) {
					input = " " + ctx.getChild(i);
				}

				return new Liter(input, Date.valueOf(dateString), Liter.MYSQL_TIME);
			}
		}

		String charsetName = null;
		String suffix = null;
		int pos = 0;
		if (nodeType == MySQLDMLParser.ID) {
			charsetName = node.getText();
			pos++;
		}

		TerminalNode valueNode = (TerminalNode) ctx.getChild(pos);
		String string = valueNode.getText();
		type = Liter.BIT_WITH_CHARSET;
		if (valueNode.getSymbol().getType() == MySQLDMLParser.STRING) {
			type = Liter.STRING_WITH_CHARSET;
		}

		if (pos == 1 && ctx.getChildCount() > 1) {
			suffix = ctx.getChild(pos + 1).getText();
		}

		return new LiterWithCharset(charsetName, string, suffix, type);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public Object visitCollateClause(MySQLDMLParser.CollateClauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public FunctionCall visitFunctionCall(MySQLDMLParser.FunctionCallContext ctx) {
		int pos = 0;
		String methodName = ctx.getChild(pos++).getText();
		List<Expr> exprs = getExprsFromParseTree(ctx, pos);
		return new FunctionCall(methodName, exprs);
	}

	public Subquery visitSubquery(MySQLDMLParser.SubqueryContext ctx) {
		return null;
	}
}
