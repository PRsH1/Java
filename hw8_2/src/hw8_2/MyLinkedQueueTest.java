/**********
 * ���ϸ�:MyLinkedQueueTest.java, MyLinkedQueue.java
 * �ۼ���:�̽���
 * �ۼ���:2018.11.05
 * ����:���� ����Ʈ�� �̿��� ť ����
 */
package hw8_2;

import java.util.Scanner;


public class MyLinkedQueueTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		MyLinkedQueue list=new MyLinkedQueue();
		int menu;
		System.out.println("hw8_2: �̽���");
		// TODO Auto-generated method stub
		do {
			//do~while ��
			System.out.print(" 1:���� 2:���� 3:��ȸ 4:ũ�� 5:��ü���� 6:����  ---> ");
			menu = input.nextInt();

			switch(menu) {
			//����ġ
			case 1:
				System.out.println("���Ҹ�  �����մϴ�.");
				System.out.print("������ �Է��ϼ���:");
				int number;
				number=input.nextInt();
				list.enQueue(number);
				break;
			case 2:
				System.out.println("���Ҹ� �����մϴ�.");
				System.out.println("���� ����:"+list.deQueue());
		
				break;
			case 3:
				System.out.println("���Ҹ� ��ȸ�մϴ�.");
				System.out.println("��ȸ ����:"+list.peek());
				
				break;
			case 4:
				System.out.println("ũ�⸦ ��ȸ�մϴ�."); 
				System.out.println("���� ũ���:"+list.size());
				break;
			case 5:
				System.out.println("��ü ���Ҹ� �����մϴ�");
				int temp=list.size();
				for(int i=1; i<=temp; i++) {
					System.out.println("���� ���� "+i+"��°:"+list.deQueue());
				}
				System.out.println("���� �Ϸ��߽��ϴ�");
				break;
			case 6:
				System.out.println("�����մϴ�");
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
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
			System.out.println("���� ���� "+i+"��°:"+list2.deQueue());
		}

	}

}
