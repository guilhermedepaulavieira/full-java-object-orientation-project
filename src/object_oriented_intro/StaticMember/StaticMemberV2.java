package object_oriented_intro.StaticMember;

import java.util.Locale;
import java.util.Scanner;

import object_oriented_intro.StaticMember.util.Calculator;

public class StaticMemberV2 {
	// Or member of Class
	// Diferent of member of instance
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Cirvumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", calc.PI);
	
	
		sc.close();
	}
	
}
