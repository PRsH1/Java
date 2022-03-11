package twoverlab1_2;

import java.util.*;
public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[10];
		int search;
		System.out.println("lab1_2:이승현");
		Scanner input=new Scanner(System.in);
		System.out.print("정수값 10개 입력:");
		for (int i=0; i<10; i++) {
			
			arr[i]=input.nextInt();
			
		}
		System.out.print("검색할 정수값 입력:");
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
				System.out.print("인덱스:"+j);
				break;
				
			}
	
		}

	}

}
