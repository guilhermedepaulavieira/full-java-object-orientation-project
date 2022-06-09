package sequential_structure;

import java.util.Locale;

public class DataOutput {
	 
	 public static void main(String[] args) {
		
		 System.out.print("Hello World!");
		 System.out.println("Good Morning!");
		 
		 int y = 32;
		 
		 System.out.println(y);
		 
		 double x = 10.35784;
		 
		 System.out.println(x);
		 
		 System.out.printf("%.2f%n", x);
		 System.out.printf("%.4f\n", x);

		 Locale.setDefault(Locale.US);
		 System.out.printf("%.2f%n", x);
		 System.out.printf("%.4f\n", x);
		 
		 System.out.println("RESULT = " + x + " METERS");
		 
		 System.out.printf("RESULT = %.2f METERS%n", x);
		 
		 String name = "Maria";
		 int age = 31;
		 double income = 4000.0;
		 System.out.printf("%s is %d years old and earn $ %.2f dollars%n", name, age, income);
		 
	}
	 
 }