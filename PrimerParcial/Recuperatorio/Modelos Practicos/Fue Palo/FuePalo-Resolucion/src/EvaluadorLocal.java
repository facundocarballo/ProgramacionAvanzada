import java.util.ArrayList;

public class EvaluadorLocal {

	// Atributos
	ArrayList<Disparo> disparos;
	
	// Constructor
	public EvaluadorLocal(ArrayList<Disparo> d) {
		this.disparos = d;
	}
	
	// Metodos
	public ArrayList<String> paloGol() {
		ArrayList<String> res = new ArrayList<String>();
		for (Disparo disparo : disparos) {
			int x = disparo.getCoorX();
			int y = disparo.getCoorY();
			
			if (x > 0 && x < 732 && y < 232) {
				res.add("GOL");
			}else if (x == 0 && y <= 232) {
				res.add("PALO");
			}else if (x == 732 && y <= 232) {
				res.add("PALO");
			}else res.add("AFUERA");
		}
		
		return res;
	}
	
	
}
