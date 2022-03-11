package mid1_1;

public class PiggyBank {
	// (1) 2개의 private 필드 :
	//    500원 개수(정수형)와 100원 개수(정수형)
	private int one;
	private int five;




	// (2) 500원 개수, 100원 개수를 매개변수로 받아
	//    초기화 하는 생성자
	public PiggyBank(int five,int one){
		this.one=one;
		this.five=five;

	}




	// (3) add() - 500원 개수, 100원 개수를 매개변수로 받아
	//     저금하는 메소드
	public void add(int five,int one) {
		this.one=this.one+one;
		this.five+=five;
	}




	// (4) open() -돼지저금통을 열어 저금액을 리턴하는 메소드
	//     저금통을 열고 나면 동전 개수는 모두 0이 된다.
	public int open() {
		int sum=0;
		sum=five*500+one*100;
		five=0;
		one=0;
		return sum;


	}


}
