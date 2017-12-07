package m04.productservice;

import m04.Item;
import m04.productservice.categories.Books;
import m04.productservice.categories.Electronics;
import m04.productservice.categories.Foods;

public interface Visitor {
	
	public double getProductDiscount(Books category, Item item);
	public double getProductDiscount(Electronics category,Item item);
	public double getProductDiscount(Foods category,Item item);

}
