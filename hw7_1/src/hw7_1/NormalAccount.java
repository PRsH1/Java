package hw7_1;

public class NormalAccount extends BankAccount {

	public NormalAccount(int id, int balance) {
		//���¹�ȣ,�ܾ��� �Ű������� �ϴ� ������
		super(id, balance);//�θ� Ŭ�������� �ʱ�ȭ
		// TODO Auto-generated constructor stub
	}
	public NormalAccount(int id) {
		//���¹�ȣ�� �Ű������� �ϴ� ������
		super(id);//�θ� Ŭ�������� �ʱ�ȭ
	}
	@Override
	public void withdraw(int amount) {
		//��� �޼ҵ� �������̵�
		if (getBalance()<amount) {
			//���� �ܾ��� ��ݾ׺��� �������
			System.out.println("���� " + id +": �ܾ� �������� ��� ����");//���� �޼��� ���
		}
		else
			//�ƴ� ���
			super.withdraw(amount);//�θ� Ŭ�������� ó��

	}

}
