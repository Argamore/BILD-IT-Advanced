package zadaca_11_02_2016;

import java.util.ArrayList;

public class Zadatak5 {

	public static void main(String[] args) {
		// pravimo 3 liste.

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();

		try (java.util.Scanner unos = new java.util.Scanner(System.in)) {
			/** Korisnik unosi brojeve u obje liste */
			
			System.out.println("Unesite 5 brojeva u prvu listu: ");
				for (int i = 0; i < 5; i++) {
					list1.add(unos.nextInt());
				}
			System.out.println("Unesite 5 brojeva u drugu listu: ");
				for (int i = 0; i < 5; i++) {
					list2.add(unos.nextInt());
				}
				
			// poziv metode
			list3 = union(list1, list2);
			// print gotove liste
			for (int x : list3) {
				System.out.print(x + " ");
			}
		} catch (Exception e) {
			System.err.println("Greška! Restartuj program.");
		}

	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		// dodajemo elemente iz obje liste i vraæamo treæu zajednièku listu
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		return list3;

	}

}