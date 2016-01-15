/*
 * Author: Sefer Kuduzovic
 */
package zadaca_15_01_2016;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// napravimo znaèi LISTU brojeva
		Scanner unos = new Scanner(System.in);
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		// tutnemo boolean da moze da se vrti program dok se ne unese NULA
		boolean start = true;
		int maxy = 0; 
		int brojac = 0;
		
		// glava programa.. ovdje se magija odvija:
		System.out.println("Dokle god ne uneseš 0, možeš pisati brojeve: ");
		do{
			// korisnik unosi brojeve, provjerava se najveci, pa se onda broji koliko se puta on ponovio..
			int broj = unos.nextInt();
			brojevi.add(broj);
			if (broj > maxy)maxy = broj;
			if (broj == 0)start = false;
		}while(start != false);
		// kad se pritisne nula, provjerava se citava lista, i kada se nadje max broj, povecava se brojac za 1
		for (int broj : brojevi){
			if (broj == maxy){
				brojac++;
			}
		}
		// i sve se to lijepo ispise ovdje:
		System.out.println("Najveæi broj je "+maxy+" i on se ponovio "+brojac+" puta.");
		unos.close();
	}

}
