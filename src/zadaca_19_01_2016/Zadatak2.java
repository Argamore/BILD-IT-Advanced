package zadaca_19_01_2016;

import java.util.Random;
import java.util.Scanner;

public class Zadatak2 {
		// metoda prima brojSimulacija i vrti se sve dok brojSimulacija ne bude 0
	public static void takeCard(int brojSimulacija){
		do {
			// ovdje se odabire karta, naravno random
		char[] karte = "A2345678910JQK".toCharArray();
		StringBuilder karta = new StringBuilder();
		Random random = new Random();
		// salje se u petlju odakle se nasumièno izabire jedna od karata iz niza
		for (int i = 0; i < 1; i++) {
		    char izvucenaKarta = karte[random.nextInt(karte.length)];
		    karta.append(izvucenaKarta);
		}
		String izvucenaKarta = karta.toString();
		// ovdje se bira znak
		String[] znak = {"srca", "lista","djeteline","dijamanta"};
		int generisaniBroj = new Random().nextInt(znak.length);
		// te se i on naravno nasumièno izvlaèi:
		String izvuceniZnak = (znak[generisaniBroj]);
		// i sve se to fino printa korisniku
		System.out.println("Karta koju ste izvukli je: "+izvucenaKarta+" u znaku "+izvuceniZnak+".");
		// te se smanjuje broj simulacija za 1
		brojSimulacija--;
		}while(brojSimulacija != 0);
	}
	
	public static void main(String[] args) {
		// korisnik unosi koliko puta želi simuliranje izvlaèenja karte
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite koliko puta želite simuliranje karte: ");
		// te se taj unos šalje metodi
		takeCard(unos.nextInt());
		unos.close();
	}

}
