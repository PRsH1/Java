/**************
 * 파일명:MyArrayList.java,MyArrayListTest.java,hw5_1.jar
 * 작성자:이승현
 * 작성일:2018,09,16
 * 설명:배열을 이용한 리스트 작성
 * 
 */
import java.util.Scanner;

public class MyArrayListTest {
	public static void main(String[] args) {
		System.out.println("hw5_1: 이승현");

		Scanner input = new Scanner(System.in);

		// (1) Integer를 타입 매개변수로 하여 ArrayList 객체를 생성(list라는 이름의 변수에 저장)

		MyArrayList list=new MyArrayList(); // 완성하세요.

		// (2) 사용자에게 메뉴를 반복 제공하고 7을 입력하면 반복 종료
		int menu = 0;
		int index = 0;
		int element = 0;
		do {
				System.out.print(" 1:인덱스조회 2:전체조회 3:길이조회 4:삽입 5:인덱스삽입 6:인덱스삭제 7:종료 ---> ");
				//안내문
				menu = input.nextInt();
				//메뉴에 숫자를 넣는다
				switch(menu) {
				//스위치문
				case 1:
					System.out.println("인덱스 위치의 원소값을 조회합니다.");
					System.out.print("인덱스 입력: ");
					index = input.nextInt();
					try {
						if(index>=list.size()) {
							//만약 index의 값이 list.size(number)와 같거나 크다면
							throw new IndexOutOfBoundsException();//예외 발생
						}
						else
							element = list.get(index); // 완성하세요.
					}catch(IndexOutOfBoundsException e) {
						//IndexOutOfBoundsException 예외처리
							System.out.println("인덱스의 범위를 벗어났습니다");//출력
							break;
					}
					System.out.println(element);//원소의 값 출력  
					break;
				case 2:
					System.out.println("리스트 전체를 조회합니다.");
					System.out.println(list.toString());   // 완성하세요.
					break;
				case 3:
					System.out.println("리스트 길이를 조회합니다.");
					int size = list.size();  // 완성하세요.
					System.out.println(size);
					break;
				case 4:
					System.out.println("원소를 리스트의 맨 뒤에 삽입합니다.");
					System.out.print("정수값 입력: ");
					element = input.nextInt();    
					list.add(element);  // 완성하세요.
					break;
				case 5:
					System.out.println("인덱스 위치에 원소를 삽입합니다.");
					System.out.print("인덱스 입력: ");
					try {
						index = input.nextInt();    
						if(index>=list.size())//만약 list.size(number)와 같거나 크다면
							throw new IndexOutOfBoundsException();//예외 발생
					}catch(IndexOutOfBoundsException e) {
						//IndexOutOfBoundsException 예외처리
						System.out.println("범위를 벗어났습니다 정확하게 입력해주세요");
						break;
					}
					
					System.out.print("정수값 입력: ");
					element = input.nextInt();    
					list.add(index,element);    // 완성하세요.
					break;
				case 6:
					System.out.println("인덱스 위치의 원소를 삭제합니다.");
					System.out.print("인덱스 입력: ");
					try {
						index = input.nextInt();    
						if(index>=list.size())//만약 list.size(number)와 같거나 크다면
							throw new IndexOutOfBoundsException();//예외처림
					}catch(IndexOutOfBoundsException e) {
						//IndexOutOfBoundsException 예외처리
						System.out.println("범위를 벗어났습니다 정확하게 입력해주세요");
						break;
					}
					element = list.remove(index)   ;  // 완성하세요.
					System.out.println(element);
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