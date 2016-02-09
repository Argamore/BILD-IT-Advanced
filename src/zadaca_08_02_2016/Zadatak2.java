package zadaca_08_02_2016;

import java.math.BigInteger;

public class Zadatak2 {

	public static void main(String[] args) {
		/* eh, ovako
		// po�to tra�imo 10 brojeva koji su, kada se kvadriraju, ve�i od najve�e vrijednosti LONG-a
		// prvo �to �emo uraditi je na�i korijen, pribli�an za LONG, 
		// jer kad se on kvadrira dobijemo Long.MAX_VALUE, i svaki broj, pa makar pove�an i za 1 
		// je ve�i od Long.MAX_VALUE (9223372036854775807) 
		*/
		
		// Koristit �emo opet BigInteger, za kvadriranje, but first..
		// Vadimo korijen iz broja, te ga zaokru�ujemo na ve�i (cijeli) broj 
		long korijenMax = (long)(Math.ceil(Math.sqrt(Long.MAX_VALUE)));
		
		BigInteger broj = new BigInteger(korijenMax+"");
		BigInteger kvadratBroja;
		
		int brojac = 0;
		System.out.println("Brojevi koji, kada se kvadriraju, su ve�i od Long.MAX_VALUE\n");
		while (brojac != 10){
			// kvadriramo broj
			kvadratBroja = broj.multiply(broj);
			// ispisujemo ga
			System.out.println(brojac+1 + ". "+broj + " kad se kvadrira: "+kvadratBroja);
			// pove�avamo za 1
			broj = broj.add(BigInteger.ONE);
			// te pove�avamo broja� za 1
			brojac++;
		}
	}
}
