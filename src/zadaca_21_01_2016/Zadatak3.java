package zadaca_21_01_2016;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		// uzimanje godine od korisnika
		System.out.println("Unesite godinu: ");
		int godina = unos.nextInt();
		// i mjeseca
		System.out.println("Unesite prva tri slova mjeseca: ");
		String mjesec = unos.next();
		mjesec.toLowerCase();
		unos.close();
		//u zavisnosti od toga koji je mjesec unesen, printa se odgovarajuci rezultat
		switch(mjesec){
		case "jan":{
			System.out.println("Januar " + godina + ". ima 31 dan.");
			break;
		}
		case "feb":{
			//ispituje se da li je godina prestupna
			if(isPrestupna(godina)){
				System.out.println("Februar " + godina + ". ima 29 dana");
			}else{
				System.out.println("Februar " + godina + ". ima 28 dana");
			}
			break;
		}
		case "mar":{
			System.out.println("Mart " + godina + ". ima 31 dan.");
			break;
		}
		case "apr":{
			System.out.println("April " + godina + ". ima 30 dan.");
			break;
		}
		case "maj":{
			System.out.println("Maj " + godina + ". ima 31 dan.");
			break;
		}
		case "jun":{
			System.out.println("Juni " + godina + ". ima 30 dan.");
			break;
		}
		case "jul":{
			System.out.println("Juli " + godina + ". ima 31 dan.");
			break;
		}
		case "aug":{
			System.out.println("August " + godina + ". ima 31 dan.");
			break;
		}
		case "avg":{
			System.out.println("August " + godina + ". ima 31 dan.");
			break;
		}
		case "sep":{
			System.out.println("Septembar " + godina + ". ima 30 dan.");
			break;
		}
		case "okt":{
			System.out.println("Oktobar " + godina + ". ima 31 dan.");
			break;
		}
		case "nov":{
			System.out.println("Novembar " + godina + ". ima 30 dan.");
			break;
		}
		case "dec":{
			System.out.println("Decembar " + godina + ". ima 31 dan.");
			break;
		}
		default:{
			System.out.println("Pogresan unos mjeseca, bro.");
			break;
		}
		}
	}
	// metoda za provjeru da li je prestupna godina
	public static boolean isPrestupna(int godina){
		boolean isPrestupna = false;
		
		if(godina % 4 == 0 && (godina % 100 != 0 || godina % 400 == 0)){
			isPrestupna = true;
		}
		return isPrestupna;
	}
}