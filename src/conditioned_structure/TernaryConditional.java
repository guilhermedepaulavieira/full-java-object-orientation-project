package conditioned_structure;

import java.util.Scanner;

public class TernaryConditional {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double price = 34.5;
		double discount;
		if ( price < 20.0 ) {
			discount = price * 0.1;
		} else {
			discount = price * 0.05;
		}
		
		System.out.println(discount);
		
		
		// OR Ternary Conditional
		
		double price2 = 34.5;
		double discount2 = (price2 < 20.0) ? price2 * 01 : price2 * 0.05;
		
		System.out.println(discount2);
		
		
		entrada.close();
	}
}
