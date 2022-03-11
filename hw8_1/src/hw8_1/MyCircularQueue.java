package hw8_1;

import java.util.NoSuchElementException;

public class MyCircularQueue {
	//ť Ŭ����
	private int front;
	private int rear;
	private int arraySize;
	private int [] array;
	private int count;
	public MyCircularQueue(int queueSize){
		//������
		front=0;
		rear=0;
		array=new int[queueSize];
		arraySize=queueSize;
		//�迭�� �ν��Ͻ� ������ �ʱ�ȭ
		
	}
	public boolean isEmpty() {
		
		//isEmpty�޼ҵ�
		return count==0;
	}
	public boolean isFull() {
		//isFull �޼ҵ�
		return count==arraySize;
	}
	public void enQueue(int item) {
		
		//ť�� ���� ����
		if(isFull()) {
			//���� ť�� Full�̸�
			System.out.println("ť�� �������� ���� �Ұ�");
		}
		else {
			//�ƴϸ�
			rear=(rear+1)%arraySize;
			array[rear]=item;
			count+=1;
		}
	}
	public int deQueue() {
		//ť�� ���� deQueue
		if(isEmpty()) {
			//���� ť�� �������
			System.out.println("����! ť�� ������ϴ�!!");
			throw new NoSuchElementException();
		}
		else {
			//�ƴϸ�
			count-=1;
			front=(front+1)%arraySize;
			return array[front];
		}
	}
	public int peek() {
		//��ȸ �޼ҵ�
		if(isEmpty()) {
			//���� ť�� �������
			System.out.println("����! ť�� ������ϴ�!!");
			throw new NoSuchElementException();
		}
		else {
			//�ƴϸ�
			
			return array[(front+1)%arraySize];
			
		}
		
	}
	public int size() {
		//������ ���� �޼ҵ�
		return count;
	}

}
