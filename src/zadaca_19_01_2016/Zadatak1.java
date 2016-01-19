package zadaca_19_01_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		int mjesecniIznos;
		int brojMjeseci;
		Scanner unos = new Scanner (System.in);
		// korisnik unosi koliko želi da štedi mjeseèno
		System.out.println("Unesite mjeseèni iznos: ");
		mjesecniIznos = unos.nextInt();
		// te zatim unosi koliko mjeseci zeli da stedi
		System.out.println("Unesite broj mjeseci koliko želite štediti: ");
		brojMjeseci = unos.nextInt();
		double trenutnoStanje = 0;
		// ovdje se racuna mjesecna stopa
		double stopaMjesecno = (0.05 / 12);
		double kamata = 0;
		// petlja prolazi kroz broj mjeseci te povecava trenutnoStanje shodno tome
		for (int i = 0; i < brojMjeseci; i++){
			trenutnoStanje += mjesecniIznos;
			kamata = (1 + stopaMjesecno);
			trenutnoStanje = trenutnoStanje * kamata;
		}
		// printa se rezultat zaokruzen na 2 decimale
		System.out.format("Vaše stanje nakon "+brojMjeseci+" mjeseca iznosi: "+"%.2f", trenutnoStanje);
		unos.close();
	}
}
