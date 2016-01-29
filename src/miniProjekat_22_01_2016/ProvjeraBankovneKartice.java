package miniProjekat_22_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class ProvjeraBankovneKartice {
	static ArrayList<Integer> broj = new ArrayList<>();

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		// unos kreditne kartice
		System.out.println("Unesite brojeve kreditne kartice:");
		long broj = unos.nextLong();
		unos.close();
		
		// kartica se provjerava, te se shodno tome ispisuje rezultat
		if(isValid(broj) && prefixMatched() && getSize() >= 13 && getSize() <= 16){
			cardCompany();
			System.out.println(broj + " - kartica je validna");
		}
		else{
			System.out.println(broj + " - kartica nije validna");
		}
		
	}
	
	public static boolean isValid(long number){
		boolean isValid = false;
		// ovdje testiramo je li kartica validna
		// ako nema ostatka brojeva djeljenjem sa 10, znaèi da je validna
		if((sumOfDoubleEvenPlace(number) + sumOfOddPlace()) % 10 == 0){
			isValid = true;
		}
		return isValid;
	}
	// metoda za provjeru svakog broja s desne strane, na lijevu
	// ako je rezultat mnozenja broja sa 2 veci od 9, tj nije jednocifren
	// onda mu se sabiru cifre nakon sto se odvoje (16 | 1 + 6 = 7) itd.
	public static int sumOfDoubleEvenPlace(long number){
		int rezultat = 0;
		while(number != 0){
			int lastBroj = (int)(number % 10);
			broj.add(lastBroj);
			number = number / 10;
		}
		for(int i = 1; i < broj.size(); i = i + 2){
			if((broj.get(i)) * 2 > 9){
				rezultat += (broj.get(i) * 2) % 10 + (broj.get(i) * 2) / 10;	
			} 
			else{				
				rezultat += (broj.get(i)) * 2;		
			}
		}
		return rezultat;
	}
	// suma svih brojeva na neparnim mjestima
	public static int sumOfOddPlace(){
		int rezultat = 0;
		// prolazi kroz listu u kojoj su smjesteni svi brojevi pojedinaèno
		for(int i = 0; i < broj.size(); i = i + 2){
			rezultat += broj.get(i);
		}
		return rezultat;
	}
	// provjerava da li je kartica validna provjerom prvog broja
	public static boolean prefixMatched(){
		boolean prefixMatched = false;
		if(broj.get(broj.size() - 1) == 4 || broj.get(broj.size() - 1) == 5 
				|| broj.get(broj.size() - 1) == 6 || (broj.get(broj.size() - 1) == 3 && broj.get(broj.size() - 2) == 7)){
			prefixMatched = true;
		}
		return prefixMatched;
	}
	// metoda koja vraca broj brojeva kreditne kartice
	public static int getSize(){	
		return broj.size();
	}
	public static void cardCompany(){
		if(broj.get(broj.size() - 1) == 4){
			System.out.println("Visa kartica.");
		}
		if(broj.get(broj.size() - 1) == 5){
			System.out.println("Mastercard kartica.");
		}
		if(broj.get(broj.size() - 1) == 6){
			System.out.println("Discover kartica.");
		}
		if(broj.get(broj.size() - 1) == 37){
			System.out.println("American Express kartica.");
		}
		else if(broj.get(broj.size()- 1) < 4 || broj.get(broj.size() - 1) >37){
			System.out.println("Nepoznata kartica.");
		}
	}
}

