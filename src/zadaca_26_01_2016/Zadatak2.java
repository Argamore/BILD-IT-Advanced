package zadaca_26_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// lista u koju se uspisuju djelitelji
		ArrayList<Integer> listaDjelitelja = new ArrayList<>();
		Scanner unos = new Scanner(System.in);
		// unos brojeva: 
		System.out.println("Unesite dva broja: ");
		int broj1 = unos.nextInt();
		int broj2 = unos.nextInt();
		unos.close();
		// petlja od 2 do manjeg od dva unesena broja
		for(int i = 2; i <= broj1 && i <= broj2; i++){
			// ako su oba broja djeljiva sa istim brojem, taj broj se dodaje u listu
			if(broj1 % i == 0 && broj2 % i == 0){
				listaDjelitelja.add(i);
			}
		}
		// ako lista sadrzi vise od jednog elementa, znaci da postoji najmanji i najveci djelilac za unijete brojeve
		if(listaDjelitelja.size() > 0){
			// sortiranje liste
			Collections.sort(listaDjelitelja);
			// prvi u listi je najmanji, a zadnji najveæi djelitelj..
			System.out.println("Najmanji zajednicki djelitelj za brojeve " + broj1 + " i " + broj2 + " je: " + listaDjelitelja.get(0) 
					+ "\na najveæi djelitelj je: " + listaDjelitelja.get(listaDjelitelja.size() - 1));
		}else{
			// ako nema dva, printa se poruka: 
			System.out.println("Unešeni brojevi nemaju zajednièkih djelitelja.");
		}

	}

}