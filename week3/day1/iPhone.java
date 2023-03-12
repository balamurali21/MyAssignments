package week3.day1;

public class iPhone extends iOS {
	
	public void makeCall() {
		System.out.println("Calling");
		

	}
	public void sendSMS() {
		System.out.println("SMS Sent");
	
	}
	 public void takeVideo () {
    	 System.out.println("Take Video method using iPhone");
    }
	 public static void main(String[] args) {
		
		 iPhone obj=new iPhone();
		 obj.takeVideo();
		 
	}
}
