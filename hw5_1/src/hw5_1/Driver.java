package hw5_1;

public class Driver {


	public static void main(String[] args) {
		int result;
		int[] world=new int[10];
		for(int i=0; i<world.length; i++) {
			world[i]=i+10;

		}




		// TODO Auto-generated method stub
		System.out.println("hw5_1:�̽���");//���� �ڵ�� �̸� ���
		UserRank []u=new UserRank[5];
		for(int i=0; i<5; i++) {
			////(1) ȸ�� 5���� ���� - ȸ�� �迭�� ����� ��
			u[i]=new UserRank();

		}


		for(int j=0; j<5; j++) {
			//�ݺ���
			u[j].rankHold(j+1);//(2) ȸ�� 5���� ����� 1, 2, 3, 4, 5�� ���� 
			u[j].pointReward();//(3) ȸ�� 5���� ����Ʈ ���� 
			u[j].pointReward();//(4) ȸ�� 5���� ����Ʈ ����
			System.out.println(j+1+"��° ȸ������ �������� "+u[j].discountSearch()+"�Դϴ�");
			//(5) ȸ�� 5���� ���η��� ��ȸ�Ͽ� ���
		}
		System.out.println(worldSum(world));
	}
	private static int worldSum(int []array) {
		int result=0;

		for(int i=0; i<array.length; i++) {
			result = array[i];
		}
		return result;

	}
	
}