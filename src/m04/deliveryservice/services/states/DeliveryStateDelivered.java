package m04.deliveryservice.services.states;

import java.util.Scanner;

import m04.Order;
import m04.deliveryservice.DeliveryState;

public class DeliveryStateDelivered implements DeliveryState{

	public DeliveryState deliver(Order order) {
		Scanner input = new Scanner(System.in);
		System.out.print("Repeat order for " + order.getCustomer().getName() + " ? (y/n)");
		String answer = input.nextLine();
		if(answer.toLowerCase().startsWith("y")){
			return (new DeliveryStateAccepted()).deliver(order);
		}else{
			System.out.println("Repeat order is not sent.");
			return this;
		}
	}
	
	public String toString(){
		return "delivered";
	}

}
