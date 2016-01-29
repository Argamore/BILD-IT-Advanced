package miniProjekat_22_01_2016;

public class Craps10k {
	// metoda koja generiše brojeve od 1 do 6
	public static int bacanje(){
		int broj1 = (int)(Math.random()*6) + 1;
		int broj2 = (int)(Math.random()*6) + 1;
		return (broj1+broj2);
	}
	// metoda koja igra igru "Craps" po utvrðenim pravilima
	// ako korisnik izvuce broj 7 ili 11, vraca da je pobijedio
	// ako izvuce 2, 3 ili 12, vraca da je izgubio
	// inaèe baca ponovo te provjerava da li je izvuako isti broj
	// ako je izvukao isti broj, pobijedio je, ako je izvukao 7, izgubio, ako ni jedno od tog dvoga
	// baca se ponovo
	public static boolean igraj(){
		int zbir = bacanje();
		if (zbir == 7 || zbir == 11)return true;
		if(zbir == 2 || zbir == 3 || zbir == 12)return false;
		while(true){
			int bod = bacanje();
			if (bod == 7)return false;
			if (zbir == bod)return true;
		}
	}

	public static void main(String[] args) {
		// brojaci pobjede i poraza
		int brojPobjeda = 0;
		int brojPoraza = 0;
		// petlja se vrti 10.000 puta, te povecava brojac za pobjedu / poraz
		for (int i = 0; i < 10000; i++){
			// metoda se vrti 10.000 puta, te na osnovu "odgovora" povecava se brojac
			if(igraj() == true){
				brojPobjeda++;
			}
			else brojPoraza++;
		}
		// ispis rezultata
		System.out.println("Rezultat igre na 10000 puta: ");
		System.out.println("Broj pobjeda: "+brojPobjeda+"\nBroj poraza: "+brojPoraza);
	}
}
