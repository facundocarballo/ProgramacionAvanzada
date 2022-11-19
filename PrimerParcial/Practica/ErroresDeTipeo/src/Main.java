import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println(procesador("Estamos pintando!", "ostant!Em inpados"));
	}
	
	// Complejidad computacional n
	public static int indexOfFrom(char c, ArrayList<Character> cs, int from) {
		int index = -1;
		
		while(from < cs.size() && index == -1) {
			if (cs.get(from) == c)
			{
				index = from;
			}
			from++;
		}
		
		return index;
	}
	
	// Complejidad computacional n^2
	public static int procesador(String texto, String prueba) {
		
		int contador = 0;
		
		ArrayList<Character> cPrueba = new ArrayList<Character>();
		
		// Complejidad computacional n
		for (int i = 0; i < texto.length(); i++) {
			cPrueba.add(prueba.charAt(i));
		}
		
		// Complejidad computacional n^2
		for(int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			
			// Complejidad computacional n
			int jc = indexOfFrom(c, cPrueba, i);
			
			// Complejidad computacional n
			for (int j = jc; j > i; j--) {
				
				char cOld = cPrueba.get(j);
				char cNew = cPrueba.get(j-1);
				
				cPrueba.set(j, cNew);
				cPrueba.set(j-1, cOld);
				
				contador++;
			}
			
			
		}
		
		
		return contador;
	}

}
