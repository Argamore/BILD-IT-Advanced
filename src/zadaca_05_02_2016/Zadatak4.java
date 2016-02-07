package zadaca_05_02_2016;

public class Zadatak4 {

	public static void main(String[] args) {
		// pravljenje novih objekata
		
		LinearEquation jednacina1 = new LinearEquation(5, 7, 1, -3, -4, -13);
		LinearEquation jednacina2 = new LinearEquation(1, 2, 3, 4, 5, 7);
		
		// ispis rezultata
		
		System.out.println(jednacina1);
		System.out.println(jednacina2);

	}

}

class LinearEquation {

	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	// Objekat sa definisanim elementima
	public LinearEquation(double a, double b, double c, double d, double e,
			double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;

	}

	/// < -- GETTERS & SETTERS -- > \\\
	
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
	
	// metoda za provjeru da li se može izraèunati

	public boolean isSolvable() {
		return (a * d - b * c) != 0;
	}

	// vraæa rješenje za X
	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	// vraæa rješenje za Y
	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}
	
	// informacije o objektu
	@Override
	public String toString() {
		// ako se jednaèina može riješiti, ispisuje X i Y
		if (isSolvable()) {
			return "\nRješenje je:\nx = " + getX() + "\ny = " + getY();
		} else { 
			// ako nema..
			return "\nJednaèina nema rješenje!";
		}
	}
}