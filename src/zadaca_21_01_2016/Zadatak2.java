package zadaca_21_01_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		// uzimanje godine od korisnika
		System.out.println("Unesite godinu: ");
		int godina = unos.nextInt();
		// i mjeseca
		System.out.println("Unesite mjesec: ");
		int mjesec = unos.nextInt();
		unos.close();
		// provjerava mjesec te printa shodno tome rezultat
		switch(mjesec){
		case 1:{
			System.out.println("Januar " + godina + ". ima 31 dan.");
			break;
		}
		case 2:{
			// ispituje se da li je godina prestupna
			if(isPrestupna(godina)){
				System.out.println("Februar " + godina + ". ima 29 dana");
			}else{
				System.out.println("Februar " + godina + ". ima 28 dana");
			}
			break;
		}
		case 3:{
			System.out.println("Mart " + godina + ". ima 31 dan.");
			break;
		}
		case 4:{
			System.out.println("April " + godina + ". ima 30 dan.");
			break;
		}
		case 5:{
			System.out.println("Maj " + godina + ". ima 31 dan.");
			break;
		}
		case 6:{
			System.out.println("Juni " + godina + ". ima 30 dan.");
			break;
		}
		case 7:{
			System.out.println("Juli " + godina + ". ima 31 dan.");
			break;
		}
		case 8:{
			System.out.println("August " + godina + ". ima 31 dan.");
			break;
		}
		case 9:{
			System.out.println("Septembar " + godina + ". ima 30 dan.");
			break;
		}
		case 10:{
			System.out.println("Oktobar " + godina + ". ima 31 dan.");
			break;
		}
		case 11:{
			System.out.println("Novembar " + godina + ". ima 30 dan.");
			break;
		}
		case 12:{
			System.out.println("Decembar " + godina + ". ima 31 dan.");
			break;
		}
		default:{
			System.out.println("Malo si se zeznuo sa mjesecom..");
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