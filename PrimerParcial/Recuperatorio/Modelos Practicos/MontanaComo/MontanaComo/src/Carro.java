
public class Carro {

	protected int x, y, velocidad;
	
	public Carro(int x, int y) {
		this.y = y;
		this.x = x;
		this.velocidad = 0;
	}
	
	
	public void subir_cima() {
		this.velocidad--;
		this.x++;
		this.y++;
	}
	
	public void bajar_cima() {
		this.velocidad++;
		this.x++;
		this.y--;
	}
	
	public void calcularY(Cima cima) {
		this.y = cima.y - this.x;
	}
	
}
