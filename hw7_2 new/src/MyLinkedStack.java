import java.util.EmptyStackException;

public class MyLinkedStack {
	private class Node{
		//Node class
		Node(int data) {
			//Node Ŭ������ ������
			// TODO Auto-generated constructor stub
			this.data=data;
		}
		Node link;
		int data;
	}
	private Node top=null;//top�� null��
	public boolean isEmpty() {
		//����� �� �޼ҵ�
		return (top==null);
	}
	public void push(int number) {
		//push�޼ҵ�
		Node t=new Node(number);
	    t.link=top;
	    top=t;
		
	}
	public int pop() {
		//pop�޼ҵ�
		if(isEmpty()) {
			//���� ����� ��
			System.out.println("Pop Fail! Stack is Empty");//���� �ȳ��� ���
			throw new EmptyStackException();
		}
		else {
			int temp=top.data;
			top=top.link;
			return temp;
		}
		
	}
	public int peek() {
		//peek�޼ҵ�
		if(isEmpty()) {
			//���� ������ ����� ��
			System.out.println("Peek Fail! Stack is Empty!");//���� �ȳ��� ���
			throw new EmptyStackException();
		}
		else {
			return top.data;
		}
		
	}
	
	

}
