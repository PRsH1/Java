package hw7_2another;

public abstract class Member {
	//추상 클래스 Member
	private int age;//나이 필드
	public Member(int age) {
		//생성자 
		this.age=age;//매개변수로 받은 값 초기화
	}
	public int getAge() {
		//age getter
		return age;//나이 반환
	}
	public abstract int getPayment();//추상 메소드 getPayment

}
