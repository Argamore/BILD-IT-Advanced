package zadaca_21_01_2016;

import java.util.Scanner;

public class Zadatak5 {
	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		// uzimanje passworda od korisnika
		System.out.println("Unesite password za provjeru ");
		String pass = unos.next();
		unos.close();
		int brojSlova = 0, brojBrojeva = 0;
		//prolazak kroz password slovo po slovo (broj po broj :O)
		for(int i = 0; i < pass.length(); i++){
			char karakter = pass.charAt(i);
			// testiranje karaktera, da li je broj, veliko ili malo slovo
			if((karakter >= '0' && karakter <= '9')||(karakter >= 'A' && karakter <= 'Z')||(karakter >= 'a' && karakter <= 'z')){
				// brojanje malih i velikih slova
				if((karakter >= 'a' && karakter <= 'z')||(karakter >= 'A' && karakter <= 'Z')){
					brojSlova++;
				}
				// brojanje brojeva
				if((karakter >= '0' && karakter <= '9')){
					brojBrojeva++;
				}
			}
		}
		//provjeravanje da li password ima dovoljno ukupno karaktera i dovoljno brojeva, i stampanje odgovarajuceg rezultata
		if((brojSlova + brojBrojeva >= 8) && brojBrojeva >= 2){
			System.out.println("Password je validan");
		}else{
			System.out.println("Password nije validan");
		}

	}

}