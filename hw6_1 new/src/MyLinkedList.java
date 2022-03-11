
public class MyLinkedList {
	//MyLinkedList Ŭ����
	private Node head;//Node�� head ����
	private class Node{
		//Node class
		Node link;//Node�� ��ũ
		int data;//������ ���� data
		Node(int data) {
			//������
			this.data=data;

		}
	}
	public MyLinkedList() {
		//������
		this.head=null;
	}
	public void addFirst(int number) {
		//�Ǿ� �߰� �޼ҵ�
		Node t=new Node(number);
		t.link=head;
		head=t;


	}
	public void addLast(int number) {
		//�ǵ� �߰� �޼ҵ�
		Node t=new Node(number);
		Node p = head;
		while(p!=null){
			if(p.link==null) {
				break;
			}
			p=p.link;

		}
		if(p==null){
			t.link=head;
			head=t;
		}


		else{
			t.link=p.link;
			p.link=t;
		}
	}
	public int removeFirst() {
		//�Ǿ� ���� �޼ҵ�
		int temp = 0;
		try {
		temp=head.data;
		}catch(NullPointerException e) {
			System.out.println("����!:������ ���� �����ϴ�");
		}
		Node t=head;
		head=t.link;
		return temp;
		
	}
	public int removeLast() {
		//�ǵ� ���� �޼ҵ�
		int temp2;
		if(head==null) {
			
			System.out.println("����!: ������ ���� �����ϴ�");
			throw new NullPointerException();
		}
		Node p=head;
		if(p.link==null) {
			temp2=head.data;
			head=p.link;
			return temp2;
		}
		else {
		while(p!=null){
			if(p.link.link==null) {
				break;
			}
			p=p.link;
		}
		temp2=p.link.data;
		p.link=null;
		return temp2;
		}
	}
	public int size() {
		//���� ���ϴ� �޼ҵ�
		Node count=head;
		int number=0;
		while(count!=null) {
			count=count.link;
			number+=1;
		}
		return number;

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
	

	@Override
	public String toString() {
		//���� ����Ʈ ��ȸ �޼ҵ�
		Node temp=head;
		String str ="";
		while(temp!=null) {
			str+=temp.data+" ";
			temp=temp.link;
		}
		return "list ="+str;

	}


}
