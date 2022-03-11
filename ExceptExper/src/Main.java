import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result,x=6,y=0;
		try {
			System.out.println("A");
			result=x/y;
			System.out.println("B");


		}catch(ArithmeticException e) {
			result=1;
			System.out.println("C");
		}
		System.out.println(result);
		division(6,0);

		/**
		f();
		System.out.println("bye");

	}

	private static void f() {
		// TODO Auto-generated method stub
		try {
			A.g();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
class A{
	public static void g() throws FileNotFoundException {
		PrintWriter out=new PrintWriter("Outfile.txt");
		out.print(123);
		if(out!=null)out.close();
	}
}
		 **/
	}
	public static void division(int a,int b) {
		try {
			if(b==0) {

				throw new MyException();
			}
			System.out.println(a/b);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class MyException extends Exception{
	public MyException(){
		super("0 나누기 예외");
	}
}