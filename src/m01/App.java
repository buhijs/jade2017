package m01;

public class App {

	public static void main(String[] args) {
		
		AppTimer timer = AppTimer.getInstance();
		
		double a = 0;
		for(double i = 0; i<1000000000.0; i++){
			a = a + Math.sqrt(i*a);
		}
		
		// Get Time
		timer.printTime();		


	}

}
