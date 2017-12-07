package m04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import m04.productservice.INewProductObservers;

/**
 * Shop class extends ItemList.
 * Shop allows Customer to know if new items has been added (calling isNewItems()) since last getAllItems() call.
 * @author Janis
 *
 */
public final class Shop extends ProductList {

	private ArrayList<INewProductObservers> observers = new ArrayList<INewProductObservers>();

	boolean addItem(Product item){
		if(super.addProduct(item)){
			notifyAllObservers(item);
			return true;
		}else{
			return false;
		}
	}
	
	public void addShopObserver(INewProductObservers observer){
		observers.add(observer);
				
	}
	
	public void removeShopObserver(INewProductObservers observer){
		observers.remove(observer);
	}
	
	/**
	 * Return all items
	 * @param customer - Customer in question
	 * @return all items in the Shop
	 */
	ArrayList<Product> getAllItems(Customer customer){
	    
		return (ArrayList<Product>) super.getAllItems();
		
	}
	
	/**
	 * Customer can call this method to view if new Items has arrived in the Shop
	 * @param customer - Customer in question
	 * @return true - if there are new Items in the Shop, false - if not
	 */
	private void notifyAllObservers(Product newProduct){
		
		for (INewProductObservers observer : observers) {
			observer.newProductInShop(newProduct);
		}
		
	}
	
	
}
