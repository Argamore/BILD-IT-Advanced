package zadaca_01_02_2016;

public class Zadatak3 {

	public static void main(String[] args) {
		// korisnik unosi broj
		System.out.println("Unesite broj: ");
		try(java.util.Scanner unos = new java.util.Scanner(System.in)){
			short broj = unos.nextShort();
			unos.close();
			// koji se zatim parsira metodi toBinaryString koja vraća binarni broj našeg "broja"
			// te se zatim dodaju nule sa strane, čime se efektivno ispisuje tačno 16 bita
			System.out.println(String.format("%16s", Integer.toBinaryString(broj)).replace(' ', '0'));
			// Uz pomoc http://stackoverflow.com/questions/31523419/java-print-a-short-as-binary-with-all-16-bits
		}
		// u slučaju neke greške..
		catch (Exception e){
			System.err.println("Greška!");
		}
	}

}
