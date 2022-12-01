import java.util.ArrayList;

public class Imagenes {
	
	String imagen_comprimida, imagen_descomprimida;
	
	public Imagenes(String ic, String id) {
		this.imagen_comprimida = ic;
		this.imagen_descomprimida = id;
	}
	
	public String comprimrImagen() {
		String res = "";
		
		char[] vec_descomprimido = this.imagen_descomprimida.toCharArray();
		ArrayList<Character> vec_comprimido = new ArrayList<Character>();
		
		char aux = vec_descomprimido[0];
		int contador = 0;
		for (Character caracter : vec_descomprimido) {
			if (caracter == aux) {
				contador++;
			} else {
				
				if (contador > 4) {
					vec_comprimido.add('(');
					vec_comprimido.add(aux);
					vec_comprimido.add((char)(contador+'0'));
					vec_comprimido.add(')');
				} else {
					for (int i = 0; i < contador; i++) {
						vec_comprimido.add(aux);
					}
				}
				
				aux = caracter;
				contador = 1;
			}
		}
		
		if (contador > 4) {
			vec_comprimido.add('(');
			vec_comprimido.add(aux);
			vec_comprimido.add((char)(contador+'0'));
			vec_comprimido.add(')');
		} else {
			for (int i = 0; i < contador; i++) {
				vec_comprimido.add(aux);
			}
		}
		
		for(Character c : vec_comprimido) {
			res += c;
		}
		
		return res;
	}
	
	
	public String descomprimirImagen() {
		String res = "";
		
		char[] vec_comprimido = this.imagen_comprimida.toCharArray();
		ArrayList<Character> vec_descomprimido = new ArrayList<Character>();
		boolean flag_abre_parentesis = false;
		boolean flag_cierra_parentesis = false;
		boolean flag_numero = false;
		char aux = '\0';
		int cant = 0;
		for (Character c : vec_comprimido) {
			
			if (c != '(' && 
				c != ')' && 
				!flag_abre_parentesis && 
				!flag_cierra_parentesis && 
				!flag_numero) {
				vec_descomprimido.add(c);
			}
			
			if (flag_numero) {
				cant = (int)(c-'0');
				flag_numero = false;
			}
			
			if (flag_abre_parentesis) {
				aux = c;
				flag_numero = true;
				flag_abre_parentesis = false;
			}
			
			if (flag_cierra_parentesis) {
				for (int i = 0; i < cant; i++) {
					vec_descomprimido.add(aux);
				}
				flag_cierra_parentesis = false;
				
				if (c == '(') {
					flag_abre_parentesis = true;
				} else {
					vec_descomprimido.add(c);
				}
				
				
			}
			
			if (c == '(') {
				flag_abre_parentesis = true;
			}
			if (c == ')') {
				flag_cierra_parentesis = true;
			}
			
			
		}
		
		if (flag_cierra_parentesis) {
			for (int i = 0; i < cant; i++) {
				vec_descomprimido.add(aux);
			}
			flag_cierra_parentesis = false;
			
		}
		
		for (Character c : vec_descomprimido) {
			res += c;
		}
		
		return res;
	}
}
