
public class MyMatrixService {
	// (1) ���� �޼ҵ� multiply�� �ۼ��Ͻÿ�.
	// ������ ���� �迭�� ǥ���� �ΰ��� ����� �Ű������� �޾� ���� ���� ����� ������ ���� �迭�� ǥ���Ͽ� ����
	// �Ű������� ���� �� ����� ���� ���ϱ⿡ Ÿ���� ũ���� �����ص� ��

	public static int[][] multiply(int[][] x, int[][] y) {
		//���� �޼ҵ�, x,y ������ �迭�� �Ű������� �޴´�
		// TODO Auto-generated method stub
		int xRows=x.length;
		int xCols=x[0].length;
		int yRows=y.length;
		int yCols=y[0].length;
		//���� ��� ���� ������ ���� ����

		int [][]multi=new int[xRows][yCols];//���� ���ڸ� ������ ���ο� �迭 multi ����,�ʱ�ȭ
		for(int i=0; i<xRows; i++) {
			//�ݺ���(�� ����)
			for(int j=0; j<yCols; j++) {
				//�ݺ���(�� ����)-multi�� ����� �� ������ �ݺ���
				for(int z=0; z<xCols; z++) {
					//�ݺ���(�� ����)
					multi[i][j]+=x[i][z]*y[z][j];
				}
			}
		}
		return multi;//��� ����
	}


	// (2) ���� �޼ҵ� print�� �ۼ��Ͻÿ�.
	// ������ ���� �迭�� ǥ���� �ϳ��� ����� �Ű������� �޾� �� �ٿ� �� �྿ ���
	public static void print(int[][] z) {
		int rows=z.length;
		int cols=z[0].length;
		//��� �� ������ ���� ����
		for(int i=0; i<rows; i++) {
			//�ݺ���
		
			for(int j=0; j<cols; j++) {
				//����� ���
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}


}
