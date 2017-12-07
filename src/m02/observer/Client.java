package m02.observer;

public class Client {

	public static void main(String[] args) {
		
		FaultGenerator generator = new FaultGenerator();
		
		generator.addObservers(new FaultLogger());
		generator.faulted(1);
		
		generator.addObservers(new FaultEmail());
		generator.faulted(4);
		
	}

}
