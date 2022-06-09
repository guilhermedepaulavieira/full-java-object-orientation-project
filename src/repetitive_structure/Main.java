package repetitive_structure;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);

			int x = entrada.nextInt();
			int sum = 0;
			while (x != 0) {
				sum += x;
				x = entrada.nextInt();
			}
			 
			System.out.println(sum);
			entrada.close();
	}
}