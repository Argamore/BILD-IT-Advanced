/*
 * Author: Sefer Kuduzovic
 */
package zadaca_18_01_2016;

import java.util.Scanner;

public class Zadatak1 {
	// metoda koja provjerava djeljivost 
	public static void naKomade(int broj){
		int temp = broj;
		int djelitelj = 2;
		// while petlja vrti dokle god se moze broj dijeliti
		while (broj > 1){
			if (broj % djelitelj == 0){
				broj = broj / djelitelj;
				if (broj >= 2)
					System.out.print(djelitelj + " * ");
				// ako se ne moze više dijeliti, dodaje se znak jednakosti te jedini broj sa kojim se moze dijeliti
				else
					System.out.print(djelitelj + " = ");
			}
			// ako broj nije djeljiv sa 2, djelitelj se povecava
			else djelitelj++;
		}
		// te se ispisuje pocetni broj koji se dobiva mnozenjem brojeva prije njega
		System.out.print(temp);
	}

	public static void main(String[] args) {
		// korisnik unosi broj
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		// koji se salje metodi
		naKomade(unos.nextInt());
		unos.close();
	}
}
