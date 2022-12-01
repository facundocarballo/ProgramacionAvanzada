
public class Cima {
	protected int x, y, id;

	public Cima(int x, int y, int id) {
		this.y = y;
		this.x = x;
		this.id = id;
	}

	public void caluclar_coordenada_x(Valle valle_anterior) {
		if (this.id == 0)
			return;

		this.x = valle_anterior.x + (this.y - valle_anterior.y);

	}

}
