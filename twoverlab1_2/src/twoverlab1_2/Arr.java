package twoverlab1_2;

import java.util.*;
public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[10];
		int search;
		System.out.println("lab1_2:�̽���");
		Scanner input=new Scanner(System.in);
		System.out.print("������ 10�� �Է�:");
		for (int i=0; i<10; i++) {
			
			arr[i]=input.nextInt();
			
		}
		System.out.print("�˻��� ������ �Է�:");
		search=input.nextInt();
		for(int j=0; j<10; j++) {
			if(arr[j]!=search) {
				if(j==9) {
					System.out.println("-1");
					break;
					
				}
				continue;
				
				
			}
			else if(arr[j]==search){
				j+=1;
				System.out.print("�ε���:"+j);
				break;
				
			}
	
		}

	}

}
