/*
 * Author: Sefer Kuduzovic
 */
package zadaca_18_01_2016;
import java.util.Scanner;
public class Zadatak2 {

	public static void main(String[] args) {
		// korisnik unosi prvih 9 brojeva u niz
		Scanner unos = new Scanner(System.in);
		int[] niz = new int[9];
		System.out.println("Unesite prvih 9 brojeva ISBN-a: ");
		for (int i = 0; i < niz.length; i++){
			niz[i] = unos.nextInt();
		}
		// zatim se na osnovu tog niza raèuna deseti (zadnji) broj / X
		int d10 = 0;
		for (int i = 0; i < 9; i++){
			d10 = d10 + (niz[i] * (i+1));
			if (i == 9){
				d10 = d10 + (niz[i] * i);
			}
		}
		// printa se prvih 9 brojeva
		System.out.println("\nVaš ISBN izgleda ovako: ");
		for (int i = 0; i < niz.length; i++){
			System.out.print(niz[i]);
		}
		// te se na to dodaje rezultat petlje 
		if (d10%11 == 10){
			System.out.print("X");
		}else {
			System.out.print(d10%11);
		}
		unos.close();
	}
}
