// Generated from DMLBase.g4 by ANTLR 4.7.1
package io.shardingsphere.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DMLBaseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DMLBaseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(DMLBaseParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#selectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpression(DMLBaseParser.SelectExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(DMLBaseParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#selectSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpec(DMLBaseParser.SelectSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(DMLBaseParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#tableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferences(DMLBaseParser.TableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(DMLBaseParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(DMLBaseParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(DMLBaseParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(DMLBaseParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#groupByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(DMLBaseParser.GroupByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(DMLBaseParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#rangeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeClause(DMLBaseParser.RangeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(DMLBaseParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#selectExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpr(DMLBaseParser.SelectExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(DMLBaseParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#deleteClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteClause(DMLBaseParser.DeleteClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#partitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionClause(DMLBaseParser.PartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(DMLBaseParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#updateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateClause(DMLBaseParser.UpdateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#updateSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSpec(DMLBaseParser.UpdateSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#setClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetClause(DMLBaseParser.SetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(DMLBaseParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DMLBaseParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(DMLBaseParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(DMLBaseParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(DMLBaseParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(DMLBaseParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DMLBaseParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#itemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemList(DMLBaseParser.ItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DMLBaseParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(DMLBaseParser.ItemContext ctx);
}