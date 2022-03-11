package lab16_2;

class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
		
		sleepTime=(int)(Math.random()*1001);//0~1000사이의 임의의 시간 동안 슬립
	}
	private int sleepTime;
	@Override
	
	public void run(){
		for(int i = 0; i < 5; i++) {
			try {
				
				System.err.println(getName()+" Going to sleep for "+sleepTime+" milliseconds");//얼마동안 슬립했는지 출력
				Thread.sleep(sleepTime);//슬립한다
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
		System.out.println("이승현 과제입니다");
		System.out.print("\n어서오세요 쓰레드를 시작합니다.\n");

		// 두 개의 스레드 t1, t2를 생성하여 시작
		Thread t1 = new MyThread("A");// 스레드 이름을 "A"로 지정
		Thread t2 = new MyThread("b");// 스레드 이름을 "b"로 지정
		Thread t3 = new MyThread("Test");//스레드 이름을 "Test"로 지정
		System.out.println("쓰레드를 시작합니다");
		t1.start();
		t2.start();
		t3.start();
		System.out.println("쓰레드를 시작했습니다");

		System.out.println("\n활동중인 스레드 수 = "+Thread.activeCount());

		for(int i = 0; i < 5; i++) {
			//쓰레드 0~999초 동안 랜덤으로 슬립
			
			System.out.print(Thread.currentThread().getName() + i + " ");
		}

		//t1,t2,t3 모두 종료 후 안녕히가세요 출력
		t1.join();
		t2.join();
		t3.join();
		System.out.println("\n안녕히가세요.");
		
	}
}
