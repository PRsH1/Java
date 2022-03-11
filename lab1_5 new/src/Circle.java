
public class Circle {
	private int radius;//반지름 필드
	public Circle(){
		//반지름 1로 초기화하는 생성자
		this.radius=1;
	}
	public Circle(int radius) {
		//매개변수를 받아 초기화하는 생성자
		this.radius=radius;
	}
	public int getRadius() {
		//반지름 getter
		return radius;
	}
	public void setRadius(int radius) {
		//반지름 setter
		this.radius = radius;
	}
	public double area() {
		//면적 계산하는 메소드
		return radius*radius*3.14;//Math.PI로 할 시 3.14159....로 계산됨
	}
	@Override
	public int hashCode() {
		//헤쉬코드 메소드
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		//equals메소드 오버라이드
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
		
	}
	@Override
	public String toString() {
		//radius정보 toString 리턴
		return "Circle [radius=" + radius + "]";
	}
	
	

}
