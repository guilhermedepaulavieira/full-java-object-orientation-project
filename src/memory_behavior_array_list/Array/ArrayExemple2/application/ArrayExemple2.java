package memory_behavior_array_list.Array.ArrayExemple2.application;

import java.util.Locale;
import java.util.Scanner;

import memory_behavior_array_list.Array.ArrayExemple2.entities.Product;



public class ArrayExemple2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			entrada.next();
			String name = entrada.nextLine();
			double price = entrada.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();			
		}
		
		
		System.out.printf("AVARAGE PRICE: %.2f\n", sum/n);
		
		entrada.close();
	}
}
