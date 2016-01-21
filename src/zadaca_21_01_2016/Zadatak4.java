package zadaca_21_01_2016;

import java.util.ArrayList;

public class Zadatak4 {

	public static void main(String[] args) {
		
		System.out.println("Pozitivni cijeli brojevi koji su perfect: ");
		ArrayList <Integer> lista = new ArrayList<>();
		int suma = 0;
		// testiranje svih brojeva od 1 do 10000
		for(int i = 1; i <= 10000; i++){
			//upisivanje svih djelitelja za trenutni broj u listu
			for(int j = 1; j < i; j++){
				if(i % j == 0){
					lista.add(j);
				}
			}
			// sabiranje svih djelitelja trenutnog broja
			for(int j = 0; j < lista.size(); j++){
				suma += lista.get(j);
			}
			// ako je suma svih djelitelja trenutnog broja jednaka broju, broj je PERFEKTAN *__* i printa se
			if(suma == i){
				System.out.print(i + " ");
			}
			// sadrzaj liste se brise
			lista.clear();
			// suma se resetuje na nulu
			suma = 0;
		}
	}
}