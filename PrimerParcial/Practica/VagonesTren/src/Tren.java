import java.util.ArrayList;

public class Tren {
	
	// Constante
	private final int AGRESIVIDAD_PERMITIDA;
	
	// Atributos
	protected ArrayList<Vagon> vagones = new ArrayList<Vagon>();
	
	// Constructor
	public Tren(int agresividad) {
		this.AGRESIVIDAD_PERMITIDA = agresividad;
		this.vagones.add(new Vagon());
	}
	
	// Metodos
	
	// Complejidad Computacional => n
	public void insertar_especie(Especie e) {
		if (!this.insertar_en_vagones_disponibles(e)) {
			// Creamos un vagon nuevo con esta especie
			Vagon v = new Vagon();
			v.introducir_especie(e, this.limite_agresividad());
			vagones.add(v);
		}
	}
	
	// Complejidad Computacional => n
	private boolean insertar_en_vagones_disponibles(Especie e) {
		// Recorremos todos los vagones y preguntamos si podemos agregar esta especie
		boolean aceptado = false;
		int i = 0;
		
		while (!aceptado && i < vagones.size()) {
			aceptado = vagones.get(i).introducir_especie(e, this.limite_agresividad());
			i++;
		}

		return aceptado;
	}
	
	// Complejidad Computacional => n
	private int limite_agresividad() {
		return AGRESIVIDAD_PERMITIDA - this.agresividad_actual();
	}
	
	// Complejidad Computacional => n
	protected int agresividad_actual() {
		int a = 0;
		
		for (Vagon vagon : vagones) {
			a += vagon.get_agresividad();
		}
		
		return a;
	}
	
}
