package m03.alex;

import java.util.ArrayList;

public class DeskClerk {

	private RoomStrategy roomStrategy_;

	public DeskClerk(RoomStrategy roomStrategy_) {
		this.roomStrategy_ = roomStrategy_;
	}

	public void executeStrategy(Room room) {
		roomStrategy_.doOperations(room);
	}

}
