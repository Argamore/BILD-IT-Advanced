/*
 * Author: Sefer Kuduzovic
 */
package zadaca_16_01_2016;

import java.util.Scanner;

public class Zadatak5 {
	// metoda prima broj bacanja, te na osnovu toga vrsi racunanje
	public static void flipCoin(int a){
		int glava = 0;
		int pismo = 0;
		// petlja se izvrsava te se pritom dobivaju random brojevi 0 i 1
		// ako je random broj 0 - povecava se brojac za glavu
		// ako je random broj 1 - povecava se brojac za pismo
		for (int i = 0; i < a; i++){
			int baciCoin = (int)(Math.random()*2);
			if (baciCoin == 0)glava++;
			else if(baciCoin == 1)pismo++;
		}
		// ispisuje se rezultat bacanja korisniku
		System.out.println("Kovanica je pokazala "+glava+" puta glavu i "+pismo+" puta pismo.");
	}

	public static void main(String[] args) {
		// korisnik prosljeðuje broj metodi koliko æe se puta kovanica baciti
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj bacanja kovanice: ");
		flipCoin(unos.nextInt());
		unos.close();
	}

}
