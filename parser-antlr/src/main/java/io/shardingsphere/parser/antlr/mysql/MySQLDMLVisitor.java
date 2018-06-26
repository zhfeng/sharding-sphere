// Generated from MySQLDML.g4 by ANTLR 4.7.1

	package io.shardingsphere.parser.antlr.mysql;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MySQLDMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MySQLDMLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#selectSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpec(MySQLDMLParser.SelectSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MySQLDMLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimary(MySQLDMLParser.BooleanPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(MySQLDMLParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(MySQLDMLParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(MySQLDMLParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(MySQLDMLParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#liter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiter(MySQLDMLParser.LiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#collateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateClause(MySQLDMLParser.CollateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MySQLDMLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#tableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferences(MySQLDMLParser.TableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(MySQLDMLParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#tableFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFactor(MySQLDMLParser.TableFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(MySQLDMLParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#joinTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinTable(MySQLDMLParser.JoinTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#joinCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCondition(MySQLDMLParser.JoinConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#indexHintList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHintList(MySQLDMLParser.IndexHintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#indexHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHint(MySQLDMLParser.IndexHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#deleteClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteClause(MySQLDMLParser.DeleteClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#fromSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromSingle(MySQLDMLParser.FromSingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#fromMulti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromMulti(MySQLDMLParser.FromMultiContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#deleteSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteSpec(MySQLDMLParser.DeleteSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(MySQLDMLParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#insertClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertClause(MySQLDMLParser.InsertClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#insertSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSpec(MySQLDMLParser.InsertSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#partitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionClause(MySQLDMLParser.PartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#columnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnClause(MySQLDMLParser.ColumnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#valueClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueClause(MySQLDMLParser.ValueClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#setClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetClause(MySQLDMLParser.SetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#onDuplicateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnDuplicateClause(MySQLDMLParser.OnDuplicateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#itemListWithEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemListWithEmpty(MySQLDMLParser.ItemListWithEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(MySQLDMLParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MySQLDMLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MySQLDMLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueList(MySQLDMLParser.ValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#updateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateClause(MySQLDMLParser.UpdateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#updateSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSpec(MySQLDMLParser.UpdateSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(MySQLDMLParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(MySQLDMLParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#selectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpression(MySQLDMLParser.SelectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(MySQLDMLParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(MySQLDMLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(MySQLDMLParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(MySQLDMLParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(MySQLDMLParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(MySQLDMLParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#groupByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(MySQLDMLParser.GroupByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(MySQLDMLParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#rangeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeClause(MySQLDMLParser.RangeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(MySQLDMLParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#selectExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpr(MySQLDMLParser.SelectExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(MySQLDMLParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(MySQLDMLParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(MySQLDMLParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(MySQLDMLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(MySQLDMLParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLDMLParser#itemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemList(MySQLDMLParser.ItemListContext ctx);
}