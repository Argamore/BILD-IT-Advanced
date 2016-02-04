package zadaca_03_02_2016;

public class Zadatak5 {

	public static void main(String[] args) {
		
		int[][]matrica = new int[6][6];
		
		int[] brojURedovima = new int[6];
		int[] brojUKolonama = new int[6];
		
		int brojURedu = 0;
		int brojUKoloni = 0;
		
		// ubacujemo 1 i 0 u matricu
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
				matrica[i][j] = (int)(Math.random() * 2);
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		// prolazak kroz matricu i brojanje jedinica po redovima i kolonama
		for(int i = 0; i < 6; i++){
			for(int j = 0; j < 6; j++){
				//brojanje jedinica po redovima
				if(matrica[i][j] == 1){
					brojURedu++;
				}
				// na kraju reda, broj jedinica u redu se prebacuje u niz brojURedovima[] na poziciju i
				if(j == 3){
					brojURedovima[i] = brojURedu;
					brojURedu = 0;
				}
				//brojanje jedinica po kolonama
				if(matrica[j][i] == 1){
					brojUKoloni++;
				}
				//na kraju kolone, broj jedinica u koloni se prebacuje u niz brojUKolonama[] na poziciju i
				if(j == 3){
					brojUKolonama[i] = brojUKoloni;
					brojUKoloni = 0;
				}
			}
		}
		
		boolean isEven = true;
		//prolazak kroz nizove brojURedovima[] i brojUKolonama[]
		for(int i = 0; i < 5; i++){
			// ako se razlikuju, vraæa false
			if(brojURedovima[i] != brojURedovima[i + 1]){
				isEven = false;
			}
			// same as above
			if(brojUKolonama[i] != brojUKolonama[i + 1]){
				isEven = false;
			}
		}
		// ako je uredu, printa: 
		if(isEven){
			System.out.println("Redovi i kolone imaju isti broj 1");
		}
		else{
			System.out.println("Redovi i kolone nemaju isti broj 1");
		}

	}

}