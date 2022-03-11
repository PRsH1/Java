
public class UndirectedListGraph {
	private class Node{
		int vertex;
		Node link;
		Node(int vertex){
			this.vertex=vertex;
		}
	}
	private Node []list;
	private int n; //���� ��
	public UndirectedListGraph(int n){
		this.n=n;
		list=new Node[n];
	}
	public boolean hasEdge(int v1,int v2) {
		Node p=list[v2];
		while(p!=null) {
			if(p.vertex==v1)
				return true;
			p=p.link;
		}
	
		return false;
	}
	public void addEdge(int v1,int v2) {
		if(!isValid(v1) || !isValid(v2)) {
			System.out.println("�߸��� ���� ��ȣ�Դϴ�.");
		}
		else if(hasEdge(v1,v2)) {
			System.out.println("�̹� �����ϴ� �����Դϴ�.");
		}
		else {
			Node t=new Node(v2);
			Node s=new Node(v1);
			t.link=list[v1];
			list[v1]=t;
			s.link=list[v2];
			list[v2]=s;
		
		}
	}
	private boolean isValid(int n) {
		return (this.n>n && n>=0);
	}
	public void printAdjacentVertices(int v) {
		Node temp=list[v];
		while(temp!=null) {
			System.out.print(temp.vertex+" ");
			temp=temp.link;
		}
		
	}
}
