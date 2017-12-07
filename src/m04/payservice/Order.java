package m04.payservice;

import m04.Customer;

public class Order {
	
	private Customer customer;
	private double amount;
	
	private static String shopAccount = "LV01293782398";
	
	public Order(Customer cust, double amount){
		this.customer = cust;
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public Customer getCustomer() {
		return customer;
	}

}
