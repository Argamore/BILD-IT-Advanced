/*
 * Author: Sefer Kuduzovic
 */
package zadaca_15_01_2016;
public class Zadatak4 {

	public static void main(String[] args) {
		// dva niza - jedan za 100 random brojeva
		// drugi za brojanje koliko se puta taj broj ponovio
		int[] niz = new int[101];
		int[] brojac = new int[10];
		
		// generišemo 100 random brojeva:
		for(int i = 0; i < niz.length; i++){
			niz[i] = ((int)(Math.random()*10));
		}
		
		// raèunamo koliko se brojeva ponovilo od 0 - 9
		for (int broj : niz)
		    brojac[broj]++;
		
		// ispisujemo rezultat
		for (int i = 0; i < brojac.length; i++){
			System.out.println("Broj "+i+" se ponovio "+brojac[i]+" puta.");
		}

	}

}
