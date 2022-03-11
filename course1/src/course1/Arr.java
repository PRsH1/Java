package course1;



import java.math.BigDecimal;//오차 없는 실수 표현을 위한 BigDecimal 클래스
import java.util.*;
public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[10];//배열 arr 10선언
		int search;//검색받을 정수 변수 선언
		System.out.println("lab1_2:이승현");
		Scanner input=new Scanner(System.in);//Scanner
		System.out.print("정수값 10개 입력:");
		for (int i=0; i<10; i++) {
			
			arr[i]=input.nextInt();
			
		}
		System.out.print("검색할 정수값 입력:");
		search=input.nextInt();
		for(int j=0; j<10; j++) {
			//반복문 j 0부터 9까지 j 1씩 올리며
			if(arr[j]!=search) {
				//j열의 수가 search(검색 정수)와 일치하지 않을 시
				if(j==9) {
					//만약 j값이 극값이 되면
					System.out.println("-1");//정수값 없음의 의미인 -1출력
					break;
					
				}
				continue;//반복
				
				
			}
			else if(arr[j]==search){
				//j열의 정수가 search(검색 정수)와 일치하면
				System.out.println("인덱스:"+j);//그 열의 값 출력
				break;
				
			}
	
		}
		double x=3.0;
		double y=2.345;
		//실수 3.0과 2.345의 합산
		double z=x+y;//결과값:5.345000000000001--> 미세한 오차 발생
		System.out.println(z);
		BigDecimal b1=new BigDecimal("3.0");
		BigDecimal b2=new BigDecimal("2.345");
		System.out.println(b1.add(b2));//결과 5.345
		//add를 쓰는이유:BigDecimal함수에 들어간 수는 문자취급함!

	}

}
