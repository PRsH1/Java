/*
 * ���ϸ�: MyTreeMap2Test.java
 * �ۼ���: 2018.11.27
 * �ۼ���: ȫ�浿
 * ����: String-String ���� �����ϴ� ����Ž��Ʈ���� �����ϰ� ������ �����ϴ� ���α׷�
 */

public class MyTreeMap2Test {
	public static void main(String[] args) {

		System.out.println("course11 : �̽���");

		// ���� ����Ž��Ʈ�� tree�� ����
		MyTreeMap2 tree = new MyTreeMap2();

		// ���� tree���� key ���� �ش��ϴ� value�� ��ȸ
		System.out.println("kim=" + tree.get("kim"));
		System.out.println();

		// tree�� key-value ���� ����  
		tree.put("kim", "Seoul");
		tree.put("park", "Pusan");
		tree.put("choi", "Incheon");
		tree.put("hong", "Seoul");
		tree.put("seo", "Pusan");
		tree.put("lee", "Suwon");
		tree.put("kim", "Jeju");

		// tree���� key ���� �ش��ϴ� value�� ��ȸ
		System.out.println("kim=" + tree.get("kim"));
		System.out.println("park=" + tree.get("park"));
		System.out.println("choi=" + tree.get("choi"));
		System.out.println("hong=" + tree.get("hong"));
		System.out.println("seo=" + tree.get("seo"));
		System.out.println("lee=" + tree.get("lee"));   
	}
}


/*
 * ���ϸ�: MyTreeMap2.java
 * �ۼ���: 2018.11.27
 * �ۼ���: ȫ�浿
 * ����: String-String ���� �����ϴ� �����ϴ� ����Ž��Ʈ���� �����ڷᱸ���� ������ Ŭ����
 */

class MyTreeMap2 {
	// Ʈ���� ��带 ǥ���ϴ� private Ŭ���� Node
	private class Node {
		String key;
		String value;
		Node leftChild = null;
		Node rightChild = null;
		Node(String key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	// private �ν��Ͻ� ���� Ʈ���� ��Ʈ ��带 ��ų ����(root)�� �����ϰ� null�� �ʱ�ȭ
	private Node root = null;


	// Ű�� key�� �ش��ϴ� value�� �����ϰ�, key ���� ã�� ���ϸ� null�� �����ϴ� �޼ҵ�(�ݺ� �˰���)
	/***
	public String get(String key) {
		Node p = root;
		while(p != null) {
			if(key.compareTo(p.key) < 0)
				p = p.leftChild;
			else if(key.compareTo(p.key) > 0)
				p = p.rightChild;
			else
				return p.value;
		}
		return null;

	}
	 ***/
	// (1) ���� get �޼ҵ� ���, ��� �˰����� �̿��� get �޼ҵ带 �ۼ��Ͻÿ�.(���� get �޼ҵ�� ������ ��)

	public String get(String key) {
		return getRecursion(root,key);

	}
	private String getRecursion(Node p, String key) {
		if(p==null) {
			return null;
		}
		else if(key.compareTo(p.key) < 0) {
			return getRecursion(p.leftChild, key);
		}
		else if(key.compareTo(p.key) > 0) {
			return getRecursion(p.rightChild, key);
		}
		else {
			return p.value;
		}

	}

	// Ʈ����  key-value ���� �����ϴ� �޼ҵ�
	/**
	public void put(String key, String value) {
		root = insertKey(root, key, value);
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� key-value ���� ���� �� ��Ʈ�� �����ϴ� �޼ҵ�(��� �˰���)
	private Node insertKey(Node p, String key, String value) {
		if(p == null) {  
			Node newNode = new Node(key, value);
			return newNode; 
		}
		else if(key.compareTo(p.key) < 0) {   // Ű ���� p�� Ű������ ���� ���
			p.leftChild = insertKey(p.leftChild, key, value);
			return p;  // ��Ʈ �Һ�
		}
		else if(key.compareTo(p.key) > 0) { // Ű ���� p�� Ű������ ū ���
			p.rightChild = insertKey(p.rightChild, key, value);
			return p;  // ��Ʈ �Һ�       
		}
		else {  // Ű ���� p�� Ű���� ���� ���, ���� ������ ���� ���� ��� p�� value�� ���ο� ������ ����
			p.value = value;
			return p;   // ��Ʈ �Һ�
		}
	}  
**/
	// (2) (�ɼ�) ���� �� �޼ҵ� put, insertKey ���, �ݺ� �˰����� �̿��� put �޼ҵ带 �ۼ��Ͻÿ�.(���� put, insertKey �޼ҵ�� ������ ��)

	public void put(String key, String value) {
		Node p = root; //
		Node r = null; // �ش� Ű�� ���� ���

		while (p != null) {
			if (key.compareTo(p.key) == 0) { // �̹� �����ϴ� ���
				p.value = value;
				break;
			}
			r = p;
			if (key.compareTo(p.key) < 0)
				p = p.leftChild;
			else
				p = p.rightChild;

		}
		Node newNode = new Node(key, value);
		if (root == null) // ��Map
			root = newNode;
		else if (p == null) { // ��尡 �������� ���� ���
			if (key.compareTo(r.key) < 0)
				r.leftChild = newNode;
			else
				r.rightChild = newNode;
		}

	}






}