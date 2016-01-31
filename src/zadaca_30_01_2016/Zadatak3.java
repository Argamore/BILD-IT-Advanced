package zadaca_30_01_2016;

public class Zadatak3 {
			// preuzeto sa stranice stackoverflow.com 
			/*
			 * http://stackoverflow.com/questions/4087468/ssn-regex-for-123-45-6789-or-xxx-xx-xxxx
			 */
			// u suštini, ovo je format po kojem bi se trebao pisati SSN
	public static void main(String[] args) {
		try (java.util.Scanner unos = new java.util.Scanner(System.in)){
			// format po kojem se upisuje SSN
			String formatSSN = "^\\d{3}-\\d{2}-\\d{4}$";
			String ssn = "";
			// petlja se vrti dokle god ne bude unos jednak formatu SSN-a
			while(!ssn.matches(formatSSN)){
				System.out.print("Please write your Social Security Number: ");
				ssn = unos.next();
				if(!ssn.matches(formatSSN))
					System.out.println("It seems you made a mistake. Don't forget the - ");
			}
			// ako je sve uneseno kako treba, ispisuje SSN
			System.out.println("\nYour Social Security Number: "+ssn);
		}
		catch (Exception e) {
			System.err.println("Input error!");
		}
	}
}
