package m04.productservice;

import m04.Item;

public interface Category {
	
	public double getDiscount(Visitor visitor, Item item);

}
