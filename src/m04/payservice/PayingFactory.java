package m04.payservice;

import m04.payservice.payingmethods.MasterCardService;
import m04.payservice.payingmethods.PayPalService;

public class PayingFactory {
	
	public static IPayingService getPayingService(String method){
		
		if(method.equalsIgnoreCase("PayPal")){
			return new PayPalService();
		}
		if(method.equalsIgnoreCase("MasterCards")){
			return new MasterCardService();
		}
		
		return null;
		
	}

}
