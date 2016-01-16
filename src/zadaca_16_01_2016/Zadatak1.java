/*
 * Author: Sefer Kuduzovic
 */
package zadaca_16_01_2016;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		// pravimo novu listu u koju æe se ubacivati prestupne godine
		ArrayList<Integer> list = new ArrayList<Integer>();
		// petlja koja prolazi kroz sve godine, te ako je godina prestupna, dodaje je u listu
		for (int i = 101; i < 2101; i++){
			if ((i %4 == 0) && (i %100 != 0) || (i %400 == 0)){
				list.add(i);
			}
		}
		// petlja koja ispisuje 10 prestupnih godina po liniji, te kada dodje do 10, prelazi u novu liniju
		int brojac = 0;
		for (int godina : list){
			if (brojac != 10){
				System.out.print(godina+" ");
				brojac++;
			}
			if (brojac == 10){
				System.out.println();
			brojac = 0; 
			}
		}
		// ispisuje konaèni rezultat
		System.out.println("\nIzmeðu 101 i 2100 postoji "+list.size()+" prestupnih godina.");
		
	}
}
