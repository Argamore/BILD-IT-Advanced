/*
 * Author: Sefer Kuduzovic
 */
package zadaca_15_01_2016;
import java.util.Scanner;

public class Zadatak2 {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite rečenicu: ");
		
		String word = unos.nextLine();
		// iz rečenice u "slovo po slovo"
		// but first, rečenicu stavljamo da je napisana malim slovima, lakše računat
		char[] recenica = (word.toLowerCase()).toCharArray(); 
		
		// brojaci samoglasnika i suglasnika
		int samoglasnik = 0;
		int suglasnik = 0; 
		
		// prolazak kroz string te uzimajuci samo slova brojimo samoglasnike i suglasnike u stringu
		// prolazi kroz ASCII te gleda ako je samoglasik, onda povecava samoglasnik, u suprotnom povecava suglasnik
		for (char slovo : recenica) {  
			   if (((int)slovo >= 97) && ((int)slovo <= 122)){  
				   if (slovo == 'a' || slovo == 'o' || slovo == 'i' || slovo == 'o' || slovo == 'e') {
						samoglasnik++;
					}
					else suglasnik++;
			   } 
		}   
		// ispisuje rezultat
		System.out.println("Rečenica sadrži "+samoglasnik+" samoglasnika i "+suglasnik+" suglasnika.");
		unos.close();
	}
}