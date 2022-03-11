
public class MyLinkedList {
	//MyLinkedList 클래스
	private Node head;//Node형 head 변수
	private class Node{
		//Node class
		Node link;//Node형 링크
		int data;//정수형 변수 data
		Node(int data) {
			//생성자
			this.data=data;

		}
	}
	public MyLinkedList() {
		//생성자
		this.head=null;
	}
	public void addFirst(int number) {
		//맨앞 추가 메소드
		Node t=new Node(number);
		t.link=head;
		head=t;


	}
	public void addLast(int number) {
		//맨뒤 추가 메소드
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
		//맨앞 삭제 메소드
		int temp = 0;
		try {
		temp=head.data;
		}catch(NullPointerException e) {
			System.out.println("에러!:삭제할 값이 없습니다");
		}
		Node t=head;
		head=t.link;
		return temp;
		
	}
	public int removeLast() {
		//맨뒤 삭제 메소드
		int temp2;
		if(head==null) {
			
			System.out.println("에러!: 작제할 값이 없습니다");
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
		//길이 구하는 메소드
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
		//현제 리스트 조회 메소드
		Node temp=head;
		String str ="";
		while(temp!=null) {
			str+=temp.data+" ";
			temp=temp.link;
		}
		return "list ="+str;

	}


}
