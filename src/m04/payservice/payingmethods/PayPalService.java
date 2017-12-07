package m04.payservice.payingmethods;

import m04.Customer;
import m04.PayPalAccount;
import m04.payservice.IPayingService;
import m04.payservice.Order;

public class PayPalService implements IPayingService{

	public String accountNr;


	private String findAccount(Customer customer){
		// Do DB queries
		
		return "10102983621223";
	}
	
	@Override
	public void pay(Order order) {
		String account = findAccount(order.getCustomer());
		
		System.out.println(order.getCustomer().getName()+ " Acc: "+ account + " Paying: "+order.getAmount());
	}

}
