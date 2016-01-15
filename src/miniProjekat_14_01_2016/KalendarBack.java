package miniProjekat_14_01_2016;
public class KalendarBack {
	
    // Provjerava da li je godina prestupna.
	// Ako je godina prestupna, vraæa vrijednost TRUE.
    public static boolean prestupnaGod(int godina) {
        if  ((godina % 4 == 0) && (godina % 100 != 0)) return true;
        if  (godina % 400 == 0) return true;
        return false;
    }
	
    public static int dan(int D, int M, int G) {
    	// raèuna koji je dan za unešeni datum 
    	// s tim da je dan u mjesecu stavljen za 1 (prvi)
    	// metoda vraæa broj dana, do prvog dana u mjesecu koji se traži
    	// dole na ispisu, petlja se vrti i dokle god nije i = d ispisuje blank space "   "
        int y = G - (14 - M) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = M + 12 * ((14 - M) / 12) - 2;
        int d = (D + x + (31*m)/12) % 7;
        return d;
    }
    public static void getCalendar(int M, int G){
        // Kada korisnik unese koji je mjesec, 
        // npr 3 on uzima iz niza mjesec[3] i znamo da je onda mart, jer je na poziciji 3 :)
        String[] mjesec = {
        		"","Januar", "Februar", "Mart",
        		"April", "Maj", "Juni","Juli", 
        		"August", "Septembar","Oktobar", 
        		"Novembar", "Decembar"
        		};

        // Broj dana / mjeseèno
        // Kada se unese mjesec, on povlaèi broj dana za taj mjesec, ako je 1 uzima 31 dan za Januar itd.
        int[] dani = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        // Provjera da li je godina prestupna
        // Ako jeste, onda se poveæava broj dana u Februaru na 29.
        if (M == 2 && prestupnaGod(G)) dani[M] = 29;


        // Zaglavlje kalendara gdje se ispisuje mjesec i godina, te ispod dani u sedmici.
        System.out.println("     " + mjesec[M] + " " + G);
        System.out.println(" N  P  U  S  È Pe  S");

        // Poèetni dan u mjesecu je stavljen za 1, mada se može napraviti i da se mijenja, tj da korisnik unese dan.
        int d = dan(1, M, G);

        // for petlje za printanje kalendara
        // ova ispod petlja je objašnjena u metodi "dan"
        for (int i = 0; i < d; i++)
            System.out.print("   ");
        	// printa prazan prostor dok ne doðe taèan dan koji se poklapa sa prvim u mjesecu
        for (int i = 1; i <= dani[M]; i++) {
            System.out.printf("%2d ", i);
            //%2d sluzi za formatiranje dana.
            // ako je jednocifren broj, dodaje dva spejsa "  5"
            // ako je dvocifren, onda samo jedan spejs " 23"
            if (((i + d) % 7 == 0) || (i == dani[M])) System.out.println();
            // provjerava da li je kraj sedmice ili mjeseca te prebacuje u novi red
        }        
    }
}