package week1.day1;

public class MobileInfo {

	public void makeCall() {
		String  mobileName = "OnePlus Nord";
		float mobileWeight = 179.5f;
		System.out.println("Calling");
		System.out.println(mobileName);
		System.out.println(mobileWeight);
	}
	public void sendMsg() {
		boolean isFullCharged = false;
		int mobileCost = 29999;
		System.out.println("Sent Message");
		System.out.println(isFullCharged);
		System.out.println(mobileCost);

	}
	public static void main(String[] args) {
		MobileInfo mbl=new MobileInfo();
		mbl.makeCall();
		mbl.sendMsg();
		System.out.println("This is my mobile");
				
	}
}

