
public class Main {
	
	public static void main(String[] args) {
		
		Tren t = new Tren(100);
		
		Especie e1 = new Especie("elefante", 200, 1);
		Especie e2 = new Especie("leon", 1500, 2);
		Especie e3 = new Especie("liebre", 20, 1);
		Especie e4 = new Especie("mono", 5, 10);
		Especie e5 = new Especie("pantera", 2000, 2);
		Especie e6 = new Especie("zorro", 50, 10);
		
		t.insertar_especie(e1);
		t.insertar_especie(e2);
		t.insertar_especie(e3);
		t.insertar_especie(e4);
		t.insertar_especie(e5);
		t.insertar_especie(e6);
		
		System.out.println("Cant. Vagones: " + t.vagones.size());
		System.out.println("Agresividad Total: " + t.agresividad_actual());
		
	}
	
}
