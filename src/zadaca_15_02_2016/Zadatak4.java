package zadaca_15_02_2016;

import java.io.File;

public class Zadatak4 {

	public static void main(String[] args) {
		try (java.util.Scanner unos = new java.util.Scanner(System.in)) {
			System.out.println("Datoteka mora biti u istoj direktoriji.\nUnesite ime datoteke: ");
			String imeFajla = unos.nextLine();
			// nakon unosa od korisnika, prosljedjujemo fajl metodi
			counter(imeFajla);
		} catch (Exception e){
			System.err.println("Greška!\nProvjeri ime fajla i da li je gdje treba da bude.");
		}
	}
	public static void counter(String imeFajla) {
		int brLinija = 0, brRijeci = 0, brKaraktera = 0;
		
		File file = new File(imeFajla);
		try(java.util.Scanner unos = new java.util.Scanner(file)){
		while (unos.hasNextLine()) {
			String linija = unos.nextLine();
			// brojac linija se povecava
			brLinija++;
			// te i brojac rijeci
			brRijeci += linija.split(" ").length;
			// na kraju i brojac karaktera, na osnovu broja slova / duzine linije 
			brKaraktera += linija.length();
		}
		System.out.println(
			"U tekstu ima " + brLinija + " linija, " + brRijeci + " rijeci i " + brKaraktera + " karaktera.");
		} catch(Exception e){
			System.err.println("Greška!");
		}
	}	
}