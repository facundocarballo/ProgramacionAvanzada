import java.util.ArrayList;

public class Evaluador {

	protected ArrayList<Ciudad> ciudades;
	
	public Evaluador(ArrayList<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	
	public ArrayList<Ciudad> resolver() {
		Ciudad a = null;
		Ciudad b = null;
		for (int i = 0; i < this.ciudades.size(); i++) {
			a = this.ciudades.get(i);
			for (int j = 0; j < this.ciudades.size(); j++) {
				b = this.ciudades.get(j);
				compararCiudades(a, b);
			}
		}
	
		return this.obtener_mas_hostiles();
	}
	
	private ArrayList<Ciudad> obtener_mas_hostiles() {
		ArrayList<Ciudad> ciudades_hostiles = new ArrayList<Ciudad>();
		int mayor_hostilidad = 0;
		
		for (Ciudad ciudad : this.ciudades) {
			if (ciudad.hostilidad > mayor_hostilidad) {
				mayor_hostilidad = ciudad.hostilidad;
			}
		}
		
		for (Ciudad ciudad : this.ciudades) {
			if (ciudad.hostilidad == mayor_hostilidad) {
				ciudades_hostiles.add(ciudad);
			}
		}
		
		return ciudades_hostiles;
	}
	
	private int compararCiudades(Ciudad a, Ciudad b) {
		
		// Comparacion a
		if (a.getMin() < b.getMin() && a.getMax() > b.getMax())
		{
			a.hostilidad++;
			return a.id;
		}
			
		
		if (a.getMin() > b.getMin() && a.getMax() < b.getMax())
			return b.id;
		
		// Comparacion b
		if (a.getMin() == b.getMin() && a.getMax() > b.getMax()) 
		{
			a.hostilidad++;
			return a.id;
		}
		
		if (a.getMin() == b.getMin() && a.getMax() < b.getMax()) 
			return b.id;
		
		// Comparacion c
		if (a.getMax() == b.getMax() && a.getMin() < b.getMin())
		{
			a.hostilidad++;
			return a.id;
		}
		
		if (a.getMax() == b.getMax() && a.getMin() > b.getMin())
			return b.id;
		
		if (a.getMax() == b.getMax() && a.getMin() == b.getMin())
			return 0;
		
		if (a.id != b.id)
		{
			a.no_comparaciones++;
		}
			
		
		return 0;
	}
}
