package zadaca_22_02_2016;

public class Zadatak2 {
	public static void main(String[] args) {
		// korisnik unosi prvi i drugi broj
		try (java.util.Scanner unos = new java.util.Scanner(System.in)) {
			System.out.print("Unesite prvi broj: ");
			int m = unos.nextInt();
			System.out.print("Unesite drugi broj: ");
			int n = unos.nextInt();
			// te se on prosljeðuje metodi
			int divajder = najDjelitelj(m, n);
			System.out.printf("Djelitelj za %d i %d je: %d", m, n, divajder);
		} catch (Exception e) {
			System.err.println("Greška! Restartuj program.");
		}
	}
	public static int najDjelitelj(int m, int n) {
		if (m % n == 0)
			return n;
		else
			return najDjelitelj(n, m % n);
	}
}