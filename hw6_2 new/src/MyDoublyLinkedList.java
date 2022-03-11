/************
 * ���ϸ�:MyDoublyLinkedList.java,MyDoublyLinkedListTest.java
 * �ۼ���:�̽��h
 * �ۼ��� 2018.10.09
 * ����:���� ���� ����Ʈ ����
 */



public class MyDoublyLinkedList {
	private class Node{
		//���� ����Ʈ�� ǥ���� Ŭ����

		int data;
		Node rlink;
		Node llink;
		Node(int data){
			this.data=data;
		}
	}
	private Node head=null;
	public void addFirst(int number) {
		//ù ��° ��忡 �����͸� �߰��ϴ� �޼ҵ�
		Node t=new Node(number);
		if(head==null) {
			head=t;
		}
		else {
			t.rlink=head;
			head.llink=t;
			head=t;
		}
	}
	@Override
	public String toString() {
		//���� ����Ʈ�� ǥ���ϴ� �޼ҵ�
		String str="";
		Node temp=head;
		while(temp!=null) {
			str+=temp.data+" ";
			temp=temp.rlink;
		}
		return "list ="+str;
	}
	public void printList() {
		//���� ����Ʈ�� �������� ǥ�����ִ� �޼ҵ�
		if(head == null) {
			System.out.println("( )( )");
		}
		else {

			System.out.print("( ");
			Node temp = head;
			while(temp.rlink!=null) {
				System.out.print(temp.data+" ");
				temp=temp.rlink;
			}
			System.out.print(temp.data+" ");

			System.out.println(" )");
			System.out.print("( ");
			while(temp!=head.llink) {
				System.out.print(temp.data+" ");
				temp=temp.llink;
			}
			System.out.println(" )");
			// .........  �ϼ��ϼ���.




		}
	}
	public int size() {
		//���� ����Ʈ�� ũ�� ��ȯ���ִ� �޼ҵ�
		Node count = head;
		int number=0;
		while(count!=null) {
			count=count.rlink;
			number+=1;
		}
		return number;
	}
	public void addLast(int number) {
		//�����͸� ���� ����Ʈ�� �������� �߰����ִ� �޼ҵ�
		Node t=new Node(number);
		Node p=head;
		if(head==null) {
			//head���� null�̸�
			head=t;//head�� t�� ����Ű���� ����
		}
		else {
			while(p.rlink!=null) {

				p=p.rlink;
				if(p.rlink==null)
					break;
			}

			t.llink=p;
			t.rlink=p.rlink;
			p.rlink=t;
		}
	}

	public int removeFirst() {
		//�� ó�� ���Ҹ� �������ִ� �޼ҵ�
		try {
		int delete=head.data;
		
		
		if(head.rlink==null) {
			head=null;
			return delete;
		}
		else {
			head=head.rlink;
			head.llink=null;
			return delete;
		}
		}catch(NullPointerException e) {
			System.out.println("����! Null ���� �����Ǿ����ϴ�. ���Ұ� �����Ƿ� ���� �߰� �� �ٽ� �������ּ���.");
			return 0;
		}
		
		
	}
	public int removeLast() {
		//�� ������ �޼ҵ带 �������ִ� �޼ҵ�
		int delete;
		Node p=head;
		try {
		if(head.rlink==null) {
			delete=head.data;
			head=null;
			return delete;
		}
		else {
			while(p.rlink!=null) {
				p=p.rlink;
			}
			delete=p.data;
			p.llink.rlink=null;
			return delete;
		}
		}catch(NullPointerException e) {
			System.out.println("����! Null ���� �����Ǿ����ϴ�. ���Ұ� �����Ƿ� ���� �߰� �� �ٽ� �������ּ���.");
			return 0;
		}
	}
	public boolean remove(int number) {
		//�������� �ŰԺ����� �޾� ����Ʈ���� ���� �˻��� ������ �������ִ� �޼ҵ�
		Node p=head;
		try {
		if(head.data==number && head.rlink==null) {
			//���� head.data�� ���� �Ű������� ���� head.rlink�� �� null�̶��
			head=null;//head�� null��
			return true;
		}
		else {
			//�ƴ϶��
			while(p.rlink!=null) {
				//p.rlink�� null�� �� ������
				if(p.data==number) {
					if(p.llink==null) {
						head=head.rlink;
						head.llink=null;
						return true;//true��ȯ
					}

					p.llink.rlink=p.rlink;
					p.rlink.llink=p.llink;
					return true;//true ��ȯ
				}
				p=p.rlink;

			}
			if(p.rlink==null &&p.data==number) {
				//���� p.rlink�� null�̰� p.data�� number�� ��ġ�ϸ�
				p.llink.rlink=null;
				return true;

			}
		}
		}catch(NullPointerException e) {
			System.out.println("����! Null ���� �����Ǿ����ϴ�. ���Ұ� �����Ƿ� ���� �߰� �� �ٽ� �������ּ���.");
			
		}
		return false;
		}
		
	}







