package hw7_1;

public class MinusAccount extends BankAccount {
	private int limit;
	public MinusAccount(int id, int balance,int limit) {
		//계좌번호,잔액,한도를 매개변수로 받는 생성자
		super(id, balance);//부모 클래스에서 초기화
		this.limit=limit;//초기화
		// TODO Auto-generated constructor stub
	}
	public MinusAccount(int id,int limit) {
		//계좌번호,한도를 매개변수로 받는 생성자
		super(id);//부모 클래스에서 초기화
		this.limit=limit;//초기화
	}
	public int getLimit() {
		//한도 getter
		return limit;//한도 반환
	}
	@Override
	public void withdraw(int amount) {
		//출금 메소드 오버라이딩
		if(getBalance()+limit<amount)
			//한도+잔액이 출금액보다 작을경우
			System.out.println("계좌 " + id +": 잔액 부족으로 출금 실패");//오류 메세지 출력
		else
			//아닐경우
			super.withdraw(amount);//부모 클래스에서 처리
	}




}
