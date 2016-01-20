package zadaca_20_01_2016;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		//uzimanje broja od korisnika
		System.out.println("Unesite broj");
		int broj = unos.nextInt();
		unos.close();
		
		//pozivanje metode za provjeru da li je broj palindrom i stampanje rezultata
		System.out.println("Vaš broj u rikverc: "+reverse(broj));
		System.out.println("Da li je unešeni broj palindrom? " + isPalindrome(broj));

	}
	// metoda koja obræe broj
	public static int reverse(int number){
		int reversedNumber = 0;
		int broj = 0;
		// petlja se ponavlja dok broj ne postane jednak 0, tj. dok se svi brojevi ne obrade
		while(number != 0){
			// odvajanje zadnje cifre od broja
			broj = number % 10;
			// pomjeranje zareza za jedno mjesto u lijevo kod unesenog broja
			number = number / 10;
			// pomjeranje zareza za jedno mjesto u desno kod novog broja
			reversedNumber = reversedNumber * 10;
			// dodavanje odvojene cifre novom broju
			reversedNumber += broj;
		}
		return reversedNumber;
	}
	// provjera da li je palindrom
	public static boolean isPalindrome(int number){
		boolean isPalindrome = false;
		// uneseni broj se ispisuje naopako
		int reverse = reverse(number);
		// ako je broj jednak svom naopakom ispisu on je palindrom
		if(number == reverse){
			isPalindrome = true;
		}
		return isPalindrome;
	}
}