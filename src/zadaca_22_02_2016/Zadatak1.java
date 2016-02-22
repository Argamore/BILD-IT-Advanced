package zadaca_22_02_2016;

public class Zadatak1 {
	public static void main(String[] args) {
		// korisnik unosi index, te se zatim šalje metodi :)
		try (java.util.Scanner unos = new java.util.Scanner(System.in)){
			System.out.print("Unesite index: ");
			int index = unos.nextInt();
			long fib = fibonnaci(index);
			System.out.println("\nFibonnaci broj za index: "+ index + " je "+ fib);
		} catch (Exception e) {
			System.err.println("Greška! Restartuj program.");
		}
	}
	public static long fibonnaci(int index){
		long fib0=0;
		long fib1=1;
		// petlja sabire trenutni broj sa prethodnim, te se zamjenjuju mjesta
		for (int i = 1; i <= index; i++) {
			System.out.print(fib1+ " ");
			long brojka = fib0 + fib1;
			fib0 = fib1;
			fib1 = brojka;
		}
		return fib1;
	}
}