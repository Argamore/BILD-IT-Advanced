package zadaca_29_01_2016;

import java.util.Scanner;

/*
 *  0 = rock
 *  1 = paper
 *  2 = scissors
 *  
 * 1 < 0 > 2
 * 2 < 1 > 0
 * 0 < 2 > 1 
 */

public class Zadatak2 {
	// glavna metoda u kojoj se odvija provjera ko je pobijedio, kako je igra tekla.
	private static void igraj(int human, int pc){
		if (human == pc){
			System.out.println("Tied.");
		}
		if (human == 0 && pc == 1 || pc == 2 && human == 1 || human == 1 && pc == 2){
			System.out.println("Computer wins.");
		}
		if (human == 0 && pc == 2 || pc == 1 && human == 2 || human == 1 && pc == 0){
			System.out.println("You win.");
		}
	}
	// metoda u kojoj se generiše broj od 0 do 2
	private static int computerRandom(){
		int AI = (int)(Math.random()*3);
		return AI;
	}
	public static void main(String[] args) {
		// ispisuje se poruka, te korisnik unosi šta želi da igra
		int unos = 0;
		Scanner citac = new Scanner(System.in);
		System.out.println("Let's play ROCK / PAPER / SCISSORS !");
		System.out.println("[0] = Rock\n[1] = Paper\n[2] = Scissors");
		System.out.println("If your input is less than 0 / more than 2, the game ends.");
		// petlja se vrti dokle god korisnik ne unese broj veæi od 2 ili manji od 0;
		do{
			int pc = computerRandom();
			unos = citac.nextInt();
			// ako unese takav broj, završava se program uz poruku
			if(unos <0 || unos >2){
				unos = 3;
				System.out.println("Thank you for playing!");
			}
			igraj(unos, pc);
			if (unos == 1 | unos == 2 | unos == 0){
				System.out.println("The game continues. Please input a number again: ");
			}
		}while(unos != 3);
		
		citac.close();
	}
}
