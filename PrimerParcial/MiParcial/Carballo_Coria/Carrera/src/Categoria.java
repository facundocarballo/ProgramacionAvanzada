// CARBALLO FACUNDO
// CORIA LAUTARO
import java.util.ArrayList;

public class Categoria {
	protected int id;
	protected ArrayList<Corredor> corredores;
	protected int edadMax;
	protected int edadMin;
	protected ArrayList<Integer> ganadores;

	public Categoria(int id, int min, int max){
 		this.id = id;
 		edadMax = max;
 		edadMin = min;
 		corredores = new ArrayList<Corredor>();
 		ganadores = new ArrayList<Integer>();
 	}
	
	protected boolean insertar_corredor(Corredor c) {
		
		if (this.cumple_condicion(c))
		{
			this.corredores.add(c);
			return true;
		}
			
		return false;
		
	}
	
	protected boolean cumple_condicion(Corredor c) {
		return (c.edad >= this.edadMin && c.edad <= this.edadMax);
	}
	
	
	public String imprimir_ganadores() {
		String s = "";
		
		for (Integer id : ganadores) {
			s = s.concat(id.toString() + " ");
		}
				
		return s;
	}
	
protected boolean insertar_ganador(int id) {
		if (this.existe_corredor(id) && this.ganadores.size() < 3)
		{
			this.ganadores.add(id);
			return true;
		}
			
		return false;
		
	}
	
	
	protected boolean existe_corredor(int id) {
		for (Corredor corredor : corredores) {
			if (corredor.id == id) return true;
		}
		return false;
	}

}
