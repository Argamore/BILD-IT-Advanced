package zadaca_21_01_2016;

import java.util.Scanner;

public class Zadatak1 {
	public static void main(String[] args) {
		// generisanje 3 jednocifrena broja
		int broj1 = (int)((Math.random() * 10));
		int broj2 = (int)((Math.random() * 10));
		int broj3 = (int)((Math.random() * 10));
		// te njihov zbir
		int rezultat = broj1 + broj2 + broj3;
		int uneseniBroj = 0;
		
		Scanner unos = new Scanner(System.in);
		//dok korisnik ne unese tacan rezultat, vrti se loop
		do{
			// postavljanje pitanja
			System.out.println("Koliko je : " + broj1 + " + " + broj2 + " + " + broj3);
			uneseniBroj = unos.nextInt();
			// ispitivanje da li je rezultat tacan
			if(uneseniBroj == rezultat){
				System.out.println("Unijeli ste tacan rezultat! Yaaaaaay ^_______^");
			}else{
				System.out.println("Niste unijeli tacan rezultat, pokusajte ponovo!");
			}
		}while (uneseniBroj != rezultat);
		unos.close();
	}

}