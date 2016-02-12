package zadaca_11_02_2016;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		try (java.util.Scanner unos = new java.util.Scanner(System.in)) {
			System.out.println("Unesite 5 brojeva: ");
			for (int i = 0; i < 5; i++) {
				list.add(unos.nextInt());
			}
			// pozivanje metode za sortiranje
			sort(list);
			// print rezultata

			for (int x : list) {
				System.out.print(x + " ");
			}
		} catch (Exception e) {
			System.err.println("Greška! Restartuj program.");
		}
	}

	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}
}