package miniProjekat_05_02_2016;
/** with help from https://github.com/LuizGsa21/ */
public class Hangman {
	// string u kojem se nalaze rijeèi za pogaðanje

    static String[] rijeci = { "tikvica", "banana", "otorinolaringologija", 
    							"plima", "tambura", "ajvar", "teletabisi", "pokemon",
    							"ormar", "kleopatra", "patrijarhija", "konzulat", "ambasador",
    							"tresnja", "patka", "metropolis", "sarajevo", "sladoled"};
    static boolean tacno;

    public static void main(String[] args) {
    	// unos od strane korisnika
        try(java.util.Scanner unos = new java.util.Scanner(System.in)){
        String playGame = "y";
        // while petlja za igranje
        while (playGame.equals("y")) {
        	// pozivamo metode za rijec
            String rijec = getRijec();
            String tajnaRijec = getTajnaRijec(rijec);
            // brojac pogresaka
            int pogreska = 0;
            // petlja se vrti dokle god se ne pogodi rijec
            while (!rijec.equals(tajnaRijec)) {
            	// ispisuje nam tajnuRijec, tj rijec sakrivenu zvjezdicama
                System.out.println("Pogodite slovo: " + tajnaRijec);
                // korisnik unosi slovo
                char slovo = unos.next().charAt(0);
                // koje se zatim provjerava da li postoji u nasoj rijeci
                if (!provjeriSlovo(tajnaRijec, slovo)) {
                    tajnaRijec = getPokusaj(rijec, tajnaRijec, slovo);
                    // ako ne postoji, ispisat æe da nije tu, te povecat broj gresaka
                    if (!tacno) {
                        System.out.println(slovo + " nije u rijeèi.");
                        pogreska++;
                    }
                    // inaèe æe nam ispisati ako jeste
                } else {
                    System.out.println(slovo + " se nalazi rijeèi.");
                }
            }
            // main petlja
            // ako se pogodi rijec, ispisuje je i koliko smo put pogrijesili
            // te ako zelimo ponovo igrati
            System.out.println("Rijeè je '" +rijec+"'. Pogriješili ste "+ pogreska +" puta.\n");
            System.out.println("Želite li ponovo pogaðati? \nUnesite 'y' za DA, 'n' za NE.");
            playGame = unos.next().toLowerCase();
        }
        }
        catch(Exception e){
        	System.err.println("Greška pri unosu! Restartuj program.");
        }

    }
    
    // uzima neku random rijec iz našeg niza
    public static String getRijec() {
        return rijeci[(int)(Math.random()* rijeci.length)];
    }
   
    // vraæa nam isti broj zvjezdica kao sto je duzina rijeci
    public static String getTajnaRijec(String rijec) {

        String tajnaRijec = "";
        for (int i = 0; i < rijec.length(); i++) {
            tajnaRijec += "*";
        }
        return tajnaRijec;
    }
    // provjerava da li je pogoðeno slovo
    static public String getPokusaj(String rijec, String tajnaRijec, char slovo) {
        tacno = false;
        StringBuilder checkRijec = new StringBuilder(tajnaRijec);
        for (int i = 0; i < rijec.length(); i++) {
        	// ako jeste, brisemo zvjezdicu na poziciji pogodjenog slova i stavljamo slovo
            if (slovo == rijec.charAt(i) && checkRijec.charAt(i) == '*') {
                tacno = true;
                checkRijec = checkRijec.deleteCharAt(i);
                checkRijec = checkRijec.insert(i, slovo);
            }
        }
        return checkRijec.toString();
    }

    // metoda koja provjerava da li postoji to slovo u rijeci	
    public static boolean provjeriSlovo(String tajnaRijec, char slovo) {

        for (int i = 0; i < tajnaRijec.length(); i++) {

            if (slovo == tajnaRijec.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}