package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue {
	//MyLinkedQueue 클래스
	Node front;
	Node rear;
	//시작과 끝을 가리키는 Node 형 인스턴스 변수 frotn,rear
	int count;//크기
	private class Node{
		//노드 클래스
	
		Node link;
		int data;
		Node(int data) {
			//생성자
			this.link=null;
			this.data=data;
		}

	}
	public MyLinkedQueue() {
		//생성자
		this.front=null;
		this.rear=null;
		this.count=0;
	}
	
	public boolean isEmpty() {
		//비었을 시 메소드
		return (front==null);
	}
	public void enQueue(int data) {
		//삽입 메소드
		Node t=new Node(data);
		count+=1;
		if(isEmpty()) {
			//큐가 비었으면
			front=t;
			rear=t;
		}
		else {
			//아니면
			rear.link=t;
			rear=t;
		}
	}
	public int deQueue() {
		//삭제 메소드
		if(isEmpty()) {
			//큐가 비었으면
			System.out.println("에러! 큐에 저장된 원소가 없습니다!");
			throw new NoSuchElementException();
		}
		else {
			//아니면
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
		//조회 메소드
		if(isEmpty()) {
			//큐가 비었으면
			System.out.println("에러! 큐에 저장된 원소가 없습니다!");
			throw new NoSuchElementException();
		}
		else {
			//아니면
			int data=front.data;
			return data;
		}
	}
	public int size() {
		//크기 조회 메소드
		return count;
	}
}
