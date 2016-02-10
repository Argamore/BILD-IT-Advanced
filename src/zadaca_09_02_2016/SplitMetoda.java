package zadaca_09_02_2016;

import java.util.ArrayList;

public class SplitMetoda {

	public static void main(String[] args) {
		System.out.println("Unesite string, te zatim regex: \nKoristi enter kada uneseš string, nemoj odvajati.");
		try(java.util.Scanner unos = new java.util.Scanner(System.in)){
		// šaljemo metodi naš string, te regex
		String[] stringy = split(unos.nextLine(), unos.nextLine());
		unos.close();
		
		// printamo nakon što metoda završi
		for(int i = 0; i < stringy.length; i++){
			System.out.print(stringy[i] + ", ");
		}
		}catch (Exception e){
			System.err.println("Greška! Restartuj program.");
		}

	}
	public static String[] split(String s, String regex){
		ArrayList<String> stringX = new ArrayList<>();
		String stringy = "";
		int pocetak = 0;
		// prvo pretvaramo regex u niz karaktera, jer æe nam tako biti lakše prepoznati ga u našem stringu
		
		char[] regexToChar = new char[regex.length()];
		for(int i = 0; i < regexToChar.length; i++){
			char karakter = regex.charAt(i);
			regexToChar[i] = karakter;
		}
		// prolazimo kroz naš string, te "splitamo" tamo gdje naletimo na regex
		for(int i = 0; i < s.length(); i++){
			// prvo odvajamo char od našeg stringa
			char karakter = s.charAt(i);
			for(int j = 0; j < regexToChar.length; j++){
				// pa ih poredimo sa karakterima iz regex niza
				if(karakter == regexToChar[j]){
					// te potom odvajamo kompletan string od pocetka do mjesta gdje je regex
					stringy = s.substring(pocetak, i);
					// kojeg zatim dodajemo u našu ArrayListu
					
					stringX.add(stringy);
					
					// te dodajemo i regex
					stringX.add(regexToChar[j] + "");
					// te pomjeramo pocetak substringa za sljedeæi string
					
					pocetak = i + 1;
				}
			}
			// uzimamo string od zadnjeg regex karaktera, te ga dodajemo u ArrayListu
			// da ne bi došlo do ArrayOutOfBoundsException itd
			if(i == s.length() - 1){
				stringy = s.substring(pocetak, s.length());
				stringX.add(stringy);
			}
			
		}
		
		// nakon što završe petlje, smještamo iz ArrayListe u niz, te vraæamo rezultat
		String[] stringSplit = new String[stringX.size()];
		for(int i = 0; i < stringSplit.length; i++){
			stringSplit[i] = stringX.get(i);
		}
		return stringSplit;
	}

}