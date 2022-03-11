package extendsExper;

public class ExtendsExper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Dog();//상향 형변환
		Dog dog=(Dog)animal;//하향 형변환
		Point p1=new Point(2,3);
		Point p2=new Point(2,3);
		System.out.println(p1.equals(p2));
		//Animal animal=dog;

	}


}
class Animal{
	
}
class Dog extends Animal{
	
}
class Point{
	private int x,y;
	public Point (int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override 
	public boolean equals(Object obj) {
		Point other=(Point)obj;
		return x==other.x && other.y==y;
	}
}