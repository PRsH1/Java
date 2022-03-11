package lab7_3;

public class Circle {
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
		
	}
	
	@Override
	public String toString() {
		return "반지름이 "+radius+" 인 원입니다.";
	}
	@Override
	public boolean equals(Object obj) {
		Circle other=(Circle)obj;
		return radius==other.radius;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
		
	

}
