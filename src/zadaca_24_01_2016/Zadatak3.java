package zadaca_24_01_2016;

public class Zadatak3 {

	public static void main(String[] args) {
		int brojac = 0;
		// pravljenje kombinacija pomoæu dvije petlje
		for(int i = 1; i <= 7; i++){
			for(int j = 1; j < i; j++){
				// print kombinacije
				System.out.println(j + " " + i);
				// te brojanje iste
				brojac++;
				
			}
		}
		// printanje rezultata
		System.out.println("Ukupan broj kombinacija je: " + brojac);
	}

}