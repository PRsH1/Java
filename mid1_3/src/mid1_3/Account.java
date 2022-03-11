package mid1_3;

public class Account {
	private int id;   // 아이디
	private int balance;  // 잔액
	private static int number = 0; // 계좌수
	public static final int FEE = 500;  // 송금수수료

	// (3) 아이디는 계좌생성순으로 1, 2, 3, ... 로 자동 부여하고
	//     잔액은 매개변수로 받은 값으로 초기화하는 생성자
	public Account(int balance) {
		number+=1;
		id=number;
		this.balance=balance;
	}

	// (4) getNumber()-생성된 계좌수를 리턴하는 static 메소드
	public static int getNumber() {
		return number;
	}
	// (5) transfer() - 현재 계좌에서 상대 계좌 other로 amount
	//    만큼을 송금하는 메소드
	// -송금수수료 부과(송금수수료는 위에서 정의한 상수 이용)
	// -잔액 부족시 송금할 수 없으며,
	// -송금 성공 여부(true/false)를 리턴
	// -이 메소드에는 출력문 없음
	public boolean transfer(Account other, int amount) {
		if(balance<amount+FEE) {
			return false;
		}
		else {
			balance=balance-(amount+FEE);
			other.balance+=amount;
			return true;
		}

	}

	@Override
	public String toString() {
		return "id=" + id + ", balance=" + balance;

	}
}