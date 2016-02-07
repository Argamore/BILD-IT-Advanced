package zadaca_05_02_2016;

public class Zadatak5 {

	public static void main(String[] args) {
		// korisnik unosi koordinate linija
		try(java.util.Scanner unos = new java.util.Scanner(System.in)){
			System.out.println("Unesite x1, y1: ");
			int x1 = unos.nextInt();
			int y1 = unos.nextInt();
			System.out.println("Unesite x2, y2: ");
			int x2 = unos.nextInt();
			int y2 = unos.nextInt();
			System.out.println("Unesite x3, y3: ");
			int x3 = unos.nextInt();
			int y3 = unos.nextInt();
			System.out.println("Unesite x4, y4: ");
			int x4 = unos.nextInt();
			int y4 = unos.nextInt();
			
			double a = y1 - y2;
			double b = x1 - x2;
			double c = y3 - y4;
			double d = x3 - x4;
			double e = (a * x1) - (b * y1);
			double f = (c * x3) - (d * y3);
			
			// kreiranje objekta i pozivanje klase
			
			LinearEquation jednacina = new LinearEquation(a,b,c,d,e,f);
			// ako se jednaèina može riješiti, ispisuje rezultat
			if(jednacina.isSolvable()){
				System.out.println(jednacina);
			} else {
				// ako ne može, ispisuje da su paralelne
				System.out.println("Linije su paralelne!");
			}
		} catch (Exception e){
			System.err.println("Greška! Restartuj program.");
		}

	}

}
