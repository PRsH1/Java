/*
 *파일명:CardGame.java
 *작성일:2017.06.16
 *이름:이승현
 *내용:컬렉션과 제너릭 연습
 */
package hw15_1;

import java.util.ArrayList;
import java.util.Collections;

// 소스를 입력하고 Ctrl+Shift+O를 눌러서 필요한 파일을 포함한다.

//카드 한 장을 표현하는 클래스 Card
class Card {
	//카드 클래스
	private int number; // 카드 번호

	public Card(int number) {
		//생성자
		this.number = number;
	}
	public int getNumber() {
		//숫자 리턴 메소드
		return number;
	}
	public String toString() {
		return Integer.toString(number);
	}
}
class Deck {
	public static final int MAX_NUMBER = 50;
	private ArrayList<Card> deck = new ArrayList<Card>();

	// 카드를 생성하여 덱에 넣음
	public Deck() {
		//생성자
		for (int i = 0; i < MAX_NUMBER; i++)
			deck.add(new Card(i));
	}

	// 카드를 섞음
	public void shuffle() {
		//셔플 메소드
		Collections.shuffle(deck);
	}

	// 덱의 맨 앞 카드를 제거하여 리턴
	public Card deal() {
		return deck.remove(0);
	}
}
class Player {
	private ArrayList<Card> list = new ArrayList<Card>();

	public void getCard(Card card) {
		//카드 추가 메소드
		list.add(card);
	}

	public void showCards() {
		//리스트엥 있는 카드 보여주는 메소드
		System.out.println(list);
	}

	public int remove() {
		//카드 삭제 메소드
		int i;
		int cardNum = 0;//카드 리스트 번호 저장할 변수
		int maxNum=0;

		for(i=0; i<list.size(); i++) {
			//반복문
			if(maxNum<list.get(i).getNumber()) {
				//만약 리스트에 있는 카드가 maxNum값보다 크다면
				maxNum=list.get(i).getNumber();//maxNum에 값 저장
				cardNum=i;//카드 리스트 number에 i저장
			}
		}
		list.remove(cardNum);//리스트에 있는 카드 번호 삭제(최대값 카드)
		System.out.println(maxNum);//최대값 출력
		return maxNum;//최대값 리턴
	}

}


public class CardGame {
	public static void main(String[] args) {
		System.out.println("hw15_1: 이승현\n");
		Deck deck = new Deck();//덱 객체 생성
		deck.shuffle();//섞는다
		Player p1 = new Player();//p1객체 생성
		Player p2 = new Player();//p2객체 생성
		for(int i=0; i<5; i++) {
			//반복문
			p1.getCard(deck.deal());//5개의 카드 추가
			p2.getCard(deck.deal());//5개의 카드 추가

		}
		System.out.println("p1과 p2의 카드 목록");//안내문
		//카드 리스트를 보여줌
		p1.showCards();
		p2.showCards();
		System.out.println();
		System.out.println("p1과 p2의 최대 카드");//안내문
		if(p1.remove()>p2.remove()) {
			//최대 카드값 출력과 동시에 검사함
			System.out.println("p1 승리!\n");
		}
		else
			System.out.println("p2 승리!\n");
		//현재 카드 리스트 보여줌
		System.out.println("p1과 p2의 카드 목록");
		p1.showCards();
		p2.showCards();


	}

}