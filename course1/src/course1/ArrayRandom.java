package course1;

public class ArrayRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []number=new int[10];//정수 배열 number 선언 배열 자리수는 10
		int min;//최소값
		int index = 0;//인덱스
		int indexzero;//나중에 변경할 값을 저장하는 인덱스의 값
		System.out.println("course 1:이승현");
		for(int i=0; i<10; i++) {
			number[i]=(int) (Math.random()*101);//반복문을 돌면서 각 배열의 인덱스에 1~100까지 랜덤한 값 부여
			System.out.print(number[i]+" ");//랜덤하게 부여한 정수들 출력
		}
		indexzero=number[0];//0번째 자리에 최소값이 들어가야 하므로 미리 indexzero에 number[0]값 저장해둠
		min=number[0];//처음 최소값은  number배열의 첫 인덱스
		for(int j=0; j<10; j++) {
			if(number[j]<min) {
				//만약 최소값이 현재 인덱스의 값 보다 크다면
				if(number[j]==min) {
					//그런데 그 인덱스의 값이 최소값이랑 동일할 경우
					continue;//돌아가
				}
				else {
					//아니면
				min=number[j];//최소값을 현재 인덱스 값으로 대치
				number[0]=number[j];//배열의 첫번째 값은 현재 인덱스 값으로 대치,가장 최소값을 배열 앞에다 두는 용도
				index=j;//index를 j의 값으로 대치
				}
			}
			
				
			
		}
		number[index]=indexzero;//원래 최소값이 들어있던 인덱스의 값은 처음에 지정해두었던 indexzero의 값으로 대치
		
		System.out.println("\n최소값:"+min);
		System.out.println("최소값 인덱스:"+index+"\n");
		for(int x=0; x<10; x++) {
			System.out.print(number[x]+" ");
		}
		
		

	}

}
