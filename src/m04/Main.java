package m04;

import m04.payservice.IPayingService;
import m04.payservice.Order;
import m04.payservice.PayingFactory;
import m04.productservice.Category;
import m04.productservice.DiscountVisitor;
import m04.productservice.DiscountVisitorChristmas;
import m04.productservice.ProductController;
import m04.productservice.ProductView;
import m04.productservice.categories.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Shop shop = new Shop();
		shop.addItem(new Product("Banana", 2.4, new Foods(), 200));
		shop.addItem(new Product("Harry Poter: 1", 15.60, new Books(), 300));

		//ProductView view = new ProductView();
		//ProductController controller = new ProductController(shop, view);
		
		//controller.updateView();
		
		//controller.changeProductPrice("Banana", 1.5);
		
		Customer newc = new Customer("Janis", "DE", "Ventspils", "Inzenieru 101");
		Customer new2 = new Customer("Martins", "DE", "Ventspils", "Inzenieru 101");
		shop.addShopObserver(newc);
		shop.addShopObserver(new2);
		
		shop.addItem(new Product("Harry Poter: 2", 15.60, new Books(), 500));

		/*
		ShoppingCart cart = new ShoppingCart();
		
		cart.addItem(new Item(50,shop.getProduct("Harry Poter: 1")));
		cart.addItem(new Item(1,shop.getProduct("Banana")));
		
		DiscountVisitor discountVisitor = new DiscountVisitor();
		//DiscountVisitorChristmas discountVisitor = new DiscountVisitorChristmas();
		
		Order order = cart.checkout(newc, discountVisitor);
		
		IPayingService paymentService = PayingFactory.getPayingService("PayPal");
		paymentService.pay(order);


		
		shop.addShopObserver(newc);
		shop.addItem(new Product("Melone", 0.80, new Foods()));
		shop.removeShopObserver(newc);
		shop.addItem(new Product("Apelsins", 2.4, new Foods()));
		*/
		
	}

}
