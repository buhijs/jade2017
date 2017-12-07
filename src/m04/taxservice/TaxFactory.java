package m04.taxservice;

import m04.Customer;

public class TaxFactory {
	
	
	private TaxFactory(){
		
	};
	
	public static ITax getTaxService(Customer customer){
		ITax tax = null;
		Class<?> foundClass;
		try {
			foundClass = Class.forName("m04.taxservice.services."+customer.getStateCode()+"Tax");
			try {
				tax = (ITax)foundClass.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tax;
	}

}
