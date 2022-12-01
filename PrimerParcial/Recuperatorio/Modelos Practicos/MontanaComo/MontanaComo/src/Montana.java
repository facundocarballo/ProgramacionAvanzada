import java.util.ArrayList;

public class Montana {

	protected ArrayList<Valle> valles;
	protected ArrayList<Cima> cimas;
	protected Carro carro;

	public Montana(ArrayList<Valle> valles, ArrayList<Cima> cimas, Carro c) {
		this.carro = c;
		this.cimas = cimas;
		this.valles = valles;
	}

	private void calcular_coordenadas_x() {

		for (int i = 1; i <= this.valles.size(); i++) {

			this.valles.get(i - 1).caluclar_coordenada_x(this.cimas.get(i - 1));

			// El valle anterior de la cima es el que calculamos arriba.
			this.cimas.get(i).caluclar_coordenada_x(this.valles.get(i - 1));
		}

	}

	private Cima calcular_siguiente_cima() {
		for (Cima cima : this.cimas) {
			if (cima.x > this.carro.x)
				return cima;
		}

		return null;
	}

	private Valle calcular_siguiente_valle() {
		for (Valle valle : this.valles) {
			if (valle.x > this.carro.x)
				return valle;
		}

		return null;
	}

	private void avanzar_cima(Cima cima) {
		while (carro.x < cima.x && carro.velocidad > 0) {
			carro.subir_cima();
		}
	}

	private void avanzar_valle(Valle valle) {
		while (carro.x < valle.x) {
			carro.bajar_cima();
		}
		carro.velocidad--;
	}

	private void avanzar(Cima cima, Valle valle) {

		if (cima == null) {
			this.avanzar_valle(valle);
			return;
		}

		if (valle == null) {
			this.avanzar_cima(cima);
			return;
		}

		if (cima.x < valle.x) {
			this.avanzar_cima(cima);
			this.avanzar_valle(valle);
		} else {
			this.avanzar_valle(valle);
			this.avanzar_cima(cima);
		}
	}

	public String resolver() {

		this.calcular_coordenadas_x();
		carro.calcularY(this.cimas.get(0));

		Cima cima = this.calcular_siguiente_cima();
		Valle valle = this.calcular_siguiente_valle();

		this.avanzar(cima, valle);

		while (carro.velocidad > 0) {
			cima = this.calcular_siguiente_cima();
			valle = this.calcular_siguiente_valle();

			this.avanzar(cima, valle);

		}

		return "" + carro.x + " " + carro.y;
	}

}
