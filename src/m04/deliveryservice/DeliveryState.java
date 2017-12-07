package m04.deliveryservice;

import m04.Order;

public interface DeliveryState {
	
	public DeliveryState deliver(Order order);
	public String toString();

}
