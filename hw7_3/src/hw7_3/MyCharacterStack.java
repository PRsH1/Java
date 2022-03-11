package hw7_3;

import java.util.EmptyStackException;

public class MyCharacterStack {
	private class Node{
		//Node class
		Node(char data) {
			//Node Ŭ������ ������
			// TODO Auto-generated constructor stub
			this.data=data;
		}
		Node link;
		char data;
	}
	private Node top=null;//top�� null��
	public boolean isEmpty() {
		//����� �� �޼ҵ�
		return (top==null);
	}
	public void push(char arr) {
		//push�޼ҵ�
		Node t=new Node(arr);
	    t.link=top;
	    top=t;
		
	}
	public char pop() {
		//pop�޼ҵ�
		if(isEmpty()) {
			//���� ����� ��
			System.out.println("Pop Fail! Stack is Empty");//���� �ȳ��� ���
			throw new EmptyStackException();
		}
		else {
			char temp=top.data;
			top=top.link;
			return temp;
		}
		
	}
	public char peek() {
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
