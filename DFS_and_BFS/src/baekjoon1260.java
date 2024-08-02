// DFS는 스택, BFS는 큐 활용

// UndirectedGraph
public class baekjoon1260 {
	
	private int count;
	private int [][] vertexMatrix;

	// UndirectedGraph
	public baekjoon1260(int count) {
		this.count = count;
		
		vertexMatrix = new int[count][count];
	}

	// 대칭적으로 나타남
	public void addEdges(int from, int to, int weight) {
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}
	
	public int[][] getMatrix(){
		return vertexMatrix;
	}
}
