
public class Ejercicio00 {

	// Atributos...
	
	// Constructores
	public Ejercicio00()
	{
		
	}
	
	// Metodos
	
	public boolean cumpleLaCondicion(int[][] matriz)
	{
		
		int k = 0, acum = 0;
		boolean retorno = true;
			
		while(k < matriz.length-1 && retorno == true) {
			acum += matriz[k][k];
				
			if(acum != matriz[k+1][k+1]) {
				retorno = false;
			}
			else {
				k++;
			}
		}
			
		return retorno;

	}
	

}
