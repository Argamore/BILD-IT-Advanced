package zadaca_03_02_2016;
public class Zadatak2 {
	public static void main(String[] args) {
		try(java.util.Scanner unos = new java.util.Scanner(System.in)){
		// korisnik unosi elemente u prvu matricu:
		System.out.println("Unesite elemente prve matrice 3x3");
		double[][] a = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = unos.nextDouble();
			}
		}
		// a zatim unosi u drugu
		System.out.println("Unesite elemente druge matrice 3x3");
		double[][] b = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = unos.nextDouble();
			}
		}		
		// saljemo matrice metodi
		double[][] c = multiplyMatrix(a, b);
		// kad ona odradi svoje, printamo rezultat množenja
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		} 
	}catch (Exception e){
			System.err.println("Greška! Restartuj program.");
		}

	}
	// metoda koja mnozi dvije matrice
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		
		double[][] finalMatrica = new double[3][3];
		// petlja u kojoj se mnoze dvije matrice
		for (int i = 0; i < 3; i++){	//za redove
			for (int j = 0; j < 3; j++){   //za kolone
				// formula za mnozenje 3x3 matrice
				finalMatrica[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
			}
		}
		return finalMatrica;
	}

}
