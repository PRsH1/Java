/*
 * 파일명: Point.java
 * 작성일: 2018.4.5
 * 작성자: 이승현
 * 내용:  x 좌표를 갖는 1차원 점을 표현하는 Point 클래스를 정의
 */
package lab5_4;



public class Point {
	double x;
	// (1) 필드: double형 x 좌표

	void move(double a) {
		x+=a;
	}


	// (2) move() 메소드 : double형 매개변수를 그 값만큼 x 좌표를 이동
	void move() {
		x+=1;
	}
	// (3) move() 메소드 : 매개변수를 받지 않고 x좌표를 1만큼 이동 *******
	double distance(Point i) {
		double result;
		result=i.x-x;
		if(result<0)
			return -result;
		else
			return result;


	}
	// (4) distance() 메소드 : Point형 매개변수를 받아, 매개변수로 받은 점과 현재 점의 거리를 구하여 리턴 *******




	// toString() 메소드: Point의 속성을 문자열로 만들어 리턴 - @Override, public은 6, 7장에서 배움
	@Override
	public String toString() {
		return "Point [x=" + x + "]";
	}
}