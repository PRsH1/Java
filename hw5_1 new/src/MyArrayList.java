
public class MyArrayList {
	//MyArrayList 클래스
	private int []array;//배열 array선언
	private int number;//필드 number 선언
	private int[] arr;//배열 꽉 찼을 경우에 복사할 배열 선언
	public MyArrayList() {
		//생성자
		array=new int[10];//array배열 크기 10으로 지정
		this.number=0;//number는 0
	}
	public boolean add(int n) {
		//add 메소드 매개변수 n
		if(number==array.length) {
			//만약 크기와 number가 같다면
			arr = new int[number*2];//arr의 크기를 number의 두배로
			for(int i=0; i<number; i++) {
				//배열 원소 복사
				arr[i]=array[i];
			}
			array=new int[arr.length];//array를 arr의 크기만큼 확장(2배)
			for(int i=0; i<number; i++) {
				//배열 원소 재복사
				array[i]=arr[i];
			}
			array[number]=n;//매개변수 n 배열에 삽입
			number+=1;//number 1증가
			return true;//true 리턴
		}
		else {
			//아니면
			array[number]=n;//n 배열에 삽입
			number+=1;//number 1증가
			return true;//true 리턴
		}
	
	}


	@Override
	public String toString() {
		StringBuffer buffer=new StringBuffer();//StringBuffer 클래스 생성
		//toString 메소드
		for(int i=0; i<number; i++) {
			//반복문
			buffer.append(array[i]+" ");//buffer에 리스트 숫자 append
		
		}
		return "list="+buffer;//buffer 반환
	}
	public int get(int index) {
		//get메소드

		return array[index];

	}
	public int size() {
		//크기 메소드
		return number;
	}
	public void add(int index,int n) {
		//인덱스 지정 추가 메소드
		int temp=array[number-1];//array[number-1]값 temp에 저장
		for(int j=number-1; j>index; j--) {

			array[j]=array[j-1];




		}
		number+=1;//number 1증가
		array[number-1]=temp;//array[number-1]에 temp값 삽입
		array[index]=n;//지정한 index에 n 삽입



	}
	public int remove(int index) {
		//인덱스 지정 삭제 메소드
		int temp=array[index];//array[index]값 temp에 저장
		for(int j=index;  j<number-1; j++) {
			array[j]=array[j+1];
		}
		number-=1;
		return temp;//temp리턴

	}



}
