// CARBALLO FACUNDO
// CORIA LAUTARO
import java.util.ArrayList;

public class Competencia {
	protected ArrayList<Categoria> femenino;
	protected ArrayList<Categoria> masculino;
 	
 	public Competencia(ArrayList<Categoria> f, ArrayList<Categoria> m){
 		femenino = f;
 		masculino = m;
 	}
 	
 	public boolean inscribir_corredor(Corredor c) {
 		
 		// Recorremos todas lsa categorias
 		if (c.sexo == 'M') {
 			
 			// buscar categoria masculina
 			for (Categoria cate : masculino) {
				if (cate.insertar_corredor(c)) {
					return true;
				}
			}
 		
 		} else {
 			
 			// busca la categoria femenina
 			for (Categoria cate : femenino) {
				if (cate.insertar_corredor(c)) {
					return true;
				}
			}
 		}
 		
 		return false;
 		
 	}
 	
 	
 	public boolean insertar_ganador(int id) {

 		// Buscamos el id en la categoria femenina
 		for (Categoria categoria : femenino) {
			if (categoria.insertar_ganador(id) == true)
				return true;
		}
 		
 		// Buscamos el id en la categoria masculina
 	 	for (Categoria categoria : masculino) {
 			if (categoria.insertar_ganador(id) == true)
 				return true;
 		}
 	 	
 	 	return false;
 	}
 	
}
