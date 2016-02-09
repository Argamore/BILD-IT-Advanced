package zadaca_08_02_2016;

import java.math.BigInteger;

public class Zadatak3 {

	public static void main(String[] args) {
		// pošto tražimo veæi PRIME broj od Long.MAX_VALUE, opet koristimo BigInteger
		BigInteger broj = new BigInteger(Long.MAX_VALUE+"");
		int brojac = 0;
		
		System.out.println("Prime brojevi su:\n");
		// furka kod BigIntegera je da se može pozvati metoda koja provjerava da li je prime
		// so, we do that
		while (brojac < 5){
			// ako jeste, ispisuje nam broj, poveæava brojaè, te poveæava broj ^__^
			if (broj.isProbablePrime(1)== true){
				System.out.println(brojac+1 + ". " + broj);
				brojac++;
				broj = broj.add(BigInteger.ONE);
			}
			// ako nije prime, poveæavamo broj dok ga ne naðe ^__^
			broj = broj.add(BigInteger.ONE);
		}
	}

}
