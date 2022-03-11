/**********
 * 파일명:MyCharacterStack.java,MyCharacterStackTest.java
 * 작성자:이승현
 * 작성일:2018.10.26
 * 주제:연결 리스트를 이용한 스택 괄호 표기 구현
 */

package hw7_3;

import java.util.Scanner;

public class MyCharacterStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_3:이승현");
		String data;
		int missCount=0;//연결 리스트의 top이 비어있고 잘못된 괄호 수식일 시
		Scanner input=new Scanner(System.in);
		MyCharacterStack stack=new MyCharacterStack();
		System.out.print("수식 입력:");
		data=input.nextLine();
		char []arr=new char[data.length()];//배열 크기 지정
		for(int i=0; i<data.length(); i++) {
			//문자열 크기만큼 반복
			arr[i]=data.charAt(i);
		}
		for(int j=0; j<arr.length; j++) {
			//배열 크기만큼 반복
			if(arr[j]=='(' || arr[j]=='<') {
				//만약 이 두 문자면 push
				stack.push(arr[j]);
			}
			else if(arr[j]==')') {
				//만약 )이 나왔을 시
				if(stack.isEmpty()==true) {
					System.out.println("잘못된 수식입니다");
					missCount+=1;
					break;
				}
				else if(stack.peek()=='(')
					//스택 조회 결과 (가 나온다면 pop
					stack.pop();
				

			}
			else if(arr[j]=='>') {
				//만약 >이 나왔을 시
				if(stack.isEmpty()==true) {
					System.out.println("잘못된 수식입니다");
					missCount+=1;
					break;
				}
				else if(stack.peek()=='<')
					//스택 조회 결과 <가 나온다면
					stack.pop();
				
			}
		}
		if(stack.isEmpty()==true &&missCount==0) {
			System.out.println("올바른 괄호 수식입니다");
		}
		else if(stack.isEmpty()==false){
			System.out.println("잘못된 괄호 수식입니다");
		}




	}

}
