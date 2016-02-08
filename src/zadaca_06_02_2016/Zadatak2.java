package zadaca_06_02_2016;

public class Zadatak2 {

	public static void main(String[] args) {
		try(java.util.Scanner unos = new java.util.Scanner(System.in)){
		System.out.println("Unesite cijeli broj: ");
		int broj = unos.nextInt();
		// pozivanje klase i pravljenje objekta za testiraje
		MyInteger brojkica = new MyInteger(broj);
		// testiranje svih metoda :3
		System.out.println("Broj " + broj + " je paran: " + brojkica.isEven());
		System.out.println("Broj " + broj + " je neparan: " + brojkica.isOdd());
		System.out.println("Broj " + broj + " je prost: " + brojkica.isPrime());
		
		System.out.println();
		System.out.println("Broj je paran: " + MyInteger.isEven(7));
		System.out.println("Broj je neparan: " + MyInteger.isOdd(7));
		System.out.println("Broj je prost: " + MyInteger.isPrime(7));
		System.out.println();
		
		/// < -- testiranje dalje -- > \\\
		System.out.println("Unesite cijeli broj: ");
		int broj1 = unos.nextInt();
		unos.close();
		System.out.println("Uneseni broj je jednak vrijednosti 'value': " + brojkica.equals(broj1));
		System.out.println("Vrijednost 'value' je jednaka vrijednosti 'value' objekta integer: " + brojkica.equals(brojkica));
		System.out.println();
		char[] brojevi = {'3', '2', '7', '1'};
		System.out.println(MyInteger.parseInt(brojevi));
		System.out.println();
		String brojevi2 = "3271";
		System.out.println(MyInteger.parseInt(brojevi2));
		} catch (Exception e){
			System.err.println("Greška! Restartuj program!");
		}
	}

}