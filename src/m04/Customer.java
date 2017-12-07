package m04;

import m04.deliveryservice.DeliveryStatusListener;
import m04.productservice.INewProductObservers;
import m04.Order;

public class Customer implements INewProductObservers, DeliveryStatusListener{
	private String name;
	private String stateCode;
	private String region;
	private String county;
	private String address;
	
	public Customer(String name, String stateCode, String region, String address) {
		this.name = name;
		this.stateCode = stateCode;
		this.region = region;
		this.address = address;
	}
	
	public Customer(){
		
	}
    
    public String getCounty() {
		return county;
	}
    
    public String getRegion() {
		return region;
	}
    
    public String getStateCode() {
		return stateCode;
	}
    
    public String getName() {
		return name;
	}
    
    public String getAddress(){
    	return address;
    }

	@Override
	public void newProductInShop(Product newProduct) {

		System.out.println(name + ": Super! Jauns produkts!: " + newProduct.getName());
		
	}
	
	public void PrintMessage(String msg) {
		System.out.println(name + " is saying: " + msg);
	}
	
	// Observer Pattern: implement method notify which will be called by subject (in our case - DeliveryService).
	public void notify(Order order, String status) {
		
		// Depending on message Customer can take some action.
		if (status.equals("Delivered")) {
			PrintMessage("Got my package: " + order.toString() + "\n");
		} else {
			PrintMessage("Nice to know that my package " + order.toString() + " has a status: " + status);
		}

	}
}
