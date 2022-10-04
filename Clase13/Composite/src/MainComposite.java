
public class MainComposite {

	public static void main(String[] args) {
		
		CompoundFig componedorFig = new CompoundFig(
					new Cuadrado(5),
					new Triangulo(5,5),
					new CompoundFig(
								new Cuadrado(9),
								new Triangulo(8, 8),
								new Triangulo(5, 8)
							),
					new Circulo(5)
				);
		
		System.out.println("Res: " + componedorFig.getArea());

	}

}
