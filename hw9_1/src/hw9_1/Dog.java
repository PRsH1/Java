package hw9_1;

public class Dog implements Speakable {
	//Speakable�� �������̽��� ���� DogŬ����
	private int age;//���� �ʵ�
	public Dog() {
		//������
		this.age=0;
	}
	public int getAge() {
		//���� ��ȯ �޼ҵ�
		return age;
	}
	public void setAge(int age) {
		//���� ���� �޼ҵ�
		this.age=age;
	}
	@Override
	public void speak() {
		//speak�޼ҵ� �������̵�
		for(int i=0; i<getAge(); i++)
			//�ݺ����� �̿��� ���̸�ŭ ¢���Ѵ�
			System.out.print("��");//���
		System.out.println();
		System.out.println();
	}

}
