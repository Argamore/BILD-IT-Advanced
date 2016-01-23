package zadaca_22_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak4 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList <>();
		Scanner unos = new Scanner(System.in);
		boolean uslov = true;
		System.out.println("Unesite brojeve: ");
		// unos brojeva u listu
		do{
			int broj = unos.nextInt();
			// ako je unesen broj 0, unos se zavrsava
			if(broj == 0){
				uslov = false;
			}
			// ako je unesen broj razlicit od 0, broj se dodaje u listu
			else{
				list.add(broj);
			}
		}while(uslov);
		unos.close();
		// sortiranje liste
		Collections.sort(list);
		// odredjivanje najveceg broja (najveci se nalazi na kraju liste)
		int najveci = list.get(list.size() - 1);
		int brojac = 0;
		//prolazak kroz listu sa kraja ka pocetku i brojanje ponavljanja najveceg broja
		for(int i = list.size() - 1; i >= 0; i--){
			// kad je broj jednak najvecem brojac se povecava
			if(list.get(i) == najveci){
				brojac++;
			} 
			//kad broj nije jednak najvecem, izlazi se iz petlje
			else{
				break;
			}
		}
		//stampanje rezultata
		System.out.println("Najveci uneseni broj je " + najveci + " i on se ponavlja " + brojac + " puta.");
	}
}