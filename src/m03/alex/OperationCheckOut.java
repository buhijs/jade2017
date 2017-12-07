package m03.alex;

import java.util.ArrayList;

public class OperationCheckOut implements RoomStrategy {

	@Override
	public void doOperations(Room room) {
		room.setPhoneAvailable(false);
		room.setElectricityAvailable(false);
		room.setTemperature((short) 20);
	}

}