
import java.util.Scanner;//스캐너 라이브러리 import
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_4:이승현");
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 개수 입력:");
		//입력 안내문
		int n=scan.nextInt();
		int []n2=new int[n];//정수 개수를 배열 개수로 맞춰줌
		System.out.print(n+"개의 정수를 입력");
		for(int i=0; i<n; i++) {
		//반복문
			
			n2[i]=scan.nextInt();//n2배열에 숫자 저장
		}
		System.out.println("평균="+getAverage(n2));//결과문 출력,메소드 호출
		

	}
	public static double getAverage(int []arr) {
		//getAverage메소드,배열 매게변수
		double sum = 0;//더한 값 정의
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];//배열 인덱스에 저장되어 있는 값 sum에 더해줌
		}
		return sum/arr.length;//결과값 반환
		
	}

}
