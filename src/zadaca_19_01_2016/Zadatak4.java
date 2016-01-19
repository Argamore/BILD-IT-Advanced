package zadaca_19_01_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// pravimo niz u koji ce se unositi brojevi
		Scanner unos = new Scanner(System.in);
		int[] niz = new int[10];
		try{
			// korisnik unosi brojeve u niz
			System.out.println("Unesite 10 cijelih brojeva: ");
			for (int i = 0; i < niz.length; i++){
				niz[i] = unos.nextInt();
			}
		}
		// ako je korisnik unio nesto sto nije cijeli broj, program staje.
		catch(java.util.InputMismatchException e){
			System.out.println("Samo cijeli brojevi mogu.");
		}
		// te se oni zatim printaju u rikverc
		for (int i = niz.length-1; i >= 0; i--){
			System.out.print(niz[i]+" ");
		}
		unos.close();
	}
}
