package zadaca_30_01_2016;

public class Zadatak4 {
	// importujemo direktno odgovaraju�u klasu za vrijeme i datum
	public static String tellTime(){
		// koja uzima broj milisekundi do ovog trenutka, te ih vra�a kao datum i vrijeme ^___^
		java.util.Date datum = new java.util.Date(System.currentTimeMillis());
		return datum.toString();
	}

	public static void main(String[] args) {
		// pozivamo metodu, i ona vra�a / ispisuje rezultat a to je datum i vrijeme (po lokalu PC-a)
		System.out.println(tellTime());
	}

}
