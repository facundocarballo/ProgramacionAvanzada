package brains;

import java.util.ArrayList;
import java.util.List;

import edu.unlam.snake.brain.Brain;
import edu.unlam.snake.engine.Direction;
import edu.unlam.snake.engine.Point;

public class MyBrain extends Brain {

	public MyBrain() {
		super("Carballo | Sandes | Lopez Ferme");
//		throw new RuntimeException("Agregar ids loom");
	}

	public Direction getDirection(Point head, Direction previous) {
		List<Point> fruits = info.getFruits();
		List<Point> snake = info.getSnake();
		List<List<Point>> enemies = info.getEnemies();
		List<Point> obstacles = info.getObstacles();

//		 Point head = snake.get(0);
		Point myNextHead = head.clone();
		Point mov_izq = head.clone();
		Point mov_der = head.clone();
		Point mov_arr = head.clone();
		Point mov_aba = head.clone();
		
		mov_aba.moveTo(Direction.UP);
		mov_izq.moveTo(previous.turnLeft());
		mov_der.moveTo(previous.turnRight());
		mov_arr.moveTo(Direction.DOWN);
		int id_mov = 0;
		// 0 -> der
		// 1 -> izq
		// 2 -> abajo
		// 3 -> arriba
		
//		myNextHead.moveTo(previous);

		// Se pueden utilizar System.out para debuggear
		// Deben ser quitados para la entrega
		// System.out.println(myHead);
		// System.out.println(myNextHead);
		
		Point fruta_cerana = fruits.get(0);
		
		// Buscamos la fruta mas cercana
		for (Point fruta : fruits) {
			if (distancia(myNextHead, fruta_cerana) > distancia(myNextHead, fruta)) {
				fruta_cerana = fruta;
			}
		}
		
		// Buscamos el movimiento que deberiamos hacer para llegar a esa fruta
		if (distancia(mov_aba, fruta_cerana) < distancia(myNextHead, fruta_cerana)) {
			myNextHead = mov_aba;
			System.out.println("mov_aba");
			id_mov = 2;
		}
		
		if (distancia(mov_arr, fruta_cerana) < distancia(myNextHead, fruta_cerana)) {
			myNextHead = mov_arr;
			System.out.println("mov_arr");
			id_mov = 3;
		}
		
		if (distancia(mov_der, fruta_cerana) < distancia(myNextHead, fruta_cerana)) {
			myNextHead = mov_der;
			System.out.println("mov_der");
			id_mov = 0;
		}
		
		if (distancia(mov_izq, fruta_cerana) < distancia(myNextHead, fruta_cerana)) {
			myNextHead = mov_izq;
			System.out.println("mov_izq");
			id_mov = 1;
		}
		
		// Si hay un obstaculo, no podemos movernos ahi
		for (Point obstacle : obstacles) {
			if (myNextHead.equals(obstacle))
			{
				return previous.turnRight();
			}
		}
		
		for (Point s : snake) {
			if (myNextHead.equals(s)) {
				return previous.turnRight();
			}
		}
				
		switch (id_mov) {
		case 0: {
			return Direction.RIGHT;
		}
		case 1: {
			return Direction.LEFT;
		}
		case 2: {
			return Direction.UP;
		}
		case 3: {
			return Direction.DOWN;
		}
		default:
			return previous.reverse();
		}
	}

	
	public static double distancia(Point yo, Point otro) {
		return Math.hypot(yo.getX()-otro.getX(), yo.getY()-otro.getY());
	}
}
