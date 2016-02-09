package zadaca_08_02_2016;

import java.math.BigInteger;

public class Zadatak2 {

	public static void main(String[] args) {
		/* eh, ovako
		// pošto tražimo 10 brojeva koji su, kada se kvadriraju, veæi od najveæe vrijednosti LONG-a
		// prvo što æemo uraditi je naæi korijen, približan za LONG, 
		// jer kad se on kvadrira dobijemo Long.MAX_VALUE, i svaki broj, pa makar poveæan i za 1 
		// je veæi od Long.MAX_VALUE (9223372036854775807) 
		*/
		
		// Koristit æemo opet BigInteger, za kvadriranje, but first..
		// Vadimo korijen iz broja, te ga zaokružujemo na veæi (cijeli) broj 
		long korijenMax = (long)(Math.ceil(Math.sqrt(Long.MAX_VALUE)));
		
		BigInteger broj = new BigInteger(korijenMax+"");
		BigInteger kvadratBroja;
		
		int brojac = 0;
		System.out.println("Brojevi koji, kada se kvadriraju, su veæi od Long.MAX_VALUE\n");
		while (brojac != 10){
			// kvadriramo broj
			kvadratBroja = broj.multiply(broj);
			// ispisujemo ga
			System.out.println(brojac+1 + ". "+broj + " kad se kvadrira: "+kvadratBroja);
			// poveæavamo za 1
			broj = broj.add(BigInteger.ONE);
			// te poveæavamo brojaè za 1
			brojac++;
		}
	}
}
