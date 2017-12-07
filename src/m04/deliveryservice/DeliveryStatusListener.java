package m04.deliveryservice;

import m04.Order;

// Observer pattern: interface for observers/listeners (in our case only one - Customer class)
public interface DeliveryStatusListener {

	public void notify(Order order, String status);
	
}
