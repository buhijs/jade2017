package m01;

public class AppTimer {
	
	static{
		timer = new AppTimer();
	}
	
	private static AppTimer timer;
	private int time = 0;
	private Thread innerTimer;
	
	private AppTimer(){
		
		innerTimer = new Thread(new Runnable(){
			@Override
			public void run() {
				while(true){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					time++;
				}
			}
			
		});
		innerTimer.start();
				
		
	}
	
	public static AppTimer getInstance(){
		return timer;
	}
	
	public void printTime(){
		System.out.println("Time has passed: "+time);
	}
	

}
