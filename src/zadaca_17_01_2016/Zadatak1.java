/*
 * Author: Sefer Kuduzovic
 */
package zadaca_17_01_2016;

import java.util.Scanner;

public class Zadatak1 {
	// metoda koja provjerava da li je broj prost
	public static boolean prostBroj(int broj) {
		for (int i = 2; i <= broj / 2; i++) {
			if (broj % i == 0)
				return false;
		}
		return true;
	}
	//metoda koja ispisuje sve brojeve u intervalu koji je korisnik unio
	public static void prostiBrojevi(int a, int b, int c) {
		int brojac = 0;
		for (int i = a; i < b; i++) {
			if (prostBroj(i) == true) {
				System.out.print(i + " ");
				brojac++;
				if (brojac % c == 0)
					System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// korisnik unosi podatke
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite interval pocetka i kraja te koliko ce puta po liniji ispisati se: ");
		prostiBrojevi(unos.nextInt(),unos.nextInt(),unos.nextInt());
		unos.close();
	}
}