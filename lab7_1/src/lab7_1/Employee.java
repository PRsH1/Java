package lab7_1;

public class Employee {
	private int salary;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getTax() {
		return salary/10;
	}

}
