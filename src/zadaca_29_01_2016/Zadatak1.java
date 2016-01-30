package zadaca_29_01_2016;

public class Zadatak1 {
	public static void main(String[] args) {
		// pozivanje Math.random da generiše broj izmeðu 1 i 12
		int broj = (int)(Math.random() * 12) + 1;
		// mjeseci smjesteni u niz iz kojeg se printa
		String[] mjeseci = {"Januar", "Februar", "Mart",
				"April", "Maj", "Juni", 
				"Juli", "August", "Septembar",
				"Oktobar", "Novembar", "Decembar"};
		// te pomocu izlazlnog printa uzimamo generisano broj te pozivamo string pod tim brojem iz niza 
		System.out.println(mjeseci[broj - 1]);

	}

}