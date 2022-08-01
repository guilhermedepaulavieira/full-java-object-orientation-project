package functionalProgramAndLambdaExpression.consumer.application;

import java.util.ArrayList;
import java.util.List;

import functionalProgramAndLambdaExpression.consumer.entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double factor = 1.1;
		
		list.forEach(p -> p.setPrice(p.getPrice() * factor)); // lambda Inlaine

//		list.forEach(new PriceUpdate()); Implements Interface

//		double factor = 1.1;
//		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor); // Lambda Declared
				
		list.forEach(System.out::println);
	}
}