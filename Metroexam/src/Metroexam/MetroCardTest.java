package Metroexam;

public class MetroCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetroCard card=new MetroCard(2500);
		card.ride();
		card.ride();
		card.ride();
		System.out.println(card.getBalance());
		card.charge(3000);
		System.out.println(card.getBalance());

	}

}
