package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimeter = 2.0 * (base + altura);
		double diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		
		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimeter);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);
		
		sc.close();

	}
}
