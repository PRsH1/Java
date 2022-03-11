package final2;

import java.util.Scanner;

public class GraphTest { 
	public static void main(String[] args) { 
		System.out.println("final : ȫ�浿\n");

		// ���� �� n �Է�
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �� �Է�: ");
		int n = scan.nextInt();

		// ���� ���� n�� ���� �׷��� graph1�� graph2�� ����
		MyMatrixGraph graph1 = new MyMatrixGraph(n);
		MyListGraph graph2 = new MyListGraph(n);

		// ���� �� e �Է�
		System.out.print("���� �� �Է�: ");
		int e = scan.nextInt();

		// e���� ����(���� ��)�� �Է¹޾� graph1�� graph2�� ����
		System.out.println(e + "���� ������ �Է��ϼ���(�� ������ ���� ��ȣ 2���� whitespace�� �����Ͽ� �Է�):");
		for(int i = 0; i < e; i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			graph1.addEdge(v1, v2);
			graph2.addEdge(v1, v2);
		}

		// graph1 �� ������ out-degree�� ���
		System.out.println("\ngraph1");
		for(int i = 0; i < n; i++) {
			System.out.println("���� " + i + "�� �������� = " + graph1.outDegree(i));		
		}
		
		// graph2 �� ������ out-degree�� ���
		System.out.println("\ngraph2");
		for(int i = 0; i < n; i++) {
			System.out.println("���� " + i + "�� �������� = " + graph2.outDegree(i));		
		}
	}
}
