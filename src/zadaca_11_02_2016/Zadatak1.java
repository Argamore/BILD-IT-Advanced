package zadaca_11_02_2016;

public class Zadatak1 {
	public static void main(String[] args) {
		try (java.util.Scanner unos = new java.util.Scanner(System.in)) {
			System.out.println("Unesite x (X*X): ");
			int x = unos.nextInt();
			// kreiranje matrice sa unijetom velicinom
			int[][] matrica = new int[x][x];
			// unos generisanih vrijednosti u matricu i stampanje matrice
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < x; j++) {
					matrica[i][j] = (int) (Math.random() * 2);
					System.out.print(matrica[i][j] + " ");
				}
				System.out.println();
			}

			int[] redovi = new int[x];
			int[] kolone = new int[x];
			// brojaèi
			int red = 0;
			int kolona = 0;
			// petlja prolazi kroz matricu, gleda gdje je 1, shodno tome
			// poveæava brojaè
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < x; j++) {
					if (matrica[i][j] == 1) {
						red++;
					}
					if (matrica[j][i] == 1) {
						kolona++;
					}
					// saljemo nizu brojace i postavlja ih na odreðene pozicije
					// u nizu
					if (j == x - 1) {
						redovi[i] = red;
						kolone[i] = kolona;
						// resetujemo brojaèe za novu kolonu i red
						red = 0;
						kolona = 0;
					}
				}
			}

			int rowMax = 0;
			int columnMax = 0;

			// petlja za provjeru koji red i kolona imaju najviše 1
			for (int i = 0; i < x; i++) {
				if (redovi[i] > redovi[rowMax]) {
					rowMax = i;
				}
				if (kolone[i] > kolone[columnMax]) {
					columnMax = i;
				}
			}
			// print rješenja:
			System.out.println("Red sa najviše jedinica: " + rowMax);
			System.out.println("Kolona sa najviše jedinica: " + columnMax);

		} catch (Exception e) {
			System.err.println("Greška! Restartuj program.");
		}
	}

}