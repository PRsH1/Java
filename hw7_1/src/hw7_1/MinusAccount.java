package hw7_1;

public class MinusAccount extends BankAccount {
	private int limit;
	public MinusAccount(int id, int balance,int limit) {
		//���¹�ȣ,�ܾ�,�ѵ��� �Ű������� �޴� ������
		super(id, balance);//�θ� Ŭ�������� �ʱ�ȭ
		this.limit=limit;//�ʱ�ȭ
		// TODO Auto-generated constructor stub
	}
	public MinusAccount(int id,int limit) {
		//���¹�ȣ,�ѵ��� �Ű������� �޴� ������
		super(id);//�θ� Ŭ�������� �ʱ�ȭ
		this.limit=limit;//�ʱ�ȭ
	}
	public int getLimit() {
		//�ѵ� getter
		return limit;//�ѵ� ��ȯ
	}
	@Override
	public void withdraw(int amount) {
		//��� �޼ҵ� �������̵�
		if(getBalance()+limit<amount)
			//�ѵ�+�ܾ��� ��ݾ׺��� �������
			System.out.println("���� " + id +": �ܾ� �������� ��� ����");//���� �޼��� ���
		else
			//�ƴҰ��
			super.withdraw(amount);//�θ� Ŭ�������� ó��
	}




}
