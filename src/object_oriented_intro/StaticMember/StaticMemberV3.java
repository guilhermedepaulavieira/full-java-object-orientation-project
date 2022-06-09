package object_oriented_intro.StaticMember;

import java.util.Locale;
import java.util.Scanner;

import object_oriented_intro.StaticMember.util.CalculatorV2ForStaticMemberV3;

public class StaticMemberV3 {
	// Or member of Class
	// Diferent of member of instance
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		Calculator calc = new Calculator();
		// No need more, now, you can use the Class directly
		
		double radius = sc.nextDouble();
		
		double c = CalculatorV2ForStaticMemberV3.circumference(radius);
		
		double v = CalculatorV2ForStaticMemberV3.volume(radius);
		
		System.out.printf("Cirvumference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", CalculatorV2ForStaticMemberV3.PI);
	
	
		sc.close();
	}
	
}
