package zadaca_09_02_2016;

public class MyCharacter {
	char karakter;

	// konstruktor koji prima korisnièki karakter
	public MyCharacter(char karakter) {
		this.karakter = karakter;
	}

	// metoda za prebacivanje znaka u integer
	public static int toInt(char karakter) {
		return Integer.parseInt(karakter + "");
	}
	// metoda pretvara karakter u malo slovo
	public MyCharacter toLowerCase() {
		String str = this.karakter + "";
		char ch = str.toLowerCase().charAt(0);
		return new MyCharacter(ch);
	}

	// metoda pretvara karakter u veliko slovo
	public MyCharacter toUpperCase() {
		String str = this.karakter + "";
		char ch = str.toUpperCase().charAt(0);
		return new MyCharacter(ch);
	}

	// print karaktera
	public String toString() {
		return this.karakter + "";
	}
}