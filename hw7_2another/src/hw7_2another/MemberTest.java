/*
 * ���ϸ�:HourlyMember.java,Member.java,MemberTest.java,RegularMember.java
 *�ۼ���:2017.05.19
 *�̸�:�̽���
 *����:�߻� Ŭ������ ������ ����
 */


package hw7_2another;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw7_2:�̽���");//���� �ڵ�� �̸� ���
		double ageAverage = 0;//���� ����� ������ ���� 0���� �ʱ�ȭ
		int ageSum=0;//���� ���� ������ ���� 0���� �ʱ�ȭ
		int paySum=0;//ȸ�� ���� ������ ���� 0���� �ʱ�ȭ
		Member[] member=new Member[4];//Member �迭 ũ�� 4
		//Member�� �迭�� ��ü ����
		member[0]=new HourlyMember(22,2);
		member[1]=new HourlyMember(33,3);
		member[2]=new RegularMember(44);
		member[3]=new RegularMember(55);
		for(int i=0; i<member.length; i++) {
			//�ݺ���
			ageSum=ageSum+member[i].getAge();//�迭�� ����� ��ü�� ���� ���� ageSum�� ����
			paySum+=member[i].getPayment();//�迭�� ����� ��ü�� ȸ�� ���� paySum�� ����
			ageAverage=(double)ageSum/member.length;//ageAverage�� ��� ����
			
			
		}
		System.out.println("�������="+ageAverage);//���� ��� ���
		System.out.println("ȸ�� ��="+paySum);//ȸ�� �� ���

}
}