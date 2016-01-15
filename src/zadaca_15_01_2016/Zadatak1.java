/*
 * Author: Sefer Kuduzovic
 */
package zadaca_15_01_2016;

import java.util.ArrayList;

public class Zadatak1 {
	public static Integer max(ArrayList<Integer> list) {
		int max = 0; // poèetna vrijednost
		
		// provjerava da li je lista null / prazna
		if ((list == null) || (list.isEmpty())) {
			System.out.println("Lista je null / prazna.");
			return null;
		}
		
		// ako je sve okay, ide dalje:
		else {
			for (int a : list) {
				if (a > max) {
					max = a; 
					// standardno, ako je broj veci od prethodnog, tada preuzima njegovu vrijednost
				}
			}
			return max;
		}
	}

	public static void main(String[] args) {
		// pozivanje liste
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// petlja koja dodaje brojeve u listu:
		for (int i = 0; i < 10; i++){
			int broj = (int)(Math.random()*100);
			list.add(broj);
		}
		
		// ispisivanje liste yaay
		System.out.println("Brojevi u listi: ");
		for (int broj : list) {
			System.out.print(broj + " "); 
		}
		// ispisuje najveæi broj u listi aww yeah
		System.out.println("\nNajveæi broj u listi je: "+max(list));
		
		
	}

}
