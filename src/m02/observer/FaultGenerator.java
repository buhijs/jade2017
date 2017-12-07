package m02.observer;

import java.util.ArrayList;

public class FaultGenerator {

	//private Fault obj_;
	private ArrayList<FaultObserver> observers_ = new ArrayList();
	
	public FaultGenerator(){
		
	}
	
	public void faulted(int code){
		//obj_ = new Fault(code);//
		notifyAllObservers(new Fault(code));
	}
	
	protected void notifyAllObservers(Fault obj_){
		for (FaultObserver faultObserver : observers_) {
			faultObserver.newFault(obj_, "We got Problems!");
		}
	}
	
	public void addObservers(FaultObserver observer){
		observers_.add(observer);
	}
	
	public void removeObserver(FaultObserver observer){
		observers_.remove(observer);
	}
	
	
}
