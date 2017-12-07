package m04.productservice;

import m04.Product;
import m04.Shop;

public class ProductController {
	
	Shop shopModel;
	ProductView shopView;
	
	public ProductController(Shop model, ProductView view) {
		shopModel = model;
		shopView = view;
	}
	
	public void addProduct(Product newProduct){
		shopModel.addProduct(newProduct);
	}
	
	public void changeProductPrice(String prodCode, double price){
		Product product = shopModel.getProduct(prodCode);
		product.setPrice(price);
		shopView.displayShop(shopModel);
	}
	
	public void updateView(){
		shopView.displayShop(shopModel);
	}

}
