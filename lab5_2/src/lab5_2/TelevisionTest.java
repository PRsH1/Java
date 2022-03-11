package lab5_2;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("lab5_2:ÀÌ½ÂÇö");
		
		Television[] channelList=new Television[3];
		for (int j=0; j<3; j++) {
			channelList[j]=new Television();
		}
		for (int i=0; i<3; i++) {
			channelList[i].channel=7;
			if (i==2) {
				channelList[i].channel=11;
			}

		}
		for (int x=0; x<3; x++) {
			System.out.println(channelList[x].channel);
		}
	}

}
