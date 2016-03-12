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
	private double dayPrice;
	private String username;


	// no-arg konstruktor
	public Room() {
	}
	
	public Room(int number) {
		this.number = number;
	}
	
	public Room(double dayPrice) {
		this.dayPrice = dayPrice;
	}
	
	// konstruktor sa data fields
	public Room(int number, String type, double dayPrice, String username) {
		this.number = number;
		this.type = type;
		this.dayPrice = dayPrice;
		this.username = username;
	}

	/*
	 * @SFR - Obrisana 3 Gettera, postavljeni getteri i setteri za sve..
	 */

	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getDayPrice() {
		return dayPrice;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
}