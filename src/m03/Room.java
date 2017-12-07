package m03;

public class Room {
	
	private int temp;
	private boolean phone;
	private boolean electricity;
	
	CheckInOutService service_;
	
	public Room(CheckInOutService service){
		service_ = service;
	}
	
	public checkIn(){
		service_.checkInService(this);
	}
	private int getTemp() {
		return temp;
	}
	private void setTemp(int temp) {
		this.temp = temp;
	}
	private boolean isPhone() {
		return phone;
	}
	private void setPhone(boolean phone) {
		this.phone = phone;
	}
	private boolean isElectricity() {
		return electricity;
	}
	private void setElectricity(boolean electricity) {
		this.electricity = electricity;
	}
	
	
	
		

}
