package zadaca_26_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak4 {
	
	//lista za smijestanje brojeva
	static ArrayList<Integer>listaBrojeva = new ArrayList<>();

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		//uzimanje tri broja od korisnika
		System.out.println("Unesite tri broja");
		int broj1 = unos.nextInt();
		int broj2 = unos.nextInt();
		int broj3 = unos.nextInt();
		unos.close();
		// pozivanje metode za sortiranje tri broja i smijestanje rezultata u listu
		listaBrojeva = sortiraj(broj1, broj2, broj3);
		//stampanje rezultata, tj. brojeva iz liste
		for(int i : listaBrojeva){
			System.out.print(listaBrojeva.get(i) + " ");
		}

	}
	// metoda
	public static ArrayList<Integer> sortiraj(int a, int b, int c){
		//dodavanje tri broja u listu
		listaBrojeva.add(a);
		listaBrojeva.add(b);
		listaBrojeva.add(c);
		//sortiranje liste
		Collections.sort(listaBrojeva);
		// vracanje liste
		return listaBrojeva;
	}

}