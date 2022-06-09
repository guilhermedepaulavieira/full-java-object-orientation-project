package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name1 = sc.next();
		int age1 = sc.nextInt();
		String name2 = sc.next();
		int age2 = sc.nextInt();
		
		double average = (double) (age1 + age2) / 2; // or 2.0
		// Casting or 2.0
		
		System.out.printf("The average age of %s and %s is %.1f years", name1, name2, average);
		
		sc.close();	
	}
}
