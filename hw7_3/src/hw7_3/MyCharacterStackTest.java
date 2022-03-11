/**********
 * ���ϸ�:MyCharacterStack.java,MyCharacterStackTest.java
 * �ۼ���:�̽���
 * �ۼ���:2018.10.26
 * ����:���� ����Ʈ�� �̿��� ���� ��ȣ ǥ�� ����
 */

package hw7_3;

import java.util.Scanner;

public class MyCharacterStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_3:�̽���");
		String data;
		int missCount=0;//���� ����Ʈ�� top�� ����ְ� �߸��� ��ȣ ������ ��
		Scanner input=new Scanner(System.in);
		MyCharacterStack stack=new MyCharacterStack();
		System.out.print("���� �Է�:");
		data=input.nextLine();
		char []arr=new char[data.length()];//�迭 ũ�� ����
		for(int i=0; i<data.length(); i++) {
			//���ڿ� ũ�⸸ŭ �ݺ�
			arr[i]=data.charAt(i);
		}
		for(int j=0; j<arr.length; j++) {
			//�迭 ũ�⸸ŭ �ݺ�
			if(arr[j]=='(' || arr[j]=='<') {
				//���� �� �� ���ڸ� push
				stack.push(arr[j]);
			}
			else if(arr[j]==')') {
				//���� )�� ������ ��
				if(stack.isEmpty()==true) {
					System.out.println("�߸��� �����Դϴ�");
					missCount+=1;
					break;
				}
				else if(stack.peek()=='(')
					//���� ��ȸ ��� (�� ���´ٸ� pop
					stack.pop();
				

			}
			else if(arr[j]=='>') {
				//���� >�� ������ ��
				if(stack.isEmpty()==true) {
					System.out.println("�߸��� �����Դϴ�");
					missCount+=1;
					break;
				}
				else if(stack.peek()=='<')
					//���� ��ȸ ��� <�� ���´ٸ�
					stack.pop();
				
			}
		}
		if(stack.isEmpty()==true &&missCount==0) {
			System.out.println("�ùٸ� ��ȣ �����Դϴ�");
		}
		else if(stack.isEmpty()==false){
			System.out.println("�߸��� ��ȣ �����Դϴ�");
		}




	}

}
