package hw14_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws TooSmallException {
		System.out.println("hw14_1: 이승현");

		// 속도가 50인 자동차 생성하여 자동차 정보 출력
		Car myCar = new Car(50);
		System.out.println(myCar);

		// 가속량을 입력받아 자동차 가속
		Scanner scan = new Scanner(System.in);
		try {
			//try문 시작
			System.out.print("가속량 입력: ");
			int value = scan.nextInt();
			myCar.speedUp(value);
		} catch (SpeedUpException e) {
			//SpeedUpException 발생 시
			// TODO Auto-generated catch block
			System.out.println("최대 속도 초과로 가속 불가능하여 자동차를 멈춥니다.");//안내문 출력
			myCar.stop();//차 멈춤
		
		} catch(InputMismatchException e) {
			//InputMismatchException 발생 시
			System.out.println("가속량 입력 오류로 가속 불가능합니다.");//안내문 출력
		} finally {
			//반드시 출력

			// 자동차 정보 출력
			System.out.println(myCar);   // 어떤 예외가 발생하든 반드시 출력해야 함
		}
	}
}

class Car {
	//Car클래스
	private int speed; // 속도
	public final int MAX_SPEED = 100;   // 최대 속도

	public Car(int speed) {
		//car생성자
		this.speed = speed;
	}

	public void speedUp(int value) throws SpeedUpException, TooSmallException {  // 가속
		if(speed+value>MAX_SPEED)
			//가속량이 MAX_SPEED값을 넘을경우
			throw new SpeedUpException();
		else if(value<=0)
			//가속량이 0 이하면
			throw new TooSmallException(value);

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
	//SpeedUpException 예외 클래스

}
class TooSmallException extends Exception{
	//TooSmallException 예외 클래스
	public TooSmallException(int value){
		//생성자
		super("기준 미달 "+value);
	}

}