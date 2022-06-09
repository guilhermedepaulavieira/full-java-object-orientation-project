package sequential_structure;

public class MathFunction {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("square root of " + x + " = " + A);
		System.out.println("square root of " + y + " = " + B);
		System.out.println("square root of 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " raised to " + y + " = " + A);
		System.out.println(x + " raise to squared = " + B);
		System.out.println("5 raise to squared = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("absolute value of " + y + " = " + A);
		System.out.println("absolute value of " + z + " = " + B);

		// More Informations: java.lang.Math
	}
}
