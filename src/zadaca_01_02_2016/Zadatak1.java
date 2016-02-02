package zadaca_01_02_2016;

public class Zadatak1 {

	public static void main(String[] args) {
		// obavijamo �itav kod sa try/catch, za hvatanje gre�aka
		try(java.util.Scanner unos = new java.util.Scanner(System.in)){
			// ka�emo korisniku da unese broj
			System.out.println("Unesite broj izme�u 0 i 127");
			// on ga unosi
			int broj = unos.nextInt();
			// provjerava se unos, da li je u intervalu koji je naveden
			if (broj > 0 && broj < 128){
				// ako jeste, broj se parsira i dobija se slovo
				char[] slovo = Character.toChars(broj);
				// koje zatim se printa korisniku
				System.out.println(slovo);
			}
			else{
				// ako ne unese u intervalu, printa mu da su samo dozvoljeni brojevi od 0 do 127
				System.out.println("Samo brojevi od 0 do 127.");
			}
		}
		catch (Exception e){
			// ako unese ne�to �to nije broj, izbaci mu gre�ku da su samo brojevi dopu�teni
			System.err.println("Samo brojevi.");
		}

	}

}
