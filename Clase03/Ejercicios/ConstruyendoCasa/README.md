Prueba de distintos casos criticos a mi criterio, siguiendo la consigna del PDF.

Caso de prueba en el que me ingresen un largo y ancho que el terreno no soporta.
Las condiciones no abarcan la posibilidad de que ingresen un terreno (3x3) y nos
llegue por parametro que las dimensiones de la casa sean de (3x4). Esto no podria ser
nunca porque el terreno no tiene peldanios disponibles para eso.

A su vez, la consigna nunca considera esa posibilidad. Podrian solucionarlo, indicando
1 <= F <= Dx y que 1<= L <= Dy

| Entrada | Salida |
|---------|--------|
|   3 3   |    ?   |
|   3 4   |        |
|    5    |        |
|   1 1   |        |
|   2 0   |        |
|   2 2   |        |
|   1 0   |        |
|   0 0   |        |
|         |        |
|         |        |