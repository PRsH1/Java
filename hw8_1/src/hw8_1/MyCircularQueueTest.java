/**********
 * ���ϸ�:MyCircularQueueTest.java, MycircularQueue.java
 * �ۼ���:�̽���
 * �ۼ���:2018.11.02
 * ����:������ �̿��� ���� ���� ����
 */

package hw8_1;
import java.util.*;

public class MyCircularQueueTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		MyCircularQueue list=new MyCircularQueue(5);
	
		int menu;
		System.out.println("hw8_1: �̽���");
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
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 6);

	}

}
