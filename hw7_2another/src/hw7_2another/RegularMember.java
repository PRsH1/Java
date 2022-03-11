package hw7_2another;

public class RegularMember extends Member {
	public RegularMember(int age) {
		//생성자
		super(age);//부모 클래스에서 초기화
	}

	@Override
	public int getPayment() {
		//getPayment 오버라이드 메소드
		// TODO Auto-generated method stub
		return 1000;//1000원 반환
	}

}
