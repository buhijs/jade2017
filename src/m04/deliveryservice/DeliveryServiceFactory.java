package m04.deliveryservice;

import m04.deliveryservice.services.*;

// Factory Pattern: one method creating different DeliveryService objects
public class DeliveryServiceFactory {

	public static DeliveryService getService(String deliveryProvider){
		if(deliveryProvider.equals("UPS")){
			return new UPSDeliveryService("Riga, Brivibas 1");
		}else if (deliveryProvider.equals("DPD")){
			return new DPDDeliveryService();
		}else if (deliveryProvider.equals("FedEx")){
			return new FedExDeliveryService();
		}else if (deliveryProvider.equals("DHL")){
			return new DHLDeliveryService();
		}		
		return null;
	}
	
}
