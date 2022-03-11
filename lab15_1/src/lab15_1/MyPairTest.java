package lab15_1;

public class MyPairTest {

	public static void main(String[] args) {
		System.out.println("lab15_1: �̽���");

		// ���ڿ��� ��/�� ���ҷ� ���� MyPair ��ü pair�� ����
		MyPair<String> pair = new MyPair<String>("Seoul", "Pusan");
		MyPair<Student> studentPair=new MyPair<Student>(new Student("kim"),new Student("park"));
		Integer i1=new Integer(11);
		Integer i2=new Integer(22);
		MyPair<Integer>integerPair=new MyPair<Integer>(i1, i2);
		

		// �� ���Ҹ� ������ ���� �� ���
		String master = pair.getMaster();
		System.out.println(master + "��");

		// pair�� ���
		System.out.println(pair);

		// pair�� ��/�� ���Ҹ� ��ȯ
		pair.swap();

		// pair�� ���
		System.out.println(pair);
		
		System.out.println();
		System.out.println(studentPair);
		studentPair.swap();
		System.out.println(studentPair);
		System.out.println();
		System.out.println(integerPair);
		integerPair.swap();
		System.out.println(integerPair);
		
		
	}
}


// String�� ��/�� ���Ҹ� �����ϴ� Ŭ����
class MyPair<T> {
	private T master; // �� ����
	private T slave; // �� ����

	public MyPair(T master, T slave) { // ������
		this.master = master;
		this.slave = slave;
	}

	public void swap() {  //  ��/�� ���Ҹ� ��ȯ�ϴ� �޼ҵ�

		T temp;
		temp=master;
		master=slave;
		slave=temp;// ... (��)



	}

	public T getMaster() {
		return master;
	}

	public T getSlave() {
		return slave;
	}

	@Override
	public String toString() { 
		return "��=" + master + " ��=" + slave;
	}
}


class Student {
	private String name;
	public Student(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}

