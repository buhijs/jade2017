package m04.deliveryservice;

import m04.*;

//Facade Pattern: put some complex delivery service operation/method calls in one simple method that does it all 
public class DeliveryServiceFacade {

	private DeliveryService deliveryService;
	
	// Factory Pattern: In constructor use Delivery Factory to get desired Delivery Service provided in deliveryMethod parameter
	public DeliveryServiceFacade(String deliveryMethod){
		deliveryService = DeliveryServiceFactory.getService(deliveryMethod);
	}
	
	// Facade Pattern: This method is visible to user that does some complex operation (usually not know by user)
	public void deliverOrder(Order order){
		
		// Observer Pattern: add customer as the listener to delivery Service
		deliveryService.addDeliveryStatusListener(order.getCustomer());
		deliveryService.setOrder(order);
		deliveryService.deliver();
	}

	public String getStatus(){
		return deliveryService.getStatus();

	}
	
}
