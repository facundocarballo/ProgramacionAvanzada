import java.util.ArrayList;

public class Equipo {

	protected int puntaje;
	protected ArrayList<Character> respuestas;
	
	public Equipo(int p, ArrayList<Character> r) {
		this.puntaje = p;
		this.respuestas = r;
	}
	
	public Equipo() {
		this.puntaje = 0;
		this.respuestas = null;
	}
}
