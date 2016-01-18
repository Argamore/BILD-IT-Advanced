/*
 * Author: Sefer Kuduzovic
 */
package zadaca_18_01_2016;

import java.util.Random;

public class Zadatak4 {
	// metoda
	public static void dajRandom(int brojPoLiniji){
		// poziva se random 
		Random broj = new Random();
		// glavna petlja
		int brojac = 0;
		for (int i = 1; i < 201; i++){
			// za sve brojeve ispod 100, generiše se random broj u intervalu od 65 - 89, sto predstavlja
			// ASCII uppercase karaktere te ih printa
			if (i <= 100){
				int range = 89 - 64 + 1;
				int x = broj.nextInt(range) + 65;
				System.out.print((char)x+ " ");
				brojac++;
				// ako je brojac jednak broj printanja po liniji, pravi novu liniju
				if (brojac == brojPoLiniji){
					System.out.println();
					brojac = 0;
				}
			}
			// ista stvar, samo sto generise brojeve od 1 do 100
			if (i <= 201 && i >100){
				brojac++;
				int brojRandom = (int)(Math.random()*100)+1;
				System.out.print(brojRandom+ " ");
				if (brojac == brojPoLiniji){
					System.out.println();
					brojac = 0;
				}
		}
		}
	}
	// poziva se metoda sa brojem printanja po liniji
	public static void main(String[] args) {
		dajRandom(10);
	}
}
