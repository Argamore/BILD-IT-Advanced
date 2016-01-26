package zadaca_25_01_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// pravimo listu za unos gradova
		Scanner unos = new Scanner(System.in);
		ArrayList<String> gradovi = new ArrayList<String>();
		// te string grad koji ce sluziti za upis gradova
		String grad = "";
		// pitamo korisnika koliko zeli unijeti gradova: 
		System.out.println("Koliko želite unijeti gradova? ");
		int brojGradova = unos.nextInt();
		// te mu kazemo da ih unese
		System.out.println("Unesite gradove: ");
		// petlja za unos se vrti, te se unosi onoliko gradova koliko je korisnik trazio
		for (int i = 0; i <= brojGradova; i++){
			grad = unos.nextLine();
			gradovi.add(grad);
		}
		unos.close();
		// te se oni sortiraju: 
		Collections.sort(gradovi);
		// i ispisuju korisniku kroz petlju: 
		System.out.print("Uneseni gradovi poredani abecedno: ");
		for (String x : gradovi){
			System.out.print(x+" / ");
		}
	}

}
