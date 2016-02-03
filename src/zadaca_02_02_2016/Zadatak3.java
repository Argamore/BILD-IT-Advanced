package zadaca_02_02_2016;

import java.util.Scanner;

public class Zadatak3 {
	public static boolean isConsecutiveFour(int[] values){
		// pravimo brojac koji æe nam posluziti da vidimo imamo li 4 iste uzastopne cifre
		int counter = 1;
		// prolazimo kroz petlju i provjeravamo niz
		for (int i = 0; i < values.length - 1; i++) {
			// ako je broj [i] jednak sljedeæem broju ([i+1]), poveæavamo brojaè
			if (values[i] == values[i + 1]) {
						counter++;
						// ako je brojaè = 4; znaèi da imamo 4 uzastopna broja
				if (counter == 4) {
					break;
				}
			}
		}
		// te shodno tome vraæamo true ili false
		if (counter == 4) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// korisnik unosi velicinu niza i brojeve u niz kroz petlju
		try(Scanner unos = new Scanner(System.in)){
			System.out.println("Unesite velièinu niza: ");
			int[] niz = new int[unos.nextInt()];
			System.out.println("Unesite brojeve u niz: ");
			for (int i = 0; i < niz.length; i++){
				niz[i] = unos.nextInt();
			}
			if (isConsecutiveFour(niz) == true){
				System.out.println("Niz ima èetiri uzastopna broja.");
			} else {
				System.out.println("Niz nema èetiri uzastopna broja.");
			}
			unos.close();
		}
		catch(Exception e){
			System.out.println("Niste dobro unijeli broj.");
		}
		// te se ona salje metodi, i provjerava se šta nam je vratila
		// ako je true, ispisuje poruku da ima 4 uzastopna, else, ispisuje da nema
	}
}
