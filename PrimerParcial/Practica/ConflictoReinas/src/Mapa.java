import java.util.ArrayList;

public class Mapa {
	
	// Atributos
	private int tam;
	private int[][] tablero;
	protected ArrayList<Reina> reinas = new ArrayList<Reina>();
	
	// Constructores
	public Mapa(int tam, ArrayList<Reina> rs) {
		this.tam = tam;
		this.init();
		
		for (Reina r : rs) {
			this.cargar_reina_en_mapa(r);
		}
	}

	// Metodos
	public void obtener_conflictos(Reina r) {
		
		// Si existe alguna reina en la fila que se encuentra
		conflicto_fila(r);
		
		// Si existe alguna reina en la columna que se encuentra
		conflicto_columna(r);
		
		// Si existe alguna reina en la diagonal que se encuentra
		conflicto_diagonal(r);
		
		// Ordenamos los conflictos por ID
		r.conflictos.sort(null);
		
	}
	
	// coorY = filas
	// coorX = columnas
	private void conflicto_fila(Reina r) {
		boolean conflictoDer = false;
		boolean conflictoIzq = false;
		
		int i = r.coorX + 1;
		
		// Primero recorremos a la derecha
		while(!conflictoDer && i < this.tam)
		{
			if (this.tablero[r.coorY][i] != 0)
			{
				conflictoDer = true;
				r.conflictos.add(this.tablero[r.coorY][i]);
			}
			i++;
		}
		
		i = r.coorX - 1;
		
		// Recorremos hacia la izquierda
		while(!conflictoIzq && i >= 0)
		{
			if (this.tablero[r.coorY][i] != 0)
			{
				conflictoIzq = true;
				r.conflictos.add(this.tablero[r.coorY][i]);
			}
			i--;
		}
		
	}

	private void conflicto_columna(Reina r) {
		
		boolean conflictoArriba = false;
		boolean conflictoAbajo = false;
		
		int i = r.coorY - 1;
		
		// Primero recorremos para arriba
		while (!conflictoArriba && i >= 0) {
			if (this.tablero[i][r.coorX] != 0) {
				conflictoArriba = true;
				r.conflictos.add(this.tablero[i][r.coorX]);
			}
			i--;
		}
		
		// Luego recorremos para abajo
		i = r.coorY + 1;
		
		while(!conflictoAbajo && i < this.tam) {
			if (this.tablero[i][r.coorX] != 0) {
				conflictoAbajo = true;
				r.conflictos.add(this.tablero[i][r.coorX]);
			}
			i++;
		}
	}
	
	private void conflicto_diagonal(Reina r) {
		boolean conflictoArribaDer = false;
		boolean conflictoArribaIzq = false;
		boolean conflictoAbajoDer = false;
		boolean conflictoAbajoIzq = false;
		
		int x,y;
		
		// Arriba a la derecha
		x = r.coorX + 1;
		y = r.coorY - 1;
		
		while(!conflictoArribaDer && x < this.tam && y >= 0) {
			if (this.tablero[y][x] != 0) {
				conflictoArribaDer = true;
				r.conflictos.add(this.tablero[y][x]);
			}
			x++;
			y--;
		}
		
		// Arriba a la izquierda
		x = r.coorX - 1;
		y = r.coorY - 1;
		
		while(!conflictoArribaIzq && x >= 0 && y >= 0) {
			if (this.tablero[y][x] != 0) {
				conflictoArribaIzq = true;
				r.conflictos.add(this.tablero[y][x]);
			}
			x--;
			y--;
		}
		
		// Abajo a la derecha
		x = r.coorX + 1;
		y = r.coorY + 1;
		
		while(!conflictoAbajoDer && x < this.tam && y < this.tam) {
			if (this.tablero[y][x] != 0) {
				conflictoAbajoDer = true;
				r.conflictos.add(this.tablero[y][x]);
			}
			x++;
			y++;
		}
		
		// Abajo a la izquierda
		x = r.coorX - 1;
		y = r.coorY + 1;
		
		while(!conflictoAbajoIzq && x >= 0 && y < this.tam) {
			if (this.tablero[y][x] != 0) {
				conflictoAbajoIzq = true;
				r.conflictos.add(this.tablero[y][x]);
			}
			x--;
			y++;
		}
		
	}
	
	private boolean cargar_reina_en_mapa(Reina r) {
		if (this.tablero[r.coorY][r.coorX] != 0)
			return false;
		
		this.tablero[r.coorY][r.coorX] = r.id;
		reinas.add(r);
		
		return true;
	}
	
	private void init() {
		this.tablero = new int[this.tam][this.tam];
	}
	
}
