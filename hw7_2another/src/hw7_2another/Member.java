package hw7_2another;

public abstract class Member {
	//�߻� Ŭ���� Member
	private int age;//���� �ʵ�
	public Member(int age) {
		//������ 
		this.age=age;//�Ű������� ���� �� �ʱ�ȭ
	}
	public int getAge() {
		//age getter
		return age;//���� ��ȯ
	}
	public abstract int getPayment();//�߻� �޼ҵ� getPayment

}
