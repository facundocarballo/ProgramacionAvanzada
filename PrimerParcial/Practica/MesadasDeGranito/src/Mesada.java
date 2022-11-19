
public class Mesada {
	
	// Atributos
	protected int ancho, largo;
	
	// Constructor
	public Mesada(int ancho, int largo) {
		this.ancho = ancho;
		this.largo = largo;
	}
	
	// Metodos

	// Complejidad computacional 1
	public boolean encaja(Mesada m) {
		
		if (m.ancho >= this.ancho && m.largo >= this.largo) {
			return true;
		}
		
		if (m.ancho >= this.largo && m.largo >= this.ancho) {
			
			int anchoAux = m.ancho;
			
			m.ancho = m.largo;
			m.largo = anchoAux;
			
			return true;
		}
		
		return false;
		
	}
}
