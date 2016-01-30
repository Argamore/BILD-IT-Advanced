package zadaca_29_01_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		// unosi se n (n x n) od matrice
		System.out.println("Unesite broj n za 2D matricu");
		int n = unos.nextInt();
		unos.close();
		// kad korisnik unese, poziva se metoda
		printMatrix(n);

	}
	// metoda koja printa matricu korisniku
	public static void printMatrix(int n){
		//  petlja za redove
		for(int i = 0; i < n; i++){
			//petlja za kolone
			for(int j = 0; j < n; j++){
				// print broja
				System.out.print((int)(Math.random() * 2) + " ");
				// ako petlja dodje do kraja, prelazi se u novi red
				if(j == n - 1){
					System.out.println();
				}
			}
		}
	}

}