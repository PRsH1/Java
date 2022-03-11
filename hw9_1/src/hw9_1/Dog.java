package hw9_1;

public class Dog implements Speakable {
	//Speakable을 인터페이스로 가진 Dog클래스
	private int age;//나이 필드
	public Dog() {
		//생성자
		this.age=0;
	}
	public int getAge() {
		//나이 반환 메소드
		return age;
	}
	public void setAge(int age) {
		//나이 지정 메소드
		this.age=age;
	}
	@Override
	public void speak() {
		//speak메소드 오버라이드
		for(int i=0; i<getAge(); i++)
			//반복문을 이용해 나이만큼 짖게한다
			System.out.print("멍");//출력
		System.out.println();
		System.out.println();
	}

}
