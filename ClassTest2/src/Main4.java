
import java.util.Scanner;
public class Main4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Flight ke22=new Flight("����","����", 100);
		Flight oz33=new Flight("����","����",200);
		ke22.book(90);
		ke22.transfer(oz33, scan.nextInt());
		System.out.println("From: "+ke22.getDepature());
		System.out.println("To: "+ke22.getArrive());
		System.out.println("�ܿ��¼�: "+ke22.available());

	}

}
