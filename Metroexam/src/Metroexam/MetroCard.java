package Metroexam;

public class MetroCard {
	private int balance;
	public MetroCard(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}
	public void ride() {
		if(balance<1000) {
			System.out.println("�ܾ��� �����մϴ�");
			
		}
		else
			balance-=1000;
	}
	public void charge(int balance) {
		this.balance+=balance;
	}

}
