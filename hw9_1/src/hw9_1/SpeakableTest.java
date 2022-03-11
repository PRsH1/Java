/*
 * 파일명:Dog.java,Person.java,Speakable.java,SpeakableTest.java
 *작성일:2017.05.18
 *이름:이승현
 *내용:인터페이스 연습
 */

package hw9_1;

public class SpeakableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw9_1:이승현");//과제 코드,이름 출력
		Speakable[] speak=new Speakable[4];//Speakable형 배열 선언
		//Person형과 Dog형 객체 선언,이름과 나이 지정
		Person p1=new Person();
		p1.setName("강감찬");
		Person p2=new Person();
		p2.setName("이순신");
		Dog d1=new Dog();
		d1.setAge(5);
		Dog d2=new Dog();
		d2.setAge(8);
		//배열에 객체를 저장
		speak[0]=p1;
		speak[1]=p2;
		speak[2]=d1;
		speak[3]=d2;
		for(int i=0; i<4; i++) {
			//반복문
			speak[i].speak();//speak호출
			if(speak[i] instanceof Person){
				System.out.println(((Person) speak[i]).getName()+"입니다");
				System.out.println();
			}
			
				

		}

	}

}
