package course1;



import java.math.BigDecimal;//���� ���� �Ǽ� ǥ���� ���� BigDecimal Ŭ����
import java.util.*;
public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[10];//�迭 arr 10����
		int search;//�˻����� ���� ���� ����
		System.out.println("lab1_2:�̽���");
		Scanner input=new Scanner(System.in);//Scanner
		System.out.print("������ 10�� �Է�:");
		for (int i=0; i<10; i++) {
			
			arr[i]=input.nextInt();
			
		}
		System.out.print("�˻��� ������ �Է�:");
		search=input.nextInt();
		for(int j=0; j<10; j++) {
			//�ݺ��� j 0���� 9���� j 1�� �ø���
			if(arr[j]!=search) {
				//j���� ���� search(�˻� ����)�� ��ġ���� ���� ��
				if(j==9) {
					//���� j���� �ذ��� �Ǹ�
					System.out.println("-1");//������ ������ �ǹ��� -1���
					break;
					
				}
				continue;//�ݺ�
				
				
			}
			else if(arr[j]==search){
				//j���� ������ search(�˻� ����)�� ��ġ�ϸ�
				System.out.println("�ε���:"+j);//�� ���� �� ���
				break;
				
			}
	
		}
		double x=3.0;
		double y=2.345;
		//�Ǽ� 3.0�� 2.345�� �ջ�
		double z=x+y;//�����:5.345000000000001--> �̼��� ���� �߻�
		System.out.println(z);
		BigDecimal b1=new BigDecimal("3.0");
		BigDecimal b2=new BigDecimal("2.345");
		System.out.println(b1.add(b2));//��� 5.345
		//add�� ��������:BigDecimal�Լ��� �� ���� ���������!

	}

}
