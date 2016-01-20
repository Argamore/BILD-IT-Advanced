package zadaca_20_01_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		// uzimanje brzine aviona
		System.out.println("Unesite brzinu aviona u m/s ");
		double brzina = unos.nextDouble();
		// uzimanje ubrzanja aviona
		System.out.println("Unesite ubrzanje aviona m/s² ");
		double ubrzanje = unos.nextDouble();
		unos.close();
		// izračunavanje minimalne dužine piste
		double duzinaPiste = (brzina * brzina) / (2 * ubrzanje);
		// ispis rezultata
		System.out.println("Minimalna duzina piste potrebna za uzlijetanje je: " + (int)(duzinaPiste * 1000) / 1000.0);

	}

}