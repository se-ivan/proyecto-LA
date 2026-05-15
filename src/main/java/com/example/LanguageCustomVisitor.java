
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


public class LanguageCustomVisitor extends minecraft_codeBaseVisitor<Symbols> {

    public final java.util.HashMap<String, Symbols> tablaSimbolos = new java.util.HashMap<>();

    @Override
    public Symbols visitBookshelf(BookshelfContext ctx) {
        Symbols lastResult = null;
        for (EnchantingContext enchantingCtx : ctx.enchanting()) {
            lastResult = visit(enchantingCtx);
        }
        return lastResult;
    }

    @Override
    public Symbols visitCrafting_recipe(Crafting_recipeContext ctx) {
        Symbols left = visit(ctx.resource_pile(0));
        
        for (int i = 1; i < ctx.resource_pile().size(); i++) {
            Symbols right = visit(ctx.resource_pile(i));
            String op = ctx.getChild(2 * i - 1).getText();
            
            if (left.type != right.type) {
                throw new RuntimeException("Error: Los materiales no son compatibles en la rejilla de crafteo.");
            }
            if (left.type != Symbols.DataType.INT) {
                throw new RuntimeException("Error semántico: Operaciones aritméticas (+, -) solo permitidas sobre números (INT).");
            }
            
            Double leftVal = left.value instanceof Double ? (Double) left.value : Double.parseDouble(left.value.toString());
            Double rightVal = right.value instanceof Double ? (Double) right.value : Double.parseDouble(right.value.toString());
            
            Double result = 0.0;
            // EFFICIENCY = "ᒷ⎓⎓╎ᔮ╎ᒷリᔮ॥" (+), SHARPNESS = "Ϟ⍑ᖋ∷i!リᒷϟϟ" (-)
            if (op.equals("ᒷ⎓⎓╎ᔮ╎ᒷリᔮ॥")) {
                result = leftVal + rightVal;
                System.out.println("[Línea " + ctx.getStart().getLine() + "] Suma (EFFICIENCY): " + leftVal + " + " + rightVal + " = " + result);
            } else if (op.equals("Ϟ⍑ᖋ∷i!リᒷϟϟ")) {
                result = leftVal - rightVal;
                System.out.println("[Línea " + ctx.getStart().getLine() + "] Resta (SHARPNESS): " + leftVal + " - " + rightVal + " = " + result);
            }
            left = new Symbols(Symbols.DataType.INT, result);
        }
        return left;
    }

    @Override
    public Symbols visitEnchant(EnchantContext ctx) {
        String id = ctx.BOOK().getText();
        Symbols value = null;
        if (ctx.crafting_recipe() != null) {
            value = visit(ctx.crafting_recipe());
        } else if (ctx.redstone_circuit() != null) {
            value = visit(ctx.redstone_circuit());
        }
        
        boolean isDeclaration = ctx.TYPE() != null;
        
        if (isDeclaration) {
            String declaredTypeStr = ctx.TYPE().getText();
            Symbols.DataType type = null;
            if (declaredTypeStr.equals("╎リᒣ")) type = Symbols.DataType.INT;
            else if (declaredTypeStr.equals("ϟᒣ∷")) type = Symbols.DataType.STRING;
            else if (declaredTypeStr.equals("ᕊᒍᒍ|:")) type = Symbols.DataType.BOOLEAN;

            if (tablaSimbolos.containsKey(id)) {
                throw new RuntimeException("Error: El book [" + id + "] ya ha sido escrito");
            }
            if (value != null && value.type != type) {
                throw new RuntimeException("Error semántico: Asignación incorrecta. Se esperaba un valor de tipo " + type);
            }
            
            Symbols newSym = new Symbols(type, value != null ? value.value : null);
            tablaSimbolos.put(id, newSym);
            System.out.println("[Línea " + ctx.getStart().getLine() + "] Declaración: '" + id + "' (" + type + ") inicializada con valor: " + newSym.value);
            return newSym;
        } else {
            if (!tablaSimbolos.containsKey(id)) {
                throw new RuntimeException("Error: El ítem [" + id + "] no ha sido encantado todavía.");
            }
            Symbols registered = tablaSimbolos.get(id);
            if (value != null && value.type != registered.type) {
                throw new RuntimeException("Error semántico: Se esperaba un valor de tipo " + registered.type);
            }
            registered.value = value != null ? value.value : null;
            System.out.println("[Línea " + ctx.getStart().getLine() + "] Asignación (APPLY): Variable '" + id + "' guardada con valor: " + registered.value);
            return registered;
        }
    }

