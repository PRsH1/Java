/*파일명:BankAccount.java,BankAccountTest.java
 * 작성일:2018.04.04
 * 이름:이승현
 * 내용:메소드 객체를 이용한 은행 잔고 관리
 */


package lab5_3;

public class BankAccountTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub\
		System.out.println("lab5_3:이승현");//과제코드와 이름 출력
		BankAccount myBank=new BankAccount();//myBank객체 생성
		myBank.deposit(2000);//2000원 입금
		myBank.deposit(3000);//3000원 입금
		System.out.println(myBank.balance);//필드 출력
		System.out.println("현재 잔액은:"+myBank.getBalance()+"원 입니다");//잔액 메소드 getBalance호출하여 출력
		myBank.withdraw(1000);//1000원 출금
		System.out.println("현재 잔액은:"+myBank.getBalance()+"원 입니다");//잔액 메소드 getBalance호출하여 출력



	}


}
