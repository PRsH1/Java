package lab6_2;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_2:�̽���\n");
		Circle c1=new Circle();
		Circle c2=new Circle(2.5);
		System.out.println("���� ��������"+c1.getRadius()+"�Դϴ�.");
		System.out.println("���� ��������"+c2.getRadius()+"�Դϴ�.");
		System.out.println("���� ������ "+c1.circleArea()+"�Դϴ�");
		System.out.println("���� ������ "+c2.circleArea()+"�Դϴ�");
		c1.setRadius(c2.getRadius());
		System.out.println("���� ��������"+c1.getRadius()+"�Դϴ�.");
		System.out.println("���� ��������"+c2.getRadius()+"�Դϴ�.");
		System.out.println("���� ������ "+c1.circleArea()+"�Դϴ�");
		System.out.println("���� ������ "+c2.circleArea()+"�Դϴ�");
		c2.setRadius(1.5);
		System.out.println("���� ������ "+c1.circleArea()+"�Դϴ�");
		System.out.println("���� ������ "+c2.circleArea()+"�Դϴ�");
		
		

	}

}
