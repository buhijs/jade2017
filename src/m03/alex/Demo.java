package m03.alex;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		Room room = new Room();
		Room room2 = new Room();
		
		DeskClerk roomStrategyInOut = new DeskClerk(new OperationCheckInOut()); 
		//DeskClerk roomStrategyOut = new DeskClerk(new OperationCheckOut()); 
		
		
		roomStrategyInOut.executeInStrategy(room);
		System.out.println(room.toString());		
		roomStrategyInOut.executeOutStrategy(room);
		System.out.println(room.toString());
		
		roomStrategyIn.executeStrategy(room2);
		roomStrategyOut.executeStrategy(room2);

	}

}
