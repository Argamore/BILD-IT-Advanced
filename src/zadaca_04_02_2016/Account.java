package zadaca_04_02_2016;

import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated;

	// konstruktor bez argumenata
	Account() {

	}

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	// gettersi i settersi
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	// metoda za postavljanje mjeseène rate
	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	// metoda koja racuna mjesecnu kamatu..
	public double getMonthlyInterestsRate() {
		return (annualInterestRate / 100) / 12;
	}

	// te metoda koja vraæa tu kamatu
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestsRate();
	}

	// metoda za polaganje novca
	public void deposit(double deposit) {
		balance += deposit;
	}

	// te metoda za skidanje istog
	public void withdraw(double withdraw) {
		if (balance - withdraw >= 0) {
			balance -= withdraw;
		}
	}
}