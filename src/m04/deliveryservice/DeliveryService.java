package m04.deliveryservice;

import m04.Order;

// Part of Factory pattern: define one interface for all Delivery Services 
public interface DeliveryService {
	
	public void setOrder(Order order);
	public void deliver();
	public String getStatus();
	public double calculateDeliveryCosts();
	public void  addDeliveryStatusListener(DeliveryStatusListener listener);
	public void notifyStatus();
}
