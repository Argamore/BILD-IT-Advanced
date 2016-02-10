package zadaca_09_02_2016;

public class MyString1 {
	char[] chars;
	
	// upisivanje u niz
	public MyString1(char[] chars){
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++){
			this.chars[i] = chars[i];
		}
	}
	// vraæanje slova na poziciji index
	public char charAt(int index){
		return this.charAt(index);
		
	}
	// dužina
	public int length(){
		return this.chars.length;
	}
	// vraæa char od - do unesenog intervala
	public MyString1 substring(int begin, int end){
		char[] chars = new char[end - begin + 1];
		for(int i = 0; i < chars.length; i++){
			chars[i] = this.chars[begin++];
		}
		return new MyString1(chars);
	}
	// konvert na mala slova
	public MyString1 toLowerCase(){
		char[] chars = new char[this.chars.length];
		for(int i = 0; i < chars.length; i++){
			chars[i] = Character.toLowerCase(this.chars[i]);
		}
		return new MyString1(chars);
	}
	// da li su stringovi jednaki
	public boolean equals(MyString1 s){
		boolean equals = true;
		//ispitivanje da li su im duzine nizova jednake
		if(this.chars.length != s.chars.length){
			equals = false;
		}else{
			//ispitivanje da li su elementi na istim pozicijama jednaki
			for(int i = 0; i < this.chars.length; i++){
				if(this.chars[i] != s.chars[i]){
					equals = false;
				}
			}
		}
		return equals;
	}
	// vrijednost od i
	public static MyString1 valueOf(int i){
		int broj = i;
		int brojac = 0;
		// provjera dužine broja
		while(i != 0){
			i /= 10;
			brojac++;
		}
		char[]chars = new char[brojac];
		// petlja odvaja brojeve i smješta ih u niz
		for(int j = chars.length - 1; j >= 0; j--){
			int brojkica = broj % 10;
			chars[j] = Character.forDigit(brojkica, 10);
			broj /= 10;
		}
		
		return new MyString1(chars);
	}
	// info string za print char[]
	public String toString(){
		String infoString = "";
		for(int i = 0; i < this.length(); i++){
			infoString += this.chars[i];
		}
		return infoString;
	}

}
