package com.example;

/*
import java.awt.GraphicsEnvironment;
import org.antlr.v4.gui.Trees; 
*/
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Main {

    private static final String EXTENSION = "mc";
    private static final String DIRBASE = "src/test/resources/";

    public static void main(String[] args) throws IOException {
        String files[] = args.length==0? new String[]{ "test." + EXTENSION } : args;
        System.out.println("Dirbase: " + DIRBASE);
        for (String file : files){
            System.out.println("START: " + file);

            CharStream in = CharStreams.fromFileName(DIRBASE + file);
            minecraft_codeLexer lexer = new minecraft_codeLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            minecraft_codeParser parser = new minecraft_codeParser(tokens);
            minecraft_codeParser.BookshelfContext tree = parser.bookshelf();
            /*
            System.out.println("PARSE TREE: " + tree.toStringTree(parser));
            tokens.fill();
            System.out.println("TOKENS:");

            tokens.getTokens().forEach(token -> {
                System.out.println(
                    "Texto: " + token.getText() +
                    " | Tipo: " + minecraft_codeLexer.VOCABULARY.getSymbolicName(token.getType()) +
                    " | Ln " + token.getLine() + ", Col " + token.getCharPositionInLine()
                );
            });

            if (!GraphicsEnvironment.isHeadless()) {
                Trees.inspect(tree, parser);
            }
            */
            
            LanguageCustomVisitor visitor = new LanguageCustomVisitor();
            visitor.visit(tree);

            System.out.println("FINISH: " + file);
        }
    }
}
