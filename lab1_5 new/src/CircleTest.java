
public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1=new Circle();//Circle객체 1 생성
		circle1.setRadius(2);//set메소드 호출
		Circle circle2=new Circle((int) (Math.random()*4+1));
		//Circle객체 2 생성,생성자 랜덤으로 초기화
		System.out.println("lab1_5:이승현");//과제코드 이름 출력
		System.out.println(circle1.toString());//toString메소드 호출
		System.out.println(circle2.toString());//toString메소드 호출
		System.out.println(circle1.equals(circle2));//equals메소드 호출
		System.out.println(circle1.hashCode());//헤쉬 메소드 호출
		System.out.println(circle2.hashCode());//해쉬코드 메소드 호출
		System.out.println(circle1.area());//면적 메소드 호출
		System.out.println(circle2.area());//면적 메소드 호출

	}

}
