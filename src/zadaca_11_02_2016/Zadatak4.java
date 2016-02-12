package zadaca_11_02_2016;

import java.util.ArrayList;

public class Zadatak4 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		try (java.util.Scanner unos = new java.util.Scanner(System.in)) {
			System.out.println("Unesite 10 brojeva: ");
			for (int i = 0; i < 10; i++) {
				list.add(unos.nextInt());
			}
			// prosljeðujemo listu metodi
			removeDuplicate(list);
		} catch (Exception e) {
			System.err.println("Greška! Restartuj program.");
		}
	}

	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> jedinstveni = new ArrayList<>();
		// ubacujemo prvi element iz liste u jedinstvenu
		jedinstveni.add(list.get(0));
		// pomoæu petlje provjeravamo da li imamo iste brojeve u listama
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < jedinstveni.size(); j++) {
				// ako imamo, preskaèe se i ne dodaje
				if (list.get(i) == jedinstveni.get(j)) {
					break;
				}
				// u suprotnom se dodaje
				if (j == jedinstveni.size() - 1) {
					jedinstveni.add(list.get(i));
				}

			}
		}
		// print liste
		for (int x : jedinstveni) {
			System.out.print(x + " ");
		}

	}

}