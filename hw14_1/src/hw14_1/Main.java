package hw14_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws TooSmallException {
		System.out.println("hw14_1: �̽���");

		// �ӵ��� 50�� �ڵ��� �����Ͽ� �ڵ��� ���� ���
		Car myCar = new Car(50);
		System.out.println(myCar);

		// ���ӷ��� �Է¹޾� �ڵ��� ����
		Scanner scan = new Scanner(System.in);
		try {
			//try�� ����
			System.out.print("���ӷ� �Է�: ");
			int value = scan.nextInt();
			myCar.speedUp(value);
		} catch (SpeedUpException e) {
			//SpeedUpException �߻� ��
			// TODO Auto-generated catch block
			System.out.println("�ִ� �ӵ� �ʰ��� ���� �Ұ����Ͽ� �ڵ����� ����ϴ�.");//�ȳ��� ���
			myCar.stop();//�� ����
		
		} catch(InputMismatchException e) {
			//InputMismatchException �߻� ��
			System.out.println("���ӷ� �Է� ������ ���� �Ұ����մϴ�.");//�ȳ��� ���
		} finally {
			//�ݵ�� ���

			// �ڵ��� ���� ���
			System.out.println(myCar);   // � ���ܰ� �߻��ϵ� �ݵ�� ����ؾ� ��
		}
	}
}

class Car {
	//CarŬ����
	private int speed; // �ӵ�
	public final int MAX_SPEED = 100;   // �ִ� �ӵ�

	public Car(int speed) {
		//car������
		this.speed = speed;
	}

	public void speedUp(int value) throws SpeedUpException, TooSmallException {  // ����
		if(speed+value>MAX_SPEED)
			//���ӷ��� MAX_SPEED���� �������
			throw new SpeedUpException();
		else if(value<=0)
			//���ӷ��� 0 ���ϸ�
			throw new TooSmallException(value);

		speed += value;
	}

	public void speedDown(int value) {  // ����
		speed -= value;
	}

	public void stop() { // ����
		speed = 0;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", MAX_SPEED=" + MAX_SPEED + "]";
	}
}
class SpeedUpException extends Exception {
	//SpeedUpException ���� Ŭ����

}
class TooSmallException extends Exception{
	//TooSmallException ���� Ŭ����
	public TooSmallException(int value){
		//������
		super("���� �̴� "+value);
	}

}