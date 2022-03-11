package lab6_4;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_2:ÀÌ½ÂÇö");
		System.out.println(BankAccount.getAccountCount());
		System.out.println(BankAccount.MIN_WITHDRAW);
		BankAccount account1=new BankAccount();
		BankAccount account2=new BankAccount();
		System.out.println(BankAccount.getAccountCount());
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		

	}

}
