/**10번
public class main {

	public static void main(String[] args) {
		Employee[] array=new Employee[3];
		array[0]=new Employee(2000);
		array[1]=new Employee(1000);
		array[2]=new Manager(4000,100);
		for(int j=0; j<array.length; j++) {
			System.out.println(array[j].income());
		}


	}
}
class Employee{
	private int salary;
	public Employee(int salary) {
		this.salary=salary;
	}
	public int income() {
		return salary;
	}
}
class Manager extends Employee{
	private int bonus;

	public Manager(int salary,int bonus) {
		super(salary);
		this.bonus=bonus;
		// TODO Auto-generated constructor stub
	}
	@Override 
	public int income() {
		return super.income()+bonus;
	}

}
 **/
/**-9번문제
import java.io.IOException;

public class main {

	public static void main(String[] args) {
		byte[] buf=new byte[100];
		try {
			System.in.read(buf);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new String(buf));

	}
}
 **/
/** -8번문제
		// TODO Auto-generated method stub
		printResult((x,y)->{return x>y;});//람다식
		//printResult(new MyClass());//기본 호출자
		----
		printResult(new Checkable(){
			//무명 클래스
			@Override
			public boolean Check(int x, int y) {
				// TODO Auto-generated method stub
				return x>y;
			}
		});

		java.util.Scanner input=new java.util.Scanner(System.in);
        a=input.nextInt();
        System.out.println(a);
	}

	}




		private static void printResult(Checkable c) {
			// TODO Auto-generated method stub
			System.out.println(c.Check(1, 2));
		}

}
 **/
/**
class MyClass implements Checkable{

	@Override
	public boolean Check(int x, int y) {
		// TODO Auto-generated method stub
		return x>y;
	}

}
 **/






// 7번문제
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(2.0);
		Circle c2=new Circle(1.5);
		System.out.println(c1.equals(c2));
		System.out.println(c1.compareTo(c2));




	}

}
class Circle implements Comparable<Circle>{
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	@Override
	public int compareTo(Circle other) {
		if(radius>other.radius) {
			return 1;
		}
		else if (radius<other.radius) {
			return -1;
		}
		else
			return 0;

	}
	@Override
	public int hashCode() {
		return 0;

	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(getClass()!=obj.getClass()) {
			return false;
		}
		Circle other=(Circle)obj;
		if(radius!= other.radius) {
			return false;
		}
		return true;
	}

}