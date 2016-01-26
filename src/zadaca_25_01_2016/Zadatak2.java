package zadaca_25_01_2016;

public class Zadatak2 {

	public static void main(String[] args) {
		
		int brojac = 0;
		// petlja za provjeru prostih brojeva što se vrti od 2 do 1000
		for(int i = 2; i <= 1000; i++){
			
			for(int j = 2; j <= i; j++){
				// broj je prost ako je SAMO djeljiv sa 1 i sa samim sobom..
				if(i % j == 0 && i != j){
					break;
				}
				// ako su vrijednosti prve i druge petlje jednaki, broj je prost
				if(i == j){
					// ako brojac nije nula, te je djeljiv sa 8, prelazi se u novi red
					if(brojac != 0 && brojac % 8 == 0){
						System.out.println();
					}
					// ako je broj prost, on se stampa te se povecava brojac
					System.out.print(i + " ");
					brojac++;
				}
				
			}
		}

	}

}