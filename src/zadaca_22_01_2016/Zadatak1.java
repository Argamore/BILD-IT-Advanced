package zadaca_22_01_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// svi dani su smjesteni u niz
		String[]dani = {"ponedeljak", "utorak", "srijeda", "cetvrtak", "petak", "subota", "nedelja"};
		// uzimanje podataka
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite koji je danas dan u sedimici: ");
		int danasDan = unos.nextInt();
		System.out.println("Unesite broj dana za koliko zelite da vidite koji je dan u sedimici: ");
		int pomak = unos.nextInt();
		unos.close();
		// kalkulacije za racunanje dana: 
		int noviDan = (danasDan + pomak) % 7;
		// print rezultata
		System.out.println("Danas je " + dani[danasDan] + ", a za " + pomak + " dana ce biti " + dani[noviDan]);
	}
}