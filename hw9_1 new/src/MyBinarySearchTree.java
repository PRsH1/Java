/*
 * 파일명: MyBinarySearchTree.java
 * 작성일: 2018.11.13
 * 작성자: 이승현
 * 설명: int형 키값 저장하는 이진탐색트리를 연결자료구조로 구현한 클래스
 */

import java.util.NoSuchElementException;

public class MyBinarySearchTree {
	// (1) 트리의 노드를 표현하는 private 클래스 Node - 필드(int형 key, leftChild, rightChild), 생성자(key값을 매개변수로 받아 초기화)
	private class Node{
		//노드 클래스
		int key;
		Node leftChild;
		Node rightChild;
		Node(int key){
			this.key=key;
			leftChild=null;
			rightChild=null;
		}
	}






	// (2) private 인스턴스 변수 트리의 루트 노드를 가킬 변수(root)를 선언하고 null로 초기화
	private Node root=null;






	// 트리에 키값 key를 삽입하는 메소드
	public void insert(int key) {
		root = insertKey(root, key);
	}

	// p를 루트로 하는 트리에 키값 key를 삽입하고, 삽입 후 루트를 리턴하는 메소드(재귀 알고리즘)
	private Node insertKey(Node p, int key) {
		if(p == null) {  
			Node newNode = new Node(key);
			return newNode; 
		}
		else if(key < p.key) {
			p.leftChild = insertKey(p.leftChild, key);
			return p;  // 루트 불변
		}
		else if(key > p.key) {
			p.rightChild = insertKey(p.rightChild, key);
			return p;  // 루트 불변       
		}
		else {  // key = p.key 인 경우 삽입 실패
			System.out.println("삽입 실패. 중복된 키값이 존재합니다: " + key);
			return p;   // 루트 불변
		}
	}  

	// 트리를 중위순회하며 출력하는 메소드
	public void printInorder() {
		inorder(root);
		System.out.println();
	}

	// (3) p를 루트로 하는 트리를 중위 순회하며 키값을 출력하는 메소드(재귀 알고리즘)
	private void inorder(Node p) {
		if(p!=null) {
			inorder(p.leftChild);
			System.out.print(p.key+" ");
			inorder(p.rightChild);
		}

	}

	// (4) 트리의 최대 키값을 리턴하는 메소드(반복 알고리즘) - 공백 트리인 경우 NoSuchElementException 예외 발생
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

	// 트리가 키값 key를 포함하는지 여부를 리턴하는 메소드
	public boolean contains(int key) {
		return search(root, key);
	}

	// (5) p를 루트로 하는 트리에 키값 key가 존재하는지 여부를 리턴하는 메소드(재귀 알고리즘)
	private boolean search(Node p, int key) {


		if(p!=null) {
			//p가 null이 아닐 때까지

			if(key==p.key) {
				//만약 k값이 p.key와 동일하면 true 리턴
				return true;
			}
			if(key<p.key) {
				//아니라면 만약 key가 p.key보다 작을경우
				return search(p.leftChild, key);//함수 leftChild와 비교하게 재호출
			}
			else {
				//그것도 아니면
				return search(p.rightChild, key);//rightChild와 비교하게 재호출

			}

		}
		return false;//전부 아니라면(존재하지 않는다면) false 리턴
	}

	// (6) 트리에 키값 key를 삽입하는 메소드(반복 알고리즘) - 삽입 성공여부(true/false)를 리턴
	public boolean add(int key) {
		//add 삽입 메소드

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
		//삭제 메소드
		Node p=root;//먼저 돌 Node형 변수 p
		Node u=root;//나중에 돌 Node형 변수 u
		if(p==null) {
			//p가 null이면 false 리턴
			return false;
		}
		if(key==p.key) {
			//key값이 루트 값이랑 같으면
			if(p.leftChild!=null && p.rightChild!=null) {
				//자식이 모두 있는 경우
				p=p.rightChild;
				if(p.leftChild!=null) {
					//왼쪽 자식이 있는 경우
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
					//아닐 경우
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
			//아니라면
			while(p!=null) {
				//p가 null이 될 때까지
				if(key<p.key) {
					//키가 p노드의 키보다 작으면
					p=p.leftChild;//왼쪽 자식 노드로 이동
					if(p==null) {
						//p가 null값이면 false 리턴
						return false;
					}
					if(p.key==key) {
						//p 노드의 키값과 매게변수 키값이 같으면
						Node s=p;//현재 노드를 s에 저장
						if(p.leftChild!=null && p.rightChild!=null) {
							//자식이 둘 있을 경우
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
							//단말노드인경우
							if(u.leftChild!=null && u.leftChild.key==key) {
								//왼쪽 자식 노드가 널이 아님과 동시에 키 값과 같을 경우
								u.leftChild=null;//그 단말 노드 삭제
								return true;
							}
							else {
								//오른쪽 노드인 경우
								u.rightChild=null;//오른쪽 단말노드 삭제
								return true;
							}
						}
						else if(p.leftChild==null) {
							//왼쪽 자식 노드가 없을경우
							u.rightChild=u.rightChild.rightChild;
							return true;

						}
						else{
							//그 반대일 경우
							u.leftChild=u.leftChild.leftChild;
							return true;
						}

					}
					u=u.leftChild;//u는 왼쪽 자식으로 이동
				}
				else {
					//만약 오른쪽이 더 클 경우
					p=p.rightChild;//p는 오른쪽 자식으로 이동
					//이하는 왼쪽 자식 노드를 삭제하는 경우와 동일
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