package mid1_2;

public class Employee {
	private String name; // 이름
	private int hourlyRate; // 시급
	private int hours; // 시간(근무시간)

	// 이름, 시급, 시간을 매개변수로 받아 초기화하는 생성자
	public Employee(String name, int hourlyRate, int hours) {
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}

	// 이름을 매개변수로 받아 초기화하는 생성자
	public Employee(String name) {
		this(name, 9000, 10);
	}

	// 이름을 리턴하는 메소드
	public String getName() {
		return name;
	}

	// 봉급(시급 x 근무시간)을 계산하여 리턴하는 메소드
	public int getSalary() {
		return hourlyRate * hours;

	}
}