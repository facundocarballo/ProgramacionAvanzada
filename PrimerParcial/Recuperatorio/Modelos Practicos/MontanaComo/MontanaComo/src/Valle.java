
public class Valle {

	protected int x, y, id;

	public Valle(int x, int y, int id) {
		this.y = y;
		this.x = x;
		this.id = id;
	}

	public void caluclar_coordenada_x(Cima cima_anterior) {
		if (this.id == 0)
			return;

		this.x = cima_anterior.x + (cima_anterior.y - this.y);

	}
}
