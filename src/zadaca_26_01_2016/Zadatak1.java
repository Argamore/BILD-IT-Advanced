package zadaca_26_01_2016;

public class Zadatak1 {

	public static void main(String[] args) {
		// generisanje tri uppercase karaktera
		char karakter1 = (char)(Math.random()*26 + 'A');
		char karakter2 = (char)(Math.random()*26 + 'A');
		char karakter3 = (char)(Math.random()*26 + 'A');
		// generisanje cetri broja
		int broj1 = (int)(Math.round(Math.random()*9));
		int broj2 = (int)(Math.round(Math.random()*9));
		int broj3 = (int)(Math.round(Math.random()*9));
		int broj4 = (int)(Math.round(Math.random()*9));
	
		// stampanje rezultata
		System.out.println("Generisana tablica: " + karakter1 + karakter2 + karakter3 + "-" + broj1 + broj2 + broj3 + broj4);

	}

}