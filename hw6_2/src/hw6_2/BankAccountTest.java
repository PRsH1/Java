/*���ϸ�:BankAccountTest.java,BankAccount.java
 *�ۼ���:2018-04-18
 *�̸�:�̽���
 *����:���� ��ȭ�� �޼ҵ� �̿��ϱ�,������.getter.setter.this�� �̿��� ���� ���� ���� ���α׷����ϱ�
 */
package hw6_2;

import java.util.Scanner;


public class BankAccountTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		BankAccount account1=new BankAccount(1, "kim", 9000);//account1 ��ü ���� �ʱ�ȭ
		BankAccount account2=new BankAccount(2,"lee");//account2 ��ü ���� �ʱ�ȭ
		System.out.println("hw6_2:�̽���\n");//���� �ڵ�� �̸� ���
		System.out.print("�Ա��Ͻ� �޾��� �Է��ϼ���:");//�Ա� �ȳ��� ���
		account2.doposit(scan.nextInt());//����ڷκ��� �Աݹ��� �ݾ� �Է�
		System.out.print("����Ͻ� �޾��� �Է��ϼ���:");//��� �ȳ��� ���
		account2.withdraw(scan.nextInt());//����ڷκ��� ����� �ݾ� �Է�
		System.out.print("�Ա��Ͻ� �޾��� �Է��ϼ���:");//1ȸ �� �ݺ��Ѵ�
		account2.doposit(scan.nextInt());
		System.out.print("����Ͻ� �޾��� �Է��ϼ���:");
		account2.withdraw(scan.nextInt());
		System.out.print("�۱��Ͻ� �޾��� �Է��ϼ���:");//�۱� �ȳ��� ���
		account2.sendMoney(account1, scan.nextInt());//�۱��� �ݾ��� �Է��Ѵ�
		System.out.print("�۱��Ͻ� �޾��� �Է��ϼ���:");//1ȸ �ݺ�
		account2.sendMoney(account1, scan.nextInt());
		account2.setUsername("park");//setUsername�޼ҵ� �̿��ؼ� �����ָ� park���� ��ģ��
		System.out.println(account1.toString());//���� ���� ���ڿ� �޼ҵ� �̿��� ���
		System.out.println(account2.toString());//���� ���� ���ڿ� �޼ҵ� �̿��� ���
		
		
		
		

	}

}
