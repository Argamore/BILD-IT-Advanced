package zadaca_06_02_2016;

public class Zadatak3 {

	public static void main(String[] args) {
		
		MyPoint mp1 = new MyPoint();
		MyPoint mp2 = new MyPoint(7, 13.5);
		
		// pozivanje metode za raèunanje distance i njen rezultat
		System.out.println("Udaljenost izmeðu taèaka: "+mp1.distance(mp1, mp2));
	}
}
