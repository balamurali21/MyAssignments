package week3.day1.java_oops;

public class iPhone extends iOS {
	
	public void makeCall() {
		
		System.out.println("iPhone makes call (from iPhone class)");

	}
	
	public void sendSMS() {

		System.out.println("SMS sent from iPhone (from iPhone class)");

	}
	
	public static void main(String[] args) {
		
		iPhone obj=new iPhone();
		obj.startApp();
		obj.increaseVolume();
		obj.makeCall();
		obj.sendSMS();
		obj.shutdown();
		
	}

}
