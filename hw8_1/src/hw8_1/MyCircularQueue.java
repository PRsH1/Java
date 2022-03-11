package hw8_1;

import java.util.NoSuchElementException;

public class MyCircularQueue {
	//큐 클래스
	private int front;
	private int rear;
	private int arraySize;
	private int [] array;
	private int count;
	public MyCircularQueue(int queueSize){
		//생성자
		front=0;
		rear=0;
		array=new int[queueSize];
		arraySize=queueSize;
		//배열과 인스턴스 변수들 초기화
		
	}
	public boolean isEmpty() {
		
		//isEmpty메소드
		return count==0;
	}
	public boolean isFull() {
		//isFull 메소드
		return count==arraySize;
	}
	public void enQueue(int item) {
		
		//큐에 원소 삽입
		if(isFull()) {
			//만약 큐가 Full이면
			System.out.println("큐가 가득차서 삽입 불가");
		}
		else {
			//아니면
			rear=(rear+1)%arraySize;
			array[rear]=item;
			count+=1;
		}
	}
	public int deQueue() {
		//큐에 원소 deQueue
		if(isEmpty()) {
			//만약 큐가 비었으면
			System.out.println("에러! 큐가 비었습니다!!");
			throw new NoSuchElementException();
		}
		else {
			//아니면
			count-=1;
			front=(front+1)%arraySize;
			return array[front];
		}
	}
	public int peek() {
		//조회 메소드
		if(isEmpty()) {
			//만약 큐가 비었으면
			System.out.println("에러! 큐가 비었습니다!!");
			throw new NoSuchElementException();
		}
		else {
			//아니면
			
			return array[(front+1)%arraySize];
			
		}
		
	}
	public int size() {
		//사이즈 리턴 메소드
		return count;
	}

}
