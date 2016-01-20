package zadaca_20_01_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		// korisnik unosi podatke
		System.out.println("Unesite iznos investicije: ");
		double iznosInvesticije = unos.nextDouble();							
		System.out.println("Unesite godisnju interesnu stopu: ");
		double godisnjaInteresnaStopa = unos.nextDouble() / 100;			//godisnja interesna stopa se dijeli sa 100 da se dobije procenat
		System.out.println("Unesite broj godina: ");
		int brojGodina = unos.nextInt();
		unos.close();
		// buduca vrijednost investicije se raèuna po datoj formuli
		double buducaVrijednostInvesticije = iznosInvesticije * Math.pow((1 + godisnjaInteresnaStopa / 12), brojGodina * 12);
		// printanje rezultata		
		System.out.println("Buduca vrijednos investicije je: " + (int)(buducaVrijednostInvesticije * 100) / 100.0);	

	}

}
