import java.util.Scanner;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("hw6_2:�̽���");
		int menu;
		MyDoublyLinkedList list=new MyDoublyLinkedList();
		// TODO Auto-generated method stub
		do {
			System.out.print(" 1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:���һ��� 8:�������� 9:����---> ");
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
				list.addFirst(number);
				break;
			case 4:
				System.out.println("���Ҹ� ����Ʈ�� �� �ڿ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				int number1;
				number1 = input.nextInt();    
				list.addLast(number1); 
				break;
			case 5:
				System.out.println("����Ʈ �� �տ� �ִ� ���Ҹ� �����մϴ�.");
				System.out.println("���� ����:"+list.removeFirst());
				
				break;
			case 6:
				System.out.println("����Ʈ �� �ڿ� �ִ� ���Ҹ� �����մϴ�.");
				System.out.println("���� ����:"+list.removeLast());
				

				break;
			case 7:
				System.out.print("�������� �Է��ϼ���, �� ���Ҹ� �����մϴ�:");
				int number2=input.nextInt();
				if(list.remove(number2)==true) {
					System.out.println("���� �Ϸ�Ǿ����ϴ�");
				}
				else {
					System.out.println("���� ����! �Է��Ͻ� ���Ұ��� �������� �ʽ��ϴ�.");
				}
				break;
				
			case 8:
				System.out.println("����� ��ũ ���θ� Ȯ���մϴ�.");
				list.printList();
				break;
			 
			case 9:
				System.out.println("�����մϴ�.");   
				break;
			
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 9);

	}

}
