package zadaca_20_01_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		//uzimanje reèenice od korisnika
		System.out.println("Unesite reèenicu: ");
		String recenica = unos.nextLine();
		unos.close();
		//prolazak kroz citavu reèenicu
		for(int i = 0; i < recenica.length(); i++){
			//odvajanje slova iz reèenice
			char slova = recenica.charAt(i);
			// ispisivanje neparnih
			if(i % 2 == 0){
				System.out.print(slova);
			}
		}

	}

}