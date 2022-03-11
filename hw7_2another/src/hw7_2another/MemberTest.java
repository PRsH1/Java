/*
 * 파일명:HourlyMember.java,Member.java,MemberTest.java,RegularMember.java
 *작성일:2017.05.19
 *이름:이승현
 *내용:추상 클래스와 다형성 연습
 */


package hw7_2another;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_2:이승현");//과제 코드와 이름 출력
		double ageAverage = 0;//나이 평균을 저장할 변수 0으로 초기화
		int ageSum=0;//나이 합을 저장할 변수 0으로 초기화
		int paySum=0;//회비 합을 저장할 변수 0으로 초기화
		Member[] member=new Member[4];//Member 배열 크기 4
		//Member형 배열에 객체 저장
		member[0]=new HourlyMember(22,2);
		member[1]=new HourlyMember(33,3);
		member[2]=new RegularMember(44);
		member[3]=new RegularMember(55);
		for(int i=0; i<member.length; i++) {
			//반복문
			ageSum=ageSum+member[i].getAge();//배열에 저장된 객체의 나이 값을 ageSum에 저장
			paySum+=member[i].getPayment();//배열에 저장된 객체의 회비 합을 paySum에 저장
			ageAverage=(double)ageSum/member.length;//ageAverage에 평균 저장
			
			
		}
		System.out.println("나이평균="+ageAverage);//나이 평균 출력
		System.out.println("회비 합="+paySum);//회비 합 출력

}
}