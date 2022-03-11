package testexper;

public class TestExperience {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=4;
		double d=3.14E-2;
		System.out.println(a<<2);
		System.out.println(++b==4);
		System.out.println(b);
		System.out.println(d);
		String e=3+4+"5";
		System.out.println(e);
		int f=0b101;
		int g=3;
		System.out.println(f);
		System.out.println(f&g);
		int h=3;
		System.out.println((h>3)?"a":"b");
		String j=new String ("12");
		String k=new String("abcde");
		System.out.println(k.toUpperCase());
		System.out.println(k.charAt(0));
		int [][] array= {{1,2,3,4,5},{10,20,30}};
		System.out.println(array.length);
		System.out.println(array[0].length);
		System.out.println(array[1].length);
		int []values=array[0];
		array[0][0]=9;
		System.out.println(values.length);
		System.out.println(values[0]);
		values=array[1];
		System.out.println(values[1]);
		String s1=new String("abc");
		String s2=new String("a");
		System.out.println(s1.charAt(1));
		System.out.println(s1.concat(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		int x=5;
		int y=8;
		System.out.println((x<<3)+(y>>3));
		System.out.println(x);
		System.out.println(y);
		int z=5;
		int w=8;
		System.out.println(++z*w--);
		System.out.println(z);
		System.out.println(w);
		int m=3;
		int n=0;
		System.out.println(m>0 || ++n>0);
		System.out.println(m>0&&n>0);
		double k1=3.1;
		k1*=2;
		System.out.println((int)k1);
		System.out.println(k1);
		int h1=(-1>0)?2:4;
		String s ="S";
		switch(h1) {
		case 1: case 2:
			s=s+"A";
		case 3: case 4:
			s=s+"B";
		default:
			s=s+"C";
			
		}
		System.out.println(s);

	}

}
