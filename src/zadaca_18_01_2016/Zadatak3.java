/*
 * Author: Sefer Kuduzovic
 */
package zadaca_18_01_2016;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak3 {
	// metoda
	public static void displaySortedNumbers(double num1, double num2, double num3){
		// metoda ih strpa u niz
		double[] niz = new double[3];
		niz[0] = num1;
		niz[1] = num2;
		niz[2] = num3;
		// koji sortira
		Arrays.sort(niz);
		// i ispiše.
		System.out.println("Vaši brojevi poredani po velièini: ");
		for (int i = 0; i < niz.length; i++){
			System.out.print(niz[i]+" ");
		}
	}

	public static void main(String[] args) {
		// korisnik unese 3 decimalna broja
		double broj1; double broj2; double broj3;
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite Vaše brojeve: ");
		broj1 = unos.nextDouble();
		broj2 = unos.nextDouble();
		broj3 = unos.nextDouble();
		// posaljemo ih metodi
		displaySortedNumbers(broj1,broj2,broj3);
		unos.close();
	}

}
