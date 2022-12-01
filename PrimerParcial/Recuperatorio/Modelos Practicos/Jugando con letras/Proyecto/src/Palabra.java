
public class Palabra {

	protected String texto;
	protected int id;
	protected char direccion;
	
	public Palabra(String p, int i) {
		this.texto = p;
		this.id = i;
		this.direccion = '\0';
	}
}
