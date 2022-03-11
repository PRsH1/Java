

public class MyArrayList {
	//MyArrayList 클래스
	private int []array;//배열 array선언
	private int number;//필드 number 선언
	public MyArrayList() {
		//생성자
		array=new int[10];//array배열 크기 10으로 지정
		this.number=0;//number는 0
	}
	public boolean add(int n) {
		//add 메소드 매개변수 n
		if(number==array.length)
			//만약 크기와 number가 같다면
			return false;//false 리턴
		else {
			//아니면
			array[number]=n;//n 배열에 삽입
			number+=1;//number 1증가

			return true;//true 리턴
		}


	}


	@Override
	public String toString() {
		//toString 메소드
		String str = "";//문자열 저장할 변수 선언
		for(int i=0; i<number; i++) {
			//반복문
			str+=array[i]+" ";//문자열 str에 배열에 저장된 변수 더함
		}
		return "list="+str;//str반환
	}



}




