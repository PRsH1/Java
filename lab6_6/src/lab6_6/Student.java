/*
 * 파일명: Student.java
 * 작성일: 2018.4.24
 * 작성자: 이승현
 * 내용: 이름, 도시, 국가 정보를 갖는 학생 클래스를 정의
 * 과제 수행시 유의사항: Student 클래스 외부에서는 Student가 이름, 도시, 국가 정보로 이루어진 것으로 알고 있으며, Address 클래스의 존재는 알지 못함
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
		return "Student [name=" + name +", 도시=" + address.city + ", 국가="
				+ address.country + "]";
	}




}
