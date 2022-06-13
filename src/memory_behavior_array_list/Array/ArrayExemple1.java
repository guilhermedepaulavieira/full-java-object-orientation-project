package memory_behavior_array_list.Array;

import java.util.Locale;
import java.util.Scanner;

public class ArrayExemple1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];

		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}

		System.out.printf("AVERAGE HEIGHT: %.2f\n", sum / n);

		sc.close();
	}
}
