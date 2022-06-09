package sequential_structure;

import java.util.Locale;
import java.util.Scanner;

public class DataInput {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		System.out.println("you typed: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("you typed: " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("you typed: " + z);
		System.out.printf("you typed: %.2f%n", z);
		
		char a;
		a = sc.next().charAt(1);
		System.out.println("you typed: " + a);
		
		String b;
		int c;
		double d;
		b = sc.next();
		c = sc.nextInt();
		d = sc.nextDouble();
		System.out.println("DATA TYPED: ");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		String s1, s2, s3;
		int Si;
		
		Si = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DATA TYPED:");
		System.out.println(Si);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}
}
