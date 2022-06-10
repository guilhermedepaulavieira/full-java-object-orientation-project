package object_oriented_intro.exercise1.application;

import java.util.Locale;
import java.util.Scanner;

import object_oriented_intro.exercise1.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		
		
		Product product = new Product();
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = entrada.next();
		System.out.print("Price: ");
		product.price = entrada.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = entrada.nextInt();
		
		
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
