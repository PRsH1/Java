/*
 * 파일명:Main.java,Circle.java,Point.java
 *작성일:2017.05.17
 *이름:이승현
 *내용:has-a 포함 관계의 이해
 */



package hw7_2;


public class Main {
	// Point 클래스와 Circle 클래스를 이용하는 클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_2:이승현");//과제 코드와 이름 출력
		Circle c1 = new Circle(1.5);//원 c1 생성 반지름 1.5
		Circle c2 = new Circle(1.5, new Point(10, 20));//원 c2생성
		Circle c3 = new Circle(3.5, new Point(10, 20));//원 c3생성

		System.out.println(c2.sameCenter(c1));    // false
		System.out.println(c2.sameCenter(c3));    // true
	

		printCircle(c2);//정적 메소드 printCircle 호출
	}

	// (1) 매개변수로 받은 원 c의 반지름, 중심의 x, y좌표를
	//     출력하는 메소드
	private static void printCircle(Circle c) {
		//Circle형  원 c를 매개변수로 받음
		System.out.println(c.getRadius());//반지름 출력	
		System.out.println(c.getCenter().getX());//x좌료 출력
		System.out.println(c.getCenter().getY());//y좌표 출력

	}
}
