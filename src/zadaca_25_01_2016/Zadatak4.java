package zadaca_25_01_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {			
			Scanner unos = new Scanner(System.in);
			// unos broja minuta
			System.out.println("Unesite broj minuta: ");
			long minute = unos.nextLong();
			unos.close();
			// pretvaranje minuta u dane
			int ukupnoDana = (int) minute / 1440; 
			// racunanje ostatka, broj dana koji ne èine jednu cijelu godinu
			int dani = ukupnoDana % 365;
			// racunanje godina
			int godine = ukupnoDana / 360;
			// stampanje rezultata
			System.out.println(minute + " minuta je " + godine + " godina i " + dani + " dana.");

		}

	}