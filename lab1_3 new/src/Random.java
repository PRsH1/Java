
public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []number=new int[10];
		int one=0;
		int two=0;
		int three=0;
		int four=0;
		System.out.println("lab1_3:�̽���");
		System.out.print("���� �ѹ� =");
		for(int i=0; i<10; i++) {
			number[i]=(int) (Math.random()*4+1);
			System.out.print(" "+number[i]);
			switch(number[i]) {
			case 1:
				one+=1;
				break;
			case 2:
				two+=1;
				break;
			case 3:
				three+=1;
				break;
			case 4:
				four+=1;
				break;
			}
			
		}
		System.out.println("\n1�� ���� ="+one);
		System.out.println("2�� ���� ="+two);
		System.out.println("3�� ���� ="+three);
		System.out.println("4�� ���� ="+four);

	}

}
