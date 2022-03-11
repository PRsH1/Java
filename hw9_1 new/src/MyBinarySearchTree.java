/*
 * ���ϸ�: MyBinarySearchTree.java
 * �ۼ���: 2018.11.13
 * �ۼ���: �̽���
 * ����: int�� Ű�� �����ϴ� ����Ž��Ʈ���� �����ڷᱸ���� ������ Ŭ����
 */

import java.util.NoSuchElementException;

public class MyBinarySearchTree {
	// (1) Ʈ���� ��带 ǥ���ϴ� private Ŭ���� Node - �ʵ�(int�� key, leftChild, rightChild), ������(key���� �Ű������� �޾� �ʱ�ȭ)
	private class Node{
		//��� Ŭ����
		int key;
		Node leftChild;
		Node rightChild;
		Node(int key){
			this.key=key;
			leftChild=null;
			rightChild=null;
		}
	}






	// (2) private �ν��Ͻ� ���� Ʈ���� ��Ʈ ��带 ��ų ����(root)�� �����ϰ� null�� �ʱ�ȭ
	private Node root=null;






	// Ʈ���� Ű�� key�� �����ϴ� �޼ҵ�
	public void insert(int key) {
		root = insertKey(root, key);
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� Ű�� key�� �����ϰ�, ���� �� ��Ʈ�� �����ϴ� �޼ҵ�(��� �˰���)
	private Node insertKey(Node p, int key) {
		if(p == null) {  
			Node newNode = new Node(key);
			return newNode; 
		}
		else if(key < p.key) {
			p.leftChild = insertKey(p.leftChild, key);
			return p;  // ��Ʈ �Һ�
		}
		else if(key > p.key) {
			p.rightChild = insertKey(p.rightChild, key);
			return p;  // ��Ʈ �Һ�       
		}
		else {  // key = p.key �� ��� ���� ����
			System.out.println("���� ����. �ߺ��� Ű���� �����մϴ�: " + key);
			return p;   // ��Ʈ �Һ�
		}
	}  

	// Ʈ���� ������ȸ�ϸ� ����ϴ� �޼ҵ�
	public void printInorder() {
		inorder(root);
		System.out.println();
	}

	// (3) p�� ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϸ� Ű���� ����ϴ� �޼ҵ�(��� �˰���)
	private void inorder(Node p) {
		if(p!=null) {
			inorder(p.leftChild);
			System.out.print(p.key+" ");
			inorder(p.rightChild);
		}

	}

	// (4) Ʈ���� �ִ� Ű���� �����ϴ� �޼ҵ�(�ݺ� �˰���) - ���� Ʈ���� ��� NoSuchElementException ���� �߻�
	public int max() {
		Node p=root;
		if(root == null) {
			throw new NoSuchElementException();
		}
		else {

			while(p.rightChild!=null) {
				p=p.rightChild;

			}

		}
		return p.key;



	}

	// Ʈ���� Ű�� key�� �����ϴ��� ���θ� �����ϴ� �޼ҵ�
	public boolean contains(int key) {
		return search(root, key);
	}

	// (5) p�� ��Ʈ�� �ϴ� Ʈ���� Ű�� key�� �����ϴ��� ���θ� �����ϴ� �޼ҵ�(��� �˰���)
	private boolean search(Node p, int key) {


		if(p!=null) {
			//p�� null�� �ƴ� ������

			if(key==p.key) {
				//���� k���� p.key�� �����ϸ� true ����
				return true;
			}
			if(key<p.key) {
				//�ƴ϶�� ���� key�� p.key���� �������
				return search(p.leftChild, key);//�Լ� leftChild�� ���ϰ� ��ȣ��
			}
			else {
				//�װ͵� �ƴϸ�
				return search(p.rightChild, key);//rightChild�� ���ϰ� ��ȣ��

			}

		}
		return false;//���� �ƴ϶��(�������� �ʴ´ٸ�) false ����
	}

	// (6) Ʈ���� Ű�� key�� �����ϴ� �޼ҵ�(�ݺ� �˰���) - ���� ��������(true/false)�� ����
	public boolean add(int key) {
		//add ���� �޼ҵ�

		Node p=root;
		Node t=new Node(key);
		if(p==null) {
			root=t;
			return true;
		}
		else {
			while(p!=null) {
				if(key<p.key) {
					if(p.leftChild==null) {
						p.leftChild=t;
						return true;
					}
					p=p.leftChild;

				}
				else if(key>p.key){
					if(p.rightChild==null) {
						p.rightChild=t;
						return true;
					}
					p=p.rightChild;

				}
				else {
					return false;
				}
			}
		}
		return false;
	}
	public boolean remove(int key) {
		//���� �޼ҵ�
		Node p=root;//���� �� Node�� ���� p
		Node u=root;//���߿� �� Node�� ���� u
		if(p==null) {
			//p�� null�̸� false ����
			return false;
		}
		if(key==p.key) {
			//key���� ��Ʈ ���̶� ������
			if(p.leftChild!=null && p.rightChild!=null) {
				//�ڽ��� ��� �ִ� ���
				p=p.rightChild;
				if(p.leftChild!=null) {
					//���� �ڽ��� �ִ� ���
					while(p.leftChild.leftChild!=null) {
						p=p.leftChild;
					}
					Node t=new Node(p.leftChild.key);
					p.leftChild=null;
					t.leftChild=root.leftChild;
					t.rightChild=root.rightChild;
					root=t;


				}
				else {
					//�ƴ� ���
					Node t=new Node(p.key);
					t.leftChild=root.leftChild;
					t.rightChild=root.rightChild.rightChild;
					root=t;
				}

				return true;
			}
			else if(p.leftChild==null) {
				p=p.rightChild;
				root=p;
				return true;
			}
			else {
				p=p.leftChild;
				root=p;
				return true;
			}

		}
		else {
			//�ƴ϶��
			while(p!=null) {
				//p�� null�� �� ������
				if(key<p.key) {
					//Ű�� p����� Ű���� ������
					p=p.leftChild;//���� �ڽ� ���� �̵�
					if(p==null) {
						//p�� null���̸� false ����
						return false;
					}
					if(p.key==key) {
						//p ����� Ű���� �ŰԺ��� Ű���� ������
						Node s=p;//���� ��带 s�� ����
						if(p.leftChild!=null && p.rightChild!=null) {
							//�ڽ��� �� ���� ���
							p=p.rightChild;
							if(p.leftChild!=null) {
								while(p.leftChild.leftChild!=null) {
									p=p.leftChild;
								}
								Node t=new Node(p.leftChild.key);
								p.leftChild=null;
								t.leftChild=s.leftChild;
								t.rightChild=s.rightChild;
								s=t;


							}
							else {
								p.leftChild=s.leftChild;
								u.rightChild=u.rightChild.rightChild;
								return true;

							}
							return true;

						}
						else if(p.leftChild==null && p.rightChild==null) {
							//�ܸ�����ΰ��
							if(u.leftChild!=null && u.leftChild.key==key) {
								//���� �ڽ� ��尡 ���� �ƴ԰� ���ÿ� Ű ���� ���� ���
								u.leftChild=null;//�� �ܸ� ��� ����
								return true;
							}
							else {
								//������ ����� ���
								u.rightChild=null;//������ �ܸ���� ����
								return true;
							}
						}
						else if(p.leftChild==null) {
							//���� �ڽ� ��尡 �������
							u.rightChild=u.rightChild.rightChild;
							return true;

						}
						else{
							//�� �ݴ��� ���
							u.leftChild=u.leftChild.leftChild;
							return true;
						}

					}
					u=u.leftChild;//u�� ���� �ڽ����� �̵�
				}
				else {
					//���� �������� �� Ŭ ���
					p=p.rightChild;//p�� ������ �ڽ����� �̵�
					//���ϴ� ���� �ڽ� ��带 �����ϴ� ���� ����
					if(p==null) {
						return false;
					}
					if(p.key==key) {
						Node s=p;
						if(p.leftChild!=null && p.rightChild!=null) {
							p=p.rightChild;
							if(p.leftChild!=null) {
								while(p.leftChild.leftChild!=null) {
									p=p.leftChild;
								}
								Node t=new Node(p.leftChild.key);
								p.leftChild=null;
								t.leftChild=s.leftChild;
								t.rightChild=s.rightChild;
								s=t;


							}
							else {
								p.leftChild=s.leftChild;
								u.rightChild=u.rightChild.rightChild;
								return true;
							}
							return true;
						}
						else if(p.leftChild==null && p.rightChild==null) {
							if(u.leftChild!=null && u.leftChild.key==key) {
								u.leftChild=null;
								return true;
							}
							else {
								u.rightChild=null;
								return true;
							}
						}
						else if(p.leftChild==null) {
							u.rightChild=u.rightChild.rightChild;
							return true;

						}
						else {
							u.leftChild=u.leftChild.leftChild;
							return true;
						}

					}
					u=u.rightChild;
				}


			}

		}
		return false;

	}
}