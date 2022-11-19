import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Archivo {
	private String nombre;
	
	public Archivo(String nom){
		nombre = nom;
	}
	
	
	public Calles leerArchivo(){
		Scanner sc = null;
		File file = null;
		Calles calles = null;
		Grafo grafo = null;
		ArrayList<Nodo> contrario = new ArrayList<Nodo>();
		try {
			file = new File("casos de prueba/in/"+nombre+".in");
			sc = new Scanner(file);
			Map<Integer, ArrayList<Nodo>> sentidoContrarioMin = new HashMap<Integer, ArrayList<Nodo>>();;
			int cantNodos = sc.nextInt();
			int desde = sc.nextInt();
			int hasta = sc.nextInt();
			int cantConec = sc.nextInt();
			boolean flag = false;
			ArrayList<Nodo> min = new ArrayList<Nodo>();
			
			grafo = new Grafo(cantNodos);
			
			for(int i = 0; i < cantConec; i++){
				int desde1 = sc.nextInt();
				int hasta1 = sc.nextInt();
				int costo = sc.nextInt();
				grafo.setArista(desde1, hasta1, costo);
				contrario = sentidoContrarioMin.get(hasta1);
				if (contrario == null)
				{
					contrario = new ArrayList<Nodo>();
				}
				contrario.add(new Nodo(desde1, costo));
				sentidoContrarioMin.put(hasta1, contrario);
			}
			for(int i = 0; i < cantNodos; i++){
				if (sentidoContrarioMin.get(i) != null) {
					for (Nodo nodo : sentidoContrarioMin.get(i)) {
						if(!flag)
							min.add(nodo);
						else{
							if(nodo.getCosto() == min.get(0).getCosto())
								min.add(nodo);
							if(nodo.getCosto() < min.get(0).getCosto()){
								min.clear();
								min.add(nodo);
							}
						}
					}
				}

			}
			grafo.sentidoContrarioMin = sentidoContrarioMin;
			calles = new Calles(grafo, desde, hasta);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sc.close();
		}
		return calles;
	}
	
	
	public void guardarArchivo(int costo, ArrayList<Integer> camino){
		PrintWriter pf = null;
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("casos de prueba/out/"+nombre+".out");
			pf = new PrintWriter(fw);
			
			pf.println(costo);
			
			/*
			for (int i = 0; i < camino.size(); i++) {
				
				if (i == camino.size() - 1) {
					pf.print("" + camino.get(i));
				} else {
					pf.print("" + camino.get(i) + " ");
				}
			}
			*/
			for (Integer integer : camino) {
				pf.print("" + integer + " ");
			}
					
			
		} catch (Exception e) {
			e.printStackTrace();		
		}finally{
			if(fw != null){
				try {
					fw.close();					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	
}
