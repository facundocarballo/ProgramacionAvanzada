
public class Antivirus {

	private char primera_letra, segunda_letra;
	private char[] texto_infectado;
	private char[] texto_original;
	private int cant_letras_infectadas;
	private int cant_letras_original;
	
	
	public Antivirus(char pl, char sl, char[] texto_infectado, int cant_letras_infectadas) {
		this.cant_letras_infectadas = cant_letras_infectadas;
		this.texto_infectado = texto_infectado;
		this.primera_letra = pl;
		this.segunda_letra = sl;
	}
	
	
	public void desinfectar() {

		char[] texto_desinfectado = new char[this.cant_letras_infectadas];
		int cant_letras = 0;

		
		for (int i = 0; i < this.cant_letras_infectadas; i++) {
			if (
					this.texto_infectado[i] == segunda_letra &&
					(i-1) >= 0 && 
					(i+1) < this.cant_letras_infectadas && 
					this.texto_infectado[i-1] == primera_letra &&
					this.texto_infectado[i+1] == primera_letra
			) {

				
			}else {
				texto_desinfectado[cant_letras] = this.texto_infectado[i];
				cant_letras++;
			}
		}
		
		this.texto_original = texto_desinfectado;
		this.cant_letras_original = cant_letras;
	}
	
	
	public int getCantLetrasOriginal() {
		return this.cant_letras_original;
	}
	
	public char[] getTextoOriginal() {
		return this.texto_original;
	}
}
