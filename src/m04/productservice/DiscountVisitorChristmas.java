package m04.productservice;

import m04.Item;
import m04.productservice.categories.Books;
import m04.productservice.categories.Electronics;
import m04.productservice.categories.Foods;

public class DiscountVisitorChristmas implements Visitor {

	@Override
	public double getProductDiscount(Books category, Item item) {
		// TODO Auto-generated method stub
		return 0;
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
