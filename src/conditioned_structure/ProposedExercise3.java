package conditioned_structure;

import java.util.Scanner;

public class ProposedExercise3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		if (a < b && a < c) {
			System.out.println("SMALLER = " + a);
		} else if (b < c) {
			System.out.println("SMALLER = " + b);
		} else {
			System.out.println("SMALLER = " + c);
		}
		
		
		
		entrada.close();
	}
}
