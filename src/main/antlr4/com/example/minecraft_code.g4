grammar minecraft_code;

bookshelf    : (enchanting APPLY)+ EOF ;

enchanting  : enchant 
            | redstone_logic 
            | redstone_clock
            | redstone_circuit 
            ;

// --- ESTRUCTURAS DE CONTROL ---

// Condicional (IF)
redstone_logic : FORTUNE LURE judgment LUCK_OF_THE_SEA UNBREAKING_START (enchanting LAPIS_LAZULI*)+ UNBREAKING_END ;

// Bucle (WHILE)
redstone_clock : INFINITY LURE redstone_circuit LUCK_OF_THE_SEA UNBREAKING_START (enchanting LAPIS_LAZULI*)+ UNBREAKING_END ;


// --- LÓGICA Y ARITMÉTICA ---

redstone_circuit  : signal_chain (IMPALING signal_chain)* ;
signal_chain     : judgment (CHANNELING judgment)* ;

judgment : crafting_recipe ((PUNCH | KNOCKBACK | MENDING) crafting_recipe)? ;

enchant  : BOOK APPLY (crafting_recipe | redstone_circuit) ;

crafting_recipe   : resource_pile ((EFFICIENCY | SHARPNESS) resource_pile)* ;

resource_pile     : inventory_slot ((MULTISHOT | PIERCING) inventory_slot)* ;

inventory_slot      : ENT 
                    | FEATHER_AND_INK
                    | BOOK 
                    | LURE redstone_circuit LUCK_OF_THE_SEA 
                    ;

// --- TOKENS ---

FORTUNE          : '⎓ᒍ∷ᒣ⚍リᒷ' ;               // "if"
INFINITY         : '╎リ⎓╎リ╎ℸ||' ;             // "while" (NUEVO)
UNBREAKING_START : '⚍リᕊ∷ᒷᖋ·ǀ·╎リ┤⎽ϟᒣᖋ∷ᒣ' ;   // "{" 
UNBREAKING_END   : '⚍リᕊ∷ᒷᖋ·ǀ·╎リ┤⎽ᒷリ↸' ;     // "}"
SHARPNESS        : 'Ϟ⍑ᖋ∷i!リᒷϟϟ' ;            // "-"
MULTISHOT        : 'ᒲ⚍|:ᒣ╎ϟ⍑ᒍᒣ' ;             // "*"
PIERCING         : 'I!╎ᒷ∷ᔮ╎リ┤' ;            // "/"
EFFICIENCY       : 'ᒷ⎓⎓╎ᔮ╎ᒷリᔮ॥' ;            // "+"
LURE             : '|:⚍∷ᒷ' ;                  // "("
LUCK_OF_THE_SEA  : '|:⚍ᔮ·ǀ·⎽ᒍ⎓⎽ᒣ⍑ᒷ⎽ϟᒷᖋ' ;    // ")"
APPLY            : '🌀' ;                    // "="
LAPIS_LAZULI     : '🔹' ;                    // ";"
KNOCKBACK        : '·ǀ·リᒍᔮ·ǀ·ᕊᖋᔮ·ǀ·' ;     // "<"
PUNCH            : 'I!⚍リᔮ⍑' ;               // ">"
MENDING          : 'ᒲᒷリ↸╎リ┤' ;             // "=="
IMPALING         : '╎ᒲi!ᖋ|:╎リ┤' ;            // "||"
CHANNELING       : 'ᔮ⍑ᖋリリᒷ|:╎リ┤' ;         // "&&"

ENT              : [0-9]+ ;
FEATHER_AND_INK  : '⚍リᔮ⍑' ;               // "var"
BOOK             : [a-zA-Zᔑʖᓵ↸ᒷ⎓⊣⍑╎⋮ꖌꖎᒲリ!¡ᑑ∷ᓭד̣⚍⍊∴̇/⨅_|][a-zA-Z0-9ᔑʖᓵ↸ᒷ⎓⊣⍑╎⋮ꖌꖎᒲリ!¡ᑑ∷ᓭד̣⚍⍊∴̇/⨅_|]* ; 
COMMENT          : '//' ~[\r\n]* -> skip ; // Comentarios de una linea
WS               : [ \t\n\r\f]+ -> skip ;