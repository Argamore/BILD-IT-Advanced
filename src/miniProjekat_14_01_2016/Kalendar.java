package miniProjekat_14_01_2016;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Kalendar { 
	public static void printOut(int dan, int mjesec, int godina, String reminder)throws Exception {
		FileWriter pisac = new FileWriter("podsjetnici.txt", true);
		pisac.write("Podsjetnik:"+reminder);
		pisac.write(" || Datum: "+dan+".");
		pisac.write(mjesec+".");
		pisac.write(godina+".");
		pisac.write(System.getProperty( "line.separator" ));
		pisac.close();
			
	}
    public static void main(String[] args) throws IOException {
    	Scanner input = new Scanner(System.in);
    	int unos = 4;
    	
    	do{
    	// kod za unos mjeseca i godine, podsjetnika i listanje podsjetnika:     	 
    		if (unos == 1){
    		// unos mjeseca i godine:
    		System.out.println("Unesite mjesec i godinu: ");
    			int mjesec = input.nextInt();
    			int godina = input.nextInt();
    			
    			if (mjesec <= 0 || mjesec >12){
    				System.out.println("Mjesec mora biti izmeðu 1 i 12. \nUnesite ponovo:");
    			mjesec = input.nextInt();
    			}
    			
    		// koji se onda šalju metodi..
    		KalendarBack.getCalendar(mjesec, godina);
    		unos = 4;
    		}
    		else if(unos == 2)
    			//kod za upisivanje podsjetnika
    			{
    			System.out.println("\nUnesite dan, mjesec i godinu pa onda podsjetnik: ");
    			int dan = input.nextInt();
    			int mjesec = input.nextInt();
    			int godina = input.nextInt();
    			String reminder = input.nextLine();
    			//podaci se šalju metodi koja ih upisuje u fajl podsjetnici.txt
    			try {
					printOut(dan,mjesec,godina,reminder);
				} catch (Exception e) {
					e.printStackTrace();
				}
    			unos = 4;
    		}
    		else if (unos == 3){
    			try (BufferedReader citac = new BufferedReader(new FileReader("podsjetnici.txt"))) {
    				   String tekst = null;
    				   while ((tekst = citac.readLine()) != null) {
    				       System.out.println(tekst);
    				   }
    				   citac.close();
    				   unos = 4;
    				} catch (FileNotFoundException e) {
						System.out.println("Ne postoji nikakav podsjetnik trenutno. ");
						unos = 4;
    				}
    		}
    		else if(unos == 4){
    			System.out.println("\nUnesite broj za: ");
    			System.out.print("\nKalendar: [1]");
    			System.out.print("\nUpis podsjetnika: [2]");
    			System.out.print("\nIspis podsjetnika: [3]");
    			System.out.print("\nKraj programa: [0]");
    			System.out.println();
    			unos = input.nextInt();
    		}
    	}while(unos != 0);
    	input.close();
	}
}
