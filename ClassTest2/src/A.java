
public class A {
	int a=50;
	class C{
		void method1(){
			System.out.println(a+1);
		}
	}

	void method1(){
		class B{
			void method1(){
				System.out.println(a+2);
			}
		}
		B obj1=new B();
		C obj2=new C();
		obj1.method1();
		obj2.method1();
	}
}


