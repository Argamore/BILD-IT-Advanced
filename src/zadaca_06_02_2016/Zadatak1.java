package zadaca_06_02_2016;

public class Zadatak1 {

	public static void main(String[] args) {
		Time vrijeme = new Time();
		System.out.println("Trenutno vrijeme: " + 
		vrijeme.getHour() + ":" + vrijeme.getMinute() + ":" + vrijeme.getSecond());
		
		Time vrijeme2 = new Time(577750000);
		System.out.println("Uneseni broj milisekundi u satima, minutama i sekundama: " 
		+ vrijeme2.getHour() + ":" + vrijeme2.getMinute() + ":" + vrijeme2.getSecond());

	}

}
