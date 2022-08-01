package functionalProgramAndLambdaExpression.predicate.application;

import java.util.ArrayList;
import java.util.List;
import functionalProgramAndLambdaExpression.predicate.entities.Product;


public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		double min = 100.0;

		list.removeIf(p -> p.getPrice() >= min); // Lambda Inline
		
//		Predicate<Product> pred = p -> p.getPrice() >= min;
//		list.removeIf(pred); // Lambda Declared
		
		
//		list.removeIf(new ProductPredicate()); Predicate Implementation

		for (Product p : list) {
			System.out.println(p);
		}
	}
}