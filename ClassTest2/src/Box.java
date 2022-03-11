
public class Box {
	private int height;
	private int width;
	private int z;

	public Box(int height,int width,int z) {
		this.height=height;
		this.width=width;
		this.z=z;
		
	}

	public int getVolume() {
		// TODO Auto-generated method stub
		int volume;
		volume=height*width*z;
		return volume;
		
		
	}


}
