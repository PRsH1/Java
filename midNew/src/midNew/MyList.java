package midNew;

public class MyList {

	// ����Ʈ ��� ������ ǥ���ϴ� Ŭ����
	private class Node {
		int data;
		Node link;
		Node(int data) {
			this.data = data;
		}
	}

	// ����Ʈ�� �� �� ���Ҹ� ����Ű�� �ν��Ͻ� ����
	private Node head = null;


	// (4) item�� ����Ʈ�� �� �տ� �����ϴ� �޼ҵ�
	public void addFirst(int item) {
		Node t=new Node(item);
		t.link=head;
		head=t;


	}

	// (5) ����Ʈ�� ���� ���� �����ϴ� �޼ҵ�(�� �޼ҵ� ���� ��¹� ����)
	public int getSum() {
		Node p=head;
		int sum = 0;
		while(p!=null) {
			
			sum+=p.data;
			p=p.link;
		}
		return sum;







	}
}