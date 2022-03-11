/*
 * ���ϸ�: Student.java
 * �ۼ���: 2018.4.24
 * �ۼ���: �̽���
 * ����: �̸�, ����, ���� ������ ���� �л� Ŭ������ ����
 * ���� ����� ���ǻ���: Student Ŭ���� �ܺο����� Student�� �̸�, ����, ���� ������ �̷���� ������ �˰� ������, Address Ŭ������ ����� ���� ����
 */
package lab6_6;

public class Student {
	class Addresss{
		private String city;
		private String country;
		public Addresss(String city,String country) {
			this.city=city;
			this.country=country;
		}

	}
	private String name;
	private Addresss address;
	public Student(String name, String city, String country) {
		this.name=name;
		address=new Addresss(city,country);


	}
	public String getName() {
		return name;
	}
	public String getCity() {
		return address.city;
	}
	public String getCountry() {
		return address.country;

	}
	public void move(String city,String country) {
		address.city=city;
		address.country=country;		
	}
	@Override
	public String toString() {
		return "Student [name=" + name +", ����=" + address.city + ", ����="
				+ address.country + "]";
	}




}
