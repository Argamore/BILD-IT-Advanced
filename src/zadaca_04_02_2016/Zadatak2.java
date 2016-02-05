package zadaca_04_02_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		try (Scanner unos = new Scanner(System.in)) {
			// pitamo korisnika za velicinu matrice, nakon cega on unosi elemente u istu
			System.out.println("Unesite 'x' za matricu 'x * x'");
			int x = unos.nextInt();
			int[][] matrica = new int[x][x];
			System.out.println("Unesite elemente matrice: ");
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < x; j++) {
					matrica[i][j] = unos.nextInt();
				}
			}
			int[][] matrica2 = new int[x][x];
			// isto naravno kao i gore..
			System.out.println("Unesite elemente druge matrice: ");
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < x; j++) {
					matrica2[i][j] = unos.nextInt();
				}
			}
			unos.close();
			// šaljemo matrice metodi, koja vraæa "boolean" tip, nakon èega provjeravamo dati "return"
			// te shodno time ispisujemo poruku:
			if (equals(matrica, matrica2)) {
				System.out.println("Unesene matrice su striktno jednake");
			} else {
				System.out.println("Unesene matrice nisu striktno jednake");
			}
		} catch (Exception e) {
			System.err.println("Greška! Restartuj program.");
		}

	}

	public static boolean equals(int[][] m1, int[][] m2) {
		boolean equals = true;
		// petlja prolazi kroz matrice
		// te se provjeravaju elementi istih pozicija da li su jednaki / isti..
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++) {
				if (m1[i][j] != m2[i][j]) {
					// ako nisu, prekida se i return postaje FALSE
					equals = false;
					break;
				}
			}
		}
		// ako sve proðe, onda vraæa true :)
		return equals;
	}

}