
public class Car {


	public static  int speed=0;
	public static int max=100;
	public static void print() {
		System.out.println(speed);
		System.out.println(max);
		
	}
	public boolean ticket() {
		return(speed>max);
	}

}
