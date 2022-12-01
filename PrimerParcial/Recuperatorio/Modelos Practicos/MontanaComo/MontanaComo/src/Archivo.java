import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {

	private String path;

	public Archivo(String p) {
		this.path = p;
	}

	public Montana leerArchivo() {

		File file = null;
		Scanner scanner = null;
		Montana montana = null;
		Carro carro = null;

		try {

			file = new File("casos de prueba/in/" + this.path + ".in");
			scanner = new Scanner(file);

			int cant_cimas_valles = scanner.nextInt();

			ArrayList<Cima> cimas = new ArrayList<Cima>();
			ArrayList<Valle> valles = new ArrayList<Valle>();

			for (int i = 1; i <= cant_cimas_valles; i++) {
				if ((i % 2) == 0) {
					valles.add(new Valle(0, scanner.nextInt(), i + 1));
				} else {
					cimas.add(new Cima(0, scanner.nextInt(), i + 1));
				}
			}

			int usuarioX = scanner.nextInt();

			carro = new Carro(usuarioX, 0);

			montana = new Montana(valles, cimas, carro);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

		return montana;

	}

	public void guardarArchivo(String res) {
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;

		try {

			fileWriter = new FileWriter("casos de prueba/out/" + this.path + ".out");
			printWriter = new PrintWriter(fileWriter);

			printWriter.print(res);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
