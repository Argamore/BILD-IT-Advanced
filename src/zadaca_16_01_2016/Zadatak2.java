/*
 * Author: Sefer Kuduzovic
 */
package zadaca_16_01_2016;
import java.util.Scanner;

public class Zadatak2 {
	// metoda koja prima broj pitanja i tezinu
	public static void pitanja(int a,int b){
		// provjerava ako nije tezina data, stavlja na najlakše
		if (b <= 0 )b = 1;
		int tezina = (b * 12);
		Scanner unos = new Scanner(System.in);
		// brojaci tacnih i netacnih odgovora
		int tacnih = 0;
		int netacnih = 0;
		// glavni dio programa koji generiše pitanja
		do{
		int broj1 = (int)(Math.random()*tezina);
		int broj2 = (int)(Math.random()*tezina);
		int rezultat = (broj1)-(broj2);
		int odgovor;
		System.out.println("Koliko je "+broj1+" - "+broj2+" ?");
			odgovor = unos.nextInt();
			if (odgovor == rezultat)tacnih++;
			else if (odgovor != rezultat)netacnih++;
			a--;
		// dokle god 'a' nije 0
		}while(a != 0);
		// kad sve zavrsi, program ispisuje rezultate:
		System.out.println("Broj taènih odgovora: "+tacnih);
		System.out.println("Broj netaènih odgovora: "+netacnih);
		unos.close();
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		// 'main' gdje se metodi prosljedjuje broj pitanja i tezina
		int brojPitanja = 0;
		int tezina = 0;
		System.out.println("Unesite broj pitanja: ");
		brojPitanja = unos.nextInt();
		if (brojPitanja == 0){
			System.out.println("Unijeli ste da želite 0 pitanja. Probajte ponovo: ");
		brojPitanja = unos.nextInt();
		}
		System.out.println("Unesite težinu od 1 (najlakše) do 5 (najteže): ");
		tezina = unos.nextInt();
		// nakon unosa, on se fino prosljeðuje metodi
		pitanja(brojPitanja, tezina);
		unos.close();

	}

}
