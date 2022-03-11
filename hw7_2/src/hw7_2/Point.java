package hw7_2;


public class Point {
	// 점을 표현하는 클래스 Point
	private int x; // x 좌표
	private int y; // y 좌표
	

	public Point(int x, int y) {
		//매개변수 x,y받아 초기화하는 생성자
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		//x getter
		return x;
	}
	public int getY() {
		//y getter
		return y;
	}

}
