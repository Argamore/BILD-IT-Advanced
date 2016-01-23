package zadaca_22_01_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// matrica za smijestanje tacaka
		double[][] tacke = new double [2][2];
		// radius Zemlje
		final double RADIUS = 6371.01;
		
		Scanner unos = new Scanner(System.in);
		// uzimanje podataka
		System.out.println("Unesite geografsku sirinu i geografsku duzinu za prvu tacku: ");
		tacke[0][0] = Math.toRadians(unos.nextDouble());
		tacke[0][1] = Math.toRadians(unos.nextDouble());
		System.out.println("Unesite geografsku sirinu i geografsku duzinu za drugu tacku");
		tacke[1][0] = Math.toRadians(unos.nextDouble());
		tacke[1][1] = Math.toRadians(unos.nextDouble());
		unos.close();
		//formula za izracunavanje =)
		double greatCircleDistance = RADIUS * Math.acos(Math.sin(tacke[0][0]) * Math.sin(tacke[1][0]) 
				+ Math.cos(tacke[0][0]) * Math.cos(tacke[1][0]) * Math.cos(tacke[0][1] - tacke[1][1]));
		// print rezultata
		System.out.println("Great circle distance za unesene kordinate je: " + greatCircleDistance);
	}

}