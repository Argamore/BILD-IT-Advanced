package zadaca_06_02_2016;

import java.util.ArrayList;

public class Zadatak5 {

	public static void main(String[] args) {

		try (java.util.Scanner unos = new java.util.Scanner(System.in)) {
			System.out.println("Unesite neki cijeli broj: ");
			int broj = unos.nextInt();
			unos.close();
			// kreiranje objekta, kao i u zadatku 4
			StackOfIntegers stackINT = new StackOfIntegers(broj);
			// lista za brojeve
			ArrayList<Integer> primeBroj = new ArrayList<>();
			// pozivanje metode za dobijanje prime brojeva
			primeBroj = stackINT.getPrimeNumbers();
			
			// petlja za print rezultata :)
			System.out.print("Prime brojevi su: ");
			for (int i = 0; i < primeBroj.size(); i++) {
				// za ispisivanje 10 po liniji.
				if ( i % 10 == 0)System.out.println();
				System.out.print(primeBroj.get(i) + " ");
				
			}
		} catch (Exception e) {
			System.err.println("Greška! Restartuj program.");
		}
	}

}