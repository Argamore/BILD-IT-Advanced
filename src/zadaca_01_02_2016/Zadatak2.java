package zadaca_01_02_2016;

public class Zadatak2 {

	public static void main(String[] args) {
		// ispisujemo poruku korisniku
		System.out.println("Unesite rije� ili slovo za provjeru unicode-a.\nSamo prvo slovo rije�i �e biti provjereno.");
		try(java.util.Scanner unos = new java.util.Scanner(System.in)){
			// nakon cega parsiramo unos iz Stringa u char (samo nam 1 slovo treba)
			String rijec = unos.nextLine();
			char slovo = rijec.charAt(0);
			unos.close();
			// kojeg jednostavno parsiramo u integer, koji �e vratiti poziciju u ASCII kodu
			int ascii = (int)slovo;
			// i printamo rezultat
			System.out.println("UNICODE za Va�e slovo: "+slovo+" je "+ascii);
		}
		// ako se unese nesto kako ne treba, izbacit �e gre�ku
		catch (Exception e){
			System.err.println("Niste unijeli kako treba!");
		}

	}

}
