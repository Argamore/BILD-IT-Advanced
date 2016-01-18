/*
 * Author: Sefer Kuduzovic
 */
package zadaca_17_01_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {
	// metoda koja sortira niz po velicini od najmanjeg do najveceg
	public static double min(double[] array){
		Arrays.sort(array);
		return array[0];
	}
	// unos podataka u niz i njegovo slanje u metodu: 
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Molimo unesite 10 brojeva u niz: ");
		double[] niz = new double[10];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = unos.nextDouble();
		}
		// printanje rezultata
		System.out.println("Najmanji broj u nizu je " + min(niz));
		unos.close();
	}
}