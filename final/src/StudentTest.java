class Student{
	private int math;
	public Student(int math) {
		this.math=math;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math=math;
	}
	@Override
	public String toString() {
		return "Student [math=" + math + "]";
	}
	public boolean isPass() {
		return math>=60;
	}

}
class SwStudent extends Student{
	private int java;

	public SwStudent(int math,int java) {
		super(math);
		this.java=java;
		// TODO Auto-generated constructor stub
	}
	public int getJava() {
		return java;
	}
	public void setMath(int java) {
		this.java=java;
	}
	@Override
	public String toString() {
		return "SwStudent [java=" + java + ", getMath()=" + getMath() + "]";
	}
	@Override
	public boolean isPass() {
		return super.getMath()>=60 && java>=60;
	}
}
public class StudentTest {

	public static void main(String[] args) {
		System.out.println("final: ÀÌ½ÂÇö");
		// TODO Auto-generated method stub
		Student [] std=new Student[4];
		std[0]=new Student(60);
		std[1]=new Student(50);
		std[2]=new SwStudent(60,70);
		std[3]=new SwStudent(60,50);
		for(int i=0; i<std.length; i++) {
			
			System.out.println(std[i].isPass());
		}

	}

}
