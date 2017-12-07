package m02.observer;

public class Fault {
	private int type_;
	
	public Fault(int type){
		type_ = type;
	}
	
	public int getType(){
		return type_;
	}
}
