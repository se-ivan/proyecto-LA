// Generated from com\example\minecraft_code.g4 by ANTLR 4.9.2
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link minecraft_codeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface minecraft_codeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link minecraft_codeParser#bookshelf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBookshelf(minecraft_codeParser.BookshelfContext ctx);
	/**
	 * Visit a parse tree produced by {@link minecraft_codeParser#enchanting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnchanting(minecraft_codeParser.EnchantingContext ctx);
	/**
	 * Visit a parse tree produced by {@link minecraft_codeParser#redstone_logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedstone_logic(minecraft_codeParser.Redstone_logicContext ctx);
	/**
	 * Visit a parse tree produced by {@link minecraft_codeParser#redstone_clock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedstone_clock(minecraft_codeParser.Redstone_clockContext ctx);
	/**
	 * Visit a parse tree produced by {@link minecraft_codeParser#redstone_circuit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedstone_circuit(minecraft_codeParser.Redstone_circuitContext ctx);
	/**
	 * Visit a parse tree produced by {@link minecraft_codeParser#signal_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_chain(minecraft_codeParser.Signal_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link minecraft_codeParser#judgment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJudgment(minecraft_codeParser.JudgmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link minecraft_codeParser#enchant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnchant(minecraft_codeParser.EnchantContext ctx);
	/**
	 * Visit a parse tree produced by {@link minecraft_codeParser#crafting_recipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrafting_recipe(minecraft_codeParser.Crafting_recipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link minecraft_codeParser#resource_pile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_pile(minecraft_codeParser.Resource_pileContext ctx);
	/**
	 * Visit a parse tree produced by {@link minecraft_codeParser#inventory_slot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInventory_slot(minecraft_codeParser.Inventory_slotContext ctx);
}