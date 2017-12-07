package m04.deliveryservice.services.states;

import m04.Order;
import m04.deliveryservice.DeliveryState;
import m04.deliveryservice.services.states.*;

public class DeliveryStateAccepted implements DeliveryState{

	public DeliveryState deliver(final Order order) {
		
		boolean issucces = true;
		new Thread() {
			public void run() {
				System.out.println("Started Delivery to: " + order.getCustomer().getAddress() + "\n");
				try {
					Thread.sleep(10000);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
		
		if(issucces)
			return new DeliveryStateDelivered();
		else
			return this;
	}
	
	public String toString(){
		return "Order is Accepted";
	}

}
