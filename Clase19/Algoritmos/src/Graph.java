import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	// Atributos
	private ArrayList<Node> nodes = new ArrayList<Node>();
	
	// Constructores
	public Graph(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}
	
	// Metodos
	public int getNodes() {
		return this.nodes.size();
	}
	
	public ArrayList<Node> bfs(int source) {
		
		Node node;
		int[] visited = new int[getNodes()];
		ArrayList<Node> res = new ArrayList<Node>();
		Queue<Node> queue = new LinkedList<>();
		
		visited[source] = 1;
		
		queue.add(this.nodes.get(source));
		

		while(!queue.isEmpty()) {
			
			node = queue.remove();
			
			res.add(node);
			
			visited[node.getValue()] = 1;
						
			for (Node n : node.getNeighbours()) {
				if (visited[n.getValue()] != 1) {
					visited[n.getValue()] = 1;
					queue.add(n);
				}
			}
		}
		
		return res;
	}
	

	public ArrayList<Node> dfs(int source) {
		Node node;
		int[] visited = new int[getNodes()];
		ArrayList<Node> res = new ArrayList<Node>();
		Stack<Node> stack = new Stack<Node>();
		
		visited[source] = 1;
		
		stack.add(this.nodes.get(source));
		

		while(!stack.isEmpty()) {
			
			node = stack.firstElement();
			
			res.add(node);
			
			visited[node.getValue()] = 1;
						
			for (Node n : node.getNeighbours()) {
				if (visited[n.getValue()] != 1) {
					visited[n.getValue()] = 1;
					stack.add(n);
				}
			}
		}
		
		return res;
	}


}
