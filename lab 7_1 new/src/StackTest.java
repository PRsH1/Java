import java.util.Stack;
import java.util.Scanner;
public class StackTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("lab7_1:�̽���");
		Stack<Integer> stack=new Stack<Integer>();
		Scanner input=new Scanner(System.in);
		int menu;
		do {
			System.out.println("��ȣ�� �����ϼ���");
			System.out.println("1:���� 2:���� 3:��ȸ 4:�հ� 5:����");
			menu=input.nextInt();
			switch(menu) {
			case 1:
				System.out.print("�������� �Է��ϼ���:");
				int number=input.nextInt();
				stack.push(number);
				break;
			case 2:
				System.out.print("������ �����˴ϴ�:");
				System.out.println(stack.pop());
				break;
			case 3:
				System.out.print("������ ��ȸ�˴ϴ�:");
				System.out.println(stack.peek());
				break;
			case 4:
				System.out.print("�հ踦 ����մϴ�, ���ÿ� �ִ� ������ �����˴ϴ�:");
				int sum = 0;
				while(stack.empty()==false) {
					sum+=stack.pop();
				}
				System.out.println(sum);
				break;
				
			case 5:
				System.out.println("�����մϴ�");
				break;
			default:
				System.out.println("�޴� ���� ����! �ٽ� �����ϼ���");
			}
		}while(menu!=5);
		
		
		
	}

}
