import java.util.NoSuchElementException;

public class MyArrayQueue {
	// (1) private �ν��Ͻ� ���� ����: �迭(array), �迭 ũ��(arraySize), front, rear
	private int []array;
	private int arraySize;
	private int front;
	private int rear;

	// (2) ������ : ũ�Ⱑ 5�� �迭�� ť�� �����ϵ��� �ν��Ͻ� �������� �ʱ�ȭ
	public MyArrayQueue() {
		array=new int[5];
		front=0;
		rear=0;
		arraySize=array.length;

	}

	// ť�� ����ִ����� �˻�
	public boolean isEmpty() {
		return rear == front;
	}

	// ť�� ����á������ �˻�
	public boolean isFull() {
		return (rear + 1) % arraySize == front;
	}

	// (3) ť�� data�� ����
	public void enQueue(int data) {
		if(isFull())
			System.out.println("ť�� �������� ���� ����: " + data);
		else {
			
			rear=(rear+1)%arraySize;
			array[rear]=data;



		}
	}

	// (4) ť���� ���Ҹ� �ϳ� �����Ͽ� ����
	public int deQueue() {
		if(isEmpty())
			throw new NoSuchElementException();
		else {
			front=(front+1)%arraySize;
			return array[front];
		}





	}
}