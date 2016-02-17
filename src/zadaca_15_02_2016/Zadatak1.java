package zadaca_15_02_2016;

import java.util.ArrayList;

public class Zadatak1 {
	public static void main(String[] args) {
		try(java.util.Scanner unos = new java.util.Scanner(System.in)){
			// korisnik unosi binarni broj koji se prosljeðuje metodi
		System.out.println("Unesite binarni broj: ");
		String binaryString = unos.next();
		bin2Dec(binaryString);
		}
		catch (Exception e){
			System.err.println("Greška! Restartuj program.");
		}
	}
	public static void bin2Dec(String binaryString) {
		int rezultat = 0;
		ArrayList<Integer> brojevi = new ArrayList<>();
		try {
			// petlja prolazi s pozada ka poèetku
			for (int i = binaryString.length() - 1; i >= 0; i--) {
				// izdvaja se karakter
				char karakter = binaryString.charAt(i);
				// ako je 0, dodaje se nula
				if (karakter == '0') {
					brojevi.add(0);
				// else ako je je 1, dodaje se 1
				} else if (karakter == '1') {
					brojevi.add(1);
				// ako nije ni 0 ni 1, baca grešku
				} else {
					throw new NumberFormatException("ERROR");
				}
			}
			// te pretvaramo iz binarnog u decimalni broj
			for (int i = 0; i < brojevi.size(); i++) {
				if (brojevi.get(i) == 1) {
					rezultat += Math.pow(2, i);
				}
			}
			// i vraæamo rezultat
			System.out.println(binaryString + " = " + rezultat);
		}
		catch (NumberFormatException ex) {
			System.out.println("Uneseni string ne sadrzi samo binarne brojeve.");
		}
	}
}
