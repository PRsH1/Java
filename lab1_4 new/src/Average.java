
import java.util.Scanner;//��ĳ�� ���̺귯�� import
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_4:�̽���");
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ���� �Է�:");
		//�Է� �ȳ���
		int n=scan.nextInt();
		int []n2=new int[n];//���� ������ �迭 ������ ������
		System.out.print(n+"���� ������ �Է�");
		for(int i=0; i<n; i++) {
		//�ݺ���
			
			n2[i]=scan.nextInt();//n2�迭�� ���� ����
		}
		System.out.println("���="+getAverage(n2));//����� ���,�޼ҵ� ȣ��
		

	}
	public static double getAverage(int []arr) {
		//getAverage�޼ҵ�,�迭 �ŰԺ���
		double sum = 0;//���� �� ����
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];//�迭 �ε����� ����Ǿ� �ִ� �� sum�� ������
		}
		return sum/arr.length;//����� ��ȯ
		
	}

}
