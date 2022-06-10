package constructorThisOverload.overload.entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public Product() {
	}

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// more than two builders
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}


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
