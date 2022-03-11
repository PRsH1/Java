package test;
import mic.MicSystem;


public class SingerTest {

	public static void main(String[] args) {
		System.out.println("lab9_1:이승현\n");

		// 마이크 시스템 객체를 생성
		MicSystem mic = new MicSystem();

		// Person 객체를 생성하여 마이크 테스트 매개변수로 전달
		mic.micTest(new Person());
		


	}
}
