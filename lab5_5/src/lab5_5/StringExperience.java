package lab5_5;

import java.util.Scanner;

public class StringExperience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab5_5: �̽���");
	     
	     // (1) ����ڷκ��� ���̰� 5 �̻��� �� ���� ���ڿ� s1, s2�� �Է¹���
	     Scanner input = new Scanner(System.in);
	     System.out.print("���̰� 5 �̻��� ���ڿ� s1 �Է�:");
	     String s1 = input.nextLine();
	     System.out.print("���̰� 5 �̻��� ���ڿ� s2 �Է�:");
	     String s2 = input.nextLine();

	     // (2) S1�� ���� ���
	     System.out.println(s1.length());
	     System.out.println(s1.charAt(0));
	     System.out.println(s1.substring(1,4));
	     System.out.println(s1.toUpperCase());
	     System.out.println(s1.equals(s2));
	     System.out.println(s1.equalsIgnoreCase(s2));
	     System.out.println(s1.compareTo(s2));
	     
	     

	}

}
