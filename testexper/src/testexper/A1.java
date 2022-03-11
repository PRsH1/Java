package testexper;

public class A1 {
	private B b;
	public  A1(B b) {
		System.out.println("1");
		this.b=b;
	}
	public void print() {
		System.out.println("2");
		b.print();
	}

}
