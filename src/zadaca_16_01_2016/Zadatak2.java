/*
 * Author: Sefer Kuduzovic
 */
package zadaca_16_01_2016;
import java.util.Scanner;

public class Zadatak2 {
	// metoda koja prima broj pitanja i tezinu
	public static void pitanja(int a,int b){
		// provjerava ako nije tezina data, stavlja na najlak�e
		if (b <= 0 )b = 1;
		int tezina = (b * 12);
		Scanner unos = new Scanner(System.in);
		// brojaci tacnih i netacnih odgovora
		int tacnih = 0;
		int netacnih = 0;
		// glavni dio programa koji generi�e pitanja
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
		System.out.println("Broj ta�nih odgovora: "+tacnih);
		System.out.println("Broj neta�nih odgovora: "+netacnih);
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
			System.out.println("Unijeli ste da �elite 0 pitanja. Probajte ponovo: ");
		brojPitanja = unos.nextInt();
		}
		System.out.println("Unesite te�inu od 1 (najlak�e) do 5 (najte�e): ");
		tezina = unos.nextInt();
		// nakon unosa, on se fino proslje�uje metodi
		pitanja(brojPitanja, tezina);
		unos.close();

	}

}
