
// ERROR: Intentó atravesar el vacío (división por cero no permitida).
╎リᒣ Experiencia 🌀 10 I!╎ᒷ∷ᔮ╎リ┤ 0 🔹
// Traducción: int Experiencia = 10 / 0 ;
----------------------------------------------------------------------------------

----------------------------------------------------------------------------------
// ERROR: El ítem [Diamante] no ha sido encantado todavía.
Diamante 🌀 64 🔹
// Traducción: Diamante = 64 ;
----------------------------------------------------------------------------------
----------------------------------------------------------------------------------
// ERROR: Los materiales no son compatibles en la rejilla de crafteo, es decir no se manejan los mismo tipos de datos
╎リᒣ Mutacion 🌀 5 ᒷ⎓⎓╎ᔮ╎ᒷリᔮ॥ "hueso" 🔹
// Traducción: int Mutacion = 5 + "hueso" ;

----------------------------------------------------------------------------------

----------------------------------------------------------------------------------
// Declaración inicial correcta
╎リᒣ Nivel 🌀 1 🔹 
// Traducción: int Nivel = 1 ;

// ERROR: El book [Nivel] ya ha sido escrito
╎リᒣ Nivel 🌀 2 🔹
// Traducción: int Nivel = 2 ;
----------------------------------------------------------------------------------

-------------------------------------------------------------------------------
// ERROR: El bloque FORTUNE espera una señal de redstone (Booleana), pero recibió un valor numérico.
⎓ᒍ∷ᒣ⚍リᒷ |:⚍∷ᒷ 10 |:⚍ᔮ·ǀ·⎽ᒍ⎓⎽ᒣ⍑ᒷ⎽ϟᒷᖋ ⚍リᕊ∷ᒷᖋ·ǀ·╎リ┤⎽ϟᒣᖋ∷ᒣ
    ╎リᒣ Romper 🌀 0 🔹
⚍リᕊ∷ᒷᖋ·ǀ·╎リ┤⎽ᒷリ↸ 🔹
// Traducción:
// if ( 10 ) {
//     int Romper = 0 ;
// }
----------------------------------------------------------------------------------


----------------------------------------------------------------------------------
// ERROR: El bloque INFINITY espera una señal de redstone (Booleana), pero recibió un valor numérico/cadena.
╎リ⎓╎リ╎ℸ|| |:⚍∷ᒷ "Redstone" |:⚍ᔮ·ǀ·⎽ᒍ⎓⎽ᒣ⍑ᒷ⎽ϟᒷᖋ ⚍リᕊ∷ᒷᖋ·ǀ·╎リ┤⎽ϟᒣᖋ∷ᒣ
    ╎リᒣ Loop 🌀 1 🔹
⚍リᕊ∷ᒷᖋ·ǀ·╎リ┤⎽ᒷリ↸ 🔹
// Traducción:
// while ( "Redstone" ) {
//     int Loop = 1 ;
// }
----------------------------------------------------------------------------------

