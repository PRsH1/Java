package hw7_2;

public class Circle {
	private double radius;  // 반지름
	private Point center;   // 중심 점

	// (2) 반지름은 매개변수로 받아 초기화하고, 중심은
	//  x, y좌표가 0, 0인 점으로 초기화하는 생성자
	public Circle(double radius) {
		//반지름 매개변수로 받는 생성자
		this.center=new Point(0,0);//x,y좌표는 0,0으로
		this.radius=radius;



	}

	// (3) 반지름과 중심을 매개변수로 받아 초기화하는 생성자
	public Circle(double radius, Point center) {
		//반지름과 point형 center를 매개변수로 받는 생성자
		this.radius=radius;
		this.center=center;

	}

	public double getRadius() {
		//반지름 getter
		return radius;
	}

	public Point getCenter() {
		//중심 getter
		return center;
	}
	// (4) 현재 원이 매개변수로 받은 원(other)과 중심 점의
	//    x, y 좌표가 모두 동일한지 여부(true/false)를 리턴하는
	//    메소드
	// -이 메소드에는 출력문 없음
	public boolean sameCenter(Circle other) {
		//원의 중심이 같은지 true/false반환
		return center.getX()==other.getCenter().getX() && center.getY()==other.getCenter().getY();



	}



}

