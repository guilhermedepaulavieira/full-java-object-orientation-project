package functionalProgramAndLambdaExpression.function.util;

import java.util.function.Function;

import functionalProgramAndLambdaExpression.function.entities.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}