    @Override
    public Symbols visitEnchanting(EnchantingContext ctx) {
        if (ctx.enchant() != null) return visit(ctx.enchant());
        if (ctx.redstone_logic() != null) return visit(ctx.redstone_logic());
        if (ctx.redstone_clock() != null) return visit(ctx.redstone_clock());
        if (ctx.redstone_circuit() != null) return visit(ctx.redstone_circuit());
        return null;
    }

    @Override
    public Symbols visitInventory_slot(Inventory_slotContext ctx) {
        if (ctx.ENT() != null) {
            Double value = Double.parseDouble(ctx.ENT().getText());
            System.out.println("[Línea " + ctx.getStart().getLine() + "] Valor numérico (ENT): " + value);
            return new Symbols(Symbols.DataType.INT, value);
        } else if (ctx.BOOL() != null) {
            Boolean value = ctx.BOOL().getText().equals("ℸ∷⚍ᒷ");
            System.out.println("[Línea " + ctx.getStart().getLine() + "] Valor booleano (BOOL): " + value);
            return new Symbols(Symbols.DataType.BOOLEAN, value);
        } else if (ctx.STRING_LITERAL() != null) {
            String text = ctx.STRING_LITERAL().getText();
            String value = text.substring(1, text.length() - 1); // Remover comillas
            System.out.println("[Línea " + ctx.getStart().getLine() + "] Valor string (STRING_LITERAL): " + value);
            return new Symbols(Symbols.DataType.STRING, value);
        } else if (ctx.BOOK() != null) {
            String id = ctx.BOOK().getText();
            if (!tablaSimbolos.containsKey(id)) {
                throw new RuntimeException("Error: El ítem [" + id + "] no ha sido encantado todavía.");
            }
            Symbols sym = tablaSimbolos.get(id);
            System.out.println("[Línea " + ctx.getStart().getLine() + "] Variable (BOOK) '" + id + "' leída con valor: " + sym.value);
            return sym;
        } else if (ctx.redstone_circuit() != null) {
            System.out.println("[Línea " + ctx.getStart().getLine() + "] Evaluando expresión entre paréntesis...");
            return visit(ctx.redstone_circuit());
        }
        return null;
    }

    @Override
    public Symbols visitJudgment(JudgmentContext ctx) {
        Symbols left = visit(ctx.crafting_recipe(0));
        
        if (ctx.crafting_recipe().size() > 1) {
            Symbols right = visit(ctx.crafting_recipe(1));
            String op = ctx.getChild(1).getText();
            
            if (left.type != right.type) {
                throw new RuntimeException("Error semántico: No se pueden comparar tipos incompatibles.");
            }
            
            Boolean result = false;
            // PUNCH (>), KNOCKBACK (<), MENDING (==)
            if (op.equals("ᒲᒷリ↸╎リ┤")) { // MENDING (==)
                result = left.value.equals(right.value);
                System.out.println("[Línea " + ctx.getStart().getLine() + "] Igual a (MENDING): " + left.value + " == " + right.value + " = " + result);
            } else {
                if (left.type != Symbols.DataType.INT) {
                    throw new RuntimeException("Error semántico: Los comparadores < y > solo pueden usarse con números (INT).");
                }
                Double leftVal = left.value instanceof Double ? (Double) left.value : Double.parseDouble(left.value.toString());
                Double rightVal = right.value instanceof Double ? (Double) right.value : Double.parseDouble(right.value.toString());
                
                if (op.equals("I!⚍リᔮ⍑")) {
                    result = leftVal > rightVal;
                    System.out.println("[Línea " + ctx.getStart().getLine() + "] Mayor que (PUNCH): " + leftVal + " > " + rightVal + " = " + result);
                } else if (op.equals("·ǀ·リᒍᔮ·ǀ·ᕊᖋᔮ·ǀ·")) {
                    result = leftVal < rightVal;
                    System.out.println("[Línea " + ctx.getStart().getLine() + "] Menor que (KNOCKBACK): " + leftVal + " < " + rightVal + " = " + result);
                }
            }
            return new Symbols(Symbols.DataType.BOOLEAN, result);
        }
        return left;
    }

    @Override
    public Symbols visitRedstone_circuit(Redstone_circuitContext ctx) {
        Symbols left = visit(ctx.signal_chain(0));
        
        for (int i = 1; i < ctx.signal_chain().size(); i++) {
            Symbols right = visit(ctx.signal_chain(i));
            
            Boolean leftVal = left.value instanceof Boolean ? (Boolean) left.value : false;
            Boolean rightVal = right.value instanceof Boolean ? (Boolean) right.value : false;
            
            // IMPALING (||)
            Boolean result = leftVal || rightVal;
            System.out.println("[Línea " + ctx.getStart().getLine() + "] OR (IMPALING): " + leftVal + " || " + rightVal + " = " + result);
            left = new Symbols(Symbols.DataType.BOOLEAN, result);
        }
        return left;
    }

