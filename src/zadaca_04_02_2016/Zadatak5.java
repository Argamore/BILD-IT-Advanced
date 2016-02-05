package zadaca_04_02_2016;

public class Zadatak5 {

	public static void main(String[] args) {

		try (java.util.Scanner unos = new java.util.Scanner(System.in)) {
			// korisnik unosi x * x matrice
			// te je ispunjava
			System.out.println("Unesite 'x' za matricu 'x' * 'x'");
			int x = unos.nextInt();
			double[][] matrica = new double[x][x];
			System.out.println("Unesite elemente u matricu: ");
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < x; j++) {
					matrica[i][j] = unos.nextDouble();
				}
			}
			unos.close();
			// pozivanje metode
			Location lokacija = locateLargest(matrica);
			// print rezultata
			System.out
					.println("Najveæi element matrice nalazi se na lokaciji: " + lokacija.row + ", " + lokacija.column);
		} catch (Exception e) {
			System.err.println("Greška! Restartuj program.");
		}

	}

	public static Location locateLargest(double[][] a) {
		// instanciranje i pravljenje novog objekta
		Location lokacija = new Location();
		int red = 0;
		int kolona = 0;
		double max = 0;
		// petlja prolazi kroz matricu i provjerava koji je broj najveæi
		// ako je veæi od prethodnog, on se sprema u "max" a koordinate u red /
		// kolonu
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				// velièina
				if (a[i][j] > max) {
					max = a[i][j];
					// lokacija
					red = i;
					kolona = j;
				}
			}
		}
		// te to prosljeðujemo objektu
		lokacija.row = red;
		lokacija.column = kolona;
		// kojeg vraæamo..
		return lokacija;
	}

}