package hw7_2another;

public class RegularMember extends Member {
	public RegularMember(int age) {
		//������
		super(age);//�θ� Ŭ�������� �ʱ�ȭ
	}

	@Override
	public int getPayment() {
		//getPayment �������̵� �޼ҵ�
		// TODO Auto-generated method stub
		return 1000;//1000�� ��ȯ
	}

}
