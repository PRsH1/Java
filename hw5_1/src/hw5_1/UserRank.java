package hw5_1;

public class UserRank {
	int rank;
	int point;
	void rankHold(int a) {
		rank=a;

	}
	void pointReward() {
		switch(rank) {
		case 1:
			point+=100;
			break;
		case 2:
			point+=50;
			break;
		case 3:
			point+=40;
			break;
		default:
			point+=10;
			break;
		
		}

	}
	double discountSearch() {
		double sell = 0;
		if (point>=100) {
			sell=0.2;
			return sell;
		}
		else {
			sell=0.1;
			return sell;
		}


	}

}
