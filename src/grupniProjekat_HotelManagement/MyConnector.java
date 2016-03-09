package grupniProjekat_HotelManagement;

/*
 * Sefer Kuduzovic
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnector {
	// Input connector za povezivanje na bazu podataka
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	private static final String DB = "hotel";

	public static Connection connectToDB() throws SQLException {
		Connection connection = null;
		try {
			// SQL Driver
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/" + DB, USERNAME, PASSWORD);
			System.out.println("Successfully connected to database!\n");
		} catch (Exception e) {
			System.err.println("Error! Check program!");
		}
		return connection;
	}
}