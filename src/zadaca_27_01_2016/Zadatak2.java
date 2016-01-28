package zadaca_27_01_2016;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {
	public static void main(String[] args) throws IOException {
		Scanner unos;
		int broj = 0;
		// korisnik unosi broj
		System.out.println("Unesite cijeli broj: ");
		// koji se zatim provjerava
		while(true){
			try {
				unos = new Scanner(System.in);
				broj = unos.nextInt();				
				unos.close();
				System.out.println("Vaš broj naopako je: "+reverse(broj));
				break;
			} catch (InputMismatchException e) {
				System.out.println("Greška pri unosu broja! Try again.");
			}
		}
		// ako je sve ok, broj se salje metodi
	}
// metoda za ispis broja:
	public static int reverse(int number){
		int rikverc = 0;
		int broj = 0;
		// metoda radi dok ne ostane niti jedna cifra, tj do 0.
		while(number != 0){
			// odvajanje zadnjeg broja od unosa
			broj = number % 10;
			number = number / 10;
			rikverc = rikverc * 10;
			// dodavanje odvojene cifre novom broju
			rikverc += broj;
		}
		return rikverc;
	}
}