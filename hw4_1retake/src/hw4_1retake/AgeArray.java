/*
* 파일명:AgeArray.java
 *작성일:2017.03.22
 *이름:이승현
 *내용:배열과 반복문을 이용한 값 배정과 출력
 */





package hw4_1retake;

import java.util.Scanner;//스캐너 라이브러리 import
public class AgeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw4_1:이승현\n");//코드와 이름 출력
		int lowerage;//나이 하한 입력받는 변수 선언
		int upperage;//나이 상한 입력받는 변수 선언
		int stnum=0;//학생 숫자 입력받는 변수 선언 0으로 초기화
		int z=0;//반복문 돌릴 변수 z 선언

		int i=0;//반복문 돌릴 변수 i 선언

		Scanner input=new Scanner(System.in);//스캐너 라이브러리 input으로
		System.out.print("나이 하한 입력:");//하한 입력 안내문 출력
		lowerage=input.nextInt();//나이 하한을 입력받는다
		int lowernum=lowerage;//하한의 반복문 돌릴 변수 선언
		int lowernum2=lowerage;//이하 동일
		System.out.print("나이 상한 입력:");//상한 입력 안내문 출력
		upperage=input.nextInt();//상한 입력받는다
		System.out.print("학생 수 입력:");//학생 수 입력 안내문 출력
		stnum=input.nextInt();//학생 수 입력받는다
		int []agearr=new int[upperage-lowerage+1];//나이를 저장할 배열 선언
		int []stunum=new int[upperage-lowerage+1];//학생 수를 저장할 배열 선언
		while(lowernum<=upperage) {
			//반복문
			agearr[z]=lowernum;//0번째 요소부터 나이값을 넣는다
			lowernum+=1;//1 증가
			z++;// 1 증가
		}
		while(i<stnum) {
			System.out.print("나이 입력:");//나이 입력 안내문 출력
			int age=input.nextInt();//나이를 입력받는다
			if(lowerage>age || upperage<age) {
				//만약 상한과 하한 범위를 벗어나면
				System.out.print("범위를 벗어났습니다. 다시 입력하세요.\n");//오류 메세지 출력
				continue;//다시 입력받는다
			}

			else {
				//범위를 만족하면
				for (int x=0; x<=upperage-lowernum2; x++) {
					//반복문
					if (agearr[x]==age){
						//만약 입력받은 나이 값과 배열 나이 값이 같다면
						stunum[x]++;//x번째 요소에 1을 더한다
						break;//탈출
					}
				}
				i++;
			}

		}
		System.out.print("나이  학생수\n");//결과문 출력
		for (int y=0; y<agearr.length; y++ ) {
			//반복문
			System.out.println(agearr[y]+" "+stunum[y]);//배열 원소들 출력
		}




	}

}
