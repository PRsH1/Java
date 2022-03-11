/*���ϸ�:RandomWalk.java
 *�ۼ���:2018-03-29
 *�̸�:�̽���
 *����:������ ������ �迭�� �̿��� ������ũ ������
 */



package hw4_2;



public class RandomWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0,y=0;
		System.out.println("hw4_2:�̽���\n");//���� �ڵ�� ���� �̸� ���

		int z=(int)(Math.random()*5);//���� ����(0~4)
		int w=(int)(Math.random()*5);//���� ����(0~4)
		System.out.println("���=("+x+","+y+")");//��߰� ���
		System.out.println("��ǥ=("+w+","+z+")");//������ ���
		boolean tile[][]=new boolean[5][5];//boolean�� 2�����迭 tile���� ũ��� 5 5
		int steps;//Ƚ���� ������ ���� steps����

		tile[0][0]=true;//Ÿ�� 0 0���� Ʈ�簪�̴�
		System.out.print("�̵� ���=("+x+","+y+")");//�ʱ� �̵� ��� ���
		for(steps=0; steps<20; steps++) {
			//�ݺ���
			int direction=(int)(Math.random()*4);//direction(����)���� ���� ���� ����(0~3)(4����)
			if(x==z&&y==w) {
				//���� ��ǥ �������� x y�� ���ٸ�
				System.out.println();//����
				break;//Ż��
			}
			if (direction==0 && x>0) //�𷺼��� 0 �׸��� x>0�̸�
				x--;//x 1����
			else if(direction==1 &&x<4)//�𷺼��� 1 x�� 4�̸��̸�
				x++;//x 1����
			else if(direction==2 && y>0)//�𷺼��� 2 y�� 0���� ũ��
				y--;//y 1����
			else if(y<4)//y�� 4 �̸��̸�
				y++;//y 1����

			tile[y][x]=true;//���� x y �迭 true�� ����
			if(steps==19)//Ƚ���� 20ȸ�̸�
				System.out.println("("+y+","+x+")");//��� ����
			else if(x==z&&y==w)//��ǥ���� ���簪�� ���ٸ�
				System.out.print("("+y+","+x+")");//���


			else
				System.out.print("("+y+","+x+")");//�̵���� ���
		}
		System.out.println("----------");//���м� ���
		for(int i=0; i<5; i++) {
			//�ݺ��� 
			for(int j=0; j<5; j++) {
				//�ݺ��� ��ø
				if(i==z && j==w)
					//������ ������
					System.out.print("G ");//G���
				else if(i==0 && j==0)
					//i �׸��� j �� 0�̸�
					System.out.print("S ");//S���
				else if(tile[j][i]==true)
					//tile�� [][]�迭�� true���̸�
					System.out.print("# ");//#���


				else
					//�ƹ� �ش���� ������
					System.out.print(". ");//.���
			}
			System.out.println();//����
		}
		System.out.println("----------");//���м� ���
		int result=steps+1;//Ƚ�� ��� ������ ���� result
		if (steps<19) {
			//�ִ� Ƚ���� �������� ��������-����������
			System.out.println("����");//���� �ȳ��� ���
			System.out.println("�� �õ� Ƚ��:"+result);//Ƚ�� ��� ���


		}
		else {
			//�ִ� Ƚ���� ����������
			System.out.println("����");//���� �ȳ��� ���
		}



	}



}

