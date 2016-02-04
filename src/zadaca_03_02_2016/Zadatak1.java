package zadaca_03_02_2016;

import java.util.ArrayList;

public class Zadatak1 {

	public static void main(String[] args) {
		// try / catch statement za hvatanje grešaka, autoclose..
		try(java.util.Scanner unos = new java.util.Scanner(System.in)){
			// korisnik unosi koliko ima radnika
			System.out.println("Unesite koliko imate radnika: ");
			int brojRadnika = unos.nextInt();
			// pa onda unosi koliko ima radnih dana
			System.out.println("Unesite broj radnih dana: ");
			int brojDana = unos.nextInt();
			// te se provjerava da korisnik nije pohlupao lonèiæe koliko dana ima sedmièno
			while(brojDana > 7 || brojDana < 1){
				System.out.println("Ne možete imati sedmièno više od 7 dana niti manje od 1.\nUnesite broj dana: ");
				brojDana = unos.nextInt();
			}
			// pravi se matrica velicine brojRadnika x brojDana
			int[][] matrica = new int[brojRadnika][brojDana];
			// ispisuje se poruka korisniku da unese broj sati za svakog radnika
			System.out.println("Unesite broj sati za svakog radnika. ");
			// te mu se printaju dani da se lakše snaðe za unos
			switch(brojDana){
			case 1: System.out.print("P"); break;
			case 2: System.out.print("P U"); break;
			case 3: System.out.print("P U S"); break;
			case 4: System.out.print("P U S È"); break;
			case 5: System.out.print("P U S È P"); break;
			case 6: System.out.print("P U S È P S"); break;
			case 7: System.out.print("P U S È P S N"); break;
			}
			System.out.println();
			// korisnik unosi podatke za svakog radnika, za dani broj radnih dana
			for (int i = 0; i < matrica.length; i++){
				for(int j = 0; j < matrica[0].length; j++){
					matrica[i][j] = unos.nextInt();
				}
			}
			// u ArrayListu stavljamo broj sati za svakog radnika
			ArrayList<Integer> brojSati = new ArrayList<Integer>();
			int brojacSati = 0;
			// koji se sabire unutar petlje
			for (int i = 0; i < matrica.length; i++){
				for(int j = 0; j < matrica[0].length; j++){
					brojacSati = brojacSati + matrica[i][j];
				}
				brojSati.add(brojacSati);
				// te se dodaje u listu, i resetuje, da moze za sljedeæeg radnika da sabire
				brojacSati = 0;
			}
			// i onda se to ispisuje nazad korisniku, koliko je ko radio..
			System.out.println();
			int brojac = 1;
			for (int x : brojSati){
				System.out.printf("Radnik %d je radio %d sati.", brojac, x);
				brojac++;
				System.out.println();
			}
			// Hvatanje eksepšna, ako se šta unese kako ne treba..
		} catch (Exception e){
			System.err.println("Greška! Restartuj program.");
		}
	}
}
