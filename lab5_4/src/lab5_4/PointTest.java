package lab5_4;

/*
 * 파일명: PointTest.java
 * 작성일: 2018.4.5
 * 작성자: 이승현
 * 내용:  점을 표현하는 Point 클래스 객체를 생성하고 이용하는 프로그램
 */

public class PointTest {
	public static void main(String[] args) {
		System.out.println("lab5_4: 이승현");

		Point p1=new Point();
		Point p2=new Point();
		// (5) Point 객체 p1, p2를 생성





		p1.move(4.5);
		p2.move(-1.0);
		p1.move(1.0);
		// (6) p1은 4.5  만큼 이동, p2는 -1.0만큼 이동, p1을 1.0만큼 다시 한 번 이동
		p1.move();

		// (7) p1만 이동(매개변수 없이) ********



		System.out.println("거리:"+p1.distance(p2));
		// (8) p1과 p2의 거리를 출력 *******
		// p1, p2의 속성을 출력
		System.out.println(p1.toString()); // p1.toString() 대신 p1 라고 적어도 됨
		System.out.println(p2.toString()); // p2.toString() 대신 p2 라고 적어도 됨
	}
}