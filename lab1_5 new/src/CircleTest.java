
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1=new Circle();//Circle��ü 1 ����
		circle1.setRadius(2);//set�޼ҵ� ȣ��
		Circle circle2=new Circle((int) (Math.random()*4+1));
		//Circle��ü 2 ����,������ �������� �ʱ�ȭ
		System.out.println("lab1_5:�̽���");//�����ڵ� �̸� ���
		System.out.println(circle1.toString());//toString�޼ҵ� ȣ��
		System.out.println(circle2.toString());//toString�޼ҵ� ȣ��
		System.out.println(circle1.equals(circle2));//equals�޼ҵ� ȣ��
		System.out.println(circle1.hashCode());//�콬 �޼ҵ� ȣ��
		System.out.println(circle2.hashCode());//�ؽ��ڵ� �޼ҵ� ȣ��
		System.out.println(circle1.area());//���� �޼ҵ� ȣ��
		System.out.println(circle2.area());//���� �޼ҵ� ȣ��

	}

}
