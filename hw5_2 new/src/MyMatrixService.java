
public class MyMatrixService {
	// (1) 정적 메소드 multiply를 작성하시오.
	// 이차원 정수 배열로 표현된 두개의 행렬을 매개변수로 받아 곱을 구해 결과를 이차원 정수 배열로 표현하여 리턴
	// 매개변수로 받은 두 행렬은 곱을 구하기에 타당한 크기라고 가정해도 됨

	public static int[][] multiply(int[][] x, int[][] y) {
		//곱셈 메소드, x,y 이차원 배열을 매개변수로 받는다
		// TODO Auto-generated method stub
		int xRows=x.length;
		int xCols=x[0].length;
		int yRows=y.length;
		int yCols=y[0].length;
		//각각 행과 열을 지정할 변수 설정

		int [][]multi=new int[xRows][yCols];//곱한 숫자를 저장할 새로운 배열 multi 생성,초기화
		for(int i=0; i<xRows; i++) {
			//반복문(행 증가)
			for(int j=0; j<yCols; j++) {
				//반복문(열 증가)-multi에 저장될 열 증가한 반복문
				for(int z=0; z<xCols; z++) {
					//반복문(열 증가)
					multi[i][j]+=x[i][z]*y[z][j];
				}
			}
		}
		return multi;//결과 리턴
	}


	// (2) 정적 메소드 print를 작성하시오.
	// 이차원 정수 배열로 표현된 하나의 행렬을 매개변수로 받아 한 줄에 한 행씩 출력
	public static void print(int[][] z) {
		int rows=z.length;
		int cols=z[0].length;
		//행과 열 지정할 변수 설정
		for(int i=0; i<rows; i++) {
			//반복문
		
			for(int j=0; j<cols; j++) {
				//결과문 출력
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}


}
