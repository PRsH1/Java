package lab7_2;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnderGraduateStudent s1=new UnderGraduateStudent(11, 1.5);
		GraduateStudent g1=new GraduateStudent(222,1.5);
		System.out.println("lab7_2:ÀÌ½ÂÇö");
		System.out.println(s1.getId()+" "+s1.getScore()+" "+s1.warning());
		System.out.println(g1.getId()+" "+g1.getScore()+" "+g1.warning());

	}

}
