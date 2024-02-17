Preguntas de Teoria:

- ¿Cuál es la representación en binario del número decimal 172_10?
R. 10101100

- - ¿Cuál es la representación en hexadecimal del número octal 748_8?
R. 3C

Desarrolla cuál es el número mínimo de bits requeridos para representar todos
los caracteres en un teclado que tiene...

R. El numero de bit necesarios sera el que nos permita tener el numero de convinaciones para abarcar todos los caracteres.
La formula seria CharNum = 2^bit 

• 9 letras. Se necesitan 4 bits.
• 16 letras. Se necesitan 4 bits.
• 17 letras. Se necesitan 5 bits.

En general, ¿es posible hacer la conversión entre una base n y una base m, para
cualquier n, m > 1 y n ̸= m? Desarrolla.

En general es posible hacer conversiones de cualquier base a cualquier base. 
El algoritmo usado en la practica en realidad permite esto.
Aunque es especialmente facil si n es multiplo de m, pues habra una correspondencia directa
entre x digitos de una base y uno de la otra base.

Todo esto hablando unicamente de numeros enteros. Si tambien incluimos numeros fraccionarios,
solo es posible representar cualquier valor exactamente si n es multiplo de m.

Instrucciones para ejecutar:
Compila el .java usando "javac BaseConverter.java"
Luego corre el programa con "java src.BaseConverter" (sin argumentos y has esto desde el dir padre).
Una vez iniciado el programa, este te dira que hacer.

Integrantes:
Rodolfo Josue Menchaca Carrillo - 315294165
Violeta Ardeni - 