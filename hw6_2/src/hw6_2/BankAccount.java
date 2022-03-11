package hw6_2;

public class BankAccount {
	private int accountnum;//계좌변호 private형 필드
	private String username;//사용자 이름 필드
	private int balance;//잔액 필드
	public BankAccount(int accountnum, String username, int balance) {
		//BankAccount 생성자
		this.accountnum = accountnum;
		this.username = username;
		if (balance<0)//조건을 만족하면
			this.balance=0;//0으로 초기화
		else//아니면
			this.balance = balance;//초기화
		//초기화
	}
	public BankAccount(int accountnum, String username) {
		//생성자 2
		this(accountnum,username,0);//초기화

	}
	public int getAccountnum() {
		//메소드 getAccountnum
		return accountnum;//계좌번호 반환
	}
	public String getUsername() {
		//메소드 getUsername
		return username;//예금주명 반환
	}
	public void setUsername(String username) {
		//메소드 setUsername
		this.username=username;//유저이름 설정
	}
	public int getBalance() {
		//메소드 getBalance
		return balance;//잔액 반환
	}
	public void doposit(int money) {
		//입금 메소드
		balance+=money;//입금 금액을 잔액에 더하기
	}
	public void withdraw(int money) {
		//출금 메소드
		if (balance<money)
			//만약 출금 금액이 잔액보다 크다면
			System.out.println("잔액이 부족합니다!!");//오류문 출력
		else
			//아니면
			balance-=money;//잔액에서 차감

	}
	@Override
	public String toString() {
		//문자열 메소드
		return "BankAccount [계좌번호=" + accountnum + ", 예금주명=" + username + ", 잔액=" + balance + "]";
	}
	public void sendMoney(BankAccount otherAccount,int ammount) {
		//송금 메소드
		if (balance<ammount)
			//송금 금액이 잔액보다 크다면
			System.out.println("잔액이 부족합니다!!");//오류문 출력
		else {
			//아니라면
			balance-=ammount;//잔액에서 송금금액 출금
			otherAccount.balance+=ammount;//다른 계좌에 입금
		}


	}

}
