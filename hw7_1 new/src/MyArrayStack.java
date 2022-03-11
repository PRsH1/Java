import java.util.EmptyStackException;

public class MyArrayStack {
	//스택 클래스
	private int top;
	private int stackSize;
	private int[] itemStack;
	public MyArrayStack() {
		//생성자,배열 크기를 5로 초기화
		top=-1;
		stackSize=5;
		itemStack=new int[5];
	}
	public MyArrayStack(int size) {
		//생성자,배열 크기를 사용자가 입력하여 초기화
		itemStack=new int[size];
		top=-1;
		stackSize=size;
	}
	public boolean isEmpty() {
		//스택이 빌 때의 메소드
		return(top==-1);
	}
	public boolean isFull() {
		//스택이 꽉 찼을때의 메소드
		return (top==stackSize-1);
		
	}
	public void push(int number) {
		//push 메소드
		if(isFull()) {
			//만약 스택이 Full하다면
			System.out.println("Push Fail! Stack is Full!");
		}
		else {
			//아니라면
			itemStack[++top]=number;
		}
			
		
	}
	public int pop() {
		//pop 메소드
		if(isEmpty()) {
			//만약 스택이 비었으면
			System.out.println("Pop Fail! Stack is Empty");
			throw new EmptyStackException();
		}
		else {
			//아니라면
			return itemStack[top--];
		}
	
		
	}
	public int peek() {
		//peek 메소드
		if(isEmpty()) {
			//만약 스택이 비었으면
			System.out.println("Peek Fail! Stack is Empty!");
			throw new EmptyStackException();
		}
		else {
			//아니라면
			return itemStack[top];
		}
		
		
	}

}
