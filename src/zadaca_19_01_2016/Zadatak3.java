package zadaca_19_01_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// korisnik unosi re�enice:
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite prvu re�enicu: ");
		String recenica1 = unos.nextLine();
		System.out.println("Unesite drugu re�enicu: ");
		String recenica2 = unos.nextLine();
		unos.close();
		if (recenica1.isEmpty() || recenica2.isEmpty()){
			System.out.println("Niste ni�ta unijeli.");
		}
		// nakon �ega se one splitaju na pojedinacne rijeci:
		String[] rijeci1 = recenica1.split(" ");
		String[] rijeci2 = recenica2.split(" ");
		
		// koje se ubacuju u listu ako su STRIKTNO JEDNAKE
		ArrayList<String> listaRijeci = new ArrayList<String>();
		
		// petlja provjerava rijeci, te upisuje u listu samo ako su pocetne rijeci iste za obje re�enice
		for (int i = 0; i < rijeci1.length; i++){
			if (rijeci1[i].contentEquals(rijeci2[i])){
				listaRijeci.add(rijeci1[i]);
				// ako �eli� provjeriti koje se rijeci ponavljaju (iste) u obje re�enice
				// samo obri�i ovo dole else break i to je to
			}else break;
		}
		// provjerava da li ima sta u listi. Ako nema, zavr�ava se program, a u suprotnom ispisuje rije�i.
		if (listaRijeci.isEmpty()){
			System.out.println("\nNema zajedni�kih prefiksa.");System.exit(0);
		}else System.out.println("\nNajve�i zajedni�ki prefiks za ova dva stringa je: ");
		// ako ima zajednickih prefiksa, ispisuje ih
		for (String rijec : listaRijeci){
			System.out.print(rijec+" ");
		}
	}

}
