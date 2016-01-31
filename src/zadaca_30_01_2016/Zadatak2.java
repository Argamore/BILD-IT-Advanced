package zadaca_30_01_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// korisnik unosi svoj string, reèenicu, šta god hoæe
		try (Scanner unos = new Scanner(System.in)){
		System.out.println("Unesite vaš string: ");
			String rijec = unos.nextLine();
			unos.close();
			// ako postoji spejs izmedju rijeci, ova linija koda ga brise
			rijec = rijec.replaceAll("\\s","");
			// i sve se to ispisuje korisniku
			System.out.println("Dužina stringa: "+rijec.length()+" slova.\nPrvo slovo je: "+rijec.charAt(0));
		}
		// ako se nesto krivo unese, izbaci ovaj error
		catch (Exception e){
			System.out.println("Niste unijeli kako treba.");
		}
	}
}
