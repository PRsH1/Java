package midNew;

public class MyListTest {
	public static void main(String[] args) {
		System.out.println("mid : �̽��� ");

		MyList list=new MyList();// (1) ����ִ� ����Ʈ�� MyList ��ü�� ����




		for(int i=1; i<101; i++) {
			list.addFirst(i);
		}// (2) 1���� 100���� ���ʴ�� ����Ʈ�� �� �տ� ����(addFirst ȣ��)




		System.out.println("��="+list.getSum());// (3) ����Ʈ�� ���� ���� ���Ͽ�(getSum ȣ��) ���



	}
}