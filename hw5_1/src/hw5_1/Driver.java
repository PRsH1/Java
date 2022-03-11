package hw5_1;

public class Driver {


	public static void main(String[] args) {
		int result;
		int[] world=new int[10];
		for(int i=0; i<world.length; i++) {
			world[i]=i+10;

		}




		// TODO Auto-generated method stub
		System.out.println("hw5_1:이승현");//과제 코드와 이름 출력
		UserRank []u=new UserRank[5];
		for(int i=0; i<5; i++) {
			////(1) 회원 5명을 생성 - 회원 배열을 사용할 것
			u[i]=new UserRank();

		}


		for(int j=0; j<5; j++) {
			//반복문
			u[j].rankHold(j+1);//(2) 회원 5명의 등급을 1, 2, 3, 4, 5로 지정 
			u[j].pointReward();//(3) 회원 5명에게 포인트 지급 
			u[j].pointReward();//(4) 회원 5명에게 포인트 지급
			System.out.println(j+1+"번째 회원님의 할인율은 "+u[j].discountSearch()+"입니다");
			//(5) 회원 5명의 할인률을 조회하여 출력
		}
		System.out.println(worldSum(world));
	}
	private static int worldSum(int []array) {
		int result=0;

		for(int i=0; i<array.length; i++) {
			result = array[i];
		}
		return result;

	}
	
}