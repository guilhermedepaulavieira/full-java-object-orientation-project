package sequential_structure;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		float length, widht, price;

		Scanner sc = new Scanner(System.in);

		System.out.println("inform the widht:");
		widht = sc.nextFloat();

		System.out.println("inform the length:");
		length = sc.nextFloat();
		
		System.out.println("inform the price per square meter: ");
		price = sc.nextFloat();

		float area = length * widht;
		float totalPrice = length * widht * price;
		System.out.println();
		System.out.printf("AREA = %.2f\n", area);
		System.out.printf("Price = %.2f\n", totalPrice);

		sc.close();
	}

}
