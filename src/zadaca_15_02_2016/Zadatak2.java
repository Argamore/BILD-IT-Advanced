package zadaca_15_02_2016;

public class Zadatak2 {
	public static void main(String[] args) {
		// https://plumbr.eu/outofmemoryerror/requested-array-size-exceeds-vm-limit
		try{
			// ova petljanija od niza �e izbacit mu gre�ku
			int[] niz = new int[Integer.MAX_VALUE];	
			niz[0] = 1;
		}
		catch (OutOfMemoryError ex){
			System.err.println("Uhva�en OutOfMemoryError!");
		}
	}
}