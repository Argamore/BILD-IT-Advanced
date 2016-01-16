/*
 * Author: Sefer Kuduzovic
 */
package zadaca_16_01_2016;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak3 {
	// glavna metoda gdje se racuna broj karaktera / rijeci / linija u datom fajlu
	public static void brojacTeksta(String fajl) throws FileNotFoundException{
		int brojKaraktera = 0;
		int brojRijeci = 0;
		int brojLinija = 0;
		// citanje fajla:
		java.io.File file = new java.io.File(fajl);
		Scanner input = new Scanner(file);
		// petlja provjerava tekst
		// ako prelazi u novi red, povecava se brojac linija
		while(input.hasNextLine()) {
		    brojLinija++;
		    // dok poseban citac provjerava tekst, broji rijeci, te razlaze rijeci i broji karaktere
		    Scanner tekstCitac = new Scanner(input.nextLine());
		    tekstCitac.useDelimiter(" ");
		    // dokle god citac ima unos, povecava se broj rijeci, te se na osnovu duzine rijeci povecava 
		    // brojac karaktera (ako rijec ima 5 slova, brojac karaktera se poveæava za 5)
		    while(tekstCitac.hasNext()) {
		        brojRijeci++;
		        brojKaraktera += tekstCitac.next().length();
		    }
		    tekstCitac.close();
		}
		input.close();
		// ispisuje se rezultat korisniku:
		System.out.println("Broj karaktera: "+brojKaraktera);
		System.out.println("Broj rijeci: "+brojRijeci);
		System.out.println("Broj linija teksta: "+brojLinija);
	}

	public static void main(String[] args) {
		// 'glava' programa gdje se ucitava i prosljeduje ime fajla metodi
		Scanner unos = new Scanner(System.in);
		System.out.println("Postavite vaš fajl u direktorij ovog programa.");
		System.out.print("Unesite naziv vašeg fajla: ");
		String naziv = unos.nextLine();
		// provjerava se da li je unesen tacan naziv fajla / da li postoji
		try {
			brojacTeksta(naziv);
		} catch (FileNotFoundException e) {
			System.out.println("Niste unijeli taèan naziv datoteke ili datoteka ne postoji. Unesite ponovo: ");
			naziv = unos.nextLine();
			e.printStackTrace();
		}
		unos.close();
	}

}
