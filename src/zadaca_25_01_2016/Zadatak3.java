package zadaca_25_01_2016;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Zadatak3 {

	public static void main(String[] args) {
		// kreiranje novog datuma
		Date datum = new Date(System.currentTimeMillis());
		// kreiranje formata za prikaz datuma
		SimpleDateFormat format = new SimpleDateFormat("dd. MMMM, yyyy HH:mm:ss");
		// stampanje rezultata
		System.out.println("Trenutni datum i vrijeme: " + format.format(datum));

	}

}