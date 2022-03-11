
public class Circle {
	private int radius;//������ �ʵ�
	public Circle(){
		//������ 1�� �ʱ�ȭ�ϴ� ������
		this.radius=1;
	}
	public Circle(int radius) {
		//�Ű������� �޾� �ʱ�ȭ�ϴ� ������
		this.radius=radius;
	}
	public int getRadius() {
		//������ getter
		return radius;
	}
	public void setRadius(int radius) {
		//������ setter
		this.radius = radius;
	}
	public double area() {
		//���� ����ϴ� �޼ҵ�
		return radius*radius*3.14;//Math.PI�� �� �� 3.14159....�� ����
	}
	@Override
	public int hashCode() {
		//�콬�ڵ� �޼ҵ�
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		//equals�޼ҵ� �������̵�
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
		//radius���� toString ����
		return "Circle [radius=" + radius + "]";
	}
	
	

}
