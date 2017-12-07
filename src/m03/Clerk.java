package m03;

public class Clerk {

	public static void main(String[] args) {
		
		
		CheckInOutService checkInStrategy = CheckInOutFactory.getCheckInOutService("Summer");
		//checkInStrategy.setTemp(20);
		
		Room r = new Room(checkInStrategy);
		r.changeState();
		r.changeState();

	}

}
