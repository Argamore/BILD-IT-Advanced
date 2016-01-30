package zadaca_29_01_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// korisnik unosi broj
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		long broj = unos.nextLong();
		unos.close();
		// te se poziva metoda i vraæa rezultat, te se ispisuje
		System.out.println("Zbir unesenog broja je: " + sumDigits(broj));

	}
	public static int sumDigits(long n){
		int rezultat = 0;
		// petlja se vrti dok ne doðe do 0, tj dok svi brojevi ne proðu dijeljenje, kojim se uzima zadnja brojka
		while(n != 0){
			// uzima se zadnji broj
			rezultat += (int) n % 10;
			// te se pomjera za jedno mjesto broj u lijevo, pa se ponovo vrti i uzima zadnji broj koji se dodaje
			n = n / 10;
		}
		return rezultat;
	}

}