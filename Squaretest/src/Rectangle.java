
public class Rectangle {
	private double height;
	private double width;
	public Rectangle() {
		this(1.0,1.0);
	}
	public Rectangle(double height, double width) {
		// TODO Auto-generated constructor stub
		this.height=height;
		this.width=width;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public boolean equalArea(Rectangle other) {
		return height*width==other.height*other.width;
	}

}
