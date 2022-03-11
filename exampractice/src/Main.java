
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {-3,0};
		arrayAbs(a);
		System.out.println(a[0]+" "+a[1]);
		int []b= {4,-5,-1};
		arrayAbs(b);
		System.out.println(b[0]+" "+b[1]+" "+b[2]);
		
		

	}
	private static void arrayAbs(int[] a) {
		for(int i=0; i<a.length; i++) {
			if(a[i]<0)
				a[i]=-a[i];
			
			
		}
		
	}

}
