import java.util.ArrayList;

public class Reina {
	// Constantes
	
	// Atributos
	protected int id, coorX, coorY; // Los IDs empiezan en 1.
	protected ArrayList<Integer> conflictos = new ArrayList<Integer>(); 
	// vector que almacena los IDs de las reinas con los que esta se encuentra en conflicto
	
	// Constructor
	public Reina(int coorX, int coorY, int id) {
		this.coorX = coorX;
		this.coorY = coorY;
		this.id = id;
	}
	
	// Metodos
	
	// Overrides
}
