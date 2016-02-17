package zadaca_15_02_2016;

public class Zadatak3 {

	public static void main(String[] args) {
		try(java.util.Scanner unos = new java.util.Scanner(System.in)){
		System.out.println("Datoteka mora biti u istom direktoriju.\nUnesite ime datoteke:");
		String imeFajla = unos.nextLine();
		System.out.println("Rijeè koju treba odstraniti: ");
		String rijec = unos.nextLine();
		// saljemo ime fajla i rijec metodi
			ukloniRijec(imeFajla, rijec);
		}
		catch (Exception e){
			System.err.println("Greška! Restartuj program.");
		}
	}

	public static void ukloniRijec(String imeFajla, String rijec){
		//
		java.util.ArrayList<String> fajl = new java.util.ArrayList<>();
		//lista za smijestanje linija teksta iz fajla bez unijete rijeci 
		java.util.ArrayList<String> noWordFajl = new java.util.ArrayList<>();
		
		java.io.File file = new java.io.File(imeFajla);
		
		try(java.util.Scanner citac = new java.util.Scanner(file)){
			// èitamo fajl i dodajemo rijeci iz fajla u listu
		while(citac.hasNextLine()){
			fajl.add(citac.nextLine());
		}
		// preko petlje provjeravamo listu
		for(int i = 0; i < fajl.size(); i++){
			String linija = fajl.get(i);
			String[] rijeci = linija.split(" ");
			String blank = "";
			// petlja provjerava rijeèi
			for(int j = 0; j < rijeci.length; j++){
				if(!rijeci[j].equals(rijec)){
					blank += rijeci[j] + " ";
				}
			}
			// odstranimo rijeè, de dodamo tu liniju u našu listu
			noWordFajl.add(blank.trim());
			
		}
		// te uz pomoc petlje, ispisujemo tu listu :)
		for(int i = 0; i < noWordFajl.size(); i++){
			System.out.println(noWordFajl.get(i));
		}
		} catch (Exception e){
			System.out.println("Greška! File nije pronaðen.");
		}
	}
}