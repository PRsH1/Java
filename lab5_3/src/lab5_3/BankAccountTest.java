/*���ϸ�:BankAccount.java,BankAccountTest.java
 * �ۼ���:2018.04.04
 * �̸�:�̽���
 * ����:�޼ҵ� ��ü�� �̿��� ���� �ܰ� ����
 */


package lab5_3;

public class BankAccountTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub\
		System.out.println("lab5_3:�̽���");//�����ڵ�� �̸� ���
		BankAccount myBank=new BankAccount();//myBank��ü ����
		myBank.deposit(2000);//2000�� �Ա�
		myBank.deposit(3000);//3000�� �Ա�
		System.out.println(myBank.balance);//�ʵ� ���
		System.out.println("���� �ܾ���:"+myBank.getBalance()+"�� �Դϴ�");//�ܾ� �޼ҵ� getBalanceȣ���Ͽ� ���
		myBank.withdraw(1000);//1000�� ���
		System.out.println("���� �ܾ���:"+myBank.getBalance()+"�� �Դϴ�");//�ܾ� �޼ҵ� getBalanceȣ���Ͽ� ���



	}


}
