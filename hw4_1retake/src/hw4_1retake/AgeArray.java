/*
* ���ϸ�:AgeArray.java
 *�ۼ���:2017.03.22
 *�̸�:�̽���
 *����:�迭�� �ݺ����� �̿��� �� ������ ���
 */





package hw4_1retake;

import java.util.Scanner;//��ĳ�� ���̺귯�� import
public class AgeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw4_1:�̽���\n");//�ڵ�� �̸� ���
		int lowerage;//���� ���� �Է¹޴� ���� ����
		int upperage;//���� ���� �Է¹޴� ���� ����
		int stnum=0;//�л� ���� �Է¹޴� ���� ���� 0���� �ʱ�ȭ
		int z=0;//�ݺ��� ���� ���� z ����

		int i=0;//�ݺ��� ���� ���� i ����

		Scanner input=new Scanner(System.in);//��ĳ�� ���̺귯�� input����
		System.out.print("���� ���� �Է�:");//���� �Է� �ȳ��� ���
		lowerage=input.nextInt();//���� ������ �Է¹޴´�
		int lowernum=lowerage;//������ �ݺ��� ���� ���� ����
		int lowernum2=lowerage;//���� ����
		System.out.print("���� ���� �Է�:");//���� �Է� �ȳ��� ���
		upperage=input.nextInt();//���� �Է¹޴´�
		System.out.print("�л� �� �Է�:");//�л� �� �Է� �ȳ��� ���
		stnum=input.nextInt();//�л� �� �Է¹޴´�
		int []agearr=new int[upperage-lowerage+1];//���̸� ������ �迭 ����
		int []stunum=new int[upperage-lowerage+1];//�л� ���� ������ �迭 ����
		while(lowernum<=upperage) {
			//�ݺ���
			agearr[z]=lowernum;//0��° ��Һ��� ���̰��� �ִ´�
			lowernum+=1;//1 ����
			z++;// 1 ����
		}
		while(i<stnum) {
			System.out.print("���� �Է�:");//���� �Է� �ȳ��� ���
			int age=input.nextInt();//���̸� �Է¹޴´�
			if(lowerage>age || upperage<age) {
				//���� ���Ѱ� ���� ������ �����
				System.out.print("������ ������ϴ�. �ٽ� �Է��ϼ���.\n");//���� �޼��� ���
				continue;//�ٽ� �Է¹޴´�
			}

			else {
				//������ �����ϸ�
				for (int x=0; x<=upperage-lowernum2; x++) {
					//�ݺ���
					if (agearr[x]==age){
						//���� �Է¹��� ���� ���� �迭 ���� ���� ���ٸ�
						stunum[x]++;//x��° ��ҿ� 1�� ���Ѵ�
						break;//Ż��
					}
				}
				i++;
			}

		}
		System.out.print("����  �л���\n");//����� ���
		for (int y=0; y<agearr.length; y++ ) {
			//�ݺ���
			System.out.println(agearr[y]+" "+stunum[y]);//�迭 ���ҵ� ���
		}




	}

}
