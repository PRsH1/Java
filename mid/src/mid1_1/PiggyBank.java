package mid1_1;

public class PiggyBank {
	// (1) 2���� private �ʵ� :
	//    500�� ����(������)�� 100�� ����(������)
	private int one;
	private int five;




	// (2) 500�� ����, 100�� ������ �Ű������� �޾�
	//    �ʱ�ȭ �ϴ� ������
	public PiggyBank(int five,int one){
		this.one=one;
		this.five=five;

	}




	// (3) add() - 500�� ����, 100�� ������ �Ű������� �޾�
	//     �����ϴ� �޼ҵ�
	public void add(int five,int one) {
		this.one=this.one+one;
		this.five+=five;
	}




	// (4) open() -������������ ���� ���ݾ��� �����ϴ� �޼ҵ�
	//     �������� ���� ���� ���� ������ ��� 0�� �ȴ�.
	public int open() {
		int sum=0;
		sum=five*500+one*100;
		five=0;
		one=0;
		return sum;


	}


}
