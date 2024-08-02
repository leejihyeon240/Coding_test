// BFS

import java.util.ArrayList;
import java.util.Stack;

// BfsSearch
public class baekjoon1260_2 {
	
	int count;
	boolean[] visited;
	// ArrayList를 queue로 사용
	ArrayList<Integer>queue;
	int [][] matrix;
	
	// BfsSearch
	public baekjoon1260_2(int count) {
		this.count = count;
		visited = new boolean[count];
		queue = new ArrayList<Integer>();
	}
	
	// bfsTraversal
	public void baekjoon1260_2_Traversal() {
		queue.add(0);
		visited[0] = true;
		
		// queue가 empty일 때까지 돎
		while(queue.size() != 0) {
			// Dequeue
			int node = queue.remove(0);
			
			System.out.print(node + "");
			
			for(int j = 0; j<count ; j++) {
				if(matrix[node][j] != 0 && !visited[j]) {
					// Enqueue
					queue.add(j);
					visited[j] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int count = 8;
		// UndirectedGraph
		baekjoon1260 graph = new baekjoon1260(count);
		// BfsSearch
		baekjoon1260_2 baekjoon1260_2_2 = new baekjoon1260_2(count);
		
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 1);
		graph.addEdges(1, 3, 1);
		graph.addEdges(1, 4, 1);
		graph.addEdges(2, 5, 1);
		graph.addEdges(2, 6, 1);
		graph.addEdges(4, 5, 1);
		graph.addEdges(3, 7, 1);
		
		// BfsSearch
		baekjoon1260_2_2.matrix = graph.getMatrix();
		// BfsSearch, bfsTraversal
		baekjoon1260_2_2.baekjoon1260_2_Traversal();

	}
	
}