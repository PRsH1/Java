package lab14_1;

public class Main {
	public static void main(String[] args) {
		System.out.println("lab14_1: 이승현");

		int[] values = new int[] {1, 2, 3, -1}; 
		int sum = arraySum(values);   // (가) breakpoint 설정
		System.out.print("합은 ");
		System.out.println(sum);
	}

	private static int arraySum(int[] array) {
		int sum=0;
		for (int i = 0; i < array.length; i++) {  
			sum=sum+array[i];   // (나) 
		} 
		return sum;     // (다) breakpoint 설정 후 삭제
	}
}