/*
 * Sefer Kuduzovic
 */
package zadaca_17_01_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak3 {
	public static boolean equals(int[] niz1, int[] niz2){
		// provjerava da li je neki od nizova prazan:
		if (niz1 == null || niz2 == null){
			System.out.println("PRAZAN NIZ.");
			System.exit(0);
		}
		// ako se zeli provjera brojeva u nizu, bez obzira na poziciju, obrisati komentare ispod
		//Arrays.sort(niz1);
		//Arrays.sort(niz2);
		// provjerava da li su nizovi jednaki:
		if(Arrays.equals(niz1, niz2)){
			return true;
		}else return false;
	}

	public static void main(String[] args) {
		// unos nizova
		Scanner unos = new Scanner(System.in);
		int[] niz1 = new int[10];
		int[] niz2 = new int[10];
		System.out.println("Unesite èlanove prvog niza: ");
		for (int i = 0; i < niz1.length; i++){
			niz1[i] = unos.nextInt();
		}
		System.out.println("Unesite èlanove drugog niza: ");
		for (int i = 0; i < niz2.length; i++){
			niz2[i] = unos.nextInt();
		}
		// slanje nizova metodi:
		equals(niz1,niz2);
		// ako metoda vrati "true" nizovi su striktno jednaki
		if (equals(niz1, niz2) == true){
			System.out.println("Nizovi su striktno jednaki.");
			// ako nisu, vraca da nisu je l'.
		} else {
			System.out.println("Nizovi nisu jednaki.");
		}
		unos.close();
	}
}
