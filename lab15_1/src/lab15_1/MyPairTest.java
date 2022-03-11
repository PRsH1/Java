package lab15_1;

public class MyPairTest {

	public static void main(String[] args) {
		System.out.println("lab15_1: 이승현");

		// 문자열을 주/종 원소로 갖는 MyPair 객체 pair를 생성
		MyPair<String> pair = new MyPair<String>("Seoul", "Pusan");
		MyPair<Student> studentPair=new MyPair<Student>(new Student("kim"),new Student("park"));
		Integer i1=new Integer(11);
		Integer i2=new Integer(22);
		MyPair<Integer>integerPair=new MyPair<Integer>(i1, i2);
		

		// 주 원소를 변수에 저장 후 출력
		String master = pair.getMaster();
		System.out.println(master + "팀");

		// pair를 출력
		System.out.println(pair);

		// pair의 주/종 원소를 교환
		pair.swap();

		// pair를 출력
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


// String형 주/종 원소를 저장하는 클래스
class MyPair<T> {
	private T master; // 주 원소
	private T slave; // 종 원소

	public MyPair(T master, T slave) { // 생성자
		this.master = master;
		this.slave = slave;
	}

	public void swap() {  //  주/종 원소를 교환하는 메소드

		T temp;
		temp=master;
		master=slave;
		slave=temp;// ... (가)



	}

	public T getMaster() {
		return master;
	}

	public T getSlave() {
		return slave;
	}

	@Override
	public String toString() { 
		return "주=" + master + " 종=" + slave;
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

