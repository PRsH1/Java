package lab7_1;

public class ManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager();
		System.out.println("lab7_1:이승현");
		m.setSalary(1000);
		m.setBonus(500);
		System.out.println("봉급은 "+m.getSalary()+" 보너스는 "+m.getBonus()+" 세액은 "+m.getTax());

	}

}
