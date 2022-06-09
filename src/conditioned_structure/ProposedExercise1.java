package conditioned_structure;

import java.util.Locale;
import java.util.Scanner;

public class ProposedExercise1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		double result = n1 + n2;
		
		System.out.println("Final Result = " + result);
		if (result < 60) {
			System.out.println("disapproved");
		} else {
			System.out.println("approved");			
		}
		
		sc.close();
	}

}
