package zadaca_05_02_2016;

public class Zadatak2 {

	public static void main(String[] args) {
		RegularPolygon poly1 = new RegularPolygon();
		RegularPolygon poly2 = new RegularPolygon(5, 7);
		RegularPolygon poly3 = new RegularPolygon(12, 3, 4.1, 8.4);
		
		System.out.println(poly1);
		System.out.println(poly2);
		System.out.println(poly3);

	}
}
class RegularPolygon {
	private int n; // broj stranica poligona
	private double side = 1; // duzina stranice
	private double x; // x koordinata
	private double y; // y koordinata

	// konstruktor bez argumenata
	public RegularPolygon() {

	}
	
	// konstruktor sa parametrima
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	} 
	
	// kreiranje poligona sa zadanim vrijednostima
	public RegularPolygon(int n, double side, double x, double y) {
		this(n, side);
		this.x = x;
		this.y = y;
	}
	
	/// < -- GETTERS & SETTERS -- > \\\
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		if (n < 0) {
			n *= -1;
		}
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// metoda za izraèunavanje obima 
	public double getPerimeter() {
		return n * side;
	}

	// metoda za izraèunavanje površine
	public double getArea() {
		return (n * Math.pow(side, 2)) / 4 * Math.tan(Math.PI / n);
	}
	
	// overrideana toString metoda koja vraæa informacije o našem poligonu ^___^
	public String toString() {
		return "\nBroj stranica: " + n +
				"\nDužina strane: " + side +
				"\nx koordinate: " + x + 
				"\ny koordinate: " + y +
				"\nObim: " + getPerimeter() + 
				"\nPovršina: " + getArea();	
	}
}