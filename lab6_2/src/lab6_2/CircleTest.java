package lab6_2;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_2:이승현\n");
		Circle c1=new Circle();
		Circle c2=new Circle(2.5);
		System.out.println("원의 반지름은"+c1.getRadius()+"입니다.");
		System.out.println("원의 반지름은"+c2.getRadius()+"입니다.");
		System.out.println("원의 면적은 "+c1.circleArea()+"입니다");
		System.out.println("원의 면적은 "+c2.circleArea()+"입니다");
		c1.setRadius(c2.getRadius());
		System.out.println("원의 반지름은"+c1.getRadius()+"입니다.");
		System.out.println("원의 반지름은"+c2.getRadius()+"입니다.");
		System.out.println("원의 면적은 "+c1.circleArea()+"입니다");
		System.out.println("원의 면적은 "+c2.circleArea()+"입니다");
		c2.setRadius(1.5);
		System.out.println("원의 면적은 "+c1.circleArea()+"입니다");
		System.out.println("원의 면적은 "+c2.circleArea()+"입니다");
		
		

	}

}
