
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Box[] box=new Box[10];
		for (int i=0; i<box.length; i++) {
			box[i]=new Box(i, i, i);
			
		}
		for (int x=0; x<4; x++) {
			if (box[x].getVolume()>5) {
				count+=1;
				
				
			}
		
			
		}
		System.out.println("���ǰ� 5 �̻��� ������:"+count+"�Դϴ�");

	}

}
