/*
 * Author: Sefer Kuduzovic
 */
package zadaca_16_01_2016;

import java.util.Scanner;

public class Zadatak4 {
	public static void printMatrix(int n){
		// pravimo 2D matricu na osnovu datog unosa:
		int [][] matrica = new int[n][n];
		
		// u matricu upisujemo 0 ili 1 
		for ( int i = 0; i < matrica.length; i++ )
		{
			for ( int j = 0; j < matrica.length; j++ )
			{
				int broj = (int)(Math.random()*2);
				matrica[i][j] = broj; 
			}
		}
		// vršimo ispis matrice
		for ( int i = 0; i < matrica.length; i++ )
		{
			for ( int j = 0; j < matrica.length; j++ )
			{
				System.out.print(matrica[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// korisnik unosi broj koji æe generirati matricu a * a (dvodimenzionalna matrica)
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite velicinu vase matrice: ");
		printMatrix(unos.nextInt());
		unos.close();
	}

}
