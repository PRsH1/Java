/**********
 * ���ϸ�:MyLinkedList.java,MyLinkedListTEst.java
 * �ۼ���:�̽���
 * �ۼ���:2018.10.01
 * ����:���� ����Ʈ�� ����
 */
import java.util.*;
public class MyLinkedListTest {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("hw6_1:�̽���");
		int menu;
		MyLinkedList list=new MyLinkedList();
		System.out.println(list.getSum());
		// TODO Auto-generated method stub
		do {
			System.out.print(" 1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:���� ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("��ü ���Ҹ� ��ȸ�մϴ�");
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println("����Ʈ ���̸� ��ȸ�մϴ�.");
				System.out.println("list ���� ="+list.size());   // �ϼ��ϼ���.
				break;
			case 3:
				System.out.println("���Ҹ� ����Ʈ�� �� �տ� �����մϴ�.");
				System.out.println("������ �Է��ϼ���:");
				int number;
				number=input.nextInt();
				list.addFirst(number);;
				break;
			case 4:
				System.out.println("���Ҹ� ����Ʈ�� �� �ڿ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				int number1;
				number1 = input.nextInt();    
				list.addLast(number1);  // �ϼ��ϼ���.
				break;
			case 5:
				System.out.println("����Ʈ �� �տ� �ִ� ���Ҹ� �����մϴ�.");
				System.out.println("���� ����:"+list.removeFirst());
				System.out.println(list.toString());
				break;
			case 6:
				System.out.println("����Ʈ �� �ڿ� �ִ� ���Ҹ� �����մϴ�.");
				System.out.println("���� ����:"+list.removeLast());
				System.out.println(list.toString());

				break;
			case 7:
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 7);

	}

}
