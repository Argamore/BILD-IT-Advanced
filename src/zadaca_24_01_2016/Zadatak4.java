package zadaca_24_01_2016;

import java.util.Scanner;

public class Zadatak4 {
	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		// uzimanje stringa od korisnika
		System.out.println("Unesite string");
		String str = unos.nextLine();
		// uzimanje karaktera od korisnika
		System.out.println("Unesite karakter kojeg zelite da prebrojite u stringu");
		char karakter = unos.next().charAt(0);
		unos.close();
		//ispisivanje rezultata i pozivanje metode za prebrojavanje pojavljivanja karaktera u stringu
		System.out.println("Karakter '" + karakter + "' se u datom stringu ponavlja " + count(str, karakter) + " puta.");

	}
	public static int count(String str, char a){
		
		int brojac = 0;
		//prolazak kroz citav string
		for(int i = 0; i < str.length(); i++){
			//odvajanje karaktera iz stringa
			char karakter = str.charAt(i);
			//ako je karakter jednak karakteru ciji broj pojavljivanja zelimo da prebrojimo, brojac se povecava
			if(karakter == a){
				brojac++;
			}
		}
		return brojac;
	}

}