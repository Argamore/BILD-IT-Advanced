package grupniProjekat_HotelManagement;

/**
 * @author Vedran Vidakovic
 *
 */

/*
 * Fix & Security Update: Sefer Kuduzovic
 */

public final class Admin {

	private static String username = "admin";
	private static String password;

	// konstruktor sa data fields
	/**@SFR
	 * 
	 * @param username
	 * @param password
	 */
	
	/* 
	* GETTERS & SETTTERS
	*/
	private Admin(String username, String password) {
		Admin.setPassword(password);
	}

	@SuppressWarnings("unused")
	private static String getPassword() {
		return password;
	}

	private static void setPassword(String password) {
		Admin.password = password;
	}

	public static String getUsername() {
		return username;
	}

	@SuppressWarnings("unused")
	private static void setUsername(final String username) {
		Admin.username = username;
	}

}
