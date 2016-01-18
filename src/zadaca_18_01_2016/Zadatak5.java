package zadaca_18_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int broj;
		int brojac = 0;
		int ukupno = 0;
		double prosjek;
		System.out.println("Dokle god ne pritisnes 0, mozes unositi brojeve: ");
		ArrayList<Integer> listaBrojeva = new ArrayList<Integer>();
		// korisnik unosi brojeve
			for (int i = 0; i <= 100; i++){
				broj = unos.nextInt();
				// ako uneseni broj nije 0, unosi se u listu te se povecava brojac i sabire se sa proslim unosom
				if (broj != 0){
					brojac++;
					listaBrojeva.add(broj);
					ukupno = ukupno + broj;
				}
				// ako je uneseni broj 0, prekida se program.
				if (broj == 0)break;
			}
			// racuna se prosjek unešenih brojeva
			prosjek = (double)(ukupno) / (double)(brojac);
			
			// ako nije uneseno brojeva, ispisuje da se ne moze dijeliti sa nulom i prekida program
			if (brojac == 0){
				System.out.println("Ne može se dijeliti s nulom.");
				System.exit(0);
			}
		int iznadProsjeka = 0;
		int ispodProsjeka = 0;
		// petlja prolazi kroz listu i gleda da li je broj veci od prosjeka
		for (int x : listaBrojeva){
			if (x >= prosjek){
			// ako jeste, povecava se brojac
				iznadProsjeka++;
			}
			// u suprotnom povecava se brojac da nije iznad
			else {
				ispodProsjeka++;
			}
		}
		// sve se to na kraju fino ispise
		System.out.println("Prosjek unešenih brojeva: "+prosjek);
		System.out.println(iznadProsjeka+" brojeva iznad prosjeka.");
		System.out.println(ispodProsjeka+" brojeva ispod prosjeka.");
		unos.close();
		
	}
}
