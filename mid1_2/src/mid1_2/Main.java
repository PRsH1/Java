package mid1_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (1) �̸� kim �ñ� 8000, �ð� 11�� ��� emp1 ����
		Employee emp1=new Employee("kim",8000,11);



		// (2) �̸� Lee�� ��� emp2 ����
		Employee emp2=new Employee("Lee");



		// emp1, emp2�� ���ϴ� �޼ҵ� ȣ��
		compare(emp1, emp2);
		compare(emp2, emp1);
	}

	// (3) �Ű������� ���� ��� e1, e2�߿���
	//  ������ ���� ����� �̸��� ����ϴ� �޼ҵ�
	// -������ �����ϸ� �����ϴٰ� ����� ��
	private static void compare(Employee e1, Employee e2){ 
		if(e1.getSalary()<e2.getSalary()) {
			System.out.println(e2.getName());
		}
		else if(e1.getSalary()>e2.getSalary()) {
			System.out.println(e1.getName());
		}
		else {
			System.out.println("����");
		}

	}

}