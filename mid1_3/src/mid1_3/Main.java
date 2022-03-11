package mid1_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (1) 송금수수료 출력: 500이라는 리터럴을 적으면 안됨
	      System.out.println(Account.FEE);


	      // (2) 생성된 계좌수 출력: 0이라는 리터럴을 적으면 안됨
	      System.out.println(Account.getNumber());


	      // 잔액이 5000, 2000인 계좌 객체 a1, a2 생성
	      Account a1 = new Account(5000);
	      Account a2 = new Account(2000);

	      // a1에서 a2로 5000원 송금 시도 --> 실패
	      boolean result = a1.transfer(a2, 5000);
	      System.out.println(result);    // false

	      // a1에서 a2로 4500원 송금
	      result = a1.transfer(a2, 4500);
	      System.out.println(result);    // true

	      // a1과 a2의 계좌 정보 출력
	      System.out.println(a1);
	      System.out.println(a2);

	}

}
