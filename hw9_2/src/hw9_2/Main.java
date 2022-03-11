/*
 * ���ϸ�:Main.java
 *�ۼ���:2017.05.26
 *�̸�:�̽���
 *����:���� Ŭ���� ����
 */



package hw9_2;

class Student {
	//�л� Ŭ����
	//���̿� ���� �ʵ�
	int age;
	int score;
}

@FunctionalInterface
interface Tester {
	//Tester�������̽�
	boolean test(Student s);//�߻� �޼ҵ�
}

public class Main {
	//���� Ŭ����
	public static void check(Student s, Tester t) {
		//check ���� �޼ҵ�
		boolean result = t.test(s);
		System.out.println(result);//��� ���
	}

	public static void main(String... args) {
		System.out.println("hw9_2: �̽���");//�����ڵ� ���

		Student kim = new Student();//�л� ��ü kim����
		kim.age = 19;
		kim.score = 80;

		Tester passTester=new Tester() {
			//���� Ŭ���� ��� passTester
			@Override
			public boolean test(Student s) {
				//test�޼ҵ� �������̵�
				return s.score >= 60;//boolean �� ��ȯ
			}
		};

		Tester AdultTester=new Tester() {
			//���� Ŭ���� ��� adultTester
			@Override
			public boolean test(Student s) {
				//test�޼ҵ� �������̵�
				return s.age >= 20;//boolean �� ��ȯ
			}   
		};
		Main m1=new Main();//���� Ŭ���� ��ü m1����
		m1.check(kim, passTester);
		m1.check(kim, AdultTester);
	}
}