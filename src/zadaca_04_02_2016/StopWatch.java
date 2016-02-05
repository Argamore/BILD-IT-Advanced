package zadaca_04_02_2016;

public class StopWatch {
	
	private long startTime = 0;
	private long endTime = 0;
	
	public long getStartTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	// konstruktor (bez argumenata)
	StopWatch(){

	}
	// metoda koja uzima trenutno vrijeme
	public void start(){
		startTime = System.currentTimeMillis();
	}
	// te metoda koja uzima završno vrijeme
	public void stop(){
		endTime = System.currentTimeMillis();
	}
	// metoda koja provjerava interval vremena izmeðu start i stop metode
	public long getElapsedTime(){
		return endTime - startTime;
	}

}