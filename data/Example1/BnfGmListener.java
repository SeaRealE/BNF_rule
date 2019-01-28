// Generated from BnfGm.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BnfGmParser}.
 */
public interface BnfGmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BnfGmParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(BnfGmParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfGmParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(BnfGmParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfGmParser#declar}.
	 * @param ctx the parse tree
	 */
	void enterDeclar(BnfGmParser.DeclarContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfGmParser#declar}.
	 * @param ctx the parse tree
	 */
	void exitDeclar(BnfGmParser.DeclarContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfGmParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(BnfGmParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfGmParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(BnfGmParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfGmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BnfGmParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfGmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BnfGmParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfGmParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(BnfGmParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfGmParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(BnfGmParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfGmParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(BnfGmParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfGmParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(BnfGmParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfGmParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(BnfGmParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfGmParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(BnfGmParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfGmParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(BnfGmParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfGmParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(BnfGmParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BnfGmParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(BnfGmParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BnfGmParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(BnfGmParser.NumberContext ctx);
}