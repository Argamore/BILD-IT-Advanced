package zadaca_09_02_2016;

public class MyStringBuilder1 {

	String s;
	
	// postavljanje stringa (konstruktor)
	public MyStringBuilder1(String s){
		this.s = s;
	}
	// metoda za dodavanje stringa na string
	public MyStringBuilder1 append(MyStringBuilder1 s){
		return new MyStringBuilder1(this.s += s.s);
	}
	// ako želimo dodati broj na string, ovo je metoda za to
	public MyStringBuilder1 append(int i){
		return new MyStringBuilder1(this.s += i);
	}
	// provjera duzine
	 public int length(){
		 return this.s.length();
	 }
	 // metoda koja vraæa karakter na odabranom indeksu
	 public char charAt(int index){
		 return this.s.charAt(index);
	 }
	 // èitav string malim slovimaa
	 public MyStringBuilder1 toLowerCase(){
		 return new MyStringBuilder1(this.s.toLowerCase());
	 }
	 // ispisuje string od zadanog poèetka i kraja
	 public MyStringBuilder1 substring(int begin, int end){
		 String s = "";
		 for(int i = begin; i <= end; i++){
			 s += this.s.charAt(i);
		 }
		 return new MyStringBuilder1(s);
	 }
	// za vraæanje stringa
	public String toString(){
		return this.s;
	}
	
}