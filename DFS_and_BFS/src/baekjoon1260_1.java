// DFS = 스택 = 가장 나중에 들어간 데이터가 나옴
// push, pop

import java.util.Stack;

// DfsSearch
public class baekjoon1260_1 {
	
	int count;
	boolean[] visited;
	Stack<Integer> stack;
	int [][] matrix;
	
	// DfsSearch
	public baekjoon1260_1(int count) {
		this.count = count;
		visited = new boolean[count];
		stack = new Stack<Integer>();
	}
	
	// dfsTraversal
	public void baekjoon1260_1_Traversal() {
		// 처음에 0번 push
		stack.push(0);
		visited[0] = true;
		
		// stack 사이즈가 empty일 때까지 돎
		while(stack.size() != 0) {
			// (0) 일단 하나를 꺼내
			// (2) 맨 위에 있는 거 pop
			int node = stack.pop();
			
			System.out.print(node + "");
			
			// (1) 꺼낸 거랑 인접 노드인 것 push 하고
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
		// UndirectedGraph
		baekjoon1260 graph = new baekjoon1260(count);
		// DfsSearch
		baekjoon1260_1 baekjoon1260_1_1 = new baekjoon1260_1(count);
		
		graph.addEdges(0, 1, 1);
		graph.addEdges(0, 2, 1);
		graph.addEdges(1, 3, 1);
		graph.addEdges(1, 4, 1);
		graph.addEdges(2, 5, 1);
		graph.addEdges(2, 6, 1);
		graph.addEdges(4, 5, 1);
		graph.addEdges(3, 7, 1);
		
		// DfsSearch
		baekjoon1260_1_1.matrix = graph.getMatrix();
		// DfsSearch, dfsTraversal
		baekjoon1260_1_1.baekjoon1260_1_Traversal();

	}
	
}