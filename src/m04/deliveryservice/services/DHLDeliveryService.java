package m04.deliveryservice.services;

import java.util.ArrayList;

import m04.Order;
import m04.deliveryservice.*;

public class DHLDeliveryService implements DeliveryService {

	ArrayList<DeliveryStatusListener> listeners;
	
	public void setOrder(Order order) {
		// TODO Auto-generated method stub

	}

	public void deliver() {
		// TODO Auto-generated method stub

	}

	public String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	public double calculateDeliveryCosts() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void notifyStatus() {
		// TODO Auto-generated method stub
		
	}

	public void addDeliveryStatusListener(DeliveryStatusListener listener) {
		listeners.add(listener);
		
	}

	

}
