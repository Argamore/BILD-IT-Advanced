package zadaca_27_01_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		// korisnik unosi ra�un
		System.out.println("Unesite iznos Va�eg ra�una: ");
		double iznosRacuna = unos.nextDouble();
		// te koliki postotak od toga zeli dati kao napojnicu
		System.out.println("Unesite procenat za napojnicu: ");
		int napojnica = unos.nextInt();
		unos.close();
		// racunanje napojnice, koja se zatim dodaje na prvobitni iznos racuna
		double iznosNapojnice = iznosRacuna * (napojnica / 100.0);
		// te se dobiva ukupan iznos
		double ukupanIznosRacuna = iznosRacuna + iznosNapojnice;
		// i to se printa nazad
		System.out.println("Ukupan ra�un za pla�anje je: " + ukupanIznosRacuna + ", a napojnica je: " + iznosNapojnice);
	}

}