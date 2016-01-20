package zadaca_20_01_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		// uzimamo od korisnika poèetnu godinu
		System.out.println("Unesite poèetnu godinu: ");
		int pocetnaGodina = unos.nextInt();
		// uzimamo od korisnika krajnju godinu
		System.out.println("Unesite krajnju godinu: ");
		int krajnjaGodina = unos.nextInt();
		unos.close();
		int brojacPrestupnih = 0;
		// petlja koja ide od poèetne do krajnje godine 
		for(int i = pocetnaGodina; i <= krajnjaGodina; i++){
			// ispitivanje da li je godina prestupna
			if(i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)){
				// kad se ispise 10 godina, prelazi se u novi red
				if(brojacPrestupnih != 0 && brojacPrestupnih % 10 == 0){
					System.out.println();
				}
				// brojanje prestupnih godina
				brojacPrestupnih++;
				// printanje rezultata
				System.out.print(i + " ");
			}
		}
	}
}
