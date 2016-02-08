package zadaca_06_02_2016;

import java.util.ArrayList;

public class Zadatak4 {

	public static void main(String[] args) {
		try(java.util.Scanner unos = new java.util.Scanner(System.in)){
		System.out.println("Unesite neki cijeli broj: ");
		int broj = unos.nextInt();
		unos.close();
		// kreiramo objekat
		StackOfIntegers stackOfInt = new StackOfIntegers(broj);
		// te listu za rezultate što dobijemo nazad
		ArrayList <Integer> listaBrojeva = new ArrayList<>();
		// pozivanje metode za dobijanje prime faktora
		listaBrojeva = stackOfInt.getPrimeFactors();
		// petlja za print liste
		
		System.out.print("Brojevi: ");
		for(int i = listaBrojeva.size() - 1; i >= 0; i--){
			System.out.print(listaBrojeva.get(i) + " * ");
			if ( i <= 0)System.out.print("1 = "+broj);
		}
	} catch (Exception e){
		System.err.println("Greška! Restartuj program.");
	}
	}

}