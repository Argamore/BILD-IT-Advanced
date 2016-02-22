package zadaca_22_02_2016;
public class Zadatak4 {
	public static void main(String[] args) {
		// unos od korisnika, te prosljeðivanje metodi.
		try (java.util.Scanner unos = new java.util.Scanner(System.in)) {
			System.out.print("Unesite broj: ");
			int brojka = unos.nextInt();
			double suma = sumaMetoda(brojka);
			System.out.println("Suma je: " + suma);
		} catch (Exception e) {
			System.err.println("Provjeri unos, restartuj program.");
		}
	}
	// metoda (rekurzivna) za raèunanje po zadatoj formuli
	public static double sumaMetoda(double i) {
		i--;
		if (i <= 1)
			return 1;
		return sumaMetoda(i / i - 1) + sumaMetoda(i-1/i-3);
	}
}