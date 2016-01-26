package zadaca_25_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList <>();
		int brojPozitivnih = 0, brojNegativnih = 0;
		double suma = 0;
		
		Scanner unos = new Scanner(System.in);
		boolean uslov = true;
		System.out.println("Unesite brojeve: ");
		// unos brojeva u listu
		do{
			int broj = unos.nextInt();
			// ako je unesen broj 0, unos se zavrsava
			if(broj == 0){
				uslov = false;
			}
			//ako je unesen broj razlicit od 0, broj se dodaje u listu
			else{
				list.add(broj);
				//broj se dodaje na sumu
				suma += broj;
				// ako je broj negativan, povecava se brojac za negativne brojeve
				if(broj < 0){
					brojNegativnih++;
				}
				// ako je broj pozitivan, povecava se brojac za pozitivne brojeve
				else{
					brojPozitivnih++;
				}
			}
		}while(uslov);
		unos.close();
		//racunanje prosjeka unesenih brojeva
		double prosjek = suma / list.size();
		// Stampanje rezultata
		System.out.println("Broj pozitivnih brojeva je : " + brojPozitivnih 
				+ "\nBroj negativnih brojeva je: " + brojNegativnih
				+ "\nSuma svih unesenih brojeva je: " + suma
				+ "\nProsjek svih unesenih brojeva je: " + prosjek);

	}

}