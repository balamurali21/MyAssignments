package week3.day1.java_oops;

public class MyPhone extends iPhone {
	
	public static void main(String[] args) {
		
		MyPhone obj=new MyPhone();
		obj.startApp();
		obj.increaseVolume();
		obj.makeCall();
		obj.sendSMS();
		obj.shutdown();
		
	}

}
