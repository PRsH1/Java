import java.util.*;
/*���ϸ�:SortTest.java,MyIntegerSort.java
 *�ۼ���:2018.12.08
 *�ۼ���:�̽���
 *����:���� ������ �̿��� ������ ����
 */
public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw11_1:�̽���");
		Scanner input=new Scanner(System.in);
		System.out.print("���� ���� �Է�:");
		int number=input.nextInt();
		int array[]=new int[number];
		System.out.print(number+"���� ���� �Է�:");
		for(int i=0; i<number; i++) {
			array[i]=input.nextInt();		
		}
		System.out.print("���� �� �迭=");
		for(int j=0; j<number; j++) {
			System.out.print(array[j]+" ");
		}
		System.out.println();
		
		MyIntegerSort.mergeSort(array);
	}

}
