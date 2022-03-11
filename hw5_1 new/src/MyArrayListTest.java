/**************
 * ���ϸ�:MyArrayList.java,MyArrayListTest.java,hw5_1.jar
 * �ۼ���:�̽���
 * �ۼ���:2018,09,16
 * ����:�迭�� �̿��� ����Ʈ �ۼ�
 * 
 */
import java.util.Scanner;

public class MyArrayListTest {
	public static void main(String[] args) {
		System.out.println("hw5_1: �̽���");

		Scanner input = new Scanner(System.in);

		// (1) Integer�� Ÿ�� �Ű������� �Ͽ� ArrayList ��ü�� ����(list��� �̸��� ������ ����)

		MyArrayList list=new MyArrayList(); // �ϼ��ϼ���.

		// (2) ����ڿ��� �޴��� �ݺ� �����ϰ� 7�� �Է��ϸ� �ݺ� ����
		int menu = 0;
		int index = 0;
		int element = 0;
		do {
				System.out.print(" 1:�ε�����ȸ 2:��ü��ȸ 3:������ȸ 4:���� 5:�ε������� 6:�ε������� 7:���� ---> ");
				//�ȳ���
				menu = input.nextInt();
				//�޴��� ���ڸ� �ִ´�
				switch(menu) {
				//����ġ��
				case 1:
					System.out.println("�ε��� ��ġ�� ���Ұ��� ��ȸ�մϴ�.");
					System.out.print("�ε��� �Է�: ");
					index = input.nextInt();
					try {
						if(index>=list.size()) {
							//���� index�� ���� list.size(number)�� ���ų� ũ�ٸ�
							throw new IndexOutOfBoundsException();//���� �߻�
						}
						else
							element = list.get(index); // �ϼ��ϼ���.
					}catch(IndexOutOfBoundsException e) {
						//IndexOutOfBoundsException ����ó��
							System.out.println("�ε����� ������ ������ϴ�");//���
							break;
					}
					System.out.println(element);//������ �� ���  
					break;
				case 2:
					System.out.println("����Ʈ ��ü�� ��ȸ�մϴ�.");
					System.out.println(list.toString());   // �ϼ��ϼ���.
					break;
				case 3:
					System.out.println("����Ʈ ���̸� ��ȸ�մϴ�.");
					int size = list.size();  // �ϼ��ϼ���.
					System.out.println(size);
					break;
				case 4:
					System.out.println("���Ҹ� ����Ʈ�� �� �ڿ� �����մϴ�.");
					System.out.print("������ �Է�: ");
					element = input.nextInt();    
					list.add(element);  // �ϼ��ϼ���.
					break;
				case 5:
					System.out.println("�ε��� ��ġ�� ���Ҹ� �����մϴ�.");
					System.out.print("�ε��� �Է�: ");
					try {
						index = input.nextInt();    
						if(index>=list.size())//���� list.size(number)�� ���ų� ũ�ٸ�
							throw new IndexOutOfBoundsException();//���� �߻�
					}catch(IndexOutOfBoundsException e) {
						//IndexOutOfBoundsException ����ó��
						System.out.println("������ ������ϴ� ��Ȯ�ϰ� �Է����ּ���");
						break;
					}
					
					System.out.print("������ �Է�: ");
					element = input.nextInt();    
					list.add(index,element);    // �ϼ��ϼ���.
					break;
				case 6:
					System.out.println("�ε��� ��ġ�� ���Ҹ� �����մϴ�.");
					System.out.print("�ε��� �Է�: ");
					try {
						index = input.nextInt();    
						if(index>=list.size())//���� list.size(number)�� ���ų� ũ�ٸ�
							throw new IndexOutOfBoundsException();//����ó��
					}catch(IndexOutOfBoundsException e) {
						//IndexOutOfBoundsException ����ó��
						System.out.println("������ ������ϴ� ��Ȯ�ϰ� �Է����ּ���");
						break;
					}
					element = list.remove(index)   ;  // �ϼ��ϼ���.
					System.out.println(element);
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