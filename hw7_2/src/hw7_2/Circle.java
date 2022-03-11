package hw7_2;

public class Circle {
	private double radius;  // ������
	private Point center;   // �߽� ��

	// (2) �������� �Ű������� �޾� �ʱ�ȭ�ϰ�, �߽���
	//  x, y��ǥ�� 0, 0�� ������ �ʱ�ȭ�ϴ� ������
	public Circle(double radius) {
		//������ �Ű������� �޴� ������
		this.center=new Point(0,0);//x,y��ǥ�� 0,0����
		this.radius=radius;



	}

	// (3) �������� �߽��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
	public Circle(double radius, Point center) {
		//�������� point�� center�� �Ű������� �޴� ������
		this.radius=radius;
		this.center=center;

	}

	public double getRadius() {
		//������ getter
		return radius;
	}

	public Point getCenter() {
		//�߽� getter
		return center;
	}
	// (4) ���� ���� �Ű������� ���� ��(other)�� �߽� ����
	//    x, y ��ǥ�� ��� �������� ����(true/false)�� �����ϴ�
	//    �޼ҵ�
	// -�� �޼ҵ忡�� ��¹� ����
	public boolean sameCenter(Circle other) {
		//���� �߽��� ������ true/false��ȯ
		return center.getX()==other.getCenter().getX() && center.getY()==other.getCenter().getY();



	}



}

