package object_oriented_intro.exercise2.application;

import java.util.Scanner;

import object_oriented_intro.exercise2.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee emp = new Employee();
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("\nEmployee: " + emp);
		
		System.out.print("\nWhich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("\nUpdate data: " + emp);
		
		sc.close();
	}
}
