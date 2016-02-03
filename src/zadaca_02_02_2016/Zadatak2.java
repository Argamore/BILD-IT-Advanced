package zadaca_02_02_2016;

public class Zadatak2 {
	public static int getRandom(int... numbers) {
		// prvo generišemo neki random broj
		int randomBroj = 1+ (int)(Math.random()*54);
		// te pravimo while petlju koja æe provjeravati da li se on podudara sa nekim brojem iz niza
		boolean provjera = true;
		while(provjera){
			// ako se podudara, povecava se brojac, i petlja se dalje vrti
			int brojac = 0;
			for (int i = 0; i < numbers.length; i++){
				if(numbers[i] == randomBroj){
					brojac++;
				}
			}
			// ako je brojac na nuli, tj. ne podudara se s nekim brojem, zavrsava petlja i vraca se broj
			if (brojac == 0){
				provjera = false;
				// ako nije, generiše se novi broj, te se smanjuje brojaè
			} else {
				randomBroj = 1 + (int)(Math.random()*54);
				brojac--;
			}
		}
		// ako proðe petlju, vraæa broj
		return randomBroj;
	}

	public static void main(String[] args) {
		// niz u kojeg unosimo brojeve koje ne zelimo da dobijemo
		int[] niz = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,52,32,42};
		// te se niz salje metodi koja nam vraca novi broj, kojeg nema u nizu..
		System.out.println("Dobiveni broj je: "+getRandom(niz));
	}

}
