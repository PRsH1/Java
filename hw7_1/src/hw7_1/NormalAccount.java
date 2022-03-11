package hw7_1;

public class NormalAccount extends BankAccount {

	public NormalAccount(int id, int balance) {
		//계좌번호,잔액을 매개변수로 하는 생성자
		super(id, balance);//부모 클래스에서 초기화
		// TODO Auto-generated constructor stub
	}
	public NormalAccount(int id) {
		//계좌번호를 매개변수로 하는 생성자
		super(id);//부모 클래스에서 초기화
	}
	@Override
	public void withdraw(int amount) {
		//출금 메소드 오버라이딩
		if (getBalance()<amount) {
			//만약 잔액이 출금액보다 작을경우
			System.out.println("계좌 " + id +": 잔액 부족으로 출금 실패");//오류 메세지 출력
		}
		else
			//아닐 경우
			super.withdraw(amount);//부모 클래스에서 처리

	}

}
