package m04;

import java.util.ArrayList;

import m04.payservice.Order;
import m04.productservice.DiscountVisitor;
import m04.productservice.Visitor;
import m04.taxservice.ITax;
import m04.taxservice.TaxFactory;

public class ShoppingCart {
	
	
	ArrayList<Item> orderItems = new ArrayList<Item>();
	
	/**
	 * Calculate total costs of items in the ShoppingCart - including taxes
	 * @param customer - customer in question 
	 * @return total costs
	 */
    public double calculateTotal(Visitor visitor)
    {
    	double total = 0;
    	for (Item item : orderItems) {
			total += item.getProduct().getPrice()*item.getQuantity() - item.getProduct().getCategory().getDiscount(visitor, item);
		}

    	return total;

    }
    
    public Order checkout(Customer customer, Visitor visitor){
    	
    	double total = calculateTotal(visitor);
    	
    	ITax tm = TaxFactory.getTaxService(customer);
    	double tax = tm.getTax(total);
    	
        total = total + tax;
        
        Order order = new Order(customer,total);
        
        return order;
    }
    
    public void removeItem(Item item){
    	orderItems.remove(item);
    }
    
    public void addItem(Item item){
    	orderItems.add(item);
    }
    

}
