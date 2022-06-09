package repetitive_structure;

import java.util.Locale;
import java.util.Scanner;

public class ExerciseSolved2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int age = entrada.nextInt();
		int sum = 0;
		int count = 0;
		
		while (age >= 0) {
			sum += age;
			count ++;
			age = entrada.nextInt();
		} 
		
		if (count > 0) {
			double media = (double) sum / count;
			System.out.printf("%.2f%n", media);
		} else {
			System.out.println("Impossible to calcule.");
		}
		
		
		

		entrada.close();
	}

}
