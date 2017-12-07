package m04.productservice.categories;

import m04.Item;
import m04.productservice.Category;
import m04.productservice.DiscountVisitor;
import m04.productservice.Visitor;

public class Electronics implements Category{

	@Override
	public double getDiscount(Visitor visitor,Item item) {
		return visitor.getProductDiscount(this,item);
	}
	
	public String toString(){
		return "Electronics";
	}

	
}
