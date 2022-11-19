
public class Main {

	public static void main(String[] args) {
		
//		ArrayList<Reina> rs = new ArrayList<Reina>();
		
//		rs.add(new Reina(0,1,1));
//		rs.add(new Reina(1,7,2));
//		rs.add(new Reina(2,0,3));
//		rs.add(new Reina(3,2,4));
//		rs.add(new Reina(4,5,5));
//		rs.add(new Reina(5,3,6));
//		rs.add(new Reina(6,6,7));
//		rs.add(new Reina(7,4,8));
//		rs.add(new Reina(4,2,9));
//		rs.add(new Reina(5,2,10));
		
//		Mapa map = new Mapa(8, rs);
		
//		for (Reina reina : rs) {
//			map.obtener_conflictos(reina);
//			
//			System.out.print(reina.conflictos.size() + " ");
//			for (Integer c : reina.conflictos) {
//				System.out.print(c + " ");
//			}
//			
//			System.out.println("");
//		}
		
		Archivo arch = new Archivo("reinas2");
		
		Mapa map = arch.leerArchivo();
		
		for (Reina reina : map.reinas) {
			map.obtener_conflictos(reina);
		}
		
		arch.guardarArchivo(map.reinas);
		
	}

}
