package mid1_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (1) �۱ݼ����� ���: 500�̶�� ���ͷ��� ������ �ȵ�
	      System.out.println(Account.FEE);


	      // (2) ������ ���¼� ���: 0�̶�� ���ͷ��� ������ �ȵ�
	      System.out.println(Account.getNumber());


	      // �ܾ��� 5000, 2000�� ���� ��ü a1, a2 ����
	      Account a1 = new Account(5000);
	      Account a2 = new Account(2000);

	      // a1���� a2�� 5000�� �۱� �õ� --> ����
	      boolean result = a1.transfer(a2, 5000);
	      System.out.println(result);    // false

	      // a1���� a2�� 4500�� �۱�
	      result = a1.transfer(a2, 4500);
	      System.out.println(result);    // true

	      // a1�� a2�� ���� ���� ���
	      System.out.println(a1);
	      System.out.println(a2);

	}

}