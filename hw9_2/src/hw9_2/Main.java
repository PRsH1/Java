/*
 * 파일명:Main.java
 *작성일:2017.05.26
 *이름:이승현
 *내용:무명 클래스 연습
 */



package hw9_2;

class Student {
	//학생 클래스
	//나이와 점수 필드
	int age;
	int score;
}

@FunctionalInterface
interface Tester {
	//Tester인터페이스
	boolean test(Student s);//추상 메소드
}

public class Main {
	//메인 클래스
	public static void check(Student s, Tester t) {
		//check 정적 메소드
		boolean result = t.test(s);
		System.out.println(result);//결과 출력
	}

	public static void main(String... args) {
		System.out.println("hw9_2: 이승현");//과제코드 출력

		Student kim = new Student();//학생 객체 kim생성
		kim.age = 19;
		kim.score = 80;

		Tester passTester=new Tester() {
			//무명 클래스 사용 passTester
			@Override
			public boolean test(Student s) {
				//test메소드 오버라이딩
				return s.score >= 60;//boolean 값 반환
			}
		};

		Tester AdultTester=new Tester() {
			//무명 클래스 사용 adultTester
			@Override
			public boolean test(Student s) {
				//test메소드 오버라이딩
				return s.age >= 20;//boolean 값 반환
			}   
		};
		Main m1=new Main();//메인 클래스 객체 m1생성
		m1.check(kim, passTester);
		m1.check(kim, AdultTester);
	}
}