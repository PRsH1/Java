/*
 * ���ϸ�: Point.java
 * �ۼ���: 2018.4.5
 * �ۼ���: �̽���
 * ����:  x ��ǥ�� ���� 1���� ���� ǥ���ϴ� Point Ŭ������ ����
 */
package lab5_4;



public class Point {
	double x;
	// (1) �ʵ�: double�� x ��ǥ

	void move(double a) {
		x+=a;
	}


	// (2) move() �޼ҵ� : double�� �Ű������� �� ����ŭ x ��ǥ�� �̵�
	void move() {
		x+=1;
	}
	// (3) move() �޼ҵ� : �Ű������� ���� �ʰ� x��ǥ�� 1��ŭ �̵� *******
	double distance(Point i) {
		double result;
		result=i.x-x;
		if(result<0)
			return -result;
		else
			return result;


	}
	// (4) distance() �޼ҵ� : Point�� �Ű������� �޾�, �Ű������� ���� ���� ���� ���� �Ÿ��� ���Ͽ� ���� *******




	// toString() �޼ҵ�: Point�� �Ӽ��� ���ڿ��� ����� ���� - @Override, public�� 6, 7�忡�� ���
	@Override
	public String toString() {
		return "Point [x=" + x + "]";
	}
}