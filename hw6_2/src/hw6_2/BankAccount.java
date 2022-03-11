package hw6_2;

public class BankAccount {
	private int accountnum;//���º�ȣ private�� �ʵ�
	private String username;//����� �̸� �ʵ�
	private int balance;//�ܾ� �ʵ�
	public BankAccount(int accountnum, String username, int balance) {
		//BankAccount ������
		this.accountnum = accountnum;
		this.username = username;
		if (balance<0)//������ �����ϸ�
			this.balance=0;//0���� �ʱ�ȭ
		else//�ƴϸ�
			this.balance = balance;//�ʱ�ȭ
		//�ʱ�ȭ
	}
	public BankAccount(int accountnum, String username) {
		//������ 2
		this(accountnum,username,0);//�ʱ�ȭ

	}
	public int getAccountnum() {
		//�޼ҵ� getAccountnum
		return accountnum;//���¹�ȣ ��ȯ
	}
	public String getUsername() {
		//�޼ҵ� getUsername
		return username;//�����ָ� ��ȯ
	}
	public void setUsername(String username) {
		//�޼ҵ� setUsername
		this.username=username;//�����̸� ����
	}
	public int getBalance() {
		//�޼ҵ� getBalance
		return balance;//�ܾ� ��ȯ
	}
	public void doposit(int money) {
		//�Ա� �޼ҵ�
		balance+=money;//�Ա� �ݾ��� �ܾ׿� ���ϱ�
	}
	public void withdraw(int money) {
		//��� �޼ҵ�
		if (balance<money)
			//���� ��� �ݾ��� �ܾ׺��� ũ�ٸ�
			System.out.println("�ܾ��� �����մϴ�!!");//������ ���
		else
			//�ƴϸ�
			balance-=money;//�ܾ׿��� ����

	}
	@Override
	public String toString() {
		//���ڿ� �޼ҵ�
		return "BankAccount [���¹�ȣ=" + accountnum + ", �����ָ�=" + username + ", �ܾ�=" + balance + "]";
	}
	public void sendMoney(BankAccount otherAccount,int ammount) {
		//�۱� �޼ҵ�
		if (balance<ammount)
			//�۱� �ݾ��� �ܾ׺��� ũ�ٸ�
			System.out.println("�ܾ��� �����մϴ�!!");//������ ���
		else {
			//�ƴ϶��
			balance-=ammount;//�ܾ׿��� �۱ݱݾ� ���
			otherAccount.balance+=ammount;//�ٸ� ���¿� �Ա�
		}


	}

}
