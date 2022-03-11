package testexper;

public class TestClassExperience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A();
		a1.x=3;
		A a2=a1;
		System.out.println(a1.x);
		System.out.println(a2.x);
		a1=new A();
		a2.x=5;
		System.out.println(a1.x);
		System.out.println(a2.x);

	}

}
