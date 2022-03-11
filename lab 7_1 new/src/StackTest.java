import java.util.Stack;
import java.util.Scanner;
public class StackTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("lab7_1:이승현");
		Stack<Integer> stack=new Stack<Integer>();
		Scanner input=new Scanner(System.in);
		int menu;
		do {
			System.out.println("번호를 선택하세요");
			System.out.println("1:삽입 2:삭제 3:조회 4:합계 5:종료");
			menu=input.nextInt();
			switch(menu) {
			case 1:
				System.out.print("정수값을 입력하세요:");
				int number=input.nextInt();
				stack.push(number);
				break;
			case 2:
				System.out.print("정수가 삭제됩니다:");
				System.out.println(stack.pop());
				break;
			case 3:
				System.out.print("정수가 조회됩니다:");
				System.out.println(stack.peek());
				break;
			case 4:
				System.out.print("합계를 출력합니다, 스택에 있는 값들이 삭제됩니다:");
				int sum = 0;
				while(stack.empty()==false) {
					sum+=stack.pop();
				}
				System.out.println(sum);
				break;
				
			case 5:
				System.out.println("종료합니다");
				break;
			default:
				System.out.println("메뉴 선택 오류! 다시 선택하세요");
			}
		}while(menu!=5);
		
		
		
	}

}
