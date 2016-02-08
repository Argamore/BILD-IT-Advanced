package zadaca_06_02_2016;

public class MyPoint {
	private double x;
	private double y;
	
	// < -- GETTERS --> \\
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	// Konstruktor bez argumenata
	MyPoint(){
		x = 0;
		y = 0;
	}
	
	MyPoint(double newX, double newY){
		this.x = newX;
		this.y = newY;
	}
	// metoda za raèunanje udaljenosti dvije taèke
	public double distance(MyPoint a, MyPoint b){
		// Pitagorina teorema yaay
		double distance = Math.sqrt(Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2));
		return distance;
	}
}