/**********
 * ���ϸ�:MyStackPointCounting.java
 * �ۼ���:�̽���
 * �ۼ���:2018.10.27
 * ����:������ �̿��� ���� ���� ����
 */

package hw7_4;

import java.util.Stack;
import java.util.EmptyStackException;
import java.util.Scanner;

public class MyStackPostCounting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<String>();
		//���� Ŭ���� ��ü �ϳ� ����
		Scanner input=new Scanner(System.in);
		System.out.println("hw7_4:�̽���");
		System.out.print("����ǥ������Է�:");//�ȳ��� ���
		String str=input.nextLine();
		String []arr=str.split(" ");//������ �������� ���ڿ� ������
		double total = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("+")) {
				//equls�޼ҵ� ���,���ǿ� ������
				try {
					//���� �����ڰ� ���� ���ÿ� �ִ� ���ں��� �� ������ ����ó��
					double temp1=Double.parseDouble(stack.pop());
					double temp2=Double.parseDouble(stack.pop());
					total=temp2+temp1;
				}catch(EmptyStackException e) {
					System.out.println("�߸��� �����Դϴ�");
					break;
				}

				stack.push(Double.toString(total));
			}
			else if(arr[i].equals("-")) {
				//equls�޼ҵ� ���,���ǿ� ������

				try {
					//���� �����ڰ� ���� ���ÿ� �ִ� ���ں��� �� ������ ����ó��
					double temp1=Double.parseDouble(stack.pop());
					double temp2=Double.parseDouble(stack.pop());
					total=temp2-temp1;

				}catch(EmptyStackException e) {
					System.out.println("�߸��� �����Դϴ�");
					break;
				}
				stack.push(Double.toString(total));
			}
			else if(arr[i].equals("*")) {
				//equls�޼ҵ� ���,���ǿ� ������
				try {
					//���� �����ڰ� ���� ���ÿ� �ִ� ���ں��� �� ������ ����ó��
					double temp1=Double.parseDouble(stack.pop());
					double temp2=Double.parseDouble(stack.pop());
					total=temp2*temp1;
				}catch(EmptyStackException e) {
					System.out.println("�߸��� �����Դϴ�");
					break;
				}
				stack.push(Double.toString(total));
			}
			else if(arr[i].equals("/")) {
				//equls�޼ҵ� ���,���ǿ� ������
				try {
					//���� �����ڰ� ���� ���ÿ� �ִ� ���ں��� �� ������ ����ó��
					double temp1=Double.parseDouble(stack.pop());
					double temp2=Double.parseDouble(stack.pop());
					total=temp2/temp1;
				}catch(EmptyStackException e) {
					System.out.println("�߸��� �����Դϴ�");
					break;
				}
				stack.push(Double.toString(total));
			}
			else {
				//���� ���ڰ� �ԷµǾ��� ��
				double temp;
				try {
					temp=Double.parseDouble(arr[i]);
					//Double�� ��ȯ�Ǵ��� try
				}catch(NumberFormatException e){
					//NumberFormatException �߻� �� ����ó��
					System.out.println("�߸��� �����Դϴ�");
					break;

				}
				//�ƴ϶�� ���ÿ� push
				stack.push(arr[i]);

			}

		}
		if(stack.isEmpty()==false &&stack.size()==1)
			//������ isEmpty�� �ƴ� ����
			System.out.println("���="+stack.peek());

	}

}
