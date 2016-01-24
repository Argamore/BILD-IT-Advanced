package zadaca_24_01_2016;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		//uzimanje dva stringa od korisnika
		System.out.println("Unesite prvi string");
		String string1 = unos.nextLine();
		System.out.println("Unesite drugi string");
		String string2 = unos.nextLine();
		unos.close();
		//provjera da li su jednaki
		if(string1.equals(string2)){
			//stampanje poruke da su stringovi jednaki
			System.out.println("Prvi i drugi string su jednaki.");
		}
		//provjera da li je drugi string substring prvog stringa
		else if(string1.contains(string2)){
			System.out.println("Drugi string je substring prvog stringa");
		}else{
			System.out.println("Drugi string nije substring prvog stringa");
		}
		
	}

}