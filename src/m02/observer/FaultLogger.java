package m02.observer;

public class FaultLogger implements FaultObserver {

	@Override
	public void newFault(Fault fault, String msg) {
		
		System.out.println(msg+" Error code: "+fault.getType());
		
	}

}
