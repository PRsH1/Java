package hw7_2another;

public class HourlyMember extends Member{
	//HourlyMember Ŭ����
	private int useTime;//���ð� �ʵ�

	public HourlyMember(int age,int useTime) {
		//������
		super(age);//���̴� �θ� Ŭ�������� �ʱ�ȭ
		this.useTime=useTime;//���ð� �Ű������� �޾� �ʱ�ȭ
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public int getPayment() {
		//ȸ�� �޼ҵ� �������̵�
		// TODO Auto-generated method stub
		return useTime*100;//ȸ�� �� ��ȯ
	}
	

}
