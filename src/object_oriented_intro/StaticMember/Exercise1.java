package object_oriented_intro.StaticMember;

import java.util.Locale;
import java.util.Scanner;

import object_oriented_intro.StaticMember.util.Exercise1StaticMember;

public class Exercise1 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		double result = Exercise1StaticMember.dollarToReal(dollarPrice, amount);
		System.out.printf("Amount to be paid in reais: %.2f", result);
				
		sc.close();
	}
}
