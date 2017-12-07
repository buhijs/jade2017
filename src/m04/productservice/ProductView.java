package m04.productservice;

import m04.Product;
import m04.Shop;

public class ProductView {
	
	public void displayShop(Shop shop){
		System.out.println("=== Shop Products ===");
		for (Product product : shop.getAllItems()) {
			System.out.println(product.toString());
		}
		System.out.println("=== END ===\n");
	}
	
	public void displayProduct(Shop shop, String code){
		System.out.println("=== Product Info ===");
		System.out.println(shop.getProduct(code).toString());
		System.out.println("=== END ===\n");
	}

}
