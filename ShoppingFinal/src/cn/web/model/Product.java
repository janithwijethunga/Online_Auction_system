package cn.web.model;

public class Product {

	private int id;
	private String name;
	private String category;
	private double price;
	private String image;
	
	public Product() {
		
	}
	public Product(int id, String name, String category, double price, String image) {
		
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public double getPrice() {
		return price;
	}
	public String getImage() {
		return image;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", image="
				+ image + "]";
	}
	
	

	
	
	
	
	
}
