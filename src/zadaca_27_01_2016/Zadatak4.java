package zadaca_27_01_2016;

public class Zadatak4 {
	public static void main(String[] args) {
		int brojac = 0, i = 10;
		// petlja se vrti dok ne dobijemo 100 palindrome emirp brojevaa :)
		while(brojac < 100){
			// provjerava je li broj palindrom i da li je prost
			if(isPrime(i) && i == reverse(i)){
				// ako je ispisano 10 brojeva, new line baby
				if(brojac != 0 && brojac % 10 == 0){
					System.out.println();
				}
				// broj se printa
				System.out.print(i + " ");
				//brojac linija (10 po liniji)
				brojac++;
			}
			// povecavamo broj za dalju provjeru
			i++;
		}

	}
	// metoda za ispis broja:
		public static int reverse(int number){
			int rikverc = 0;
			int broj = 0;
			// metoda radi dok ne ostane niti jedna cifra, tj do 0.
			while(number != 0){
				// odvajanje zadnjeg broja od unosa
				broj = number % 10;
				number = number / 10;
				rikverc = rikverc * 10;
				// dodavanje odvojene cifre novom broju
				rikverc += broj;
			}
			return rikverc;
		}
	/*
	 * metoda za ispitivanje da li je broj prost
	 */
	public static boolean isPrime(int n){
		boolean isPrime = true;
		// da bi broj bio prost mora biti veci od jedan
		if(n < 2){
			isPrime = false;
		}else{
			// broj je prost samo ako je djeljiv sa 1 i sa samim sobom
			for(int i = 2; i < n; i++){
				if(n % i == 0){
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}

}