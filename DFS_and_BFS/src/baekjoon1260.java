// DFS는 스택, BFS는 큐

public class baekjoon1260 {
	
	private int count;
	private int [][] vertexMatrix;

	public baekjoon1260(int count) {
		this.count = count;
		
		vertexMatrix = new int[count][count];
	}

	public void addEdges(int from, int to, int weight) {
		vertexMatrix[from][to] = weight;
		vertexMatrix[to][from] = weight;
	}
	
	public int[][] getMatrix(){
		return vertexMatrix;
	}
}
