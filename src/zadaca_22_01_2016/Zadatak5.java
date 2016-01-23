package zadaca_22_01_2016;

import java.util.Scanner;

public class Zadatak5 {
	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		// uzimanje broja milisekundi
		System.out.println("Unesite broj milisekundi: ");
		long milisekunde = unos.nextLong();
		unos.close();
		// pozivanje metode za pretvaranje
		System.out.println(convertMillis(milisekunde));

	}
	public static String convertMillis(long millis){
		String vrijeme = null;
		//pretvaranje milisekundi u sekunde
		int ukupnoSekundi = (int) millis / 1000;
		//odvajanje ostatka sekundi
		int sekunde = ukupnoSekundi % 60;		
		//pretvaranje sekundi u minute
		int ukupnoMinuta = ukupnoSekundi / 60;
		//odvajanje ostatka minuta
		int minute = ukupnoMinuta % 60;
		//pretvaranje minuta u sate
		int sati = ukupnoMinuta / 60;
		//sastavljanje stringa od ukupnog broja sati, ostatka minuta i ostatka sekundi
		vrijeme = sati + ":" + minute + ":" +sekunde;
		return vrijeme;
	}
}