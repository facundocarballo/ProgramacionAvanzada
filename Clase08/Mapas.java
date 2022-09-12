import java.util.HashMap;
import java.util.Map;

public class Mapas {

	public static void main(String[] args) {

		Map<String, String> apellidoDe = new HashMap<String, String>();
		
		// Agregar 
		apellidoDe.put("Facundo", "Carballo");
		apellidoDe.put("Lautaro", "Coria");
		
		// Mostrar mapa
		System.out.println(apellidoDe);
		
		// Pasar un valor por defecto, por si la key no existe
		apellidoDe.getOrDefault("Gonzalo", "No existe");
		
		// Ordenar un mapa ?�
		
		// Contiene clave
		apellidoDe.containsKey("Facundo");
		
		// Contien valor
		apellidoDe.containsValue("Carballo");
		
		// Contiene valor
		apellidoDe.containsValue("Facundo");
		
		// Repetir
		apellidoDe.put("Facundo", "Carballo");
		
		// Obtener
		apellidoDe.get("Facundo");
		
		// Recorrer
		for (String key : apellidoDe.keySet()) {
			System.out.println("[ " + key + " ]" + " => " + apellidoDe.get(key));
		}
		
		// Tama�o
		apellidoDe.size();
		
		// Vaciar
		apellidoDe.clear();
		
		// Esta vacia?
		apellidoDe.isEmpty();
		
		// Obtener las claves
		apellidoDe.keySet();
		
		// Obtener valores
		apellidoDe.values();
		
		// Obtener entradas
		apellidoDe.entrySet();
	}

}
