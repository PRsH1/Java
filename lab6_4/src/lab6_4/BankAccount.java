package lab6_4;

public class BankAccount {
	private int accountNum;
	private	int balance;
	private static int accountCount;
	public static final int MIN_WITHDRAW=100;
	public BankAccount() {
		this.balance=0;
		accountCount+=1;
		accountNum=accountCount;
	}
	public String toString() {
		return "BankAccount [accountnum=" + accountNum + ", balance=" + balance + "]";
	}
	public static int getAccountCount() {
		return accountCount;
	}

}
