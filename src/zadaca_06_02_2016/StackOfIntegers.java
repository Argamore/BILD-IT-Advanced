package zadaca_06_02_2016;

import java.util.ArrayList;

public class StackOfIntegers {
	
	private int broj = 0;
	
	public StackOfIntegers(int newBroj){
		this.broj = newBroj;
	}
	// metoda za vraæanje prime faktora
	public ArrayList<Integer> getPrimeFactors(){
		ArrayList<Integer> primeFactors = new ArrayList<>();
		int brojac = 0;
		int brojkica = broj;
		// petlja za provjeru djeljivosti broja.. da li je broj djeljiv sa bilo kojim manjim od sebe
		for(int i = 2; i < brojkica; i++){
			// ako je djeljiv sa i, dijelimo ga, i dodajemo i u našu arrayListu
			while(broj % i == 0){ 		
				broj = broj / i;
				primeFactors.add(i);	
				// brojimo koliko takvih brojeva ima
				brojac++;
			}
		}
		// ako nema djeljivih brojeva, onda je broj prost
		if(brojac == 0){
			System.out.println("Broj je prost - nije djeljiv na manje faktore!");
		}
		return primeFactors;
	}
	// metoda koja vraæa prime brojeve
	public ArrayList<Integer> getPrimeNumbers(){
		ArrayList<Integer> primeNumbers = new ArrayList<>();
		// svi prosti brojevi koji su manji od unešenog broja se dodaju u našu listicu 
		for(int i = 0; i < broj; i++){
			// provjeravamo da li je prost, pa ga dodajemo
			if(isPrime(i)){
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}
	// metoda koja provjerava da li je broj PRIME 
	public static boolean isPrime(int a){
		boolean isPrime = false;
		for(int i = 2; i <= a; i++){
			// prime = djeljiv samo sa sobom i sa 1
			if(a % i == 0 && a != i){
				break;
			}
			if(a == i){
				isPrime = true;
			}
		}	
		return isPrime;
	}
}