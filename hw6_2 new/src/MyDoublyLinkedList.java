/************
 * 파일명:MyDoublyLinkedList.java,MyDoublyLinkedListTest.java
 * 작성자:이승햔
 * 작성일 2018.10.09
 * 내용:다중 연결 리스트 연습
 */



public class MyDoublyLinkedList {
	private class Node{
		//연결 리스트를 표현할 클래스

		int data;
		Node rlink;
		Node llink;
		Node(int data){
			this.data=data;
		}
	}
	private Node head=null;
	public void addFirst(int number) {
		//첫 번째 노드에 데이터를 추가하는 메소드
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
		//연결 리스트를 표현하는 메소드
		String str="";
		Node temp=head;
		while(temp!=null) {
			str+=temp.data+" ";
			temp=temp.rlink;
		}
		return "list ="+str;
	}
	public void printList() {
		//연결 리스트를 역순으로 표현해주는 메소드
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
		//연결 리스트의 크기 반환해주는 메소드
		Node count = head;
		int number=0;
		while(count!=null) {
			count=count.rlink;
			number+=1;
		}
		return number;
	}
	public void addLast(int number) {
		//데이터를 연결 리스트의 마지막에 추가해주는 메소드
		Node t=new Node(number);
		Node p=head;
		if(head==null) {
			//head값이 null이면
			head=t;//head가 t를 가리키도록 만듦
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
		//맨 처음 원소를 삭제해주는 메소드
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
			System.out.println("에러! Null 값이 참조되었습니다. 원소가 없으므로 원소 추가 후 다시 실행해주세요.");
			return 0;
		}
		
		
	}
	public int removeLast() {
		//맨 마지막 메소드를 삭제해주는 메소드
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
			System.out.println("에러! Null 값이 참조되었습니다. 원소가 없으므로 원소 추가 후 다시 실행해주세요.");
			return 0;
		}
	}
	public boolean remove(int number) {
		//정수값을 매게변수로 받아 리스트에서 원소 검색해 있으면 삭제해주는 메소드
		Node p=head;
		try {
		if(head.data==number && head.rlink==null) {
			//만약 head.data의 값과 매개변수가 같고 head.rlink의 값 null이라면
			head=null;//head를 null로
			return true;
		}
		else {
			//아니라면
			while(p.rlink!=null) {
				//p.rlink가 null이 될 때까지
				if(p.data==number) {
					if(p.llink==null) {
						head=head.rlink;
						head.llink=null;
						return true;//true반환
					}

					p.llink.rlink=p.rlink;
					p.rlink.llink=p.llink;
					return true;//true 반환
				}
				p=p.rlink;

			}
			if(p.rlink==null &&p.data==number) {
				//만약 p.rlink가 null이고 p.data가 number와 일치하면
				p.llink.rlink=null;
				return true;

			}
		}
		}catch(NullPointerException e) {
			System.out.println("에러! Null 값이 참조되었습니다. 원소가 없으므로 원소 추가 후 다시 실행해주세요.");
			
		}
		return false;
		}
		
	}







