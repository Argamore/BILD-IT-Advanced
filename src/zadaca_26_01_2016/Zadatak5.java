package zadaca_26_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// lista u koju se unose brojevi: 
		ArrayList<Integer> list = new ArrayList <>();
		// niz u koji se upisuje broj ponavljanja brojeva
		int[]brojPuta = new int[100];
		
		Scanner unos = new Scanner(System.in);
		boolean uslov = true;
		System.out.println("Unesite brojeve: ");
		//unos brojeva u listu
		do{
			int broj = unos.nextInt();
			// ako je unesen broj 0 unos se zavrsava
			if(broj <= 0){
				uslov = false;
				System.out.println("The end.");
			}
			//a ko je unesen broj razlicit od 0, broj se dodaje u listu
			else{
				list.add(broj);
				brojPuta[broj - 1]++;
			}
		}while(uslov);
		unos.close();
		// prolaz kroz niz i printa rezultat, koliko se koji broj ponovio put :D
		for(int i = 0; i < brojPuta.length; i++){
			if(brojPuta[i] > 0){
				// print broja ponavljanja za sve brojeve koji su se pojavili barem jednom
				System.out.println("Broj " + (i + 1) + " se pojavio " + brojPuta[i] + " puta.");
			}
		}

	}

}