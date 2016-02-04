package zadaca_03_02_2016;

import java.util.Random;

public class Zadatak3 {

	public static void main(String[] args) {
		Random giveNum = new Random();

		// matrica u koju æemo upisati 1 i 0
		int[][] matrica = new int[4][4];

		// niz koji drzi sve 1 u redovima
		int[] brojacRed = new int[matrica.length];

		// niz koji drzi sve 1 u kolonama
		int[] brojacKolona = new int[matrica[0].length];

		// uz pomoc petlje ispunjavamo matricu sa 1 i 0
		for (int i = 0; i < matrica.length; i++) {
			for (int k = 0; k < matrica[i].length; k++) {
				matrica[i][k] = giveNum.nextInt(2);
			}
		}

		// te je printamo korisniku
		for (int i = 0; i < matrica.length; i++) {
			for (int k = 0; k < matrica[i].length; k++) {
				System.out.print(matrica[i][k]);
				if (matrica[i][k] == 1) {
					brojacRed[i]++;
				}
			}
			System.out.println();
		}

		// stavljen je pocetni red, kao red s najviše jedinica
		// ako nije tako, onda ce se brojac reda povecati na onaj sa vise 1
		int red = 0, brojac1 = brojacRed[0];

		// preskace se prvi red jer nema potrebe da se provjerava sam sa sobom
		for (int i = 1; i < brojacRed.length; i++) {
			if (brojacRed[i] > brojac1) {
				brojac1 = brojacRed[i];
				red = i;
			}
		}

		// print the rows adding 1 for user friendliness
		System.out.println("Red "+ red +" ima najvise jedinica, èak "+ brojac1);

		// kolona nam sluzi za pracenje kolone te indeksa u brojacu
		int kolona = 0;
		while (kolona < matrica[0].length) {
			red = 0;
			// vrtimo loop dokle god ima redova
			while (red < matrica.length) {
				// ako u koloni imamo 1, onda poveæavamo broj reda dok broj kolone ostaje isti
				if (matrica[red][kolona] == 1) {
					brojacKolona[kolona]++;
					red++;
				} else {
					red++;
				}
				// ako nema više redova, poveæavamo kolonu
			}
			kolona++;
		}
		// uz pomoc petlje provjeravamo koja je kolona imala najvise 1
		
		int kolonaMax = 0, brojac2 = brojacKolona[0];
		for (int i = 1; i < brojacKolona.length; i++) {
			if (brojacKolona[i] > brojac2) {
				brojac2 = brojacKolona[i];
				kolonaMax = i;
			}
		}
		System.out.println("Kolona "+kolonaMax+" ima najviše jedinica, èak "+brojac2);

	}
}