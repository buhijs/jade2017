package m03.alex;

public class Room {

	private boolean isPhoneAvailable;
	private boolean isElectricityAvailable;
	private short temperature;

	public boolean isPhoneAvailable() {
		return isPhoneAvailable;
	}

	public void setPhoneAvailable(boolean isPhoneAvailable) {
		this.isPhoneAvailable = isPhoneAvailable;
	}

	public boolean isElectricityAvailable() {
		return isElectricityAvailable;
	}

	public void setElectricityAvailable(boolean isElectricityAvailable) {
		this.isElectricityAvailable = isElectricityAvailable;
	}

	public short getTemperature() {
		return temperature;
	}

	public void setTemperature(short temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Room [isPhoneAvailable=" + isPhoneAvailable + ", isElectricityAvailable=" + isElectricityAvailable
				+ ", temperature=" + temperature + "]";
	}

}
