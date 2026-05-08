
package com.example;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.example.minecraft_codeParser.BookshelfContext;
import com.example.minecraft_codeParser.Crafting_recipeContext;
import com.example.minecraft_codeParser.EnchantContext;
import com.example.minecraft_codeParser.EnchantingContext;
import com.example.minecraft_codeParser.Inventory_slotContext;
import com.example.minecraft_codeParser.JudgmentContext;
import com.example.minecraft_codeParser.Redstone_circuitContext;
import com.example.minecraft_codeParser.Redstone_clockContext;
import com.example.minecraft_codeParser.Redstone_logicContext;
import com.example.minecraft_codeParser.Resource_pileContext;
import com.example.minecraft_codeParser.Signal_chainContext;


public class LanguageCustomVisitor extends minecraft_codeBaseVisitor<Object> {

    @Override
    public Object visitBookshelf(BookshelfContext ctx) {
        // TODO Auto-generated method stub
        return super.visitBookshelf(ctx);
    }

    @Override
    public Object visitCrafting_recipe(Crafting_recipeContext ctx) {
        Object left = visit(ctx.resource_pile(0));
        
        for (int i = 1; i < ctx.resource_pile().size(); i++) {
            Object right = visit(ctx.resource_pile(i));
            String op = ctx.getChild(2 * i - 1).getText();
            
            Double leftVal = left instanceof Double ? (Double) left : Double.parseDouble(left.toString());
            Double rightVal = right instanceof Double ? (Double) right : Double.parseDouble(right.toString());
            
            Double result = 0.0;
            // EFFICIENCY = "ᒷ⎓⎓╎ᔮ╎ᒷリᔮ॥" (+), SHARPNESS = "Ϟ⍑ᖋ∷i!リᒷϟϟ" (-)
            if (op.equals("ᒷ⎓⎓╎ᔮ╎ᒷリᔮ॥")) {
                result = leftVal + rightVal;
                System.out.println("Suma (EFFICIENCY): " + leftVal + " + " + rightVal + " = " + result);
            } else if (op.equals("Ϟ⍑ᖋ∷i!リᒷϟϟ")) {
                result = leftVal - rightVal;
                System.out.println("Resta (SHARPNESS): " + leftVal + " - " + rightVal + " = " + result);
            }
            left = result;
        }
        return left;
    }

    @Override
    public Object visitEnchant(EnchantContext ctx) {
        String id = ctx.BOOK().getText();
        Object value = null;
        if (ctx.crafting_recipe() != null) {
            value = visit(ctx.crafting_recipe());
        } else if (ctx.redstone_circuit() != null) {
            value = visit(ctx.redstone_circuit());
        }
        memory.put(id, value);
        System.out.println("Asignación (APPLY): Variable '" + id + "' guardada con valor: " + value);
        return value;
    }

    @Override
    public Object visitEnchanting(EnchantingContext ctx) {
        // TODO Auto-generated method stub
        return super.visitEnchanting(ctx);
    }

    // Memoria para guardar las variables (Libros / BOOK)
    private java.util.Map<String, Object> memory = new java.util.HashMap<>();

