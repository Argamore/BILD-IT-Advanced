package zadaca_04_02_2016;

public class Zadatak4 {
	public static void main(String[] args) {
		// instanciranje klase i pravljenje novog objekta
		Account akaunt1 = new Account(13, 3700);
		// postavljamo godisnju ratu
		Account.setAnnualInterestRate(5.3);  
		// podizanje i polaganje novca // test //
		akaunt1.withdraw(1300);   
		akaunt1.deposit(500);
		
		// print balansa, rate i datuma otvaranja
		
		System.out.println("Balans: " + akaunt1.getBalance() + 
				"\nMjesecna rata: " + akaunt1.getMonthlyInterest()
				+ "\nDatum otvaranja: " + akaunt1.getDateCreated());
	}
}