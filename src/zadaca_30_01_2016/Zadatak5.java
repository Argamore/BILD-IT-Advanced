package zadaca_30_01_2016;

import java.util.Scanner;

public class Zadatak5 {
	/*
	 * Ideju potpomogao kolega i stranica http://javaconceptoftheday.com/how-to-create-pyramid-of-numbers-in-java/
	 */
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesi visinu piramide: "); 
		// korisnik unosi visinu piramide
		int visina = unos.nextInt();
		unos.close();
		// znamo da na dnu piramide mora biti taèan broj brojeva
		// ako korisnik unese npr broj 5, na dnu piramide imamo 9 brojeva (5 4 3 2 1 2 3 4 5) zato sto se ne ponavlja 1
		int[] niz = new int [visina*2-1];	
		// spejser odvaja brojeve od lijeve ivice, tj, koliko imamo brojeva do broja 1 (sredine) 
		int spejser = niz.length - visina;
		
		// prvo se rješava lijeva strana niza, u koju se upisuju brojevi, ...5 4 3 2
		for(int i = 0, j = visina; i < spejser; i++, j--){
		// provjera stampanja	System.out.print(j+" ");
			niz[i] = j;
		}
		// provjera štapmanja System.out.println();
		// pa onda desna strana, tj 1 2 3 4 5...
		for(int i = spejser, j = 1; i < niz.length; i++, j++){
		// provjera stampanja	System.out.print(j+" ");
			niz[i] = j;
		}
		
		System.out.println();
		
		// kada se brojevi postave u niz, vrši se njihovo ispisivanje te dodavanje praznog prostora, da se 
		// odmaknu brojevi od lijeve ivice, i da se posloze fino, poravnaju
		
		for(int i = 0; i < visina; i++){
			for(int j = 1; j < visina - i; j++){
				System.out.print("    ");	
			}
			for(int j = spejser - i; j <= spejser + i; j++ ){
				// ako u nizu nema dvocifrenih brojeva, stampa se veæe odstojanje
				if(niz[j] < 10){
					System.out.print(niz[j] + "   ");
					// inaèe se štampa malo manje, zbog velièine dvocifrenih brojeva
				}else{
					System.out.print(niz[j] + "  ");
				}
			}
			// prelazi se u novi red
			System.out.println();
		}
	}		
}