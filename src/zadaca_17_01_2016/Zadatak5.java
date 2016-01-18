/*
 * Author: Sefer Kuduzovic
 */
package zadaca_17_01_2016;

import java.util.Scanner;

public class Zadatak5 {
	// metoda koja sortira uzetu matricu
	public static double[ ][ ] sortRows(double[ ][ ] niz){
		// pravimo novu matricu, koja ce se sortirati
		double[][] sortiranaMatrica = new double[niz.length][niz[0].length];
		
		// prepisujemo staru matricu u novu
		for (int i = 0; i < niz.length; i++)
			for (int j = 0; j < niz[0].length; j++)
				sortiranaMatrica[i][j] = niz[i][j];
		
		// te je uz pomoc petlje sortiramo provjeravajuci brojeve u svakom nizu
		for (int i = 0; i < sortiranaMatrica.length; i++) {
			for (int j = 0; j < sortiranaMatrica[0].length - 1; j++) {
				double minBroj = sortiranaMatrica[i][j];
				int x = j;
				for (int kolona = j + 1; kolona < sortiranaMatrica[0].length; kolona++) {
					// ako je broj veci, tad on uzima njegovu vrijednost
					if (minBroj > sortiranaMatrica[i][kolona]) {
						minBroj = sortiranaMatrica[i][kolona];
						x = kolona;
					}
				}
				if (x != j) {
					sortiranaMatrica[i][x] = sortiranaMatrica[i][j];
					sortiranaMatrica[i][j] = minBroj;
				}
			}
		}
		return sortiranaMatrica;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		// unosimo matricu
		System.out.println("Unesite broj redova i broj kolona: ");
		
		double matrica[][] = new double[unos.nextInt()][unos.nextInt()];
		
		System.out.println("Unesite Vašu matricu: ");
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = unos.nextDouble(); 
			}
		}
		// saljemo matricu u metodu
		double[][] sortiranaMatrica = sortRows(matrica);
		// kada metoda uradi svoje, printamo sortiranu matricu
		System.out.println("Vaša sortirana matrica izgleda ovako: ");
		for (int i = 0; i < sortiranaMatrica.length; i++) {
			for (int j = 0; j < sortiranaMatrica[i].length; j++) {
				System.out.print(sortiranaMatrica[i][j] + " ");
			}
			System.out.println();
		}
		unos.close();
	}
}
