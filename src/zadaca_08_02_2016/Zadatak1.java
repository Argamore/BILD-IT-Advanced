package zadaca_08_02_2016;

import java.math.BigInteger;

public class Zadatak1 {

	public static void main(String[] args) {
		// BigInteger broj sa 50 decimala
		BigInteger broj = new BigInteger("100000000000000000000000000000000000000000000");
		// brojac koji �e nam brojati 10 oktiliona koji su djeljivi sa 2 ili 3
		int brojac = 0;
		
		while (brojac <= 10){
			// pozivamo metode za BigInteger iz klase Math koja dodaje nove brojeve od predstoje�eg
			// jer je BigInteger IMMUTABLE - nepromjenjiv!
			// ako je ostatak pri djeljenju sa 2 ili 3 NULA, onda ispisujemo taj broj i pove�avamo broja�
			if (broj.remainder(new BigInteger("2")) == BigInteger.ZERO 
					|| broj.remainder(new BigInteger("3")) == BigInteger.ZERO) {
				System.out.println(broj);	
				brojac++;
			}
			// te pove�avamo u su�tini cifru za 1
			broj = broj.add(BigInteger.ONE);
		}
	}

}
