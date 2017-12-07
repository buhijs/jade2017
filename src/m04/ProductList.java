package m04;


import java.util.ArrayList;
import java.util.HashMap;


/**
 * Abstract item list class which could be extended to concrete implementation as ShopingList, DeliveryList, etc
 * @author Janis
 *
 */
public abstract class ProductList {
	private HashMap<String,Product> items;
	
	ProductList(){
		items = new HashMap<String,Product>();
	}
	
	public boolean addProduct(Product item){
		if (item!=null){
			items.put(item.getName(),item);
			return true;
		}
		else{
			return false;
		}
	}
	
	boolean removeProduct(String name){
		if(items.containsKey(name)){
			items.remove(name);
			return true;
		}else{
			return false;
		}
	}
	
	public Product getProduct(String name){
		return items.get(name);
	}
	

	public ArrayList<Product> getAllItems(){
		return new ArrayList<Product>(items.values());
	}

}
