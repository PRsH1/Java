package lab5_3;

public class BankAccount {
	int balance;//잔액 필드
	void deposit(int a) {
		//입금 메소드
		balance+=a;//매개변수 a 받아 balance 필드에 더함
		
	}
	int getBalance() {
		//잔액 확인 메소드
		return balance;//balance를 리턴함
	
	}
	void withdraw(int b) {
		//출금 메소드
		balance-=b;//매개변수 b balance 필드 차감
		
		
	}

}
