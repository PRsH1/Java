

public class MyArrayList {
	//MyArrayList Ŭ����
	private int []array;//�迭 array����
	private int number;//�ʵ� number ����
	public MyArrayList() {
		//������
		array=new int[10];//array�迭 ũ�� 10���� ����
		this.number=0;//number�� 0
	}
	public boolean add(int n) {
		//add �޼ҵ� �Ű����� n
		if(number==array.length)
			//���� ũ��� number�� ���ٸ�
			return false;//false ����
		else {
			//�ƴϸ�
			array[number]=n;//n �迭�� ����
			number+=1;//number 1����

			return true;//true ����
		}


	}


	@Override
	public String toString() {
		//toString �޼ҵ�
		String str = "";//���ڿ� ������ ���� ����
		for(int i=0; i<number; i++) {
			//�ݺ���
			str+=array[i]+" ";//���ڿ� str�� �迭�� ����� ���� ����
		}
		return "list="+str;//str��ȯ
	}



}