    @Override
    public Object visitInventory_slot(Inventory_slotContext ctx) {
    Object eval = visit(instr);
    if(eval instanceof String){
        result = (String) eval;
    }

        if (ctx.ENT() != null) {
            Double value = Double.parseDouble(ctx.ENT().getText());
            System.out.println("Valor numérico (ENT): " + value);
            return value;
        } else if (ctx.BOOK() != null) {
            String id = ctx.BOOK().getText();
            Object value = memory.containsKey(id) ? memory.get(id) : 0.0;
            System.out.println("Variable (BOOK) '" + id + "' leída con valor: " + value);
            return value;
        } else if (ctx.redstone_circuit() != null) {
            System.out.println("Evaluando expresión entre paréntesis...");
            return visit(ctx.redstone_circuit());
        } else if (ctx.FEATHER_AND_INK() != null) {
        return 0.0;
    }

    @Override
    public Object visitJudgment(JudgmentContext ctx) {
        Object left = visit(ctx.crafting_recipe(0));
        
        if (ctx.crafting_recipe().size() > 1) {
            Object right = visit(ctx.crafting_recipe(1));
            String op = ctx.getChild(1).getText();
            
            Double leftVal = left instanceof Double ? (Double) left : Double.parseDouble(left.toString());
            Double rightVal = right instanceof Double ? (Double) right : Double.parseDouble(right.toString());
            
            Boolean result = false;
            // PUNCH (>), KNOCKBACK (<), MENDING (==)
            if (op.equals("I!⚍リᔮ⍑")) {
                result = leftVal > rightVal;
                System.out.println("Mayor que (PUNCH): " + leftVal + " > " + rightVal + " = " + result);
            } else if (op.equals("·ǀ·リᒍᔮ·ǀ·ᕊᖋᔮ·ǀ·")) {
                result = leftVal < rightVal;
                System.out.println("Menor que (KNOCKBACK): " + leftVal + " < " + rightVal + " = " + result);
            } else if (op.equals("ᒲᒷリ↸╎リ┤")) {
                result = leftVal.equals(rightVal);
                System.out.println("Igual a (MENDING): " + leftVal + " == " + rightVal + " = " + result);
            }
            return result;
        }
        return left;
    }

    @Override
    public Object visitRedstone_circuit(Redstone_circuitContext ctx) {
        Object left = visit(ctx.signal_chain(0));
        
        for (int i = 1; i < ctx.signal_chain().size(); i++) {
            Object right = visit(ctx.signal_chain(i));
            
            Boolean leftVal = left instanceof Boolean ? (Boolean) left : false;
            Boolean rightVal = right instanceof Boolean ? (Boolean) right : false;
            
            // IMPALING (||)
            Boolean result = leftVal || rightVal;
            System.out.println("OR (IMPALING): " + leftVal + " || " + rightVal + " = " + result);
            left = result;
        }
        return left;
    }

    @Override
    public Object visitRedstone_clock(Redstone_clockContext ctx) {
        // TODO Auto-generated method stub
        return super.visitRedstone_clock(ctx);
    }

    @Override
    public Object visitRedstone_logic(Redstone_logicContext ctx) {
        // TODO Auto-generated method stub
        return super.visitRedstone_logic(ctx);
    }

    @Override
    public Object visitResource_pile(Resource_pileContext ctx) {
        Object left = visit(ctx.inventory_slot(0));
        
        for (int i = 1; i < ctx.inventory_slot().size(); i++) {
            Object right = visit(ctx.inventory_slot(i));
            String op = ctx.getChild(2 * i - 1).getText();
            
            Double leftVal = left instanceof Double ? (Double) left : Double.parseDouble(left.toString());
            Double rightVal = right instanceof Double ? (Double) right : Double.parseDouble(right.toString());
            
            Double result = 0.0;
            // MULTISHOT = "ᒲ⚍|:ᒣ╎ϟ⍑ᒍᒣ" (*), PIERCING = "I!╎ᒷ∷ᔮ╎リ┤" (/)
            if (op.equals("ᒲ⚍|:ᒣ╎ϟ⍑ᒍᒣ")) {
                result = leftVal * rightVal;
                System.out.println("Multiplicación (MULTISHOT): " + leftVal + " * " + rightVal + " = " + result);
            } else if (op.equals("I!╎ᒷ∷ᔮ╎リ┤")) {
                result = leftVal / rightVal;
                System.out.println("División (PIERCING): " + leftVal + " / " + rightVal + " = " + result);
            }
            left = result;
        }
        return left;
    }

    @Override
    public Object visitSignal_chain(Signal_chainContext ctx) {
        Object left = visit(ctx.judgment(0));
        
        for (int i = 1; i < ctx.judgment().size(); i++) {
            Object right = visit(ctx.judgment(i));
            
            Boolean leftVal = left instanceof Boolean ? (Boolean) left : false;
            Boolean rightVal = right instanceof Boolean ? (Boolean) right : false;
            
            // CHANNELING (&&)
            Boolean result = leftVal && rightVal;
            System.out.println("AND (CHANNELING): " + leftVal + " && " + rightVal + " = " + result);
            left = result;
        }
        return left;
    }

    @Override
    public Object visit(ParseTree tree) {
        // TODO Auto-generated method stub
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        // TODO Auto-generated method stub
        return super.visitChildren(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub
        return super.visitErrorNode(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub
        return super.visitTerminal(node);
    }



}
