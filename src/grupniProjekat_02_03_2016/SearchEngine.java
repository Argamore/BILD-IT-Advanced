package grupniProjekat_02_03_2016;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SearchEngine {

	public static void main(String[] args) throws SQLException{
		try(Scanner unos = new Scanner(System.in)){
		// Ispisujemo poruku da je drajver loadovan
		System.out.println("Driver uspijesno loadovan!");
		// Povezujemo se sa bazom podataka
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/world", "root", "");
		System.out.println("Povezani ste sa bazom podataka!\n");
		// Kreiramo statement
		Statement statement = connect.createStatement();
		// Ispisujemo korisniku menü
		System.out.println(
				"MENI:\n[1]Ispisi drzave za odredjeni kontinent"
				+ "\n[2]Ispisi top 25 drzava po broju stanovnika"
				+ "\n[3]Ispisi sve gradove za unesenu drzavu"
				+ "\n[4]Ispisi 25 gradova koji pocinju sa odredjenim slovom");
		int izbor = unos.nextInt();
		if ((izbor <1) || (izbor >4)){
			System.out.print("Samo od 1 do 4!\nUnesi ponovo: "); izbor = unos.nextInt();
		}
		switch (izbor) {
		case 1: {
			// Ispis država za uneseni kontinent
			System.out.print("Unesi ime kontinenta: ");
			String query = unos.next();
			// Saljemo upute bazi podataka
			ResultSet resultSet = statement
					.executeQuery("SELECT Name, Code, Population FROM Country WHERE Continent IN('" + query + "')");
			// Print headera
			System.out.println(String.format("%-40s %-7s %s", "Name", "Code", "Population"));
			System.out.println("-----------------------------------------------------------");
			// Print rezultata
			while (resultSet.next()) {
				System.out.println(String.format("%-40s %-7s %s", resultSet.getString("Name"),
						resultSet.getString("Code"), resultSet.getString("Population")));
			}
			break;
		}
			// Top 50 drzava po broju stanovnika
		case 2: {
			// Slanje upute
			ResultSet resultSet = statement
					.executeQuery("SELECT Name, Code, Population FROM Country ORDER BY Population DESC LIMIT 25");
			System.out.println(String.format("%-40s %-7s %s", "Name", "Code", "Population"));
			System.out.println("-----------------------------------------------------------");
			// Print rezultata
			while (resultSet.next()) {
				System.out.println(String.format("%-40s %-7s %s", resultSet.getString("Name"),
						resultSet.getString("Code"), resultSet.getString("Population")));
			}
			break;
		}
		// Ispis gradova za unesenu državu
		case 3: {
			System.out.print("Unesi ime drzave: ");
			String query = unos.next();
			System.out.println(String.format("%-25s %s", "Name", "Population"));
			System.out.println("-------------------------------------");
			ResultSet resultSet = statement.executeQuery(
					"SELECT City.Name, City.Population FROM City JOIN Country ON City.CountryCode = Country.Code WHERE Country.Name IN('"
							+ query + "')");
			// Print rezultata
			while (resultSet.next()) {
				System.out.println(
						String.format("%-25s %s", resultSet.getString("Name"), resultSet.getString("Population")));
			}
			break;
		}
		// Ispis gradova koji pocinju odreðenim slovom
		case 4: {
			System.out.println("Unesite slovo: ");
			// saljemo uslov bazi <3
			char query = unos.next().charAt(0);
			System.out.println(String.format("%-22s %s", "Name", "CountryCode"));
			System.out.println("-------------------------------------");
			ResultSet resultSet = statement.executeQuery("SELECT City.Name, City.CountryCode FROM City WHERE City.Name LIKE('"
					+ query + "%')ORDER BY Name ASC LIMIT 25");
			// Print rezultata
			while(resultSet.next()){
				System.out.println(String.format("%-25s %s", resultSet.getString("Name"), resultSet.getString("CountryCode")));
			}
			break;
		}
		}
		// Zatvaranje konekcije sa bazom podataka
		connect.close();
	}
		// Hvatalica grešaka
		catch (Exception e){
			System.out.println("Something somewhere went wrong. Check setup. Hvaly :*");
		}
	}
}