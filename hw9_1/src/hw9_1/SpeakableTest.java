/*
 * ���ϸ�:Dog.java,Person.java,Speakable.java,SpeakableTest.java
 *�ۼ���:2017.05.18
 *�̸�:�̽���
 *����:�������̽� ����
 */

package hw9_1;

public class SpeakableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw9_1:�̽���");//���� �ڵ�,�̸� ���
		Speakable[] speak=new Speakable[4];//Speakable�� �迭 ����
		//Person���� Dog�� ��ü ����,�̸��� ���� ����
		Person p1=new Person();
		p1.setName("������");
		Person p2=new Person();
		p2.setName("�̼���");
		Dog d1=new Dog();
		d1.setAge(5);
		Dog d2=new Dog();
		d2.setAge(8);
		//�迭�� ��ü�� ����
		speak[0]=p1;
		speak[1]=p2;
		speak[2]=d1;
		speak[3]=d2;
		for(int i=0; i<4; i++) {
			//�ݺ���
			speak[i].speak();//speakȣ��
			if(speak[i] instanceof Person){
				System.out.println(((Person) speak[i]).getName()+"�Դϴ�");
				System.out.println();
			}
			
				

		}

	}

}
