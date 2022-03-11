package hw7_2another;

public class HourlyMember extends Member{
	//HourlyMember 클래스
	private int useTime;//사용시간 필드

	public HourlyMember(int age,int useTime) {
		//생성자
		super(age);//나이는 부모 클래스에서 초기화
		this.useTime=useTime;//사용시간 매개변수로 받아 초기화
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public int getPayment() {
		//회비 메소드 오버라이드
		// TODO Auto-generated method stub
		return useTime*100;//회비 값 반환
	}
	

}
