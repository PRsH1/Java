package lab5_3;

public class BankAccount {
	int balance;//�ܾ� �ʵ�
	void deposit(int a) {
		//�Ա� �޼ҵ�
		balance+=a;//�Ű����� a �޾� balance �ʵ忡 ����
		
	}
	int getBalance() {
		//�ܾ� Ȯ�� �޼ҵ�
		return balance;//balance�� ������
	
	}
	void withdraw(int b) {
		//��� �޼ҵ�
		balance-=b;//�Ű����� b balance �ʵ� ����
		
		
	}

}
