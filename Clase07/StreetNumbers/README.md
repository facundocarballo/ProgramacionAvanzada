CONSIGNA DEL EJERCICIO:

Una programadora de computadoras vive en una calle con casas numeradas consecutivamente (desde 1) por un lado de la calle. Cada noche ella sale a pasear a su perro dejando su casa y girando al azar a la izquierda o a la derecha, camina hasta el final de la calle y vuelve. Una noche suma los números de las casas que pasan (excluyendo la suya). La siguiente vez que camina, comienza por el otro lado repitiendo la suma y encuentra, para su asombro, que las dos sumas son iguales. Aunque esto se determina en parte por su número de casa y en parte por el número de casas en la calle, ella sin embargo siente que esta es una propiedad deseable para su casa y decide que todas sus casas subsecuentes tendrán esa propiedad. 
Escribe un programa para encontrar los pares de números que satisfagan esta condición. Para comenzar su lista los dos primeros pares son: (número de casa, último número):

6,8
35,49
204,288
1189,1681
6930, 9800
40391,57121
235416,332928
1372105,1940449


Explicacion de lo que hay que hacer:

Dependiendo el numero de casas que existan en tu cuadra, tenes que averiguar que numero de casa cumple con la condicion de que la sumatoria de todos los numeros de casas de su izquierda es igual a la sumatoria del numero de casas de su derecha.

Por ejemplo, en nuestra calle existen 8 casas. Quiero saber que casa cumple con esta regla.

Teniendo en cuenta que las casas estan numeradas del 1 hasta n.

Nos encontrariamos con algo asi en la cuadra (suponiendo que cada numero es una casa)

[1,2,3,4,5,6,7,8]

El numero que satisface la condicion en este caso es el 6, ya que:

1+2+3+4+5 = 7+8
15 = 15

Bueno, entonces hay que crear un algoritmo que dado un numero de casas te devuelva la casa donde se cumple esa condicion.