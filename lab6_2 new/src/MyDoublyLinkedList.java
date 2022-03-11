

public class MyDoublyLinkedList {
	private class Node{


		int data;
		Node rlink;
		Node llink;
		Node (int number){
			this.data=number;
		}
	}
	private Node head=null;
	public void addFirst(int number) {
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
		String str="";
		Node temp=head;
		while(temp!=null) {
			str+=temp.data+" ";
			temp=temp.rlink;
		}
		return "list ="+str;
	}
	public void printList() {
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
			// .........  완성하세요.




		}
	}
	public int size() {
		Node count=head;
		int number=0;
		while(count!=null) {
			count=count.rlink;
			number+=1;
		}
		return number;
	}
	public void addLast(int number) {
		Node t=new Node(number);
		Node p=head;
		while(p.rlink!=null) {

			p=p.rlink;
			if(p.rlink==null)
				break;
		}

		t.llink=p;
		t.rlink=p.rlink;
		p.rlink=t;
	}
	public int removeFirst() {
		int temp=head.data;
		head=head.rlink;
		head.llink=null;
		return temp;
	}
	public int removeLast() {
		int delete;
		Node p=head;
		while(p.rlink!=null) {
			p=p.rlink;
		}
		delete=p.data;
		p.llink.rlink=null;
		return delete;
	}
	public boolean remove(int number) {
		Node p=head;
		if(head.data==number && head.rlink==null) {
			head=null;
			return true;
		}
		else {
			while(p.rlink!=null) {
				if(p.data==number) {
					if(p.llink==null) {
						head=head.rlink;
						head.llink=null;
						return true;
					}
					
					p.llink.rlink=p.rlink;
					p.rlink.llink=p.llink;
					return true;
				}
				p=p.rlink;

			}
			if(p.rlink==null &&p.data==number) {
				p.llink.rlink=null;
				return true;

			}
		}
		return false;
	}

}



