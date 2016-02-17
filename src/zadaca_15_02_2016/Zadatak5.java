package zadaca_15_02_2016;

import java.io.File;
import java.util.Scanner;

public class Zadatak5 {
	public static void main(String[] args) {

		try (Scanner unos = new Scanner(System.in)) {

			double suma = 0;
			int brojac = 0;

			System.out.println("Datoteka mora bit u istom folderu.\nUnesite ime datoteke: ");
			String imeFajla = unos.nextLine();
			File file = new File(imeFajla);
			try (Scanner citac = new Scanner(file)) {
				while (citac.hasNext()) {
					// ako ima broj u fajlu, ovo ga dodaje na sumu, te povecava
					// brojac
					// da vidimo koliko brojeva ima ^_____^ za prosjek ofc
					suma += citac.nextInt();
					brojac++;
				}
				System.out.println("Suma: " + suma + "\nProsjek: " + suma / brojac);
			} catch (Exception e) {
				System.err.println("Greška! Provjeri naziv fajla i da li je gdje treba da bude.");
			}
		}
	}
}