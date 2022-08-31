La consigna de este ejercicio era la siguiente:

EJERCICIO

Se plantea desarrollar un programa Java que permita la gestión de una empresa agroalimentaria que trabaja con tres tipos de productos: productos frescos, productos refrigerados y productos congelados.
 Todos los productos llevan esta información común: fecha de caducidad y número de lote. A su vez, cada tipo de producto lleva alguna información específica. Los productos frescos deben llevar la fecha de envasado y el país de origen.
 Los productos refrigerados deben llevar el código del organismo de supervisión alimentaria, la fecha de envasado, la temperatura de mantenimiento recomendada y el país de origen.
 Los productos congelados deben llevar la fecha de envasado, el país de origen y la temperatura de mantenimiento recomendada.

Hay tres tipos de productos congelados: congelados por aire, congelados por agua y congelados por nitrógeno. 
Los productos congelados por aire deben llevar la información de la composición del aire con que fue congelado (% de nitrógeno, % de oxígeno, % de dióxido de carbono y % de vapor de agua).
 Los productos congelados por agua deben llevar la información de la salinidad del agua con que se realizó la congelación en gramos de sal por litro de agua. 
Los productos congelados por nitrógeno deben llevar la información del método de congelación empleado y del tiempo de exposición al nitrógeno expresada en segundos.

Amplía el código del programa Java que planteamos relativo a la gestión de una empresa agroalimentaria, teniendo
en cuenta que la empresa gestiona envíos a través de diferentes medios, y un envío puede contener cierto número
de productos frescos, refrigerados o congelados.

Añade al código:

a) Una clase EnvioDeProductos que represente un envío de productos como colección de objetos que admite el
polimorfismo.

Esquema que logramos en clase:

![Consigna](https://i.ibb.co/GdZQGkp/esquema-Clase05.jpg "Consigna")