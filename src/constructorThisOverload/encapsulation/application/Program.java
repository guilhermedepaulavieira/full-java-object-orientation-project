package constructorThisOverload.encapsulation.application;

import java.util.Locale;
import java.util.Scanner;

import constructorThisOverload.encapsulation.entities.Product;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = entrada.next();
		System.out.print("Price: ");
		Double price = entrada.nextDouble();
//		System.out.print("Quantity in stock: ");
//		int quantity = entrada.nextInt();
		Product product = new Product(name, price);
		
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.print("\nEnter the number of products to be added in stock: ");
		int addQuantity = entrada.nextInt();
		product.addProduct(addQuantity);
		System.out.println("\nUpdated data: " + product);
		
		System.out.print("\nEnter the number of products to be removed from stock: ");
		int remQuantity = entrada.nextInt();
		product.removeProduct(remQuantity);
		System.out.println("\nUpdated data: " + product);
		
		
		
		entrada.close();
	}
}
