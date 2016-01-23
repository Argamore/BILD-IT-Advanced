package zadaca_22_01_2016;

public class Zadatak3 {
	public static void main(String[] args) {
		
		int brojac = 0;
		//petlja se vrti i provjerava
		for(int i = 100; i <= 1000; i++){
			// da li je broj djeljiv i sa 5 i sa 6
			if(i % 5 == 0 && i % 6 == 0){
				// te prelazi u novi red ako je ispisano 10 linija
				if(brojac != 0 && brojac % 10 == 0){
					System.out.println();
				}
				// print rezultata
				System.out.print(i + " ");
				// brojac broji broj rezultata po liniji
				brojac++;
			}
		}

	}

}