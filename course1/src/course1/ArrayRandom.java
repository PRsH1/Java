package course1;

public class ArrayRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []number=new int[10];//���� �迭 number ���� �迭 �ڸ����� 10
		int min;//�ּҰ�
		int index = 0;//�ε���
		int indexzero;//���߿� ������ ���� �����ϴ� �ε����� ��
		System.out.println("course 1:�̽���");
		for(int i=0; i<10; i++) {
			number[i]=(int) (Math.random()*101);//�ݺ����� ���鼭 �� �迭�� �ε����� 1~100���� ������ �� �ο�
			System.out.print(number[i]+" ");//�����ϰ� �ο��� ������ ���
		}
		indexzero=number[0];//0��° �ڸ��� �ּҰ��� ���� �ϹǷ� �̸� indexzero�� number[0]�� �����ص�
		min=number[0];//ó�� �ּҰ���  number�迭�� ù �ε���
		for(int j=0; j<10; j++) {
			if(number[j]<min) {
				//���� �ּҰ��� ���� �ε����� �� ���� ũ�ٸ�
				if(number[j]==min) {
					//�׷��� �� �ε����� ���� �ּҰ��̶� ������ ���
					continue;//���ư�
				}
				else {
					//�ƴϸ�
				min=number[j];//�ּҰ��� ���� �ε��� ������ ��ġ
				number[0]=number[j];//�迭�� ù��° ���� ���� �ε��� ������ ��ġ,���� �ּҰ��� �迭 �տ��� �δ� �뵵
				index=j;//index�� j�� ������ ��ġ
				}
			}
			
				
			
		}
		number[index]=indexzero;//���� �ּҰ��� ����ִ� �ε����� ���� ó���� �����صξ��� indexzero�� ������ ��ġ
		
		System.out.println("\n�ּҰ�:"+min);
		System.out.println("�ּҰ� �ε���:"+index+"\n");
		for(int x=0; x<10; x++) {
			System.out.print(number[x]+" ");
		}
		
		

	}

}
