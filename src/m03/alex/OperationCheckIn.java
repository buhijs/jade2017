package m03.alex;

import java.util.ArrayList;

public class OperationCheckIn implements RoomStrategy {

	@Override
	public void doOperations(Room room) {
		room.setPhoneAvailable(true);
		room.setElectricityAvailable(true);
		room.setTemperature((short) 21);
	}

}
