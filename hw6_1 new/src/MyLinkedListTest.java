/**********
 * 파일명:MyLinkedList.java,MyLinkedListTEst.java
 * 작성자:이승현
 * 작성일:2018.10.01
 * 설명:연결 리스트의 연습
 */
import java.util.*;
public class MyLinkedListTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("hw6_1:이승현");
		int menu;
		MyLinkedList list=new MyLinkedList();
		System.out.println(list.getSum());
		// TODO Auto-generated method stub
		do {
			System.out.print(" 1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:종료 ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("전체 원소를 조회합니다");
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println("리스트 길이를 조회합니다.");
				System.out.println("list 길이 ="+list.size());   // 완성하세요.
				break;
			case 3:
				System.out.println("원소를 리스트이 맨 앞에 삽입합니다.");
				System.out.println("정수를 입력하세요:");
				int number;
				number=input.nextInt();
				list.addFirst(number);;
				break;
			case 4:
				System.out.println("원소를 리스트의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 입력: ");
				int number1;
				number1 = input.nextInt();    
				list.addLast(number1);  // 완성하세요.
				break;
			case 5:
				System.out.println("리스트 맨 앞에 있는 원소를 삭제합니다.");
				System.out.println("삭제 원소:"+list.removeFirst());
				System.out.println(list.toString());
				break;
			case 6:
				System.out.println("리스트 맨 뒤에 있는 원소를 삭제합니다.");
				System.out.println("삭제 원소:"+list.removeLast());
				System.out.println(list.toString());

				break;
			case 7:
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 7);

	}

}
