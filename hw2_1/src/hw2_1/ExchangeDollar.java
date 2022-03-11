/*
 * 파일명:ExchangeDollar.java
 * 작성일:2018.03.16
 * 이름:이승현
 * 내용:Scanner클래스를 이용해 숫자 입력받고 달러 환전하기
 */

package hw2_1;

import java.util.Scanner;
public class ExchangeDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;//입력받은 숫자 더할 변수 선언
		int fivehundred=0;//500원 갯수를 입력받을 변수
		int onehundred=0;//100원 갯수를 입력받을 변수
		int fifth=0;//50원 갯수를 입력받을 변수
		int ten=0;//10원 갯수를 입력받을 변수
		int dollar=0;//달러 갯수 표시할 변수
		int won=0;//달러 계산 후 남은 한화 표시할 변수
		int EXCHANGE=1060;//1달러당 환율 1060원 적용할 상수 선언
		
		System.out.println("hw2_1: 이승현\n");//자신의 이름 출력
		ExcangeDollar input = new ExcangeDollar(System.in);//Scanner형 변수 input에 키보드 입력을 위한 Scanner 객체 생성하여 지정
		
		System.out.print("500원 갯수 입력:");//안내문 출력
		fivehundred=input.nextInt();//숫자 입력
		
		System.out.print("100원 갯수 입력:");//안내문 출력
		onehundred=input.nextInt();//숫자 입력
		
		System.out.print("50원 갯수 입력:");//안내문 출력
		fifth=input.nextInt();//숫자 입력
		
		System.out.print("10원 갯수 입력:");//안내문 출력
		ten=input.nextInt();//숫자 입력
		System.out.print("\n");//구분을 위한 개행 삽입
		
		sum=(fivehundred*500)+(onehundred*100)+(fifth*50)+(ten*10);//입력받은 숫자들을 더한다
		dollar=sum/EXCHANGE;//달러를 계산한다
		won=sum-dollar*EXCHANGE;//남은 한화를 계산한다
		
		System.out.println("저금 총액:"+sum);//결과값 출력
		System.out.println("달러 액수:"+dollar);//결과값 출력
		System.out.println("남은 한화:"+won);//결과값 출력
		

	}

}
