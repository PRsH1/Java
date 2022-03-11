
public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDoublyLinkedList list=new MyDoublyLinkedList();
		System.out.println("lab6_2:ÀÌ½ÂÇö");
		System.out.println(list.toString());
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		list.addLast(12);
		System.out.println(list.toString());
		list.printList();
		System.out.println(list.size());
		list.remove(123);
		System.out.println(list.toString());

	}

}
