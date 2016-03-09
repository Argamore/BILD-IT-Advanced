package grupniProjekat_HotelManagement;
/*
 * Fix & Security Update: Sefer Kuduzovic
 */
public class Services {
	
	/*
	 * SEFER - Ubaèene cijene za sve usluge, postavljene varijable na boolean
	 */
	
	public static final int GYM_PRICE = 10;
	public static final int CINEMA_PRICE = 10;
	public static final int RESTAURANT_PRICE = 20;
	public static final int POOL_PRICE = 10;
	public static final int SAUNA_PRICE = 10;
	
	
	private boolean gym;
	private boolean cinema;
	private boolean pool;
	private boolean resturant;
	private boolean sauna;
	
	// Konstruktor
	
	public Services(boolean gym, boolean cinema, boolean pool, boolean resturant, boolean sauna) {
		this.gym = gym;
		this.cinema = cinema;
		this.pool = pool;
		this.resturant = resturant;
		this.sauna = sauna;
	}
	/*
	 * Getters & Setters
	 */

	protected boolean isGym() {
		return gym;
	}
	protected void setGym(boolean gym) {
		this.gym = gym;
	}
	protected boolean isCinema() {
		return cinema;
	}
	protected void setCinema(boolean cinema) {
		this.cinema = cinema;
	}
	protected boolean isPool() {
		return pool;
	}
	protected void setPool(boolean pool) {
		this.pool = pool;
	}
	protected boolean isResturant() {
		return resturant;
	}
	protected void setResturant(boolean resturant) {
		this.resturant = resturant;
	}
	protected boolean isSauna() {
		return sauna;
	}
	protected void setSauna(boolean sauna) {
		this.sauna = sauna;
	}

	/*
	 * toString vraæa informacije
	 */
	@Override
	public String toString() {
		return "Services [gym=" + gym + ", cinema=" + cinema + ", pool=" + pool + ", resturant=" + resturant
				+ ", sauna=" + sauna + "]";
	}
	
	

}