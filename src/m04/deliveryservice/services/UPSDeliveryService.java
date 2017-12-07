package m04.deliveryservice.services;

import java.util.ArrayList;
import java.util.Scanner;

import m04.Order;
import m04.deliveryservice.*;
import m04.deliveryservice.services.states.*;

public class UPSDeliveryService implements DeliveryService {

	private String sourceAddress;
	private Order order = null;
	private String status;
	
	// Observer pattern: array of all subscribed listeners 
	ArrayList<DeliveryStatusListener> listeners = new ArrayList<DeliveryStatusListener>();

	public UPSDeliveryService(String sourceAddress) {
		setSourceAddress(sourceAddress);
		status = "Init";
	}

	private void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	public void setOrder(Order order) {
		this.order = order;
		
		// Notify all listeners if package is accepted for delivery by sending new Status message - Accepted
		status = "Accepted";
		notifyStatus();
	}

	public double calculateDeliveryCosts() {

		double costs = 10;

		if (order != null) {
			// TODO Call UPS api to determine costs for a customer
			// costs = UPSapi.getCosts(sourceAddress,
			// order.getCustomer().getAddress(),order.calculateTotalWeight());
		} else {
			costs = -1;
		}
		return costs;
	}
	
	// Simulate delivery 
	public void deliver() {
		if(order != null){
			new Thread() {
				public void run() {
					System.out.println("Started Delivery to: " + order.getCustomer().getAddress() + "\n");
					try {
						Thread.sleep(10000);
						
						//Here the package is arrived. Change status and notify all by calling notifyStatus() 
						status = "Delivered";
						notifyStatus();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
	}

	public String getStatus() {
		return status;
	}

	// Observer pattern: notify all listeners about a specific order giving the status of the order
	public void notifyStatus() {
		for (DeliveryStatusListener deliveryStatusListener : listeners) {
			deliveryStatusListener.notify(order, status);
		}
	}
	
	// Observer pattern: method for subscribing a listener in order to receive notification
	public void addDeliveryStatusListener(DeliveryStatusListener listener) {
		listeners.add(listener);
		
	}

}
