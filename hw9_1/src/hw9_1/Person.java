package hw9_1;

public class Person implements Speakable {
	//Speakable�� �������̽��� ���� PersonŬ����
	private String name;//�̸� �ʵ�

	public String getName() {
		//�̸� ��ȯ �޼ҵ�
		return name;

	}
	public void setName(String name) {
		//�̸� ���� �޼ҵ�
		this.name=name;
	}
	@Override
	public void speak() {
		//speak �޼ҵ� �������̵�
		//�λ񸻰� �̸� ���
		System.out.println("�ȳ��ϼ���");
	
	}

}
