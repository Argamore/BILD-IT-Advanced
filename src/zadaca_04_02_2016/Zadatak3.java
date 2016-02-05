package zadaca_04_02_2016;

public class Zadatak3 {

	public static void main(String[] args) {
		// pravimo niz "brojevi" u kojeg ubacujemo generisane brojeve
		int[] brojevi = new int[100000];
		for(int i = 0; i < brojevi.length; i++){
			brojevi[i] = (int)(Math.random() * 100 + 1);
		}
		// instanciramo klasu stopwatch
		StopWatch stopwatch = new StopWatch();
		// uzimamo poèetno vrijeme
		stopwatch.start();
		// te šaljemo brojeve metodi na sortiranje
		sortirajNiz(brojevi);
		// te uzimamo vrijeme nakon sortiranja
		stopwatch.stop();
		// i provjeravamo koliko je vremena proslo
		long trajanje = stopwatch.getElapsedTime();
		// i onda fino ispišemo rezultat
		// ako hoæeš u milisekundama, samo obriši formulu :P
		System.out.println("Za sortiranje 100k brojeva potrebno je: " + ((trajanje / 1000)%60) + " sekundi");

	}
	// metoda za sortiranje
	public static int[] sortirajNiz(int[] niz){
        
		// standardna petlja za sortiranje
		// prolazimo kroz brojeve, te shodno tome gledamo da li je broj "j" veæi od sljedeæeg
		// ako jeste, mijenjaju mjesta (values) i idemo dalje
        for (int i = 0; i < niz.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < niz.length; j++)
                if (niz[j] < niz[index])
                    index = j;
      
            int temp = niz[index]; 
            niz[index] = niz[i];
            niz[i] = temp;
        }
        // vraæamo sortiran niz
        return niz;
    }
}