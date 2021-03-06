

public class DirectedMatrixGraph {
	private int vertex;
	private int[][] matrix;

	public DirectedMatrixGraph(int n) {
		// TODO Auto-generated constructor stub
		this.matrix=new int[n][n];
		this.vertex=n;
	}

	public void addEdge(int v1, int v2) {
		// TODO Auto-generated method stub

		if(v1<0 || v1>=vertex || v2<0 || v2>=vertex)
			System.out.println("간선 삽입 오류- 잘못된 정점 번호입니다! "+"<"+v1+","+v2+">");
		else if(hasEdge(v1, v2)) {
			System.out.println("간선 삽입 오류- 이미 존재하는 간선입니다 "+"<"+v1+","+v2+">");
		}
		else {
			matrix[v1][v2] =1;
			
		}


	}

	public void printAdjacentVertices(int i) {
		// TODO Auto-generated method stub
		if(i<0 || i>=vertex) {
			System.out.println("잘못된 정점 번호입니다!");
		}
		for(int j=0; j<vertex; j++) {
			if(matrix[i][j]==1) {
				System.out.println(j);
			}

		}
	}
	public boolean hasEdge(int v1,int v2) {

		if(matrix[v1][v2]==1	) {
			return true;
		}

		return false;
	}

}