    @Override
    public Symbols visitRedstone_clock(Redstone_clockContext ctx) {
        while (true) {
            Symbols conditionResult = visit(ctx.redstone_circuit());
            if (conditionResult == null || conditionResult.type != Symbols.DataType.BOOLEAN) {
                throw new RuntimeException("Error Semántico: El bloque INFINITY espera una señal de redstone (Booleana), pero recibió un valor numérico.");
            }
            Boolean condition = (Boolean) conditionResult.value;
            
            if (!condition) {
                break;
            }
            
            for (EnchantingContext eCtx : ctx.enchanting()) {
                visit(eCtx);
            }
        }
        return null;
    }

    @Override
    public Symbols visitRedstone_logic(Redstone_logicContext ctx) {
        Symbols conditionResult = visit(ctx.judgment());
        if (conditionResult == null || conditionResult.type != Symbols.DataType.BOOLEAN) {
            throw new RuntimeException("Error Semántico: El bloque FORTUNE espera una señal de redstone (Booleana), pero recibió un valor numérico.");
        }
        Boolean condition = (Boolean) conditionResult.value;
        
        if (condition) {
            for (EnchantingContext eCtx : ctx.enchanting()) {
                visit(eCtx);
            }
        }
        return null;
    }

    @Override
    public Symbols visitResource_pile(Resource_pileContext ctx) {
        Symbols left = visit(ctx.inventory_slot(0));
        
        for (int i = 1; i < ctx.inventory_slot().size(); i++) {
            Symbols right = visit(ctx.inventory_slot(i));
            String op = ctx.getChild(2 * i - 1).getText();
            
            if (left.type != right.type) {
                throw new RuntimeException("Error: Los materiales no son compatibles en la rejilla de crafteo.");
            }
            if (left.type != Symbols.DataType.INT) {
                throw new RuntimeException("Error semántico: Operaciones aritméticas (*, /) solo permitidas sobre números (INT).");
            }
            
            Double leftVal = left.value instanceof Double ? (Double) left.value : Double.parseDouble(left.value.toString());
            Double rightVal = right.value instanceof Double ? (Double) right.value : Double.parseDouble(right.value.toString());
            
            Double result = 0.0;
            // MULTISHOT = "ᒲ⚍|:ᒣ╎ϟ⍑ᒍᒣ" (*), PIERCING = "I!╎ᒷ∷ᔮ╎リ┤" (/)
            if (op.equals("ᒲ⚍|:ᒣ╎ϟ⍑ᒍᒣ")) {
                result = leftVal * rightVal;
                System.out.println("[Línea " + ctx.getStart().getLine() + "] Multiplicación (MULTISHOT): " + leftVal + " * " + rightVal + " = " + result);
            } else if (op.equals("I!╎ᒷ∷ᔮ╎リ┤")) {
                if (rightVal == 0.0) {
                    throw new RuntimeException("Error: Intentó atravesar el vacío (división por cero no permitida).");
                }
                result = leftVal / rightVal;
                System.out.println("[Línea " + ctx.getStart().getLine() + "] División (PIERCING): " + leftVal + " / " + rightVal + " = " + result);
            }
            left = new Symbols(Symbols.DataType.INT, result);
        }
        return left;
    }

    @Override
    public Symbols visitSignal_chain(Signal_chainContext ctx) {
        Symbols left = visit(ctx.judgment(0));
        
        for (int i = 1; i < ctx.judgment().size(); i++) {
            Symbols right = visit(ctx.judgment(i));
            
            Boolean leftVal = left.value instanceof Boolean ? (Boolean) left.value : false;
            Boolean rightVal = right.value instanceof Boolean ? (Boolean) right.value : false;
            
            // CHANNELING (&&)
            Boolean result = leftVal && rightVal;
            System.out.println("[Línea " + ctx.getStart().getLine() + "] AND (CHANNELING): " + leftVal + " && " + rightVal + " = " + result);
            left = new Symbols(Symbols.DataType.BOOLEAN, result);
        }
        return left;
    }

    @Override
    public Symbols visit(ParseTree tree) {
        // TODO Auto-generated method stub
        return super.visit(tree);
    }

    @Override
    public Symbols visitChildren(RuleNode node) {
        // TODO Auto-generated method stub
        return super.visitChildren(node);
    }

    @Override
    public Symbols visitErrorNode(ErrorNode node) {
        // TODO Auto-generated method stub
        return super.visitErrorNode(node);
    }

    @Override
    public Symbols visitTerminal(TerminalNode node) {
        // TODO Auto-generated method stub
        return super.visitTerminal(node);
    }



}

