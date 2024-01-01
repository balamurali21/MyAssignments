package week1.day1_javabasics;

public class MobileInfo {
	public void makeCall() {
		String mobileModel = "OnePlus Nord";
		float mobileWeight = 178.5f;
		System.out.println("The mobile model is " + mobileModel);
		System.out.println("The mobile weight is " + mobileWeight);
		}
	public void sendMsg() {
		boolean isFullCharged = false;
		int mobileCost = 30000;
		System.out.println("Mobile fully charged = " + isFullCharged);
		System.out.println("The mobile cost is " + mobileCost);
	}
	public static void main(String[] args) {
		System.out.println("This is my mobile");
		
		MobileInfo mbl=new MobileInfo();
		mbl.makeCall();
		mbl.sendMsg();
		
	}
	

}
