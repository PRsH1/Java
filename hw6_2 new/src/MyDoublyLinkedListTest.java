import java.util.Scanner;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("hw6_2:이승현");
		int menu;
		MyDoublyLinkedList list=new MyDoublyLinkedList();
		// TODO Auto-generated method stub
		do {
			System.out.print(" 1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:원소삭제 8:양방향출력 9:종료---> ");
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
				list.addFirst(number);
				break;
			case 4:
				System.out.println("원소를 리스트의 맨 뒤에 삽입합니다.");
				System.out.print("정수값 입력: ");
				int number1;
				number1 = input.nextInt();    
				list.addLast(number1); 
				break;
			case 5:
				System.out.println("리스트 맨 앞에 있는 원소를 삭제합니다.");
				System.out.println("삭제 원소:"+list.removeFirst());
				
				break;
			case 6:
				System.out.println("리스트 맨 뒤에 있는 원소를 삭제합니다.");
				System.out.println("삭제 원소:"+list.removeLast());
				

				break;
			case 7:
				System.out.print("정수값을 입력하세요, 그 원소를 삭제합니다:");
				int number2=input.nextInt();
				if(list.remove(number2)==true) {
					System.out.println("삭제 완료되었습니다");
				}
				else {
					System.out.println("삭제 실패! 입력하신 원소값이 존재하지 않습니다.");
				}
				break;
				
			case 8:
				System.out.println("양방향 링크 여부를 확인합니다.");
				list.printList();
				break;
			 
			case 9:
				System.out.println("종료합니다.");   
				break;
			
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 9);

	}

}
