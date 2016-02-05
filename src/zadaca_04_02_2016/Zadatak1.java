package zadaca_04_02_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak1 {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Unesite 'x' za matricu 'x * x'");
			int x = in.nextInt();
			double[][] matrica = new double[x][x];
			System.out.println("Unesite èlanove matrice!");
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < x; j++) {
					matrica[i][j] = in.nextDouble();
				}
			}
			in.close();
			// pozivamo metodu te printamo rezultat
			double[][] matrica2 = sortRows(matrica);
			for (int i = 0; i < matrica2.length; i++) {
				for (int j = 0; j < matrica2.length; j++) {
					System.out.print(matrica2[i][j] + " ");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.err.println("Greška! Restartuj program.");
		}
	}
	public static double[][] sortRows(double[][] m) {
		ArrayList<Double> sortiraj = new ArrayList<>();
		double[][] matrica = new double[m.length][m.length];
		
		// prolazimo kroz redove i kolone, te zatim dodajemo taj red u listu, gdje se ona sortira
		// i vraæa na svoje mjesto
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				sortiraj.add(m[i][j]); // 
			}
			// pozivamo klasu za sortiranje
			Collections.sort(sortiraj);
			
			for (int j = 0; j < m.length; j++) {
				matrica[i][j] = sortiraj.get(j);
			}
			// kada se doda, brišemo listu da mogu novi brojevi..
			sortiraj.clear();
		}
		// te vraæamo nazad matricu
		return matrica;
	}
}