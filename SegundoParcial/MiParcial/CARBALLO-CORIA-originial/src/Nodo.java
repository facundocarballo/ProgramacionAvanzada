
public class Nodo implements Comparable<Nodo>{
	private int id, costo;
	
	public Nodo(int id, int costo){
		this.id = id;
		this.costo = costo;
	}


	@Override
	public String toString() {
		return "Nodo [id=" + id + ", costo=" + costo + "]";
	}

	public int getId() {
		return id;
	}

	public int getCosto() {
		return costo;
	}


	@Override
	public int compareTo(Nodo o) {
		return this.id - o.id;
	}
	
	
	
	
	
}
