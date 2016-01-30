package zadaca_29_01_2016;

public class Zadatak3 {

	public static void main(String[] args) {
		// varijabla rezultat sprema, rezultat, je l'
		double rezultat = 0;
		// petlja se vrti, te se odmah dijeli i dodaje na rezultat
		for (int i = 1; i < 97; i += 2){
			rezultat += i / (double)(i+2);
		}
		// i isipisuje se korisniku isti
		System.out.println(rezultat);
	}

}
