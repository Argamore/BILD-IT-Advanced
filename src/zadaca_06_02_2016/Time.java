package zadaca_06_02_2016;
/**
 * @author Argamore
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {
	private int hour, second, minute;

	// pozivanje klase vraæa trenutno vrijeme!
	public Time() {
		Calendar calendar = new GregorianCalendar();
		this.hour = calendar.get(Calendar.HOUR_OF_DAY);
		this.minute = calendar.get(Calendar.MINUTE);
		this.second = calendar.get(Calendar.SECOND);
	}	
	// postavljanje novog vremena (u ms)
	public Time(long elapsedTime){
		this.setTime(elapsedTime);
	}
	// ako želimo sami postaviti trenutno vrijeme, pozivamo ovu metodu: 
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	/// < -- GETTERS & SETTERS -- > \\\
	
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}
	public void setTime(long elapsedTime) {
		// from miliseconds to seconds
		int ukupnoSekundi = (int) elapsedTime / 1000;
		// odvajamo taèan broj sekundi
		this.second = ukupnoSekundi % 60;		
		// pretvaramo u minute
		int ukupnoMinuta = ukupnoSekundi / 60;
		// odvajamo minute 
		this.minute = ukupnoMinuta % 60;
		// te pretvaramo minute u sate
		this.hour = (ukupnoMinuta / 60) % 24;
	}
}
