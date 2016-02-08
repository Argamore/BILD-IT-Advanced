package zadaca_06_02_2016;

public class MyInteger {
	private int value = 0;
	
	// postavljanje vrijednosti
	
	public MyInteger(int newValue){
		this.value = newValue;
	}
	// metoda za vraæanje vrijednosti
	public int getValue() {
		return value;
	}
	// provjera da li je paran broj
	public boolean isEven(){
		boolean isEven = false;
		
		if(this.value % 2 == 0){
			isEven = true;
		}		
		return isEven;
	}
	// provjera da li je neparan broj
	public boolean isOdd(){
		boolean isEven = false;
		
		if(this.value % 2 != 0){
			isEven = true;
		}		
		return isEven;
	}
	// provjera da li je "prime" - prost broj
	
	public boolean isPrime(){
		boolean isPrime = false;
		for(int i = 2; i <= this.value; i++){
			// brojevi djeljivi ISKLJUÈIVO sa samim sobom i sa 1 tu prime brojevi
			if(this.value % i == 0 && this.value != i){
				break;
			}
			if(this.value == i){
				isPrime = true;
			}
		}	
		return isPrime;
	}
	// input metoda za provjeru da li je broj paran
	public static boolean isEven(int a){
		boolean isEven = false;
		if(a % 2 == 0){
			isEven = true;
		}	
		return isEven;
	}
	// input metoda za provjeru da li je broj neparan
	public static boolean isOdd(int a){
		boolean isOdd = false;
		if(a % 2 != 0){
			isOdd = true;
		}
		return isOdd;
	}
	// input metoda za provjeru da li je broj "prime"
	public static boolean isPrime(int a){
		boolean isPrime = false;
		for(int i = 2; i <= a; i++){
			if(a % i == 0 && a != i){
				break;
			}
			if(a == i){
				isPrime = true;
			}
		}	
		return isPrime;
	}
	// provjera da li je broj od "i" naše vrijednosti paran
	public static boolean isEven(MyInteger i){
		boolean isEven = false;
		if(i.getValue() % 2 == 0){
			isEven = true;
		}
		return isEven;
	}
	// provjera da li je broj od "i" naše vrijednosti neparan
	public static boolean isOdd(MyInteger i){
		boolean isOdd = false;;
		if(i.getValue() % 2 != 0){
			isOdd = true;
		}
		return isOdd;
	}
	// da li je "i" naše vrijednosti "prime" brojkica
	public static boolean isPrime(MyInteger i){
		boolean isPrime = false;;
		
		for(int j = 2; j <= i.getValue(); j++){
			if(i.getValue() % j == 0 && i.getValue() != j){
				break;
			}
			if(i.getValue() == j){
				isPrime = true;
			}
		}	
		return isPrime;
	}
	// metoda za provjeru da li su brojevi jednaki
	public boolean equals(int a){
		boolean equals = false;
		
		if(value == a){
			equals = true;
		}
		return equals;
	}
	// as above stated, ista stvar
	public boolean equals(MyInteger i){
		boolean equals = false;
		
		if(value == i.getValue()){
			equals = true;
		}
		return equals;
	}
	// iz karaktera u integer 
	public static int parseInt(char[] a){
		int brojkica = 0;
		
		for(int i = 0; i < a.length; i++){
			// prosljeðivanje karaktera u cifru via Integer.parseInt();
			int cifra = Integer.parseInt(a[i] + "");
			brojkica = brojkica * 10 + cifra;
		}
		return brojkica;
	}
	// ovaj put iz stringa u broj, as above
	public static int parseInt(String a){
		int brojkica = 0;
		
		for(int i = 0; i < a.length(); i++){
			// prvo odvojimo slovo po slovo, pa fino parsiramo u int i dodamo na ukupni broj, ez pz
			char slovo = a.charAt(i);
			int number = Integer.parseInt(slovo + "");
			brojkica = brojkica * 10 + number;
		}	
		return brojkica;
	}
}