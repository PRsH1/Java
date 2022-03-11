package midNew;

public class MyListTest {
	public static void main(String[] args) {
		System.out.println("mid : 이승현 ");

		MyList list=new MyList();// (1) 비어있는 리스트인 MyList 객체를 생성




		for(int i=1; i<101; i++) {
			list.addFirst(i);
		}// (2) 1부터 100까지 차례대로 리스트의 맨 앞에 삽입(addFirst 호출)




		System.out.println("합="+list.getSum());// (3) 리스트의 원소 합을 구하여(getSum 호출) 출력



	}
}