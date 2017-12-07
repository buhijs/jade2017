package m04;

import m04.productservice.Category;

public class Product {
	
	private String name;
	private Category category;
	private double price;
	private double weight;
	
    public Product(String name, double cost, Category category, double weight){
    	setName(name);
    	setPrice(cost);
    	setCategory(category);
    	setWeight(weight);
    }
	
    public void setCategory(Category category) {
		this.category = category;
	}
    
    public void setName(String name) {
		this.name = name;
	}
    
    public void setPrice(double price) {
		this.price = price;
	}
    
    public void setWeight(double weight) {
		this.weight = weight;
	}
    
	public String getName() {
		return name;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", price=" + price + "]";
	}

}
