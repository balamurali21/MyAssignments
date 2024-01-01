package week1.day1_javabasics;

public class Mobile {
	public void sendSms() {
	    System.out.println("Good Morning");

	}
	public void takeSnapshot() {
	   System.out.println("Takes Snapshot");	

	}
	public static void main(String[] args) {
		
		Mobile mb=new Mobile();
		mb.sendSms();
		mb.takeSnapshot();
		
	}

}
