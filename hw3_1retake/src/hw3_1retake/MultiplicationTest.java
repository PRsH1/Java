/*
* ���ϸ�:MultiplicationTest.java
 *�ۼ���:2017.03.20
 *�̸�:�̽���
 *����:������ �̿��� ���� ���� ����
 */



package hw3_1retake;
import java.util.Scanner;//�Է��� ���� �ڹ� ���̺귯�� import
import java.util.Random;//���� ������ ���� �ڹ� ���̺귯�� import

public class MultiplicationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();//���� ������ ���� generator�޼ҵ�
		Scanner scan = new Scanner(System.in);//�Է��� ���� scan�޼ҵ�

		int i = 0;//�ݺ��� ���� ���� i ����
		int correct = 0;//������ ������ ������ ���� correct����
		int point = 0;//������ ������ ���� point����
		int correctnum = 0;//���� ������ ������ ���� ����
		int incorrectnum = 0;//���� ������ ������ ���� ����
		System.out.println("hw3_1:�̽���\n");//���� �ڵ�� ���� �̸� ���
		System.out.println("���� ������ ���� �Է��ϼ���(����Ϸ��� 0�� �Է�)");//�ȳ��� ���
		while (i < 5) {
			//�ݺ��� while 
			int number = generator.nextInt(9) + 1;//���� 1�� number�� ���� ������ 1~9����
			int number2 = generator.nextInt(9) + 1;//���� 2�� number2�� ���� ������ 1~9����
			correct = number * number2;//������ correct�� ����
			System.out.print(number + "*" + number2 + "=? ");//���� ���
			int answer1 = scan.nextInt();//���� ����
			if (correct == answer1) {
				//�����ϋ��� ���ǹ�
				System.out.print("�����Դϴ�\n");//���� �ȳ��� ���
				point += 20;//���� 20�� ���
				correctnum += 1;//���� ���� 1 ���
			} else if (answer1 == 0) {
				//���� ����ڰ� ������ 0�̶�� ���������
				System.out.print("���\n");//��� �޼��� ���
			} else {
				//Ʋ������
				System.out.print("Ʋ�Ƚ��ϴ�\n");//���� �ȳ��� ���
				point -= 10;//���� 10�� ����
				incorrectnum += 1;//���� ���� 1 ����
				if (0 > point) {
					//���� ������ ������ �Ǹ�
					point = 0;//���� 0������ ȸ��
				}

			}
			i++;//�ݺ��� 1ȸ ����
		}
		if (point >= 50) {
			//���� �հ��̶��
			System.out.print("�����" + correctnum + " �����" + incorrectnum + " ����" + point + "-->�հ�");

		} else {
			//���� ���հ��̶��
			System.out.print("�����" + correctnum + " �����" + incorrectnum + " ����" + point + "-->���հ�");

		}
	}
}
