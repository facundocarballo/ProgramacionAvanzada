import java.util.ArrayList;

public class EvaluadorLocal {

	protected int k;
	protected Registro reg;
	
	// Complejidad Computacional O(n^3)
	public void curva(int[][] barrio) {
		ArrayList<Registro> registros_validos = new ArrayList<Registro>();

		for (int i = 0; i < barrio.length; i++) {
			
			for (int j = 0; j < barrio.length; j++) {
								
				Registro r = this.buscar_camino(barrio, i, j);
								
				if (r != null) {
					registros_validos.add(r);
				}
				
			}
		}
		
		reg = this.buscar_camino_maximo(registros_validos);
		k = this.cantidad_caminos_maximos(registros_validos);

	}

	private int cantidad_caminos_maximos(ArrayList<Registro> registros) {
		Registro rMax = this.buscar_camino_maximo(registros);
		int cantidad = 0;
		
		for (Registro registro : registros) {
			if (registro.getMovimientos() == rMax.getMovimientos()) {
				cantidad++;
			}
		}
		
		return cantidad;
	}
	
	private Registro buscar_camino_maximo(ArrayList<Registro> registros) {
		Registro rMax = null;
		
		if (registros.size() > 0) {
			
			rMax = registros.get(0);
			
			for (Registro registro : registros) {
				if (registro.getMovimientos() > rMax.getMovimientos()) {
					rMax = registro;
				}
			}
			
		}

		return rMax;
	}
	
	private Registro buscar_camino(int[][] barrio, int i, int j) {
		int primer_moviento = -1;
		int segundo_movimiento = -1;
		int auxI = i;
		int auxJ = j;
		int movimientos = 0;
		int pasadas = 0;
		Punto inicio = new Punto(i+1, j+1);
		Punto fin = null;
		Punto curva = null;

		while (pasadas < 2) {
			
			// Intento moverme a la derecha
			while (this.mover_derecha(barrio, auxI, auxJ) && (segundo_movimiento == -1 || segundo_movimiento == 0)) {
				if (primer_moviento < 0) {
					primer_moviento = 0;
				}

				if (primer_moviento != 0 && segundo_movimiento == -1) {
					segundo_movimiento = 0;
					curva = new Punto(auxI+1, auxJ+1);
				}

				auxJ++;
				movimientos++;
			}

			// Intento moverme a la izquierda
			while (this.mover_izquierda(barrio, auxI, auxJ) && (segundo_movimiento == -1 || segundo_movimiento == 1)) {
				if (primer_moviento < 0) {
					primer_moviento = 1;
				}

				if (primer_moviento != 1 && segundo_movimiento == -1) {
					segundo_movimiento = 1;
					curva = new Punto(auxI+1, auxJ+1);
				}

				auxJ--;
				movimientos++;
			}

			// Intento moverme hacia abajo
			while (this.mover_abajo(barrio, auxI, auxJ) && (segundo_movimiento == -1 || segundo_movimiento == 2)) {
				if (primer_moviento < 0) {
					primer_moviento = 2;
				}

				if (primer_moviento != 2 && segundo_movimiento == -1) {
					segundo_movimiento = 2;
					curva = new Punto(auxI+1, auxJ+1);
				}

				auxI++;
				movimientos++;
			}

			// Intento moverme hacia arriba
			while (this.mover_arriba(barrio, auxI, auxJ) && (segundo_movimiento == -1 || segundo_movimiento == 3)) {
				if (primer_moviento < 0) {
					primer_moviento = 3;
				}

				if (primer_moviento != 3 && segundo_movimiento == -1) {
					segundo_movimiento = 3;
					curva = new Punto(auxI+1, auxJ+1);
				}

				auxI--;
				movimientos++;
			}
			
			pasadas++;
		}
		
		fin = new Punto(auxI+1, auxJ+1);
		
		
		if (curva != null) {
			return new Registro(inicio, fin, curva, movimientos);
		}
		
		return null;
		
	}
	
	public boolean mover_arriba(int[][] m, int i, int j) {
		return (
				j < m.length &&
				j >= 0 &&
				i < m.length &&
				i >= 0 &&
				(i-1) < m.length &&
				(i - 1) >= 0 &&
				m[i - 1][j] < m[i][j]
		);
	}

	public boolean mover_abajo(int[][] m, int i, int j) {
		return (
				j < m.length &&
				j >= 0 &&
				i < m.length &&
				i >= 0 &&
				(i + 1) < m.length &&
				(i + 1) >= 0 &&
				m[i + 1][j] < m[i][j]
		);
	}
	
	public boolean mover_izquierda(int[][] m, int i, int j) {
		return (
				j < m.length &&
				j >= 0 &&
				i < m.length &&
				i >= 0 &&
				(j - 1) >= 0 &&
				(j - 1) < m.length &&
				m[i][j - 1] < m[i][j]
		);
	}
	
	public boolean mover_derecha(int[][] m, int i, int j) {
		return (
				j < m.length &&
				j >= 0 &&
				i < m.length &&
				i >= 0 &&
				(j + 1) < m.length &&
				(j + 1) >= 0 &&
				m[i][j + 1] < m[i][j]
		);
	}

}
