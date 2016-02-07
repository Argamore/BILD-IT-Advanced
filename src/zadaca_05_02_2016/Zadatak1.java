package zadaca_05_02_2016;

public class Zadatak1 {
	// main
	public static void main(String[] args) {
		/*
		 * Testiranje klase "Fan"
		 */
		Fan ventilator1 = new Fan();
		Fan ventilator2 = new Fan(true);
		Fan ventilator3 = new Fan(true, 2, 10, "zelena");
		
		ventilator1.setSpeed(3);
		ventilator2.setSpeed(7);
		
		ventilator1.setOn(true);
		System.out.println(ventilator2.getSpeed());
		System.out.println(ventilator2.getColor());
		
		System.out.println(ventilator1);
		System.out.println(ventilator2);
		System.out.println(ventilator3);
	}
}

class Fan {
	/**
	 * Konstante
	 */
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;

	/**
	 * Private polja / predefinisano zadatkom
	 */
	private int speed = SLOW;
	boolean on = false;
	private double radius = 5;
	private String color = "plava";

	/*
	 * Konstruktor bez argumenata
	 */
	public Fan() {

	}

	/*
	 * Konstruktor za pokretanje ventilatora
	 */
	public Fan(boolean on) {
		this.on = on;
	}

	/*
	 * Objekat sa korisnièki definisanim argumentima
	 */
	public Fan(boolean on, int speed, double radius, String color) {
		this(on);
		this.speed = speed;
		this.radius = radius;
		this.color = color;
	}
	/*
	 * Getters & Setters
	 */
	
	public void getError() {
		System.err.println("Ventilator nije upaljen!\n");
	}

	protected int getSpeed() {
		return speed;
	}

	// metoda za postavljanje brzine
	// ako je brzina manja od 1 ili veæa od 3, vraæa da ne može tolika biti
	protected void setSpeed(int speed) {
		if (on) {
			if (speed < 1 || speed > 3) {
				if (speed < 1) {
					System.out.println("Brzina ne može biti manja od 1.");
				} else {
					System.out.println("Brzina: " + speed + " nije validna.");
				}
			} else {
				if (speed == 1) {
					this.speed = SLOW;
				} else if (speed == 2) {
					this.speed = MEDIUM;
				} else if (speed == 3) {
					this.speed = FAST;
				}
			}
		} else {
			getError();
		}

	}

	protected boolean on() {
		return on;
	}

	protected void setOn(boolean on) {
		this.on = on;
	}

	protected double getRadius() {
		return radius;
	}

	// metoda koja postavlja radius
	// provjerava da li je veæi od 1, tj ne može biti manji od 1..
	protected void setRadius(double radius) {
		if (radius > 0.99) {
			this.radius = radius;
		} else {
			System.out.println("Radius mora biti veæi od 1.");
		}
	}

	protected String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	// Override-a toString klasu, te vraæa informacije o trenutnom stanju
	// ventilatora :)
	@Override
	public String toString() {
		String brzina;
		if (on) {
			if (speed == 1) {
				brzina = "SPORO";
			} else if (speed == 2) {
				brzina = "SREDNJE";
			} else {
				brzina = "BRZO";
			}
			return "Ventilator je ukljuèen! Trenutna brzina: " + brzina + ". Radius: " + radius + ", boja: " + color;
		} else {
			return "Ventilator nije ukljuèen!";
		}
	}

}