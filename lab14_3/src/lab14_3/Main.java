package lab14_3;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab14_3: 이승현");

		// 속도가 50인 자동차 생성하여 자동차 정보 출력
		Car myCar = new Car(50);
		System.out.println(myCar);
		try {
			// 가속량을 입력받아 자동차 가속
			Scanner scan = new Scanner(System.in);
			System.out.print("가속량 입력: ");
			int value = scan.nextInt();

			myCar.speedUp(value);
		} catch (SpeedUpException e) {
			// TODO Auto-generated catch block
			System.out.println("에러! 최고 속도 초과로 자동차가 멈췄습니다");
			myCar.stop();


		} catch(Exception e) {
			System.out.println("에러! 문자를 입력하셨습니다 정수를 입력하세요");
		}

		// 자동차 정보 출력
		System.out.println(myCar);

	}
}

class Car {
	private int speed; // 속도
	public final int MAX_SPEED = 100;   // 최대 속도

	public Car(int speed) {
		this.speed = speed;
	}

	public void speedUp(int value) throws SpeedUpException { 
		// 가속
		if(speed+value>MAX_SPEED) {
			throw new SpeedUpException();
		}
		speed += value;
	}

	public void speedDown(int value) {  // 감속
		speed -= value;
	}

	public void stop() { // 멈춤
		speed = 0;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", MAX_SPEED=" + MAX_SPEED + "]";
	}
}
class SpeedUpException extends Exception {

}