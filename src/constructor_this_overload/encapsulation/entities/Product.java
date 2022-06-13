package constructor_this_overload.encapsulation.entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product() {
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	// Methods Gets e Sets
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}
	
//	Unusable, to protect the quantity, for that there is "addProduct and "removeProduct"
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}

	public double TotalValueInStock() {
		return price * quantity;	
	}

	public void addProduct(int addQuantity) {
		this.quantity += addQuantity;
	}
	
	public void removeProduct(int RemQuantity) {
		this.quantity -= RemQuantity;
	}
	
	public String toString () {
		return name
				+ ", $ "
				+ String.format(" %.2f", price)
				+ ", "
				+ quantity 
				+ " units, total: $" 
				+ String.format(" %.2f", TotalValueInStock());
	}
	
	
	
}
