package functionalProgramAndLambdaExpression.comparator1.application;

import java.util.Comparator;

import functionalProgramAndLambdaExpression.comparator1.entities.Product;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
}