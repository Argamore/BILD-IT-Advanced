package zadaca_01_02_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// korisnik unosi brojeve
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int number = unos.nextInt();
		System.out.println("Unesite broj cifara: ");
		int width = unos.nextInt();
		unos.close();
		// pozivanje metode, te print rezultata
		System.out.println(format(number, width));

	}
	public static String format(int number, int width){
		
		String broj = number + "";
		String rezultat = "";
		// provjera da li je širina veæa od broja
		if(width > broj.length()){
			// ispisujuje se onoliko nula kolika je razlika izmedju velicine unesenog broja, i "širine" broja
			for(int i = 0; i < width - broj.length(); i++){
				rezultat += "0";
			}
		}
		// dodajemo na kraju broj na unešene nule
		rezultat += broj;
		return rezultat;
	}

}