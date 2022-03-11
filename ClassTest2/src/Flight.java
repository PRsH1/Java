
public class Flight {
	private String depature;
	private String arrive;
	private int seat;
	private int avseat;
	
	public Flight(String depature,String arrive,int seat) {
		this.depature=depature;
		this.arrive=arrive;
		this.seat=seat;
		this.avseat=seat;
		
		
	}
	public String getDepature() {
		return depature;
	}
	public String getArrive() {
		return arrive;
	}
	public int available() {
		return avseat;
	}
	public void book(int seat) {
		this.avseat=this.seat-seat;
	}
	public void transfer(Flight other,int transfer) {
		if(other.available()<transfer||seat-avseat<transfer) {
			System.out.println("좌석 수가 없습니다!");
		}
		else {
			other.avseat-=transfer;
			avseat+=transfer;
		}

}


}