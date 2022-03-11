/*파일명:RandomWalk.java
 *작성일:2018-03-29
 *이름:이승현
 *내용:난수와 이차원 배열을 이용해 랜덤워크 만들어보기
 */



package hw4_2;



public class RandomWalk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0,y=0;
		System.out.println("hw4_2:이승현\n");//과제 코드와 나의 이름 출력

		int z=(int)(Math.random()*5);//난수 생성(0~4)
		int w=(int)(Math.random()*5);//난수 생성(0~4)
		System.out.println("출발=("+x+","+y+")");//출발값 출력
		System.out.println("목표=("+w+","+z+")");//도착값 출력
		boolean tile[][]=new boolean[5][5];//boolean형 2차원배열 tile생성 크기는 5 5
		int steps;//횟수를 저장할 변수 steps생성

		tile[0][0]=true;//타일 0 0값이 트루값이다
		System.out.print("이동 경로=("+x+","+y+")");//초기 이동 경로 출력
		for(steps=0; steps<20; steps++) {
			//반복문
			int direction=(int)(Math.random()*4);//direction(방향)정할 변수 생성 난수(0~3)(4방향)
			if(x==z&&y==w) {
				//만약 목표 난수값과 x y가 같다면
				System.out.println();//개행
				break;//탈출
			}
			if (direction==0 && x>0) //디렉션이 0 그리고 x>0이면
				x--;//x 1감소
			else if(direction==1 &&x<4)//디렉션이 1 x가 4미만이면
				x++;//x 1증가
			else if(direction==2 && y>0)//디렉션이 2 y가 0보다 크면
				y--;//y 1감소
			else if(y<4)//y가 4 미만이면
				y++;//y 1증가

			tile[y][x]=true;//현재 x y 배열 true값 지정
			if(steps==19)//횟수가 20회이면
				System.out.println("("+y+","+x+")");//출력 개행
			else if(x==z&&y==w)//목표값과 현재값이 같다면
				System.out.print("("+y+","+x+")");//출력


			else
				System.out.print("("+y+","+x+")");//이동경로 출력
		}
		System.out.println("----------");//구분선 출력
		for(int i=0; i<5; i++) {
			//반복문 
			for(int j=0; j<5; j++) {
				//반복문 중첩
				if(i==z && j==w)
					//조건이 맞으면
					System.out.print("G ");//G출력
				else if(i==0 && j==0)
					//i 그리고 j 가 0이면
					System.out.print("S ");//S출력
				else if(tile[j][i]==true)
					//tile의 [][]배열이 true값이면
					System.out.print("# ");//#출력


				else
					//아무 해당사항 없으면
					System.out.print(". ");//.출력
			}
			System.out.println();//개행
		}
		System.out.println("----------");//구분선 출력
		int result=steps+1;//횟수 결과 저장할 변수 result
		if (steps<19) {
			//최대 횟수에 도달하지 못했으면-성공했으면
			System.out.println("성공");//성공 안내문 출력
			System.out.println("총 시도 횟수:"+result);//횟수 결과 출력


		}
		else {
			//최대 횟수에 도달했으면
			System.out.println("실패");//실패 안내문 출력
		}



	}



}

