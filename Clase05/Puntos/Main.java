import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		// En este tipo de comparaciones omite el atributo Z
		// Es decir toma la misma Z para los dos puntos, por lo que no influye en su distancia.
		
		Punto2D p1 = new Punto2D(3,2);
		Punto3D p2 = new Punto3D(4,3,0);
		Punto2D p3 = new Punto3D(3,1,3);
		
		List<Punto2D> lista = new ArrayList<Punto2D>();
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		//double z = 0;
		
		for (Punto2D punto : lista)
		{
			System.out.println(punto.distanciaAlOrigen());
		}
		
//		if (p1.getClass().getName() == "Punto3D")
//		{
//			z = ((Punto3D) p3).getZ();
//		}
//		else
//		{
//			System.out.println("No se pudo castear, es otra clase");
//		}
//		
////		System.out.println("Distancia p1 con p2: " + p1.distanciaA(p2));
////		System.out.println("Distancioa p2 con p1: " + p2.distanciaA(p1));
//		
//		System.out.println(p3);
//		System.out.println("Z: " + z);
	}
	
}
