package conditioned_structure;

import java.util.Scanner;

public class Main {
	 
	 public static void main(String[] args) {
		
	 int x = 5;
	 Scanner entrada = new Scanner(System.in);
	 int hours = 0;
	 
	 System.out.println("Good Morning"); 
	 
	 
	 if (x < 0) {
		 System.out.println("Good afternoon"); 
	 }
	 System.out.println("Good Evening"); 
	 
	 
	 
	 System.out.println("-----------------");
	 System.out.println("What times ?"); 
	 hours = entrada.nextInt();
			 
	 if (hours < 12) {
		 System.out.println("Good Morning"); 
	 } else if (hours < 18) {
			 System.out.println("Good afternoon"); 
	 } else {
			 System.out.println("Good Evening"); 
	 }
	 
	 
	 
	 entrada.close();
	 }
 }