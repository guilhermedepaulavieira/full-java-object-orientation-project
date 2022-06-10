package constructorThisOverload.exercise.entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	
	// Taxa de 5 dolar por saque, somente por deposito a conta aumenta o preço
	// Programa para que seja realizo deposito inicial ou não.
	
	public Account(){
	}

	public Account(int number, String name) {
		this.number = number;
		this.holder = name;
		
	}
	
	public Account(int number, String name, double initialDeposit) {
		this.number = number;
		this.holder = name;
		deposit(initialDeposit);
	}

	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ holder 
				+ ", Balance: " 
				+ String.format("%.2f", balance);
	}
	
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void withdraw(double withdraw) {
		this.balance -= withdraw + 5.0; // 5.0 TAX
	}
	
	public int getNumber() {
		return number;
	}

	public String getName() {
		return holder;
	}

	public void setName(String name) {
		this.holder = name;
	}

	public double getAmount() {
		return balance;
	}
	
}
