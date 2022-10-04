import java.util.HashMap;
import java.util.Map;

public class ArmandoMoviles {

	// Cada movil esta conformado por:
		// - Varillas
		// - Colgantes
		// - Hilo
	
	// Un movil se construye de esta manera:
		// Una varillas que cuelga por su PUNTO medio
		// De los 2 extremos de la varilla cuelgan sendos colgantes
	
	// REQUISITO: LOS PESOS DE CADA COSA QUE CUELGA DEBEN SER IGUALES
	
	// Informar la mayor cantidad de moviles que se pueden realizar 
	// e indicar su peso total y la cantidad de varillas necessarias
	// para construirlos
	
	// Se recibe:
		// 0 <= C <= 100 (Cantidad de colgantes)
		// El peso de cada colgante
	
	// Mostrar:
	 	// "No se puede"
		// o
		// Peso total de los moviles + " " + Numero de varillas necesarias
	
	public static void main(String[] args) {
		
		// Si ingresa:
		// 6 => Cantidad de colgantes
		// 4 => Peso del colgante 1
		// 3 => Peso del colgante 2
		// 1 => Peso del colgante 3
		// 2 => Peso del colgante 4
		// 3 => Peso del colgante 5
		// 1 => Peso del colgante 6
		
		// Se debe devolver:
		// 8 2
		
		// El colgante 2 y el 5 pesan 3, entonces esos se usan para los extremos
		// El colgante 3 y el 6 pesan 1, entonces esos se usan para los extremos
		// Los colgantes restantes, el 1 y el 4, se usaran para los centros
		
		
		int[] datosEntrada = {6, 4, 3, 1, 2, 3, 1};
		
		Map<Integer, Integer> colgantesConUnPesoDe = new HashMap<Integer, Integer>();
		
		for (int i = 1; i < datosEntrada.length; i++)
		{
			colgantesConUnPesoDe.put(datosEntrada[i], 
					colgantesConUnPesoDe.getOrDefault(datosEntrada[i], 0) + 1);
		}
		
		
		
		
	}

}
