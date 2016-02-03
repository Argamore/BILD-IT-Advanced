package zadaca_02_02_2016;

public class Zadatak1 {

	public static void main(String[] args) {
		// niz nam sluzi kao brojac, ako dobijemo random broj npr 2; onda æe se poveæati niz[2] za 1..
		int[] niz = new int[10];
		// petlja se vrti 100 puta
		for (int i = 0; i < 101; i++){
			// pri tome se generiše random broj
			int broj = (int)(Math.random()*10);
			// i povecava se brojac za taj broj u našem nizu
			niz[broj]++;
		}
		// i sve se to fino ispisuje
		for (int i = 0; i < niz.length; i++){
			System.out.println("Broj "+i+" se ponovio "+niz[i]+" puta.");
		}
	}

}
