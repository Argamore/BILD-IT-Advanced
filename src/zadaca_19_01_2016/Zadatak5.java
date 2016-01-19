package zadaca_19_01_2016;

import java.util.Scanner;

public class Zadatak5 {
	public static int brojiSlova(String recenica){
		// metoda uzima recenicu
		// prvo je podijeli po slovima
		String[] recenicaNiz = recenica.split("");
		int brojac = recenicaNiz.length;
		// zatim provjerava da li ima "spejsinga"
		String[] recenicaNiz2 = recenica.split(" ");
		// te shodno time popravlja brojac na tacan broj slova
		brojac = (brojac - recenicaNiz2.length)+1;
		// kojeg zatim vraca nazad
	    return brojac;
	}

	public static void main(String[] args) {
		// korisnik unosi svoju reèenicu: 
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite vašu reèenicu: ");
		String recenica = unos.nextLine();
		unos.close();
		// koja se šalje metodi
		System.out.println("Broj slova u vašoj reèenici: "+brojiSlova(recenica));
	}

}
