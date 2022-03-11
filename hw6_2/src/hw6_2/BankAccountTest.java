/*파일명:BankAccountTest.java,BankAccount.java
 *작성일:2018-04-18
 *이름:이승현
 *내용:한층 심화된 메소드 이용하기,생성자.getter.setter.this를 이용해 은행 계좌 관련 프로그래밍하기
 */
package hw6_2;

import java.util.Scanner;


public class BankAccountTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		BankAccount account1=new BankAccount(1, "kim", 9000);//account1 객체 생성 초기화
		BankAccount account2=new BankAccount(2,"lee");//account2 객체 생성 초기화
		System.out.println("hw6_2:이승현\n");//과제 코드와 이름 출력
		System.out.print("입금하실 급액을 입력하세요:");//입금 안내문 출력
		account2.doposit(scan.nextInt());//사용자로부터 입금받을 금액 입력
		System.out.print("출금하실 급액을 입력하세요:");//출금 안내문 출력
		account2.withdraw(scan.nextInt());//사용자로부터 출금할 금액 입력
		System.out.print("입금하실 급액을 입력하세요:");//1회 더 반복한다
		account2.doposit(scan.nextInt());
		System.out.print("출금하실 급액을 입력하세요:");
		account2.withdraw(scan.nextInt());
		System.out.print("송금하실 급액을 입력하세요:");//송금 안내문 출력
		account2.sendMoney(account1, scan.nextInt());//송금할 금액을 입력한다
		System.out.print("송금하실 급액을 입력하세요:");//1회 반복
		account2.sendMoney(account1, scan.nextInt());
		account2.setUsername("park");//setUsername메소드 이용해서 예금주명 park으로 고친다
		System.out.println(account1.toString());//현재 상태 문자열 메소드 이용해 출력
		System.out.println(account2.toString());//현재 상태 문자열 메소드 이용해 출력
		
		
		
		

	}

}
