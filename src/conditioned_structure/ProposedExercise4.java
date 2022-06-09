package conditioned_structure;

import java.util.Locale;
import java.util.Scanner;

public class ProposedExercise4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int minutes = entrada.nextInt();
		
		double account = 50.0;
		if (minutes > 100) {
			account += (minutes - 100) * 2.0;
		}
		System.out.printf("Account value = $ %.2f%n", account);
		
		
		
		entrada.close();
	}
}
