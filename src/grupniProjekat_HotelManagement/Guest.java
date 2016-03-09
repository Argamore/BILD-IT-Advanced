package grupniProjekat_HotelManagement;

/**
 * @author Vedran Vidakovic
 *
 */

/*
 * Fix & Security Update: Sefer Kuduzovic
 */

public class Guest {

	private String username;
	private String password;
	private String name;
	private String surname;
	private String gender;
	private int IDnumber;
	private int age;
	private int roomNumber;
	private String roomType;
	private String timeCheckedin;
	private double bill;

	// no-arg konstruktor
	public Guest() {
	}

	// konstruktor sa data fields
	public Guest(String username, String password, String name, String surname, String gender, int IDnumber, int age,
			int roomNumber, String roomType, String timeCheckedin, double bill) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.IDnumber = IDnumber;
		this.age = age;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.timeCheckedin = timeCheckedin;
		this.bill = bill;
	}

	// GET METODE KOJE VRACAJU VREDNOSTI ZA DATA FIELDS
	public String getUsername() {
		return username;
	}

	@SuppressWarnings("unused")
	private String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getGender() {
		return gender;
	}

	public int getIDnumber() {
		return IDnumber;
	}

	public int getAge() {
		return age;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public String getTimeCheckedin() {
		return timeCheckedin;
	}

	public double getBill() {
		return bill;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@SuppressWarnings("unused")
	private void setPassword(final String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setIDnumber(int iDnumber) {
		IDnumber = iDnumber;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public void setTimeCheckedin(String timeCheckedin) {
		this.timeCheckedin = timeCheckedin;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}
	
	/*
	 * @SEFER - ubaèena toString metoda
	 */

	@Override
	public String toString() {
		return "Guest [username=" + username + ", password=" + password + ", name=" + name + ", surname=" + surname
				+ ", gender=" + gender + ", IDnumber=" + IDnumber + ", age=" + age + ", roomNumber=" + roomNumber
				+ ", roomType=" + roomType + ", timeCheckedin=" + timeCheckedin + ", bill=" + bill + "]";
	}

	
}