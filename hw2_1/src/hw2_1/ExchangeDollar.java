/*
 * ���ϸ�:ExchangeDollar.java
 * �ۼ���:2018.03.16
 * �̸�:�̽���
 * ����:ScannerŬ������ �̿��� ���� �Է¹ް� �޷� ȯ���ϱ�
 */

package hw2_1;

import java.util.Scanner;
public class ExchangeDollar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;//�Է¹��� ���� ���� ���� ����
		int fivehundred=0;//500�� ������ �Է¹��� ����
		int onehundred=0;//100�� ������ �Է¹��� ����
		int fifth=0;//50�� ������ �Է¹��� ����
		int ten=0;//10�� ������ �Է¹��� ����
		int dollar=0;//�޷� ���� ǥ���� ����
		int won=0;//�޷� ��� �� ���� ��ȭ ǥ���� ����
		int EXCHANGE=1060;//1�޷��� ȯ�� 1060�� ������ ��� ����
		
		System.out.println("hw2_1: �̽���\n");//�ڽ��� �̸� ���
		ExcangeDollar input = new ExcangeDollar(System.in);//Scanner�� ���� input�� Ű���� �Է��� ���� Scanner ��ü �����Ͽ� ����
		
		System.out.print("500�� ���� �Է�:");//�ȳ��� ���
		fivehundred=input.nextInt();//���� �Է�
		
		System.out.print("100�� ���� �Է�:");//�ȳ��� ���
		onehundred=input.nextInt();//���� �Է�
		
		System.out.print("50�� ���� �Է�:");//�ȳ��� ���
		fifth=input.nextInt();//���� �Է�
		
		System.out.print("10�� ���� �Է�:");//�ȳ��� ���
		ten=input.nextInt();//���� �Է�
		System.out.print("\n");//������ ���� ���� ����
		
		sum=(fivehundred*500)+(onehundred*100)+(fifth*50)+(ten*10);//�Է¹��� ���ڵ��� ���Ѵ�
		dollar=sum/EXCHANGE;//�޷��� ����Ѵ�
		won=sum-dollar*EXCHANGE;//���� ��ȭ�� ����Ѵ�
		
		System.out.println("���� �Ѿ�:"+sum);//����� ���
		System.out.println("�޷� �׼�:"+dollar);//����� ���
		System.out.println("���� ��ȭ:"+won);//����� ���
		

	}

}
