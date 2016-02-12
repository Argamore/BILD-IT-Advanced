package zadaca_11_02_2016;

import java.util.ArrayList;

public class Zadatak3 {
	public static void main(String[] args) {
		// lista za smještanje brojeva
		ArrayList<Double> list = new ArrayList<>();
		try (java.util.Scanner unos = new java.util.Scanner(System.in)) {
			System.out.println("Unesite 5 brojeva: ");
			for (int i = 0; i < 5; i++) {
				list.add(unos.nextDouble());
			}
			// metod call i print
			System.out.println("Suma unesenih brojeva je: " + sum(list));
		} 
		
		catch (Exception e) {
			System.err.println("Greška! Restartuj program.");
		}
	}
	public static double sum(ArrayList<Double> list) {
		int suma = 0;
		// petlja prolazi kroz listu i sabire brojeve, te ih return vraæa
		for (int i = 0; i < list.size(); i++) {
			suma += list.get(i);
		}
		return suma;
	}

}