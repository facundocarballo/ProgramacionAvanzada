import java.util.ArrayList;

public class Node {
	
	// Atributos
	private int value, cost;
	private ArrayList<Node> neighbours;
	
	// Constructor
	public Node(int v, int c) {
		this.setValue(v);
		this.setCost(c);
		
		this.neighbours = new ArrayList<Node>();
	}
	
	// Metodos
	public void setNode(Node n) {
		neighbours.add(n);
	}
	
	public int getAmountOfNeighbours() {
		return neighbours.size();
	}
	
	public Node getNode(int i) {
		return neighbours.get(i);
	}
	
	public ArrayList<Node> getNeighbours() {
		return neighbours;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
