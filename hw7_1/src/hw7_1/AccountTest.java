/*
 * 파일명:AccountTest.java,BankAccount.java,MinusAccount.java,NormalAccount.java
 *작성일:2017.05.11
 *이름:이승현
 *내용:은행 계좌를 이용한 상속 연습
 */



package hw7_1;

import java.util.Scanner;//입력 위한 함수 import
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);//input지정
		System.out.println("hw7_1:이승현\n");//과제코드 출력
		NormalAccount acc11=new NormalAccount(11,1000);//일반 은행 계좌 객체 생성 초기화
		NormalAccount acc22=new NormalAccount(22);//일반 은행 계좌 객체 생성 초기화
		MinusAccount acc33=new MinusAccount(33,1000,500);//마이너스 통장 계좌 객체 생성
		MinusAccount acc44=new MinusAccount(44,500);//마이너스 통장 계좌 객체 생성
		System.out.println("최대 출금 가능액");//안내문 출력
		System.out.println("acc11 = "+acc11.getBalance());
		System.out.println("acc22 = "+acc22.getBalance());
		System.out.println("acc33 = "+(acc33.getBalance()+acc33.getLimit()));
		System.out.println("acc44 = "+(acc44.getBalance()+acc44.getLimit()));
		//각 계좌의 출금 가능액 확인
		System.out.println();
		System.out.print("출금액 입력:");//입력 안내문 출력
		int withdraw=input.nextInt();//출금액 입력
		acc11.withdraw(withdraw);
		acc22.withdraw(withdraw);
		acc33.withdraw(withdraw);
		acc44.withdraw(withdraw);
		//결과 출력
		System.out.println();
		System.out.print("입금액 입력:");//입력 안내문 출력
		int deposit=input.nextInt();//입금액 입력
		acc11.deposit(deposit);
		acc22.deposit(deposit);
		acc33.deposit(deposit);
		acc44.deposit(deposit);
		//결과 출력
		System.out.println();
		System.out.println("최대 출금 가능액");//안내문 출력
		System.out.println("acc11 = "+acc11.getBalance());
		System.out.println("acc22 = "+acc22.getBalance());
		System.out.println("acc33 = "+(acc33.getBalance()+acc33.getLimit()));
		System.out.println("acc44 = "+(acc44.getBalance()+acc44.getLimit()));
		//각 계좌의 출금 가능액 확인


	}

}
