package zadaca_08_02_2016;

import java.math.BigInteger;

public class Zadatak4 {

	public static void main(String[] args) {
		// prvo ispisujemo zaglavlje
		System.out.println("p     2^p-1\n");
		// pa onda petlju pravimo
		for (int p = 0; p < 101; p++){
			// te raèunamo po datoj formuli koristeæi veæ "gotove" metode
			BigInteger broj = new BigInteger("2").pow(p).subtract(BigInteger.ONE);
			// ako je prime, ispisuje ga, that's it.
			if (broj.isProbablePrime(1)) {
				System.out.println(p + "	" + broj);
			}
		}
	}

}
