# Especificación y Documentación del Lenguaje Minecraft

## Introducción

Este documento detalla el análisis sintáctico (Gramática) y semántico (Visitor) del lenguaje personalizado de Minecraft en ANTLR4. Está diseñado para simular los comandos de Minecraft con traducciones exóticas, brindando operaciones lógicas, aritméticas y relacionales.

## 1. Gramática (`minecraft_code.g4`)

### Estructura Global
El flujo base del programa (`bookshelf`) está definido por un bucle de instrucciones `enchanting`, y el carácter terminador principal ha sido ajustado a `LAPIS_LAZULI` (🔹) el equivalente funcional al punto y coma `;` tradicional, resolviendo bugs que forzaban la terminación con igual (`=`). 

### Tokens (Palabras Clave)
- `FORTUNE`, `INFINITY`: Palabras clave para `IF` y `WHILE` respectivamente.
- Operadores Matemáticos: `SHARPNESS (-)` | `MULTISHOT (*)` | `PIERCING (/)` | `EFFICIENCY (+)`
- Agrupaciones: `LURE (()`, `LUCK_OF_THE_SEA ())`, `UNBREAKING_START ({)`, `UNBREAKING_END (})`
- Asignación: `APPLY (🌀)`
- Fin de linea: `LAPIS_LAZULI (🔹)`
- Relacionales: `KNOCKBACK (<)`, `PUNCH (>)`, `MENDING (==)`
- Lógicos: `IMPALING (||)`, `CHANNELING (&&)`

### Tipos de Datos
Se soportan los tipos: 
- `INT`: `ENT`
- `BOOLEAN`: `BOOL` (`ℸ∷⚍ᒷ` o `⎓ᖋ|:ϟᒷ`)
- `STRING`: Cadenas de caracteres delimitados entre comillas (`"`). (*Recientemente añadido al lexer y parser bajo `STRING_LITERAL`*).

---

## 2. Análisis Semántico (`LanguageCustomVisitor.java`)

El Motor de recorrido se sobre-reescribió para incluir validaciones dinámicas de tipo ("Type Safety"). 

### Cambios Importantes Introducidos:

1. **Safety Type Checks en Operaciones Matemáticas (Crafting & Resource Piles)**
Las operaciones de suma (`EFFICIENCY`), resta (`SHARPNESS`), multiplicación (`MULTISHOT`) y división (`PIERCING`) lanzan explícitamente `RuntimeException` si se intenta operar con objetos booleanos o tipo String. Ambas variables se validan bajo `Symbols.DataType.INT`.

2. **Refinamiento en las Operaciones Booleanas (`visitJudgment`)**
En operaciones con `<` (`KNOCKBACK`) y `>` (`PUNCH`) se incluyeron verificaciones exclusivas para trabajar únicamente con sentencias `INT`. 
Por otra parte, para el carácter de equidad `==` (`MENDING`), se utiliza ahora `.equals()`, lo que da soporte directo a la comparación abstracta sin tener que encasillar todos los operadores a Double forzadamente. Ya se soportan sentencias como `true == true`.

3. **Inclusión de Tipo String**
Dentro de `visitInventory_slot`, se extraen las palabras detectadas por el lexer bajo `STRING_LITERAL`, deshaciéndose de forma automática las comillas (índice interno). Ahora todo es asimilado dentro de la tabla de variables como `Symbols.DataType.STRING`.

4. **Variables (Inventario)**
El `visitEnchant` es responsable de crear asignaciones hacia variables designadas bajo la estructura `BOOK`. En el flujo actualizado, solo si es una pre-declaración, se procesan como `Declaración ... inicializada con valor...`.
