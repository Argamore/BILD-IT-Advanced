package zadaca_01_02_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		int[] brojevi = new int[10];
		// u listu ubacujemo brojeve koji se ponavljaju, a niz koristimo da vidimo koji su to brojevi
		ArrayList<Integer> jedinstveniBrojevi = new ArrayList<>();
		System.out.println("Unesite 10 brojeva: ");
		Scanner unos = new Scanner(System.in);
		for(int i = 0; i < 10; i++){
			int broj = unos.nextInt();
			// povecavamo koliko se puta neki broj ponovio
			brojevi[broj]++;
		}
		unos.close();
		// sad ubacujemo brojeve u listu
		for(int i = 0; i < 10; i++){
			if(brojevi[i] > 0){
				//ako se broj pojavio barem jednom, dodaje se i printa
				System.out.print(i + " ");
				jedinstveniBrojevi.add(i);
			}
		}
		// te ispisujemo koliko ih ima
		System.out.println("\nBroj jedinstvenih brojeva je " + jedinstveniBrojevi.size());
	}

}