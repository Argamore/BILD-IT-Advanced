package grupniProjekat_HotelManagement;

/**
 * @author Vedran Vidakovic
 *
 */

/*
 * Fix & Security Update: Sefer Kuduzovic
 */
public class Room {
	/*
	 * @SFR - Ubaèen boolean "occupied" - provjera da li je soba zauzeta
	 */
	private int number;
	private String type;
	private boolean occupied;
	private double dayPrice;


	// no-arg konstruktor
	public Room() {

	}

	// konstruktor sa data fields
	public Room(int number, String type, double dayPrice) {
		this.number = number;
		this.type = type;
		this.dayPrice = dayPrice;
	}

	/*
	 * @SFR - Obrisana 3 Gettera, postavljeni getteri i setteri za sve..
	 */

	protected int getNumber() {
		return number;
	}
	
	protected void setNumber(int number) {
		this.number = number;
	}
	
	protected String getType() {
		return type;
	}
	
	protected void setType(String type) {
		this.type = type;
	}
	
	protected boolean isOccupied() {
		return occupied;
	}
	
	protected void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	protected double getDayPrice() {
		return dayPrice;
	}
	
	protected void setDayPrice(double dayPrice) {
		this.dayPrice = dayPrice;
	}
	/*
	 * @SEFER - ubaèena toString metoda
	 */

	@Override
	public String toString() {
		return "Room [number=" + number + ", type=" + type + ", occupied=" + occupied + ", dayPrice=" + dayPrice + "]";
	}
	
	
}