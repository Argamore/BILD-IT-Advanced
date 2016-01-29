package miniProjekat_22_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Craps {
	public static int bacanje(){
		int broj1 = (int)(Math.random()*6) + 1;
		int broj2 = (int)(Math.random()*6) + 1;
		
		return broj1+broj2;
	}

	public static void igraj(){
		int zbir = bacanje();
		if (zbir == 7 || zbir == 11){
			System.out.println("Broj izvuèen: "+zbir+" \nPobijedili ste!\n");
		}
		else if(zbir == 2 || zbir == 3 || zbir == 12){
			System.out.println("Broj izvuèen: "+zbir+"\nIzgubili ste.\n");
		}
		else{
			while(true){
			int bod = bacanje();
			if (bod == 7){
				System.out.println("Izvukli ste bili broj: "+zbir+", te je kocka baèena ponovo, nakon èega ste izvukli 7, što znaèi da ste izgubili.\n");
				break;
			}
			if (zbir == bod){
				System.out.println("Izvukli ste broj: "+zbir+" te nakon novog bacanja broj: "+bod+"\nPobijedili ste!\n");
				break;
			}
					}
			}
	}
	public static void main(String[] args) {
		int unos = 2;
		Scanner citac = new Scanner(System.in);
		System.out.println("Unesite: ");
		do{
			if (unos == 1){
			igraj();
			unos = 2;
			}
			if (unos == 2){
				System.out.println("Nova igra: [1]\nZavrši: [0]");
				while(true){
					try{
						unos = citac.nextInt();		
						break;
					}
					catch (InputMismatchException e) {
						System.out.println("Greška pri unosu broja! Restartuj program.");
						System.exit(0);
					}
				}
			}
			else{
				unos = 0;
				System.exit(0);
			}
		}while (unos != 0);
		citac.close();
	}
}
