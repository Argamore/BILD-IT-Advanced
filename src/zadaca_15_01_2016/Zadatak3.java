/*
 * Author: Sefer Kuduzovic
 */
package zadaca_15_01_2016;

import java.util.Scanner;

public class Zadatak3 {
	// to je ta fensi metoda
	
	public static int djelitelj(int a, int b){
		int brojka = 0;
		int max = 0;
		// petlja provjerava najveci djelilac izmedju ta dva broja, te 
		// zamjenjuje max vrijednost sa trenutnom najvecom sa kojom se oba broja mogu dijeliti
		for (int i = 1; i < 100; i++){
			if (a %i == 0 && b %i == 0){
				brojka = i;
				if (brojka > max){
					max = brojka;
				}
			}
		}
		// metoda vraca najveci djelilac "max"
		return max;
	}

	public static void main(String[] args) {
		// standardni unos u konzolu:
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite prvi broj: ");
		int broj1 = unos.nextInt();
		System.out.print("Unesite drugi broj: ");
		int broj2 = unos.nextInt();
		
		// ispisuje rezultat te uz to salje brojeve u metodu na kalkulisanje
		System.out.println("Najveæi zajednièki djelitelj za "+broj1+" i "+broj2+" je "+djelitelj(broj1,broj2));
		unos.close();
	}
}
