package zadaca_02_02_2016;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// korisnik unosi velicinu matrice, redove i kolone, te unosi u matricu
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite velicinu reda: ");
		int red = unos.nextInt();
		System.out.println("Unesite velicinu kolone: ");
		int kolona = unos.nextInt();
		System.out.println("Unesite brojeve u vašu matricu: ");
		double[][] matrica = new double[red][kolona];
		for(int i = 0; i < red; i++){
			for(int j = 0; j < kolona; j++){
				matrica[i][j] = unos.nextDouble();
			}
		}		
		// nakon cega unosi koju kolonu zeli da sabere
		System.out.println("Unesite koju kolonu želite da saberete: ");
		int saberiKolonu = unos.nextInt();
		// ako slucajno unese vecu kolonu nego sto je zadata, prekida se program.
		if (saberiKolonu > kolona){
			System.err.println("Unijeli ste veæu kolonu nego što postoji..");
			System.exit(0);
		}
		unos.close();
		// i onda dobiva rezultat sabiranja te kolone
		System.out.println("Zbir Vaše kolone je: "+ sumColumn(matrica, saberiKolonu));
		

	}
	public static double sumColumn(double[][] m, int columnIndex){
		double suma = 0;
		// petlja prolazi kroz nasu matricu, i sabire sve brojeve u datoj koloni
		for(int i = 0; i < m.length; i++){
			suma += m[i][columnIndex];
		}
		// te vraæa sumu te kolone nazad
		return suma;
	}
}