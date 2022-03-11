package hw7_1;

//은행 계좌 클래스
public class BankAccount {
	protected int id; // 계좌번호
	private int balance; // 잔액

	public BankAccount(int id, int balance) {
		//계좌번호,잔액을 매개변수로 받는 생성자
		this.id = id;
		this.balance = balance;
	}
	public BankAccount(int id) {
		//계좌번호를 매개변수로 받는 생성자
		this(id, 0);
	}
	public int getBalance() { // 잔액조회
		return balance;
	}
	public void deposit(int amount) { // 입금
		System.out.println("계좌 " + id + ": " + amount + "원 입금");
		balance += amount;
	}
	public void withdraw(int amount) { // 출금
		System.out.println("계좌 " + id + ": " + amount + "원 출금");
		balance -= amount;
	}
}