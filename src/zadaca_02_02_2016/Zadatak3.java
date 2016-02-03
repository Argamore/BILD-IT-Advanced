package zadaca_02_02_2016;

import java.util.Scanner;

public class Zadatak3 {
	public static boolean isConsecutiveFour(int[] values){
		// pravimo brojac koji �e nam posluziti da vidimo imamo li 4 iste uzastopne cifre
		int counter = 1;
		// prolazimo kroz petlju i provjeravamo niz
		for (int i = 0; i < values.length - 1; i++) {
			// ako je broj [i] jednak sljede�em broju ([i+1]), pove�avamo broja�
			if (values[i] == values[i + 1]) {
						counter++;
						// ako je broja� = 4; zna�i da imamo 4 uzastopna broja
				if (counter == 4) {
					break;
				}
			}
		}
		// te shodno tome vra�amo true ili false
		if (counter == 4) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// korisnik unosi velicinu niza i brojeve u niz kroz petlju
		try(Scanner unos = new Scanner(System.in)){
			System.out.println("Unesite veli�inu niza: ");
			int[] niz = new int[unos.nextInt()];
			System.out.println("Unesite brojeve u niz: ");
			for (int i = 0; i < niz.length; i++){
				niz[i] = unos.nextInt();
			}
			if (isConsecutiveFour(niz) == true){
				System.out.println("Niz ima �etiri uzastopna broja.");
			} else {
				System.out.println("Niz nema �etiri uzastopna broja.");
			}
			unos.close();
		}
		catch(Exception e){
			System.out.println("Niste dobro unijeli broj.");
		}
		// te se ona salje metodi, i provjerava se �ta nam je vratila
		// ako je true, ispisuje poruku da ima 4 uzastopna, else, ispisuje da nema
	}
}
