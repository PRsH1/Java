package lab5_5;

import java.util.Scanner;

public class StringExperience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab5_5: 이승현");
	     
	     // (1) 사용자로부터 길이가 5 이상인 두 개의 문자열 s1, s2를 입력받음
	     Scanner input = new Scanner(System.in);
	     System.out.print("길이가 5 이상인 문자열 s1 입력:");
	     String s1 = input.nextLine();
	     System.out.print("길이가 5 이상인 문자열 s2 입력:");
	     String s2 = input.nextLine();

	     // (2) S1의 길이 출력
	     System.out.println(s1.length());
	     System.out.println(s1.charAt(0));
	     System.out.println(s1.substring(1,4));
	     System.out.println(s1.toUpperCase());
	     System.out.println(s1.equals(s2));
	     System.out.println(s1.equalsIgnoreCase(s2));
	     System.out.println(s1.compareTo(s2));
	     
	     

	}

}
