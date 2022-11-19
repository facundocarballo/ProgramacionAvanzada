
public class Nodo implements Comparable<Nodo>{
	private int id, costo, num_arista;
	
	public Nodo(int id, int costo, int num_arista){
		this.id = id;
		this.costo = costo;
		this.num_arista = num_arista;
	}


	@Override
	public String toString() {
		return "Nodo [id=" + id + ", costo=" + costo + ", num_Arista=" + num_arista + " ]";
	}

	public int getId() {
		return id;
	}

	public int getCosto() {
		return costo;
	}

	
	public int getNumArista() {
		return this.num_arista;
	}

	@Override
	public int compareTo(Nodo o) {
		return this.id - o.id;
	}
	
	
	
	
	
}
