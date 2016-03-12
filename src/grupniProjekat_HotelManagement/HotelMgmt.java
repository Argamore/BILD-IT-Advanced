package grupniProjekat_HotelManagement;

import java.util.HashSet;

public interface HotelMgmt {

	public void addGuest(Guest guest);
	public void inRoom(String username, int roomnumber);
	public void checkServices(String username, String service);
	public void updateRoomNumber(String username, int roomnumber);
	public void updateRoomType(String username, String roomtype, int roomnumber);
	public Guest guestLookup(String text);
	public void guestCheckOut(String username);
	public void Archive(String username, String password, String idnumber);
	public Admin getAdminData(String username);
	public Guest getGuestData(String username);
	public Guest archiveCheck(String idnumber);
	public void updateDays(String username, int numofdays);
	public Guest guestBill(String username);
	public Guest[] readAll();
	public Room[] freeRooms();
	public Room roomPrice(String username);
	public void notify(String username);
	public HashSet<String> viewNot();
}
