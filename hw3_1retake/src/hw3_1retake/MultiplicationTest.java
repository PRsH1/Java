/*
* 파일명:MultiplicationTest.java
 *작성일:2017.03.20
 *이름:이승현
 *내용:난수를 이용한 곱셈 문제 연습
 */



package hw3_1retake;
import java.util.Scanner;//입력을 위한 자바 라이브러리 import
import java.util.Random;//난수 생성을 위한 자바 라이브러리 import

public class MultiplicationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();//난수 생성을 위한 generator메소드
		Scanner scan = new Scanner(System.in);//입력을 위한 scan메소드

		int i = 0;//반복을 위한 변수 i 선언
		int correct = 0;//곱셈의 정답을 저장할 변수 correct선언
		int point = 0;//점수를 저장할 변수 point선언
		int correctnum = 0;//정답 갯수를 저장할 변수 선언
		int incorrectnum = 0;//오답 갯수를 저장할 변수 선언
		System.out.println("hw3_1:이승현\n");//과제 코드와 나의 이름 출력
		System.out.println("곱셈 문제의 답을 입력하세요(통과하려면 0을 입력)");//안내물 출력
		while (i < 5) {
			//반복문 while 
			int number = generator.nextInt(9) + 1;//난수 1을 number에 저장 난수는 1~9사이
			int number2 = generator.nextInt(9) + 1;//난수 2을 number2에 저장 난수는 1~9사이
			correct = number * number2;//정답을 correct에 저장
			System.out.print(number + "*" + number2 + "=? ");//문제 출력
			int answer1 = scan.nextInt();//정답 쓰기
			if (correct == answer1) {
				//정답일떄의 조건문
				System.out.print("정답입니다\n");//정답 안내문 출력
				point += 20;//점수 20점 상승
				correctnum += 1;//정답 갯수 1 상승
			} else if (answer1 == 0) {
				//만약 사용자가 정답을 0이라고 대답했으면
				System.out.print("통과\n");//통과 메세지 출력
			} else {
				//틀렸으면
				System.out.print("틀렸습니다\n");//오답 안내문 출력
				point -= 10;//점수 10점 감소
				incorrectnum += 1;//오답 갯수 1 증가
				if (0 > point) {
					//만약 점수가 음수가 되면
					point = 0;//점수 0점으로 회귀
				}

			}
			i++;//반복문 1회 증가
		}
		if (point >= 50) {
			//만약 합격이라면
			System.out.print("정답수" + correctnum + " 오답수" + incorrectnum + " 총점" + point + "-->합격");

		} else {
			//만약 불합격이라면
			System.out.print("정답수" + correctnum + " 오답수" + incorrectnum + " 총점" + point + "-->불합격");

		}
	}
}
