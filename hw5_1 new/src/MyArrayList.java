
public class MyArrayList {
	//MyArrayList Ŭ����
	private int []array;//�迭 array����
	private int number;//�ʵ� number ����
	private int[] arr;//�迭 �� á�� ��쿡 ������ �迭 ����
	public MyArrayList() {
		//������
		array=new int[10];//array�迭 ũ�� 10���� ����
		this.number=0;//number�� 0
	}
	public boolean add(int n) {
		//add �޼ҵ� �Ű����� n
		if(number==array.length) {
			//���� ũ��� number�� ���ٸ�
			arr = new int[number*2];//arr�� ũ�⸦ number�� �ι��
			for(int i=0; i<number; i++) {
				//�迭 ���� ����
				arr[i]=array[i];
			}
			array=new int[arr.length];//array�� arr�� ũ�⸸ŭ Ȯ��(2��)
			for(int i=0; i<number; i++) {
				//�迭 ���� �纹��
				array[i]=arr[i];
			}
			array[number]=n;//�Ű����� n �迭�� ����
			number+=1;//number 1����
			return true;//true ����
		}
		else {
			//�ƴϸ�
			array[number]=n;//n �迭�� ����
			number+=1;//number 1����
			return true;//true ����
		}
	
	}


	@Override
	public String toString() {
		StringBuffer buffer=new StringBuffer();//StringBuffer Ŭ���� ����
		//toString �޼ҵ�
		for(int i=0; i<number; i++) {
			//�ݺ���
			buffer.append(array[i]+" ");//buffer�� ����Ʈ ���� append
		
		}
		return "list="+buffer;//buffer ��ȯ
	}
	public int get(int index) {
		//get�޼ҵ�

		return array[index];

	}
	public int size() {
		//ũ�� �޼ҵ�
		return number;
	}
	public void add(int index,int n) {
		//�ε��� ���� �߰� �޼ҵ�
		int temp=array[number-1];//array[number-1]�� temp�� ����
		for(int j=number-1; j>index; j--) {

			array[j]=array[j-1];




		}
		number+=1;//number 1����
		array[number-1]=temp;//array[number-1]�� temp�� ����
		array[index]=n;//������ index�� n ����



	}
	public int remove(int index) {
		//�ε��� ���� ���� �޼ҵ�
		int temp=array[index];//array[index]�� temp�� ����
		for(int j=index;  j<number-1; j++) {
			array[j]=array[j+1];
		}
		number-=1;
		return temp;//temp����

	}



}
