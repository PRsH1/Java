import java.util.EmptyStackException;

public class MyArrayStack {
	//���� Ŭ����
	private int top;
	private int stackSize;
	private int[] itemStack;
	public MyArrayStack() {
		//������,�迭 ũ�⸦ 5�� �ʱ�ȭ
		top=-1;
		stackSize=5;
		itemStack=new int[5];
	}
	public MyArrayStack(int size) {
		//������,�迭 ũ�⸦ ����ڰ� �Է��Ͽ� �ʱ�ȭ
		itemStack=new int[size];
		top=-1;
		stackSize=size;
	}
	public boolean isEmpty() {
		//������ �� ���� �޼ҵ�
		return(top==-1);
	}
	public boolean isFull() {
		//������ �� á������ �޼ҵ�
		return (top==stackSize-1);
		
	}
	public void push(int number) {
		//push �޼ҵ�
		if(isFull()) {
			//���� ������ Full�ϴٸ�
			System.out.println("Push Fail! Stack is Full!");
		}
		else {
			//�ƴ϶��
			itemStack[++top]=number;
		}
			
		
	}
	public int pop() {
		//pop �޼ҵ�
		if(isEmpty()) {
			//���� ������ �������
			System.out.println("Pop Fail! Stack is Empty");
			throw new EmptyStackException();
		}
		else {
			//�ƴ϶��
			return itemStack[top--];
		}
	
		
	}
	public int peek() {
		//peek �޼ҵ�
		if(isEmpty()) {
			//���� ������ �������
			System.out.println("Peek Fail! Stack is Empty!");
			throw new EmptyStackException();
		}
		else {
			//�ƴ϶��
			return itemStack[top];
		}
		
		
	}

}
