// Generated from C:/Users/SAMUL/IdeaProjects/AnalizadorSemanticoANTLR/src/Amarante.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AmaranteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AmaranteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AmaranteParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(AmaranteParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmaranteParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(AmaranteParser.SentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmaranteParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(AmaranteParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmaranteParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(AmaranteParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmaranteParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(AmaranteParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmaranteParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(AmaranteParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmaranteParser#if_else_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_stmt(AmaranteParser.If_else_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmaranteParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(AmaranteParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmaranteParser#do_while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_stmt(AmaranteParser.Do_while_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmaranteParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(AmaranteParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmaranteParser#expr_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_for(AmaranteParser.Expr_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmaranteParser#declaracion_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_for(AmaranteParser.Declaracion_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmaranteParser#expr_boleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_boleana(AmaranteParser.Expr_boleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AmaranteParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(AmaranteParser.Expr_stmtContext ctx);
}