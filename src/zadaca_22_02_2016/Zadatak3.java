package zadaca_22_02_2016;

public class Zadatak3 {
	public static void main(String[] args) {
		// petlja šalje metodi i vraæa nam sumu za taj broj
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Suma serije za %d je %.2f\n", i, m(i));
		}
	}
	// metoda za raèunanje te sume brojeva po zadatom principu.
	public static double m(int i) {
		if (i == 1)
			return 1;
		else
			return (double) 1 / i + m(i - 1);
	}
}