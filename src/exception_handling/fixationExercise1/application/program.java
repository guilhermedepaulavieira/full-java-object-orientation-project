package exception_handling.fixationExercise1.application;

import java.util.Locale;
import java.util.Scanner;

import exception_handling.fixationExercise1.model.entities.Account;
import exception_handling.fixationExercise1.model.exception.BusinessException;


public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter account Data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();		
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine(); 
		
		System.out.print("Initial Balance: ");
		Double balance = sc.nextDouble();
		
		System.out.print("withdraw Limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
				
		System.out.print("\nEnter amount for whitdraw: ");
		Double withdraw = sc.nextDouble();
		
		try {
			acc.withdraw(withdraw);
			System.out.printf("New balance: %.2f", acc.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}
}
