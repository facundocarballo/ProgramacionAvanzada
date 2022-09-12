
public class Main {

	public static void main(String[] args) {
		CodeGolf codeGolf = new CodeGolf();
		
		int[] c1 = { 1, 2, 3, 4, 5, 6 };
		int[] c2 = { 1, 2, 3, 4, 5, 5, 5, 5 };
		
		System.out.println("RES: " + codeGolf.difFiguritas(c1, c2));
	}

}
