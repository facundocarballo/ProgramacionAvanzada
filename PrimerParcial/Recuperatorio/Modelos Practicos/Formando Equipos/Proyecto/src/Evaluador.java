import java.util.ArrayList;
import java.util.HashMap;

public class Evaluador {

	protected ArrayList<Contribuidor> contribuidores;
	protected int cant_preguntas;
	
	public Evaluador(ArrayList<Contribuidor> contribuidores, int c) {
		this.contribuidores = contribuidores;
		this.cant_preguntas = c;
	}
	
	public Equipo resolver() {
		Equipo equipo = new Equipo();
		@SuppressWarnings("unchecked")
		ArrayList<Contribuidor> aux_contribuidores = (ArrayList<Contribuidor>) this.contribuidores.clone();
		HashMap<String, Integer> respuestas = new HashMap<String, Integer>();
		
		for (int i = 0; i < this.cant_preguntas; i++) {

			for (Contribuidor contribuidor : aux_contribuidores) {
				
				ArrayList<Character> res_act = new ArrayList<Character>();
				
				for (int j = 0; j <= i; j++) {
					res_act.add(contribuidor.respuestas[j]);
				}
				
				
				int cant_mismas_respuestas = respuestas.getOrDefault(res_act.toString(), 0);
				int nuevo_puntaje = (int) ((cant_mismas_respuestas+1) * Math.pow(res_act.size(), 2));
				if (nuevo_puntaje > equipo.puntaje) {
					equipo.puntaje = nuevo_puntaje;
					equipo.respuestas = res_act;
				}
				
				respuestas.put(res_act.toString(), cant_mismas_respuestas+1);
			}
			
		}

		
		return equipo;
	}
}
