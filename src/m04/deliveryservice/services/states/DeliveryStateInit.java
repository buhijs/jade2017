package m04.deliveryservice.services.states;

import m04.Order;
import m04.deliveryservice.DeliveryState;

public class DeliveryStateInit implements DeliveryState{

	public DeliveryState deliver(Order order) {
		System.out.println("Set an Order object first!");
		return this;
	}
	
	public String toString(){
		return "Order is in Init State";
	}

}
