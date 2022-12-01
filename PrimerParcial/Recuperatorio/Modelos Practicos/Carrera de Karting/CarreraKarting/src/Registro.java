
public class Registro {

	private Punto inicio, fin, curva;
	private int movimientos;
	
	public Registro(Punto i, Punto f, Punto c, int m) {
		this.curva = c;
		this.inicio = i;
		this.fin = f;
		this.movimientos = m;
	}

	public Punto getInicio() {
		return inicio;
	}

	public Punto getCurva() {
		return curva;
	}

	public Punto getFin() {
		return fin;
	}

	public int getMovimientos() {
		return movimientos;
	}

	@Override
	public String toString() {
		return "Inicio: (" + this.inicio.getX() + ", " + this.inicio.getY() + " )" + " Curva: (" + this.curva.getX() + ", " + this.curva.getY() + " )" + " Fin: (" + this.fin.getX() + ", " + this.fin.getY() + " )"; 
	}
}
