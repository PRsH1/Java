import java.util.*;
/*파일명:SortTest.java,MyIntegerSort.java
 *작성일:2018.12.08
 *작성자:이승현
 *주제:병합 정렬을 이용한 숫자의 정렬
 */
public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw11_1:이승현");
		Scanner input=new Scanner(System.in);
		System.out.print("정수 갯수 입력:");
		int number=input.nextInt();
		int array[]=new int[number];
		System.out.print(number+"개의 정수 입력:");
		for(int i=0; i<number; i++) {
			array[i]=input.nextInt();		
		}
		System.out.print("정렬 전 배열=");
		for(int j=0; j<number; j++) {
			System.out.print(array[j]+" ");
		}
		System.out.println();
		
		MyIntegerSort.mergeSort(array);
	}

}
