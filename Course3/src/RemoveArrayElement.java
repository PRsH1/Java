import java.util.Scanner;

public class RemoveArrayElement {

	public static void main(String[] args) {
		System.out.println("course3 : �̽��� ");

		// ũ�Ⱑ 15�� �迭 list�� ���̰� numberOfElements�� ���� ����Ʈ�� ������
		int[] list = {3, -6, 11, -5, 22, 11, 0, 9, 7, 2};
		int numberOfElements = 10;//�迭 ������ ��Ÿ���� ����

		// numberOfElements���� ���Ҹ� ���� ����Ʈ�� ���
		System.out.print("���� �� ����Ʈ = ");
		printList(list, numberOfElements);

		// ������ ��(element)�� �Է¹���
		Scanner input = new Scanner(System.in);
		System.out.print("������ �� �Է�: ");
		int element = input.nextInt();

		// (1) list���� element�� ����
		// �̶�, ������ ���� �������� �� ���� ���Ҹ� �����ϰ�, �������� �ʴ� ���� ��� ���� ����
		int temp=0;//temp ���� �񱳿��� 
		temp=list[numberOfElements-1];//temp���� list[9]������
		for(int i=0; i<=numberOfElements-1; i++) {
			if(list[i]==element) {
				//�迭�� ���� ���Ұ��� ��ġ�ϸ�
				System.out.println("���� ����");
				numberOfElements-=1;//numberOfElements 1����
				for(int j=i; j<numberOfElements-1; j++) {
					list[j]=list[j+1];
				}
				if(i!=numberOfElements) {
					//���� i�� numberOfElements�� ��ġ���� ������
					list[numberOfElements-1]=temp;//�����صξ��� ������ ���� list[numberOfElements-1]������
					break;
				}
				break;
			
				
			}
			else if(i==numberOfElements-1)
				System.out.println("���� ����. �������� �ʴ� ���Դϴ�");
		}
		// ���� ����� numberOfElements���� ���Ҹ� ���� ����Ʈ�� ���
		System.out.print("���� �� ����Ʈ = ");
		printList(list, numberOfElements);
	}

	// �迭 array�� ����� numberOfElements ���� ���Ҹ� ���
	// �迭�� ���̿� ����� ���Ҽ��� ���� �ٸ� �� ����
	private static void printList(int[] array, int numberOfElements) {
		for(int i = 0; i < numberOfElements; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}