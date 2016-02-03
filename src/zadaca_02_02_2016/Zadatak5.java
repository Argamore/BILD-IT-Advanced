package zadaca_02_02_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		// korisnik unosi brojeve u prvu matricu
		System.out.println("Unesite brojeve u prvu matricu (3x3)");
		double[][] a = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = unos.nextDouble();
			}
		}
		// korisnik unosi brojeve u drugu matricu
		System.out.println("Unesite brojeve u drugu matricu (3x3)");
		double[][] b = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = unos.nextDouble();
			}
		}
		unos.close();
		// poziva se metoda za sabiranje
		double[][] c = addMatrix(a, b);
		// te se printa rezultat tog sabiranja
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] rezultat = new double[a.length][a[0].length];
		// u petlji se sabiru elementi dvije matrice
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				rezultat[i][j] = a[i][j] + b[i][j];
			}
		}
		// te se vraæa završna petlja kao rezultat
		return rezultat;
	}

}
