package m04.productservice;

import m04.Item;
import m04.productservice.categories.Books;
import m04.productservice.categories.Electronics;
import m04.productservice.categories.Foods;

public class DiscountVisitor implements Visitor {

	@Override
	public double getProductDiscount(Books category, Item item) {
		double total = item.getProduct().getPrice()*item.getQuantity();
		double discount = 0;
		if(item.getQuantity()>10){
			discount = total*0.5;
		}
		return discount;
	}

	@Override
	public double getProductDiscount(Electronics category, Item item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getProductDiscount(Foods category, Item item) {
		// TODO Auto-generated method stub
		return 0;
	}

}
