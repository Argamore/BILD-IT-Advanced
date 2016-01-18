package zadaca_17_01_2016;

import java.util.Scanner;

public class Zadatak4 {
	public static int[] locateLargest(double[][] a) {
		// red i kolona koji ce dobiti pozicije ako je broj "max" najveci
		int red = 0;
		int kolona = 0;
		double max = 0;
		// petlja provjerava gdje je najveci broj, te shodno tome dodjeljuje x i y koordinate
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[x].length; y++) { 
				if (a[x][y] > max) {				
					red = x; 
					kolona = y; 
					max = a[x][y];
				}
			}
		}
		// metoda vraca te koordinate
		return new int[] {red, kolona};
	}

	public static void main(String[] args) {
		// korisnik unosi X i Y koordinate
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj redova i broj kolona niza: ");
		double niz[][] = new double[unos.nextInt()][unos.nextInt()];

		// korisnik unosi niz: 
		System.out.println("Unesite Vaš niz: ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = unos.nextDouble(); 
			}
		}
		// ispisivanje matrice: 
		System.out.println("Matrica: ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				System.out.print(niz[i][j] + " "); 
			}
			System.out.println();
		}
		// pravimo dodatni niz u kojem ce biti smjesteni koordinati
		int[] lokacijaBroja = locateLargest(niz); 
		// te ga zatim printamo
		System.out.println("\nNajveæi èlan niza se nalazi na koordinatama Y:["+lokacijaBroja[0]+"] X:["+lokacijaBroja[1]+"]");
		unos.close();
	}
}