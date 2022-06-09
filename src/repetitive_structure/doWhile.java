package repetitive_structure;

import java.util.Locale;
import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		char resp;
		
		do {
			System.out.print("Enter the temperature in Celsius: ");
		
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			
			System.out.printf("Fahrenheit equivalent: %.1f%n", F);
			System.out.print("Do you want to repeat (y/n)? ");
			
			resp = sc.next().charAt(0);
			
		} while (resp != 'n');
		
		sc.close();
	}
}
