/*
 * ���ϸ�:AccountTest.java,BankAccount.java,MinusAccount.java,NormalAccount.java
 *�ۼ���:2017.05.11
 *�̸�:�̽���
 *����:���� ���¸� �̿��� ��� ����
 */



package hw7_1;

import java.util.Scanner;//�Է� ���� �Լ� import
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);//input����
		System.out.println("hw7_1:�̽���\n");//�����ڵ� ���
		NormalAccount acc11=new NormalAccount(11,1000);//�Ϲ� ���� ���� ��ü ���� �ʱ�ȭ
		NormalAccount acc22=new NormalAccount(22);//�Ϲ� ���� ���� ��ü ���� �ʱ�ȭ
		MinusAccount acc33=new MinusAccount(33,1000,500);//���̳ʽ� ���� ���� ��ü ����
		MinusAccount acc44=new MinusAccount(44,500);//���̳ʽ� ���� ���� ��ü ����
		System.out.println("�ִ� ��� ���ɾ�");//�ȳ��� ���
		System.out.println("acc11 = "+acc11.getBalance());
		System.out.println("acc22 = "+acc22.getBalance());
		System.out.println("acc33 = "+(acc33.getBalance()+acc33.getLimit()));
		System.out.println("acc44 = "+(acc44.getBalance()+acc44.getLimit()));
		//�� ������ ��� ���ɾ� Ȯ��
		System.out.println();
		System.out.print("��ݾ� �Է�:");//�Է� �ȳ��� ���
		int withdraw=input.nextInt();//��ݾ� �Է�
		acc11.withdraw(withdraw);
		acc22.withdraw(withdraw);
		acc33.withdraw(withdraw);
		acc44.withdraw(withdraw);
		//��� ���
		System.out.println();
		System.out.print("�Աݾ� �Է�:");//�Է� �ȳ��� ���
		int deposit=input.nextInt();//�Աݾ� �Է�
		acc11.deposit(deposit);
		acc22.deposit(deposit);
		acc33.deposit(deposit);
		acc44.deposit(deposit);
		//��� ���
		System.out.println();
		System.out.println("�ִ� ��� ���ɾ�");//�ȳ��� ���
		System.out.println("acc11 = "+acc11.getBalance());
		System.out.println("acc22 = "+acc22.getBalance());
		System.out.println("acc33 = "+(acc33.getBalance()+acc33.getLimit()));
		System.out.println("acc44 = "+(acc44.getBalance()+acc44.getLimit()));
		//�� ������ ��� ���ɾ� Ȯ��


	}

}
