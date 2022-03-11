public class MyNewLinkedList {
	private class Node {
		int data;
		Node link;
		Node(int item) {
			data = item;
			link = null;
		}
	}

	private Node head = null; // ����Ʈ�� ù��° ��带 ����Ŵ
	private Node last = null; // ����Ʈ�� ������ ��带 ����Ŵ

	// (1) ù��° ���� item�� �����ϴ� �޼ҵ� - ���� �ð��� O(1) �̾�� ��
	public void addFirst(int item) {
		Node t=new Node(item);
		if(head==null && last==null) {
			t.link=head;
			head=t;
			last=t;
		}
		else {
			t.link=head;
			head=t;
		}

	}

	// (2) ������ ���� item�� �����ϴ� �޼ҵ� - ���� �ð��� O(1) �̾�� ��
	public void addLast(int item) {
		Node p=new Node(item);
		if(head==null && last==null) {
			p.link=head;
			head=p;
			last=p;
		}
		else {
			last.link=p;
			last=p;
		}
		
		

	}

	@Override
	public String toString() {
		String result = "";
		Node tmp = head;
		while(tmp != null) {
			result += tmp.data + " ";
			tmp = tmp.link;
		}
		return result;
	}
}