package lab16_2;

class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
		
		sleepTime=(int)(Math.random()*1001);//0~1000������ ������ �ð� ���� ����
	}
	private int sleepTime;
	@Override
	
	public void run(){
		for(int i = 0; i < 5; i++) {
			try {
				
				System.err.println(getName()+" Going to sleep for "+sleepTime+" milliseconds");//�󸶵��� �����ߴ��� ���
				Thread.sleep(sleepTime);//�����Ѵ�
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("\n"+getName() + i + " ");
		}
	}
}
public class ThreadMethodTest {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("�̽��� �����Դϴ�");
		System.out.print("\n������� �����带 �����մϴ�.\n");

		// �� ���� ������ t1, t2�� �����Ͽ� ����
		Thread t1 = new MyThread("A");// ������ �̸��� "A"�� ����
		Thread t2 = new MyThread("b");// ������ �̸��� "b"�� ����
		Thread t3 = new MyThread("Test");//������ �̸��� "Test"�� ����
		System.out.println("�����带 �����մϴ�");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("�����带 �����߽��ϴ�");

		System.out.println("\nȰ������ ������ �� = "+Thread.activeCount());

		for(int i = 0; i < 5; i++) {
			//������ 0~999�� ���� �������� ����
			
			System.out.print(Thread.currentThread().getName() + i + " ");
		}

		//t1,t2,t3 ��� ���� �� �ȳ��������� ���
		t1.join();
		t2.join();
		t3.join();
		System.out.println("\n�ȳ���������.");
		
	}
}
