package zadaca_08_02_2016;

import java.math.BigInteger;

public class Zadatak3 {

	public static void main(String[] args) {
		// po�to tra�imo ve�i PRIME broj od Long.MAX_VALUE, opet koristimo BigInteger
		BigInteger broj = new BigInteger(Long.MAX_VALUE+"");
		int brojac = 0;
		
		System.out.println("Prime brojevi su:\n");
		// furka kod BigIntegera je da se mo�e pozvati metoda koja provjerava da li je prime
		// so, we do that
		while (brojac < 5){
			// ako jeste, ispisuje nam broj, pove�ava broja�, te pove�ava broj ^__^
			if (broj.isProbablePrime(1)== true){
				System.out.println(brojac+1 + ". " + broj);
				brojac++;
				broj = broj.add(BigInteger.ONE);
			}
			// ako nije prime, pove�avamo broj dok ga ne na�e ^__^
			broj = broj.add(BigInteger.ONE);
		}
	}

}
