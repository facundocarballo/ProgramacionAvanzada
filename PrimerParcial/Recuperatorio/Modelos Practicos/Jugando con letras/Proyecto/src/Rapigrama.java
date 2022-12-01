import java.util.ArrayList;

public class Rapigrama {

	private char[][] crucigrama;
	protected ArrayList<Palabra> palabras;
	
	public Rapigrama(char[][] crucigrama, ArrayList<Palabra> palabras) {
		this.crucigrama = crucigrama;
		this.palabras = palabras;
	}
	
	public void resolver() {
		
		for (Palabra palabra : this.palabras) {
			palabra.direccion = this.buscar_palabra(palabra.texto);
		}
		
	}
	
	private char buscar_palabra(String palabra) {
		char res = '\0';
		char[] letras_a_buscar = new char[palabra.length()];
		letras_a_buscar = palabra.toCharArray();
		
		
		for (int i = 0; i < this.crucigrama.length; i++) {
			for (int j = 0; j < this.crucigrama.length; j++) {
				
				if (this.crucigrama[i][j] == letras_a_buscar[0]) {
					
					// Recorremos para arriba
					if (buscar_palabra_arriba(letras_a_buscar, i, j)) {
						res = 'N';
						break;
					}
					
					// Recorremos para la derecha
					if (buscar_palabra_derecha(letras_a_buscar, i, j)) {
						res = 'E';
						break;
					}
					
					// Recorremos para abajo
					if (buscar_palabra_abajo(letras_a_buscar, i, j)) {
						res = 'S';
						break;
					}
					
					// Recorremos para la izquierda
					if (buscar_palabra_izquierda(letras_a_buscar, i, j)) {
						res = 'O';
						break;
					}
				}

			}
		}
		
		return res;
	}
	
	private boolean buscar_palabra_arriba(char[] letras_a_buscar, int i, int j) {
		int contador = 0;
		while (
				i >= 0 && 
				contador < letras_a_buscar.length && 
				this.crucigrama[i][j] == letras_a_buscar[contador]) 
		{
			contador++;
			i--;
		}
		
		return (contador >= letras_a_buscar.length);
	}
	
	private boolean buscar_palabra_derecha(char[] letras_a_buscar, int i, int j) {
		int contador = 0;
		while (
				j < this.crucigrama.length && 
				contador < letras_a_buscar.length && 
				this.crucigrama[i][j] == letras_a_buscar[contador]) 
		{
			contador++;
			j++;
		}
		
		return (contador >= letras_a_buscar.length);
	}

	private boolean buscar_palabra_abajo(char[] letras_a_buscar, int i, int j) {
		int contador = 0;
		while (
				i < this.crucigrama.length && 
				contador < letras_a_buscar.length && 
				this.crucigrama[i][j] == letras_a_buscar[contador]) 
		{
			contador++;
			i++;
		}
		
		return (contador >= letras_a_buscar.length);
	}

	private boolean buscar_palabra_izquierda(char[] letras_a_buscar, int i, int j) {
		int contador = 0;
		while (
				j >= 0 && 
				contador < letras_a_buscar.length && 
				this.crucigrama[i][j] == letras_a_buscar[contador]) 
		{
			contador++;
			j--;
		}
		
		return (contador >= letras_a_buscar.length);
	}
}
