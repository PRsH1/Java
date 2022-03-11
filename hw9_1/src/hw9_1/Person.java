package hw9_1;

public class Person implements Speakable {
	//Speakable을 인터페이스로 가진 Person클래스
	private String name;//이름 필드

	public String getName() {
		//이름 반환 메소드
		return name;

	}
	public void setName(String name) {
		//이름 지정 메소드
		this.name=name;
	}
	@Override
	public void speak() {
		//speak 메소드 오버라이딩
		//인삿말과 이름 출력
		System.out.println("안녕하세요");
	
	}

}
