package zadaca_05_02_2016;

public class Zadatak3 {

	public static void main(String[] args) {
		QuadraticEquation jednacina1 = new QuadraticEquation(1.0, 3.0, 2.0);
		QuadraticEquation jednacina2 = new QuadraticEquation(1.0, 2.0, 1.0);
		QuadraticEquation jednacina3 = new QuadraticEquation(5.0, 4.0, 3.0);
		
		System.out.println("Diskriminantna prve jednacine "+jednacina1.getDiscriminant());
		
		System.out.println(jednacina1);
		System.out.println(jednacina2);
		System.out.println(jednacina3);
		
		System.out.println(jednacina3.getDiscriminant());
	}

}

class QuadraticEquation {
	// elementi jednaèine
	private double a, b, c;

	// kreira objekat sa korisnièki definisanim elementima
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
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

	// metoda za raèunaje diskriminante
	public double getDiscriminant() {
		return Math.pow(b, 2) - 4 * a * c;
	}

	// metoda za raèunanje korijena, i to prvog
	public double getRoot1() {
		return (-b + Math.sqrt(getDiscriminant())) / 2 * a;
	}

	// metoda za raèunanje drugog korijena
	public double getRoot2() {
		return (-b - Math.sqrt(getDiscriminant())) / 2 * a;
	}
	
	// informacije
	@Override
	public String toString() {
		// ako je diskriminanta pozitivna, prikazuju se oba korijena
		if (getDiscriminant() > 0) {
			return "Prvi korijen: " + getRoot1() + 
					"\nDrugi korijen: " + getRoot2() + "\n";
			// ako je 0, samo 1 korijen
		} else if (getDiscriminant() == 0) {
			return "Jednaèina ima samo 1 korijen: " + getRoot1() + "\n";
			// ako je negativna, nema rješenja
		} else {
			return "Jednaèina nema pravih korijenova.\n";
		}
	}
}