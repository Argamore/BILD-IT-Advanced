package zadaca_24_01_2016;

import java.util.ArrayList;

public class Zadatak2 {

	public static void main(String[] args) {
		// lista za spremanje prostih brojeva
		ArrayList<Integer> prostiBrojevi = new ArrayList<>();
		int brojac = 0;
		// trazenje prostih brojeva i njihovo spremanje u listu
		for(int i = 1; i <= 10000; i++){
			for(int j = 2; j <= i; j++){
				// ako je broj djeliv sa bilo kojim brojem manjim od sebe, ne racunajuci jedinicu, on je prost
				if(i % j == 0 && i != j){
					break;
				}
				if(i == j){
					prostiBrojevi.add(i);
				}
			}
		}
		// provjera liste za twin prime brojeve
		for(int i = 0; i < prostiBrojevi.size() - 1; i++){
			// ako je broj za 2 manji od sljedeceg prostog broja, oni predstavljaju twin prime
			if(prostiBrojevi.get(i) + 2 == prostiBrojevi.get(i + 1)){
				//ako je isprintano deset parova, prelazi se u novi red
				if(brojac != 0 && brojac % 10 == 0){
					System.out.println();
				}
				// print rezultata
				System.out.print(prostiBrojevi.get(i) + " " + prostiBrojevi.get(i + 1) + "  ");
				// povecavanje brojaca za ispis po liniji
				brojac++;
			}
			
		}
	}
}