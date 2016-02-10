package zadaca_09_02_2016;

public class MyString2 {

	String string;
	
	// korisni�ki def. string
	public MyString2(String s){
		this.string = s;
	}
	// pore�enje du�ine i sastava stringova (0 ako su isti, 1 ako je prvi ve�i, -1 ako je drugi ve�i
	public int compare(String s){
		int compareRezultat = 0;	
		if (this.string.length() > s.length()){
			compareRezultat = 1;
		}
		else if (this.string.length() < s.length()){
			compareRezultat = -1;
		}
		// ako su iste du�ine, upore�uju se, slovo po slovo
		else {
			for(int i = 0; i < this.string.length();i++){
				char karakter1 = this.string.charAt(i);
				char karakter2 = s.charAt(i);
				if(karakter1 > karakter2){
					compareRezultat = 1;
					break;
				}
				if(karakter1 < karakter2){
					compareRezultat = -1;
					break;
				}	
			}
		}
		return compareRezultat;
	}
	// vra�a string u intervalu od unosa (begin) do kraja stringa (string.length)
	public MyString2 substring(int begin){
		String string = this.string.substring(begin, this.string.length());
		return new MyString2(string);
	}
	// od malih slova postaju velika 
	public MyString2 toUpperCase(){
		String string = "";
		for(int i = 0; i < this.string.length(); i++){
			char karakter = this.string.toUpperCase().charAt(i);
			string += karakter;
		}
		return new MyString2(string);
	}
	// iz stringa u niz karaktera
	public char[] toChars(){
		char[]chars = new char[this.string.length()];
		for(int i = 0; i < chars.length; i++){
			char karakter = this.string.charAt(i);
			chars[i] = karakter;
		}
		return chars;
	}
	// od toga kakvo je boolean "b", shodno tome vra�a rezultat
	public static MyString2 valueOf(boolean b){
		if(b == true)
			return new MyString2("true");
		else{
			return new MyString2("false");
		}
	}
	// da ispi�emo string :)
	public String toString(){
		return this.string;
	}
	
}
