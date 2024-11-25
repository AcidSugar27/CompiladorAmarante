// Generated from C:/Users/SAMUL/IdeaProjects/AnalizadorSemanticoANTLR/src/Amarante.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AmaranteParser}.
 */
public interface AmaranteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AmaranteParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AmaranteParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmaranteParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AmaranteParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmaranteParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(AmaranteParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmaranteParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(AmaranteParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmaranteParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(AmaranteParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmaranteParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(AmaranteParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmaranteParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(AmaranteParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmaranteParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(AmaranteParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmaranteParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(AmaranteParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmaranteParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(AmaranteParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmaranteParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(AmaranteParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmaranteParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(AmaranteParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmaranteParser#if_else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_stmt(AmaranteParser.If_else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmaranteParser#if_else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_stmt(AmaranteParser.If_else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmaranteParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(AmaranteParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmaranteParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(AmaranteParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmaranteParser#do_while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDo_while_stmt(AmaranteParser.Do_while_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmaranteParser#do_while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDo_while_stmt(AmaranteParser.Do_while_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmaranteParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(AmaranteParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmaranteParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(AmaranteParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmaranteParser#expr_for}.
	 * @param ctx the parse tree
	 */
	void enterExpr_for(AmaranteParser.Expr_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmaranteParser#expr_for}.
	 * @param ctx the parse tree
	 */
	void exitExpr_for(AmaranteParser.Expr_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmaranteParser#declaracion_for}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_for(AmaranteParser.Declaracion_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmaranteParser#declaracion_for}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_for(AmaranteParser.Declaracion_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmaranteParser#expr_boleana}.
	 * @param ctx the parse tree
	 */
	void enterExpr_boleana(AmaranteParser.Expr_boleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmaranteParser#expr_boleana}.
	 * @param ctx the parse tree
	 */
	void exitExpr_boleana(AmaranteParser.Expr_boleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AmaranteParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(AmaranteParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link AmaranteParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(AmaranteParser.Expr_stmtContext ctx);
}