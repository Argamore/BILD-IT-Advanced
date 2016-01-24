package zadaca_24_01_2016;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		// unosi se pocetna i krajnja godina
		System.out.println("Unesite pocetnu godinu");
		int pocetna = unos.nextInt();
		System.out.println("Unesite krajnju godinu");
		int krajnja = unos.nextInt();
		unos.close();
		// pozivanje metode i stampanje rezultata za svaku godinu u rasponu od pocetne do krajnje godine
		for(int i = pocetna; i <= krajnja; i++){
			System.out.println(i + ". godina ima " + numberOfDayInAYear(i) + " dana");
		}

	}

	public static int numberOfDayInAYear(int year){
		int dana = 0;
		// ispituje se da li je godina prestupna
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
			// ako je godina prestupna, onda ima 366 dana
			dana = 366;
		}else{
			// ako nije, ima 365
			dana = 365;
		}
		return dana;
	}

}