package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue {
	//MyLinkedQueue Ŭ����
	Node front;
	Node rear;
	//���۰� ���� ����Ű�� Node �� �ν��Ͻ� ���� frotn,rear
	int count;//ũ��
	private class Node{
		//��� Ŭ����
	
		Node link;
		int data;
		Node(int data) {
			//������
			this.link=null;
			this.data=data;
		}

	}
	public MyLinkedQueue() {
		//������
		this.front=null;
		this.rear=null;
		this.count=0;
	}
	
	public boolean isEmpty() {
		//����� �� �޼ҵ�
		return (front==null);
	}
	public void enQueue(int data) {
		//���� �޼ҵ�
		Node t=new Node(data);
		count+=1;
		if(isEmpty()) {
			//ť�� �������
			front=t;
			rear=t;
		}
		else {
			//�ƴϸ�
			rear.link=t;
			rear=t;
		}
	}
	public int deQueue() {
		//���� �޼ҵ�
		if(isEmpty()) {
			//ť�� �������
			System.out.println("����! ť�� ����� ���Ұ� �����ϴ�!");
			throw new NoSuchElementException();
		}
		else {
			//�ƴϸ�
			int data=front.data;
			front=front.link;
			count-=1;
			if(front==null) {
				rear=null;
			}
			return data;
		}
	}
	public int peek() {
		//��ȸ �޼ҵ�
		if(isEmpty()) {
			//ť�� �������
			System.out.println("����! ť�� ����� ���Ұ� �����ϴ�!");
			throw new NoSuchElementException();
		}
		else {
			//�ƴϸ�
			int data=front.data;
			return data;
		}
	}
	public int size() {
		//ũ�� ��ȸ �޼ҵ�
		return count;
	}
}
