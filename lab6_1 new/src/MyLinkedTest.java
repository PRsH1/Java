
public class MyLinkedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab6_1:ÀÌ½ÂÇö");
		MyLinkedList list=new MyLinkedList();
		System.out.println(list.toString());
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		list.addLast(7);
		System.out.println(list.toString());
		System.out.println(list.getSum());
		System.out.println(list.size());
		list.removeFirst();
		System.out.println(list.toString());
		System.out.println(list.size());
		list.removeLast();
		System.out.println(list.toString());
	}

}
