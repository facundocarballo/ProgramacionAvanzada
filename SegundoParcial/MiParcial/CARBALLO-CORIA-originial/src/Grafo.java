import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Grafo {
	private List<PriorityQueue<Nodo>> grafo;
	protected int[] predecedentes;
	protected Map<Integer, ArrayList<Nodo>> sentidoContrarioMin;
	
	
	public Grafo(int tam){
		grafo =  new LinkedList<PriorityQueue<Nodo>>();
		for(int i = 0; i < tam+1; i++){
			grafo.add(new PriorityQueue<Nodo>());
//			grafo.get(i).add(new Nodo(i, 0));
		}
		sentidoContrarioMin = new HashMap<Integer, ArrayList<Nodo>>();
		predecedentes = new int[tam+1];
	}
	
	
	public int getNodos(){
		return grafo.size();
	}
	
	public int getArista(int desde, int hasta){
		for (Nodo actual : grafo.get(desde)) {
			if(hasta == actual.getId())
				return actual.getCosto();
		}
		return -1;
	}
	
	
	public void setArista(int desde, int hasta, int costo){
		grafo.get(desde).add(new Nodo(hasta, costo));
	}
	
	public int[] dijkstra(int desde){
		int[] distancia = new int[getNodos()+1];
		
		for(int i = 0; i < getNodos(); i++){
			distancia[i] = Integer.MAX_VALUE;
		}
		
		distancia[desde] = 0;
		
		for (Nodo actual : grafo.get(desde)) {
			distancia[actual.getId()] = actual.getCosto();
		}
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(desde);
		
		Set<Integer> vMenosS = new HashSet<Integer>();
		for(int i = 0; i < getNodos(); i++){
			if(i != desde)
				vMenosS.add(i);
		}
		
		
		for(int i = 0; i< getNodos();  i++){
			predecedentes[i] = desde;
		}
		
		while(!vMenosS.isEmpty()){
			boolean flag = false;
			int min = 0;
			int w = 0;
			
			for (Integer integer : vMenosS) {
				if(!flag){
					min = distancia[integer];
					w = integer;
					flag = true;
				}
				else{
					if(distancia[integer] < min){
						min = distancia[integer];
						w = integer;
					}
				}
			}
			
			vMenosS.remove(w);
			s.add(w);
			
			PriorityQueue<Nodo> aux = new PriorityQueue<Nodo>();
			aux.addAll(grafo.get(w));
			
			for (Nodo nodoAux : aux) {
				if(distancia[nodoAux.getId()] > min + nodoAux.getCosto()){
					distancia[nodoAux.getId()] = min + nodoAux.getCosto();
					predecedentes[nodoAux.getId()] = w;				
				}
			}
		}
		return distancia;
	}

	public int[] dijkstraModificado(int desde){
		int[] distancia = new int[getNodos()];
		
		for(int i = 0; i < getNodos(); i++){
			distancia[i] = Integer.MAX_VALUE;
		}
		
		distancia[desde] = 0;
		
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(desde);
		
		Set<Integer> vMenosS = new HashSet<Integer>();
		for(int i = 0; i < getNodos(); i++){
			if(i != desde)
				vMenosS.add(i);
		}
		
		
		for (Nodo actual : grafo.get(desde)) {
			predecedentes[actual.getId()] = desde;
		}
		for(int i = 0; i < getNodos(); i++){
			if(predecedentes[i] != desde)
				predecedentes[i] = -1;
		}
		
		for (Nodo actual : grafo.get(desde)) {
			distancia[actual.getId()] = actual.getCosto();
			ArrayList<Nodo> aux = sentidoContrarioMin.get(desde);
			if (aux != null) {
				for (Nodo nodo : aux) {
					distancia[nodo.getId()] = nodo.getCosto();
				}
			}

		}
		
		while(!vMenosS.isEmpty()){
			boolean flag = false;
			int min = 0;
			int w = 0;
			
			for (Integer integer : vMenosS) {
				if(!flag){
					min = distancia[integer];
					w = integer;
					flag = true;
				}
				else{
					if(distancia[integer] < min){
						min = distancia[integer];
						w = integer;
					}
				}
			}
			
			vMenosS.remove(w);
			s.add(w);
			if (sentidoContrarioMin.get(w) != null) {
				for (Nodo aux : sentidoContrarioMin.get(w)) {
					if(predecedentes[aux.getId()] == -1){
						setArista(w, aux.getId(), aux.getCosto());
					}
				}
			}

			PriorityQueue<Nodo> aux = new PriorityQueue<Nodo>();
			aux.addAll(grafo.get(w));
			
			for (Nodo nodoAux : aux) {
				if(distancia[nodoAux.getId()] > min + nodoAux.getCosto()){
					distancia[nodoAux.getId()] = min + nodoAux.getCosto();
					predecedentes[nodoAux.getId()] = w;				
				}
			}
		}
		return distancia;
	}
	
	
	
}
