

public class MyLinkedList {
	private Node head;
	private class Node{
		Node link;
		int data;
		Node(int data) {
			this.data=data;

		}
	}
	public MyLinkedList() {
		this.head=null;
	}
	public void addFirst(int number) {
		Node t=new Node(number);
		t.link=head;
		head=t;


	}
	@Override
	public String toString() {
		Node temp=head;
		String str ="";
		while(temp!=null) {
			str+=temp.data+" ";
			temp=temp.link;
		}
		return "list ="+str;

	}
	public void addLast(int number) {
		Node t=new Node(number);
		Node p = head;
		while(true){
			p=p.link;
			if(p.link==null) {
				break;
			}
		}
		t.link=p.link;
		p.link=t;
	}

	public int size() {
		Node count=head;
		int number=0;
		while(count!=null) {
			count=count.link;
			number+=1;
		}
		return number;

	}
	public void removeFirst() {
		Node t=head;
		head=t.link;
	}
	public void removeLast() {
		Node t=head;
		Node p=head;
		while(true){
			p=p.link;
			if(p.link.link==null) {
				break;
			}
		}
		p.link=null;
	}
	public int getSum(){
		int sum=0;
		Node p=head;
		while(p!=null){
			sum+=p.data;
			p=p.link;
		}
		return sum;
	}
}
