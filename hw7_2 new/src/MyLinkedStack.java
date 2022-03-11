import java.util.EmptyStackException;

public class MyLinkedStack {
	private class Node{
		//Node class
		Node(int data) {
			//Node 클래스의 생성자
			// TODO Auto-generated constructor stub
			this.data=data;
		}
		Node link;
		int data;
	}
	private Node top=null;//top은 null로
	public boolean isEmpty() {
		//비었을 시 메소드
		return (top==null);
	}
	public void push(int number) {
		//push메소드
		Node t=new Node(number);
	    t.link=top;
	    top=t;
		
	}
	public int pop() {
		//pop메소드
		if(isEmpty()) {
			//만약 비었을 시
			System.out.println("Pop Fail! Stack is Empty");//에러 안내문 출력
			throw new EmptyStackException();
		}
		else {
			int temp=top.data;
			top=top.link;
			return temp;
		}
		
	}
	public int peek() {
		//peek메소드
		if(isEmpty()) {
			//만약 스택이 비었을 시
			System.out.println("Peek Fail! Stack is Empty!");//에러 안내문 출력
			throw new EmptyStackException();
		}
		else {
			return top.data;
		}
		
	}
	
	

}
