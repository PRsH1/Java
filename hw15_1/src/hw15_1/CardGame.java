/*
 *���ϸ�:CardGame.java
 *�ۼ���:2017.06.16
 *�̸�:�̽���
 *����:�÷��ǰ� ���ʸ� ����
 */
package hw15_1;

import java.util.ArrayList;
import java.util.Collections;

// �ҽ��� �Է��ϰ� Ctrl+Shift+O�� ������ �ʿ��� ������ �����Ѵ�.

//ī�� �� ���� ǥ���ϴ� Ŭ���� Card
class Card {
	//ī�� Ŭ����
	private int number; // ī�� ��ȣ

	public Card(int number) {
		//������
		this.number = number;
	}
	public int getNumber() {
		//���� ���� �޼ҵ�
		return number;
	}
	public String toString() {
		return Integer.toString(number);
	}
}
class Deck {
	public static final int MAX_NUMBER = 50;
	private ArrayList<Card> deck = new ArrayList<Card>();

	// ī�带 �����Ͽ� ���� ����
	public Deck() {
		//������
		for (int i = 0; i < MAX_NUMBER; i++)
			deck.add(new Card(i));
	}

	// ī�带 ����
	public void shuffle() {
		//���� �޼ҵ�
		Collections.shuffle(deck);
	}

	// ���� �� �� ī�带 �����Ͽ� ����
	public Card deal() {
		return deck.remove(0);
	}
}
class Player {
	private ArrayList<Card> list = new ArrayList<Card>();

	public void getCard(Card card) {
		//ī�� �߰� �޼ҵ�
		list.add(card);
	}

	public void showCards() {
		//����Ʈ�� �ִ� ī�� �����ִ� �޼ҵ�
		System.out.println(list);
	}

	public int remove() {
		//ī�� ���� �޼ҵ�
		int i;
		int cardNum = 0;//ī�� ����Ʈ ��ȣ ������ ����
		int maxNum=0;

		for(i=0; i<list.size(); i++) {
			//�ݺ���
			if(maxNum<list.get(i).getNumber()) {
				//���� ����Ʈ�� �ִ� ī�尡 maxNum������ ũ�ٸ�
				maxNum=list.get(i).getNumber();//maxNum�� �� ����
				cardNum=i;//ī�� ����Ʈ number�� i����
			}
		}
		list.remove(cardNum);//����Ʈ�� �ִ� ī�� ��ȣ ����(�ִ밪 ī��)
		System.out.println(maxNum);//�ִ밪 ���
		return maxNum;//�ִ밪 ����
	}

}


public class CardGame {
	public static void main(String[] args) {
		System.out.println("hw15_1: �̽���\n");
		Deck deck = new Deck();//�� ��ü ����
		deck.shuffle();//���´�
		Player p1 = new Player();//p1��ü ����
		Player p2 = new Player();//p2��ü ����
		for(int i=0; i<5; i++) {
			//�ݺ���
			p1.getCard(deck.deal());//5���� ī�� �߰�
			p2.getCard(deck.deal());//5���� ī�� �߰�

		}
		System.out.println("p1�� p2�� ī�� ���");//�ȳ���
		//ī�� ����Ʈ�� ������
		p1.showCards();
		p2.showCards();
		System.out.println();
		System.out.println("p1�� p2�� �ִ� ī��");//�ȳ���
		if(p1.remove()>p2.remove()) {
			//�ִ� ī�尪 ��°� ���ÿ� �˻���
			System.out.println("p1 �¸�!\n");
		}
		else
			System.out.println("p2 �¸�!\n");
		//���� ī�� ����Ʈ ������
		System.out.println("p1�� p2�� ī�� ���");
		p1.showCards();
		p2.showCards();


	}

}