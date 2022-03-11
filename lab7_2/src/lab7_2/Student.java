package lab7_2;

public abstract class Student {
	private int id;
	private double score;
	public Student(int id,double score) {
		this.id=id;
		this.score=score;
	}
	public int getId() {
		return id;
	}
	
	public double getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score=score;
	}
	public abstract boolean warning();

}
