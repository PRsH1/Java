/**********
 * 파일명:MyStackPointCounting.java
 * 작성자:이승현
 * 작성일:2018.10.27
 * 주제:스택을 이용한 후휘 연산 구현
 */

package hw7_4;

import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Scanner;

public class MyStackPostCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<String>();
		//스택 클래스 객체 하나 생성
		Scanner input=new Scanner(System.in);
		System.out.println("hw7_4:이승현");
		System.out.print("후위표기수식입력:");//안내문 출력
		String str=input.nextLine();
		String []arr=str.split(" ");//공백을 기준으로 문자열 나눈다
		double total = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("+")) {
				//equls메소드 사용,조건에 맞으면
				try {
					//만약 연산자가 현재 스택에 있는 숫자보다 더 많으면 예외처리
					double temp1=Double.parseDouble(stack.pop());
					double temp2=Double.parseDouble(stack.pop());
					total=temp2+temp1;
				}catch(EmptyStackException e) {
					System.out.println("잘못된 수식입니다");
					break;
				}

				stack.push(Double.toString(total));
			}
			else if(arr[i].equals("-")) {
				//equls메소드 사용,조건에 맞으면

				try {
					//만약 연산자가 현재 스택에 있는 숫자보다 더 많으면 예외처리
					double temp1=Double.parseDouble(stack.pop());
					double temp2=Double.parseDouble(stack.pop());
					total=temp2-temp1;

				}catch(EmptyStackException e) {
					System.out.println("잘못된 수식입니다");
					break;
				}
				stack.push(Double.toString(total));
			}
			else if(arr[i].equals("*")) {
				//equls메소드 사용,조건에 맞으면
				try {
					//만약 연산자가 현재 스택에 있는 숫자보다 더 많으면 예외처리
					double temp1=Double.parseDouble(stack.pop());
					double temp2=Double.parseDouble(stack.pop());
					total=temp2*temp1;
				}catch(EmptyStackException e) {
					System.out.println("잘못된 수식입니다");
					break;
				}
				stack.push(Double.toString(total));
			}
			else if(arr[i].equals("/")) {
				//equls메소드 사용,조건에 맞으면
				try {
					//만약 연산자가 현재 스택에 있는 숫자보다 더 많으면 예외처리
					double temp1=Double.parseDouble(stack.pop());
					double temp2=Double.parseDouble(stack.pop());
					total=temp2/temp1;
				}catch(EmptyStackException e) {
					System.out.println("잘못된 수식입니다");
					break;
				}
				stack.push(Double.toString(total));
			}
			else {
				//만약 숫자가 입력되었을 시
				double temp;
				try {
					temp=Double.parseDouble(arr[i]);
					//Double로 변환되는지 try
				}catch(NumberFormatException e){
					//NumberFormatException 발생 시 예외처리
					System.out.println("잘못된 수식입니다");
					break;

				}
				//아니라면 스택에 push
				stack.push(arr[i]);

			}

		}
		if(stack.isEmpty()==false &&stack.size()==1)
			//스택이 isEmpty가 아닐 때만
			System.out.println("결과="+stack.peek());

	}

}
