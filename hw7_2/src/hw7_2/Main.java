/*
 * ���ϸ�:Main.java,Circle.java,Point.java
 *�ۼ���:2017.05.17
 *�̸�:�̽���
 *����:has-a ���� ������ ����
 */



package hw7_2;


public class Main {
	// Point Ŭ������ Circle Ŭ������ �̿��ϴ� Ŭ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_2:�̽���");//���� �ڵ�� �̸� ���
		Circle c1 = new Circle(1.5);//�� c1 ���� ������ 1.5
		Circle c2 = new Circle(1.5, new Point(10, 20));//�� c2����
		Circle c3 = new Circle(3.5, new Point(10, 20));//�� c3����

		System.out.println(c2.sameCenter(c1));    // false
		System.out.println(c2.sameCenter(c3));    // true
	

		printCircle(c2);//���� �޼ҵ� printCircle ȣ��
	}

	// (1) �Ű������� ���� �� c�� ������, �߽��� x, y��ǥ��
	//     ����ϴ� �޼ҵ�
	private static void printCircle(Circle c) {
		//Circle��  �� c�� �Ű������� ����
		System.out.println(c.getRadius());//������ ���	
		System.out.println(c.getCenter().getX());//x�·� ���
		System.out.println(c.getCenter().getY());//y��ǥ ���

	}
}
