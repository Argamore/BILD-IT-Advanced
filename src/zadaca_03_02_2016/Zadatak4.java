package zadaca_03_02_2016;

public class Zadatak4 {
	public static void sort(int[][] matrix) {
		// prepisujemo matricu
		int[][] rezultat = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				rezultat[i][j] = matrix[i][j];

		int temp = 0;
		// te nakon toga uporeðujemo redove i kolone matrice, te sortiramo na osnovu toga
		for (int red = 0; red < rezultat.length; red++) {
			for (int kolona = 0; kolona < rezultat[red].length; kolona++) { 
				for (int nextCol = kolona; nextCol < rezultat[red].length; nextCol++) {
					if (rezultat[red][kolona] > rezultat[red][nextCol]) {
						temp = rezultat[red][kolona];
						rezultat[red][kolona] = rezultat[red][nextCol];
						rezultat[red][nextCol] = temp;
					}
				}
				System.out.print(rezultat[red][kolona] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// pravimo matricu, te upisujemo random brojeve u nju
		int[][] matrica = new int[3][3];
		for (int i = 0; i < matrica.length; i++){
			for (int j = 0; j < matrica[0].length; j++){
				matrica[i][j] = 1 + (int)(Math.random()*9);
			}
		}
		// prikazujemo korisniku matricu prije sortiranja
		System.out.println("Matrica prije sortiranja: ");
		for (int i = 0; i < matrica.length; i++){
			for(int j = 0; j < matrica[0].length; j++){
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		// te poslije sortiranja
		System.out.println("Matrica poslije sortiranja: ");
		// saljemo matricu metodi koja vraæa sortiranu matricu
		// sortira red s lijeve na desnu stranu!!
		sort(matrica);
		
	}
}
