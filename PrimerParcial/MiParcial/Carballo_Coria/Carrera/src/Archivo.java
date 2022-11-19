// CARBALLO FACUNDO
// CORIA LAUTARO
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {
	private String nom;
	
	public Archivo(String n){
		nom = n;
	}
	
	
	public Competencia leerArch(){
		Scanner scanner = null;
		ArrayList<Categoria> fem = new ArrayList<>();
		ArrayList<Categoria> masc = new ArrayList<>();
		Competencia c = null;
		try{
			File file = new File("caso de prueba/in/"+nom+".in");
			scanner = new Scanner(file);
			
			int cantCorredores = scanner.nextInt();
			int cantFem = scanner.nextInt();
			int cantMasc = scanner.nextInt();
			int cantLlegaron = scanner.nextInt();
			
			for(int i = 0 ; i < cantFem; i++){
				int edadMin = scanner.nextInt();
				int edadMax = scanner.nextInt();
				fem.add(new Categoria(i+1, edadMin, edadMax));
			}
			
			for(int i = 0 ; i < cantMasc; i++){
				int edadMin = scanner.nextInt();
				int edadMax = scanner.nextInt();
				masc.add(new Categoria(i+1, edadMin, edadMax));
			}
			
			c = new Competencia(fem, masc);
			
			for(int i = 0 ; i < cantCorredores; i++){
				int edad = scanner.nextInt();
				String s = scanner.nextLine();
				char sexo = (s.toCharArray()[0]);
				
				c.inscribir_corredor(new Corredor(edad, sexo,i+1));
			}
						
			for(int i = 0 ; i < cantLlegaron; i++){
				int id = scanner.nextInt();
				
				c.insertar_ganador(id);
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			scanner.close();
		}
		return c;
	}
	
	
	public void guardarArch(Competencia c){
		PrintWriter pw = null;
		FileWriter fw = null;
		
		try{
			fw = new FileWriter("caso de prueba/out/"+nom+".out");
			pw = new PrintWriter(fw);
			
			for(int i = 0; i < c.femenino.size(); i++){
				pw.println(i+1+" "+ c.femenino.get(i).imprimir_ganadores());
			}
			
			for(int i = 0; i < c.masculino.size(); i++){
				pw.println(i+1+" "+ c.femenino.get(i).imprimir_ganadores());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
