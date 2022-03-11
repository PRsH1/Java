/**********
 * 파일명:MyLinkedQueueTest.java, MyLinkedQueue.java
 * 작성자:이승현
 * 작성일:2018.11.05
 * 주제:연결 리스트를 이용한 큐 구현
 */
package hw8_2;

import java.util.Scanner;


public class MyLinkedQueueTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		MyLinkedQueue list=new MyLinkedQueue();
		int menu;
		System.out.println("hw8_2: 이승현");
		// TODO Auto-generated method stub
		do {
			//do~while 문
			System.out.print(" 1:삽입 2:삭제 3:조회 4:크기 5:전체삭제 6:종료  ---> ");
			menu = input.nextInt();

			switch(menu) {
			//스위치
			case 1:
				System.out.println("원소를  삽입합니다.");
				System.out.print("정수를 입력하세요:");
				int number;
				number=input.nextInt();
				list.enQueue(number);
				break;
			case 2:
				System.out.println("원소를 삭제합니다.");
				System.out.println("삭제 원소:"+list.deQueue());
		
				break;
			case 3:
				System.out.println("원소를 조회합니다.");
				System.out.println("조회 원소:"+list.peek());
				
				break;
			case 4:
				System.out.println("크기를 조회합니다."); 
				System.out.println("현재 크기는:"+list.size());
				break;
			case 5:
				System.out.println("전체 원소를 삭제합니다");
				int temp=list.size();
				for(int i=1; i<=temp; i++) {
					System.out.println("삭제 원소 "+i+"번째:"+list.deQueue());
				}
				System.out.println("삭제 완료했습니다");
				break;
			case 6:
				System.out.println("종료합니다");
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 6);
		MyLinkedQueue list2=new MyLinkedQueue();
		list2.enQueue(2);
		list2.enQueue(5);
		list2.enQueue(3);
		list2.enQueue(7);
		list2.deQueue();
		list2.enQueue(list2.deQueue());
		int temp=list2.size();
		for(int i=1; i<=temp; i++) {
			System.out.println("삭제 원소 "+i+"번째:"+list2.deQueue());
		}

	}

}
