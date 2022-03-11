class A{
	public void f() {
		System.out.println("A");
	}
	public void g(A other) {
		System.out.println("X");
		f();
		other.f();
		
	}
}
class B extends A{
	@Override
	public void f() {
		System.out.println("B");
	}
	@Override
	public void g(A other) {
		System.out.println("Y");
		f();
		other.f();
	}
}












/*  4¹ø¹®Á¦
public class A {
}
class B extends A{
	
}
class C extends B{
	
}
class Box<T>{
	private T data;
	
}
class NewBox<T> extends Box<T>{
	
	
}
class S{
	public static void method1(Box<? extends B>b) {
		
	}
	public static void method2(Box<?> b) {
		
	}
	public static void method3(Box<B> b) {
		
	}
	public static <T extends B> void method4(T obj) {
		
	}
}
*/