package com.example;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.gui.Trees;

public class Main {

    private static final String EXTENSION = "lang";
    private static final String DIRBASE = "src/test/resources/";

    public static void main(String[] args) throws IOException {
        String files[] = args.length==0? new String[]{ "test." + EXTENSION } : args;
        System.out.println("Dirbase: " + DIRBASE);
        for (String file : files){
            System.out.println("START: " + file);

            CharStream in = CharStreams.fromFileName(DIRBASE + file);
            LanguageLexer lexer = new LanguageLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LanguageParser parser = new LanguageParser(tokens);
            LanguageParser.ProgramaContext tree = parser.programa();
            tokens.fill();
            System.out.println("TOKENS:");

            tokens.getTokens().forEach(token -> {
                System.out.println(
                    "Texto: " + token.getText() +
                    " | Tipo: " + LanguageLexer.VOCABULARY.getSymbolicName(token.getType()) +
                    " | Ln " + token.getLine() + ", Col " + token.getCharPositionInLine()
                );
            });

            Trees.inspect(tree, parser);
            LanguageCustomVisitor visitor = new LanguageCustomVisitor();
            visitor.visit(tree);

            System.out.println("FINISH: " + file);
        }
    }
}
