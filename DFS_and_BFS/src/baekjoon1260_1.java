// DFS

import java.util.Stack;

public class baekjoon1260_1 {
	
	int count;
	boolean[] visited;
	Stack<Integer> stack;
	int [][] matrix;
	
	public baekjoon1260_1(int count) {
		this.count = count;
		visited = new boolean[count];
		stack = new Stack<Integer>();
	}
	
	public void baekjoon1260_1_Traversal() {
		stack.push(0);
		visited[0] = true;
		
		while(stack.size() != 0) {
			int node = stack.pop();
			
			System.out.print(node + "");
			
			for(int j = 0; j<count ; j++) {
				if(matrix[node][j] != 0 && !visited[j]) {
					stack.push(j);
					visited[j] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int count = 8;
		baekjoon1260 graph = new baekjoon1260(count);
		baekjoon1260_1 baekjoon1260_1_1 = new baekjoon1260_1(count);
		
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 1);
		graph.addEdges(1, 3, 1);
		graph.addEdges(1, 4, 1);
		graph.addEdges(2, 5, 1);
		graph.addEdges(2, 6, 1);
		graph.addEdges(4, 5, 1);
		graph.addEdges(3, 7, 1);
		
		baekjoon1260_1_1.matrix = graph.getMatrix();
		baekjoon1260_1_1.baekjoon1260_1_Traversal();

	}
	
}