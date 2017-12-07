package m02.observer;

public class FaultEmail implements FaultObserver{

	@Override
	public void newFault(Fault fault, String msg) {
		System.out.println("Sending email to Admin. Error : "+fault.getType());
	}

}
