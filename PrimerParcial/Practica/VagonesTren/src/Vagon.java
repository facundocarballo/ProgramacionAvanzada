import java.util.ArrayList;

public class Vagon {
	
	// Atributos
	protected ArrayList<Especie> especies = new ArrayList<Especie>();
	protected int agresividadMin, agresividadMax;
	
	// Metodo
	
	// Complejidad Computacional => 1
	public boolean introducir_especie(Especie e, int limiteAgrsividad) {
		
		if (especies.size() == 0) {
			
			// Agregamos la especie al vagon
			especies.add(e);
			
			// Asignamos la agresividad
			agresividadMax = e.agresividad;
			agresividadMin = e.agresividad;
			
			return true;
		}
		
		if (e.agresividad > agresividadMax && (e.agresividad - agresividadMin) < limiteAgrsividad) {
			
			// Agregamos la especie al vagon
			especies.add(e);
			
			// Asignamos agresividad
			agresividadMax = e.agresividad;
			
			return true;
		}
		
		
		if (e.agresividad < agresividadMin && (agresividadMax - e.agresividad) < limiteAgrsividad) {
			// Agregamos la especie al vagon
			especies.add(e);
			
			// Asignamos agresividad
			agresividadMin = e.agresividad;
			
			return true;
		}
		
		return false;
	}
	
	// Complejidad Computacional => 1
	public int get_agresividad() {		
		return agresividadMax - agresividadMin;
	}
	
	
	
}
