package zadaca_08_02_2016;

import java.math.BigInteger;

public class Zadatak5 {

	public static void main(String[] args) {
		// smje�tamo najve�u vrijednost od Long u BigInteger 
		BigInteger broj = new BigInteger(Long.MAX_VALUE+"");
		int brojac = 0;
		
		while (brojac != 10){
			// te uz pomo� gotovih metoda provjeravamo da li je broj djeljiv sa 5 ili 6
			if (broj.remainder(new BigInteger("5")) == BigInteger.ZERO 
					|| broj.remainder(new BigInteger ("6")) == BigInteger.ZERO){
				// ako jeste, ispisuje ga i pove�ava broja�
				System.out.println(brojac+1 + ". "+broj);
				brojac++;
			}
			// ina�e pove�ava broj
			broj = broj.add(BigInteger.ONE);
		}

	}

}
