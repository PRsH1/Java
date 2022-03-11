
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[]array=new Circle[3];
		array[0]=new Circle(2.0);
		array[1]=new Circle(2.0);
		array[2]=new Circle(1.0);
		System.out.println(areaSum(array));
		System.out.println(minArea(array));

	}
	private static  double areaSum(Circle[] array) {
		double result = 0;
		for(int i=0; i<array.length; i++) {
			result+=array[i].getArea();
			
		}
		return result;
	}
	private static double minArea(Circle[] array) {
		double result=3.14;
		return result;
		
	}

}
