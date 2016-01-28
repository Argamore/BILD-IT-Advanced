package zadaca_27_01_2016;

import java.util.Scanner;

public class Zadatak5 {


	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		// informacije o prvom pakovanju
		System.out.println("Tezina i cijena prvog pakovanja: ");
		double tezina1 = unos.nextDouble();
		double cijena1 = unos.nextDouble();
		// informacije o drugom pakovanju
		System.out.println("Tezina i cijena drugog pakovanja: ");
		double tezina2 = unos.nextDouble();
		double cijena2 = unos.nextDouble();
		unos.close();
		//racunanje odnosa tezine i cijene za proizvode
		double odnosTezine = (tezina2 / tezina1) * 100;
		double odnosCijene = (cijena2 / cijena1) * 100;
		// ako su isti, nema razlike
		if(odnosTezine == odnosCijene){
			System.out.println("Odnos cijene i kolicine je isti, tako da je svejedno koji proizvod cete kupiti");
		}
		//ako je odnos tezine manji od odnosa cijene, onda prvi proizvod ima bolji price
		else if(odnosTezine < odnosCijene){
			System.out.println("Isplatniji prvi proizvod :)");
		}
		// u suprotnom, bolji je drugi proizvod :)
		else{
			System.out.println("Isplatniji drugi proizvod :)");
		}

	}

}