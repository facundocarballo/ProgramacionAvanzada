
public class StreetNumbers {

	// Constantes
	
	// Atributos
	protected int cantidadCasas;
	
	// Constructores
	public StreetNumbers(int n)
	{
		this.cantidadCasas = n;
	}
	
	// Metodos
	
	// Este metodo es cuadratico
	public int obtenerCasaCuadratico()
	{
		int sumaDer = 0, sumaIzq = 1;
		int i = (this.cantidadCasas / 2);
		
		while(i < this.cantidadCasas && sumaDer != sumaIzq)
		{
			// i => numero de casa en cada iteracion
			sumaDer = this.obtenerSumaDer(i);
			sumaIzq = this.obtenerSumaIzq(i);
			
			i++;
		}
		
		if (sumaDer == sumaIzq) return i-1;
		
		return -1;
	}
	
	// Este metodo es lineal
	public int obtenerCasaLineal()
	{
		int sumaDer = 0, sumaIzq = 0;
		int i = (this.cantidadCasas / 2);
		
		sumaDer = this.obtenerSumaDer(i);
		sumaIzq = this.obtenerSumaIzq(i);
		
		
		while(i < this.cantidadCasas && sumaDer != sumaIzq)
		{
			// i => numero de casa en cada iteracion
			sumaDer -= (i+1);
			sumaIzq += (i);
			
			i++;
		}
		
		if (sumaDer == sumaIzq) return i;
		
		return -1;
	}
	
	// Este metodo es constante
	public int obtenerCasaConstante()
	{
		if(this.cantidadCasas<3) return -1;

		double i= Math.sqrt((Math.pow(this.cantidadCasas, 2)+ this.cantidadCasas)/2);
		
		int entera=(int)i;
		
		if((i-entera) == 0) return (int)i;

		return -1;
	}
	
	private int obtenerSumaIzq(int j)
	{
		int s = 0;
		
		for (int i = 0; i < j; i++)
			s += i;
		
		return s;
	}
	
	private int obtenerSumaDer(int j)
	{
		int s = 0;
		
		for (int i = (j + 1); i <= this.cantidadCasas; i++)
			s += i;
		
		return s;
	}
	
	// Overrides
	
}
